package slssalesordapp.model.views.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import slssalesordapp.model.views.common.ViewMmStkSummLotVO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Nov 15 16:48:30 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ViewMmStkSummLotVOClient extends ViewUsageImpl implements ViewMmStkSummLotVO {
    /**
     * This is the default constructor (do not remove).
     */
    public ViewMmStkSummLotVOClient() {
    }

    public oracle.jbo.domain.Number getTotalIssueQtyLot() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this,"getTotalIssueQtyLot",null,null);
        return (oracle.jbo.domain.Number)_ret;
    }
}
