package slsprofilesetupapp.model.service.client;

import java.util.ArrayList;

import java.util.Iterator;

import oracle.jbo.client.remote.ApplicationModuleImpl;

import slsprofilesetupapp.model.sequence.DiscPlcItm;
import slsprofilesetupapp.model.service.common.SlsProfileSetupAppAM;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 24 17:39:04 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsProfileSetupAppAMClient extends ApplicationModuleImpl implements SlsProfileSetupAppAM {
    /**
     * This is the default constructor (do not remove).
     */
    public SlsProfileSetupAppAMClient() {
    }


    public Boolean checkDuplicateEntry() {
        Object _ret = this.riInvokeExportedMethod(this, "checkDuplicateEntry", null, null);
        return (Boolean) _ret;
    }


    public void setDiscountPolicyDataOnSave(Iterator<DiscPlcItm> list) {
        Object _ret = this.riInvokeExportedMethod(this, "setDiscountPolicyDataOnSave", new String[] {
                                                  "java.util.Iterator<slsprofilesetupapp.model.sequence.DiscPlcItm>" }, new Object[] {
                                                  list });
        return;
    }


    public Integer addCoaToProfile() {
        Object _ret = this.riInvokeExportedMethod(this, "addCoaToProfile", null, null);
        return (Integer) _ret;
    }

    public boolean areValidationsOk() {
        Object _ret = this.riInvokeExportedMethod(this, "areValidationsOk", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public Boolean areValidationsValid() {
        Object _ret = this.riInvokeExportedMethod(this, "areValidationsValid", null, null);
        return (Boolean) _ret;
    }

    public Integer createNewSlsPrf() {
        Object _ret = this.riInvokeExportedMethod(this, "createNewSlsPrf", null, null);
        return (Integer) _ret;
    }

    public ArrayList<DiscPlcItm> getDiscountPolicySeq() {
        Object _ret = this.riInvokeExportedMethod(this, "getDiscountPolicySeq", null, null);
        return (ArrayList<DiscPlcItm>) _ret;
    }

    public void getResetSearchByOrg(String organisation) {
        Object _ret = this.riInvokeExportedMethod(this, "getResetSearchByOrg", new String[] { "java.lang.String" }, new Object[] {
                                                  organisation });
        return;
    }

    public void getSearchByOrg(String organisation) {
        Object _ret = this.riInvokeExportedMethod(this, "getSearchByOrg", new String[] { "java.lang.String" }, new Object[] {
                                                  organisation });
        return;
    }

    public void populateDiscountPlcDataOnAdd() {
        Object _ret = this.riInvokeExportedMethod(this, "populateDiscountPlcDataOnAdd", null, null);
        return;
    }

    public void removeAllfromOrgSLSCoa() {
        Object _ret = this.riInvokeExportedMethod(this, "removeAllfromOrgSLSCoa", null, null);
        return;
    }

    public void removeDiscPolySeq() {
        Object _ret = this.riInvokeExportedMethod(this, "removeDiscPolySeq", null, null);
        return;
    }

    public void setDiscountPolicyDataOnSave(ArrayList list) {
        Object _ret = this.riInvokeExportedMethod(this, "setDiscountPolicyDataOnSave", new String[] {
                                                  "java.util.ArrayList" }, new Object[] { list });
        return;
    }

    public void setUserIdCreateOnsaveVlick() {
        Object _ret = this.riInvokeExportedMethod(this, "setUserIdCreateOnsaveVlick", null, null);
        return;
    }
}
