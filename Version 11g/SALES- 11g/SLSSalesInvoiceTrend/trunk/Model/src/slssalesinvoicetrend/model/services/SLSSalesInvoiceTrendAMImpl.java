package slssalesinvoicetrend.model.services;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import oracle.jbo.server.ViewObjectImpl;

import slssalesinvoicetrend.model.services.common.SLSSalesInvoiceTrendAM;
import slssalesinvoicetrend.model.views.TempVOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 16 13:57:23 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SLSSalesInvoiceTrendAMImpl extends ApplicationModuleImpl implements SLSSalesInvoiceTrendAM {
    /**
     * Method for resolving the El
     */
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
     * This is the default constructor (do not remove).
     */
    public SLSSalesInvoiceTrendAMImpl() {
    }

    /**
     * Container's getter for MonthWiseInvoiceVo.
     * @return MonthWiseInvoiceVo
     */
    public ViewObjectImpl getMonthWiseInvoiceVo() {
        return (ViewObjectImpl)findViewObject("MonthWiseInvoiceVo");
    }

    /**
     * Container's getter for InvoiceCoaMonthWiseVo.
     * @return InvoiceCoaMonthWiseVo
     */
    public ViewObjectImpl getInvoiceCoaMonthWiseVo() {
        return (ViewObjectImpl)findViewObject("InvoiceCoaMonthWiseVo");
    }

    /**
     * Container's getter for InvoiceDetailVo.
     * @return InvoiceDetailVo
     */
    public ViewObjectImpl getInvoiceDetailVo() {
        return (ViewObjectImpl)findViewObject("InvoiceDetailVo");
    }

    /**
     * Container's getter for InvoiceItemDetailsVo.
     * @return InvoiceItemDetailsVo
     */
    public ViewObjectImpl getInvoiceItemDetailsVo() {
        return (ViewObjectImpl)findViewObject("InvoiceItemDetailsVo");
    }

    /**
     * Container's getter for MonthwiseTOCoaWiseVL1.
     * @return MonthwiseTOCoaWiseVL1
     */
    public ViewLinkImpl getMonthwiseTOCoaWiseVL1() {
        return (ViewLinkImpl)findViewLink("MonthwiseTOCoaWiseVL1");
    }

    /**
     * Container's getter for CoaWiseTOInvoiceWiseVL1.
     * @return CoaWiseTOInvoiceWiseVL1
     */
    public ViewLinkImpl getCoaWiseTOInvoiceWiseVL1() {
        return (ViewLinkImpl)findViewLink("CoaWiseTOInvoiceWiseVL1");
    }

    /**
     * Container's getter for InvoiceTOInvoiceItemVL1.
     * @return InvoiceTOInvoiceItemVL1
     */
    public ViewLinkImpl getInvoiceTOInvoiceItemVL1() {
        return (ViewLinkImpl)findViewLink("InvoiceTOInvoiceItemVL1");
    }
    
    /**
     * Setting Initial Bind Variables to EoPriceViewObject
     */
    public void setInitialBindVariables(){
        Integer slocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        //Integer userId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
        StringBuffer cldId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}"));
        StringBuffer orgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}"));
        StringBuffer hoOrgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}"));
        
        ViewObjectImpl impl = this.getMonthWiseInvoiceVo();
        impl.setNamedWhereClauseParam("SlocIdBind", slocId);
        impl.setNamedWhereClauseParam("CldIdBind", cldId.toString());
        impl.setNamedWhereClauseParam("OrgIdBind", orgId.toString());
        impl.setNamedWhereClauseParam("HoOrgIdBind", hoOrgId.toString());
        impl.setNamedWhereClauseParam("TxtMmBind", "0000");
        impl.executeQuery();
        
       /*  ViewObjectImpl aWiseInvoiceGraphVo = this.getCOAWiseInvoiceGraphVo();
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("NumBind", null);
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("CldIdBind", cldId.toString());
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("SlocIdBind", slocId);
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgId.toString());
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("OrgIdBind", orgId.toString());
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("YrBind", 2013);
        aWiseInvoiceGraphVo.setNamedWhereClauseParam("MonthBind", "NOVEMBER ");
        aWiseInvoiceGraphVo.executeQuery(); */

    }

    /**
     * Method set the selected finanical year as current financial year
     * @param fy
     */
    public void setFy(StringBuffer fy){
        if(!fy.toString().equals("")){
            ViewObjectImpl impl = this.getMonthWiseInvoiceVo();
            impl.setNamedWhereClauseParam("TxtMmBind", fy.toString());
            impl.executeQuery();    
        }else{
            ViewObjectImpl impl = this.getMonthWiseInvoiceVo();
            impl.setNamedWhereClauseParam("TxtMmBind", "0000");
            impl.executeQuery(); 
        }
        
    }
    
    /**
     * Container's getter for TempVo.
     * @return TempVo
     */
    public ViewObjectImpl getTempVo() {
        return (ViewObjectImpl)findViewObject("TempVo");
    }


    /**
     * Method to set rowNumber to Graph vo
     * @param rowNum
     */
    public void setRowNumber(Integer rowNum){
        System.out.println("NUmber :"+rowNum);
        if(rowNum == 0){
            ViewObjectImpl aWiseInvoiceGraphVo = this.getCOAWiseInvoiceGraphVo();
            System.out.println("ROW COUNT1 :"+aWiseInvoiceGraphVo.getRowCount());
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("RowNumBind", null);
            aWiseInvoiceGraphVo.executeQuery();
            System.out.println("ROW COUNT :"+aWiseInvoiceGraphVo.getRowCount());
        }else{
            
            ViewObjectImpl aWiseInvoiceGraphVo = this.getCOAWiseInvoiceGraphVo();
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("RowNumBind", null);
            aWiseInvoiceGraphVo.executeQuery();
            aWiseInvoiceGraphVo.reset();
            System.out.println("ROW COUNT2 :"+aWiseInvoiceGraphVo.getRowCount());
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("RowNumBind", rowNum);
            aWiseInvoiceGraphVo.executeQuery();
            System.out.println("ROW COUNT :"+aWiseInvoiceGraphVo.getRowCount());
        }
        
    }
   /**
     * Method to set bindVariables in Graph Vo
     * @param num
     */
    public void setValuesInGraphVo(Integer num){
        ViewObjectImpl impl = this.getMonthWiseInvoiceVo();
        Row currentRow = impl.getCurrentRow();
        if(currentRow != null){
            
            Integer slocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
            //Integer userId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
            StringBuffer cldId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}"));
            StringBuffer orgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}"));
            StringBuffer hoOrgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}"));
            
            String month = currentRow.getAttribute("InvMon").toString();
            String fyYr = currentRow.getAttribute("TxtMm").toString();
            System.out.println("Mon :"+month+" Fy :"+fyYr);
            ViewObjectImpl aWiseInvoiceGraphVo = this.getCOAWiseInvoiceGraphVo();
            if(num == 0){
                aWiseInvoiceGraphVo.setNamedWhereClauseParam("NumBind", null);
            }else{
                aWiseInvoiceGraphVo.setNamedWhereClauseParam("NumBind", num);
            }
            
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("CldIdBind", cldId.toString());
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("SlocIdBind", slocId);
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgId.toString());
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("OrgIdBind", orgId.toString());
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("YrBind", fyYr);
            aWiseInvoiceGraphVo.setNamedWhereClauseParam("MonthBind", month);
            aWiseInvoiceGraphVo.executeQuery();
        }
    }
    /**
     * Container's getter for COAWiseInvoiceGraphVo.
     * @return COAWiseInvoiceGraphVo
     */
    public ViewObjectImpl getCOAWiseInvoiceGraphVo() {
        return (ViewObjectImpl)findViewObject("COAWiseInvoiceGraphVo");
    }
    
    /* testing appp*/
}
