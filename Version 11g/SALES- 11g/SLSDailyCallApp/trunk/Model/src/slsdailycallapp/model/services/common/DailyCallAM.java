package slsdailycallapp.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 13 02:04:57 PDT 2014
// ---------------------------------------------------------------------
public interface DailyCallAM extends ApplicationModule {
    void filterDetailPageWithSelectedDocId();

    void setInitialParams();

    void reset();

    void search();

    void executeStage();

    Boolean generateAndSetStage();

    void filterStageWithInitialParameters();

    boolean isDataValid();

    Boolean saveAction();

    boolean EoIdCheck();

    void setEoId();

    int checkDuplicateStageName(String param);


    void generateDcId(StringBuffer DocId);

    String getCldId();

    Integer getCurrDigit();

    String getHoOrgId();

    String getOrgId();

    Integer getSlocId();

    Integer getUserId();

    Integer insertEoName();

    void setReturnAddressValues(String adds_Id_value, String address_value);
}
