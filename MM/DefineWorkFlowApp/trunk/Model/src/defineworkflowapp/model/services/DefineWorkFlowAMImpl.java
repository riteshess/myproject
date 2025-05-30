package defineworkflowapp.model.services;

import defineworkflowapp.model.views.AppWfDocMapVOImpl;
import defineworkflowapp.model.views.AppWfDocMapVORowImpl;
import defineworkflowapp.model.views.AppWfLvlVOImpl;
import defineworkflowapp.model.views.AppWfUsrLvlMapVOImpl;
import defineworkflowapp.model.views.DualAddDocumentVOImpl;
import defineworkflowapp.model.views.DualForSearchVOImpl;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import java.util.HashMap;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 29 17:19:00 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DefineWorkFlowAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DefineWorkFlowAMImpl() {
    }


    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }


    private static int VARCHAR = Types.VARCHAR;

    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;
        try {
            st = this.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    st.setObject(z + 2, bindVars[z]);
                    //  System.out.println(bindVars[z]);
                }
            }
            st.executeUpdate();

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


    public void populateLevels() {
        String cldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
        Integer slocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        String orgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        String hoorgId = resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        Row r = this.getAppWf().getCurrentRow();
        String wfId = null;
        if (r.getAttribute("WfId") != null) {
            wfId = (String) r.getAttribute("WfId");
        } else {
            wfId = (String) (callStoredFunction(VARCHAR, "APP.pkg_app_gen.generate_id (?,?,?,?,?)", new Object[] {
                                                slocId, cldId, hoorgId, orgId, "APP$WF"
            }));
            r.setAttribute("WfId", wfId);
        }
        System.out.println("Workflow Id=" + wfId);
        // this.getDBTransaction().postChanges();
        ViewObjectImpl lvlVo = this.getAppWfLvl();
        ViewObjectImpl wfVo = this.getAppWf();
        Row row = wfVo.getCurrentRow();
        Integer usrid1 = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
        Integer maxlvl = Integer.parseInt(row.getAttribute("WfMaxLvl").toString());
        for (int i = 1; i <= maxlvl; i++) {
            Row lvlRow = lvlVo.createRow();
            lvlRow.setAttribute("WfLvl", i);
            lvlRow.setAttribute("UsrIdCreate", usrid1);
            lvlVo.insertRow(lvlRow);
        }
    }

    public void executeCriteriaOnTf(String cldId, Integer slocId, String orgId) {
        ViewObjectImpl voWf = this.getAppWf();
        voWf.setNamedWhereClauseParam("cldIdBind", cldId);
        voWf.setNamedWhereClauseParam("slocIdBind", slocId);
        voWf.setNamedWhereClauseParam("orgIdBind", orgId);
        voWf.executeQuery();
    }

    /**
     * Container's getter for DualForSearch.
     * @return DualForSearch
     */
    public DualForSearchVOImpl getDualForSearch() {
        return (DualForSearchVOImpl) findViewObject("DualForSearch");
    }

    public void searchWorkflow() {
        ViewObjectImpl dualVo = this.getDualForSearch();
        String wfId = (String) dualVo.getCurrentRow().getAttribute("TransWfId");
        Integer docId = (Integer) dualVo.getCurrentRow().getAttribute("TransDocId");
        Integer docTypeId = (Integer) dualVo.getCurrentRow().getAttribute("TransDocTypeId");
        Integer usrId = (Integer) dualVo.getCurrentRow().getAttribute("TransUsrId");
        String cldId = (String) dualVo.getCurrentRow().getAttribute("TransCldId");
        Integer slocId = (Integer) dualVo.getCurrentRow().getAttribute("TransSlocId");
        String orgId = (String) dualVo.getCurrentRow().getAttribute("TransOrgId");


        ViewObjectImpl voWf = this.getAppWf();
        voWf.setNamedWhereClauseParam("cldIdBind", cldId);
        voWf.setNamedWhereClauseParam("slocIdBind", slocId);
        voWf.setNamedWhereClauseParam("orgIdBind", orgId);
        voWf.setNamedWhereClauseParam("wfIdBind", wfId);
        voWf.setNamedWhereClauseParam("docIdBind", docId);
        voWf.setNamedWhereClauseParam("docTypeIdBind", docTypeId);
        voWf.setNamedWhereClauseParam("usrIdBind", usrId);
        voWf.executeQuery();
    }

    public void resetBindVar() {
        ViewObjectImpl dualVo = this.getDualForSearch();
        dualVo.getCurrentRow().setAttribute("TransWfNm", null);
        dualVo.getCurrentRow().setAttribute("TransDocNm", null);
        dualVo.getCurrentRow().setAttribute("TransDocTypeNm", null);
        dualVo.getCurrentRow().setAttribute("TransUsrNm", null);
        dualVo.getCurrentRow().setAttribute("TransWfId", null);
        dualVo.getCurrentRow().setAttribute("TransDocId", null);
        dualVo.getCurrentRow().setAttribute("TransDocTypeId", null);
        dualVo.getCurrentRow().setAttribute("TransUsrId", null);
        String cldId = (String) dualVo.getCurrentRow().getAttribute("TransCldId");
        Integer slocId = (Integer) dualVo.getCurrentRow().getAttribute("TransSlocId");
        String orgId = (String) dualVo.getCurrentRow().getAttribute("TransOrgId");

        ViewObjectImpl voWf = this.getAppWf();
        voWf.setNamedWhereClauseParam("cldIdBind", cldId);
        voWf.setNamedWhereClauseParam("slocIdBind", slocId);
        voWf.setNamedWhereClauseParam("orgIdBind", orgId);
        voWf.setNamedWhereClauseParam("wfIdBind", null);
        voWf.setNamedWhereClauseParam("docIdBind", null);
        voWf.setNamedWhereClauseParam("docTypeIdBind", null);
        voWf.setNamedWhereClauseParam("usrIdBind", null);
        voWf.executeQuery();
    }

    /**
     * Container's getter for DualAddDocument.
     * @return DualAddDocument
     */
    public DualAddDocumentVOImpl getDualAddDocument() {
        return (DualAddDocumentVOImpl) findViewObject("DualAddDocument");
    }

    /**
     * Container's getter for LovDocId.
     * @return LovDocId
     */
    public ViewObjectImpl getLovDocId() {
        return (ViewObjectImpl) findViewObject("LovDocId");
    }

    /**
     * Container's getter for LovDocType.
     * @return LovDocType
     */
    public ViewObjectImpl getLovDocType() {
        return (ViewObjectImpl) findViewObject("LovDocType");
    }

    /**
     * Container's getter for AppWf.
     * @return AppWf
     */
    public ViewObjectImpl getAppWf() {
        return (ViewObjectImpl) findViewObject("AppWf");
    }

    /**
     * Container's getter for AppWfDocMap.
     * @return AppWfDocMap
     */
    public AppWfDocMapVOImpl getAppWfDocMap() {
        return (AppWfDocMapVOImpl) findViewObject("AppWfDocMap");
    }

    /**
     * Container's getter for AppWfToAppWfDocMapVL1.
     * @return AppWfToAppWfDocMapVL1
     */
    public ViewLinkImpl getAppWfToAppWfDocMapVL1() {
        return (ViewLinkImpl) findViewLink("AppWfToAppWfDocMapVL1");
    }

    /**
     * Container's getter for AppWfLvl.
     * @return AppWfLvl
     */
    public AppWfLvlVOImpl getAppWfLvl() {
        return (AppWfLvlVOImpl) findViewObject("AppWfLvl");
    }

    /**
     * Container's getter for AppWfToAppWfLvlVL1.
     * @return AppWfToAppWfLvlVL1
     */
    public ViewLinkImpl getAppWfToAppWfLvlVL1() {
        return (ViewLinkImpl) findViewLink("AppWfToAppWfLvlVL1");
    }


    /**
     * Container's getter for AppWfUsrLvlMap.
     * @return AppWfUsrLvlMap
     */
    public AppWfUsrLvlMapVOImpl getAppWfUsrLvlMap() {
        return (AppWfUsrLvlMapVOImpl) findViewObject("AppWfUsrLvlMap");
    }

    /**
     * Container's getter for AppWfDocToAppWfUsrVL1.
     * @return AppWfDocToAppWfUsrVL1
     */
    public ViewLinkImpl getAppWfDocToAppWfUsrVL1() {
        return (ViewLinkImpl) findViewLink("AppWfDocToAppWfUsrVL1");
    }

    /**
     * Container's getter for LovUsrId.
     * @return LovUsrId
     */
    public ViewObjectImpl getLovUsrId() {
        return (ViewObjectImpl) findViewObject("LovUsrId");
    }

    public void updateWfId() {
        String cldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
        Integer slocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        String orgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        String hoorgId = resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        Row r = this.getAppWf().getCurrentRow();
        String wfId = null;
        if (r.getAttribute("WfId") != null) {
        } else {
            wfId = (String) (callStoredFunction(VARCHAR, "APP.pkg_app_gen.generate_id (?,?,?,?,?)", new Object[] {
                                                slocId, cldId, hoorgId, orgId, "APP$WF"
            }));
            r.setAttribute("WfId", wfId);

            ViewObjectImpl lvlVo = this.getAppWfLvl();
            RowSetIterator rsiLvl = lvlVo.createRowSetIterator(null);
            while (rsiLvl.hasNext()) {
                Row row = rsiLvl.next();
                row.setAttribute("WfId", wfId);
            }
            rsiLvl.closeRowSetIterator();
        }
    }

    public void addDocument() {
        ViewObjectImpl wfVo = this.getAppWf();
        ViewObjectImpl dualDocVo = this.getDualAddDocument();
        ViewObjectImpl docVo = this.getAppWfDocMap();
        Integer docId = (Integer) dualDocVo.getCurrentRow().getAttribute("TransDocId");
        Integer docTypeId = new Integer(0);
        if (dualDocVo.getCurrentRow().getAttribute("TransDocTypeId") != null)
            docTypeId = (Integer) dualDocVo.getCurrentRow().getAttribute("TransDocTypeId");
        AppWfDocMapVORowImpl newrow = (AppWfDocMapVORowImpl) docVo.createRow();
        newrow.setAttribute("CldId", wfVo.getCurrentRow().getAttribute("CldId"));
        newrow.setAttribute("SlocId", wfVo.getCurrentRow().getAttribute("SlocId"));
        newrow.setAttribute("OrgId", wfVo.getCurrentRow().getAttribute("OrgId"));
        newrow.setAttribute("WfId", wfVo.getCurrentRow().getAttribute("WfId"));
        newrow.setWfId(wfVo.getCurrentRow().getAttribute("WfId").toString());
        newrow.setAttribute("DocId", docId);
        newrow.setAttribute("DocTypeId", docTypeId);
        docVo.insertRow(newrow);

        System.out.println("------work flow id--------" + wfVo.getCurrentRow().getAttribute("WfId"));

        System.out.println("Lov is " + ((AppWfDocMapVORowImpl) newrow).getAppWfLvl().getRowCount());


        dualDocVo.getCurrentRow().setAttribute("TransDocNm", null);
        dualDocVo.getCurrentRow().setAttribute("TransDocTypeNm", null);
        dualDocVo.getCurrentRow().setAttribute("TransDocId", null);
        dualDocVo.getCurrentRow().setAttribute("TransDocId", null);
    }

    public void addUsrToDocument() {
        ViewObjectImpl docVo = this.getAppWfDocMap();
        ViewObjectImpl usrVo = this.getAppWfUsrLvlMap();

        Row newrow = usrVo.createRow();
        newrow.setAttribute("CldId", docVo.getCurrentRow().getAttribute("CldId"));
        newrow.setAttribute("SlocId", docVo.getCurrentRow().getAttribute("SlocId"));
        newrow.setAttribute("OrgId", docVo.getCurrentRow().getAttribute("OrgId"));
        newrow.setAttribute("WfId", docVo.getCurrentRow().getAttribute("WfId"));
        newrow.setAttribute("DocId", docVo.getCurrentRow().getAttribute("DocId"));
        newrow.setAttribute("DocTypeId", docVo.getCurrentRow().getAttribute("DocTypeId"));
        newrow.setAttribute("WfLvl", docVo.getCurrentRow().getAttribute("TransLevel"));
        newrow.setAttribute("UsrId", docVo.getCurrentRow().getAttribute("TransUsrId"));
        usrVo.insertRow(newrow);

        docVo.getCurrentRow().setAttribute("TransLevel", null);
        docVo.getCurrentRow().setAttribute("TransUsrId", null);
        docVo.getCurrentRow().setAttribute("TransUsrName", null);
    }

    public String validateWarnDays(Integer warnDays) {
        String valid = null;
        //System.out.println("warning days "+warnDays+" auth days is "+getAppWfLvl().getCurrentRow().getAttribute("AuthDys"));
        if (this.getAppWfLvl().getCurrentRow().getAttribute("AuthDys") != null) {
            Integer authdys = (Integer) this.getAppWfLvl().getCurrentRow().getAttribute("AuthDys");
            // System.out.println("auth days and warndays compare "+warnDays.compareTo(authdys)+" authdys "+ authdys +" warnDays "+warnDays);

            if (warnDays.compareTo(authdys) > 0) {
                valid = "N";
            } else {
                valid = "Y";
            }
        }

        System.out.println("valid days is " + valid);
        return valid;
    }

    public String validateAuthDays(Integer authDays) {
        String valid = null;
        if (this.getAppWfLvl().getCurrentRow().getAttribute("WarnDys") != null) {
            Integer warndys = (Integer) this.getAppWfLvl().getCurrentRow().getAttribute("WarnDys");
            //  System.out.println("warn days value is "+warndys +"auth days is"+authDays);
            if (authDays.compareTo(warndys) < 0) {
                valid = "N";
            } else {
                valid = "Y";
            }
        }

        return valid;

    }

    public String validateDoc() {
        String ret = "N";
        Row r = this.getDualAddDocument().getCurrentRow();
        if (r.getAttribute("TransDocId") != null) {
            ret = "Y";
            /* String typeexist="N";
                this.getLovDocType().setNamedWhereClauseParam("cldIdBindVar", r.getAttribute("TransCldId"));
                this.getLovDocType().setNamedWhereClauseParam("slocIdBindVar",  r.getAttribute("TransSlocId"));
                this.getLovDocType().setNamedWhereClauseParam("orgIdBindVar",  r.getAttribute("TransOrgId"));
                this.getLovDocType().setNamedWhereClauseParam("docIdBindVar",  r.getAttribute("TransDocId"));
                this.getLovDocType().executeQuery();
            RowSetIterator itr=this.getLovDocType().createRowSetIterator(null);
            while(itr.hasNext())
            {
                Row row=itr.next();
                if(row.getAttribute("DocTypId").equals(0)){}
                else
                {
                    typeexist="Y";
                    break;
                }
                }
            itr.closeRowSetIterator();
            if(typeexist.equals("N"))
            {
                this.getAppWfDocMap().getFilteredRows("DocId");
                } */
        } else
            ret = "N";
        return ret;
    }

    public String validateDocType() {
        String ret = "N";
        Row r = this.getDualAddDocument().getCurrentRow();
        System.out.println("Validation of DocType:" + r.getAttribute("TransCldId") + " " +
                           r.getAttribute("TransSlocId") + " " + r.getAttribute("TransOrgId") +
                           r.getAttribute("TransDocId"));
        this.getLovDocType().setNamedWhereClauseParam("cldIdBindVar", r.getAttribute("TransCldId"));
        this.getLovDocType().setNamedWhereClauseParam("slocIdBindVar", r.getAttribute("TransSlocId"));
        this.getLovDocType().setNamedWhereClauseParam("orgIdBindVar", r.getAttribute("TransOrgId"));
        this.getLovDocType().setNamedWhereClauseParam("docIdBindVar", r.getAttribute("TransDocId"));
        this.getLovDocType().executeQuery();
        System.out.println("DocTypId" + r.getAttribute("TransDocTypeId"));
        Row[] frlovdoc = this.getLovDocType().getFilteredRows("DocTypId", r.getAttribute("TransDocTypeId"));
        System.out.println("Length of Array:" + frlovdoc.length);
        if (frlovdoc.length > 0) {
            RowQualifier rq = new RowQualifier(this.getAppWfDocMapVO1());
            rq.setWhereClause("CldId ='" + r.getAttribute("TransCldId") + "' and SlocId =" +
                              r.getAttribute("TransSlocId") + " and OrgId ='" + r.getAttribute("TransOrgId") +
                              "' and DocId =" + r.getAttribute("TransDocId") + " and DocTypeId =" +
                              r.getAttribute("TransDocTypeId"));
            Row fr[] = this.getAppWfDocMapVO1().getFilteredRows(rq);
            System.out.println("Length of fr array:" + fr.length + "   " + rq.getExprStr());
            if (fr.length > 0)
                ret = "D";
            else
                ret = "Y";
        } else
            ret = "N";
        return ret;
    }

    public String validateLevel() {
        String ret = "N";
        if (this.getAppWfDocMap().getCurrentRow().getAttribute("TransLevel") != null)
            ret = "Y";
        else
            ret = "N";
        return ret;
    }

    public String validateUsr() {
        String ret = "N";
        if (this.getAppWfDocMap().getCurrentRow().getAttribute("TransUsrId") != null) {
            Row r = this.getAppWfDocMap().getCurrentRow();
            RowQualifier rq = new RowQualifier(this.getAppWfUsrLvlMap());
            rq.setWhereClause("CldId='" + r.getAttribute("CldId") + "' and SlocId=" + r.getAttribute("SlocId") +
                              " and OrgId='" + r.getAttribute("OrgId") + "' and WfId='" + r.getAttribute("WfId") +
                              "' and DocTypeId=" + r.getAttribute("DocTypeId") + " and DocId=" +
                              r.getAttribute("DocId") + " and UsrId=" + r.getAttribute("TransUsrId"));
            Row fr[] = this.getAppWfUsrLvlMap().getFilteredRows(rq);
            if (fr.length > 0)
                ret = "D";
            else
                ret = "Y";
        } else
            ret = "N";
        return ret;
    }

    public String wfNameValid(String Name) {
        String OrgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        String flag = null;
        RowSetIterator wfIterator = this.getAppWf().createRowSetIterator(null);
        Row currentRow = this.getAppWf().getCurrentRow();
        while (wfIterator.hasNext()) {
            Row r1 = wfIterator.next();
            if (r1 != currentRow) {
                String wfName = r1.getAttribute("WfNm").toString();
                String r1org = r1.getAttribute("OrgId").toString();
                if (OrgId.equals(r1org) && Name.equalsIgnoreCase(wfName)) {
                    flag = "N";
                }
            }
        }
        wfIterator.closeRowSetIterator();
        System.out.println("work flow name is" + flag);

        return flag;
    }

    public String autoSkipSet() {
        Row curr = this.getAppWfLvl().getCurrentRow();
        if (curr != null) {
            curr.setAttribute("AutoSkipFlg", "N");
        }
        return null;
    }

    public String ValidationWF() {
        //        Integer i=0;
        //        System.out.println("in the Validation Code");
        //        Row []r1=this.getAppWfLvl().getAllRowsInRange();
        //        System.out.println("Total number of rows in AppWfLvl Vo:"+r1.length);
        //       Row []r =this.getAppWfDocMap().getAllRowsInRange();
        //       System.out.println("No. of Rows in AppWfDocMap Vo:"+r.length);
        //
        ////       if(row.hasNext()){
        ////           i++;
        ////           System.out.println(i);
        //       for(int a=0;a<r.length;a++){
        //         //Row r=row.next();
        //           i++;
        //         String doctypeid=r[a].getAttribute("DocTypeId").toString();
        //         System.out.println("Doctypeid"+doctypeid);
        //          String docid = r[a].getAttribute("DocId").toString();
        //         System.out.println("DocId"+docid);
        //           RowQualifier rq= new RowQualifier(getAppWfUsrLvlMap());
        //        rq.setWhereClause("DocTypeId='"+doctypeid+"' and DocId='"+docid+"'");
        //         Row []r2=this.getAppWfUsrLvlMap().getFilteredRows(rq);
        //         System.out.println("Total number in AppWfUsrLvlMapVo:"+r2.length);
        //         if(r2.length !=r1.length) {
        //                  FacesMessage message = new FacesMessage("Something Went Wrong");
        //                  message.setSeverity(FacesMessage.SEVERITY_ERROR);
        //                  FacesContext fc = FacesContext.getCurrentInstance();
        //                  fc.addMessage(null, message);
        //                   return "true";
        //         }
        //       }
        //     System.out.println("Row Iterator:"+i);
        //     return "false";
        //    }
        HashMap hm = new HashMap();
        String DocTypeName = null;
        String DocName = null;
        String message = null;
        Integer DocId = null;
        Integer DocTypeId = null;
        String WrkFlw = null;
        Integer slocId = Integer.parseInt(this.getAppWf().getCurrentRow().getAttribute("SlocId").toString());
        String orgId = this.getAppWf().getCurrentRow().getAttribute("OrgId").toString();
        String CldId = this.getAppWf().getCurrentRow().getAttribute("CldId").toString();
        String wfid = this.getAppWf().getCurrentRow().getAttribute("WfId").toString();
        System.out.println("Work Flow Id:" + wfid + "SlocId:" + slocId + "CldId :" + CldId + "OrgId :" + orgId);
        Row r[] = this.getAppWfLvl().getFilteredRows("WfId", wfid);
        System.out.println("No of level in Wf is:" + r.length);
        //        for(int i=0;i<r.length;i++) {
        //                                     System.out.println(r[i].getAttribute("WfLvl"));
        //                                   }
        RowQualifier rq = new RowQualifier(getAppWfDocMap());
        rq.setWhereClause("WfId='" + wfid + "' and  SlocId =" + slocId + " and CldId ='" + CldId + "' and OrgId = '" +
                          orgId);
        Row[] r1 = this.getAppWfDocMap().getFilteredRows(rq);
        System.out.println("No. of Rows in Document Table:" + r1.length);
        if (r1.length > 0) {
            for (Row rr1 : r1) {
                DocId = Integer.parseInt(rr1.getAttribute("DocId").toString());
                DocTypeId = Integer.parseInt(rr1.getAttribute("DocTypeId").toString());
                WrkFlw = rr1.getAttribute("WfId").toString();
                System.out.println("Work Flow id in doc Vo:" + WrkFlw);
                System.out.println("DocId:" + DocId + "DocTypeId:" + DocTypeId);
                RowQualifier rq1 = new RowQualifier(getAppWfUsrLvlMapVO1());
                rq1.setWhereClause("DocId= " + DocId + " and DocTypeId= " + DocTypeId + " and WfId= '" + WrkFlw +
                                   "' and SlocId =" + slocId + " and CldId ='" + CldId + "' and OrgId ='" + orgId +
                                   "'");
                Row[] r2 = getAppWfUsrLvlMapVO1().getFilteredRows(rq1);

                // System.out.println("row qualifier expression is ------------------------- "+rq1.getExprStr());
                System.out.println("No of User:" + r2.length + "DocId:" + DocId);

                Boolean flag = false;
                for (int i = 0; i < r.length; i++) {
                    flag = false;
                    for (int j = 0; j < r2.length; j++) {
                        System.out.println("R2 : " + r2[j].getAttribute("WfLvl"));
                        System.out.println("R : " + r[i].getAttribute("WfLvl"));
                        if (Integer.parseInt(r[i].getAttribute("WfLvl").toString()) ==
                            Integer.parseInt(r2[j].getAttribute("WfLvl").toString())) {
                            System.out.println("Equal");
                            flag = true;
                            break;
                        }
                    }
                    //System.out.println("=======================================================================End");
                    if (flag == false)
                        break;
                }
                if (flag == false) {
                    Row r4[] = this.getLovDocId().getFilteredRows("DocId", DocId);
                    if (r4.length > 0) {
                        DocName = r4[0].getAttribute("DocNm").toString();
                    }
                    Row r5[] = this.getLovDocType().getFilteredRows("DocTypId", DocTypeId);
                    if (r5.length > 0) {
                        DocTypeName = r5[0].getAttribute("DocTypeNm").toString();
                    }
                    FacesMessage message1 =
                        new FacesMessage("User not added in all levels for:[" + DocName + "," + DocTypeName + "]");
                    message1.setSeverity(FacesMessage.SEVERITY_ERROR);
                    FacesContext fc = FacesContext.getCurrentInstance();
                    fc.addMessage(null, message1);

                    //             if(r2.length!=r.length) {
                    //                 Row r4[]=this.getLovDocId().getFilteredRows("DocId", DocId);
                    //                 if(r4.length>0) {
                    //                     DocName=r4[0].getAttribute("DocNm").toString();
                    //                 }
                    //                 Row r5[]=this.getLovDocType().getFilteredRows("DocTypId",DocTypeId);
                    //                 if(r5.length>0) {
                    //                     DocTypeName=r5[0].getAttribute("DocTypeNm").toString();
                    //                 }
                    //                 FacesMessage message1 = new FacesMessage("User not added in all levels for:["+DocName+","+DocTypeName+"]");
                    //                 message1.setSeverity(FacesMessage.SEVERITY_ERROR);
                    //                 FacesContext fc = FacesContext.getCurrentInstance();
                    //                 fc.addMessage(null, message1);
                    return "false";
                }
            }
        }

        return "true";

    }

    /**
     * Container's getter for AppWfUsrLvlMapVO1.
     * @return AppWfUsrLvlMapVO1
     */
    public AppWfUsrLvlMapVOImpl getAppWfUsrLvlMapVO1() {
        return (AppWfUsrLvlMapVOImpl) findViewObject("AppWfUsrLvlMapVO1");
    }

    public String deleteUser() {

        System.out.println("in the deleteUser method");
        Integer did = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocId").toString());
        Integer dcotyid =
            Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocTypeId").toString());
        String wfid = this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("WfId").toString();
        Integer Usrid = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("UsrId").toString());
        String CldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        Integer SlocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        String OrgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        System.out.println("SlocId:" + SlocId + "CldId:" + CldId + "OrgId:" + OrgId + "doc" + did + "doctype" +
                           dcotyid + "Usr:" + Usrid + "wfid" + wfid);
        String result = "Y";

        try {
            result = (String) (callStoredFunction(Types.VARCHAR, "APP.WF_CHK_DELETABLE (?,?,?,?,?,?,?,?)", new Object[] {
                                                  CldId, SlocId, OrgId, "U", wfid, did, dcotyid, Usrid
            }));
        } catch (Exception e) {
            result = "N";

            System.out.println("Error code is " + e.getMessage());
            e.printStackTrace();

        }


        System.out.println("result===" + result);
        return result;

    }


    public void createBackUpDoc() {
        //System.out.println("in the deleteDocAL method");
        Integer did = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocId").toString());
        Integer dcotyid =
            Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocTypeId").toString());
        String wfid = this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("WfId").toString();
        Integer Usrid = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("UsrId").toString());
        String CldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        Integer SlocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        String OrgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        System.out.println("SlocId:" + SlocId + "CldId:" + CldId + "OrgId:" + OrgId + "doc" + did + "doctype" +
                           dcotyid + "Usr:" + Usrid + "wfid" + wfid);
        String result = (String) (callStoredFunction(Types.VARCHAR, "APP.FN_WF_DOC_MAP_BACKUP (?,?,?,?,?)", new Object[] {
                                                     SlocId, CldId, OrgId, did, dcotyid
        }));

        System.out.println("result===" + result);
        // return result;

    }

    public void createBackUpUsr() {
        System.out.println("in the deleteDocAL method");
        Integer did = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocId").toString());
        Integer dcotyid =
            Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("DocTypeId").toString());
        String wfid = this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("WfId").toString();
        Integer Usrid = Integer.parseInt(this.getAppWfUsrLvlMap().getCurrentRow().getAttribute("UsrId").toString());
        String CldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        Integer SlocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        String OrgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        System.out.println("SlocId:" + SlocId + "CldId:" + CldId + "OrgId:" + OrgId + "doc" + did + "doctype" +
                           dcotyid + "Usr:" + Usrid + "wfid" + wfid);
        String result = (String) (callStoredFunction(Types.VARCHAR, "APP.FN_WF_USR_LVL_MAP_BACKUP (?,?,?,?,?,?,?)", new Object[] {
                                                     SlocId, CldId, OrgId, did, dcotyid, Usrid, wfid
        }));

        System.out.println("result===" + result);


    }


    /**
     * Container's getter for AppWfDocMapVO1.
     * @return AppWfDocMapVO1
     */
    public AppWfDocMapVOImpl getAppWfDocMapVO1() {
        return (AppWfDocMapVOImpl) findViewObject("AppWfDocMapVO1");
    }

}
