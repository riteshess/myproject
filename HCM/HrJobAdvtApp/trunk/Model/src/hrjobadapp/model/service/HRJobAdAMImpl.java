package hrjobadapp.model.service;

import adf.utils.ebiz.EbizParams;

import adf.utils.model.ADFModelUtils;

import hrjobadapp.model.service.common.HRJobAdAM;

import hrjobadapp.model.views.DummyVOImpl;

import java.sql.SQLException;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import oracle.jbo.Row;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewLinkImpl;

import oracle.jbo.server.ViewObjectImpl;

import org.apache.myfaces.trinidad.context.RequestContext;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 11 14:25:23 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HRJobAdAMImpl extends ApplicationModuleImpl implements HRJobAdAM {
    /**
     * This is the default constructor (do not remove).
     */
    public HRJobAdAMImpl() {
    }

    /**
     * Container's getter for HcmJobAdvt1.
     * @return HcmJobAdvt1
     */
    public ViewObjectImpl getHcmJobAdvt1() {
        return (ViewObjectImpl) findViewObject("HcmJobAdvt1");
    }

    /**
     * Container's getter for HcmJobAdvtDtl1.
     * @return HcmJobAdvtDtl1
     */
    public ViewObjectImpl getHcmJobAdvtDtl1() {
        return (ViewObjectImpl) findViewObject("HcmJobAdvtDtl1");
    }


    /**
     * Container's getter for JobAdvtTOAdvtDtlVL1.
     * @return JobAdvtTOAdvtDtlVL1
     */
    public ViewLinkImpl getJobAdvtTOAdvtDtlVL1() {
        return (ViewLinkImpl) findViewLink("JobAdvtTOAdvtDtlVL1");
    }


    /**
     * Container's getter for LovSourceNm1.
     * @return LovSourceNm1
     */
    public ViewObjectImpl getLovSourceNm1() {
        return (ViewObjectImpl) findViewObject("LovSourceNm1");
    }

    /**
     * Container's getter for LovReferalName1.
     * @return LovReferalName1
     */
    public ViewObjectImpl getLovReferalName1() {
        return (ViewObjectImpl) findViewObject("LovReferalName1");
    }

    /**
     * Container's getter for HcmJobAdvtSal1.
     * @return HcmJobAdvtSal1
     */
    public ViewObjectImpl getHcmJobAdvtSal1() {
        return (ViewObjectImpl) findViewObject("HcmJobAdvtSal1");
    }

    /**
     * Container's getter for AdvtDtlToAdvtSalVL1.
     * @return AdvtDtlToAdvtSalVL1
     */
    public ViewLinkImpl getAdvtDtlToAdvtSalVL1() {
        return (ViewLinkImpl) findViewLink("AdvtDtlToAdvtSalVL1");
    }

    /**
     * Container's getter for Dummy1.
     * @return Dummy1
     */
    public DummyVOImpl getDummy1() {
        return (DummyVOImpl) findViewObject("Dummy1");
    }

    /**To SetBindVar on page load*/
    public void setBindVar() {
        RequestContext.getCurrentInstance().getPageFlowScope().put("PAGE_MODE", "V");
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
        this.getHcmJobAdvt1().executeQuery();

    }

    /**TO Search  in JobAdvt*/
    public void searchAdvt() {
        if (getDummy1().getCurrentRow() != null) {
            this.getHcmJobAdvt1().setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
            this.getHcmJobAdvt1().setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
            this.getHcmJobAdvt1().setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
            this.getHcmJobAdvt1().setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());

            if (getDummy1().getCurrentRow().getAttribute("TransAdvtNo") != null) {
                String advtDoc = getDummy1().getCurrentRow().getAttribute("TransAdvtNo").toString();
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtNo", advtDoc);
            } else {
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtNo", null);
            }
            if (getDummy1().getCurrentRow().getAttribute("TransAdvtFrmDt") != null) {
                System.out.println("****"+getDummy1().getCurrentRow().getAttribute("TransAdvtFrmDt"));
                Object attribute = getDummy1().getCurrentRow().getAttribute("TransAdvtFrmDt");
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtFrmDt",
                                                               getDummy1().getCurrentRow().getAttribute("TransAdvtFrmDt"));
            } else {
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtFrmDt", null);
            }
            if (getDummy1().getCurrentRow().getAttribute("TransAdvtToDt") != null) {
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtToDt",
                                                               getDummy1().getCurrentRow().getAttribute("TransAdvtToDt"));
            } else {
                this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtToDt", null);
            }
            this.getHcmJobAdvt1().setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
            this.getHcmJobAdvt1().executeQuery();
        }
    }

    /**To Reset Search Fileds*/

    public void resetAdvt() {
        String HoOrgId = EbizParams.GLBL_HO_ORG_ID();
        String OrgId = EbizParams.GLBL_APP_USR_ORG();
        String CldId = EbizParams.GLBL_APP_CLD_ID();
        Integer SlocId = EbizParams.GLBL_APP_SERV_LOC();
        getDummy1().executeQuery();
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtToDt", null);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtFrmDt", null);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindAdvtNo", null);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindCldId",CldId);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindHoOrgId",HoOrgId);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindOrgId",OrgId);
        this.getHcmJobAdvt1().setNamedWhereClauseParam("BindSlocId",SlocId);
        this.getHcmJobAdvt1().executeQuery();
    }

    /**To Validate Advertisement Date*/
    public String chkDuplicateAdvtDt(Timestamp advtDt) {
        System.out.println("check duplicate advertisment ::::::;");
        Row[] filteredRows = this.getHcmJobAdvt1().getFilteredRows("DocDt", advtDt);
        if (filteredRows.length > 0) {
            for (Row r : filteredRows) {
                if (!r.equals(getHcmJobAdvt1().getCurrentRow())) {
                    System.out.println("******** in chkDuplicateAdvtDt if*******");
                    return "Y";
                }
            }
        }
        return "N";
    }
    
     public String chkReqValidatyDt() {
        
        System.out.println(":::::: in chkReqValidatyDt in am ::::::::::");
        Row currentRow = this.getHcmJobAdvt1().getCurrentRow();
        Timestamp FromDate = (Timestamp)currentRow.getAttribute("FromDt");
        System.out.println("from date is::::::" +FromDate);
        Timestamp ReqValidDate = (Timestamp)currentRow.getAttribute("ValidDt");
        System.out.println("req valid date is::::: "+ReqValidDate);
        try
        {
        java.sql.Date d1 = FromDate.dateValue();
        java.sql.Date d2 = ReqValidDate.dateValue();
            if (FromDate.compareTo(ReqValidDate) < 0 && !d1.toString().equals(d2.toString())) {
                   
                   return "Y";
             }
        }
            
        catch (SQLException e) 
        {
             e.printStackTrace();
        }

      return "N";
    } 
    
    
    public String chkDuplicateAdvtDtl() {
        System.out.println("in  chkDuplicateAdvtDtl() in am ::::::::::");
        if(getHcmJobAdvtDtl1().getEstimatedRowCount()==0) {
            return "Y";
        }
        if(getHcmJobAdvtDtl1().getEstimatedRowCount()> 0) {
            
            System.out.println("in if::::::::");
            String hoOrgId = EbizParams.GLBL_HO_ORG_ID();
            String cldId = EbizParams.GLBL_APP_CLD_ID();
            Integer slocId = EbizParams.GLBL_APP_SERV_LOC();
            String orgId = EbizParams.GLBL_APP_USR_ORG();
            Integer userId = EbizParams.GLBL_APP_USR();

            Row currentRow = this.getHcmJobAdvtDtl1().getCurrentRow();
            Object JobType = currentRow.getAttribute("JobId");
            System.out.println("job type is :::" +JobType);
            Object Location = currentRow.getAttribute("LocId");
            System.out.println("Location is :::::: " + Location);
            Object Department = currentRow.getAttribute("DeptId");
            System.out.println("Department is ::::: "+Department);
            Object Designation = currentRow.getAttribute("DesigId");
            System.out.println("designation is ::::: "+Designation);
        //    Object NoOfVacancies = currentRow.getAttribute("NoVacancies");
        //    Object Remarks = currentRow.getAttribute("Remarks");
            
            RowQualifier rq = new RowQualifier(this.getHcmJobAdvtDtl1());
            String querry = "";
            if (currentRow != null) {
                
         querry =
                    "CldId='" + cldId + "' and SlocId=" + slocId + " and HoOrgId='" + hoOrgId + "' and OrgId='" +
                    orgId + "' and JobId='" + JobType + "' and LocId='" + Location +  "' and DeptId ='"+Department+
                    "' and DesigId='" + Designation + "";//' and NoVacancies="+ NoOfVacancies+"" ;
        
                rq.setWhereClause(querry);
                
                    System.out.println("rq.getExprStr():::::::::::::"+rq.getExprStr());

                Row[] fr = this.getHcmJobAdvtDtl1().getFilteredRows(rq);
                System.out.println("Total no. of same rows=" + fr.length);
                if(fr.length>1)
                {
                        return "N";
                }
                else {
                    return "Y";
                }                    
                }

            }

        return "Y";  
    }
    
    public String chkDuplicateAdvtSourceDetl() {
        
        System.out.println("in  cchkDuplicateAdvtSourceDetl in am ::::::::::");
        if(getHcmJobAdvtSrc1().getEstimatedRowCount()==0) {
            return "Y";
        }
        if(getHcmJobAdvtSrc1().getEstimatedRowCount()> 0) {
            
            System.out.println("in if::::::::");
            String hoOrgId = EbizParams.GLBL_HO_ORG_ID();
            String cldId = EbizParams.GLBL_APP_CLD_ID();
            Integer slocId = EbizParams.GLBL_APP_SERV_LOC();
            String orgId = EbizParams.GLBL_APP_USR_ORG();
            Integer userId = EbizParams.GLBL_APP_USR();

            Row currentRow = this.getHcmJobAdvtSrc1().getCurrentRow();
            Object sourceType = currentRow.getAttribute("SourceId");
            System.out.println("Source Type is :::::" +sourceType);
            
            Object sourceName = currentRow.getAttribute("TransSourceNm");
            System.out.println("Source name is :::::" +sourceName);
            
            RowQualifier rq = new RowQualifier(this.getHcmJobAdvtSrc1());
            String querry = "";
            if (currentRow != null) {
              querry =  "CldId='" + cldId + "' AND SlocId=" + slocId + " AND HoOrgId='" + hoOrgId + "' AND OrgId='" +
                orgId + "' AND sourceId='" + sourceType + "' AND TransSourceNm='" + sourceName+"'";
              
                rq.setWhereClause(querry);
                
                    System.out.println("rq.getExprStr():::::::::::::"+rq.getExprStr());
                    

                Row[] fr = this.getHcmJobAdvtSrc1().getFilteredRows(rq);
                System.out.println("Total no. of same rows=" + fr.length);
                if(fr.length>1)
                {
                        return "N";
                }
                else {
                    return "Y";
                }                   
                }
        }
        return "Y";
    }   
    
    public Object resolvEl(String data) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, data, Object.class);
        return exp.getValue(elContext);
    }
    
    /**To Validate Advertisement Date*/
    public String chkDuplicateSourceName(String srcName) {
        System.out.println("chkDuplicateSourceName ::::::;");
        Row[] filteredRows = this.getHcmJobAdvtSrc1().getFilteredRows("TransSourceNm", srcName);
        if (filteredRows.length > 0) {
            for (Row r : filteredRows) {
                if (!r.equals(getHcmJobAdvtSrc1().getCurrentRow())) {
                    System.out.println("******** in chkDuplicateSourceName if*******");
                    return "Y";
                }
            }
        }
        return "N";
    }
    
    /**To Validate Salary Componenent*/
    
    public String chkDuplicateSalaryComponent(String salcomp) {
        System.out.println("chkDuplicat Salary Componenent ::::::;");
        Row[] filteredRows = this.getHcmJobAdvtSal1().getFilteredRows("SalId",salcomp);
        if(filteredRows.length>0) {
            for (Row r : filteredRows) {
                if (!r.equals(getHcmJobAdvtSal1().getCurrentRow())) {
                    System.out.println("******** in chk Duplicate Salary Componenent if*******");
                    return "Y";
                }
            }
        }
        return "N";
    }


    /**
     * Container's getter for HcmJobAdvtSrcVO1.
     * @return HcmJobAdvtSrcVO1
     */
    public ViewObjectImpl getHcmJobAdvtSrc1() {
        return (ViewObjectImpl) findViewObject("HcmJobAdvtSrc1");
    }

    /**
     * Container's getter for JobAdvtTOAdvtSrcVL1.
     * @return JobAdvtTOAdvtSrcVL1
     */
    public ViewLinkImpl getJobAdvtTOAdvtSrcVL1() {
        return (ViewLinkImpl) findViewLink("JobAdvtTOAdvtSrcVL1");
    }
    
    /********* validate jobCost ***********/
    
    public String chkJobCost(oracle.jbo.domain.Number jobCost) 
    { 
        String S = "Y";
        System.out.println("in validate job cost method in am");
        oracle.jbo.domain.Number advtCost = (oracle.jbo.domain.Number)this.getHcmJobAdvt1().getCurrentRow().getAttribute("TotCost");
        System.out.println("advertisment cost:::::::"+advtCost);
        System.out.println("job cost is::::::"+jobCost);
        if(jobCost != null && advtCost != null){
          S =  jobCost.compareTo(advtCost) > 0 ? "Y" : "N";
        }
        return S;
    }

    /**
     * Container's getter for HcmAddressVO1.
     * @return HcmAddressVO1
     */
    public ViewObjectImpl getHcmAddressVO1() {
        return (ViewObjectImpl) findViewObject("HcmAddressVO1");
    }

    /**
     * Container's getter for HcmContactInfoVO1.
     * @return HcmContactInfoVO1
     */
    public ViewObjectImpl getHcmContactInfoVO1() {
        return (ViewObjectImpl) findViewObject("HcmContactInfoVO1");
    }
}
