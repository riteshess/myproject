package mnfRoutingApp.model.views;

import java.sql.ResultSet;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 02 17:06:55 PDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DualForSearchVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DualForSearchVOImpl() {
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
     * Returns the bind variable value for BindSlcId.
     * @return bind variable value for BindSlcId
     */
    public Integer getBindSlcId() {
        return (Integer) getNamedWhereClauseParam("BindSlcId");
    }

    /**
     * Sets <code>value</code> for bind variable BindSlcId.
     * @param value value to bind as BindSlcId
     */
    public void setBindSlcId(Integer value) {
        setNamedWhereClauseParam("BindSlcId", value);
    }

    /**
     * Returns the bind variable value for BindHoOrgId.
     * @return bind variable value for BindHoOrgId
     */
    public String getBindHoOrgId() {
        return (String) getNamedWhereClauseParam("BindHoOrgId");
    }

    /**
     * Sets <code>value</code> for bind variable BindHoOrgId.
     * @param value value to bind as BindHoOrgId
     */
    public void setBindHoOrgId(String value) {
        setNamedWhereClauseParam("BindHoOrgId", value);
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
     * executeQueryForCollection - overridden for custom java data source support.
     */
    @Override
    protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
        super.executeQueryForCollection(qc, params, noUserParams);
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    @Override
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    @Override
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    @Override
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }

    /**
     * getCappedQueryHitCount - overridden for custom java data source support.
     */
    @Override
    public long getCappedQueryHitCount(ViewRowSetImpl viewRowSet, Row[] masterRows, long oldCap, long cap) {
        long value = super.getCappedQueryHitCount(viewRowSet, masterRows, oldCap, cap);
        return value;
    }
}

