package batchpayment.model.views;

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
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Mar 08 12:35:41 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApPaySumVOImpl extends ViewObjectImpl {
    private int counter = 0;
    /**
     * This is the default constructor (do not remove).
     */
    public ApPaySumVOImpl() {
    }

    /**
     * Returns the variable value for CLD_ID_BIND.
     * @return variable value for CLD_ID_BIND
     */
    public String getCLD_ID_BIND() {
        return (String)ensureVariableManager().getVariableValue("CLD_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable CLD_ID_BIND.
     * @param value value to bind as CLD_ID_BIND
     */
    public void setCLD_ID_BIND(String value) {
        ensureVariableManager().setVariableValue("CLD_ID_BIND", value);
    }

    /**
     * Returns the variable value for HO_ORG_ID_BIND.
     * @return variable value for HO_ORG_ID_BIND
     */
    public String getHO_ORG_ID_BIND() {
        return (String)ensureVariableManager().getVariableValue("HO_ORG_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable HO_ORG_ID_BIND.
     * @param value value to bind as HO_ORG_ID_BIND
     */
    public void setHO_ORG_ID_BIND(String value) {
        ensureVariableManager().setVariableValue("HO_ORG_ID_BIND", value);
    }

    /**
     * Returns the variable value for SLOC_ID_BIND.
     * @return variable value for SLOC_ID_BIND
     */
    public Integer getSLOC_ID_BIND() {
        return (Integer)ensureVariableManager().getVariableValue("SLOC_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable SLOC_ID_BIND.
     * @param value value to bind as SLOC_ID_BIND
     */
    public void setSLOC_ID_BIND(Integer value) {
        ensureVariableManager().setVariableValue("SLOC_ID_BIND", value);
    }

    /**
     * Returns the variable value for ORG_ID_BIND.
     * @return variable value for ORG_ID_BIND
     */
    public String getORG_ID_BIND() {
        return (String)ensureVariableManager().getVariableValue("ORG_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable ORG_ID_BIND.
     * @param value value to bind as ORG_ID_BIND
     */
    public void setORG_ID_BIND(String value) {
        ensureVariableManager().setVariableValue("ORG_ID_BIND", value);
    }

    /**
     * Returns the variable value for PAY_ID_BIND.
     * @return variable value for PAY_ID_BIND
     */
    public String getPAY_ID_BIND() {
        return (String)ensureVariableManager().getVariableValue("PAY_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable PAY_ID_BIND.
     * @param value value to bind as PAY_ID_BIND
     */
    public void setPAY_ID_BIND(String value) {
        ensureVariableManager().setVariableValue("PAY_ID_BIND", value);
    }

    /**
     * Returns the variable value for INST_ID_BIND.
     * @return variable value for INST_ID_BIND
     */
    public Integer getINST_ID_BIND() {
        return (Integer)ensureVariableManager().getVariableValue("INST_ID_BIND");
    }

    /**
     * Sets <code>value</code> for variable INST_ID_BIND.
     * @param value value to bind as INST_ID_BIND
     */
    public void setINST_ID_BIND(Integer value) {
        ensureVariableManager().setVariableValue("INST_ID_BIND", value);
    }

    /**
     * Returns the variable value for COAIdBind.
     * @return variable value for COAIdBind
     */
    public Integer getCOAIdBind() {
        return (Integer)ensureVariableManager().getVariableValue("COAIdBind");
    }

    /**
     * Sets <code>value</code> for variable COAIdBind.
     * @param value value to bind as COAIdBind
     */
    public void setCOAIdBind(Integer value) {
        ensureVariableManager().setVariableValue("COAIdBind", value);
    }
    
    int counter1=0;
       protected ViewRowImpl createRowFromResultSet(Object object, ResultSet resultSet) {
           counter1++;
       ViewRowImpl row = super.createRowFromResultSet(object, resultSet);
       System.out.println("Row fetched with key: " + row.getKey() + ", for VO: " + this.getName() + " row count: " + counter1);

       return row;
       }
       
       
       
       
    @Override
         protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
       /*       short fetchSize = 10;
              if (this.getRangeSize() > 0) {
                 fetchSize = ((short)(this.getRangeSize() + 3));
             }
             if (this.getRangeSize() < 10) {
                // System.out.println("Potentially small range size : " + this.getRangeSize() + " for table VO : " +
                //             this.getViewObject().getDefFullName());
                 fetchSize = 10;
             }
       
             System.out.println("Original fetch size : " + this.getFetchSize() + ", Updated fetch size : " + fetchSize +
                         " for : " + this.getViewObject().getDefFullName());
             //if (fetchSize > this.getFetchSize()) {
               //  System.out.println("Updating fetch size : " + fetchSize);
                 this.setFetchSize(fetchSize);
            // } else {
            //     System.out.println("Current fetch size : " + this.getFetchSize() + " for : " +
            //                 this.getViewObject().getDefFullName());
            // } 
        */
             long init = System.currentTimeMillis();
             super.executeQueryForCollection(qc, params, noUserParams);
             long end = System.currentTimeMillis() - init;
             
           //if(this.getCurrentRow() != null)
            // System.out.println("at executrion data "+ this.getCurrentRow().getAttribute("ApPayInstrmntAmt"));
       
         
//                     System.out.println("VO: " + this.getName() + ", from AM: " + this.getApplicationModule().getName() +
//                                  ", executes SQL in: " + end + " (miliseconds)");
         }
    

}
