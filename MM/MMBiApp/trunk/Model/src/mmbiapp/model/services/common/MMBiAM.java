package mmbiapp.model.services.common;

import oracle.jbo.ApplicationModule;
import oracle.jbo.RowSetIterator;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 05 15:00:46 IST 2014
// ---------------------------------------------------------------------
public interface MMBiAM extends ApplicationModule {
    void executeAllVos();

    String getOrgIdOnOrgNm(StringBuffer arg);

    void executeTopNProductGrpVO(Integer val, StringBuffer clause);

    void executeTopNProductsVO(Integer val, StringBuffer clause);

    void executeTopNSupplierVO(Integer val, StringBuffer clause);

    void executeTopNProductBelowReoderLvlVO(Integer val, StringBuffer clause);

    void executeTopNProductBelowSaftyLvlVO(Integer val, StringBuffer clause);

    void filterAllViewObjects(Integer id, StringBuffer clause);

    void executeInitParamsForOneSupplier(Integer id, StringBuffer clause);

    void executeParamsForOneSupplier(Integer id, StringBuffer clause, Integer eoId);

    void executeTopNProductGrpForOneSupplierVO(Integer val, StringBuffer clause);

    void executeTopNProductsForOneSupplierVO(Integer val, StringBuffer clause);

    void executeTopNPOForOneSupplierVO(Integer eoId, Integer val, StringBuffer clause);

    void executeAllVOBeforeEnteringSupplierDetailsPage();

    void executeTopNProductGrpForOneSupplierVO(Integer eoId);

    void executeTopNSupplierRatingVO(Integer val, StringBuffer clause);

    void executeParamsForOneProduct(Integer id, StringBuffer clause, Integer eoId, StringBuffer ItemId);

    void executeAllVOBeforeEnteringProductDetailsPage();

    void executingTopOrganisationsVO(Integer val);

    void filterMisLov(Integer typId);

    RowSetIterator getTopNOrgRows();
}
