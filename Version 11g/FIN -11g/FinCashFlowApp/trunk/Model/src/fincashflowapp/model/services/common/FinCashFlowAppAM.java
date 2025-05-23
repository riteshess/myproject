package fincashflowapp.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 08 12:06:50 IST 2013
// ---------------------------------------------------------------------
public interface FinCashFlowAppAM extends ApplicationModule {


    String getCurrRowAttribute(String voNm, String attrNm);

    void setParameters(String p_org_id, String p_cld_id, Integer p_fy_id, Integer p_coa_id, String p_qtr_id,
                       Integer p_mon_id);

    void setcashFlowGraph(String p_org_id, String p_cld_id, Integer p_fy_id, Integer p_coa_id, String p_qtr_id,
                          Integer p_mon_id);
}
