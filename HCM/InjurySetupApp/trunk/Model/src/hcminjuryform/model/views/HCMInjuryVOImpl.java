package hcminjuryform.model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 01 11:17:41 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HCMInjuryVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public HCMInjuryVOImpl() {
    }

    /**
     * Returns the variable value for BindDocId.
     * @return variable value for BindDocId
     */
    public String getBindDocId() {
        return (String) ensureVariableManager().getVariableValue("BindDocId");
    }

    /**
     * Sets <code>value</code> for variable BindDocId.
     * @param value value to bind as BindDocId
     */
    public void setBindDocId(String value) {
        ensureVariableManager().setVariableValue("BindDocId", value);
    }
}

