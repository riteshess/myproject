package mmgatepass.model.views;

import java.math.BigDecimal;

import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 18 17:00:37 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmPurRetnItmVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SlocId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DocId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrgId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CldId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        WhId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getWhId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ItmId {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getItmId();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ItmUom {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getItmUom();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ItmUomBs {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getItmUomBs();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UomConvFctr {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getUomConvFctr();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TotRetQty {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getTotRetQty();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RejQty {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getRejQty();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RwkQty {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getRwkQty();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RejQtyBs {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getRejQtyBs();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RwkQtyBs {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getRwkQtyBs();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OkQty {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getOkQty();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OkQtyBs {
            public Object get(MmPurRetnItmVORowImpl obj) {
                return obj.getOkQtyBs();
            }

            public void put(MmPurRetnItmVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmPurRetnItmVORowImpl object);

        public abstract void put(MmPurRetnItmVORowImpl object, Object value);

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
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int ITMUOMBS = AttributesEnum.ItmUomBs.index();
    public static final int UOMCONVFCTR = AttributesEnum.UomConvFctr.index();
    public static final int TOTRETQTY = AttributesEnum.TotRetQty.index();
    public static final int REJQTY = AttributesEnum.RejQty.index();
    public static final int RWKQTY = AttributesEnum.RwkQty.index();
    public static final int REJQTYBS = AttributesEnum.RejQtyBs.index();
    public static final int RWKQTYBS = AttributesEnum.RwkQtyBs.index();
    public static final int OKQTY = AttributesEnum.OkQty.index();
    public static final int OKQTYBS = AttributesEnum.OkQtyBs.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmPurRetnItmVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }


    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }


    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }


    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }


    /**
     * Gets the attribute value for the calculated attribute WhId.
     * @return the WhId
     */
    public String getWhId() {
        return (String) getAttributeInternal(WHID);
    }


    /**
     * Gets the attribute value for the calculated attribute ItmId.
     * @return the ItmId
     */
    public String getItmId() {
        return (String) getAttributeInternal(ITMID);
    }


    /**
     * Gets the attribute value for the calculated attribute ItmUom.
     * @return the ItmUom
     */
    public String getItmUom() {
        return (String) getAttributeInternal(ITMUOM);
    }


    /**
     * Gets the attribute value for the calculated attribute TotRetQty.
     * @return the TotRetQty
     */
    public Number getTotRetQty() {
        return (Number) getAttributeInternal(TOTRETQTY);
    }


    /**
     * Gets the attribute value for the calculated attribute RejQty.
     * @return the RejQty
     */
    public Number getRejQty() {
        return (Number) getAttributeInternal(REJQTY);
    }


    /**
     * Gets the attribute value for the calculated attribute RwkQty.
     * @return the RwkQty
     */
    public Number getRwkQty() {
        return (Number) getAttributeInternal(RWKQTY);
    }


    /**
     * Gets the attribute value for the calculated attribute ItmUomBs.
     * @return the ItmUomBs
     */
    public String getItmUomBs() {
        return (String) getAttributeInternal(ITMUOMBS);
    }


    /**
     * Gets the attribute value for the calculated attribute UomConvFctr.
     * @return the UomConvFctr
     */
    public Number getUomConvFctr() {
        return (Number) getAttributeInternal(UOMCONVFCTR);
    }


    /**
     * Gets the attribute value for the calculated attribute RejQtyBs.
     * @return the RejQtyBs
     */
    public Number getRejQtyBs() {
        return (Number) getAttributeInternal(REJQTYBS);
    }


    /**
     * Gets the attribute value for the calculated attribute RwkQtyBs.
     * @return the RwkQtyBs
     */
    public Number getRwkQtyBs() {
        return (Number) getAttributeInternal(RWKQTYBS);
    }


    /**
     * Gets the attribute value for the calculated attribute OkQty.
     * @return the OkQty
     */
    public Number getOkQty() {
        return (Number) getAttributeInternal(OKQTY);
    }

    /**
     * Gets the attribute value for the calculated attribute OkQtyBs.
     * @return the OkQtyBs
     */
    public Number getOkQtyBs() {
        return (Number) getAttributeInternal(OKQTYBS);
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
}
