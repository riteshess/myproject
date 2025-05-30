package batchpayment.model.views;

import java.sql.Timestamp;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 07 11:53:12 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FinApPayViewVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public FinApPayViewVOImpl() {
    }

    /**
     * Returns the variable value for BindOrgId.
     * @return variable value for BindOrgId
     */
    public String getBindOrgId() {
        return (String)ensureVariableManager().getVariableValue("BindOrgId");
    }

    /**
     * Sets <code>value</code> for variable BindOrgId.
     * @param value value to bind as BindOrgId
     */
    public void setBindOrgId(String value) {
        ensureVariableManager().setVariableValue("BindOrgId", value);
    }

    /**
     * Returns the variable value for BindSumOrgOf.
     * @return variable value for BindSumOrgOf
     */
    public Number getBindSumOrgOf() {
        return (Number)ensureVariableManager().getVariableValue("BindSumOrgOf");
    }

    /**
     * Sets <code>value</code> for variable BindSumOrgOf.
     * @param value value to bind as BindSumOrgOf
     */
    public void setBindSumOrgOf(Number value) {
        ensureVariableManager().setVariableValue("BindSumOrgOf", value);
    }

    /**
     * Returns the variable value for BindPropOf.
     * @return variable value for BindPropOf
     */
    public Number getBindPropOf() {
        return (Number)ensureVariableManager().getVariableValue("BindPropOf");
    }

    /**
     * Sets <code>value</code> for variable BindPropOf.
     * @param value value to bind as BindPropOf
     */
    public void setBindPropOf(Number value) {
        ensureVariableManager().setVariableValue("BindPropOf", value);
    }

    /**
     * Returns the variable value for BindBatchId.
     * @return variable value for BindBatchId
     */
    public String getBindBatchId() {
        return (String)ensureVariableManager().getVariableValue("BindBatchId");
    }

    /**
     * Sets <code>value</code> for variable BindBatchId.
     * @param value value to bind as BindBatchId
     */
    public void setBindBatchId(String value) {
        ensureVariableManager().setVariableValue("BindBatchId", value);
    }

    /**
     * Returns the variable value for BindCreateDate.
     * @return variable value for BindCreateDate
     */
    public Date getBindCreateDate() {
        return (Date)ensureVariableManager().getVariableValue("BindCreateDate");
    }

    /**
     * Sets <code>value</code> for variable BindCreateDate.
     * @param value value to bind as BindCreateDate
     */
    public void setBindCreateDate(Date value) {
        ensureVariableManager().setVariableValue("BindCreateDate", value);
    }

    /**
     * Returns the variable value for BindStat.
     * @return variable value for BindStat
     */
    public Integer getBindStat() {
        return (Integer)ensureVariableManager().getVariableValue("BindStat");
    }

    /**
     * Sets <code>value</code> for variable BindStat.
     * @param value value to bind as BindStat
     */
    public void setBindStat(Integer value) {
        ensureVariableManager().setVariableValue("BindStat", value);
    }

    /**
     * Returns the variable value for BankCOABind.
     * @return variable value for BankCOABind
     */
    public Integer getBankCOABind() {
        return (Integer)ensureVariableManager().getVariableValue("BankCOABind");
    }

    /**
     * Sets <code>value</code> for variable BankCOABind.
     * @param value value to bind as BankCOABind
     */
    public void setBankCOABind(Integer value) {
        ensureVariableManager().setVariableValue("BankCOABind", value);
    }

    /**
     * Returns the bind variable value for AP_CLD_ID_BIND.
     * @return bind variable value for AP_CLD_ID_BIND
     */
    public String getAP_CLD_ID_BIND() {
        return (String)getNamedWhereClauseParam("AP_CLD_ID_BIND");
    }

    /**
     * Sets <code>value</code> for bind variable AP_CLD_ID_BIND.
     * @param value value to bind as AP_CLD_ID_BIND
     */
    public void setAP_CLD_ID_BIND(String value) {
        setNamedWhereClauseParam("AP_CLD_ID_BIND", value);
    }

    /**
     * Returns the bind variable value for AP_SLOC_ID_BIND.
     * @return bind variable value for AP_SLOC_ID_BIND
     */
    public Integer getAP_SLOC_ID_BIND() {
        return (Integer)getNamedWhereClauseParam("AP_SLOC_ID_BIND");
    }

    /**
     * Sets <code>value</code> for bind variable AP_SLOC_ID_BIND.
     * @param value value to bind as AP_SLOC_ID_BIND
     */
    public void setAP_SLOC_ID_BIND(Integer value) {
        setNamedWhereClauseParam("AP_SLOC_ID_BIND", value);
    }

    /**
     * Returns the bind variable value for AP_HO_ORG_ID_BIND.
     * @return bind variable value for AP_HO_ORG_ID_BIND
     */
    public String getAP_HO_ORG_ID_BIND() {
        return (String)getNamedWhereClauseParam("AP_HO_ORG_ID_BIND");
    }

    /**
     * Sets <code>value</code> for bind variable AP_HO_ORG_ID_BIND.
     * @param value value to bind as AP_HO_ORG_ID_BIND
     */
    public void setAP_HO_ORG_ID_BIND(String value) {
        setNamedWhereClauseParam("AP_HO_ORG_ID_BIND", value);
    }

    /**
     * Returns the bind variable value for AP_ORG_ID_BIND.
     * @return bind variable value for AP_ORG_ID_BIND
     */
    public String getAP_ORG_ID_BIND() {
        return (String)getNamedWhereClauseParam("AP_ORG_ID_BIND");
    }

    /**
     * Sets <code>value</code> for bind variable AP_ORG_ID_BIND.
     * @param value value to bind as AP_ORG_ID_BIND
     */
    public void setAP_ORG_ID_BIND(String value) {
        setNamedWhereClauseParam("AP_ORG_ID_BIND", value);
    }

    /**
     * Returns the bind variable value for AP_INST_ID_BIND.
     * @return bind variable value for AP_INST_ID_BIND
     */
    public Integer getAP_INST_ID_BIND() {
        return (Integer)getNamedWhereClauseParam("AP_INST_ID_BIND");
    }

    /**
     * Sets <code>value</code> for bind variable AP_INST_ID_BIND.
     * @param value value to bind as AP_INST_ID_BIND
     */
    public void setAP_INST_ID_BIND(Integer value) {
        setNamedWhereClauseParam("AP_INST_ID_BIND", value);
    }

    /**
     * Returns the bind variable value for stat_bind.
     * @return bind variable value for stat_bind
     */
    public Integer getstat_bind() {
        return (Integer)getNamedWhereClauseParam("stat_bind");
    }

    /**
     * Sets <code>value</code> for bind variable stat_bind.
     * @param value value to bind as stat_bind
     */
    public void setstat_bind(Integer value) {
        setNamedWhereClauseParam("stat_bind", value);
    }

    /**
     * Returns the bind variable value for BindPrjId.
     * @return bind variable value for BindPrjId
     */
    public String getBindPrjId() {
        return (String) getNamedWhereClauseParam("BindPrjId");
    }

    /**
     * Sets <code>value</code> for bind variable BindPrjId.
     * @param value value to bind as BindPrjId
     */
    public void setBindPrjId(String value) {
        setNamedWhereClauseParam("BindPrjId", value);
    }
}
