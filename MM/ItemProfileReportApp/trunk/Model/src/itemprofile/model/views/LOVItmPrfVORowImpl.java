package itemprofile.model.views;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.sql.Timestamp;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Nov 26 10:13:22 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LOVItmPrfVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SlocId,
        CldId,
        HoOrgId,
        ItmId,
        ItmLegacyCode,
        ItmDesc,
        ItmLongDesc,
        ItmTechNm,
        GrpId,
        MaxStk,
        MinStk,
        SafeQty,
        PickOrder,
        ReorderLvl,
        ShelfLife,
        SrvcItmFlg,
        StockableFlg,
        SlsItmFlg,
        PurItmFlg,
        WipItmFlg,
        UomBasic,
        UomPur,
        UomSls,
        PriceBasic,
        PricePur,
        PriceSls,
        DfltWhId,
        DfltBinId,
        CostMthd,
        TaxExmptFlg,
        CapitalGdFlg,
        QcReqdFlg,
        ConsumableFlg,
        CashPurFlg,
        Actv,
        InactvResn,
        InactvDt,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        ItmEntId;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMLEGACYCODE = AttributesEnum.ItmLegacyCode.index();
    public static final int ITMDESC = AttributesEnum.ItmDesc.index();
    public static final int ITMLONGDESC = AttributesEnum.ItmLongDesc.index();
    public static final int ITMTECHNM = AttributesEnum.ItmTechNm.index();
    public static final int GRPID = AttributesEnum.GrpId.index();
    public static final int MAXSTK = AttributesEnum.MaxStk.index();
    public static final int MINSTK = AttributesEnum.MinStk.index();
    public static final int SAFEQTY = AttributesEnum.SafeQty.index();
    public static final int PICKORDER = AttributesEnum.PickOrder.index();
    public static final int REORDERLVL = AttributesEnum.ReorderLvl.index();
    public static final int SHELFLIFE = AttributesEnum.ShelfLife.index();
    public static final int SRVCITMFLG = AttributesEnum.SrvcItmFlg.index();
    public static final int STOCKABLEFLG = AttributesEnum.StockableFlg.index();
    public static final int SLSITMFLG = AttributesEnum.SlsItmFlg.index();
    public static final int PURITMFLG = AttributesEnum.PurItmFlg.index();
    public static final int WIPITMFLG = AttributesEnum.WipItmFlg.index();
    public static final int UOMBASIC = AttributesEnum.UomBasic.index();
    public static final int UOMPUR = AttributesEnum.UomPur.index();
    public static final int UOMSLS = AttributesEnum.UomSls.index();
    public static final int PRICEBASIC = AttributesEnum.PriceBasic.index();
    public static final int PRICEPUR = AttributesEnum.PricePur.index();
    public static final int PRICESLS = AttributesEnum.PriceSls.index();
    public static final int DFLTWHID = AttributesEnum.DfltWhId.index();
    public static final int DFLTBINID = AttributesEnum.DfltBinId.index();
    public static final int COSTMTHD = AttributesEnum.CostMthd.index();
    public static final int TAXEXMPTFLG = AttributesEnum.TaxExmptFlg.index();
    public static final int CAPITALGDFLG = AttributesEnum.CapitalGdFlg.index();
    public static final int QCREQDFLG = AttributesEnum.QcReqdFlg.index();
    public static final int CONSUMABLEFLG = AttributesEnum.ConsumableFlg.index();
    public static final int CASHPURFLG = AttributesEnum.CashPurFlg.index();
    public static final int ACTV = AttributesEnum.Actv.index();
    public static final int INACTVRESN = AttributesEnum.InactvResn.index();
    public static final int INACTVDT = AttributesEnum.InactvDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int ITMENTID = AttributesEnum.ItmEntId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LOVItmPrfVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmId.
     * @return the ItmId
     */
    public String getItmId() {
        return (String) getAttributeInternal(ITMID);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmLegacyCode.
     * @return the ItmLegacyCode
     */
    public String getItmLegacyCode() {
        return (String) getAttributeInternal(ITMLEGACYCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmDesc.
     * @return the ItmDesc
     */
    public String getItmDesc() {
        return (String) getAttributeInternal(ITMDESC);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmLongDesc.
     * @return the ItmLongDesc
     */
    public String getItmLongDesc() {
        return (String) getAttributeInternal(ITMLONGDESC);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmTechNm.
     * @return the ItmTechNm
     */
    public String getItmTechNm() {
        return (String) getAttributeInternal(ITMTECHNM);
    }

    /**
     * Gets the attribute value for the calculated attribute GrpId.
     * @return the GrpId
     */
    public String getGrpId() {
        return (String) getAttributeInternal(GRPID);
    }

    /**
     * Gets the attribute value for the calculated attribute MaxStk.
     * @return the MaxStk
     */
    public BigInteger getMaxStk() {
        return (BigInteger) getAttributeInternal(MAXSTK);
    }

    /**
     * Gets the attribute value for the calculated attribute MinStk.
     * @return the MinStk
     */
    public BigInteger getMinStk() {
        return (BigInteger) getAttributeInternal(MINSTK);
    }

    /**
     * Gets the attribute value for the calculated attribute SafeQty.
     * @return the SafeQty
     */
    public BigInteger getSafeQty() {
        return (BigInteger) getAttributeInternal(SAFEQTY);
    }

    /**
     * Gets the attribute value for the calculated attribute PickOrder.
     * @return the PickOrder
     */
    public Integer getPickOrder() {
        return (Integer) getAttributeInternal(PICKORDER);
    }

    /**
     * Gets the attribute value for the calculated attribute ReorderLvl.
     * @return the ReorderLvl
     */
    public BigInteger getReorderLvl() {
        return (BigInteger) getAttributeInternal(REORDERLVL);
    }

    /**
     * Gets the attribute value for the calculated attribute ShelfLife.
     * @return the ShelfLife
     */
    public Integer getShelfLife() {
        return (Integer) getAttributeInternal(SHELFLIFE);
    }

    /**
     * Gets the attribute value for the calculated attribute SrvcItmFlg.
     * @return the SrvcItmFlg
     */
    public String getSrvcItmFlg() {
        return (String) getAttributeInternal(SRVCITMFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute StockableFlg.
     * @return the StockableFlg
     */
    public String getStockableFlg() {
        return (String) getAttributeInternal(STOCKABLEFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute SlsItmFlg.
     * @return the SlsItmFlg
     */
    public String getSlsItmFlg() {
        return (String) getAttributeInternal(SLSITMFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute PurItmFlg.
     * @return the PurItmFlg
     */
    public String getPurItmFlg() {
        return (String) getAttributeInternal(PURITMFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute WipItmFlg.
     * @return the WipItmFlg
     */
    public String getWipItmFlg() {
        return (String) getAttributeInternal(WIPITMFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute UomBasic.
     * @return the UomBasic
     */
    public String getUomBasic() {
        return (String) getAttributeInternal(UOMBASIC);
    }

    /**
     * Gets the attribute value for the calculated attribute UomPur.
     * @return the UomPur
     */
    public String getUomPur() {
        return (String) getAttributeInternal(UOMPUR);
    }

    /**
     * Gets the attribute value for the calculated attribute UomSls.
     * @return the UomSls
     */
    public String getUomSls() {
        return (String) getAttributeInternal(UOMSLS);
    }

    /**
     * Gets the attribute value for the calculated attribute PriceBasic.
     * @return the PriceBasic
     */
    public BigDecimal getPriceBasic() {
        return (BigDecimal) getAttributeInternal(PRICEBASIC);
    }

    /**
     * Gets the attribute value for the calculated attribute PricePur.
     * @return the PricePur
     */
    public BigDecimal getPricePur() {
        return (BigDecimal) getAttributeInternal(PRICEPUR);
    }

    /**
     * Gets the attribute value for the calculated attribute PriceSls.
     * @return the PriceSls
     */
    public BigDecimal getPriceSls() {
        return (BigDecimal) getAttributeInternal(PRICESLS);
    }

    /**
     * Gets the attribute value for the calculated attribute DfltWhId.
     * @return the DfltWhId
     */
    public String getDfltWhId() {
        return (String) getAttributeInternal(DFLTWHID);
    }

    /**
     * Gets the attribute value for the calculated attribute DfltBinId.
     * @return the DfltBinId
     */
    public String getDfltBinId() {
        return (String) getAttributeInternal(DFLTBINID);
    }

    /**
     * Gets the attribute value for the calculated attribute CostMthd.
     * @return the CostMthd
     */
    public BigInteger getCostMthd() {
        return (BigInteger) getAttributeInternal(COSTMTHD);
    }

    /**
     * Gets the attribute value for the calculated attribute TaxExmptFlg.
     * @return the TaxExmptFlg
     */
    public String getTaxExmptFlg() {
        return (String) getAttributeInternal(TAXEXMPTFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute CapitalGdFlg.
     * @return the CapitalGdFlg
     */
    public String getCapitalGdFlg() {
        return (String) getAttributeInternal(CAPITALGDFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute QcReqdFlg.
     * @return the QcReqdFlg
     */
    public String getQcReqdFlg() {
        return (String) getAttributeInternal(QCREQDFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute ConsumableFlg.
     * @return the ConsumableFlg
     */
    public String getConsumableFlg() {
        return (String) getAttributeInternal(CONSUMABLEFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute CashPurFlg.
     * @return the CashPurFlg
     */
    public String getCashPurFlg() {
        return (String) getAttributeInternal(CASHPURFLG);
    }

    /**
     * Gets the attribute value for the calculated attribute Actv.
     * @return the Actv
     */
    public String getActv() {
        return (String) getAttributeInternal(ACTV);
    }

    /**
     * Gets the attribute value for the calculated attribute InactvResn.
     * @return the InactvResn
     */
    public String getInactvResn() {
        return (String) getAttributeInternal(INACTVRESN);
    }

    /**
     * Gets the attribute value for the calculated attribute InactvDt.
     * @return the InactvDt
     */
    public Timestamp getInactvDt() {
        return (Timestamp) getAttributeInternal(INACTVDT);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdCreate.
     * @return the UsrIdCreate
     */
    public Integer getUsrIdCreate() {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdCreateDt.
     * @return the UsrIdCreateDt
     */
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdMod.
     * @return the UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdModDt.
     * @return the UsrIdModDt
     */
    public Timestamp getUsrIdModDt() {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmEntId.
     * @return the ItmEntId
     */
    public BigInteger getItmEntId() {
        return (BigInteger) getAttributeInternal(ITMENTID);
    }
}

