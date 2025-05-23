package trnpoffloadingapp.model.services;

import adf.utils.ebiz.EbizParams;
import adf.utils.ebiz.WorkFlowUtils;
import adf.utils.model.ADFModelUtils;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewLinkImpl;

import oracle.jbo.server.ViewObjectImpl;

import trnpoffloadingapp.model.services.common.TrnpOffLoadingAM;
import trnpoffloadingapp.model.views.SlsTrnpOlVORowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 16 11:16:05 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TrnpOffLoadingAMImpl extends ApplicationModuleImpl implements TrnpOffLoadingAM {
    private Integer glblDocId = 24256;
    private Integer glblDocTypeId = 0;
    private static ADFLogger _log = ADFLogger.createADFLogger(TrnpOffLoadingAMImpl.class);    
    List li = new ArrayList <String>();

    /**
     * This is the default constructor (do not remove).
     */

    public TrnpOffLoadingAMImpl() {
    }

    /**
     * Container's getter for SlsTrnpOl.
     * @return SlsTrnpOl
     */
    public ViewObjectImpl getSlsTrnpOl() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOl");
    }

    /**
     * Container's getter for SearchOffLoadVw1.
     * @return SearchOffLoadVw1
     */
    public ViewObjectImpl getSearchOffLoadVw() {
        return (ViewObjectImpl) findViewObject("SearchOffLoadVw");
    }

    public void filterTxnId(String docTxnId) {
        _log.info("Filter txn Id Called-" + docTxnId);
        this.getSlsTrnpOl().setNamedWhereClauseParam("docIdBind", docTxnId);
        this.getSlsTrnpOl().executeQuery();

    }

    public String setOffLoadingNo() {
        String olNo = null;
        if (this.getSlsTrnpOl().getCurrentRow().getAttribute("OlId") != null)
            olNo = (String) this.getSlsTrnpOl().getCurrentRow().getAttribute("OlId");
        else {
            Integer fyid =
                EbizParams.getFyId(this.getRootApplicationModule(), EbizParams.GLBL_APP_USR_ORG(),
                                   new Timestamp(System.currentTimeMillis()));
            if (fyid != null) {
                olNo =
                    (String) ADFModelUtils.callFunction(this.getRootApplicationModule(),
                                                        new StringBuilder("SLS.TRNP_GEN_DISP_DOC_ID(?,?,?,?,?,?,?,?,?)"), new Object[] {
                                                        EbizParams.GLBL_APP_SERV_LOC(), EbizParams.GLBL_APP_CLD_ID(),
                                                        EbizParams.GLBL_APP_USR_ORG(), glblDocId, null, glblDocTypeId,
                                                        "SLS$TRNP$OL", fyid, 0
                }, Types.VARCHAR);
            } else
                olNo = "-1";
        }
        this.getSlsTrnpOl().getCurrentRow().setAttribute("OlId", olNo);
        return olNo;
    }

    public String genTxnId() {
        return (String) EbizParams.generateDocTxnId(this.getRootApplicationModule(), glblDocId);
    }

    /**
     * Container's getter for SlsTrnpOlRouteDtl1.
     * @return SlsTrnpOlRouteDtl1
     */
    public ViewObjectImpl getSlsTrnpOlRouteDtl() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlRouteDtl");
    }

    /**
     * Container's getter for SlsTrnpOlToRouteDtlVL1.
     * @return SlsTrnpOlToRouteDtlVL1
     */
    public ViewLinkImpl getSlsTrnpOlToRouteDtlVL1() {
        return (ViewLinkImpl) findViewLink("SlsTrnpOlToRouteDtlVL1");
    }

    public void populateRouteDtl() {
        this.getLovLoPntId().setNamedWhereClauseParam("loDocIdBind",
                                                      this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
        this.getLovLoPntId().setNamedWhereClauseParam("cldIdbind", EbizParams.GLBL_APP_CLD_ID());
        this.getLovLoPntId().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getLovLoPntId().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getLovLoPntId().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getLovLoPntId().setNamedWhereClauseParam("eoIdbind",
                                                      this.getSlsTrnpOl().getCurrentRow().getAttribute("EoId"));
        this.getLovLoPntId().executeQuery();
        Row[] popRows =
            this.getLovLoPntId().getFilteredRows("DocId", this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));

        for (Row r : popRows) {
            Row newRow = this.getSlsTrnpOlRouteDtl().createRow();
            newRow.setAttribute("ArrivalPnt", r.getAttribute("ArrivalPnt"));
            newRow.setAttribute("DeparturePnt", r.getAttribute("DeparturePnt"));
            newRow.setAttribute("ArrivalDate", r.getAttribute("ArrivalDate"));
            newRow.setAttribute("DepartureDate", r.getAttribute("DepartureDate"));
            newRow.setAttribute("Uom", r.getAttribute("Uom"));
            newRow.setAttribute("Rate", r.getAttribute("Rate"));
            newRow.setAttribute("ActVal", r.getAttribute("TotVal"));
            newRow.setAttribute("SlNo", r.getAttribute("SlNo"));
            this.getSlsTrnpOlRouteDtl().insertRow(newRow);

            this.populateDocSrcDtl(r);
            this.populateOtherCharge(r);
        }
    }

    private void populateDocSrcDtl(Row routeRow) {
        this.getLovLOShipment().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getLovLOShipment().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getLovLOShipment().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getLovLOShipment().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getLovLOShipment().setNamedWhereClauseParam("arrivalPntBind", routeRow.getAttribute("ArrivalPnt"));
        this.getLovLOShipment().setNamedWhereClauseParam("custIdBind",
                                                         this.getSlsTrnpOl().getCurrentRow().getAttribute("EoId"));
        this.getLovLOShipment().setNamedWhereClauseParam("departPntBind", routeRow.getAttribute("DeparturePnt"));
        this.getLovLOShipment().setNamedWhereClauseParam("loDocIdBind",
                                                         this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
        this.getLovLOShipment().executeQuery();
        Row[] shipRow =
            this.getLovLOShipment().getFilteredRows("DocId",
                                                    this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
        for (Row sr : shipRow) {
            Row newDocRw = this.getSlsTrnpOlDocSrc().createRow();
            newDocRw.setAttribute("DocIdSrc", sr.getAttribute("DocIdSrc"));
            this.getSlsTrnpOlDocSrc().insertRow(newDocRw);
            this.populateItemDtl(newDocRw);
        }
    }


    private void populateItemDtl(Row docSrcRow) {
        Row olCurrRow = this.getSlsTrnpOl().getCurrentRow();
        this.getLovLodingOrderItem().setNamedWhereClauseParam("docIdSrcBind", docSrcRow.getAttribute("DocIdSrc"));
        this.getLovLodingOrderItem().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getLovLodingOrderItem().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getLovLodingOrderItem().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getLovLodingOrderItem().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getLovLodingOrderItem().setNamedWhereClauseParam("arrPntBind", docSrcRow.getAttribute("ArrivalPnt"));
        this.getLovLodingOrderItem().setNamedWhereClauseParam("dprtPntBind", docSrcRow.getAttribute("DeparturePnt"));
        this.getLovLodingOrderItem().setNamedWhereClauseParam("eoIdBind", olCurrRow.getAttribute("EoId"));
        this.getLovLodingOrderItem().setNamedWhereClauseParam("loIdBind", olCurrRow.getAttribute("LoDocId"));
        this.getLovLodingOrderItem().executeQuery();
        Row[] popItmRows = this.getLovLodingOrderItem().getFilteredRows("DocId", olCurrRow.getAttribute("LoDocId"));

        String rateFctr = "D";
        String rateBasis = "F";
        if (olCurrRow.getAttribute("RateFctr") != null)
            rateFctr = (String) olCurrRow.getAttribute("RateFctr");
        if (olCurrRow.getAttribute("RateBasis") != null)
            rateBasis = (String) olCurrRow.getAttribute("RateBasis");

        for (Row rItm : popItmRows) {
            Row newItmRow = this.getSlsTrnpOlProdDtl().createRow();
            this.getSlsTrnpOlProdDtl().insertRow(newItmRow);
            newItmRow.setAttribute("ItmId", rItm.getAttribute("ItmId"));
            /*   newItmRow.setAttribute("ItmWt",
                                   rateBasis.equals("F") ? new Number(0) :
                                   rateFctr.equals("D") ?
                                   this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("ActVal") :
                                   rItm.getAttribute("ItmWt")); */

            ///rItm.getAttribute("ItmWtUom")
            newItmRow.setAttribute("ItmWt", rItm.getAttribute("ItmWt"));
            newItmRow.setAttribute("ItmWtUom", rItm.getAttribute("ItmWtUom"));
            /*   newItmRow.setAttribute("ItmWtUom",
                                   rateBasis.equals("F") ? new Number(0) :
                                   rateFctr.equals("D") ?
                                   this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("Uom") :
                                   rItm.getAttribute("ItmWtUom")); */
            //  newItmRow.setAttribute("Rate", (rateBasis.equals("F") ? new Number(0) : rItm.getAttribute("Rate")));
            newItmRow.setAttribute("Rate", rItm.getAttribute("Rate"));
            newItmRow.setAttribute("DamgQty", new Number(0));
            newItmRow.setAttribute("ShipQty", rItm.getAttribute("ShipQty"));
            newItmRow.setAttribute("ShipQtyUom", rItm.getAttribute("ShipQtyUom"));
        }
    }

    private void populateOtherCharge(Row routeRow) {
        this.getLovLoOcDtl().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getLovLoOcDtl().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getLovLoOcDtl().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getLovLoOcDtl().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getLovLoOcDtl().setNamedWhereClauseParam("arrivalPntBind", routeRow.getAttribute("ArrivalPnt"));
        this.getLovLoOcDtl().setNamedWhereClauseParam("departPntBind", routeRow.getAttribute("DeparturePnt"));
        this.getLovLoOcDtl().setNamedWhereClauseParam("loDocIdBind",
                                                      this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
        this.getLovLoOcDtl().setNamedWhereClauseParam("eoIdBind",
                                                      this.getSlsTrnpOl().getCurrentRow().getAttribute("EoId"));
        this.getLovLoOcDtl().executeQuery();
        Row[] OcRow =
            this.getLovLoOcDtl().getFilteredRows("DocId", this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
        for (Row ocR : OcRow) {
            Row newOcRw = this.getSlsTrnpOlOc().createRow();
            newOcRw.setAttribute("OcId", ocR.getAttribute("OcId"));
            newOcRw.setAttribute("OcCat", ocR.getAttribute("OcCat"));
            newOcRw.setAttribute("CoaId", ocR.getAttribute("CoaId"));
            newOcRw.setAttribute("CurrId", ocR.getAttribute("CurrId"));
            newOcRw.setAttribute("CurrRate", ocR.getAttribute("CurrRate"));
            newOcRw.setAttribute("TranType", ocR.getAttribute("TranType"));
            newOcRw.setAttribute("AmtSpOc", ocR.getAttribute("AmtSpOc"));
            newOcRw.setAttribute("AmtSp", ocR.getAttribute("AmtSp"));
            newOcRw.setAttribute("AmtBs", ocR.getAttribute("AmtBs"));
            this.getSlsTrnpOlOc().insertRow(newOcRw);
        }
    }

    /**
     * Container's getter for LovLoPntId1.
     * @return LovLoPntId1
     */
    public ViewObjectImpl getLovLoPntId() {
        return (ViewObjectImpl) findViewObject("LovLoPntId");
    }

    /**
     * Container's getter for SlsTrnpOlDocSrc1.
     * @return SlsTrnpOlDocSrc1
     */
    public ViewObjectImpl getSlsTrnpOlDocSrc() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlDocSrc");
    }

    /**
     * Container's getter for SlsOcRouteDtlToDocSrcVL1.
     * @return SlsOcRouteDtlToDocSrcVL1
     */
    public ViewLinkImpl getSlsOcRouteDtlToDocSrcVL1() {
        return (ViewLinkImpl) findViewLink("SlsOcRouteDtlToDocSrcVL1");
    }

    /**
     * Container's getter for SlsTrnpOlProdDtl1.
     * @return SlsTrnpOlProdDtl1
     */
    public ViewObjectImpl getSlsTrnpOlProdDtl() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlProdDtl");
    }

    /**
     * Container's getter for SlsTrnpOlDocSrcToProdDtlVL1.
     * @return SlsTrnpOlDocSrcToProdDtlVL1
     */
    public ViewLinkImpl getSlsTrnpOlDocSrcToProdDtlVL1() {
        return (ViewLinkImpl) findViewLink("SlsTrnpOlDocSrcToProdDtlVL1");
    }

    public void addSourceDocumentDtl() {

        if (this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("TransDocIdSrc") != null) {
            Row docSrcRow = this.getSlsTrnpOlDocSrc().createRow();
            String docIdSrc = (String) this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("TransDocIdSrc");
            docSrcRow.setAttribute("DocIdSrc", docIdSrc);
            this.getSlsTrnpOlDocSrc().insertRow(docSrcRow);
            System.out.println("Rows in LOITM for Doc Source=" + docIdSrc);
            this.getLovLodingOrderItem().setNamedWhereClauseParam("docIdSrcBind", docIdSrc);
            this.getLovLodingOrderItem().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
            this.getLovLodingOrderItem().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
            this.getLovLodingOrderItem().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
            this.getLovLodingOrderItem().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
            this.getLovLodingOrderItem().setNamedWhereClauseParam("arrPntBind",
                                                                  this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("ArrivalPnt"));
            this.getLovLodingOrderItem().setNamedWhereClauseParam("dprtPntBind",
                                                                  this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("DeparturePnt"));
            this.getLovLodingOrderItem().setNamedWhereClauseParam("eoIdBind",
                                                                  this.getSlsTrnpOl().getCurrentRow().getAttribute("EoId"));
            this.getLovLodingOrderItem().setNamedWhereClauseParam("loIdBind",
                                                                  this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
            this.getLovLodingOrderItem().executeQuery();
            Row[] popRows =
                this.getLovLodingOrderItem().getFilteredRows("DocId",
                                                             this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId"));
            _log.info("No. of Filtered Rows for  LO DOC ID=" +
                      this.getSlsTrnpOl().getCurrentRow().getAttribute("LoDocId") + " rows =" + popRows.length);
            for (Row r : popRows) {
                Row newRow = this.getSlsTrnpOlProdDtl().createRow();
                newRow.setAttribute("ItmId", r.getAttribute("ItmId"));
                newRow.setAttribute("ItmWt", r.getAttribute("ItmWt"));
                newRow.setAttribute("ItmWtUom", r.getAttribute("ItmWtUom"));
                newRow.setAttribute("Rate", r.getAttribute("Rate"));
                newRow.setAttribute("ItmAmtSp", new Number(0));
                newRow.setAttribute("ItmAmtBs", new Number(0));
                newRow.setAttribute("DamgQty", new Number(0));
                newRow.setAttribute("ShipQty", new Number(0));
                newRow.setAttribute("ShipQtyUom", null);
                this.getSlsTrnpOlProdDtl().insertRow(newRow);
            }
        }
    }

    /**
     * Container's getter for LovLodingOrderItem1.
     * @return LovLodingOrderItem1
     */
    public ViewObjectImpl getLovLodingOrderItem() {
        return (ViewObjectImpl) findViewObject("LovLodingOrderItem");
    }

    /**
     * Container's getter for LovLOShipment1.
     * @return LovLOShipment1
     */
    public ViewObjectImpl getLovLOShipment() {
        return (ViewObjectImpl) findViewObject("LovLOShipment");
    }

    /**
     * Container's getter for LovUomId1.
     * @return LovUomId1
     */
    public ViewObjectImpl getLovUomId() {
        return (ViewObjectImpl) findViewObject("LovUomId");
    }

    /**
     * Container's getter for LovCoaId1.
     * @return LovCoaId1
     */
    public ViewObjectImpl getLovCoaId() {
        return (ViewObjectImpl) findViewObject("LovCoaId");
    }

    /**
     * Container's getter for LovCurrency1.
     * @return LovCurrency1
     */
    public ViewObjectImpl getLovCurrency() {
        return (ViewObjectImpl) findViewObject("LovCurrency");
    }

    /**
     * Container's getter for SlsTrnpOcVw1.
     * @return SlsTrnpOcVw1
     */
    public ViewObjectImpl getSlsTrnpOcVw() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOcVw");
    }

    /**
     * Container's getter for LovOcCategory1.
     * @return LovOcCategory1
     */
    public ViewObjectImpl getLovOcCategory() {
        return (ViewObjectImpl) findViewObject("LovOcCategory");
    }

    /**
     * Container's getter for SlsTrnpOlOc1.
     * @return SlsTrnpOlOc1
     */
    public ViewObjectImpl getSlsTrnpOlOc() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlOc");
    }

    /**
     * Container's getter for SlsTrnpOlRouteDtlToOCVL1.
     * @return SlsTrnpOlRouteDtlToOCVL1
     */
    public ViewLinkImpl getSlsTrnpOlRouteDtlToOCVL1() {
        return (ViewLinkImpl) findViewLink("SlsTrnpOlRouteDtlToOCVL1");
    }

    public void addOcFromVW() {
        Row newRow = this.getSlsTrnpOlOc().getCurrentRow();
        newRow.setAttribute("CoaId", this.getSlsTrnpOcVw().getCurrentRow().getAttribute("CoaId"));
        newRow.setAttribute("TranType", this.getSlsTrnpOcVw().getCurrentRow().getAttribute("OcCalcType"));
        newRow.setAttribute("OcId", this.getSlsTrnpOcVw().getCurrentRow().getAttribute("OcId"));
        newRow.setAttribute("AmtSpOc", new Number(0));
        newRow.setAttribute("AmtSp", new Number(0));
        newRow.setAttribute("AmtBs", new Number(0));
        newRow.setAttribute("OcCat", this.getSlsTrnpOcVw().getCurrentRow().getAttribute("OcCat"));
        newRow.setAttribute("CurrId", this.getSlsTrnpOl().getCurrentRow().getAttribute("CurrIdSp"));
        newRow.setAttribute("CurrRate", this.getSlsTrnpOl().getCurrentRow().getAttribute("CurrConvFctr"));
    }

    public void onLoadExecute() {
        this.getSlsTrnpOcVw().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getSlsTrnpOcVw().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getSlsTrnpOcVw().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getSlsTrnpOcVw().setNamedWhereClauseParam("docIdBind", glblDocId);
        this.getSlsTrnpOcVw().setNamedWhereClauseParam("docTypeIdBind", glblDocTypeId);
        this.getSlsTrnpOcVw().executeQuery();
    }


    /****WORKFLOW FUNCTIONS*****/

    public String getWfNo() {
        return (String) WorkFlowUtils.getWorkFlowId(this.getRootApplicationModule(), glblDocId, glblDocTypeId);
    }

    public Integer currUsrLvl(String wfNo) {
        return WorkFlowUtils.getWorkFlowCurrUsrLvl(this.getRootApplicationModule(), wfNo, glblDocId, glblDocTypeId);
    }

    public String insWfTxn(String wfId, Integer lvlFrm, Integer lvlTo, String action, String remark, Number amount) {
        Integer usrId = EbizParams.GLBL_APP_USR();
        String docTxnId = (String) this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId");
        return (String) WorkFlowUtils.insertEntriesIntoWfTxn(this.getRootApplicationModule(), glblDocId, glblDocTypeId,
                                                             docTxnId, wfId, usrId, usrId, lvlFrm, lvlTo, action,
                                                             remark, amount);
    }

    public Integer chkPendingUsr() {
        String docTxnId = (String) this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId");
        return WorkFlowUtils.docPendingAt(this.getRootApplicationModule(), glblDocId, glblDocTypeId, docTxnId);
    }

    public void wfReturnAction() {
        String action = "Saved Successfully.";
        if (ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}") != null &&
            ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}").equals("A")) {
            this.getSlsTrnpOl().getCurrentRow().setAttribute("OlStatus", new Integer(12));
            this.getDBTransaction().commit();
            ADFModelUtils.callFunction(this.getRootApplicationModule(),
                                       new StringBuilder("SLS.FN_TRNP_UPDT_DOC_STATUS(?,?,?,?,?,?)"), new Object[] {
                                       EbizParams.GLBL_APP_CLD_ID(), EbizParams.GLBL_APP_SERV_LOC(),
                                       EbizParams.GLBL_APP_USR_ORG(), EbizParams.GLBL_HO_ORG_ID(), glblDocId,
                                       this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId").toString()
            }, Types.VARCHAR);
            action = "Approved Successfully.";
            if (this.getSlsTrnpOl().getCurrentRow().getAttribute("OlBasis") != null &&
                this.getSlsTrnpOl().getCurrentRow().getAttribute("OlBasis").equals(4)) {
                this.getSlsTrnpOlDocSrc1().setRangeSize(-1);
                Row[] docSrcRow =
                    this.getSlsTrnpOlDocSrc1().getFilteredRows("DocId",
                                                               this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId"));
                li.clear();
                
                for (Row docRw : docSrcRow) {
                    _log.info("updating cost of good for shipment no.=" + docRw.getAttribute("DocIdSrc"));

                    /*  ADFModelUtils.callFunction(this.getRootApplicationModule(),
                                               new StringBuilder("SLS.fn_trnp_to_fin_cost_of_good(?,?,?,?,?,?,?,?,?)"), new Object[] {
                                               this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId").toString(),
                                               this.getSlsTrnpOl().getCurrentRow().getAttribute("OlDt"),
                                               EbizParams.GLBL_APP_USR(), EbizParams.GLBL_APP_USR_ORG(),
                                               EbizParams.GLBL_APP_SERV_LOC(), EbizParams.GLBL_HO_ORG_ID(),
                                               EbizParams.GLBL_APP_CLD_ID(), docRw.getAttribute("DocIdSrc").toString(),
                                               "T"
                    }, Types.VARCHAR); */
                    li.add((String) 
                    ADFModelUtils.callFunction(this.getRootApplicationModule(),
                                               new StringBuilder("SLS.fn_trnp_to_fin_cost_of_good(?,?,?,?,?,?,?,?,?)"), new Object[] {
                                               this.getSlsTrnpOl().getCurrentRow().getAttribute("DocId").toString(),
                                               this.getSlsTrnpOl().getCurrentRow().getAttribute("OlDt"),
                                               EbizParams.GLBL_APP_USR(), EbizParams.GLBL_APP_USR_ORG(),
                                               EbizParams.GLBL_APP_SERV_LOC(), EbizParams.GLBL_HO_ORG_ID(),
                                               EbizParams.GLBL_APP_CLD_ID(), docRw.getAttribute("DocIdSrc").toString(),
                                               "T"
                    }, Types.VARCHAR) );
                }

                ADFModelUtils.showFormattedFacesMessage(ADFModelUtils.resolvRsrc("MSG.1773")+" : ", li.toString(), FacesMessage.SEVERITY_INFO);
                                                        // voucher id 
                
            }
            /* Else OL_BASIS == 5, and entry in MM of Landing Cost . 
            else 
            {
                    
            }*/
        } else if (ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}") != null &&
                   ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}").equals("F")) {
            this.getSlsTrnpOl().getCurrentRow().setAttribute("OlStatus", new Integer(11));
            action = ADFModelUtils.resolvRsrc("MSG.1983");                 
                    //forward
        } else if (ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}") != null &&
                   ADFModelUtils.resolvEl("#{pageFlowScope.WF_RET_PARAM}").equals("R")) {
            this.getSlsTrnpOl().getCurrentRow().setAttribute("OlStatus", new Integer(10));
            action = ADFModelUtils.resolvRsrc("MSG.820");
                    //rejected
        }

        ADFModelUtils.showFormattedFacesMessage(ADFModelUtils.resolvRsrc("MSG.2071")+ action + " ", " ", FacesMessage.SEVERITY_INFO);
                                                // document has been
    }

    public String getUsrNm(Integer usrId) {
        this.getLovUsrNm().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getLovUsrNm().setNamedWhereClauseParam("usrIdBind", usrId);
        this.getLovUsrNm().executeQuery();
        Row[] fr = this.getLovUsrNm().getFilteredRows("UsrId", usrId);
        if (fr.length > 0)
            return (String) fr[0].getAttribute("UsrName");
        else
            return "Anonymous";
    }

    /**
     * Container's getter for LovUsrNm1.
     * @return LovUsrNm1
     */
    public ViewObjectImpl getLovUsrNm() {
        return (ViewObjectImpl) findViewObject("LovUsrNm");
    }

    /**
     * Container's getter for DualForSearch1.
     * @return DualForSearch1
     */
    public ViewObjectImpl getDualForSearch() {
        return (ViewObjectImpl) findViewObject("DualForSearch");
    }

    public void setBindVarOnLoad() {
        this.getDualForSearch().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getDualForSearch().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        this.getDualForSearch().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getDualForSearch().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
    }

    public void SearchOffloading(String callFrom) {
        this.getSearchOffLoadVw().setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        this.getSearchOffLoadVw().setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        this.getSearchOffLoadVw().setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        this.getSearchOffLoadVw().setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());

        if (callFrom.equals("S")) {
        } else if (callFrom.equals("R")) {
            this.getDualForSearch().executeQuery();
            this.getSearchOffLoadVw().setNamedWhereClauseParam("orgIdBind", null);
        }

        Row curr = this.getDualForSearch().getCurrentRow();
        this.getSearchOffLoadVw().setNamedWhereClauseParam("loDocIdBind", curr.getAttribute("TransLoDocId"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("olIdBind", curr.getAttribute("TransOlId"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("strtDtBind", curr.getAttribute("TransStrtDt"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("endDtBind", curr.getAttribute("TransEndDt"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("currIdBind", curr.getAttribute("TransCurrId"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("custIdBind", curr.getAttribute("TransCustId"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("olStatusBind", curr.getAttribute("TransOlStatus"));
        this.getSearchOffLoadVw().setNamedWhereClauseParam("trnspIdBind", curr.getAttribute("TransTrnspId"));
        this.getSearchOffLoadVw().executeQuery();

    }

    /**
     * Container's getter for SlsTrnpOlProdDtl1.
     * @return SlsTrnpOlProdDtl1
     */
    public ViewObjectImpl getSlsTrnpOlProdDtl1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlProdDtl1");
    }

    public void deleteDocSrc() {
        this.getSlsTrnpOlProdDtl().setRangeSize(-1);
        Row fr[] = this.getSlsTrnpOlProdDtl().getAllRowsInRange();
        for (Row r : fr)
            r.remove();
        this.getSlsTrnpOlDocSrc().getCurrentRow().remove();
    }

    public String chkDupliOrder(String loIdParam) {
        SlsTrnpOlVORowImpl row = (SlsTrnpOlVORowImpl) this.getSlsTrnpOl().getCurrentRow();
        Row fr[] = row.getLovLoIdVO1().getFilteredRows("LoId", loIdParam);
        String loDocId = null;
        if (fr.length > 0)
            loDocId = (String) fr[0].getAttribute("DocId");
        RowQualifier olRq = new RowQualifier(this.getSlsTrnpOl1());
        olRq.setWhereClause("LoDocId='" + loDocId + "' and EoId=" + row.getEoId());
        Row frDupli[] = this.getSlsTrnpOl1().getFilteredRows(olRq);
        for (Row r : frDupli) {
            if (r.getAttribute("DocId").toString().equals(row.getDocId())) {
            } else {
                return (String) r.getAttribute("OlId");
            }
        }

        return "N";
    }

    /**
     * Container's getter for SlsTrnpOl1.
     * @return SlsTrnpOl1
     */
    public ViewObjectImpl getSlsTrnpOl1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOl1");
    }

    public Boolean chkDuplicateDocument() {
        String src = (String) this.getSlsTrnpOlRouteDtl().getCurrentRow().getAttribute("TransDocIdSrc");
        if (this.getSlsTrnpOlDocSrc1().getFilteredRows("DocIdSrc", src).length > 0)
            return false;
        else
            return true;
    }

    /**
     * Container's getter for SlsTrnpOlDocSrc1.
     * @return SlsTrnpOlDocSrc1
     */
    public ViewObjectImpl getSlsTrnpOlDocSrc1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlDocSrc1");
    }

    /**
     * Container's getter for LovLoOcDtl1.
     * @return LovLoOcDtl1
     */
    public ViewObjectImpl getLovLoOcDtl() {
        return (ViewObjectImpl) findViewObject("LovLoOcDtl");
    }


    public void changeArrivalDate(Timestamp arrvlDate) {

        ViewObjectImpl vo = this.getSlsTrnpOlRouteDtl();
        Row currentRow = vo.getCurrentRow();
        Integer slNo = (Integer) currentRow.getAttribute("SlNo");
        Row[] filteredRow = vo.getFilteredRows("SlNo", (slNo + 1));

        System.out.println("Parameter arrvlDate ::" + arrvlDate);
        System.out.println("SlNo of Current Row ::" + slNo);
        System.out.println("SlNo of Next Row ::" + (slNo + 1));

        if (filteredRow.length > 0) {
            System.out.println("Filtered Rows length : " + filteredRow.length);
            System.out.println("Arrival Date of Current Row ::" + currentRow.getAttribute("ArrivalDate"));
            filteredRow[0].setAttribute("DepartureDate", arrvlDate);
            System.out.println("Departure Date of Next Row ::" + filteredRow[0].getAttribute("DepartureDate"));

        } else {
            System.out.println("Filtered Rows length : " + filteredRow.length + " !! No Row Found !");
        }
    }

    /**
     * Container's getter for SlsTrnpRateCntrct1.
     * @return SlsTrnpRateCntrct1
     */
    public ViewObjectImpl getSlsTrnpRateCntrct() {
        return (ViewObjectImpl) findViewObject("SlsTrnpRateCntrct");
    }

    /**
     * Container's getter for DualCalculateHour1.
     * @return DualCalculateHour1
     */
    public ViewObjectImpl getDualCalculateHour() {
        return (ViewObjectImpl) findViewObject("DualCalculateHour");
    }

    /**
     * Container's getter for SlsTrnpOlOc1.
     * @return SlsTrnpOlOc1
     */
    public ViewObjectImpl getSlsTrnpOlOc1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpOlOc1");
    }

}

