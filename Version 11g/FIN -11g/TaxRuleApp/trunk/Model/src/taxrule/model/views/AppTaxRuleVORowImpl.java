package taxrule.model.views;

import java.math.BigDecimal;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;

import taxrule.model.entities.AppTaxRuleEOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jan 24 17:40:18 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppTaxRuleVORowImpl extends ViewRowImpl {


    public static final int ENTITY_APPTAXRULEEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        TaxRuleActv {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleActv();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleActv((String)value);
            }
        }
        ,
        TaxRuleCalcRoundPnt {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleCalcRoundPnt();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleCalcRoundPnt((Integer)value);
            }
        }
        ,
        TaxRuleCalcRoundTo {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleCalcRoundTo();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleCalcRoundTo((Number)value);
            }
        }
        ,
        TaxRuleDesc {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleDesc();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleDesc((String)value);
            }
        }
        ,
        TaxCldId {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxCldId();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxCldId((String)value);
            }
        }
        ,
        TaxHoOrgId {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxHoOrgId();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxHoOrgId((String)value);
            }
        }
        ,
        TaxRuleFinalised {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleFinalised();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleFinalised((String)value);
            }
        }
        ,
        TaxRuleId {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleId();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleId((Integer)value);
            }
        }
        ,
        TaxRuleInclType {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleInclType();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleInclType((String)value);
            }
        }
        ,
        TaxRuleRoundLogic {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleRoundLogic();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleRoundLogic((String)value);
            }
        }
        ,
        TaxRuleSlocId {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleSlocId();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleSlocId((Integer)value);
            }
        }
        ,
        TaxRuleStrtDt {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleStrtDt();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleStrtDt((Date)value);
            }
        }
        ,
        TaxRuleValidityDt {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxRuleValidityDt();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxRuleValidityDt((Date)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Date)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Date)value);
            }
        }
        ,
        TaxTypeTds {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getTaxTypeTds();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setTaxTypeTds((String)value);
            }
        }
        ,
        DaysPassedLogic {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getDaysPassedLogic();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setDaysPassedLogic((String)value);
            }
        }
        ,
        DaysLeftLogic {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getDaysLeftLogic();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setDaysLeftLogic((String)value);
            }
        }
        ,
        StatusLogic {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getStatusLogic();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setStatusLogic((String)value);
            }
        }
        ,
        AppTaxRuleLine {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getAppTaxRuleLine();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UserLOV {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUserLOV();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UserLOV1 {
            public Object get(AppTaxRuleVORowImpl obj) {
                return obj.getUserLOV1();
            }

            public void put(AppTaxRuleVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppTaxRuleVORowImpl object);

        public abstract void put(AppTaxRuleVORowImpl object, Object value);

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


    public static final int TAXRULEACTV = AttributesEnum.TaxRuleActv.index();
    public static final int TAXRULECALCROUNDPNT = AttributesEnum.TaxRuleCalcRoundPnt.index();
    public static final int TAXRULECALCROUNDTO = AttributesEnum.TaxRuleCalcRoundTo.index();
    public static final int TAXRULEDESC = AttributesEnum.TaxRuleDesc.index();
    public static final int TAXCLDID = AttributesEnum.TaxCldId.index();
    public static final int TAXHOORGID = AttributesEnum.TaxHoOrgId.index();
    public static final int TAXRULEFINALISED = AttributesEnum.TaxRuleFinalised.index();
    public static final int TAXRULEID = AttributesEnum.TaxRuleId.index();
    public static final int TAXRULEINCLTYPE = AttributesEnum.TaxRuleInclType.index();
    public static final int TAXRULEROUNDLOGIC = AttributesEnum.TaxRuleRoundLogic.index();
    public static final int TAXRULESLOCID = AttributesEnum.TaxRuleSlocId.index();
    public static final int TAXRULESTRTDT = AttributesEnum.TaxRuleStrtDt.index();
    public static final int TAXRULEVALIDITYDT = AttributesEnum.TaxRuleValidityDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int TAXTYPETDS = AttributesEnum.TaxTypeTds.index();
    public static final int DAYSPASSEDLOGIC = AttributesEnum.DaysPassedLogic.index();
    public static final int DAYSLEFTLOGIC = AttributesEnum.DaysLeftLogic.index();
    public static final int STATUSLOGIC = AttributesEnum.StatusLogic.index();
    public static final int APPTAXRULELINE = AttributesEnum.AppTaxRuleLine.index();
    public static final int USERLOV = AttributesEnum.UserLOV.index();
    public static final int USERLOV1 = AttributesEnum.UserLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppTaxRuleVORowImpl() {
    }

    /**
     * Gets AppTaxRuleEO entity object.
     * @return the AppTaxRuleEO
     */
    public AppTaxRuleEOImpl getAppTaxRuleEO() {
        return (AppTaxRuleEOImpl)getEntity(ENTITY_APPTAXRULEEO);
    }

    /**
     * Gets the attribute value for TAX_RULE_ACTV using the alias name TaxRuleActv.
     * @return the TAX_RULE_ACTV
     */
    public String getTaxRuleActv() {
        return (String) getAttributeInternal(TAXRULEACTV);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_ACTV using the alias name TaxRuleActv.
     * @param value value to set the TAX_RULE_ACTV
     */
    public void setTaxRuleActv(String value) {
        setAttributeInternal(TAXRULEACTV, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_CALC_ROUND_PNT using the alias name TaxRuleCalcRoundPnt.
     * @return the TAX_RULE_CALC_ROUND_PNT
     */
    public Integer getTaxRuleCalcRoundPnt() {
        return (Integer) getAttributeInternal(TAXRULECALCROUNDPNT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_CALC_ROUND_PNT using the alias name TaxRuleCalcRoundPnt.
     * @param value value to set the TAX_RULE_CALC_ROUND_PNT
     */
    public void setTaxRuleCalcRoundPnt(Integer value) {
        setAttributeInternal(TAXRULECALCROUNDPNT, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_CALC_ROUND_TO using the alias name TaxRuleCalcRoundTo.
     * @return the TAX_RULE_CALC_ROUND_TO
     */
    public oracle.jbo.domain.Number getTaxRuleCalcRoundTo() {
        return (oracle.jbo.domain.Number)getAttributeInternal(TAXRULECALCROUNDTO);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_CALC_ROUND_TO using the alias name TaxRuleCalcRoundTo.
     * @param value value to set the TAX_RULE_CALC_ROUND_TO
     */
    public void setTaxRuleCalcRoundTo(oracle.jbo.domain.Number value) {
        setAttributeInternal(TAXRULECALCROUNDTO, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_DESC using the alias name TaxRuleDesc.
     * @return the TAX_RULE_DESC
     */
    public String getTaxRuleDesc() {
        return (String) getAttributeInternal(TAXRULEDESC);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_DESC using the alias name TaxRuleDesc.
     * @param value value to set the TAX_RULE_DESC
     */
    public void setTaxRuleDesc(String value) {
        setAttributeInternal(TAXRULEDESC, value);
    }

    /**
     * Gets the attribute value for TAX_CLD_ID using the alias name TaxCldId.
     * @return the TAX_CLD_ID
     */
    public String getTaxCldId() {
        return (String) getAttributeInternal(TAXCLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_CLD_ID using the alias name TaxCldId.
     * @param value value to set the TAX_CLD_ID
     */
    public void setTaxCldId(String value) {
        setAttributeInternal(TAXCLDID, value);
    }

    /**
     * Gets the attribute value for TAX_HO_ORG_ID using the alias name TaxHoOrgId.
     * @return the TAX_HO_ORG_ID
     */
    public String getTaxHoOrgId() {
        return (String) getAttributeInternal(TAXHOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_HO_ORG_ID using the alias name TaxHoOrgId.
     * @param value value to set the TAX_HO_ORG_ID
     */
    public void setTaxHoOrgId(String value) {
        setAttributeInternal(TAXHOORGID, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_FINALISED using the alias name TaxRuleFinalised.
     * @return the TAX_RULE_FINALISED
     */
    public String getTaxRuleFinalised() {
        return (String) getAttributeInternal(TAXRULEFINALISED);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_FINALISED using the alias name TaxRuleFinalised.
     * @param value value to set the TAX_RULE_FINALISED
     */
    public void setTaxRuleFinalised(String value) {
        setAttributeInternal(TAXRULEFINALISED, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_ID using the alias name TaxRuleId.
     * @return the TAX_RULE_ID
     */
    public Integer getTaxRuleId() {
        return (Integer)getAttributeInternal(TAXRULEID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_ID using the alias name TaxRuleId.
     * @param value value to set the TAX_RULE_ID
     */
    public void setTaxRuleId(Integer value) {
        setAttributeInternal(TAXRULEID, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_INCL_TYPE using the alias name TaxRuleInclType.
     * @return the TAX_RULE_INCL_TYPE
     */
    public String getTaxRuleInclType() {
        return (String) getAttributeInternal(TAXRULEINCLTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_INCL_TYPE using the alias name TaxRuleInclType.
     * @param value value to set the TAX_RULE_INCL_TYPE
     */
    public void setTaxRuleInclType(String value) {
        setAttributeInternal(TAXRULEINCLTYPE, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_ROUND_LOGIC using the alias name TaxRuleRoundLogic.
     * @return the TAX_RULE_ROUND_LOGIC
     */
    public String getTaxRuleRoundLogic() {
        return (String) getAttributeInternal(TAXRULEROUNDLOGIC);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_ROUND_LOGIC using the alias name TaxRuleRoundLogic.
     * @param value value to set the TAX_RULE_ROUND_LOGIC
     */
    public void setTaxRuleRoundLogic(String value) {
        setAttributeInternal(TAXRULEROUNDLOGIC, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_SLOC_ID using the alias name TaxRuleSlocId.
     * @return the TAX_RULE_SLOC_ID
     */
    public Integer getTaxRuleSlocId() {
        return (Integer) getAttributeInternal(TAXRULESLOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_SLOC_ID using the alias name TaxRuleSlocId.
     * @param value value to set the TAX_RULE_SLOC_ID
     */
    public void setTaxRuleSlocId(Integer value) {
        setAttributeInternal(TAXRULESLOCID, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_STRT_DT using the alias name TaxRuleStrtDt.
     * @return the TAX_RULE_STRT_DT
     */
    public Date getTaxRuleStrtDt() {
        return (Date) getAttributeInternal(TAXRULESTRTDT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_STRT_DT using the alias name TaxRuleStrtDt.
     * @param value value to set the TAX_RULE_STRT_DT
     */
    public void setTaxRuleStrtDt(Date value) {
        setAttributeInternal(TAXRULESTRTDT, value);
    }

    /**
     * Gets the attribute value for TAX_RULE_VALIDITY_DT using the alias name TaxRuleValidityDt.
     * @return the TAX_RULE_VALIDITY_DT
     */
    public Date getTaxRuleValidityDt() {
        return (Date) getAttributeInternal(TAXRULEVALIDITYDT);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_RULE_VALIDITY_DT using the alias name TaxRuleValidityDt.
     * @param value value to set the TAX_RULE_VALIDITY_DT
     */
    public void setTaxRuleValidityDt(Date value) {
        setAttributeInternal(TAXRULEVALIDITYDT, value);
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
     * Gets the attribute value for TAX_TYPE_TDS using the alias name TaxTypeTds.
     * @return the TAX_TYPE_TDS
     */
    public String getTaxTypeTds() {
        return (String) getAttributeInternal(TAXTYPETDS);
    }

    /**
     * Sets <code>value</code> as attribute value for TAX_TYPE_TDS using the alias name TaxTypeTds.
     * @param value value to set the TAX_TYPE_TDS
     */
    public void setTaxTypeTds(String value) {
        setAttributeInternal(TAXTYPETDS, value);
    }


    /**
     * Gets the attribute value for the calculated attribute DaysPassedLogic.
     * @return the DaysPassedLogic
     */
    public String getDaysPassedLogic() {
        return (String) getAttributeInternal(DAYSPASSEDLOGIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DaysPassedLogic.
     * @param value value to set the  DaysPassedLogic
     */
    public void setDaysPassedLogic(String value) {
        setAttributeInternal(DAYSPASSEDLOGIC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DaysLeftLogic.
     * @return the DaysLeftLogic
     */
    public String getDaysLeftLogic() {
        return (String) getAttributeInternal(DAYSLEFTLOGIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DaysLeftLogic.
     * @param value value to set the  DaysLeftLogic
     */
    public void setDaysLeftLogic(String value) {
        setAttributeInternal(DAYSLEFTLOGIC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StatusLogic.
     * @return the StatusLogic
     */
    public String getStatusLogic() {
        return (String) getAttributeInternal(STATUSLOGIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StatusLogic.
     * @param value value to set the  StatusLogic
     */
    public void setStatusLogic(String value) {
        setAttributeInternal(STATUSLOGIC, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link AppTaxRuleLine.
     */
    public RowIterator getAppTaxRuleLine() {
        return (RowIterator)getAttributeInternal(APPTAXRULELINE);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserLOV.
     */
    public RowSet getUserLOV() {
        return (RowSet)getAttributeInternal(USERLOV);
    }


    /**
     * Gets the view accessor <code>RowSet</code> UserLOV1.
     */
    public RowSet getUserLOV1() {
        return (RowSet)getAttributeInternal(USERLOV1);
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
