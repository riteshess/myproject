package applicationentities.model.service;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 30 12:40:33 IST 2011
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlblEntAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public GlblEntAMImpl() {
    }

    /**
     * Container's getter for AppDsEnt1.
     * @return AppDsEnt1
     */
    public ViewObjectImpl getAppDsEnt1() {
        return (ViewObjectImpl)findViewObject("AppDsEnt1");
    }

    /**
     * Container's getter for AppDsEntComp1.
     * @return AppDsEntComp1
     */
    public ViewObjectImpl getAppDsEntComp1() {
        return (ViewObjectImpl)findViewObject("AppDsEntComp1");
    }

    /**
     * Container's getter for AppDsEnt2.
     * @return AppDsEnt2
     */
    public ViewObjectImpl getAppDsEnt2() {
        return (ViewObjectImpl)findViewObject("AppDsEnt2");
    }

    /**
     * Container's getter for AppDsEntComp2.
     * @return AppDsEntComp2
     */
    public ViewObjectImpl getAppDsEntComp2() {
        return (ViewObjectImpl)findViewObject("AppDsEntComp2");
    }

    /**
     * Container's getter for FkAppDsEntCompVL1.
     * @return FkAppDsEntCompVL1
     */
    public ViewLinkImpl getFkAppDsEntCompVL1() {
        return (ViewLinkImpl)findViewLink("FkAppDsEntCompVL1");
    }

    /**
     * Container's getter for AppGlblPrf1.
     * @return AppGlblPrf1
     */
    public ViewObjectImpl getAppGlblPrf1() {
        return (ViewObjectImpl)findViewObject("AppGlblPrf1");
    }
}
