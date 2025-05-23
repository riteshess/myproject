package vendorpricelevel.model.services.client;

import java.util.ArrayList;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import vendorpricelevel.model.services.common.vendorpriceAM;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 15 11:24:06 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class vendorpriceAMClient extends ApplicationModuleImpl implements vendorpriceAM {
    /**
     * This is the default constructor (do not remove).
     */
    public vendorpriceAMClient() {
    }


    public ArrayList<String> getSuggestedItemDesc(String itmStr) {
        Object _ret = this.riInvokeExportedMethod(this, "getSuggestedItemDesc", new String[] { "java.lang.String" }, new Object[] {
                                                  itmStr });
        return (ArrayList<String>) _ret;
    }

    public void loadSupplierApplyBindVar(String hoOrgId, String cldId, Integer slocId, String orgId) {
        Object _ret = this.riInvokeExportedMethod(this, "loadSupplierApplyBindVar", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.Integer",
                                                  "java.lang.String"
        }, new Object[] { hoOrgId, cldId, slocId, orgId });
        return;
    }

    public void reset() {
        Object _ret = this.riInvokeExportedMethod(this, "reset", null, null);
        return;
    }

    public void search(String name) {
        Object _ret = this.riInvokeExportedMethod(this, "search", new String[] { "java.lang.String" }, new Object[] {
                                                  name });
        return;
    }
}
