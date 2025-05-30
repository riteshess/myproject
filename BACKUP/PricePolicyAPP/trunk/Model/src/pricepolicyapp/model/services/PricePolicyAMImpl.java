package pricepolicyapp.model.services;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import java.util.ArrayList;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import oracle.jbo.server.ViewObjectImpl;

import pricepolicyapp.model.services.common.PricePolicyAM;
import pricepolicyapp.model.views.AppEoPricePlcVOImpl;
import pricepolicyapp.model.views.AppPricePlcVOImpl;
import pricepolicyapp.model.views.LOVPlcTypeVOImpl;
import pricepolicyapp.model.views.LOVSupplierVOImpl;
import pricepolicyapp.model.views.LOVWtgAttVOImpl;
import pricepolicyapp.model.views.LovSupplierOnlyViewVOImpl;
import pricepolicyapp.model.views.PrcPolicySrchVOImpl;
import pricepolicyapp.model.views.SearchPricePolicyVOImpl;
import pricepolicyapp.model.views.SearchTransVOImpl;

// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 03 06:10:51 PDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PricePolicyAMImpl extends ApplicationModuleImpl implements PricePolicyAM {
    /**
     * This is the default constructor (do not remove).
     */
    public PricePolicyAMImpl() {
    }
 public static ADFLogger adf_info=(ADFLogger)ADFLogger.createADFLogger(PricePolicyAMImpl.class);
    String cldid=resolvEl1("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
    Integer slocid=Integer.parseInt(resolvEl1("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
    String orgid=resolvEl1("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
    String hoOrgid=resolvEl1("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
    /**
     * Container's getter for AppPricePlc.
     * @return AppPricePlc
     */
    public AppPricePlcVOImpl getAppPricePlc() {
        return (AppPricePlcVOImpl)findViewObject("AppPricePlc");
    }

    /**
     * Container's getter for LOVPlcType.
     * @return LOVPlcType
     */
    public LOVPlcTypeVOImpl getLOVPlcType() {
        return (LOVPlcTypeVOImpl)findViewObject("LOVPlcType");
    }

    /**
     * Container's getter for LOVWtgAtt.
     * @return LOVWtgAtt
     */
    public LOVWtgAttVOImpl getLOVWtgAtt() {
        return (LOVWtgAttVOImpl)findViewObject("LOVWtgAtt");
    }
    public String setinacivedt(){
        getAppPricePlc().getCurrentRow().setAttribute("InactvDt", new Timestamp(System.currentTimeMillis()));
            return null;
    }
    public void priceId(){
        String cldid=resolvEl1("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        Integer slocid=Integer.parseInt(resolvEl1("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        Integer userid = Integer.parseInt(resolvEl1("#{pageFlowScope.GLBL_APP_USR}").toString());
        String orgid=resolvEl1("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        String hoOrgid=resolvEl1("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        String plcId1 = (String)callStoredFunction(Types.VARCHAR, "FN_APP_GEN_ID(?,?,?,?,?)", new Object[] {slocid,cldid,hoOrgid,orgid,"APP$PRICE$PLC"});
    //    System.out.println("plcId generated is "+plcId1);
        if(plcId1!=null){
        
        // System.out.println("without null plz id is-------"+plcId1);
            getAppPricePlc().getCurrentRow().setAttribute("PlcId", plcId1);
        }
        
    }
    
    public String insertSupplier(Integer supplierId){
        if(supplierId!=null){
            Row CreateRow=this.getAppEoPricePlc1().createRow();
            CreateRow.setAttribute("EoId", supplierId);
        }
        return "";
    }
    public String resolvEl1(String data) {
            FacesContext fc = FacesContext.getCurrentInstance();
            Application app = fc.getApplication();
            ExpressionFactory elFactory = app.getExpressionFactory();
            ELContext elContext = fc.getELContext();
            ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
            String Message = valueExp.getValue(elContext).toString();
            return Message;
        }
    
    
    public String priceNameValid(String Name){
        String flag="Y";
        String hoOrgid=resolvEl1("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        RowSetIterator prcPolicy = this.getAppPricePlc().createRowSetIterator(null);
                  Row currentRow=this.getAppPricePlc().getCurrentRow();
                   while(prcPolicy.hasNext()){
                           Row r1 = prcPolicy.next();
                          if(r1!=currentRow){
                              String hoorg_id=r1.getAttribute("HoOrgId").toString();
                              String plcName=r1.getAttribute("PlcNm").toString();
                                  if(hoOrgid.equals(hoorg_id) && Name.equalsIgnoreCase(plcName)) {
                                      flag="N";
                                  }
                           }
                       }
        prcPolicy.closeRowSetIterator();
       // System.out.println("function serialize"+flag);
       return flag;
    }
    
    public String applyCriteria(String CldId,String hoOrgId,Integer SlocId,String plcId){
        ViewObjectImpl vo = this.getAppPricePlc();
                /* ViewCriteria vc = vo.getViewCriteria("AppPricePlcVOCriteria");
                vo.applyViewCriteria(vc); */
                  vo.setNamedWhereClauseParam("cldIdBind", CldId);
                  vo.setNamedWhereClauseParam("slocIdBind",SlocId);
                  vo.setNamedWhereClauseParam("hoOrgIdBind", hoOrgId);
                  vo.setNamedWhereClauseParam("plcIdBind", plcId);
                  vo.executeQuery();

        return "";
    }
    public String addSupplier(){
        String cldid=resolvEl1("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        Integer slocid=Integer.parseInt(resolvEl1("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        Integer userid = Integer.parseInt(resolvEl1("#{pageFlowScope.GLBL_APP_USR}").toString());
        String hoOrgid=resolvEl1("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        Row priceCurr=this.getAppPricePlc().getCurrentRow();
        if(priceCurr!=null){
          
        String plcId=priceCurr.getAttribute("PlcId").toString();
        
        Integer EoId = (Integer)priceCurr.getAttribute("EoIdTrans");
        if(EoId!=null){
            Row crtRow=this.getAppEoPricePlc1().createRow();
            crtRow.setAttribute("EoId", EoId);
            crtRow.setAttribute("UsrIdCreate", userid);
            crtRow.setAttribute("UsrIdCreateDt", new Timestamp(System.currentTimeMillis()));
            crtRow.setAttribute("StrtDt", new Timestamp(System.currentTimeMillis()));
            priceCurr.setAttribute("EoNmTrans", null);
            getAppEoPricePlc1().insertRow(crtRow);
            //System.out.println("value after set eoId"+crtRow.getAttribute("EoId")+crtRow.getAttribute("PlcId"));
        }
        }
        return null;
    }
    
    public String chkEoAvailable(){
      //  String flag=null;
        String plcId="Y";
        Row r1=this.getAppPricePlc().getCurrentRow();
        if(r1.getAttribute("EoIdTrans")!=null){
         Integer eoId=Integer.parseInt(r1.getAttribute("EoIdTrans").toString());
        ViewObjectImpl eoplc=this.getChkAppEoPricePlc();
        eoplc.setNamedWhereClauseParam("bindCldId", cldid);
        eoplc.setNamedWhereClauseParam("bindSlocId", slocid);
        eoplc.setNamedWhereClauseParam("bindHoOrgId", hoOrgid);
        //eoplc.setNamedWhereClauseParam("bindEoId", eoId);
        eoplc.executeQuery();
        adf_info.info("Eo name is found "+eoId);
        
        Row [] rows1=eoplc.getFilteredRows("EoId", eoId);
        adf_info.info("rows1--------------"+rows1.length);
      //  System.out.println("  "+rows1.length);
        ArrayList ar=new ArrayList();
        if(rows1.length>0){
            for(Row r: rows1){
               // System.out.println(r.getAttribute("EndDt"));
            if(r.getAttribute("EndDt")!=null){
            }else{
                
                ar.add(r.getAttribute("PlcId"));
                //plcId=r.getAttribute("PlcId").toString();
                //return plcId;
            }
            }
            if(ar.isEmpty()){
                
            }else{
                plcId=ar.toString();
            }
        }
        }
        return plcId;
    }
    public void searchPolicy(){
                ViewObjectImpl vo = this.getSearchPricePolicyVO();
                ViewObjectImpl transVo = this.getSearchTrans1();
                Row currR = transVo.getCurrentRow();
           /*      ViewCriteria vc = vo.getViewCriteria("SearchPricePolicyVOCriteria");
                vo.applyViewCriteria(vc); */
                vo.setNamedWhereClauseParam("PlcNmBind", currR.getAttribute("PlcNm"));
                vo.setNamedWhereClauseParam("SlocIdBind",currR.getAttribute("SlocIdTrans"));
                vo.setNamedWhereClauseParam("HoOrgIdBind", currR.getAttribute("HoOrgIdTrand"));
                vo.setNamedWhereClauseParam("CldIdBind", currR.getAttribute("CldIdTrans"));
                vo.executeQuery();
    }
    public void resetPolicy(){
                ViewObjectImpl vo = this.getSearchPricePolicyVO();
                ViewObjectImpl transVo = this.getSearchTrans1();
                Row currR = transVo.getCurrentRow();
              /*   ViewCriteria vc = vo.getViewCriteria("SearchPricePolicyVOCriteria");
                
                vo.applyViewCriteria(vc); */
                vo.setNamedWhereClauseParam("PlcNmBind", null);
                vo.setNamedWhereClauseParam("SlocIdBind",-1);
                vo.setNamedWhereClauseParam("HoOrgIdBind", currR.getAttribute("HoOrgIdTrand"));
                vo.setNamedWhereClauseParam("CldIdBind", currR.getAttribute("CldIdTrans"));
                vo.executeQuery();
    }
    public void strartReset(){
        ViewObjectImpl vo = this.getSearchPricePolicyVO();
       
       /*  ViewCriteria vc = vo.getViewCriteria("SearchPricePolicyVOCriteria1");
        
           vo.applyViewCriteria(vc); */
          
           vo.setNamedWhereClauseParam("SlocIdBind",1);
           vo.setNamedWhereClauseParam("HoOrgIdBind", "01");
           vo.setNamedWhereClauseParam("CldIdBind", "-1");
           vo.executeQuery();
           
    }
    public String supplierNameValid(String suppName){
        String flag="Y";
        Row curr=this.getAppPricePlc().getCurrentRow();
      //  System.out.println("supplier name is"+suppName);
        ViewObjectImpl suppvo=this.getLOVSupplier();
        suppvo.setNamedWhereClauseParam("SlocIdBind", slocid);
        suppvo.setNamedWhereClauseParam("OrgIdBind", orgid);
        suppvo.setNamedWhereClauseParam("CldIdBind", cldid);
        suppvo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgid);
        suppvo.setNamedWhereClauseParam("BindEoNm", suppName);
        if(curr.getAttribute("ApplyInPo")!=null && (curr.getAttribute("ApplyInPo").toString()).equalsIgnoreCase("Y")){
        suppvo.setNamedWhereClauseParam("BindSupp", 69);
        }
        if(curr.getAttribute("ApplyInSo")!=null && (curr.getAttribute("ApplyInSo").toString()).equalsIgnoreCase("Y")){
        suppvo.setNamedWhereClauseParam("BindCust", 68);
        }
         
        suppvo.executeQuery();
         Row [] filterrows=suppvo.getFilteredRows("EoNm", suppName);
        suppvo.setNamedWhereClauseParam("BindEoNm", null);
        suppvo.executeQuery();  
      //  System.out.println("row found in "+suppvo.getRowCount());
       // Row [] filterrows=suppvo.getAllRowsInRange();
      //  System.out.println("lov supplier name get is "+filterrows.length);
        Integer suppId=null;
        
        
        if(filterrows.length>0){
            suppId = (Integer)filterrows[0].getAttribute("EoId");
        }
        else {
            flag="N";
                return flag;
        }
   // System.out.println(suppId);
    
   /*  Row [] filterrow=getAppEoPricePlc().getFilteredRows("EoId", suppId);
    if(filterrow.length>0){
        System.out.println(filterrow.length);
        flag="N";
    }  */
      //  System.out.println("supplier id is "+suppId);
        ViewObjectImpl eopricevo=this.getAppEoPricePlc1();
        eopricevo.setNamedWhereClauseParam("CldIdBind", cldid);
        eopricevo.setNamedWhereClauseParam("SlocIdBind", slocid);
        eopricevo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgid);
        eopricevo.executeQuery();
        Row [] filterrow2=eopricevo.getFilteredRows("EoId", suppId);
        if(filterrow2.length>0){
           // System.out.println("in eoprice1 "+filterrow2.length);
            flag="N";
        } 
  // System.out.println("filter row length"+filterrow2.length);   
      /*   RowSetIterator prcPolicy = this.getAppEoPricePlc1().createRowSetIterator(null);
                  Row currentRow=this.getAppEoPricePlc1().getCurrentRow();
                   while(prcPolicy.hasNext()){
                           Row r1 = prcPolicy.next();
                          if(r1!=currentRow){
                              String eoId=r1.getAttribute("EoId").toString();
                                  if(suppId.equalsIgnoreCase(eoId)) {
                                      flag="N";
                                  }
                           }
                       }
                prcPolicy.closeRowSetIterator(); */
            //    System.out.println("function supplier serialize"+flag); 
        return flag;
    }

    public String delSupplier(){
    Row r=this.getAppEoPricePlc1().getCurrentRow();
    if(r!=null){
        Integer eoId=null;
        if(r.getAttribute("EoId")!=null)
         eoId = (Integer)r.getAttribute("EoId");
        r.setAttribute("EndDt",new Timestamp(System.currentTimeMillis()));
       // System.out.println("Supplier="+r.getAttribute("EoId"));
        r.setAttribute("EoId", eoId);
      //  r.remove();
    }
       // getAppEoPricePlc().executeQuery();
     //   getAppEoPricePlc1().executeQuery();
      //  getAppEoPricePlc1().setWhereClause("eo_id not in(select eo_id from APP$EO$PRICE$PLC where End_Dt is not null)");
      //  getAppEoPricePlc1().executeQuery();
     //   System.out.println("Estimated after="+getAppEoPricePlc1().getEstimatedRowCount());
     //   Row currentRow = getAppEoPricePlc1().getCurrentRow();
       // System.out.println("Current Rowky="+currentRow.getAttribute("EndDt"));
        
        return null;
    }
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
            CallableStatement st = null;
            try {
                
                st = getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
                st.registerOutParameter(1, sqlReturnType);
                if (bindVars != null) {
                    for (int z = 0; z < bindVars.length; z++) {
                        st.setObject(z + 2, bindVars[z]);
                       // System.out.println(bindVars[z] + "z");
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
                        e.printStackTrace();
                    }
                }
            }
        }


    public String chkEditables(){
        String flag=null;
        Row r=this.getAppPricePlc().getCurrentRow();
        if(r!=null){
            String plcId=r.getAttribute("PlcId").toString();
        String pochk = (String)callStoredFunction(Types.VARCHAR, "FN_IS_PRICE_PLC_USED(?,?,?,?,?)", new Object[] {cldid,slocid,orgid,plcId,"PO"});
            if(pochk!=null){
                r.setAttribute("TransChkPo", pochk);
            }
            String soChk = (String)callStoredFunction(Types.VARCHAR, "FN_IS_PRICE_PLC_USED(?,?,?,?,?)", new Object[] {cldid,slocid,orgid,plcId,"SO"});
            if(soChk!=null){
                r.setAttribute("TransChkSo", soChk);
            }
        }
        return flag;
    }
    
    public String setEndDate(){
        Row r1=this.getAppPricePlc().getCurrentRow();
        if(r1.getAttribute("EoIdTrans")!=null){
         Integer eoId=Integer.parseInt(r1.getAttribute("EoIdTrans").toString());
        ViewObjectImpl eoplc=this.getAppEoPricePlc();
        eoplc.setNamedWhereClauseParam("CldIdBind", cldid);
        eoplc.setNamedWhereClauseParam("SlocIdBind", slocid);
        eoplc.setNamedWhereClauseParam("HoOrgIdBind", hoOrgid);
       //eoplc.setNamedWhereClauseParam("bindEoId", eoId);
        eoplc.executeQuery();
      Row [] rows1=eoplc.getFilteredRows("EoId",eoId);
       // Row [] rows1=eoplc.getAllRowsInRange();
       adf_info.info("rows1  0-------"+rows1.length);
        if(rows1.length>0){
            for(Row r: rows1){
                r.setAttribute("EndDt", new Timestamp(System.currentTimeMillis()));
            }
        }
        }
    
        
        return null;
    }
    
    /**
     * Container's getter for AppEoPricePlc.
     * @return AppEoPricePlc
     */
    public AppEoPricePlcVOImpl getAppEoPricePlc() {
        return (AppEoPricePlcVOImpl)findViewObject("AppEoPricePlc");
    }


    /**
     * Container's getter for AppEoPricePlc1.
     * @return AppEoPricePlc1
     */
    public AppEoPricePlcVOImpl getAppEoPricePlc1() {
        return (AppEoPricePlcVOImpl)findViewObject("AppEoPricePlc1");
    }

    /**
     * Container's getter for PricePolicytoEOPricePLCVL1.
     * @return PricePolicytoEOPricePLCVL1
     */
    public ViewLinkImpl getPricePolicytoEOPricePLCVL1() {
        return (ViewLinkImpl)findViewLink("PricePolicytoEOPricePLCVL1");
    }

    /**
     * Container's getter for LOVSupplier.
     * @return LOVSupplier
     */
    public LOVSupplierVOImpl getLOVSupplier() {
        return (LOVSupplierVOImpl)findViewObject("LOVSupplier");
    }

    /**
     * Container's getter for SearchTrans1.
     * @return SearchTrans1
     */
    public SearchTransVOImpl getSearchTrans1() {
        return (SearchTransVOImpl)findViewObject("SearchTrans1");
    }

    /**
     * Container's getter for PrcPolicySrch.
     * @return PrcPolicySrch
     */
    public PrcPolicySrchVOImpl getPrcPolicySrch() {
        return (PrcPolicySrchVOImpl)findViewObject("PrcPolicySrch");
    }

    /**
     * Container's getter for SearchPricePolicyVO.
     * @return SearchPricePolicyVO
     */
    public SearchPricePolicyVOImpl getSearchPricePolicyVO() {
        return (SearchPricePolicyVOImpl)findViewObject("SearchPricePolicyVO");
    }

    /**
     * Container's getter for LovSupplierOnlyView.
     * @return LovSupplierOnlyView
     */
    public LovSupplierOnlyViewVOImpl getLovSupplierOnlyView() {
        return (LovSupplierOnlyViewVOImpl)findViewObject("LovSupplierOnlyView");
    }
    public void setBindVar() {
        ViewObjectImpl prcvo=this.getPrcPolicySrch();
        prcvo.setNamedWhereClauseParam("CldIdBind", cldid);
        prcvo.setNamedWhereClauseParam("SlocIdBind", slocid);
        prcvo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgid);
        prcvo.executeQuery();
        ViewObjectImpl eopricevo=this.getAppEoPricePlc1();
        eopricevo.setNamedWhereClauseParam("CldIdBind", cldid);
        eopricevo.setNamedWhereClauseParam("SlocIdBind", slocid);
        eopricevo.setNamedWhereClauseParam("HoOrgIdBind", hoOrgid);
        eopricevo.executeQuery();
        
    }

    /**
     * Container's getter for ChkAppEoPricePlc.
     * @return ChkAppEoPricePlc
     */
    public ViewObjectImpl getChkAppEoPricePlc() {
        return (ViewObjectImpl)findViewObject("ChkAppEoPricePlc");
    }
}
