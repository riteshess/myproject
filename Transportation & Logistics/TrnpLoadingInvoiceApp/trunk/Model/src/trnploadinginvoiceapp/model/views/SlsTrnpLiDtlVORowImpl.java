package trnploadinginvoiceapp.model.views;

import adf.utils.ebiz.EbizParams;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.RowQualifier;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;

import trnploadinginvoiceapp.model.entities.SlsTrnpLiDtlEOImpl;
import trnploadinginvoiceapp.model.services.TrnpLoadingInvoiceAMImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jun 16 17:25:45 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsTrnpLiDtlVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SLSTRNPLIDTLEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AmtBs,
        AmtSp,
        CldId,
        DocId,
        HoOrgId,
        OlId,
        OrgId,
        RateEmptyVehicle,
        RoundTrpFlg,
        SlNo,
        SlocId,
        TotKm,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        OffloadingTrans,
        HeadCurrIdTrans,
        HeadEoIdTrans,
        VhclItmId,
        VhclNo,
        SlsTrnpLi,
        LOVOffLoadingVO1,
        LOVTripBasisVO1;
        static AttributesEnum[] vals = null;
        ;
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


    public static final int AMTBS = AttributesEnum.AmtBs.index();
    public static final int AMTSP = AttributesEnum.AmtSp.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int OLID = AttributesEnum.OlId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int RATEEMPTYVEHICLE = AttributesEnum.RateEmptyVehicle.index();
    public static final int ROUNDTRPFLG = AttributesEnum.RoundTrpFlg.index();
    public static final int SLNO = AttributesEnum.SlNo.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int TOTKM = AttributesEnum.TotKm.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int OFFLOADINGTRANS = AttributesEnum.OffloadingTrans.index();
    public static final int HEADCURRIDTRANS = AttributesEnum.HeadCurrIdTrans.index();
    public static final int HEADEOIDTRANS = AttributesEnum.HeadEoIdTrans.index();
    public static final int VHCLITMID = AttributesEnum.VhclItmId.index();
    public static final int VHCLNO = AttributesEnum.VhclNo.index();
    public static final int SLSTRNPLI = AttributesEnum.SlsTrnpLi.index();
    public static final int LOVOFFLOADINGVO1 = AttributesEnum.LOVOffLoadingVO1.index();
    public static final int LOVTRIPBASISVO1 = AttributesEnum.LOVTripBasisVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SlsTrnpLiDtlVORowImpl() {
    }

    /**
     * Gets SlsTrnpLiDtlEO entity object.
     * @return the SlsTrnpLiDtlEO
     */
    public SlsTrnpLiDtlEOImpl getSlsTrnpLiDtlEO() {
        return (SlsTrnpLiDtlEOImpl) getEntity(ENTITY_SLSTRNPLIDTLEO);
    }

    /**
     * Gets the attribute value for AMT_BS using the alias name AmtBs.
     * @return the AMT_BS
     */
    public Number getAmtBs() {
        return (Number) getAttributeInternal(AMTBS);
    }

    /**
     * Sets <code>value</code> as attribute value for AMT_BS using the alias name AmtBs.
     * @param value value to set the AMT_BS
     */
    public void setAmtBs(Number value) {
        setAttributeInternal(AMTBS, value);
    }

    /**
     * Gets the attribute value for AMT_SP using the alias name AmtSp.
     * @return the AMT_SP
     */
    public Number getAmtSp() {
        return (Number) getAttributeInternal(AMTSP);
    }

    /**
     * Sets <code>value</code> as attribute value for AMT_SP using the alias name AmtSp.
     * @param value value to set the AMT_SP
     */
    public void setAmtSp(Number value) {
        setAttributeInternal(AMTSP, value);
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
     * Gets the attribute value for DOC_ID using the alias name DocId.
     * @return the DOC_ID
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_ID using the alias name DocId.
     * @param value value to set the DOC_ID
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
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
     * Gets the attribute value for OL_ID using the alias name OlId.
     * @return the OL_ID
     */
    public String getOlId() {
        return (String) getAttributeInternal(OLID);
    }

    /**
     * Sets <code>value</code> as attribute value for OL_ID using the alias name OlId.
     * @param value value to set the OL_ID
     */
    public void setOlId(String value) {
        setAttributeInternal(OLID, value);
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
     * Gets the attribute value for RATE_EMPTY_VEHICLE using the alias name RateEmptyVehicle.
     * @return the RATE_EMPTY_VEHICLE
     */
    public Number getRateEmptyVehicle() {
        if (this.getSlNo() != null) {
            if (this.getSlNo() == 2) {
                return null;
            } else if (this.getSlNo() == 1) {
                ViewObjectImpl dtlVO1 = this.getAm().getSlsTrnpLiDtlVO1();
                RowQualifier rQ = new RowQualifier(dtlVO1);
                rQ.setWhereClause("OlId ='" + this.getOlId() + "' and SlNo =2 and RoundTrpFlg ='R'");
                Row[] filteredRows = dtlVO1.getFilteredRows(rQ);
                if (filteredRows.length > 0) {
                    Number val =
                        ((Number) filteredRows[0].getAttribute("AmtSp")).divide((Number) filteredRows[0].getAttribute("TotKm"));
                    return (Number) val.round(EbizParams.GLBL_AMT_DIGIT());
                } else {
                    return null;
                }
            }
        }
        return (Number) getAttributeInternal(RATEEMPTYVEHICLE);
    }

    /**
     * Sets <code>value</code> as attribute value for RATE_EMPTY_VEHICLE using the alias name RateEmptyVehicle.
     * @param value value to set the RATE_EMPTY_VEHICLE
     */
    public void setRateEmptyVehicle(Number value) {
        setAttributeInternal(RATEEMPTYVEHICLE, value);
    }

    /**
     * Gets the attribute value for ROUND_TRP_FLG using the alias name RoundTrpFlg.
     * @return the ROUND_TRP_FLG
     */
    public String getRoundTrpFlg() {
        return (String) getAttributeInternal(ROUNDTRPFLG);
    }

    /**
     * Sets <code>value</code> as attribute value for ROUND_TRP_FLG using the alias name RoundTrpFlg.
     * @param value value to set the ROUND_TRP_FLG
     */
    public void setRoundTrpFlg(String value) {
        setAttributeInternal(ROUNDTRPFLG, value);
    }

    /**
     * Gets the attribute value for SL_NO using the alias name SlNo.
     * @return the SL_NO
     */
    public Integer getSlNo() {
        return (Integer) getAttributeInternal(SLNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SL_NO using the alias name SlNo.
     * @param value value to set the SL_NO
     */
    public void setSlNo(Integer value) {
        setAttributeInternal(SLNO, value);
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
     * Gets the attribute value for TOT_KM using the alias name TotKm.
     * @return the TOT_KM
     */
    public Number getTotKm() {
        return (Number) getAttributeInternal(TOTKM);
    }

    /**
     * Sets <code>value</code> as attribute value for TOT_KM using the alias name TotKm.
     * @param value value to set the TOT_KM
     */
    public void setTotKm(Number value) {
        setAttributeInternal(TOTKM, value);
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
     * Gets the attribute value for the calculated attribute OffloadingTrans.
     * @return the OffloadingTrans
     */
    public String getOffloadingTrans() {
        if (this.getOlId() != null) {
            ViewObjectImpl impl = getAm().getLOVOffLoadingVO1();
            impl.setNamedWhereClauseParam("BindCldId", this.getCldId());
            impl.setNamedWhereClauseParam("BindSlocId", this.getSlocId());
            impl.setNamedWhereClauseParam("BindHoOrgId", this.getHoOrgId());
            impl.setNamedWhereClauseParam("BindOrgId", this.getOrgId());
            impl.setNamedWhereClauseParam("BindOlId", this.getOlId());
            impl.executeQuery();
            Row[] allRowsInRange = impl.getAllRowsInRange();

            if (allRowsInRange.length > 0) {
                return (String) allRowsInRange[0].getAttribute("OlId");
            }
        }
        return (String) getAttributeInternal(OFFLOADINGTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OffloadingTrans.
     * @param value value to set the  OffloadingTrans
     */
    public void setOffloadingTrans(String value) {
        setAttributeInternal(OFFLOADINGTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeadCurrIdTrans.
     * @return the HeadCurrIdTrans
     */
    public Integer getHeadCurrIdTrans() {
        return (Integer) this.getSlsTrnpLi().getAttribute("CurrIdSp");
        //return (Integer) getAttributeInternal(HEADCURRIDTRANS);
    }

    /**
     * Gets the attribute value for the calculated attribute HeadEoIdTrans.
     * @return the HeadEoIdTrans
     */
    public Integer getHeadEoIdTrans() {
        return (Integer) this.getSlsTrnpLi().getAttribute("EoId");
        //return (Integer) getAttributeInternal(HEADEOIDTRANS);
    }


    /**
     * Gets the attribute value for VHCL_ITM_ID using the alias name VhclItmId.
     * @return the VHCL_ITM_ID
     */
    public String getVhclItmId() {
        return (String) getAttributeInternal(VHCLITMID);
    }

    /**
     * Sets <code>value</code> as attribute value for VHCL_ITM_ID using the alias name VhclItmId.
     * @param value value to set the VHCL_ITM_ID
     */
    public void setVhclItmId(String value) {
        setAttributeInternal(VHCLITMID, value);
    }

    /**
     * Gets the attribute value for VHCL_NO using the alias name VhclNo.
     * @return the VHCL_NO
     */
    public String getVhclNo() {
        return (String) getAttributeInternal(VHCLNO);
    }

    /**
     * Sets <code>value</code> as attribute value for VHCL_NO using the alias name VhclNo.
     * @param value value to set the VHCL_NO
     */
    public void setVhclNo(String value) {
        setAttributeInternal(VHCLNO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link SlsTrnpLi.
     */
    public Row getSlsTrnpLi() {
        return (Row) getAttributeInternal(SLSTRNPLI);
    }

    /**
     * Sets the master-detail link SlsTrnpLi between this object and <code>value</code>.
     */
    public void setSlsTrnpLi(Row value) {
        setAttributeInternal(SLSTRNPLI, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVOffLoadingVO1.
     */
    public RowSet getLOVOffLoadingVO1() {
        return (RowSet) getAttributeInternal(LOVOFFLOADINGVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVTripBasisVO1.
     */
    public RowSet getLOVTripBasisVO1() {
        return (RowSet) getAttributeInternal(LOVTRIPBASISVO1);
    }

    /**
     * Method will return Application Module App
     */
    public TrnpLoadingInvoiceAMImpl getAm() {
        TrnpLoadingInvoiceAMImpl am = (TrnpLoadingInvoiceAMImpl) getApplicationModule();
        return am;
    }
}

