package materialreturnnote.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Dec 07 09:58:03 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmMrnItmEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getCldId();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        DocId {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getDocId();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        ItmId {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getItmId();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ItmUom {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getItmUom();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setItmUom((String)value);
            }
        }
        ,
        TotRetQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTotRetQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTotRetQty((Number)value);
            }
        }
        ,
        OkQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getOkQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setOkQty((Number)value);
            }
        }
        ,
        RejQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getRejQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setRejQty((Number)value);
            }
        }
        ,
        RwkQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getRwkQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setRwkQty((Number)value);
            }
        }
        ,
        ItmUomBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getItmUomBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setItmUomBs((String)value);
            }
        }
        ,
        UomConvFctr {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getUomConvFctr();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setUomConvFctr((Number)value);
            }
        }
        ,
        OkQtyBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getOkQtyBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setOkQtyBs((Number)value);
            }
        }
        ,
        RejQtyBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getRejQtyBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setRejQtyBs((Number)value);
            }
        }
        ,
        RwkQtyBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getRwkQtyBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setRwkQtyBs((Number)value);
            }
        }
        ,
        ScrpQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getScrpQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setScrpQty((Number)value);
            }
        }
        ,
        ScrpQtyBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getScrpQtyBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setScrpQtyBs((Number)value);
            }
        }
        ,
        TransOkQtyBs {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransOkQtyBs();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransOkQtyBs((Number)value);
            }
        }
        ,
        TransOkQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransOkQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransOkQty((Number)value);
            }
        }
        ,
        TransRejQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransRejQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransRejQty((Number)value);
            }
        }
        ,
        TransRwkQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransRwkQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransRwkQty((Number)value);
            }
        }
        ,
        TransScrpQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransScrpQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransScrpQty((Number)value);
            }
        }
        ,
        TransTotRetQty {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getTransTotRetQty();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setTransTotRetQty((Number)value);
            }
        }
        ,
        MmMrn {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getMmMrn();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setMmMrn((MmMrnEOImpl)value);
            }
        }
        ,
        MmMrnItmStk {
            public Object get(MmMrnItmEOImpl obj) {
                return obj.getMmMrnItmStk();
            }

            public void put(MmMrnItmEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmMrnItmEOImpl object);

        public abstract void put(MmMrnItmEOImpl object, Object value);

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
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int TOTRETQTY = AttributesEnum.TotRetQty.index();
    public static final int OKQTY = AttributesEnum.OkQty.index();
    public static final int REJQTY = AttributesEnum.RejQty.index();
    public static final int RWKQTY = AttributesEnum.RwkQty.index();
    public static final int ITMUOMBS = AttributesEnum.ItmUomBs.index();
    public static final int UOMCONVFCTR = AttributesEnum.UomConvFctr.index();
    public static final int OKQTYBS = AttributesEnum.OkQtyBs.index();
    public static final int REJQTYBS = AttributesEnum.RejQtyBs.index();
    public static final int RWKQTYBS = AttributesEnum.RwkQtyBs.index();
    public static final int SCRPQTY = AttributesEnum.ScrpQty.index();
    public static final int SCRPQTYBS = AttributesEnum.ScrpQtyBs.index();
    public static final int TRANSOKQTYBS = AttributesEnum.TransOkQtyBs.index();
    public static final int TRANSOKQTY = AttributesEnum.TransOkQty.index();
    public static final int TRANSREJQTY = AttributesEnum.TransRejQty.index();
    public static final int TRANSRWKQTY = AttributesEnum.TransRwkQty.index();
    public static final int TRANSSCRPQTY = AttributesEnum.TransScrpQty.index();
    public static final int TRANSTOTRETQTY = AttributesEnum.TransTotRetQty.index();
    public static final int MMMRN = AttributesEnum.MmMrn.index();
    public static final int MMMRNITMSTK = AttributesEnum.MmMrnItmStk.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmMrnItmEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("materialreturnnote.model.entities.MmMrnItmEO");
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
     * Gets the attribute value for TotRetQty, using the alias name TotRetQty.
     * @return the value of TotRetQty
     */
    public Number getTotRetQty() {
        return (Number)getAttributeInternal(TOTRETQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotRetQty.
     * @param value value to set the TotRetQty
     */
    public void setTotRetQty(Number value) {
        setAttributeInternal(TOTRETQTY, value);
    }

    /**
     * Gets the attribute value for OkQty, using the alias name OkQty.
     * @return the value of OkQty
     */
    public Number getOkQty() {
        return (Number)getAttributeInternal(OKQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OkQty.
     * @param value value to set the OkQty
     */
    public void setOkQty(Number value) {
        System.out.println(" inside set ok qty");
        System.out.println(value);
        if(value == null){
            System.out.println("ok taran "+getTransOkQty());
            value = getTransOkQty();
            setRejQty(getTransRejQty());
            setRwkQty(getTransRwkQty());
            setScrpQty(getTransScrpQty());
            setTotRetQty(getTransTotRetQty());
            if(getItmUom()!=null){
                setItmUomBs(getItmUom());
            }
            if(getUomConvFctr()!=null){
                setRejQtyBs((Number)getTransRejQty().mul(getUomConvFctr()));
                setRwkQtyBs((Number)getTransRwkQty().mul(getUomConvFctr()));
                setScrpQtyBs((Number)getTransScrpQty().mul(getUomConvFctr()));
            }
        }
        setAttributeInternal(OKQTY, value);
    }

    /**
     * Gets the attribute value for RejQty, using the alias name RejQty.
     * @return the value of RejQty
     */
    public Number getRejQty() {
        return (Number)getAttributeInternal(REJQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for RejQty.
     * @param value value to set the RejQty
     */
    public void setRejQty(Number value) {
        setAttributeInternal(REJQTY, value);
    }

    /**
     * Gets the attribute value for RwkQty, using the alias name RwkQty.
     * @return the value of RwkQty
     */
    public Number getRwkQty() {
        return (Number)getAttributeInternal(RWKQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for RwkQty.
     * @param value value to set the RwkQty
     */
    public void setRwkQty(Number value) {
        setAttributeInternal(RWKQTY, value);
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
     * Gets the attribute value for UomConvFctr, using the alias name UomConvFctr.
     * @return the value of UomConvFctr
     */
    public Number getUomConvFctr() {
        return (Number)getAttributeInternal(UOMCONVFCTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomConvFctr.
     * @param value value to set the UomConvFctr
     */
    public void setUomConvFctr(Number value) {
        setAttributeInternal(UOMCONVFCTR, value);
    }

    /**
     * Gets the attribute value for OkQtyBs, using the alias name OkQtyBs.
     * @return the value of OkQtyBs
     */
    public Number getOkQtyBs() {
        return (Number)getAttributeInternal(OKQTYBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for OkQtyBs.
     * @param value value to set the OkQtyBs
     */
    public void setOkQtyBs(Number value) {
        setAttributeInternal(OKQTYBS, value);
    }

    /**
     * Gets the attribute value for RejQtyBs, using the alias name RejQtyBs.
     * @return the value of RejQtyBs
     */
    public Number getRejQtyBs() {
        return (Number)getAttributeInternal(REJQTYBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RejQtyBs.
     * @param value value to set the RejQtyBs
     */
    public void setRejQtyBs(Number value) {
        setAttributeInternal(REJQTYBS, value);
    }

    /**
     * Gets the attribute value for RwkQtyBs, using the alias name RwkQtyBs.
     * @return the value of RwkQtyBs
     */
    public Number getRwkQtyBs() {
        return (Number)getAttributeInternal(RWKQTYBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for RwkQtyBs.
     * @param value value to set the RwkQtyBs
     */
    public void setRwkQtyBs(Number value) {
        setAttributeInternal(RWKQTYBS, value);
    }

    /**
     * Gets the attribute value for ScrpQty, using the alias name ScrpQty.
     * @return the value of ScrpQty
     */
    public Number getScrpQty() {
        return (Number)getAttributeInternal(SCRPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ScrpQty.
     * @param value value to set the ScrpQty
     */
    public void setScrpQty(Number value) {
        setAttributeInternal(SCRPQTY, value);
    }

    /**
     * Gets the attribute value for ScrpQtyBs, using the alias name ScrpQtyBs.
     * @return the value of ScrpQtyBs
     */
    public Number getScrpQtyBs() {
        return (Number)getAttributeInternal(SCRPQTYBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ScrpQtyBs.
     * @param value value to set the ScrpQtyBs
     */
    public void setScrpQtyBs(Number value) {
        setAttributeInternal(SCRPQTYBS, value);
    }

    /**
     * Gets the attribute value for TransOkQtyBs, using the alias name TransOkQtyBs.
     * @return the value of TransOkQtyBs
     */
    public Number getTransOkQtyBs() {
        return (Number)getAttributeInternal(TRANSOKQTYBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransOkQtyBs.
     * @param value value to set the TransOkQtyBs
     */
    public void setTransOkQtyBs(Number value) {
        setAttributeInternal(TRANSOKQTYBS, value);
    }

    /**
     * Gets the attribute value for TransOkQty, using the alias name TransOkQty.
     * @return the value of TransOkQty
     */
    public Number getTransOkQty() {
        return (Number)getAttributeInternal(TRANSOKQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransOkQty.
     * @param value value to set the TransOkQty
     */
    public void setTransOkQty(Number value) {
        setAttributeInternal(TRANSOKQTY, value);
    }

    /**
     * Gets the attribute value for TransRejQty, using the alias name TransRejQty.
     * @return the value of TransRejQty
     */
    public Number getTransRejQty() {
        return (Number)getAttributeInternal(TRANSREJQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransRejQty.
     * @param value value to set the TransRejQty
     */
    public void setTransRejQty(Number value) {
        setAttributeInternal(TRANSREJQTY, value);
    }

    /**
     * Gets the attribute value for TransRwkQty, using the alias name TransRwkQty.
     * @return the value of TransRwkQty
     */
    public Number getTransRwkQty() {
        return (Number)getAttributeInternal(TRANSRWKQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransRwkQty.
     * @param value value to set the TransRwkQty
     */
    public void setTransRwkQty(Number value) {
        setAttributeInternal(TRANSRWKQTY, value);
    }

    /**
     * Gets the attribute value for TransScrpQty, using the alias name TransScrpQty.
     * @return the value of TransScrpQty
     */
    public Number getTransScrpQty() {
        return (Number)getAttributeInternal(TRANSSCRPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransScrpQty.
     * @param value value to set the TransScrpQty
     */
    public void setTransScrpQty(Number value) {
        setAttributeInternal(TRANSSCRPQTY, value);
    }

    /**
     * Gets the attribute value for TransTotRetQty, using the alias name TransTotRetQty.
     * @return the value of TransTotRetQty
     */
    public Number getTransTotRetQty() {
        return (Number)getAttributeInternal(TRANSTOTRETQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransTotRetQty.
     * @param value value to set the TransTotRetQty
     */
    public void setTransTotRetQty(Number value) {
        setAttributeInternal(TRANSTOTRETQTY, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public MmMrnEOImpl getMmMrn() {
        return (MmMrnEOImpl)getAttributeInternal(MMMRN);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setMmMrn(MmMrnEOImpl value) {
        setAttributeInternal(MMMRN, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmMrnItmStk() {
        return (RowIterator)getAttributeInternal(MMMRNITMSTK);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param docId key constituent
     * @param itmId key constituent
     * @param itmUom key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String docId, String itmId,
                                       String itmUom) {
        return new Key(new Object[]{cldId, slocId, orgId, docId, itmId, itmUom});
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
        setOkQty(null);
        System.out.println("inside do dml---------");
        super.doDML(operation, e);
    }
}
