package appOpportunity.model.entities;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.math.BigDecimal;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 18 14:13:29 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsOppItmEOImpl extends EntityImpl {
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        this.setUsrIdCreate(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
        this.setUsrIdCreateDt(new Timestamp(System.currentTimeMillis()));
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
       // super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_UPDATE) {
            this.setUsrIdModDt(new Timestamp(System.currentTimeMillis()));
            Integer UsrId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString());
            this.setUsrIdMod(UsrId);
        }
        super.doDML(operation, e);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getCldId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        HoOrgId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        DocId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getDocId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        DocDt {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getDocDt();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setDocDt((Date)value);
            }
        }
        ,
        ItmId {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmId();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ItmUom {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmUom();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmUom((String)value);
            }
        }
        ,
        ItmQty {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmQty();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmQty((Number)value);
            }
        }
        ,
        ItmExpPrice {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmExpPrice();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmExpPrice((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        ItmPrice {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmPrice();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmPrice((Number)value);
            }
        }
        ,
        ItmAmtBs {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmAmtBs();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmAmtBs((Number)value);
            }
        }
        ,
        ItmAmtSp {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getItmAmtSp();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setItmAmtSp((Number)value);
            }
        }
        ,
        SlsOpp {
            public Object get(SlsOppItmEOImpl obj) {
                return obj.getSlsOpp();
            }

            public void put(SlsOppItmEOImpl obj, Object value) {
                obj.setSlsOpp((SlsOppEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SlsOppItmEOImpl object);

        public abstract void put(SlsOppItmEOImpl object, Object value);

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


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int ITMQTY = AttributesEnum.ItmQty.index();
    public static final int ITMEXPPRICE = AttributesEnum.ItmExpPrice.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int ITMPRICE = AttributesEnum.ItmPrice.index();
    public static final int ITMAMTBS = AttributesEnum.ItmAmtBs.index();
    public static final int ITMAMTSP = AttributesEnum.ItmAmtSp.index();
    public static final int SLSOPP = AttributesEnum.SlsOpp.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SlsOppItmEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("appOpportunity.model.entities.SlsOppItmEO");
    }

    /**
     * Gets the attribute value for TransCldId, using the alias name TransCldId.
     * @return the value of TransCldId
     */
    public String getCldId() {
        return (String)getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransCldId.
     * @param value value to set the TransCldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for TransSlocId, using the alias name TransSlocId.
     * @return the value of TransSlocId
     */
    public Integer getSlocId() {
        return (Integer)getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransSlocId.
     * @param value value to set the TransSlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for TransOrgId, using the alias name TransOrgId.
     * @return the value of TransOrgId
     */
    public String getOrgId() {
        return (String)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransOrgId.
     * @param value value to set the TransOrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for TransHoOrgId, using the alias name TransHoOrgId.
     * @return the value of TransHoOrgId
     */
    public String getHoOrgId() {
        return (String)getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransHoOrgId.
     * @param value value to set the TransHoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for DocId, using the alias name DocId.
     * @return the value of DocId
     */
    public String getDocId() {
        return (String)getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocId.
     * @param value value to set the DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for DocDt, using the alias name DocDt.
     * @return the value of DocDt
     */
    public Date getDocDt() {
        return (Date)getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocDt.
     * @param value value to set the DocDt
     */
    public void setDocDt(Date value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for ItmId, using the alias name ItmId.
     * @return the value of ItmId
     */
    public String getItmId() {
        return (String)getAttributeInternal(ITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmId.
     * @param value value to set the ItmId
     */
    public void setItmId(String value) {
        setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for ItmUom, using the alias name ItmUom.
     * @return the value of ItmUom
     */
    public String getItmUom() {
        return (String)getAttributeInternal(ITMUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmUom.
     * @param value value to set the ItmUom
     */
    public void setItmUom(String value) {
        setAttributeInternal(ITMUOM, value);
    }

    /**
     * Gets the attribute value for ItmQty, using the alias name ItmQty.
     * @return the value of ItmQty
     */
    public Number getItmQty() {
        
        return (Number)getAttributeInternal(ITMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmQty.
     * @param value value to set the ItmQty
     */
    public void setItmQty(Number value) {
        setAttributeInternal(ITMQTY, value);
    }

    /**
     * Gets the attribute value for ItmExpPrice, using the alias name ItmExpPrice.
     * @return the value of ItmExpPrice
     */
    public Number getItmExpPrice() {
        return (Number)getAttributeInternal(ITMEXPPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmExpPrice.
     * @param value value to set the ItmExpPrice
     */
    public void setItmExpPrice(Number value) {
        setAttributeInternal(ITMEXPPRICE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp)getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreateDt.
     * @param value value to set the UsrIdCreateDt
     */
    public void setUsrIdCreateDt(Timestamp value) {
        setAttributeInternal(USRIDCREATEDT, value);
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
    public Timestamp getUsrIdModDt() {
        return (Timestamp)getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdModDt.
     * @param value value to set the UsrIdModDt
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for ItmPrice, using the alias name ItmPrice.
     * @return the value of ItmPrice
     */
    public Number getItmPrice() {
        return (Number)getAttributeInternal(ITMPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmPrice.
     * @param value value to set the ItmPrice
     */
    public void setItmPrice(Number value) {
        setAttributeInternal(ITMPRICE, value);
    }

    /**
     * Gets the attribute value for ItmAmtBs, using the alias name ItmAmtBs.
     * @return the value of ItmAmtBs
     */
    public Number getItmAmtBs() {
        return (Number)getAttributeInternal(ITMAMTBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmAmtBs.
     * @param value value to set the ItmAmtBs
     */
    public void setItmAmtBs(Number value) {
        setAttributeInternal(ITMAMTBS, value);
    }

    /**
     * Gets the attribute value for ItmAmtSp, using the alias name ItmAmtSp.
     * @return the value of ItmAmtSp
     */
    public Number getItmAmtSp() {
        return (Number)getAttributeInternal(ITMAMTSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmAmtSp.
     * @param value value to set the ItmAmtSp
     */
    public void setItmAmtSp(Number value) {
        setAttributeInternal(ITMAMTSP, value);
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
     * @return the associated entity SlsOppEOImpl.
     */
    public SlsOppEOImpl getSlsOpp() {
        return (SlsOppEOImpl)getAttributeInternal(SLSOPP);
    }

    /**
     * Sets <code>value</code> as the associated entity SlsOppEOImpl.
     */
    public void setSlsOpp(SlsOppEOImpl value) {
        setAttributeInternal(SLSOPP, value);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param hoOrgId key constituent
     * @param docId key constituent
     * @param docDt key constituent
     * @param itmId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String hoOrgId, String docId,
                                       Date docDt, String itmId) {
        return new Key(new Object[]{cldId, slocId, orgId, hoOrgId, docId, docDt, itmId});
    }

    /**
     *
     * @param data
     * @return
     */
    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String msg = valueExp.getValue(elContext).toString();
        return msg;
    }

}
