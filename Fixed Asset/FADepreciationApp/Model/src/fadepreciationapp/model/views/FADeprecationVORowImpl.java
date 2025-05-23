package fadepreciationapp.model.views;

import adf.utils.ebiz.EbizParams;

import fadepreciationapp.model.service.FADeprecationAMImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 30 13:59:52 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FADeprecationVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        FyId,
        PrdId,
        DepLwTyp,
        DepExeId,
        DepExeDt,
        VouId,
        VouTypId,
        VouDt,
        VouNarr,
        transPeriodTyp,
        TransExecFrq,
        TransStrtDt,
        TransEndDt,
        LovFYDescVO,
        LovPeriodVO,
        LovLawTypVO;
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


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int PRDID = AttributesEnum.PrdId.index();
    public static final int DEPLWTYP = AttributesEnum.DepLwTyp.index();
    public static final int DEPEXEID = AttributesEnum.DepExeId.index();
    public static final int DEPEXEDT = AttributesEnum.DepExeDt.index();
    public static final int VOUID = AttributesEnum.VouId.index();
    public static final int VOUTYPID = AttributesEnum.VouTypId.index();
    public static final int VOUDT = AttributesEnum.VouDt.index();
    public static final int VOUNARR = AttributesEnum.VouNarr.index();
    public static final int TRANSPERIODTYP = AttributesEnum.transPeriodTyp.index();
    public static final int TRANSEXECFRQ = AttributesEnum.TransExecFrq.index();
    public static final int TRANSSTRTDT = AttributesEnum.TransStrtDt.index();
    public static final int TRANSENDDT = AttributesEnum.TransEndDt.index();
    public static final int LOVFYDESCVO = AttributesEnum.LovFYDescVO.index();
    public static final int LOVPERIODVO = AttributesEnum.LovPeriodVO.index();
    public static final int LOVLAWTYPVO = AttributesEnum.LovLawTypVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FADeprecationVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
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
     * Gets the attribute value for the calculated attribute FyId.
     * @return the FyId
     */
    public Integer getFyId() {
        /*  FADeprecationAMImpl am = (FADeprecationAMImpl) this.getApplicationModule();
        ViewObjectImpl currFyDescVO = am.getCurrFyDescVO();
        currFyDescVO.setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
        currFyDescVO.setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
        Row[] allRowsInRange = currFyDescVO.getAllRowsInRange();
        if (ADFModelUtils.resolvEl("#{pageFlowScope.GLBL_FY_ID}") == null) {
            if (allRowsInRange.length > 0)
                return Integer.parseInt(allRowsInRange[0].getAttribute("FyId").toString());
        } else {
            return Integer.parseInt(ADFModelUtils.resolvEl("#{pageFlowScope.GLBL_FY_ID}").toString());
        } */

        return (Integer) getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FyId.
     * @param value value to set the  FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PrdId.
     * @return the PrdId
     */
    public Integer getPrdId() {
        return (Integer) getAttributeInternal(PRDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PrdId.
     * @param value value to set the  PrdId
     */
    public void setPrdId(Integer value) {
        setAttributeInternal(PRDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepLwTyp.
     * @return the DepLwTyp
     */
    public String getDepLwTyp() {
        /*  FADeprecationAMImpl am = (FADeprecationAMImpl) this.getApplicationModule();
        ViewObjectImpl lawTypVo = am.getLovLawTypVO();
        lawTypVo.setNamedWhereClauseParam("bindcldid", EbizParams.GLBL_APP_CLD_ID());
        lawTypVo.setNamedWhereClauseParam("bindorgid", EbizParams.GLBL_APP_USR_ORG());
        lawTypVo.executeQuery();
        Row[] filteredRows = lawTypVo.getFilteredRows("LawTypeId", "CO");
//        if (getAttributeInternal(DEPLWTYP) == null) {
        if (ADFModelUtils.resolvEl("#{pageFlowScope.GLBL_LAW_TYP}")== null) {
            if (filteredRows.length > 0) {
                return "CO";
            } else {
                return "IT";
            }
        } else { */
        return (String) getAttributeInternal(DEPLWTYP);
        //  }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepLwTyp.
     * @param value value to set the  DepLwTyp
     */
    public void setDepLwTyp(String value) {
        setAttributeInternal(DEPLWTYP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepExeId.
     * @return the DepExeId
     */
    public String getDepExeId() {
        return (String) getAttributeInternal(DEPEXEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepExeId.
     * @param value value to set the  DepExeId
     */
    public void setDepExeId(String value) {
        setAttributeInternal(DEPEXEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DepExeDt.
     * @return the DepExeDt
     */
    public Timestamp getDepExeDt() {
        return new Timestamp(System.currentTimeMillis());
        //return (Timestamp) getAttributeInternal(DEPEXEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DepExeDt.
     * @param value value to set the  DepExeDt
     */
    public void setDepExeDt(Timestamp value) {
        setAttributeInternal(DEPEXEDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VouId.
     * @return the VouId
     */
    public String getVouId() {
        return (String) getAttributeInternal(VOUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VouId.
     * @param value value to set the  VouId
     */
    public void setVouId(String value) {
        setAttributeInternal(VOUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VouTypId.
     * @return the VouTypId
     */
    public Integer getVouTypId() {
        return (Integer) getAttributeInternal(VOUTYPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VouTypId.
     * @param value value to set the  VouTypId
     */
    public void setVouTypId(Integer value) {
        setAttributeInternal(VOUTYPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VouDt.
     * @return the VouDt
     */
    public Timestamp getVouDt() {
        return (Timestamp) getAttributeInternal(VOUDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VouDt.
     * @param value value to set the  VouDt
     */
    public void setVouDt(Timestamp value) {
        setAttributeInternal(VOUDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VouNarr.
     * @return the VouNarr
     */
    public String getVouNarr() {
        return (String) getAttributeInternal(VOUNARR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VouNarr.
     * @param value value to set the  VouNarr
     */
    public void setVouNarr(String value) {
        setAttributeInternal(VOUNARR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute transPeriodTyp.
     * @return the transPeriodTyp
     */
    public String gettransPeriodTyp() {
        return (String) getAttributeInternal(TRANSPERIODTYP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute transPeriodTyp.
     * @param value value to set the  transPeriodTyp
     */
    public void settransPeriodTyp(String value) {
        setAttributeInternal(TRANSPERIODTYP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransExecFrq.
     * @return the TransExecFrq
     */
    public String getTransExecFrq() {
        FADeprecationAMImpl am = (FADeprecationAMImpl) this.getApplicationModule();
        ViewObjectImpl vo = am.getLovLawTypVO();
        if (getDepLwTyp() != null) {
            vo.setNamedWhereClauseParam("bindcldid", EbizParams.GLBL_APP_CLD_ID());
            vo.setNamedWhereClauseParam("bindorgid", EbizParams.GLBL_APP_USR_ORG());
            vo.executeQuery();
            Row[] filteredRows = vo.getFilteredRows("LawTypeId", getDepLwTyp());
            if (filteredRows.length > 0) {
                return filteredRows[0].getAttribute("ExecFreq").toString();
            }
        }
        return (String) getAttributeInternal(TRANSEXECFRQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransExecFrq.
     * @param value value to set the  TransExecFrq
     */
    public void setTransExecFrq(String value) {
        setAttributeInternal(TRANSEXECFRQ, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransStrtDt.
     * @return the TransStrtDt
     */
    public Date getTransStrtDt() {
        return (Date) getAttributeInternal(TRANSSTRTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStrtDt.
     * @param value value to set the  TransStrtDt
     */
    public void setTransStrtDt(Date value) {
        setAttributeInternal(TRANSSTRTDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEndDt.
     * @return the TransEndDt
     */
    public Date getTransEndDt() {
        return (Date) getAttributeInternal(TRANSENDDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEndDt.
     * @param value value to set the  TransEndDt
     */
    public void setTransEndDt(Date value) {
        setAttributeInternal(TRANSENDDT, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovFYDescVO.
     */
    public RowSet getLovFYDescVO() {
        return (RowSet) getAttributeInternal(LOVFYDESCVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovPeriodVO.
     */
    public RowSet getLovPeriodVO() {
        return (RowSet) getAttributeInternal(LOVPERIODVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovLawTypVO.
     */
    public RowSet getLovLawTypVO() {
        return (RowSet) getAttributeInternal(LOVLAWTYPVO);
    }
}

