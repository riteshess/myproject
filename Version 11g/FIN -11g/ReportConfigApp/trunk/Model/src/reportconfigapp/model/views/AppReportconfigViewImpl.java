package reportconfigapp.model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 25 11:28:25 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppReportconfigViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppReportconfigViewImpl() {
    }

    /**
     * Returns the variable value for CatIdBindVar.
     * @return variable value for CatIdBindVar
     */
    public Integer getCatIdBindVar() {
        return (Integer)ensureVariableManager().getVariableValue("CatIdBindVar");
    }

    /**
     * Sets <code>value</code> for variable CatIdBindVar.
     * @param value value to bind as CatIdBindVar
     */
    public void setCatIdBindVar(Integer value) {
        ensureVariableManager().setVariableValue("CatIdBindVar", value);
    }

    /**
     * Returns the variable value for CogIdBindVar.
     * @return variable value for CogIdBindVar
     */
    public String getCogIdBindVar() {
        return (String)ensureVariableManager().getVariableValue("CogIdBindVar");
    }

    /**
     * Sets <code>value</code> for variable CogIdBindVar.
     * @param value value to bind as CogIdBindVar
     */
    public void setCogIdBindVar(String value) {
        ensureVariableManager().setVariableValue("CogIdBindVar", value);
    }
}
