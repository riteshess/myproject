package pendadvcust.model.module;

import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;

//import pendadvcust.model.module.common.PendCustAM;
import pendadvcust.model.views.PendingAdvanceCustVOImpl;
import pendadvcust.model.views.PendingAdvanceDetailVOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 26 12:24:44 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PendCustAMImpl extends ApplicationModuleImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public PendCustAMImpl() {
    }

    /**
     * Container's getter for PendingAdvanceCust1.
     * @return PendingAdvanceCust1
     */
    public PendingAdvanceCustVOImpl getPendingAdvanceCust1() {
        return (PendingAdvanceCustVOImpl)findViewObject("PendingAdvanceCust1");
    }

    /**
     * Container's getter for PendingAdvanceDetail1.
     * @return PendingAdvanceDetail1
     */
    public PendingAdvanceDetailVOImpl getPendingAdvanceDetail1() {
        return (PendingAdvanceDetailVOImpl)findViewObject("PendingAdvanceDetail1");
    }

    /**
     *
     * **/

    public void setGlobalParameters(String p_cld_id, Integer p_slc_id, String p_org_id, Integer p_coa_id,String p_ho_org_id) {

        System.out.println("p_cl_id " + p_cld_id + " p_slc_id " + p_slc_id + " p_org_id " + p_org_id + " p_coa_id " +
                           p_coa_id+" p_ho_org_id "+p_ho_org_id);

        this.setPendingAdvanceCustParameters(p_cld_id, p_slc_id, p_org_id, p_coa_id,p_ho_org_id);
        this.setPendingAdvanceDetailParameters(p_cld_id, p_slc_id, p_org_id, p_coa_id,p_ho_org_id);
        
    }

    /**
     *
     * **/

    public void setPendingAdvanceCustParameters(String p_cld_id, Integer p_slc_id, String p_org_id, Integer p_coa_id,String p_ho_org_id) {

        ViewObject vo = this.getPendingAdvanceCust1();
        vo.setNamedWhereClauseParam("BindCldId", p_cld_id);
        vo.setNamedWhereClauseParam("BindSlcId", p_slc_id);
        vo.setNamedWhereClauseParam("BindOrgId", p_org_id);
        vo.setNamedWhereClauseParam("BindHoOrgId", p_ho_org_id);
        vo.executeQuery();

        System.out.println("row count for getPendingAdvanceCust1 " + vo.getRowCount());
    }

    /**
     *
     * **/

    public void setPendingAdvanceDetailParameters(String p_cld_id, Integer p_slc_id, String p_org_id,
                                                  Integer p_coa_id,String p_ho_org_id) {

        ViewObject vo = this.getPendingAdvanceDetail1();
        vo.setNamedWhereClauseParam("BindCldId", p_cld_id);
        vo.setNamedWhereClauseParam("BindSlcId", p_slc_id);
        vo.setNamedWhereClauseParam("BindOrgId", p_org_id);
        vo.setNamedWhereClauseParam("BindHoOrgId", p_ho_org_id);
        vo.executeQuery();

        System.out.println("row count for getPendingAdvanceCust1 " + vo.getRowCount());

    }

}
