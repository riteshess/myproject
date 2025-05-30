package slspricemasterapp.model.views;

import java.math.BigDecimal;

import java.math.BigInteger;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;

import slspricemasterapp.model.entities.PriceMasterEOImpl;
import slspricemasterapp.model.services.SLSPriceMasterAppAMImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 30 12:50:42 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PriceMasterVORowImpl extends ViewRowImpl {


    public static final int ENTITY_PRICEMASTEREO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CatgId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getCatgId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setCatgId((Integer)value);
            }
        }
        ,
        CldId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        EffectiveDt {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getEffectiveDt();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setEffectiveDt((Timestamp)value);
            }
        }
        ,
        EoId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getEoId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setEoId((Number)value);
            }
        }
        ,
        HoOrgId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        ItmId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getItmId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ItmUom {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getItmUom();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setItmUom((String)value);
            }
        }
        ,
        MinPrice {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getMinPrice();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setMinPrice((Number)value);
            }
        }
        ,
        MrpPrice {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getMrpPrice();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setMrpPrice((Number)value);
            }
        }
        ,
        MrpRate {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getMrpRate();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setMrpRate((Number)value);
            }
        }
        ,
        MrpTyp {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getMrpTyp();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setMrpTyp((String)value);
            }
        }
        ,
        OrgId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        PriceApply {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getPriceApply();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setPriceApply((String)value);
            }
        }
        ,
        SlocId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        BasePrice {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getBasePrice();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setBasePrice((Number)value);
            }
        }
        ,
        ExpiryDt {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getExpiryDt();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setExpiryDt((Timestamp)value);
            }
        }
        ,
        EoPriceType {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getEoPriceType();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setEoPriceType((String)value);
            }
        }
        ,
        GrpId {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getGrpId();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setGrpId((String)value);
            }
        }
        ,
        ItmDesc {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getItmDesc();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setItmDesc((String)value);
            }
        }
        ,
        EoPartNo {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getEoPartNo();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setEoPartNo((String)value);
            }
        }
        ,
        TotMrpRate {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getTotMrpRate();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setTotMrpRate((Number)value);
            }
        }
        ,
        TransItmDesc {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getTransItmDesc();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setTransItmDesc((String)value);
            }
        }
        ,
        MrpTypeLovVO1 {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getMrpTypeLovVO1();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CatagoryTypeVO1 {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getCatagoryTypeVO1();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        PartyTypeVO1 {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getPartyTypeVO1();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ItemTypeVO1 {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getItemTypeVO1();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UOMDescVO1 {
            public Object get(PriceMasterVORowImpl obj) {
                return obj.getUOMDescVO1();
            }

            public void put(PriceMasterVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PriceMasterVORowImpl object);

        public abstract void put(PriceMasterVORowImpl object, Object value);

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


    public static final int CATGID = AttributesEnum.CatgId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int EFFECTIVEDT = AttributesEnum.EffectiveDt.index();
    public static final int EOID = AttributesEnum.EoId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int MINPRICE = AttributesEnum.MinPrice.index();
    public static final int MRPPRICE = AttributesEnum.MrpPrice.index();
    public static final int MRPRATE = AttributesEnum.MrpRate.index();
    public static final int MRPTYP = AttributesEnum.MrpTyp.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PRICEAPPLY = AttributesEnum.PriceApply.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int BASEPRICE = AttributesEnum.BasePrice.index();
    public static final int EXPIRYDT = AttributesEnum.ExpiryDt.index();
    public static final int EOPRICETYPE = AttributesEnum.EoPriceType.index();
    public static final int GRPID = AttributesEnum.GrpId.index();
    public static final int ITMDESC = AttributesEnum.ItmDesc.index();
    public static final int EOPARTNO = AttributesEnum.EoPartNo.index();
    public static final int TOTMRPRATE = AttributesEnum.TotMrpRate.index();
    public static final int TRANSITMDESC = AttributesEnum.TransItmDesc.index();
    public static final int MRPTYPELOVVO1 = AttributesEnum.MrpTypeLovVO1.index();
    public static final int CATAGORYTYPEVO1 = AttributesEnum.CatagoryTypeVO1.index();
    public static final int PARTYTYPEVO1 = AttributesEnum.PartyTypeVO1.index();
    public static final int ITEMTYPEVO1 = AttributesEnum.ItemTypeVO1.index();
    public static final int UOMDESCVO1 = AttributesEnum.UOMDescVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PriceMasterVORowImpl() {
    }

    /**
     * Gets PriceMasterEO entity object.
     * @return the PriceMasterEO
     */
    public PriceMasterEOImpl getPriceMasterEO() {
        return (PriceMasterEOImpl)getEntity(ENTITY_PRICEMASTEREO);
    }

    /**
     * Gets the attribute value for CATG_ID using the alias name CatgId.
     * @return the CATG_ID
     */
    public Integer getCatgId() {
        return (Integer)getAttributeInternal(CATGID);
    }

    /**
     * Sets <code>value</code> as attribute value for CATG_ID using the alias name CatgId.
     * @param value value to set the CATG_ID
     */
    public void setCatgId(Integer value) {
        setAttributeInternal(CATGID, value);
    }

    /**
     * Gets the attribute value for CLD_ID using the alias name CldId.
     * @return the CLD_ID
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for CLD_ID using the alias name CldId.
     * @param value value to set the CLD_ID
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_DT using the alias name EffectiveDt.
     * @return the EFFECTIVE_DT
     */
    public Timestamp getEffectiveDt() {
        return (Timestamp) getAttributeInternal(EFFECTIVEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_DT using the alias name EffectiveDt.
     * @param value value to set the EFFECTIVE_DT
     */
    public void setEffectiveDt(Timestamp value) {
        setAttributeInternal(EFFECTIVEDT, value);
    }

    /**
     * Gets the attribute value for EO_ID using the alias name EoId.
     * @return the EO_ID
     */
    public Number getEoId() {
        return (Number)getAttributeInternal(EOID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_ID using the alias name EoId.
     * @param value value to set the EO_ID
     */
    public void setEoId(Number value) {
        setAttributeInternal(EOID, value);
    }

    /**
     * Gets the attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @return the HO_ORG_ID
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @param value value to set the HO_ORG_ID
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for ITM_ID using the alias name ItmId.
     * @return the ITM_ID
     */
    public String getItmId() {
        return (String) getAttributeInternal(ITMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITM_ID using the alias name ItmId.
     * @param value value to set the ITM_ID
     */
    public void setItmId(String value) {
        setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for ITM_UOM using the alias name ItmUom.
     * @return the ITM_UOM
     */
    public String getItmUom() {
        return (String) getAttributeInternal(ITMUOM);
    }

    /**
     * Sets <code>value</code> as attribute value for ITM_UOM using the alias name ItmUom.
     * @param value value to set the ITM_UOM
     */
    public void setItmUom(String value) {
        setAttributeInternal(ITMUOM, value);
    }

    /**
     * Gets the attribute value for MIN_PRICE using the alias name MinPrice.
     * @return the MIN_PRICE
     */
    public oracle.jbo.domain.Number getMinPrice() {
        return (oracle.jbo.domain.Number) getAttributeInternal(MINPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for MIN_PRICE using the alias name MinPrice.
     * @param value value to set the MIN_PRICE
     */
    public void setMinPrice(oracle.jbo.domain.Number value) {
        setAttributeInternal(MINPRICE, value);
    }

    /**
     * Gets the attribute value for MRP_PRICE using the alias name MrpPrice.
     * @return the MRP_PRICE
     */
    public oracle.jbo.domain.Number getMrpPrice() {
        return (oracle.jbo.domain.Number)getAttributeInternal(MRPPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for MRP_PRICE using the alias name MrpPrice.
     * @param value value to set the MRP_PRICE
     */
    public void setMrpPrice(oracle.jbo.domain.Number value) {
        setAttributeInternal(MRPPRICE, value);
    }

    /**
     * Gets the attribute value for MRP_RATE using the alias name MrpRate.
     * @return the MRP_RATE
     */
    public oracle.jbo.domain.Number getMrpRate() {
        return (oracle.jbo.domain.Number) getAttributeInternal(MRPRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for MRP_RATE using the alias name MrpRate.
     * @param value value to set the MRP_RATE
     */
    public void setMrpRate(oracle.jbo.domain.Number value) {
        setAttributeInternal(MRPRATE, value);
    }

    /**
     * Gets the attribute value for MRP_TYP using the alias name MrpTyp.
     * @return the MRP_TYP
     */
    public String getMrpTyp() {
        return (String) getAttributeInternal(MRPTYP);
    }

    /**
     * Sets <code>value</code> as attribute value for MRP_TYP using the alias name MrpTyp.
     * @param value value to set the MRP_TYP
     */
    public void setMrpTyp(String value) {
        setAttributeInternal(MRPTYP, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for PRICE_APPLY using the alias name PriceApply.
     * @return the PRICE_APPLY
     */
    public String getPriceApply() {
        return (String) getAttributeInternal(PRICEAPPLY);
    }

    /**
     * Sets <code>value</code> as attribute value for PRICE_APPLY using the alias name PriceApply.
     * @param value value to set the PRICE_APPLY
     */
    public void setPriceApply(String value) {
        setAttributeInternal(PRICEAPPLY, value);
    }

    /**
     * Gets the attribute value for SLOC_ID using the alias name SlocId.
     * @return the SLOC_ID
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for SLOC_ID using the alias name SlocId.
     * @param value value to set the SLOC_ID
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
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
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @param value value to set the USR_ID_CREATE_DT
     */
    public void setUsrIdCreateDt(Timestamp value) {
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
    public Timestamp getUsrIdModDt() {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @param value value to set the USR_ID_MOD_DT
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for BASE_PRICE using the alias name BasePrice.
     * @return the BASE_PRICE
     */
    public oracle.jbo.domain.Number getBasePrice() {
        return (oracle.jbo.domain.Number) getAttributeInternal(BASEPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for BASE_PRICE using the alias name BasePrice.
     * @param value value to set the BASE_PRICE
     */
    public void setBasePrice(oracle.jbo.domain.Number value) {
        setAttributeInternal(BASEPRICE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransItmDesc.
     * @return the TransItmDesc
     */
    
       
    public Object resolvElDC(String data) {
    FacesContext fc = FacesContext.getCurrentInstance();
    Application app = fc.getApplication();
    ExpressionFactory elFactory = app.getExpressionFactory();
    ELContext elContext = fc.getELContext();
    ValueExpression valueExp =
    elFactory.createValueExpression(elContext, "#{data." + data + ".dataProvider}", Object.class);
    return valueExp.getValue(elContext);
    }

    public String resolvEl(String data) {
           FacesContext fc = FacesContext.getCurrentInstance();
           Application app = fc.getApplication();
           ExpressionFactory elFactory = app.getExpressionFactory();
           ELContext elContext = fc.getELContext();
           ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
           String msg = valueExp.getValue(elContext).toString();
           return msg;
       }
    
    
    
    public String getTransItmDesc() {
    
     return (String) getAttributeInternal(TRANSITMDESC);
        }
      
       


    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransItmDesc.
     * @param value value to set the  TransItmDesc
     */
    public void setTransItmDesc(String value) {
        setAttributeInternal(TRANSITMDESC, value);
    }

    /**
     * Gets the attribute value for EO_PART_NO using the alias name EoPartNo.
     * @return the EO_PART_NO
     */
    public String getEoPartNo() {
        return (String) getAttributeInternal(EOPARTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_PART_NO using the alias name EoPartNo.
     * @param value value to set the EO_PART_NO
     */
    public void setEoPartNo(String value) {
        setAttributeInternal(EOPARTNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotMrpRate.
     * @return the TotMrpRate
     */
    public Number getTotMrpRate() {
        return (Number)getAttributeInternal(TOTMRPRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotMrpRate.
     * @param value value to set the  TotMrpRate
     */
    public void setTotMrpRate(Number value) {
        setAttributeInternal(TOTMRPRATE, value);
    }

    /**
     * Gets the attribute value for EXPIRY_DT using the alias name ExpiryDt.
     * @return the EXPIRY_DT
     */
    public Timestamp getExpiryDt() {
        return (Timestamp) getAttributeInternal(EXPIRYDT);
    }

    /**
     * Sets <code>value</code> as attribute value for EXPIRY_DT using the alias name ExpiryDt.
     * @param value value to set the EXPIRY_DT
     */
    public void setExpiryDt(Timestamp value) {
        setAttributeInternal(EXPIRYDT, value);
    }

    /**
     * Gets the attribute value for EO_PRICE_TYPE using the alias name EoPriceType.
     * @return the EO_PRICE_TYPE
     */
    public String getEoPriceType() {
        return (String) getAttributeInternal(EOPRICETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_PRICE_TYPE using the alias name EoPriceType.
     * @param value value to set the EO_PRICE_TYPE
     */
    public void setEoPriceType(String value) {
        setAttributeInternal(EOPRICETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute GrpId.
     * @return the GrpId
     */
    public String getGrpId() {
        return (String) getAttributeInternal(GRPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute GrpId.
     * @param value value to set the  GrpId
     */
    public void setGrpId(String value) {
        setAttributeInternal(GRPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmDesc.
     * @return the ItmDesc
     */
    public String getItmDesc() {
        return (String) getAttributeInternal(ITMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmDesc.
     * @param value value to set the  ItmDesc
     */
    public void setItmDesc(String value) {
        setAttributeInternal(ITMDESC, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MrpTypeLovVO1.
     */
    public RowSet getMrpTypeLovVO1() {
        return (RowSet)getAttributeInternal(MRPTYPELOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CatagoryTypeVO1.
     */
    public RowSet getCatagoryTypeVO1() {
        return (RowSet)getAttributeInternal(CATAGORYTYPEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PartyTypeVO1.
     */
    public RowSet getPartyTypeVO1() {
        return (RowSet)getAttributeInternal(PARTYTYPEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ItemTypeVO1.
     */
    public RowSet getItemTypeVO1() {
        return (RowSet)getAttributeInternal(ITEMTYPEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UOMDescVO1.
     */
    public RowSet getUOMDescVO1() {
        return (RowSet)getAttributeInternal(UOMDESCVO1);
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
