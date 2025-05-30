package miscategory.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 25 11:20:38 IST 2013
// ---------------------------------------------------------------------
public interface MisCategoryAM extends ApplicationModule {
    void setParameters(String p_org_id, String p_cld_id, String p_ho_org_id);

    void setParametersOfCoaCog(String p_cld_id, String p_org_id, String p_coa_cog_id, int p_coa_id);

    void resetCriteria();

    void searchCriteria(String coaName);

    void setParametersOfCoaCog1(String p_cld_id, String p_org_id, String p_coa_cog_id, int p_coa_id, int p_fy_id);
}
