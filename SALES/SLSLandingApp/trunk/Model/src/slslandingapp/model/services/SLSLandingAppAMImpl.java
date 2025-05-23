package slslandingapp.model.services;

import adf.utils.ebiz.EbizParams;
import adf.utils.model.ADFModelUtils;

import java.math.BigDecimal;

import java.sql.Array;

import oracle.jbo.domain.Number;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.StringTokenizer;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.JboException;
import oracle.jbo.NameValuePairs;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.RowFinder;
import oracle.jbo.server.RowQualifier;

import oracle.jbo.server.ViewObjectImpl;

import slslandingapp.model.ds.TickerRowDS;
import slslandingapp.model.services.common.SLSLandingAppAM;
import slslandingapp.model.views.ProductGroupwiseSalesAndProfitVOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Feb 15 18:09:37 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SLSLandingAppAMImpl extends ApplicationModuleImpl implements SLSLandingAppAM {
    private static ADFLogger _log = ADFLogger.createADFLogger(SLSLandingAppAMImpl.class);


    /**
     * This is the default constructor (do not remove).
     */
    public SLSLandingAppAMImpl() {
    }

    /**Method to resolve expression- returns String value*/
    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }

    /**
     * Container's getter for TopNCustomersVO.
     * @return TopNCustomersVO
     */
    public ViewObjectImpl getTopNCustomersVO() {
        return (ViewObjectImpl) findViewObject("TopNCustomersVO");
    }

    /**
     * Execute Vos before Loading pages.
     */
    public void executeAllViews() {
        executeTopNCustomers(5);
    }

    /**
     * Method to Get SlocId
     * @return
     */
    public Integer getSlocId() {
        // _log.info("Sloc Id : "+Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}")));
        return Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
    }

    /**
     * Method to Get OrgId
     * @return
     */
    public String getOrgId() {
        //_log.info("Sloc Id : "+resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}"));
        return resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
    }

    /**
     * Method to Get HoOrgId
     * @return
     */
    public String getHoOrgId() {
        // _log.info("HoOrg Id : "+resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}"));
        return resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}");
    }

    /**
     * Method to Get CldId
     * @return
     */
    public String getCldId() {
        //_log.info("Cld Id : "+resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}"));
        return resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
    }

    /**
     * Method to Get UsrId
     * @return
     */
    public String getUsrId() {
        //_log.info("Usr Id : "+resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}"));
        return resolvEl("#{pageFlowScope.GLBL_APP_USR}");
    }

    /**
     * Container's getter for TopNProductsVO.
     * @return TopNProductsVO
     */
    public ViewObjectImpl getTopNProductsVO() {
        return (ViewObjectImpl) findViewObject("TopNProductsVO");
    }

    /**
     * Method to execute TopNProducts
     */
    public void executeTopNProducts(Integer val) {
        ViewObjectImpl prodVO = this.getTopNProductsVO();
        prodVO.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
        prodVO.setNamedWhereClauseParam("CldIdBind", this.getCldId());
        prodVO.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
        prodVO.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
        prodVO.setNamedWhereClauseParam("CountBind", val);
        prodVO.executeQuery();
    }

    /**
     * Method to execute TopNCustomers
     */
    public void executeTopNCustomers(Integer val) {
        ViewObjectImpl custVO = this.getTopNCustomersVO();
        custVO.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
        custVO.setNamedWhereClauseParam("CldIdBind", this.getCldId());
        custVO.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
        custVO.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
        custVO.setNamedWhereClauseParam("CountBind", val);

        custVO.executeQuery();
    }

    /**
     * Container's getter for ProfitVsSalesVO.
     * @return ProfitVsSalesVO
     */
    public ViewObjectImpl getProfitVsSalesVO() {
        return (ViewObjectImpl) findViewObject("ProfitVsSalesVO");
    }

    /**
     * Method to execute ProfitVsSales
     */
    public void executeProfitVsSales() {
        ViewObjectImpl profitVsSale = this.getProfitVsSalesVO();
        profitVsSale.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
        profitVsSale.setNamedWhereClauseParam("CldIdBind", this.getCldId());
        profitVsSale.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
        profitVsSale.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
        profitVsSale.executeQuery();
    }

    /**
     * Container's getter for OpportunityAnalysisVO.
     * @return OpportunityAnalysisVO
     */
    public ViewObjectImpl getOpportunityAnalysisVO() {
        return (ViewObjectImpl) findViewObject("OpportunityAnalysisVO");
    }

    /**
     * Execute OpportunityAnalysis VO
     */
    public void executeOpportunityAnalysis() {
        ViewObjectImpl profitVsSale = this.getOpportunityAnalysisVO();
        profitVsSale.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
        profitVsSale.setNamedWhereClauseParam("CldIdBind", this.getCldId());
        profitVsSale.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
        profitVsSale.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
        profitVsSale.executeQuery();
    }

    /**
     * Execute SalesGroupWiseSalesAndProfit VO
     */
    public void executeProductGroupWiseSalesAndProfit(StringBuffer year, Integer[] month) {
        //_log.info("Year : "+year+" Month : "+month);
        //StringBuffer y = year;
        if (year.toString().equals("")) {
            Row currentRow = this.getTempVo().getCurrentRow();
            if (currentRow != null && currentRow.getAttribute("YearTrans") != null) {
                year = new StringBuffer(currentRow.getAttribute("YearTrans").toString());
            }
        }
        if (!year.toString().equals("")) {
            for (Integer m : month) {
                System.out.print(" " + m);
            }
            _log.info("Year : " + year);
            ViewObjectImpl profitVsSale = this.getProductGroupwiseSalesAndProfitVO();
            profitVsSale.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            profitVsSale.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            profitVsSale.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            profitVsSale.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind1", month[0]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind2", month[1]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind3", month[2]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind4", month[3]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind5", month[4]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind6", month[5]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind7", month[6]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind8", month[7]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind9", month[8]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind10", month[9]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind11", month[10]);
            profitVsSale.setNamedWhereClauseParam("SalesMnthBind12", month[11]);
            profitVsSale.setNamedWhereClauseParam("SalesYearBind", year.toString());
            profitVsSale.executeQuery();
        }

    }

    /**
     * Method to call a Database function
     * @param sqlReturnType
     * @param stmt
     * @param bindVars
     * @return
     */
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;
        //_log.info("__________________________________________begin");
        try {
            String driver = getdrivername();
            if (driver.equalsIgnoreCase("MySQL-AB JDBC Driver")) {
                st = this.getDBTransaction().createCallableStatement("{? = " + stmt + "};", 0);
            } else {
                st = this.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            }
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    st.setObject(z + 2, bindVars[z]);
                    // _log.info(""+bindVars[z]);
                }
            }
            st.executeUpdate();
            // _log.info("__________________________________________end");
            return st.getObject(1);
        } catch (SQLException e) {
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                }
            }
        }

    }

    /**
     * Method that returns the WorkFlow Document Count
     * @param DocTypeId
     * @param CountType
     * @return
     */
    public Number getDocPendingCountForMyApproval(Integer DocTypeId, StringBuffer CountType) {
        Number count = new Number(0);
        /* sls_doc_wf_cnt(
        p_cld_id varchar2,
        p_sloc_id number,
        p_org_id varchar2,
        p_usr_id number,
        p_doc_id number,
        p_wf_type varchar2 /* O--Pending with others ,M--Pending of my approval,U--Pending for posting
        )
         */
        try {
            BigDecimal s = null;
            String driver = getdrivername();
            if (driver.equalsIgnoreCase("MySQL-AB JDBC Driver")) {
                s = (BigDecimal) callStoredFunction(Types.NUMERIC, "call SLS_DOC_WF_CNT(?,?,?,?,?,?)", new Object[] {
                                                    this.getCldId(), this.getSlocId(), this.getOrgId(), this.getUsrId(),
                                                    DocTypeId, CountType.toString()
                });
            } else {
                s = (BigDecimal) callStoredFunction(Types.NUMERIC, "SLS_DOC_WF_CNT(?,?,?,?,?,?)", new Object[] {
                                                    this.getCldId(), this.getSlocId(), this.getOrgId(), this.getUsrId(),
                                                    DocTypeId, CountType.toString()
                });
            }
            count = new Number(s);
            //_log.info("Count for DocId : "+DocTypeId+" & Type : "+CountType+" is : "+count);
        } catch (Exception e) {
            FacesMessage message = new FacesMessage("There have been an error in calling function 'SLS_DOC_WF_CNT' !");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            FacesContext.getCurrentInstance().addMessage(null, message);
            e.printStackTrace();
        }
        return count;
    }

    /**
     * Set Initial Parameters for WFQuotationVO()
     * @param type
     */
    public void setParametersInWFQuotationVo(StringBuffer type) {
        if (type != null) {
            ViewObjectImpl quot = this.getWFQuotationVO();
            quot.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            quot.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            quot.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            quot.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            quot.setNamedWhereClauseParam("UsrIdBind", this.getUsrId());
            quot.setNamedWhereClauseParam("WfTypeBind", type.toString());
            quot.executeQuery();
        }

    }

    /**
     * Container's getter for WFQuotationVO.
     * @return WFQuotationVO
     */
    public ViewObjectImpl getWFQuotationVO() {
        return (ViewObjectImpl) findViewObject("WFQuotationVO");
    }

    /**
     * Container's getter for WFSoVO.
     * @return WFSoVO
     */
    public ViewObjectImpl getWFSoVO() {
        return (ViewObjectImpl) findViewObject("WFSoVO");
    }

    /**
     * Set Initial Parameters for WFSoVO()
     * @param type
     */
    public void setParametersInWFSoVo(StringBuffer type) {
        if (type != null) {
            ViewObjectImpl so = this.getWFSoVO();
            so.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            so.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            so.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            so.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            so.setNamedWhereClauseParam("UsrIdBind", this.getUsrId());
            so.setNamedWhereClauseParam("WfTypeBind", type.toString());
            so.executeQuery();
        }
    }

    /**
     * Set Initial Parameters for WFInvVO()
     * @param type
     */
    public void setParametersInWFInvVo(StringBuffer type) {
        if (type != null) {
            ViewObjectImpl inv = this.getWFInvVO();
            inv.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            inv.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            inv.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            inv.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            inv.setNamedWhereClauseParam("UsrIdBind", this.getUsrId());
            inv.setNamedWhereClauseParam("WfTypeBind", type.toString());
            inv.executeQuery();
        }
    }

    /**
     * Set Initial Parameters for WFRMAVO()
     * @param type
     */
    public void setParametersInWFRMAVo(StringBuffer type) {
        if (type != null) {
            ViewObjectImpl rma = this.getWFRMAVO();
            rma.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            rma.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            rma.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            rma.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            rma.setNamedWhereClauseParam("UsrIdBind", this.getUsrId());
            rma.setNamedWhereClauseParam("WfTypeBind", type.toString());
            rma.executeQuery();
        }
    }


    /**
     * Container's getter for WFInvVO.
     * @return WFInvVO
     */
    public ViewObjectImpl getWFInvVO() {
        return (ViewObjectImpl) findViewObject("WFInvVO");
    }

    /**
     * Method to getCurrentDocId of Sales Order
     * @return
     */
    public StringBuffer getCurrentSoId() {
        StringBuffer docId = new StringBuffer("");
        if (this.getWFSoVO().getCurrentRow() != null) {
            docId = new StringBuffer(this.getWFSoVO().getCurrentRow().getAttribute("DocId").toString());
        }
        _log.info("Sales Order Doc Id : " + docId);
        return docId;
    }

    /**
     * Method to getCurrentDocId of Sales Invoice
     * @return
     */
    public StringBuffer getCurrentSIId() {
        StringBuffer docId = new StringBuffer("");
        if (this.getWFInvVO().getCurrentRow() != null) {
            docId = new StringBuffer(this.getWFInvVO().getCurrentRow().getAttribute("DocId").toString());
        }
        _log.info("Sales Invoice Doc Id : " + docId);
        return docId;
    }

    /**
     * Method to getCurrentDocId of Sales Quotation
     * @return
     */
    public StringBuffer getCurrentSQId() {
        StringBuffer docId = new StringBuffer("");
        if (this.getWFQuotationVO().getCurrentRow() != null) {
            docId = new StringBuffer(this.getWFQuotationVO().getCurrentRow().getAttribute("DocId").toString());
        }
        _log.info("Sales Quotation Doc Id : " + docId);
        return docId;
    }

    /**
     * Method to getCurrentDocId of Sales Quotation
     * @return
     */
    public StringBuffer getCurrentRMAId() {
        StringBuffer docId = new StringBuffer("");
        if (this.getWFRMAVO().getCurrentRow() != null) {
            docId = new StringBuffer(this.getWFRMAVO().getCurrentRow().getAttribute("DocId").toString());
        }
        _log.info("Sales RMA Doc Id : " + docId);
        return docId;
    }

    /**
     * Container's getter for WFRMAVO.
     * @return WFRMAVO
     */
    public ViewObjectImpl getWFRMAVO() {
        return (ViewObjectImpl) findViewObject("WFRMAVO");
    }

    /**
     * Container's getter for ProductGroupwiseSalesAndProfitVO.
     * @return ProductGroupwiseSalesAndProfitVO
     */
    public ProductGroupwiseSalesAndProfitVOImpl getProductGroupwiseSalesAndProfitVO() {
        return (ProductGroupwiseSalesAndProfitVOImpl) findViewObject("ProductGroupwiseSalesAndProfitVO");
    }

    /**
     * Container's getter for TempVo.
     * @return TempVo
     */
    public ViewObjectImpl getTempVo() {
        return (ViewObjectImpl) findViewObject("TempVo");
    }

    /**
     * Method to set Current month and year in the Graph
     * @param year
     */
    public void setCurrentYearInTempVo(String year) {
        if (year != null) {
            Row[] allRowsInRange = getTempVo().getAllRowsInRange();
            for (Row r : allRowsInRange) {
                r.setAttribute("YearTrans", year);
            }
        }
    }

    /**
     * Container's getter for TickerVO.
     * @return TickerVO
     */
    public ViewObjectImpl getTickerVO() {
        return (ViewObjectImpl) findViewObject("TickerVO");
    }

    /**
     * To get the ticker amount
     * @param tickerId
     * @return
     */
    public StringBuffer getTickerAmount(Integer tickerId) {
        StringBuffer amt = new StringBuffer("");
        if (tickerId != null) {
            ViewObjectImpl impl = this.getTickerVO();
            impl.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            impl.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            impl.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            impl.setNamedWhereClauseParam("TickedIdBind", tickerId);
            impl.executeQuery();
            Row[] allRowsInRange = impl.getAllRowsInRange();
            for (Row r : allRowsInRange) {
                amt = amt.append(r.getAttribute("CurrAmt")).append(":").append(r.getAttribute("PrevAmt"));
            }
        }
        return amt;
    }

    public StringBuffer getCurrIdBs() {
        Integer i = 0;
        StringBuffer s = new StringBuffer("");
        try {
            String driver = getdrivername();
            if (driver.equalsIgnoreCase("MySQL-AB JDBC Driver")) {
                i = (Integer) callStoredFunction(Types.INTEGER, "call GET_ORG_DEF_CURR_BS1(?)", new Object[] {
                                                 this.getOrgId() });
            } else {
                i = (Integer) callStoredFunction(Types.INTEGER, "APP.PKG_APP.GET_ORG_DEF_CURR_BS1(?)", new Object[] {
                                                 this.getOrgId() });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i != 0) {
            ViewObjectImpl currDescFromIdVO = this.getCurrDescFromIdVO();
            currDescFromIdVO.setNamedWhereClauseParam("OrgIdBind", this.getOrgId());
            currDescFromIdVO.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            currDescFromIdVO.setNamedWhereClauseParam("CurrIdBind", this.getOrgId());
            currDescFromIdVO.executeQuery();
            Row[] allRowsInRange = currDescFromIdVO.getAllRowsInRange();
            for (Row r : allRowsInRange) {
                s = new StringBuffer(r.getAttribute("CurrNotationAlias").toString());
            }
        }
        //_log.info(" Curr ID is : "+s);
        return s;
    }

    /**
     * Container's getter for CurrDescFromIdVO.
     * @return CurrDescFromIdVO
     */
    public ViewObjectImpl getCurrDescFromIdVO() {
        return (ViewObjectImpl) findViewObject("CurrDescFromIdVO");
    }


    /**
     * Container's getter for TickerListVO.
     * @return TickerListVO
     */
    public ViewObjectImpl getTickerListVO() {
        return (ViewObjectImpl) findViewObject("TickerListVO");
    }

    /**
     * Method to fetch all the tickers
     * @return
     */
    public ArrayList<TickerRowDS> getSelectedTickerList() {
        ArrayList<TickerRowDS> selectedSettingsList = new ArrayList<TickerRowDS>();
        ViewObjectImpl mapViewVO = this.getSLSSelectedTickerListVO();
        mapViewVO.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
        mapViewVO.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        mapViewVO.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
        mapViewVO.setNamedWhereClauseParam("UsrIdBind", EbizParams.GLBL_APP_USR());
        mapViewVO.executeQuery();
        int i_2 = mapViewVO.getRangeSize();
        mapViewVO.setRangeSize(-1);
        Row[] filteredRows = mapViewVO.getAllRowsInRange();
        _log.info("Filtered rows : " + filteredRows.length);
        Integer i = 1;
        for (Row r : filteredRows) {
            _log.info("Ticker Id : " + r.getAttribute("TkrId"));
            Object o = ADFModelUtils.callFunction(this, new StringBuilder("SLS.FN_GET_TKR_VAL(?,?,?,?,?)"), new Object[] {
                                                  EbizParams.GLBL_APP_CLD_ID(), EbizParams.GLBL_APP_SERV_LOC(),
                                                  EbizParams.GLBL_APP_USR_ORG(), this.getfyId(), r.getAttribute("TkrId")
            }, Types.VARCHAR);
            System.out.println("Returned : " + o);
            if (o != null) {
                String s = o.toString();
                StringTokenizer d = new StringTokenizer(s, "|");
                if (d.countTokens() == 3) {
                    Object tkrNm = r.getAttribute("TkrNm");
                    TickerRowDS t = new TickerRowDS();
                    t.setTickerId(r.getAttribute("TkrId").toString());
                    t.setSeqNo((Integer) r.getAttribute("SeqNo"));
                    t.setTickerDesc(tkrNm == null ? "" : tkrNm.toString());
                    t.setArrow(d.nextToken());
                    t.setCurrentAmt(d.nextToken());
                    t.setPreviousAmt(d.nextToken());
                    t.setCurr(getCurrIdBs().toString());
                    selectedSettingsList.add(t);
                }
            }
            //Gross Profit|419530808.04686|192307731861484.01752
        }
        _log.info("Rows in AM :");
        for (TickerRowDS r : selectedSettingsList) {
            _log.info(r.getSeqNo() + " : " + r.getTickerDesc() + " : " + r.getTickerId());
        }
        mapViewVO.setRangeSize(i_2);
        return selectedSettingsList;
    }

    /**
     * Method used to call function to get the fy id.
     * @param CldId
     * @param OrgId
     * @return FY Id
     */
    public Integer getfyId() {
        Integer fyId = 0;
        try {
            fyId = (Integer) (callStoredFunction(Types.INTEGER, "APP.GET_ORG_FY_ID (?,?,?)", new Object[] {
                                                 EbizParams.GLBL_APP_CLD_ID(), EbizParams.GLBL_APP_USR_ORG(),
                                                 new Timestamp(System.currentTimeMillis())
            }));
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
        return fyId;
    }

    /**
     * Method to fetch all the tickers
     * @return
     */
    public ArrayList<TickerRowDS> getTickerList() {
        ArrayList<TickerRowDS> list = new ArrayList<TickerRowDS>();
        ViewObjectImpl mapViewVO = this.getSLSUnselectedTickerListVO();
        mapViewVO.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
        mapViewVO.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        mapViewVO.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
        mapViewVO.setNamedWhereClauseParam("UsrIdBind", EbizParams.GLBL_APP_USR());
        mapViewVO.executeQuery();
        int i_2 = mapViewVO.getRangeSize();
        mapViewVO.setRangeSize(-1);
        Row[] filteredRows = mapViewVO.getAllRowsInRange();
        _log.info("Filtered rows : " + filteredRows.length);
        Integer i = 1;
        for (Row r : filteredRows) {
            Object o = ADFModelUtils.callFunction(this, new StringBuilder("SLS.FN_GET_TKR_VAL(?,?,?,?,?)"), new Object[] {
                                                  EbizParams.GLBL_APP_CLD_ID(), EbizParams.GLBL_APP_SERV_LOC(),
                                                  EbizParams.GLBL_APP_USR_ORG(), this.getfyId(),
                                                  r.getAttribute("TkrId")
            }, Types.VARCHAR);
            System.out.println("Returned : " + o);
            if (o != null) {
                String s = o.toString();
                StringTokenizer d = new StringTokenizer(s, "|");
                if (d.countTokens() == 3) {
                    Object tkrNm = r.getAttribute("TkrNm");
                    TickerRowDS t = new TickerRowDS();
                    t.setTickerId(r.getAttribute("TkrId").toString());
                    t.setSeqNo(i);
                    t.setTickerDesc(tkrNm == null ? "" : tkrNm.toString());
                    t.setArrow(d.nextToken());
                    t.setCurrentAmt(d.nextToken());
                    t.setPreviousAmt(d.nextToken());
                    t.setCurr(getCurrIdBs().toString());
                    list.add(t);
                }
            }
            //Gross Profit|419530808.04686|192307731861484.01752
        }

        mapViewVO.setRangeSize(i_2);
        ViewObjectImpl impl = this.getTickerListVO();
        return list;
    }

    /**
     * Method to insert Rows in User Settings
     */
    public void saveUserSettings() {
        ViewObjectImpl impl = this.getSlsAllTckrsVO();
        impl.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
        impl.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
        impl.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        impl.setNamedWhereClauseParam("UsrIdBind", EbizParams.GLBL_APP_USR());
        impl.executeQuery();
        _log.info("Rows Removed : " + impl.getEstimatedRowCount());
        RowSetIterator ctr = impl.createRowSetIterator(null);
        ViewObjectImpl impl1 = this.getMmTkrUsrVO();
        
        while(ctr.hasNext()){
            RowFinder finder = impl1.lookupRowFinder("findTckrRow");
            NameValuePairs n = new NameValuePairs();
            n.setAttribute("CldId", EbizParams.GLBL_APP_CLD_ID());
            n.setAttribute("OrgId", EbizParams.GLBL_APP_USR_ORG());
            n.setAttribute("SlocId", EbizParams.GLBL_APP_SERV_LOC());
            n.setAttribute("TkrId", ctr.next().getAttribute("TkrId").toString());
            n.setAttribute("UsrId", EbizParams.GLBL_APP_USR());
            RowIterator ri = finder.execute(n, impl1);
            _log.info("Set Default Find Row : "+ri.getFetchedRowCount());
            if(ri.getFetchedRowCount() > 0){
                if(ri.hasNext()){
                    ri.next().setAttribute("TkrPos", 0);
                }
            }
        }
        ctr.closeRowSetIterator();
        //this.getDBTransaction().commit();
    }

    public void insertRecord(Integer seqNo, String tickeId) {
        ViewObjectImpl impl = this.getMmTkrUsrVO();
        RowFinder finder = impl.lookupRowFinder("findTckrRow");
        NameValuePairs n = new NameValuePairs();
        n.setAttribute("CldId", EbizParams.GLBL_APP_CLD_ID());
        n.setAttribute("OrgId", EbizParams.GLBL_APP_USR_ORG());
        n.setAttribute("SlocId", EbizParams.GLBL_APP_SERV_LOC());
        n.setAttribute("TkrId", tickeId);
        n.setAttribute("UsrId", EbizParams.GLBL_APP_USR());
        
        RowIterator ri = finder.execute(n, impl);
        _log.info("Find Row : "+ri.getFetchedRowCount());
        if(ri.getFetchedRowCount() > 0){
            if(ri.hasNext()){
                ri.next().setAttribute("TkrPos", seqNo);
            }
        }
    }

    public String getdrivername() {
        String drivernme = "";
        //SlsIntimationSlipAMImpl am = (SlsIntimationSlipAMImpl)resolvElDC("SlsIntimationSlipAMDataControl");
        DBTransaction dbTransaction = (DBTransaction) this.getTransaction();
        PreparedStatement prepStatement = dbTransaction.createPreparedStatement("select * from dual", 0);
        try {
            //System.out.println("Driver name--" + prepStatement.getConnection().getMetaData().getDriverName());
            drivernme = prepStatement.getConnection().getMetaData().getDriverName();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return drivernme;

    }

    /**
     * Container's getter for SLSSelectedTickerListVO1.
     * @return SLSSelectedTickerListVO1
     */
    public ViewObjectImpl getSLSSelectedTickerListVO() {
        return (ViewObjectImpl) findViewObject("SLSSelectedTickerListVO");
    }

    /**
     * Container's getter for SLSUnselectedTickerListVO1.
     * @return SLSUnselectedTickerListVO1
     */
    public ViewObjectImpl getSLSUnselectedTickerListVO() {
        return (ViewObjectImpl) findViewObject("SLSUnselectedTickerListVO");
    }

    /**
     * Container's getter for MmTkrUsrVO1.
     * @return MmTkrUsrVO1
     */
    public ViewObjectImpl getMmTkrUsrVO() {
        return (ViewObjectImpl) findViewObject("MmTkrUsrVO");
    }

    /**
     * Container's getter for SlsAllTckrsVO1.
     * @return SlsAllTckrsVO1
     */
    public ViewObjectImpl getSlsAllTckrsVO() {
        return (ViewObjectImpl) findViewObject("SlsAllTckrsVO");
    }
}
