package revenueprd.model.module.client;

import java.math.BigInteger;

import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.Date;

import revenueprd.model.module.common.RevenuePrdAM;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 19 18:09:12 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RevenuePrdAMClient extends ApplicationModuleImpl implements RevenuePrdAM {
    /**
     * This is the default constructor (do not remove).
     */
    public RevenuePrdAMClient() {
    }


    public void setGlobalParameters(String p_cld_id, String p_org_id, BigInteger p_coa_id, Date p_str_dt,
                                    Date p_end_dt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setGlobalParameters",new String [] {"java.lang.String","java.lang.String","java.math.BigInteger","oracle.jbo.domain.Date","oracle.jbo.domain.Date"},new Object[] {p_cld_id, p_org_id, p_coa_id, p_str_dt, p_end_dt});
        return;
    }

    public void setMstVoParameter() {
        Object _ret = this.riInvokeExportedMethod(this,"setMstVoParameter",null,null);
        return;
    }

    public void setRevenueMstParameters(String p_cld_id, String p_org_id, BigInteger p_coa_id, String p_coa_nm,
                                        Date p_str_dt, Date p_end_dt) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setRevenueMstParameters",new String [] {"java.lang.String","java.lang.String","java.math.BigInteger","java.lang.String","oracle.jbo.domain.Date","oracle.jbo.domain.Date"},new Object[] {p_cld_id, p_org_id, p_coa_id, p_coa_nm, p_str_dt, p_end_dt});
        return;
    }

    public void setRevenuePrdParameters(String p_cld_id, String p_org_id, BigInteger p_coa_id, Date p_str_dt,
                                        Date p_end_dt, String p_vou_id) {
        Object _ret =
            this.riInvokeExportedMethod(this,"setRevenuePrdParameters",new String [] {"java.lang.String","java.lang.String","java.math.BigInteger","oracle.jbo.domain.Date","oracle.jbo.domain.Date","java.lang.String"},new Object[] {p_cld_id, p_org_id, p_coa_id, p_str_dt, p_end_dt, p_vou_id});
        return;
    }
}
