package mmpurorder.model.service.client;

import mmpurorder.model.service.common.PurOrderAM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Date;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 12 12:37:15 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PurOrderAMClient extends ApplicationModuleImpl implements PurOrderAM {
    /**
     * This is the default constructor (do not remove).
     */
    public PurOrderAMClient() {
    }


    public void CancelOrShortclosePo(String vis) {
        Object _ret = this.riInvokeExportedMethod(this,"CancelOrShortclosePo",new String [] {"java.lang.String"},new Object[] {vis});
        return;
    }

    public void addContainerDetails() {
        Object _ret = this.riInvokeExportedMethod(this,"addContainerDetails",null,null);
        return;
    }

    public void addPortsDetails(Integer trvlSeqNo) {
        Object _ret = this.riInvokeExportedMethod(this,"addPortsDetails",new String [] {"java.lang.Integer"},new Object[] {trvlSeqNo});
        return;
    }

    public String amendPo(String P_CLDID, String p_orgid, Integer p_slocid, String p_doc_id, String p_ref_doc_id,
                          Integer p_usr_id) {
        Object _ret =
            this.riInvokeExportedMethod(this,"amendPo",new String [] {"java.lang.String","java.lang.String","java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer"},new Object[] {P_CLDID, p_orgid, p_slocid, p_doc_id, p_ref_doc_id, p_usr_id});
        return (String)_ret;
    }

    public Integer checkOpenPurchaseDateValidity(Date opDate) {
        Object _ret =
            this.riInvokeExportedMethod(this,"checkOpenPurchaseDateValidity",new String [] {"oracle.jbo.domain.Date"},new Object[] {opDate});
        return (Integer)_ret;
    }

    public Integer checkOpenPurchaseValidity(String orgId, String cldId, Integer slocId, String refDocId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"checkOpenPurchaseValidity",new String [] {"java.lang.String","java.lang.String","java.lang.Integer","java.lang.String"},new Object[] {orgId, cldId, slocId, refDocId});
        return (Integer)_ret;
    }

    public void criteriaForSupplierList() {
        Object _ret = this.riInvokeExportedMethod(this,"criteriaForSupplierList",null,null);
        return;
    }

    public Integer getUsrLvl(Integer SlocId, String CldId, String OrgId, Integer usr_id, String WfNum,
                             String PoDocId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getUsrLvl",new String [] {"java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer","java.lang.String","java.lang.String"},new Object[] {SlocId, CldId, OrgId, usr_id, WfNum, PoDocId});
        return (Integer)_ret;
    }

    public String getWfNo(Integer sloc_id, String cld_id, String org_id, Integer doc_no) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getWfNo",new String [] {"java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer"},new Object[] {sloc_id, cld_id, org_id, doc_no});
        return (String)_ret;
    }

    public Integer insIntoTxn(Integer sloc_id, String cld_id, String pOrgId, Integer PO_DOC_NO, String WfNum,
                              String poDocId, Integer usr_idFrm, Integer usr_idTo, Integer levelTo, Integer levelFrm,
                              String action, String remark, oracle.jbo.domain.Number amount, String post) {
        Object _ret =
            this.riInvokeExportedMethod(this,"insIntoTxn",new String [] {"java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer","java.lang.Integer","java.lang.Integer","java.lang.Integer","java.lang.String","java.lang.String","oracle.jbo.domain.Number","java.lang.String"},new Object[] {sloc_id, cld_id, pOrgId, PO_DOC_NO, WfNum, poDocId, usr_idFrm, usr_idTo, levelTo, levelFrm, action, remark, amount, post});
        return (Integer)_ret;
    }

    public String isContainerNameDuplicate(String cntnrName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"isContainerNameDuplicate",new String [] {"java.lang.String"},new Object[] {cntnrName});
        return (String)_ret;
    }

    public String isPartNameDuplicate(String porName) {
        Object _ret = this.riInvokeExportedMethod(this,"isPartNameDuplicate",new String [] {"java.lang.String"},new Object[] {porName});
        return (String)_ret;
    }

    public Integer pendingPOCheck(Integer SlocId, String CldId, String OrgId, Integer PoDocNo) {
        Object _ret =
            this.riInvokeExportedMethod(this,"pendingPOCheck",new String [] {"java.lang.Integer","java.lang.String","java.lang.String","java.lang.Integer"},new Object[] {SlocId, CldId, OrgId, PoDocNo});
        return (Integer)_ret;
    }

    public void resetQuery() {
        Object _ret = this.riInvokeExportedMethod(this,"resetQuery",null,null);
        return;
    }

    public String resolvEl(String data) {
        Object _ret = this.riInvokeExportedMethod(this,"resolvEl",new String [] {"java.lang.String"},new Object[] {data});
        return (String)_ret;
    }

    public void saveAsPO() {
        Object _ret = this.riInvokeExportedMethod(this,"saveAsPO",null,null);
        return;
    }

    public void searchQuery(Integer SlocId, String OrgId, String DocId, String CldId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"searchQuery",new String [] {"java.lang.Integer","java.lang.String","java.lang.String","java.lang.String"},new Object[] {SlocId, OrgId, DocId, CldId});
        return;
    }
}
