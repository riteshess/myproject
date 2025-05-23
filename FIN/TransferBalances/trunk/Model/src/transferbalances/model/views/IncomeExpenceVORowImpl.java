package transferbalances.model.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 10 17:47:55 PST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class IncomeExpenceVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrgId {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrgFyId {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getOrgFyId();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CoaId {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getCoaId();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CoaNm {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getCoaNm();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OpBal {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getOpBal();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OpBalType {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getOpBalType();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DrAmt {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getDrAmt();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CrAmt {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getCrAmt();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ClBal {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getClBal();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ClBalType {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getClBalType();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ClosingBal {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getClosingBal();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setClosingBal((Number) value);
            }
        }
        ,
        ClosingBalType {
            public Object get(IncomeExpenceVORowImpl obj) {
                return obj.getClosingBalType();
            }

            public void put(IncomeExpenceVORowImpl obj, Object value) {
                obj.setClosingBalType((String) value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(IncomeExpenceVORowImpl object);

        public abstract void put(IncomeExpenceVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ORGFYID = AttributesEnum.OrgFyId.index();
    public static final int COAID = AttributesEnum.CoaId.index();
    public static final int COANM = AttributesEnum.CoaNm.index();
    public static final int OPBAL = AttributesEnum.OpBal.index();
    public static final int OPBALTYPE = AttributesEnum.OpBalType.index();
    public static final int DRAMT = AttributesEnum.DrAmt.index();
    public static final int CRAMT = AttributesEnum.CrAmt.index();
    public static final int CLBAL = AttributesEnum.ClBal.index();
    public static final int CLBALTYPE = AttributesEnum.ClBalType.index();
    public static final int CLOSINGBAL = AttributesEnum.ClosingBal.index();
    public static final int CLOSINGBALTYPE = AttributesEnum.ClosingBalType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public IncomeExpenceVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgFyId.
     * @return the OrgFyId
     */
    public Integer getOrgFyId() {
        return (Integer) getAttributeInternal(ORGFYID);
    }

    /**
     * Gets the attribute value for the calculated attribute CoaId.
     * @return the CoaId
     */
    public Integer getCoaId() {
        return (Integer) getAttributeInternal(COAID);
    }


    /**
     * Gets the attribute value for the calculated attribute CoaNm.
     * @return the CoaNm
     */
    public String getCoaNm() {
        return (String) getAttributeInternal(COANM);
    }

    /**
     * Gets the attribute value for the calculated attribute OpBal.
     * @return the OpBal
     */
    public Number getOpBal() {
        return (Number) getAttributeInternal(OPBAL);
    }

    /**
     * Gets the attribute value for the calculated attribute OpBalType.
     * @return the OpBalType
     */
    public String getOpBalType() {
        return (String) getAttributeInternal(OPBALTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute DrAmt.
     * @return the DrAmt
     */
    public Number getDrAmt() {
        return (Number) getAttributeInternal(DRAMT);
    }

    /**
     * Gets the attribute value for the calculated attribute CrAmt.
     * @return the CrAmt
     */
    public Number getCrAmt() {
        return (Number) getAttributeInternal(CRAMT);
    }

    /**
     * Gets the attribute value for the calculated attribute ClBal.
     * @return the ClBal
     */
    public Number getClBal() {
        return (Number) getAttributeInternal(CLBAL);
    }

    /**
     * Gets the attribute value for the calculated attribute ClBalType.
     * @return the ClBalType
     */
    public String getClBalType() {
        return (String) getAttributeInternal(CLBALTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute ClosingBal.
     * @return the ClosingBal
     */
    public Number getClosingBal() {
        System.out.println("getAttributeInternal(CLOSINGBAL) = "+getAttributeInternal(CLOSINGBAL));
        return (Number) getAttributeInternal(CLOSINGBAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ClosingBal.
     * @param value value to set the  ClosingBal
     */
    public void setClosingBal(Number value) {
        if(value.compareTo(0)<0){
            value=value.multiply(-1);
            setClosingBalType("Dr");
        }
        setAttributeInternal(CLOSINGBAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ClosingBalType.
     * @return the ClosingBalType
     */
    public String getClosingBalType() {
        return (String) getAttributeInternal(CLOSINGBALTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ClosingBalType.
     * @param value value to set the  ClosingBalType
     */
    public void setClosingBalType(String value) {
        setAttributeInternal(CLOSINGBALTYPE, value);
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

