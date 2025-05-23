package mmsupplierperfeval.model.views;

import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 22 11:18:16 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppEoPrfVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EoSlocId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoSlocId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoSlocId((Integer)value);
            }
        }
        ,
        EoCldId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoCldId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoCldId((String)value);
            }
        }
        ,
        EoMstId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoMstId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoMstId((Integer)value);
            }
        }
        ,
        EoType {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoType();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoType((Integer)value);
            }
        }
        ,
        EoId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoId((Integer)value);
            }
        }
        ,
        EoNm {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoNm();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoNm((String)value);
            }
        }
        ,
        BlackListed {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getBlackListed();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setBlackListed((String)value);
            }
        }
        ,
        OnHold {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getOnHold();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setOnHold((String)value);
            }
        }
        ,
        OrgId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        EoHoOrgId {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getEoHoOrgId();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setEoHoOrgId((String)value);
            }
        }
        ,
        MmEoPerfEval {
            public Object get(AppEoPrfVORowImpl obj) {
                return obj.getMmEoPerfEval();
            }

            public void put(AppEoPrfVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppEoPrfVORowImpl object);

        public abstract void put(AppEoPrfVORowImpl object, Object value);

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


    public static final int EOSLOCID = AttributesEnum.EoSlocId.index();
    public static final int EOCLDID = AttributesEnum.EoCldId.index();
    public static final int EOMSTID = AttributesEnum.EoMstId.index();
    public static final int EOTYPE = AttributesEnum.EoType.index();
    public static final int EOID = AttributesEnum.EoId.index();
    public static final int EONM = AttributesEnum.EoNm.index();
    public static final int BLACKLISTED = AttributesEnum.BlackListed.index();
    public static final int ONHOLD = AttributesEnum.OnHold.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int EOHOORGID = AttributesEnum.EoHoOrgId.index();
    public static final int MMEOPERFEVAL = AttributesEnum.MmEoPerfEval.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppEoPrfVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute EoSlocId.
     * @return the EoSlocId
     */
    public Integer getEoSlocId() {
        return (Integer) getAttributeInternal(EOSLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoSlocId.
     * @param value value to set the  EoSlocId
     */
    public void setEoSlocId(Integer value) {
        setAttributeInternal(EOSLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoCldId.
     * @return the EoCldId
     */
    public String getEoCldId() {
        return (String) getAttributeInternal(EOCLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoCldId.
     * @param value value to set the  EoCldId
     */
    public void setEoCldId(String value) {
        setAttributeInternal(EOCLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoMstId.
     * @return the EoMstId
     */
    public Integer getEoMstId() {
        return (Integer) getAttributeInternal(EOMSTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoMstId.
     * @param value value to set the  EoMstId
     */
    public void setEoMstId(Integer value) {
        setAttributeInternal(EOMSTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoType.
     * @return the EoType
     */
    public Integer getEoType() {
        return (Integer) getAttributeInternal(EOTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoType.
     * @param value value to set the  EoType
     */
    public void setEoType(Integer value) {
        setAttributeInternal(EOTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoId.
     * @return the EoId
     */
    public Integer getEoId() {
        return (Integer) getAttributeInternal(EOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoId.
     * @param value value to set the  EoId
     */
    public void setEoId(Integer value) {
        setAttributeInternal(EOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoNm.
     * @return the EoNm
     */
    public String getEoNm() {
        return (String) getAttributeInternal(EONM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoNm.
     * @param value value to set the  EoNm
     */
    public void setEoNm(String value) {
        setAttributeInternal(EONM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BlackListed.
     * @return the BlackListed
     */
    public String getBlackListed() {
        return (String) getAttributeInternal(BLACKLISTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BlackListed.
     * @param value value to set the  BlackListed
     */
    public void setBlackListed(String value) {
        setAttributeInternal(BLACKLISTED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OnHold.
     * @return the OnHold
     */
    public String getOnHold() {
        return (String) getAttributeInternal(ONHOLD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OnHold.
     * @param value value to set the  OnHold
     */
    public void setOnHold(String value) {
        setAttributeInternal(ONHOLD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
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
     * Gets the attribute value for the calculated attribute EoHoOrgId.
     * @return the EoHoOrgId
     */
    public String getEoHoOrgId() {
        return (String) getAttributeInternal(EOHOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoHoOrgId.
     * @param value value to set the  EoHoOrgId
     */
    public void setEoHoOrgId(String value) {
        setAttributeInternal(EOHOORGID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link MmEoPerfEval.
     */
    public RowIterator getMmEoPerfEval() {
        return (RowIterator)getAttributeInternal(MMEOPERFEVAL);
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
