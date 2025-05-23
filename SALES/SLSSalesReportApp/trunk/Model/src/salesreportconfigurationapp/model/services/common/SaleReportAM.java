package salesreportconfigurationapp.model.services.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.domain.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 18 12:41:06 IST 2014
// ---------------------------------------------------------------------
public interface SaleReportAM extends ApplicationModule {
    void resetAction();

    String getTabLovFlag(String param);

    Timestamp getDocDateValue(String param);

    StringBuffer SalesInvoiceDocIdFromDispId(StringBuffer dispId);

    String resolvEl(String data);

    void addpartialattributeNamAm();

    void dateSet();

    void setLabel();
}

