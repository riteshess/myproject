package externalentitysetup.model.views;

import externalentitysetup.model.entities.AppEoMstEOImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 09 15:28:27 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppEoMstVORowImpl extends ViewRowImpl {


    public static final int ENTITY_APPEOMSTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EoMstSlocId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstSlocId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstSlocId((Integer)value);
            }
        }
        ,
        EoMstId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstId((Integer)value);
            }
        }
        ,
        EoMstNm {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstNm();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstNm((String)value);
            }
        }
        ,
        EoMstAlias {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstAlias();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstAlias((String)value);
            }
        }
        ,
        EoMstLegCd {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstLegCd();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstLegCd((String)value);
            }
        }
        ,
        EoMstActv {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoMstActv();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoMstActv((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Date)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Date)value);
            }
        }
        ,
        SsId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getSsId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setSsId((Integer)value);
            }
        }
        ,
        EoOrgId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoOrgId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoOrgId((String)value);
            }
        }
        ,
        EoHoOrgId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoHoOrgId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoHoOrgId((String)value);
            }
        }
        ,
        EoCldId {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getEoCldId();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setEoCldId((String)value);
            }
        }
        ,
        AppEo {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getAppEo();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovUserIdVO {
            public Object get(AppEoMstVORowImpl obj) {
                return obj.getLovUserIdVO();
            }

            public void put(AppEoMstVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppEoMstVORowImpl object);

        public abstract void put(AppEoMstVORowImpl object, Object value);

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


    public static final int EOMSTSLOCID = AttributesEnum.EoMstSlocId.index();
    public static final int EOMSTID = AttributesEnum.EoMstId.index();
    public static final int EOMSTNM = AttributesEnum.EoMstNm.index();
    public static final int EOMSTALIAS = AttributesEnum.EoMstAlias.index();
    public static final int EOMSTLEGCD = AttributesEnum.EoMstLegCd.index();
    public static final int EOMSTACTV = AttributesEnum.EoMstActv.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int SSID = AttributesEnum.SsId.index();
    public static final int EOORGID = AttributesEnum.EoOrgId.index();
    public static final int EOHOORGID = AttributesEnum.EoHoOrgId.index();
    public static final int EOCLDID = AttributesEnum.EoCldId.index();
    public static final int APPEO = AttributesEnum.AppEo.index();
    public static final int LOVUSERIDVO = AttributesEnum.LovUserIdVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppEoMstVORowImpl() {
    }

    /**
     * Gets AppEoMstEO entity object.
     * @return the AppEoMstEO
     */
    public AppEoMstEOImpl getAppEoMstEO() {
        return (AppEoMstEOImpl)getEntity(ENTITY_APPEOMSTEO);
    }

    /**
     * Gets the attribute value for EO_MST_SLOC_ID using the alias name EoMstSlocId.
     * @return the EO_MST_SLOC_ID
     */
    public Integer getEoMstSlocId() {
        return (Integer) getAttributeInternal(EOMSTSLOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_SLOC_ID using the alias name EoMstSlocId.
     * @param value value to set the EO_MST_SLOC_ID
     */
    public void setEoMstSlocId(Integer value) {
        setAttributeInternal(EOMSTSLOCID, value);
    }

    /**
     * Gets the attribute value for EO_MST_ID using the alias name EoMstId.
     * @return the EO_MST_ID
     */
    public Integer getEoMstId() {
        return (Integer) getAttributeInternal(EOMSTID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_ID using the alias name EoMstId.
     * @param value value to set the EO_MST_ID
     */
    public void setEoMstId(Integer value) {
        setAttributeInternal(EOMSTID, value);
    }

    /**
     * Gets the attribute value for EO_MST_NM using the alias name EoMstNm.
     * @return the EO_MST_NM
     */
    public String getEoMstNm() {
        return (String) getAttributeInternal(EOMSTNM);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_NM using the alias name EoMstNm.
     * @param value value to set the EO_MST_NM
     */
    public void setEoMstNm(String value) {
        setAttributeInternal(EOMSTNM, value.trim());
    }

    /**
     * Gets the attribute value for EO_MST_ALIAS using the alias name EoMstAlias.
     * @return the EO_MST_ALIAS
     */
    public String getEoMstAlias() {
        return (String) getAttributeInternal(EOMSTALIAS);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_ALIAS using the alias name EoMstAlias.
     * @param value value to set the EO_MST_ALIAS
     */
    public void setEoMstAlias(String value) {
        setAttributeInternal(EOMSTALIAS, value);
    }

    /**
     * Gets the attribute value for EO_MST_LEG_CD using the alias name EoMstLegCd.
     * @return the EO_MST_LEG_CD
     */
    public String getEoMstLegCd() {
        return (String) getAttributeInternal(EOMSTLEGCD);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_LEG_CD using the alias name EoMstLegCd.
     * @param value value to set the EO_MST_LEG_CD
     */
    public void setEoMstLegCd(String value) {
        setAttributeInternal(EOMSTLEGCD, value);
    }

    /**
     * Gets the attribute value for EO_MST_ACTV using the alias name EoMstActv.
     * @return the EO_MST_ACTV
     */
    public String getEoMstActv() {
        return (String) getAttributeInternal(EOMSTACTV);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_MST_ACTV using the alias name EoMstActv.
     * @param value value to set the EO_MST_ACTV
     */
    public void setEoMstActv(String value) {
        setAttributeInternal(EOMSTACTV, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @return the USR_ID_CREATE
     */
    public Integer getUsrIdCreate() {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @param value value to set the USR_ID_CREATE
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @return the USR_ID_CREATE_DT
     */
    public Date getUsrIdCreateDt() {
        return (Date) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @param value value to set the USR_ID_CREATE_DT
     */
    public void setUsrIdCreateDt(Date value) {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @return the USR_ID_MOD
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @param value value to set the USR_ID_MOD
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @return the USR_ID_MOD_DT
     */
    public Date getUsrIdModDt() {
        return (Date) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @param value value to set the USR_ID_MOD_DT
     */
    public void setUsrIdModDt(Date value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for SS_ID using the alias name SsId.
     * @return the SS_ID
     */
    public Integer getSsId() {
        return (Integer) getAttributeInternal(SSID);
    }

    /**
     * Sets <code>value</code> as attribute value for SS_ID using the alias name SsId.
     * @param value value to set the SS_ID
     */
    public void setSsId(Integer value) {
        setAttributeInternal(SSID, value);
    }

    /**
     * Gets the attribute value for EO_ORG_ID using the alias name EoOrgId.
     * @return the EO_ORG_ID
     */
    public String getEoOrgId() {
        return (String) getAttributeInternal(EOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_ORG_ID using the alias name EoOrgId.
     * @param value value to set the EO_ORG_ID
     */
    public void setEoOrgId(String value) {
        setAttributeInternal(EOORGID, value);
    }

    /**
     * Gets the attribute value for EO_HO_ORG_ID using the alias name EoHoOrgId.
     * @return the EO_HO_ORG_ID
     */
    public String getEoHoOrgId() {
        return (String) getAttributeInternal(EOHOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_HO_ORG_ID using the alias name EoHoOrgId.
     * @param value value to set the EO_HO_ORG_ID
     */
    public void setEoHoOrgId(String value) {
        setAttributeInternal(EOHOORGID, value);
    }

    /**
     * Gets the attribute value for EO_CLD_ID using the alias name EoCldId.
     * @return the EO_CLD_ID
     */
    public String getEoCldId() {
        return (String) getAttributeInternal(EOCLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_CLD_ID using the alias name EoCldId.
     * @param value value to set the EO_CLD_ID
     */
    public void setEoCldId(String value) {
        setAttributeInternal(EOCLDID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link AppEo.
     */
    public RowIterator getAppEo() {
        return (RowIterator)getAttributeInternal(APPEO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> LovUserIdVO.
     */
    public RowSet getLovUserIdVO() {
        return (RowSet)getAttributeInternal(LOVUSERIDVO);
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
