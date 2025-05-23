package inventoryreportapp.model.views;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.JboException;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 24 10:56:14 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PurchaseRequisitionRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Dummy {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getDummy();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setDummy((String)value);
            }
        }
        ,
        CldId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getCldId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getSlocId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getOrgId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        HoOrgId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        RqmtArea {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getRqmtArea();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setRqmtArea((Integer)value);
            }
        }
        ,
        WhId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getWhId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setWhId((String)value);
            }
        }
        ,
        PurReqStat {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getPurReqStat();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setPurReqStat((Integer)value);
            }
        }
        ,
        PrNo {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getPrNo();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setPrNo((String)value);
            }
        }
        ,
        docId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getdocId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setdocId((String)value);
            }
        }
        ,
        FyId {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getFyId();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setFyId((Integer)value);
            }
        }
        ,
        fromDate {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getfromDate();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setfromDate((Date)value);
            }
        }
        ,
        toDate {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.gettoDate();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.settoDate((Date)value);
            }
        }
        ,
        AuthStat {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getAuthStat();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAuthStat((String)value);
            }
        }
        ,
        LovRqmtArea1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLovRqmtArea1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVOrgVO1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVOrgVO1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVWarehouseVO1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVWarehouseVO1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVPurRequ1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVPurRequ1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVPurRequistion1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVPurRequistion1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVFinancialYearVO1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVFinancialYearVO1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVYNVO1 {
            public Object get(PurchaseRequisitionRowImpl obj) {
                return obj.getLOVYNVO1();
            }

            public void put(PurchaseRequisitionRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PurchaseRequisitionRowImpl object);

        public abstract void put(PurchaseRequisitionRowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DUMMY = AttributesEnum.Dummy.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int RQMTAREA = AttributesEnum.RqmtArea.index();
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int PURREQSTAT = AttributesEnum.PurReqStat.index();
    public static final int PRNO = AttributesEnum.PrNo.index();
    public static final int DOCID = AttributesEnum.docId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int FROMDATE = AttributesEnum.fromDate.index();
    public static final int TODATE = AttributesEnum.toDate.index();
    public static final int AUTHSTAT = AttributesEnum.AuthStat.index();
    public static final int LOVRQMTAREA1 = AttributesEnum.LovRqmtArea1.index();
    public static final int LOVORGVO1 = AttributesEnum.LOVOrgVO1.index();
    public static final int LOVWAREHOUSEVO1 = AttributesEnum.LOVWarehouseVO1.index();
    public static final int LOVPURREQU1 = AttributesEnum.LOVPurRequ1.index();
    public static final int LOVPURREQUISTION1 = AttributesEnum.LOVPurRequistion1.index();
    public static final int LOVFINANCIALYEARVO1 = AttributesEnum.LOVFinancialYearVO1.index();
    public static final int LOVYNVO1 = AttributesEnum.LOVYNVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PurchaseRequisitionRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String) getAttributeInternal(DUMMY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Dummy.
     * @param value value to set the  Dummy
     */
    public void setDummy(String value) {
        setAttributeInternal(DUMMY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        String cldid;
        if(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}")!=null){
            cldid=resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
            return cldid;
        }
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        Integer sloc;
        if(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}")!=null){
         sloc =Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
            return sloc;
        }
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocId.
     * @param value value to set the  SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        String hoorgid;
        if(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}")!=null){
         hoorgid =resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
            return hoorgid;
        }
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        String hoorgid;
        if(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}")!=null){
         hoorgid =resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
            return hoorgid;
        }
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HoOrgId.
     * @param value value to set the  HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RqmtArea.
     * @return the RqmtArea
     */
    public Integer getRqmtArea() {
        return (Integer) getAttributeInternal(RQMTAREA);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RqmtArea.
     * @param value value to set the  RqmtArea
     */
    public void setRqmtArea(Integer value) {
        setAttributeInternal(RQMTAREA, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WhId.
     * @return the WhId
     */
    public String getWhId() {
        return (String) getAttributeInternal(WHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WhId.
     * @param value value to set the  WhId
     */
    public void setWhId(String value) {
        setAttributeInternal(WHID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PurReqStat.
     * @return the PurReqStat
     */
    public Integer getPurReqStat() {
        return (Integer) getAttributeInternal(PURREQSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PurReqStat.
     * @param value value to set the  PurReqStat
     */
    public void setPurReqStat(Integer value) {
        setAttributeInternal(PURREQSTAT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PrNo.
     * @return the PrNo
     */
    public String getPrNo() {
        return (String) getAttributeInternal(PRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PrNo.
     * @param value value to set the  PrNo
     */
    public void setPrNo(String value) {
        setAttributeInternal(PRNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute docId.
     * @return the docId
     */
    public String getdocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute docId.
     * @param value value to set the  docId
     */
    public void setdocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FyId.
     * @return the FyId
     */
    public Integer getFyId() {
        String CldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        String OrgId=resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        Integer fyId =(Integer)(callStoredFunction(Types.INTEGER, "APP.GET_ORG_FY_ID (?,?,?)", new Object[] {CldId,OrgId,new Timestamp(System.currentTimeMillis())}));
        return ((Integer) getAttributeInternal(FYID) == null)?fyId:(Integer) getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FyId.
     * @param value value to set the  FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute fromDate.
     * @return the fromDate
     */
    public Date getfromDate() {
        return (Date) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute fromDate.
     * @param value value to set the  fromDate
     */
    public void setfromDate(Date value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute toDate.
     * @return the toDate
     */
    public Date gettoDate() {
        return (Date) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute toDate.
     * @param value value to set the  toDate
     */
    public void settoDate(Date value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AuthStat.
     * @return the AuthStat
     */
    public String getAuthStat() {
        return (String) getAttributeInternal(AUTHSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AuthStat.
     * @param value value to set the  AuthStat
     */
    public void setAuthStat(String value) {
        setAttributeInternal(AUTHSTAT, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovRqmtArea1.
     */
    public RowSet getLovRqmtArea1() {
        return (RowSet)getAttributeInternal(LOVRQMTAREA1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVOrgVO1.
     */
    public RowSet getLOVOrgVO1() {
        return (RowSet)getAttributeInternal(LOVORGVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVWarehouseVO1.
     */
    public RowSet getLOVWarehouseVO1() {
        return (RowSet)getAttributeInternal(LOVWAREHOUSEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVPurRequ1.
     */
    public RowSet getLOVPurRequ1() {
        return (RowSet)getAttributeInternal(LOVPURREQU1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVPurRequistion1.
     */
    public RowSet getLOVPurRequistion1() {
        return (RowSet)getAttributeInternal(LOVPURREQUISTION1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVFinancialYearVO1.
     */
    public RowSet getLOVFinancialYearVO1() {
        return (RowSet)getAttributeInternal(LOVFINANCIALYEARVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVYNVO1.
     */
    public RowSet getLOVYNVO1() {
        return (RowSet)getAttributeInternal(LOVYNVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
    
    private Object resolvEl(String data){
    FacesContext fc = FacesContext.getCurrentInstance();
    Application app = fc.getApplication();
    ExpressionFactory elFactory = app.getExpressionFactory();
    ELContext elContext = fc.getELContext();
    ValueExpression valueExp = elFactory.createValueExpression(elContext, data,
    Object.class);
    Object Message=valueExp.getValue(elContext);
    return Message;
    }
    
    
    protected Object callStoredFunction(int sqlReturnType, String stmt,
                                          Object[] bindVars) {
        CallableStatement st = null;
        try {
          // 1. Create a JDBC CallabledStatement
          st =
              getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;",
                                                         0);
          // 2. Register the first bind variable for the return value
          st.registerOutParameter(1, sqlReturnType);
          if (bindVars != null) {
            // 3. Loop over values for the bind variables passed in, if any
            for (int z = 0; z < bindVars.length; z++) {
              // 4. Set the value of user-supplied bind vars in the stmt
              st.setObject(z + 2, bindVars[z]);
            }
          }
          // 5. Set the value of user-supplied bind vars in the stmt
          st.executeUpdate();
          // 6. Return the value of the first bind variable
          return st.getObject(1);
        } catch (SQLException e) {
          throw new JboException(e);
        } finally {
          if (st != null) {
            try {
              // 7. Close the statement
              st.close();
            } catch (SQLException e) {
            }
          }
        }
      }
}
