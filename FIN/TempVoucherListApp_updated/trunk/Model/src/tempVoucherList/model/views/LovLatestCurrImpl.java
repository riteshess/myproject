package tempVoucherList.model.views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.ViewCriteria;
import oracle.jbo.domain.Date;
import oracle.jbo.server.QueryCollection;
import oracle.jbo.server.SQLBuilder;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 05 18:03:35 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LovLatestCurrImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public LovLatestCurrImpl() {
    }

    /**
     * Returns the variable value for BindCurrId.
     * @return variable value for BindCurrId
     */
    public Integer getBindCurrId() {
        return (Integer)ensureVariableManager().getVariableValue("BindCurrId");
    }

    /**
     * Sets <code>value</code> for variable BindCurrId.
     * @param value value to bind as BindCurrId
     */
    public void setBindCurrId(Integer value) {
        ensureVariableManager().setVariableValue("BindCurrId", value);
    }

    /**
     * Returns the variable value for BindCurrTxn.
     * @return variable value for BindCurrTxn
     */
    public Integer getBindCurrTxn() {
        return (Integer)ensureVariableManager().getVariableValue("BindCurrTxn");
    }

    /**
     * Sets <code>value</code> for variable BindCurrTxn.
     * @param value value to bind as BindCurrTxn
     */
    public void setBindCurrTxn(Integer value) {
        ensureVariableManager().setVariableValue("BindCurrTxn", value);
    }

    /**
     * Returns the variable value for BindCurrName.
     * @return variable value for BindCurrName
     */
    public String getBindCurrName() {
        return (String)ensureVariableManager().getVariableValue("BindCurrName");
    }

    /**
     * Sets <code>value</code> for variable BindCurrName.
     * @param value value to bind as BindCurrName
     */
    public void setBindCurrName(String value) {
        ensureVariableManager().setVariableValue("BindCurrName", value);
    }

    /**
     * Returns the variable value for BindCcBuy.
     * @return variable value for BindCcBuy
     */
    public Integer getBindCcBuy() {
        return (Integer)ensureVariableManager().getVariableValue("BindCcBuy");
    }

    /**
     * Sets <code>value</code> for variable BindCcBuy.
     * @param value value to bind as BindCcBuy
     */
    public void setBindCcBuy(Integer value) {
        ensureVariableManager().setVariableValue("BindCcBuy", value);
    }


    /**
     * Returns the variable value for BindOrgId.
     * @return variable value for BindOrgId
     */
    public String getBindOrgId() {
        return (String) ensureVariableManager().getVariableValue("BindOrgId");
    }

    /**
     * Sets <code>value</code> for variable BindOrgId.
     * @param value value to bind as BindOrgId
     */
    public void setBindOrgId(String value) {
        ensureVariableManager().setVariableValue("BindOrgId", value);
    }

    /**
     * Returns the bind variable value for BindVouDt.
     * @return bind variable value for BindVouDt
     */
    public Date getBindVouDt() {
        return (Date) getNamedWhereClauseParam("BindVouDt");
    }

    /**
     * Sets <code>value</code> for bind variable BindVouDt.
     * @param value value to bind as BindVouDt
     */
    public void setBindVouDt(Date value) {
        setNamedWhereClauseParam("BindVouDt", value);
    }
}
