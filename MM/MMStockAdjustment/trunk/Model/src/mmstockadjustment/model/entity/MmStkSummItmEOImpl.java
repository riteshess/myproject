package mmstockadjustment.model.entity;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 07 15:18:17 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmStkSummItmEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getCldId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        WhId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getWhId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setWhId((String)value);
            }
        }
        ,
        FyId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getFyId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setFyId((Integer)value);
            }
        }
        ,
        ItmId {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getItmId();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ItmUomBs {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getItmUomBs();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setItmUomBs((String)value);
            }
        }
        ,
        OpStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOpStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOpStk((BigDecimal)value);
            }
        }
        ,
        OpAvlStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOpAvlStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOpAvlStk((BigDecimal)value);
            }
        }
        ,
        OpReqStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOpReqStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOpReqStk((BigDecimal)value);
            }
        }
        ,
        OpOrdStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOpOrdStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOpOrdStk((BigDecimal)value);
            }
        }
        ,
        OpRejStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOpRejStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOpRejStk((BigDecimal)value);
            }
        }
        ,
        TotStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getTotStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setTotStk((BigDecimal)value);
            }
        }
        ,
        AvlStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getAvlStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setAvlStk((BigDecimal)value);
            }
        }
        ,
        ReqStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getReqStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setReqStk((BigDecimal)value);
            }
        }
        ,
        OrdStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getOrdStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setOrdStk((BigDecimal)value);
            }
        }
        ,
        RejStk {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getRejStk();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setRejStk((BigDecimal)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        MmStkSummLot {
            public Object get(MmStkSummItmEOImpl obj) {
                return obj.getMmStkSummLot();
            }

            public void put(MmStkSummItmEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmStkSummItmEOImpl object);

        public abstract void put(MmStkSummItmEOImpl object, Object value);

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
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOMBS = AttributesEnum.ItmUomBs.index();
    public static final int OPSTK = AttributesEnum.OpStk.index();
    public static final int OPAVLSTK = AttributesEnum.OpAvlStk.index();
    public static final int OPREQSTK = AttributesEnum.OpReqStk.index();
    public static final int OPORDSTK = AttributesEnum.OpOrdStk.index();
    public static final int OPREJSTK = AttributesEnum.OpRejStk.index();
    public static final int TOTSTK = AttributesEnum.TotStk.index();
    public static final int AVLSTK = AttributesEnum.AvlStk.index();
    public static final int REQSTK = AttributesEnum.ReqStk.index();
    public static final int ORDSTK = AttributesEnum.OrdStk.index();
    public static final int REJSTK = AttributesEnum.RejStk.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int MMSTKSUMMLOT = AttributesEnum.MmStkSummLot.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmStkSummItmEOImpl() {
    }

    /**
     * Gets the attribute value for CldId, using the alias name CldId.
     * @return the value of CldId
     */
    public String getCldId() {
        return (String)getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CldId.
     * @param value value to set the CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
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
     * Gets the attribute value for WhId, using the alias name WhId.
     * @return the value of WhId
     */
    public String getWhId() {
        return (String)getAttributeInternal(WHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhId.
     * @param value value to set the WhId
     */
    public void setWhId(String value) {
        setAttributeInternal(WHID, value);
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
     * Gets the attribute value for ItmUomBs, using the alias name ItmUomBs.
     * @return the value of ItmUomBs
     */
    public String getItmUomBs() {
        return (String)getAttributeInternal(ITMUOMBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmUomBs.
     * @param value value to set the ItmUomBs
     */
    public void setItmUomBs(String value) {
        setAttributeInternal(ITMUOMBS, value);
    }

    /**
     * Gets the attribute value for OpStk, using the alias name OpStk.
     * @return the value of OpStk
     */
    public BigDecimal getOpStk() {
        return (BigDecimal)getAttributeInternal(OPSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpStk.
     * @param value value to set the OpStk
     */
    public void setOpStk(BigDecimal value) {
        setAttributeInternal(OPSTK, value);
    }

    /**
     * Gets the attribute value for OpAvlStk, using the alias name OpAvlStk.
     * @return the value of OpAvlStk
     */
    public BigDecimal getOpAvlStk() {
        return (BigDecimal)getAttributeInternal(OPAVLSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpAvlStk.
     * @param value value to set the OpAvlStk
     */
    public void setOpAvlStk(BigDecimal value) {
        setAttributeInternal(OPAVLSTK, value);
    }

    /**
     * Gets the attribute value for OpReqStk, using the alias name OpReqStk.
     * @return the value of OpReqStk
     */
    public BigDecimal getOpReqStk() {
        return (BigDecimal)getAttributeInternal(OPREQSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpReqStk.
     * @param value value to set the OpReqStk
     */
    public void setOpReqStk(BigDecimal value) {
        setAttributeInternal(OPREQSTK, value);
    }

    /**
     * Gets the attribute value for OpOrdStk, using the alias name OpOrdStk.
     * @return the value of OpOrdStk
     */
    public BigDecimal getOpOrdStk() {
        return (BigDecimal)getAttributeInternal(OPORDSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpOrdStk.
     * @param value value to set the OpOrdStk
     */
    public void setOpOrdStk(BigDecimal value) {
        setAttributeInternal(OPORDSTK, value);
    }

    /**
     * Gets the attribute value for OpRejStk, using the alias name OpRejStk.
     * @return the value of OpRejStk
     */
    public BigDecimal getOpRejStk() {
        return (BigDecimal)getAttributeInternal(OPREJSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpRejStk.
     * @param value value to set the OpRejStk
     */
    public void setOpRejStk(BigDecimal value) {
        setAttributeInternal(OPREJSTK, value);
    }

    /**
     * Gets the attribute value for TotStk, using the alias name TotStk.
     * @return the value of TotStk
     */
    public BigDecimal getTotStk() {
        return (BigDecimal)getAttributeInternal(TOTSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotStk.
     * @param value value to set the TotStk
     */
    public void setTotStk(BigDecimal value) {
        setAttributeInternal(TOTSTK, value);
    }

    /**
     * Gets the attribute value for AvlStk, using the alias name AvlStk.
     * @return the value of AvlStk
     */
    public BigDecimal getAvlStk() {
        return (BigDecimal)getAttributeInternal(AVLSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for AvlStk.
     * @param value value to set the AvlStk
     */
    public void setAvlStk(BigDecimal value) {
        setAttributeInternal(AVLSTK, value);
    }

    /**
     * Gets the attribute value for ReqStk, using the alias name ReqStk.
     * @return the value of ReqStk
     */
    public BigDecimal getReqStk() {
        return (BigDecimal)getAttributeInternal(REQSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReqStk.
     * @param value value to set the ReqStk
     */
    public void setReqStk(BigDecimal value) {
        setAttributeInternal(REQSTK, value);
    }

    /**
     * Gets the attribute value for OrdStk, using the alias name OrdStk.
     * @return the value of OrdStk
     */
    public BigDecimal getOrdStk() {
        return (BigDecimal)getAttributeInternal(ORDSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrdStk.
     * @param value value to set the OrdStk
     */
    public void setOrdStk(BigDecimal value) {
        setAttributeInternal(ORDSTK, value);
    }

    /**
     * Gets the attribute value for RejStk, using the alias name RejStk.
     * @return the value of RejStk
     */
    public BigDecimal getRejStk() {
        return (BigDecimal)getAttributeInternal(REJSTK);
    }

    /**
     * Sets <code>value</code> as the attribute value for RejStk.
     * @param value value to set the RejStk
     */
    public void setRejStk(BigDecimal value) {
        setAttributeInternal(REJSTK, value);
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
    public RowIterator getMmStkSummLot() {
        return (RowIterator)getAttributeInternal(MMSTKSUMMLOT);
    }

    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param whId key constituent
     * @param fyId key constituent
     * @param itmId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String whId, Integer fyId,
                                       String itmId) {
        return new Key(new Object[]{cldId, slocId, orgId, whId, fyId, itmId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mmstockadjustment.model.entity.MmStkSummItmEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
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
        //super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
