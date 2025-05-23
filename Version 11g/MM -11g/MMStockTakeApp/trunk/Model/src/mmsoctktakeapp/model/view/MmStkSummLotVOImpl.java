package mmsoctktakeapp.model.view;

import java.sql.ResultSet;

import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 07 18:59:24 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmStkSummLotVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MmStkSummLotVOImpl() {
    }

    /**
     * Returns the variable value for CldBind.
     * @return variable value for CldBind
     */
    public String getCldBind() {
        return (String)ensureVariableManager().getVariableValue("CldBind");
    }

    /**
     * Sets <code>value</code> for variable CldBind.
     * @param value value to bind as CldBind
     */
    public void setCldBind(String value) {
        ensureVariableManager().setVariableValue("CldBind", value);
    }

    /**
     * Returns the variable value for SlocBind.
     * @return variable value for SlocBind
     */
    public Integer getSlocBind() {
        return (Integer)ensureVariableManager().getVariableValue("SlocBind");
    }

    /**
     * Sets <code>value</code> for variable SlocBind.
     * @param value value to bind as SlocBind
     */
    public void setSlocBind(Integer value) {
        ensureVariableManager().setVariableValue("SlocBind", value);
    }

    /**
     * Returns the variable value for OrgBind.
     * @return variable value for OrgBind
     */
    public String getOrgBind() {
        return (String)ensureVariableManager().getVariableValue("OrgBind");
    }

    /**
     * Sets <code>value</code> for variable OrgBind.
     * @param value value to bind as OrgBind
     */
    public void setOrgBind(String value) {
        ensureVariableManager().setVariableValue("OrgBind", value);
    }

    /**
     * Returns the variable value for WhBind.
     * @return variable value for WhBind
     */
    public String getWhBind() {
        return (String)ensureVariableManager().getVariableValue("WhBind");
    }

    /**
     * Sets <code>value</code> for variable WhBind.
     * @param value value to bind as WhBind
     */
    public void setWhBind(String value) {
        ensureVariableManager().setVariableValue("WhBind", value);
    }


    /**
     * Returns the variable value for ItmBind.
     * @return variable value for ItmBind
     */
    public String getItmBind() {
        return (String)ensureVariableManager().getVariableValue("ItmBind");
    }

    /**
     * Sets <code>value</code> for variable ItmBind.
     * @param value value to bind as ItmBind
     */
    public void setItmBind(String value) {
        ensureVariableManager().setVariableValue("ItmBind", value);
    }

    /**
     * executeQueryForCollection - overridden for custom java data source support.
     */
    protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
        super.executeQueryForCollection(qc, params, noUserParams);
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }
}
