package slsreptemplateapp.model.views;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.jbo.ViewCriteria;
import oracle.jbo.server.QueryCollection;
import oracle.jbo.server.SQLBuilder;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 06 09:32:39 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsSearchTmplDetVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public SlsSearchTmplDetVOImpl() {
    }

    /**
     * Returns the variable value for TempParaIdBind.
     * @return variable value for TempParaIdBind
     */
    public Integer getTempParaIdBind() {
        return (Integer)ensureVariableManager().getVariableValue("TempParaIdBind");
    }

    /**
     * Sets <code>value</code> for variable TempParaIdBind.
     * @param value value to bind as TempParaIdBind
     */
    public void setTempParaIdBind(Integer value) {
        ensureVariableManager().setVariableValue("TempParaIdBind", value);
    }
    
    
    private int counter = 0;

    
}
