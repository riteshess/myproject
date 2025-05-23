package finBudget.model.entities;

import java.math.BigDecimal;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 04 15:43:23 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrgBudgetEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SlocId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        FyId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getFyId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setFyId((Integer)value);
            }
        }
        ,
        CoaId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaId((Integer)value);
            }
        }
        ,
        CoaCogId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaCogId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaCogId((String)value);
            }
        }
        ,
        CoaBudget {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaBudget();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaBudget((Number)value);
            }
        }
        ,
        CoaBudgetType {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaBudgetType();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaBudgetType((String)value);
            }
        }
        ,
        CoaCldId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaCldId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaCldId((String)value);
            }
        }
        ,
        CoaHoOrgId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaHoOrgId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaHoOrgId((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UsrIdMod {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CoaActBudget {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaActBudget();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaActBudget((Number)value);
            }
        }
        ,
        CoaActBudgetType {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getCoaActBudgetType();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setCoaActBudgetType((String)value);
            }
        }
        ,
        MonId {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getMonId();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setMonId((Integer)value);
            }
        }
        ,
        OrgBudgetCcEO {
            public Object get(OrgBudgetEOImpl obj) {
                return obj.getOrgBudgetCcEO();
            }

            public void put(OrgBudgetEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(OrgBudgetEOImpl object);

        public abstract void put(OrgBudgetEOImpl object, Object value);

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


    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int COAID = AttributesEnum.CoaId.index();
    public static final int COACOGID = AttributesEnum.CoaCogId.index();
    public static final int COABUDGET = AttributesEnum.CoaBudget.index();
    public static final int COABUDGETTYPE = AttributesEnum.CoaBudgetType.index();
    public static final int COACLDID = AttributesEnum.CoaCldId.index();
    public static final int COAHOORGID = AttributesEnum.CoaHoOrgId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int COAACTBUDGET = AttributesEnum.CoaActBudget.index();
    public static final int COAACTBUDGETTYPE = AttributesEnum.CoaActBudgetType.index();
    public static final int MONID = AttributesEnum.MonId.index();
    public static final int ORGBUDGETCCEO = AttributesEnum.OrgBudgetCcEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OrgBudgetEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("finBudget.model.entities.OrgBudgetEO");
    }

    /**
     * Gets the attribute value for SlocId, using the alias name SlocId.
     * @return the value of SlocId
     */
    public Integer getSlocId() {
        return (Integer)getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SlocId.
     * @param value value to set the SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the value of OrgId
     */
    public String getOrgId() {
        return (String)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for FyId, using the alias name FyId.
     * @return the value of FyId
     */
    public Integer getFyId() {
        return (Integer)getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FyId.
     * @param value value to set the FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for CoaId, using the alias name CoaId.
     * @return the value of CoaId
     */
    public Integer getCoaId() {
        return (Integer)getAttributeInternal(COAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaId.
     * @param value value to set the CoaId
     */
    public void setCoaId(Integer value) {
        setAttributeInternal(COAID, value);
    }

    /**
     * Gets the attribute value for CoaCogId, using the alias name CoaCogId.
     * @return the value of CoaCogId
     */
    public String getCoaCogId() {
        return (String)getAttributeInternal(COACOGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaCogId.
     * @param value value to set the CoaCogId
     */
    public void setCoaCogId(String value) {
        setAttributeInternal(COACOGID, value);
    }

    /**
     * Gets the attribute value for CoaBudget, using the alias name CoaBudget.
     * @return the value of CoaBudget
     */
    public Number getCoaBudget() {
        return (Number)getAttributeInternal(COABUDGET);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaBudget.
     * @param value value to set the CoaBudget
     */
    public void setCoaBudget(Number value) {
        setAttributeInternal(COABUDGET, value);
    }

    /**
     * Gets the attribute value for CoaBudgetType, using the alias name CoaBudgetType.
     * @return the value of CoaBudgetType
     */
    public String getCoaBudgetType() {
        return (String)getAttributeInternal(COABUDGETTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaBudgetType.
     * @param value value to set the CoaBudgetType
     */
    public void setCoaBudgetType(String value) {
        setAttributeInternal(COABUDGETTYPE, value);
    }

    /**
     * Gets the attribute value for CoaCldId, using the alias name CoaCldId.
     * @return the value of CoaCldId
     */
    public String getCoaCldId() {
        return (String)getAttributeInternal(COACLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaCldId.
     * @param value value to set the CoaCldId
     */
    public void setCoaCldId(String value) {
        setAttributeInternal(COACLDID, value);
    }

    /**
     * Gets the attribute value for CoaHoOrgId, using the alias name CoaHoOrgId.
     * @return the value of CoaHoOrgId
     */
    public String getCoaHoOrgId() {
        return (String)getAttributeInternal(COAHOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaHoOrgId.
     * @param value value to set the CoaHoOrgId
     */
    public void setCoaHoOrgId(String value) {
        setAttributeInternal(COAHOORGID, value);
    }

    /**
     * Gets the attribute value for UsrIdCreate, using the alias name UsrIdCreate.
     * @return the value of UsrIdCreate
     */
    public Integer getUsrIdCreate() {
        return (Integer)getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreate.
     * @param value value to set the UsrIdCreate
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for UsrIdCreateDt, using the alias name UsrIdCreateDt.
     * @return the value of UsrIdCreateDt
     */
    public Date getUsrIdCreateDt() {
        return (Date)getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Gets the attribute value for UsrIdMod, using the alias name UsrIdMod.
     * @return the value of UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer)getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdMod.
     * @param value value to set the UsrIdMod
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for UsrIdModDt, using the alias name UsrIdModDt.
     * @return the value of UsrIdModDt
     */
    public Date getUsrIdModDt() {
        return (Date)getAttributeInternal(USRIDMODDT);
    }

    /**
     * Gets the attribute value for CoaActBudget, using the alias name CoaActBudget.
     * @return the value of CoaActBudget
     */
    public Number getCoaActBudget() {
        return (Number)getAttributeInternal(COAACTBUDGET);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaActBudget.
     * @param value value to set the CoaActBudget
     */
    public void setCoaActBudget(Number value) {
        setAttributeInternal(COAACTBUDGET, value);
    }

    /**
     * Gets the attribute value for CoaActBudgetType, using the alias name CoaActBudgetType.
     * @return the value of CoaActBudgetType
     */
    public String getCoaActBudgetType() {
        return (String)getAttributeInternal(COAACTBUDGETTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaActBudgetType.
     * @param value value to set the CoaActBudgetType
     */
    public void setCoaActBudgetType(String value) {
        setAttributeInternal(COAACTBUDGETTYPE, value);
    }

    /**
     * Gets the attribute value for MonId, using the alias name MonId.
     * @return the value of MonId
     */
    public Integer getMonId() {
        return (Integer)getAttributeInternal(MONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonId.
     * @param value value to set the MonId
     */
    public void setMonId(Integer value) {
        setAttributeInternal(MONID, value);
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

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getOrgBudgetCcEO() {
        return (RowIterator)getAttributeInternal(ORGBUDGETCCEO);
    }


    /**
     * @param slocId key constituent
     * @param orgId key constituent
     * @param fyId key constituent
     * @param coaId key constituent
     * @param coaCldId key constituent
     * @param coaHoOrgId key constituent
     * @param monId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer slocId, String orgId, Integer fyId, Integer coaId, String coaCldId,
                                       String coaHoOrgId, Integer monId) {
        return new Key(new Object[]{slocId, orgId, fyId, coaId, coaCldId, coaHoOrgId, monId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        /**The followng global parameters are received from task flow and their value is set during create method **/

        String CloudId = resolvElDC("#{pageFlowScope.GLBL_APP_CLD_ID}");
        String OrgId = resolvElDC("#{pageFlowScope.GLBL_HO_ORG_ID}");
        Integer SlocId = Integer.parseInt(resolvElDC("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        Integer UserId = Integer.parseInt(resolvElDC("#{pageFlowScope.GLBL_APP_USR}"));

        setSlocId(SlocId);
        setCoaCldId(CloudId);
        setCoaHoOrgId(OrgId);
        setUsrIdCreate(UserId);
        super.create(attributeList);
    }
    
    public String resolvElDC(String data) {
         FacesContext fc = FacesContext.getCurrentInstance();
         Application app = fc.getApplication();
         ExpressionFactory elFactory = app.getExpressionFactory();
         ELContext elContext = fc.getELContext();
         ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
         String Message = valueExp.getValue(elContext).toString();
         return Message;
     }
    
    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_UPDATE) {
            Integer UserId = Integer.parseInt(resolvElDC("#{pageFlowScope.GLBL_APP_USR}"));
            setUsrIdMod(UserId);
        }
        super.doDML(operation, e);
    }
}
