package trnprouteprofileapp.model.service;

import adf.utils.ebiz.EbizParams;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;

import trnprouteprofileapp.model.service.common.TrnpRouteProfileAM;
import trnprouteprofileapp.model.views.SlsTrnpRouteLocVOImpl;
import trnprouteprofileapp.model.views.SlsTrnpRouteOcVOImpl;
import trnprouteprofileapp.model.views.SlsTrnpRoutePrfDtlVOImpl;
import trnprouteprofileapp.model.views.SlsTrnpRoutePrfVOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 02 14:57:10 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TrnpRouteProfileAMImpl extends ApplicationModuleImpl implements TrnpRouteProfileAM {
    /**
     * This is the default constructor (do not remove).
     */
    public TrnpRouteProfileAMImpl() {
    }

    public void setGlobalVars() {
        ViewObjectImpl vo1 = this.getSlsTrnpRoutePrf1();
        ViewCriteria vc1 = vo1.getViewCriteria("SlsTrnpRoutePrfVOGLBLVC");
        vo1.appendViewCriteria(vc1);
        vo1.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        vo1.setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        vo1.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        vo1.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());

        vo1.executeQuery();

        ViewObjectImpl vo2 = this.getSlsTrnpRoutePrf2();
        ViewCriteria vc2 = vo2.getViewCriteria("SlsTrnpRoutePrfVOGLBLVC");
        vo2.appendViewCriteria(vc2);
        vo2.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        vo2.setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        vo2.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        vo2.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());

        vo2.executeQuery();

        ViewObjectImpl vo3 = this.getSlsTrnpRoutePrf3();
        ViewCriteria vc3 = vo2.getViewCriteria("SlsTrnpRoutePrfVOGLBLVC");
        vo3.appendViewCriteria(vc3);
        vo3.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        vo3.setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        vo3.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        vo3.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());

        vo3.executeQuery();

    }

    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {

        CallableStatement st = null;
        try {
            // 1. Create a JDBC CallabledStatement
            st = getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            // 2. Register the first bind variable for the return value
            st.registerOutParameter(1, sqlReturnType);

            if (bindVars != null) {
                // 3. Loop over values for the bind variables passed in, if any
                for (int z = 0; z < bindVars.length; z++) {
                    // 4. Set the value of user-supplied bind vars in the stmt
                    st.setObject(z + 2, bindVars[z]);
                }
            }
            // 5. Set the value of user-supplied bind vars in the stmt
            st.executeUpdate();
            // 6. Return the value of the first bind variable
            //adflog.info("Function return " + st.getObject(1));
            return st.getObject(1);
        } catch (SQLException e) {
            throw new JboException(e.getMessage());
        } finally {
            if (st != null) {
                try {
                    // 7. Close the statement
                    st.close();
                } catch (SQLException e) {
                    throw new JboException(e.getMessage());
                }
            }
        }
    }


    public void setParams() {
        /* if (this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("RouteId") != null) {
        } else {
            String tname = "SLS$TRNP$ROUTE$PRF";
            Integer slocid = (Integer) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("SlocId");
            String cldid = (String) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("CldId");
            String orgid = (String) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("OrgId");
            Integer docid = 24253;
            Integer doctypeid = 0;
            String dochexid = null;
            Integer docsubtypeid = 0;
            Integer fyid =
                EbizParams.getFyId(this, EbizParams.GLBL_APP_USR_ORG(), new Timestamp(System.currentTimeMillis()));

            System.out.println("Slocid is : " + slocid);
            System.out.println("Cldid is : " + cldid);
            System.out.println("Orgid is : " + orgid);
            System.out.println("Docid is : " + docid);
            System.out.println("Doctypeid is : " + doctypeid);
            System.out.println("Dochexid is : " + dochexid);
            System.out.println("Docsubtypeid is : " + docsubtypeid);
            System.out.println("Tname is : " + tname);
            System.out.println("Fyid is : " + fyid);

            String routeid = (String) (callStoredFunction(Types.VARCHAR, "SLS.TRNP_GEN_DISP_DOC_ID(?,?,?,?,?,?,?,?,?)", new Object[] {
                                                          slocid, cldid, orgid, docid, dochexid, doctypeid, tname,
                                                          EbizParams.getFyIdOnCurrDtAndCurrOrg(this), docsubtypeid
            }));

            System.out.println("current value is " + routeid);

            if (routeid != null) {
                this.getSlsTrnpRoutePrf1().getCurrentRow().setAttribute("RouteId", routeid);
            }
        } */
    }

    public void setCoaBindings() {

        ViewObjectImpl vo = this.getCOA1();
        vo.setNamedWhereClauseParam("cldIdBind", EbizParams.GLBL_APP_CLD_ID());
        vo.setNamedWhereClauseParam("docIdBind", 24253);
        vo.setNamedWhereClauseParam("docTypeIdBind", 0);
        vo.setNamedWhereClauseParam("hoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        vo.setNamedWhereClauseParam("slocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        vo.executeQuery();

    }

    public boolean validateName(String routenm) {
        System.out.println("Inside Validate Name ::: " + routenm);

        SlsTrnpRoutePrfVOImpl impl = this.getSlsTrnpRoutePrf2();
        SlsTrnpRoutePrfVOImpl currVo = this.getSlsTrnpRoutePrf1();

        RowQualifier rq = new RowQualifier(impl);
        rq.setWhereClause("UPPER(RouteNm) = UPPER('" + routenm + "')");
        Row[] filteredRows = impl.getFilteredRows(rq);
        System.out.println("Length of filterred row:;" + filteredRows.length);
        /* if (filteredRows.length > 1)
            return true;
        else
            return false; */
        for (Row r : filteredRows) {
            if (!r.getAttribute("DocId").toString().equals(currVo.getCurrentRow().getAttribute("DocId").toString())) {
                System.out.println("Inside the duplicate Route Name condition !!!");
                return true;
            }

        }

        return false;
    }

    public boolean validateLocName(String locname) {

        System.out.println("Inside Validate Name ::: " + locname);

        SlsTrnpRouteLocVOImpl impl = this.getSlsTrnpRouteLoc2();
        RowQualifier rq = new RowQualifier(impl);
        rq.setWhereClause("UPPER(LocNm) = UPPER('" + locname + "')");
        Row[] filteredRows = impl.getFilteredRows(rq);
        System.out.println("Length of filterred row:;" + filteredRows.length);

        if (filteredRows.length > 1)
            return true;
        else
            return false;

    }

    public boolean childValidate() {

        Boolean flag = false;
        String docid = "";
        SlsTrnpRoutePrfDtlVOImpl dtl4 = this.getSlsTrnpRoutePrfDtl4();

        Row currentRow = dtl4.getCurrentRow();

        docid = currentRow.getAttribute("DocId").toString();

        if (docid != null) {

            Row[] filteredRow = dtl4.getFilteredRows("DocId", docid);

            if (filteredRow.length > 0) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public void searchRoute() {

        System.out.println("Inside SearchRoute method in AMImpl !");
        ViewObjectImpl impl = this.getSearch1();

        Row currentRow = impl.getCurrentRow();
        SlsTrnpRoutePrfVOImpl oImpl = this.getSlsTrnpRoutePrf1();
        if (currentRow != null) {

            String bindRoutePrfNm =
                currentRow.getAttribute("TransRoutePrfNm") == null ? " " :
                currentRow.getAttribute("TransRoutePrfNm").toString();


            ViewCriteria vc = oImpl.getViewCriteria("SlsTrnpRoutePrfVOCriteria");
            oImpl.applyViewCriteria(vc);

            System.out.println("Inside the not null condition : " + bindRoutePrfNm);
            oImpl.setNamedWhereClauseParam("BindRoutePflName", bindRoutePrfNm);
            oImpl.executeQuery();
        }

    }

    public boolean preValidateDistance() {

        Boolean flag = false;

        SlsTrnpRoutePrfDtlVOImpl dtl4 = this.getSlsTrnpRoutePrfDtl4();

        Integer distance = (Integer) dtl4.getCurrentRow().getAttribute("Dist");

        if (distance != null)
            flag = true;
        else
            flag = false;


        return flag;
    }

    public boolean preValidateFuel() {

        Boolean flag = false;

        SlsTrnpRoutePrfDtlVOImpl dtl4 = this.getSlsTrnpRoutePrfDtl4();

        Integer fuel = (Integer) dtl4.getCurrentRow().getAttribute("FuelQty");

        if (fuel != null)
            flag = true;
        else
            flag = false;


        return flag;
    }

    public void resetSearch() {
        System.out.println("Inside the resetSearch method in AMImpl !");
        this.getSlsTrnpRoutePrf1().setNamedWhereClauseParam("BindRoutePflName", null);
        this.getSlsTrnpRoutePrf1().executeQuery();
        this.getSearch1().executeQuery();
    }

    public boolean validateArrivalPoint(String arrival) {

        Boolean flag = false;
        String arrivalpnt = null;

        /*  ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Row currentRow = vo.getCurrentRow();

        ViewObjectImpl locVo = this.getLovLocationId1();

        Row[] filteredRows = locVo.getFilteredRows("AddsLoc", arrival);

        if (filteredRows.length > 0) {
            arrivalpnt = filteredRows[0].getAttribute("LocId").toString();
        }

        String departurepnt = currentRow.getAttribute("DeparturePnt").toString();

        System.out.println("Departure point is :" + departurepnt);
        System.out.println("Inside Validate Name ::: " + arrivalpnt); */

        Row currentRow = this.getSlsTrnpRoutePrfDtl4().getCurrentRow();
        if (currentRow != null && currentRow.getAttribute("DeparturePnt") != null && arrival != null) {
            if (arrival.equals(currentRow.getAttribute("DeparturePnt"))) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean validateArrivalAlias(String arrivalals) {

        Boolean flag = false;
        Integer arrivalalias = null;

        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Row currentRow = vo.getCurrentRow();

        ViewObjectImpl locVo = this.getSlsTrnpRouteLoc2();

        Row[] filteredRows = locVo.getFilteredRows("LocNm", arrivalals);

        if (filteredRows.length > 0) {
            arrivalalias = (Integer) filteredRows[0].getAttribute("LocId");
        }

        Integer departurepnt = (Integer) currentRow.getAttribute("DprtAlias");

        System.out.println("Departure point is :" + departurepnt);
        System.out.println("Inside Validate Name ::: " + arrivalalias);

        if (arrivalalias != null) {
            if (arrivalalias.equals(departurepnt))
                flag = true;
            else
                flag = false;
        }

        return flag;

    }

    public void createSlNo() {

        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Integer slNo = 0;
        Object arrivalPnt = null;
        Row[] allRowsInRange = vo.getAllRowsInRange();

        System.out.println("AllRowsInRange length ::" + allRowsInRange.length);
        if (allRowsInRange.length > 0) {
            for (Row r : allRowsInRange) {
                if (r.getAttribute("SlNo") != null) {
                    if (slNo < (Integer) r.getAttribute("SlNo")) {
                        slNo = (Integer) r.getAttribute("SlNo");
                        arrivalPnt = r.getAttribute("ArrivalPnt");
                    }
                }
            }

            Row currentRow = vo.getCurrentRow();
            if (currentRow != null) {
                currentRow.setAttribute("SlNo", (slNo + 1));
                System.out.println("Sl.No in AMImpl ::" + slNo);
                System.out.println("Arrival Point ::" + arrivalPnt);

                if (arrivalPnt != null) {
                    currentRow.setAttribute("DeparturePnt", arrivalPnt);
                }
            } else {
                currentRow.setAttribute("SlNo", (slNo + 1));

                System.out.println("Sl.No in AMImpl ::" + slNo);
            }

        }

    }

    /**Method to generate Serial Number for Table Rows
    * **.
    * @param voName
    */
    public Integer serialNumGenerate(String voName) {
        ViewObject locVo = this.findViewObject(voName);
        Integer Srno = 0;
        Integer max = 0;
        locVo.setRangeSize(-1);
        
        Row row[] = locVo.getAllRowsInRange();
        
        for (Row r : row) {
            try {
                Srno = Integer.parseInt(r.getAttribute("LocId").toString());
            } catch (NullPointerException e) {
                Srno = 0;
            }
            if (Srno > max) {
                max = Srno;
            }
        }
        
        max = max + 1;
        System.out.println("Max Value is-->" + max);
        return max;
    }

    public void createLocSlNo()
    {        
            int slNo = (int)serialNumGenerate("SlsTrnpRouteLoc2");
            
            System.out.println("Value of Serial No ::: " +slNo);
            
            this.getSlsTrnpRouteLoc2().getCurrentRow().setAttribute("LocId", slNo);
            
    }

    public void changeArrivalPoint(String locName) {

        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Row currentRow = vo.getCurrentRow();
        Integer slNo = (Integer) currentRow.getAttribute("SlNo");
        Row[] filteredRow = vo.getFilteredRows("SlNo", (slNo + 1));

        String departureId = (String) this.getLocationId(locName);

        System.out.println("SlN of Current Row ::" + slNo);
        System.out.println("SlN of Next Row ::" + (slNo + 1));

        if (filteredRow.length > 0) {
            System.out.println("Filtered Rows length : " + filteredRow.length);
            System.out.println("Arrival Point of Current Row ::" + currentRow.getAttribute("ArrivalPnt"));
            filteredRow[0].setAttribute("DeparturePnt", departureId);
            System.out.println("Departure Point of Next Row ::" + filteredRow[0].getAttribute("DeparturePnt"));

        } else {
            System.out.println("Filtered Rows length : " + filteredRow.length + " !! No Row Found !");
        }
    }

    public void deleteChildRow() {
        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Row currentRow = vo.getCurrentRow();
        Integer slNo = (Integer) currentRow.getAttribute("SlNo");
        Row[] filteredRow = vo.getFilteredRows("SlNo", (slNo + 1));

        RowQualifier rq = new RowQualifier(vo);
        rq.setWhereClause("SlNo > " + slNo);
        Row[] slNoFilteredRows = vo.getFilteredRows(rq);
        Integer tempSlno = 0;
        //Row[] allRowsInRange = vo.getAllRowsInRange();
        System.out.println("slNoFilteredRows length :: " + slNoFilteredRows.length);

        ViewObjectImpl ocVo = this.getSlsTrnpRouteOc2();
        ocVo.setRangeSize(-1);
        //  Row[] deleteOCRow = ocVo.getFilteredRows("DocId", currentRow.getAttribute("DocIc"));
        Row[] deleteOCRow = ocVo.getAllRowsInRange();
        System.out.println("deleteOCRow length ::" + deleteOCRow.length);


        for (Row r : deleteOCRow) {
            System.out.println("Row r ::" + r);
            r.remove();
        }


        String departureId = (String) currentRow.getAttribute("DeparturePnt");

        System.out.println("SlN of Current Row ::" + slNo);

        currentRow.remove();

        if (filteredRow.length > 0) {
            System.out.println("Filtered Rows length : " + filteredRow.length);
            System.out.println("Departure Point of Current Row ::" + departureId);
            filteredRow[0].setAttribute("DeparturePnt", departureId);
            //filteredRow[0].setAttribute("SlNo", slNo);
            System.out.println("SlN of Next Row ::" + filteredRow[0].getAttribute("SlNo"));
            System.out.println("Departure Point of Next Row ::" + filteredRow[0].getAttribute("DeparturePnt"));

            for (Row r : slNoFilteredRows) {
                System.out.println("R.get attr " + r.getAttribute("SlNo"));
                if (r.getAttribute("SlNo") != null) {
                    /*  tempSlno = (Integer) r.getAttribute("SlNo");
                        slNo = tempSlno-1;
                        r.setAttribute("SlNo", slNo); */
                    System.out.println("SlNo of previous Attributes :: " + r.getAttribute("SlNo"));
                    r.setAttribute("SlNo", ((Integer) r.getAttribute("SlNo") - 1));
                    System.out.println("SlNo of modified Attributes :: " + r.getAttribute("SlNo"));
                }
            }

        } else {
            System.out.println("Filtered Rows length : " + filteredRow.length + " !! No Row Found !");
        }

    }


    public void setLocationParams() {
        if (this.getSlsTrnpRouteLoc2().getCurrentRow().getAttribute("LocId") != null) {
        } else {
            String tname = "SLS$TRNP$ROUTE$LOC";
            Integer slocid = (Integer) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("SlocId");
            String cldid = (String) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("CldId");
            String orgid = (String) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("OrgId");
            String horgid = (String) this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("HoOrgId");

            System.out.println("Slocid is : " + slocid);
            System.out.println("Cldid is : " + cldid);
            System.out.println("Orgid is : " + orgid);
            System.out.println("HoOrgid is : " + horgid);
            System.out.println("Tname is : " + tname);

            Integer locid = (Integer) (callStoredFunction(Types.INTEGER, "SLS.FN_GEN_TRNP_LOC_ID(?,?,?,?)", new Object[] {
                                                          cldid, slocid, orgid, horgid
            }));

            System.out.println("current value is " + locid);

            if (locid != null) {
                this.getSlsTrnpRouteLoc2().getCurrentRow().setAttribute("LocId", locid);
            }
        }
    }

    /**
     * Container's getter for SlsTrnpRoutePrf1.
     * @return SlsTrnpRoutePrf1
     */
    public SlsTrnpRoutePrfVOImpl getSlsTrnpRoutePrf1() {
        return (SlsTrnpRoutePrfVOImpl) findViewObject("SlsTrnpRoutePrf1");
    }

    /**
     * Container's getter for SlsTrnpRoutePrfDtl1.
     * @return SlsTrnpRoutePrfDtl1
     */
    public SlsTrnpRoutePrfDtlVOImpl getSlsTrnpRoutePrfDtl1() {
        return (SlsTrnpRoutePrfDtlVOImpl) findViewObject("SlsTrnpRoutePrfDtl1");
    }

    /**
     * Container's getter for LovUsername1.
     * @return LovUsername1
     */
    public ViewObjectImpl getLovUsername1() {
        return (ViewObjectImpl) findViewObject("LovUsername1");
    }

    /**
     * Container's getter for SlsTrnpRoutePrf2.
     * @return SlsTrnpRoutePrf2
     */
    public SlsTrnpRoutePrfVOImpl getSlsTrnpRoutePrf2() {
        return (SlsTrnpRoutePrfVOImpl) findViewObject("SlsTrnpRoutePrf2");
    }


    /**
     * Container's getter for SlsTrnpRoutePrfDtl4.
     * @return SlsTrnpRoutePrfDtl4
     */
    public SlsTrnpRoutePrfDtlVOImpl getSlsTrnpRoutePrfDtl4() {
        return (SlsTrnpRoutePrfDtlVOImpl) findViewObject("SlsTrnpRoutePrfDtl4");
    }

    /**
     * Container's getter for RoutePrfToRoutePrfDtlVL2.
     * @return RoutePrfToRoutePrfDtlVL2
     */
    public ViewLinkImpl getRoutePrfToRoutePrfDtlVL2() {
        return (ViewLinkImpl) findViewLink("RoutePrfToRoutePrfDtlVL2");
    }

    /**
     * Container's getter for Search1.
     * @return Search1
     */
    public ViewObjectImpl getSearch1() {
        return (ViewObjectImpl) findViewObject("Search1");
    }

    /**
     * Container's getter for UomLov1.
     * @return UomLov1
     */
    public ViewObjectImpl getUomLov1() {
        return (ViewObjectImpl) findViewObject("UomLov1");
    }

    /**
     * Container's getter for SlsTrnpRoutePrf3.
     * @return SlsTrnpRoutePrf3
     */
    public SlsTrnpRoutePrfVOImpl getSlsTrnpRoutePrf3() {
        return (SlsTrnpRoutePrfVOImpl) findViewObject("SlsTrnpRoutePrf3");
    }

    /**
     * Container's getter for SlsTrnpRouteLoc1.
     * @return SlsTrnpRouteLoc1
     */
    public SlsTrnpRouteLocVOImpl getSlsTrnpRouteLoc1() {
        return (SlsTrnpRouteLocVOImpl) findViewObject("SlsTrnpRouteLoc1");
    }

    /**
     * Container's getter for SlsTrnpRouteLoc2.
     * @return SlsTrnpRouteLoc2
     */
    public SlsTrnpRouteLocVOImpl getSlsTrnpRouteLoc2() {
        return (SlsTrnpRouteLocVOImpl) findViewObject("SlsTrnpRouteLoc2");
    }

    /**
     * Container's getter for LovLocationId1.
     * @return LovLocationId1
     */
    public ViewObjectImpl getLovLocationId1() {
        return (ViewObjectImpl) findViewObject("LovLocationId1");
    }


    public String getLocationId(String locNm) {

        String locid = null;

        ViewObjectImpl vo = this.getLovLocationId1();
        vo.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        vo.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
        vo.setNamedWhereClauseParam("orgIdBind", EbizParams.GLBL_APP_USR_ORG());
        vo.executeQuery();
        RowQualifier rq = new RowQualifier(vo);
        rq.setWhereClause("AddsLoc = '" + locNm + "'");
        Row[] filteredRows = vo.getFilteredRows(rq);

        if (filteredRows.length > 0) {

            locid = filteredRows[0].getAttribute("LocId").toString();
        }

        return locid;
    }


    public boolean validateDuplicateRoute(String arrivalPnt, String departurePnt) {

        Boolean flag = false;

        System.out.println("Arrival Point in AMImpl :" + arrivalPnt);
        System.out.println("Departure Point in AMImpl :" + departurePnt);

        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        RowQualifier rq = new RowQualifier(vo);
        rq.setWhereClause("ArrivalPnt ='" + arrivalPnt + "' AND DeparturePnt ='" + departurePnt + "'");
        Row[] filteredRows = vo.getFilteredRows(rq);

        System.out.println("FilteredRows length :" + filteredRows.length);

        if (filteredRows.length > 0) {

            if (filteredRows[0] != vo.getCurrentRow()) {

                flag = true;

            }

        }

        return flag;

    }


    public boolean validateDeparturePoint(String departure) {

        Boolean flag = false;
        String departurePnt = null;

        ViewObjectImpl vo = this.getSlsTrnpRoutePrfDtl4();
        Row currentRow = vo.getCurrentRow();

        ViewObjectImpl locVo = this.getLovLocationId1();

        Row[] filteredRows = locVo.getFilteredRows("AddsLoc", departure);

        if (filteredRows.length > 0) {
            departurePnt = filteredRows[0].getAttribute("LocId").toString();
        }

        String arrivalPnt = currentRow.getAttribute("ArrivalPnt").toString();

        System.out.println("Arrival point is :" + arrivalPnt);
        System.out.println("Inside Validate Name ::: " + departurePnt);

        if (departurePnt != null) {
            if (departurePnt.equals(arrivalPnt))
                flag = true;
            else
                flag = false;
        }

        return flag;

    }

    public void addOcNewRow() {
        Integer slocid = EbizParams.GLBL_APP_SERV_LOC();
        String cldid = EbizParams.GLBL_APP_CLD_ID();
        String orgid = EbizParams.GLBL_APP_USR_ORG();

        Integer currId = (Integer) (callStoredFunction(Types.INTEGER, "APP.get_org_def_curr_bs1(?,?,?)", new Object[] {
                                                       cldid, slocid, orgid
        }));

        System.out.println("SlocId value is " + slocid);
        System.out.println("CldId value is " + cldid);
        System.out.println("OrgId value is " + orgid);
        System.out.println("CurrId value is " + currId);


        Row newRow = this.getSlsTrnpRouteOc2().getCurrentRow();
        newRow.setAttribute("CoaId", this.getCOA1().getCurrentRow().getAttribute("CoaId"));
        newRow.setAttribute("TranType", this.getCOA1().getCurrentRow().getAttribute("OcCalcType"));
        newRow.setAttribute("OcId", this.getCOA1().getCurrentRow().getAttribute("OcId"));
        newRow.setAttribute("AmtSpOc", new Number(0));
        newRow.setAttribute("AmtSp", new Number(0));
        newRow.setAttribute("AmtBs", new Number(0));
        newRow.setAttribute("OcCat", this.getCOA1().getCurrentRow().getAttribute("OcCat"));
        newRow.setAttribute("CurrId", currId);
        newRow.setAttribute("CurrRate", new Number(1));

    }

    public boolean chkRouteExists() {
        Boolean result = false;

        ViewObjectImpl lrVo = this.getSlsTrnpLrVw1();
        lrVo.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        lrVo.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
        lrVo.setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        lrVo.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        lrVo.setNamedWhereClauseParam("BindRouteDocId",
                                      this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("DocId"));

        Row[] lrFilter =
            lrVo.getFilteredRows("RouteDocId", this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("DocId"));

        ViewObjectImpl loVo = this.getSlsTrnpLoVw1();
        loVo.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        loVo.setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
        loVo.setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        loVo.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        loVo.setNamedWhereClauseParam("BindRouteId", this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("DocId"));

        Row[] loFilter =
            loVo.getFilteredRows("RouteId", this.getSlsTrnpRoutePrf1().getCurrentRow().getAttribute("DocId"));

        System.out.println("lrFilter length :: " + lrFilter.length);
        System.out.println("loFilter length :: " + loFilter.length);

        if ((lrFilter.length > 0) || (loFilter.length > 0))
            return true;

        return result;
    }

    /**
     * Container's getter for COA1.
     * @return COA1
     */
    public ViewObjectImpl getCOA1() {
        return (ViewObjectImpl) findViewObject("COA1");
    }

    /**
     * Container's getter for SlsTrnpRouteOc1.
     * @return SlsTrnpRouteOc1
     */
    public SlsTrnpRouteOcVOImpl getSlsTrnpRouteOc1() {
        return (SlsTrnpRouteOcVOImpl) findViewObject("SlsTrnpRouteOc1");
    }

    /**
     * Container's getter for SlsTrnpRoutePrfDtl2.
     * @return SlsTrnpRoutePrfDtl2
     */
    public SlsTrnpRoutePrfDtlVOImpl getSlsTrnpRoutePrfDtl2() {
        return (SlsTrnpRoutePrfDtlVOImpl) findViewObject("SlsTrnpRoutePrfDtl2");
    }


    /**
     * Container's getter for CurrencyLov1.
     * @return CurrencyLov1
     */
    public ViewObjectImpl getCurrencyLov1() {
        return (ViewObjectImpl) findViewObject("CurrencyLov1");
    }

    /**
     * Container's getter for LovCoaName1.
     * @return LovCoaName1
     */
    public ViewObjectImpl getLovCoaName1() {
        return (ViewObjectImpl) findViewObject("LovCoaName1");
    }

    /**
     * Container's getter for SlsTrnpRouteOc2.
     * @return SlsTrnpRouteOc2
     */
    public SlsTrnpRouteOcVOImpl getSlsTrnpRouteOc2() {
        return (SlsTrnpRouteOcVOImpl) findViewObject("SlsTrnpRouteOc2");
    }

    /**
     * Container's getter for RoutePrfDtlToRouteOcVL1.
     * @return RoutePrfDtlToRouteOcVL1
     */
    public ViewLinkImpl getRoutePrfDtlToRouteOcVL1() {
        return (ViewLinkImpl) findViewLink("RoutePrfDtlToRouteOcVL1");
    }

    /**
     * Container's getter for SlsTrnpLoVw1.
     * @return SlsTrnpLoVw1
     */
    public ViewObjectImpl getSlsTrnpLoVw1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpLoVw1");
    }

    /**
     * Container's getter for SlsTrnpLrVw1.
     * @return SlsTrnpLrVw1
     */
    public ViewObjectImpl getSlsTrnpLrVw1() {
        return (ViewObjectImpl) findViewObject("SlsTrnpLrVw1");
    }

    /**
     * Container's getter for RouteLocCountVO1.
     * @return RouteLocCountVO1
     */
    public ViewObjectImpl getRouteLocCountVO1() {
        return (ViewObjectImpl) findViewObject("RouteLocCountVO1");
    }
}

