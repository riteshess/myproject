package scinvoiceapp.model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 20 18:12:55 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LovOtherChargesVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public LovOtherChargesVOImpl() {
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
     * Returns the bind variable value for BindDocId.
     * @return bind variable value for BindDocId
     */
    public Integer getBindDocId() {
        return (Integer) getNamedWhereClauseParam("BindDocId");
    }

    /**
     * Sets <code>value</code> for bind variable BindDocId.
     * @param value value to bind as BindDocId
     */
    public void setBindDocId(Integer value) {
        setNamedWhereClauseParam("BindDocId", value);
    }

    /**
     * Returns the bind variable value for BindDocTypeId.
     * @return bind variable value for BindDocTypeId
     */
    public Integer getBindDocTypeId() {
        return (Integer) getNamedWhereClauseParam("BindDocTypeId");
    }

    /**
     * Sets <code>value</code> for bind variable BindDocTypeId.
     * @param value value to bind as BindDocTypeId
     */
    public void setBindDocTypeId(Integer value) {
        setNamedWhereClauseParam("BindDocTypeId", value);
    }

    /**
     * Returns the bind variable value for BindOcId.
     * @return bind variable value for BindOcId
     */
    public String getBindOcId() {
        return (String) getNamedWhereClauseParam("BindOcId");
    }

    /**
     * Sets <code>value</code> for bind variable BindOcId.
     * @param value value to bind as BindOcId
     */
    public void setBindOcId(String value) {
        setNamedWhereClauseParam("BindOcId", value);
    }
}

