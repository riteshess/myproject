package finBudget.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 05 11:10:35 IST 2013
// ---------------------------------------------------------------------
public interface FinBudgetAM extends ApplicationModule {
    void setBindVar(String cldId, String hoOrgId, String orgId, Integer slocId);

    void exceptionHandler();

    void setBindVar(Integer coaId, Integer fyId, String cldId, String hoOrgId, String orgId, Integer slocId);

    Integer on_load_page();
}
