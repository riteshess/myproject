package glApp.model.view;

import java.sql.ResultSet;

import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 24 12:05:32 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LovCogIdVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public LovCogIdVOImpl() {
    }

    /**
     * Returns the variable value for BindSlocId.
     * @return variable value for BindSlocId
     */
    public Integer getBindSlocId() {
        return (Integer)ensureVariableManager().getVariableValue("BindSlocId");
    }

    /**
     * Sets <code>value</code> for variable BindSlocId.
     * @param value value to bind as BindSlocId
     */
    public void setBindSlocId(Integer value) {
        ensureVariableManager().setVariableValue("BindSlocId", value);
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
     * Returns the variable value for BindCldId.
     * @return variable value for BindCldId
     */
    public String getBindCldId() {
        return (String)ensureVariableManager().getVariableValue("BindCldId");
    }

    /**
     * Sets <code>value</code> for variable BindCldId.
     * @param value value to bind as BindCldId
     */
    public void setBindCldId(String value) {
        ensureVariableManager().setVariableValue("BindCldId", value);
    }
  
}
