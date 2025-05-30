package mnfroutecard.model.views;

import mnfroutecard.model.views.common.MnfItmStkSrRqmtVwVO;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 13 12:06:15 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfItmStkSrRqmtVwVOImpl extends ViewObjectImpl implements MnfItmStkSrRqmtVwVO {
    /**
     * This is the default constructor (do not remove).
     */
    public MnfItmStkSrRqmtVwVOImpl() {
    }

    /**
     * Returns the bind variable value for BindCldId.
     * @return bind variable value for BindCldId
     */
    public String getBindCldId() {
        return (String) getNamedWhereClauseParam("BindCldId");
    }

    /**
     * Sets <code>value</code> for bind variable BindCldId.
     * @param value value to bind as BindCldId
     */
    public void setBindCldId(String value) {
        setNamedWhereClauseParam("BindCldId", value);
    }

    /**
     * Returns the bind variable value for BindSlocId.
     * @return bind variable value for BindSlocId
     */
    public Integer getBindSlocId() {
        return (Integer) getNamedWhereClauseParam("BindSlocId");
    }

    /**
     * Sets <code>value</code> for bind variable BindSlocId.
     * @param value value to bind as BindSlocId
     */
    public void setBindSlocId(Integer value) {
        setNamedWhereClauseParam("BindSlocId", value);
    }

    /**
     * Returns the bind variable value for BindOrgId.
     * @return bind variable value for BindOrgId
     */
    public String getBindOrgId() {
        return (String) getNamedWhereClauseParam("BindOrgId");
    }

    /**
     * Sets <code>value</code> for bind variable BindOrgId.
     * @param value value to bind as BindOrgId
     */
    public void setBindOrgId(String value) {
        setNamedWhereClauseParam("BindOrgId", value);
    }

    /**
     * Returns the bind variable value for BindItmId.
     * @return bind variable value for BindItmId
     */
    public String getBindItmId() {
        return (String) getNamedWhereClauseParam("BindItmId");
    }

    /**
     * Sets <code>value</code> for bind variable BindItmId.
     * @param value value to bind as BindItmId
     */
    public void setBindItmId(String value) {
        setNamedWhereClauseParam("BindItmId", value);
    }

    /**
     * Returns the bind variable value for BindWhId.
     * @return bind variable value for BindWhId
     */
    public String getBindWhId() {
        return (String) getNamedWhereClauseParam("BindWhId");
    }

    /**
     * Sets <code>value</code> for bind variable BindWhId.
     * @param value value to bind as BindWhId
     */
    public void setBindWhId(String value) {
        setNamedWhereClauseParam("BindWhId", value);
    }

    /**
     * Returns the bind variable value for BindReqArId.
     * @return bind variable value for BindReqArId
     */
    public Integer getBindReqArId() {
        return (Integer) getNamedWhereClauseParam("BindReqArId");
    }

    /**
     * Sets <code>value</code> for bind variable BindReqArId.
     * @param value value to bind as BindReqArId
     */
    public void setBindReqArId(Integer value) {
        setNamedWhereClauseParam("BindReqArId", value);
    }
    
    /**
     * Count no of Check boxes which were selected on popup
     * @return
     */
    public Number getTotalIssueQtySr_SF() {
        int totalCount = this.getRowCount();
        this.setRangeSize(totalCount);
        Row[] rr = this.getAllRowsInRange();
        Number totIssue = new Number(0);
        for (Row r : rr) {
            if (r.getAttribute("SelectSrNoStkTrans_SF") != null) {
                if ("Y".equalsIgnoreCase(r.getAttribute("SelectSrNoStkTrans_SF").toString())) {
                    totIssue = totIssue.add(new Number(1));
                }
            }
        }
        return totIssue;
    }
}

