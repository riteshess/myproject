package finfdwithdrawlapp.model.service;

import adf.utils.bean.StaticValue;
import adf.utils.ebiz.EbizParams;

import adf.utils.ebiz.EbizParamsAPPUtils;
import adf.utils.ebiz.WorkFlowUtils;
import adf.utils.model.ADFModelUtils;

import finfdwithdrawlapp.model.service.common.FinFDWithdrwlAM;

import java.sql.Types;

import javax.faces.application.FacesMessage;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

import oracle.sql.NUMBER;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 08 15:09:15 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FinFDWithdrwlAMImpl extends ApplicationModuleImpl implements FinFDWithdrwlAM {
    /**
     * This is the default constructor (do not remove).
     */
    public FinFDWithdrwlAMImpl() {
    }

    /**
     * Container's getter for FinFdWithdrwl1.
     * @return FinFdWithdrwl1
     */
    public ViewObjectImpl getFinFdWithdrwl1() {
        return (ViewObjectImpl) findViewObject("FinFdWithdrwl1");
    }

    /**
     * Method to initialize Bind Variables
     */
    public void setGlobalVariables() {

        ViewObjectImpl searchVO = getFinFdSearchVO1();
        searchVO.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        searchVO.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
        searchVO.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
        searchVO.setNamedWhereClauseParam("HoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        searchVO.executeQuery();
    }

    /**
     * Container's getter for FinFdSearchVO1.
     * @return FinFdSearchVO1
     */
    public ViewObjectImpl getFinFdSearchVO1() {
        return (ViewObjectImpl) findViewObject("FinFdSearchVO1");
    }

    /**
     *  Method to create new Documennt
     */
    public void createNewDocument() {
        Row createRow = getFinFdWithdrwl1().createRow();
        getFinFdWithdrwl1().insertRow(createRow);
    }

    /**
     *  Method to view selected document from Seach Page
     */
    public void viewSelectedDocument() {
        Object docId = ADFModelUtils.resolvEl("#{pageFlowScope.DOC_ID}");
        ViewObjectImpl fdWithdrwlVo = getFinFdWithdrwl1();
        fdWithdrwlVo.setNamedWhereClauseParam("HoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
        fdWithdrwlVo.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
        fdWithdrwlVo.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
        fdWithdrwlVo.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
        fdWithdrwlVo.setNamedWhereClauseParam("DocIdBind", docId);
        fdWithdrwlVo.executeQuery();
    }

    /**
     * Method to save document
     * @return
     * 1 : Sucess
     * -1 : Failure
     */
    public Integer saveDocument() {
        Integer i = 1;
        try {
           getDBTransaction().commit();
           ADFModelUtils.showFormattedFacesMessage("Fixed Deposite Withdrawl Saved Successfully !", "Fixed Deposite Withdrawl Saved Successfully !", FacesMessage.SEVERITY_INFO);
           
       } catch (Exception e) {
            ADFModelUtils.showFormattedFacesMessage("There have been an error while saving Document!", e.getMessage(), FacesMessage.SEVERITY_ERROR);
            e.printStackTrace();
            i = -1;
        }
        
        return i;
    }

    /**
     * Method to save and forward document
     * @return
     * 1 : Sucess
     * -1 : Failure
     */
    public Integer passWorkFlowEntries() {
        Integer i = 1;
        Row currentRow = getFinFdWithdrwl1().getCurrentRow();
        try {
            WorkFlowUtils.insertWfTxnEntriesForCurrDoc(this, 62, 0, currentRow.getAttribute("DocId"),
                                                       EbizParams.GLBL_APP_USR(), EbizParams.GLBL_APP_USR(), "arg6",
                                                       new Number(1000));

        } catch (Exception e) {
            ADFModelUtils.showFormattedFacesMessage("There have been some problem while passing entries of Workflow !",
                                                    e.getMessage(), FacesMessage.SEVERITY_FATAL);
            e.printStackTrace();
            i = -1;
        }
        return i;
    }

    /**
     * Method to populate Data from fd
     * @return
     * 0 : Successs
     * 1 : Please Select Withdrawl Type
     * 2 : Please select FD
     * -1 :  Some Error
     */
    public Integer populateDtlsFrmFd() {
        Integer i = 0;
        Row currentRow = getFinFdWithdrwl1().getCurrentRow();
        Object fdIdO = currentRow.getAttribute("FdId");
        Object fdWdlTypO = currentRow.getAttribute("FdWdlTyp");
        Integer fdWdlTyp = (fdWdlTypO == null ? -1 : (Integer) fdWdlTypO);
        String fdId = (fdIdO == null ? "" : fdIdO.toString());
        if (fdWdlTyp.equals(-1)) {
            i = 1;
        } else if ("".equals(fdId)) {
            i = 2;
        } else {
            ViewObjectImpl dtlsVO1 = getFdDtlsVO1();
            dtlsVO1.setNamedWhereClauseParam("SlocIdBind", EbizParams.GLBL_APP_SERV_LOC());
            dtlsVO1.setNamedWhereClauseParam("CldIdBind", EbizParams.GLBL_APP_CLD_ID());
            dtlsVO1.setNamedWhereClauseParam("OrgIdBind", EbizParams.GLBL_APP_USR_ORG());
            dtlsVO1.setNamedWhereClauseParam("HoOrgIdBind", EbizParams.GLBL_HO_ORG_ID());
            dtlsVO1.setNamedWhereClauseParam("DocIdBind", fdIdO);
            Row[] allRowsInRange = dtlsVO1.getAllRowsInRange();
            System.out.println("No. of Rows :: " + allRowsInRange.length);
            if (allRowsInRange.length > 0) {
                Row fdRow = allRowsInRange[0];
                currentRow.setAttribute("FdAccId", fdRow.getAttribute("FdAccId"));
                currentRow.setAttribute("BankId", fdRow.getAttribute("BankId"));
                currentRow.setAttribute("IssuerNm", fdRow.getAttribute("IssuerNm"));
                currentRow.setAttribute("IssueDt", fdRow.getAttribute("IssueDt"));
                currentRow.setAttribute("PrincpAmt", fdRow.getAttribute("PrincpAmt"));
                currentRow.setAttribute("CurrVal", fdRow.getAttribute("CurrVal"));
                currentRow.setAttribute("TenureDays", fdRow.getAttribute("TenureDays"));
                currentRow.setAttribute("MaturityDt", fdRow.getAttribute("MaturityDt"));
                currentRow.setAttribute("MaturityAmt", fdRow.getAttribute("MaturityAmt"));
                currentRow.setAttribute("SchemeTyp", fdRow.getAttribute("SchemeTyp"));
                currentRow.setAttribute("CalcBasis", fdRow.getAttribute("CalcBasis"));
                currentRow.setAttribute("MinAmt", fdRow.getAttribute("MinAmt"));
            }
        }


        return i;
    }

    /**
     * Container's getter for FdDtlsVO1.
     * @return FdDtlsVO1
     */
    public ViewObjectImpl getFdDtlsVO1() {
        return (ViewObjectImpl) findViewObject("FdDtlsVO1");
    }
    /**
     * Method to fetch Workflow Id in Bean
     * @return
     */
    public String getWorkFlowId(){
        Object flowId = WorkFlowUtils.getWorkFlowId(this, 62, 0);
        return (String)flowId;
    }
    
    public void functionCallAftrRtrnFrmWf(){
        Boolean success = true;
        Object el = ADFModelUtils.resolvEl("#{pageFlowScope.WF_RETURN}");
        System.out.println("el : "+el);
        if(el != null){
            if("A".equals(el.toString())){
                getFinFdWithdrwl1().getCurrentRow().setAttribute("FdWdlMode", 314);
                success = callFunctionAfterApproval();
                System.out.println("Approved");
            }else if("F".equals(el.toString())){
                System.out.println("Forwarded");
                getFinFdWithdrwl1().getCurrentRow().setAttribute("FdWdlMode", 317);
            }
            if(success){
                try {
                   getDBTransaction().commit();
               } catch (Exception e) {
                    ADFModelUtils.showFormattedFacesMessage("There have been error while passing entries after approval.", e.getMessage(), FacesMessage.SEVERITY_ERROR);
                    e.printStackTrace();
                }
                
            }else{
                getDBTransaction().rollback();
            }
            
//            314     APPROVED
//            315     AMENDED
//            317     FORWARDED
//            313     INCOMPLETE
        }
    }
    
    public Boolean callFunctionAfterApproval(){
        Boolean b = true;
        try {
            Row currentRow = getFinFdWithdrwl1().getCurrentRow();
            ADFModelUtils.callFunction(this, new StringBuilder("fn_ins_fd_BR(?,?,?,?,?,?,?,?,?,?)"), 
                                       new Object[]{currentRow.getAttribute("DocId"),
                                                    StaticValue.getCurrDtWidTimestamp(),
                                                    currentRow.getAttribute("UsrIdCreate"),
                                                    currentRow.getAttribute("OrgId"),
                                                    currentRow.getAttribute("SlocId"),
                                                    currentRow.getAttribute("HoOrgId"),
                                                    currentRow.getAttribute("CldId"),
                                                    EbizParamsAPPUtils.getCurrIdBsForCurrOrg(this),new Number(1),"PROJ0000"}, Types.VARCHAR);
            
        }catch(Exception e){
            ADFModelUtils.showFormattedFacesMessage("There have been error while calling function fn_ins_fd_BR", e.getMessage(), FacesMessage.SEVERITY_ERROR);
            e.printStackTrace();
            b =false;
        }
        return b;
    }

    /**
     * Container's getter for TempSearchVO1.
     * @return TempSearchVO1
     */
    public ViewObjectImpl getTempSearchVO1() {
        return (ViewObjectImpl) findViewObject("TempSearchVO1");
    }
    
    public void search(){
        Row currentRow = getTempSearchVO1().getCurrentRow();
        getFinFdSearchVO1().setNamedWhereClauseParam("FdWdlIdBind", currentRow.getAttribute("WthdrlIdTrans"));
        getFinFdSearchVO1().executeQuery();
        getTempSearchVO1().executeQuery();
    }
    
    public void reset(){
        getFinFdSearchVO1().setNamedWhereClauseParam("FdWdlIdBind", -1);
        getFinFdSearchVO1().executeQuery();
        getTempSearchVO1().executeQuery();
    }
}

