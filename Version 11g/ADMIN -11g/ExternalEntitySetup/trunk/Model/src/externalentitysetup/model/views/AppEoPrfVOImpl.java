package externalentitysetup.model.views;

import java.sql.ResultSet;

import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 04 15:58:14 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppEoPrfVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public AppEoPrfVOImpl() {
    }
    int counter=0;
    @Override
    protected ViewRowImpl createRowFromResultSet(Object object, ResultSet resultSet) {
       
        ViewRowImpl row = super.createRowFromResultSet(object, resultSet);
    counter++;
   // System.out.println("Row fetched with key: " + row.getKey() + ", for VO: " + this.getName() + " row count: " + counter);

    return row;
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
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }
    
//    public void beforeCommit(oracle.jbo.server.TransactionEvent p1){
//        System.out.println("Before Commitind data in profile vo");
//        super.beforeCommit(p1);
//    }
//    
//    public void afterCommit(oracle.jbo.server.TransactionEvent p1){
//        System.out.println("after commiting  data in profile vo");
//        super.afterCommit(p1);
//    }
}
