package externalentityprofilesetup.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 31 14:43:55 IST 2013
// ---------------------------------------------------------------------
public interface ExternalEntityProfileSetupAM extends ApplicationModule {
    void searchSupplier();

    void chkDuplicatePrf(String eeTyp);


    String getEeBhavVal();

    void setLen(Integer LegCodeLen, Integer AliasLen);

    String isChildRecordExist();
}
