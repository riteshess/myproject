package mnfjobcardapp.model.views;

import mnfjobcardapp.model.views.common.MnfJcOpItmLotVwVO;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 09 10:05:33 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfJcOpItmLotVwVOImpl extends ViewObjectImpl implements MnfJcOpItmLotVwVO {
    /**
     * This is the default constructor (do not remove).
     */
    public MnfJcOpItmLotVwVOImpl() {
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
         * Method to calculate total issued quantity
         */
        public Number getTotalIssueQtyLot() {
            int totalCount = this.getRowCount();

            this.setRangeSize(totalCount);
            Row[] rr = this.getAllRowsInRange();
            Number totIssue = new Number(0);
            Number zero = new Number(0);
            for (Row r : rr) {
                if (r.getAttribute("TransIssuQtyValue") != null) {
                    if (((Number) r.getAttribute("TransIssuQtyValue")).compareTo(zero) > 0) {
                        totIssue = totIssue.add((Number) r.getAttribute("TransIssuQtyValue"));
                    }
                }
            }
            return totIssue;
        }

    /**
     * Returns the bind variable value for BindStktype.
     * @return bind variable value for BindStktype
     */
    public String getBindStktype() {
        return (String) getNamedWhereClauseParam("BindStktype");
    }

    /**
     * Sets <code>value</code> for bind variable BindStktype.
     * @param value value to bind as BindStktype
     */
    public void setBindStktype(String value) {
        setNamedWhereClauseParam("BindStktype", value);
    }
}

