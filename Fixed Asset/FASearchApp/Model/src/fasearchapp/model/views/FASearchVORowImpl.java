package fasearchapp.model.views;

import adf.utils.ebiz.EbizParams;

import fasearchapp.model.service.FixedAssetSearchAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 07 16:24:41 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FASearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TransFyId,
        TransItmGrpDesc,
        TransitmGrpId,
        TransItmId,
        transItmDesc,
        TransPurVouId,
        transPurVouDisp,
        TransDocSrc,
        TransPeriodId,
        TransFromDt,
        TransEndDt,
        TransLawType,
        TransCldId,
        TransSlocId,
        TransOrgId,
        TransHoOrgId,
        TranDepVouId,
        TransDepVouDisp,
        TransRegisterFaDispId,
        LovFyDescVO,
        LovLawTypVO,
        LovPeriodVO,
        LovItmGroupVO,
        LovItmVO,
        LovVouDispIdVO,
        LovDocSourceVO,
        LovDepVouIdVO,
        LovFaDispIdVO1;
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


    public static final int TRANSFYID = AttributesEnum.TransFyId.index();
    public static final int TRANSITMGRPDESC = AttributesEnum.TransItmGrpDesc.index();
    public static final int TRANSITMGRPID = AttributesEnum.TransitmGrpId.index();
    public static final int TRANSITMID = AttributesEnum.TransItmId.index();
    public static final int TRANSITMDESC = AttributesEnum.transItmDesc.index();
    public static final int TRANSPURVOUID = AttributesEnum.TransPurVouId.index();
    public static final int TRANSPURVOUDISP = AttributesEnum.transPurVouDisp.index();
    public static final int TRANSDOCSRC = AttributesEnum.TransDocSrc.index();
    public static final int TRANSPERIODID = AttributesEnum.TransPeriodId.index();
    public static final int TRANSFROMDT = AttributesEnum.TransFromDt.index();
    public static final int TRANSENDDT = AttributesEnum.TransEndDt.index();
    public static final int TRANSLAWTYPE = AttributesEnum.TransLawType.index();
    public static final int TRANSCLDID = AttributesEnum.TransCldId.index();
    public static final int TRANSSLOCID = AttributesEnum.TransSlocId.index();
    public static final int TRANSORGID = AttributesEnum.TransOrgId.index();
    public static final int TRANSHOORGID = AttributesEnum.TransHoOrgId.index();
    public static final int TRANDEPVOUID = AttributesEnum.TranDepVouId.index();
    public static final int TRANSDEPVOUDISP = AttributesEnum.TransDepVouDisp.index();
    public static final int TRANSREGISTERFADISPID = AttributesEnum.TransRegisterFaDispId.index();
    public static final int LOVFYDESCVO = AttributesEnum.LovFyDescVO.index();
    public static final int LOVLAWTYPVO = AttributesEnum.LovLawTypVO.index();
    public static final int LOVPERIODVO = AttributesEnum.LovPeriodVO.index();
    public static final int LOVITMGROUPVO = AttributesEnum.LovItmGroupVO.index();
    public static final int LOVITMVO = AttributesEnum.LovItmVO.index();
    public static final int LOVVOUDISPIDVO = AttributesEnum.LovVouDispIdVO.index();
    public static final int LOVDOCSOURCEVO = AttributesEnum.LovDocSourceVO.index();
    public static final int LOVDEPVOUIDVO = AttributesEnum.LovDepVouIdVO.index();
    public static final int LOVFADISPIDVO1 = AttributesEnum.LovFaDispIdVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FASearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute TransFyId.
     * @return the TransFyId
     */
    public Integer getTransFyId() {
        return (Integer) getAttributeInternal(TRANSFYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFyId.
     * @param value value to set the  TransFyId
     */
    public void setTransFyId(Integer value) {
        setAttributeInternal(TRANSFYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransItmGrpDesc.
     * @return the TransItmGrpDesc
     */
    public String getTransItmGrpDesc() {
        return (String) getAttributeInternal(TRANSITMGRPDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransItmGrpDesc.
     * @param value value to set the  TransItmGrpDesc
     */
    public void setTransItmGrpDesc(String value) {
        setAttributeInternal(TRANSITMGRPDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransitmGrpId.
     * @return the TransitmGrpId
     */
    public String getTransitmGrpId() {
        return (String) getAttributeInternal(TRANSITMGRPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransitmGrpId.
     * @param value value to set the  TransitmGrpId
     */
    public void setTransitmGrpId(String value) {
        setAttributeInternal(TRANSITMGRPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransItmId.
     * @return the TransItmId
     */
    public String getTransItmId() {
        return (String) getAttributeInternal(TRANSITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransItmId.
     * @param value value to set the  TransItmId
     */
    public void setTransItmId(String value) {
        setAttributeInternal(TRANSITMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute transItmDesc.
     * @return the transItmDesc
     */
    public String gettransItmDesc() {
        return (String) getAttributeInternal(TRANSITMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute transItmDesc.
     * @param value value to set the  transItmDesc
     */
    public void settransItmDesc(String value) {
        setAttributeInternal(TRANSITMDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransPurVouId.
     * @return the TransPurVouId
     */
    public String getTransPurVouId() {
        return (String) getAttributeInternal(TRANSPURVOUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPurVouId.
     * @param value value to set the  TransPurVouId
     */
    public void setTransPurVouId(String value) {
        setAttributeInternal(TRANSPURVOUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute transPurVouDisp.
     * @return the transPurVouDisp
     */
    public String gettransPurVouDisp() {
        return (String) getAttributeInternal(TRANSPURVOUDISP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute transPurVouDisp.
     * @param value value to set the  transPurVouDisp
     */
    public void settransPurVouDisp(String value) {
        setAttributeInternal(TRANSPURVOUDISP, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransDocTyp.
     * @return the TransDocTyp
     */
    public Integer getTransDocSrc() {
        return (Integer) getAttributeInternal(TRANSDOCSRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDocTyp.
     * @param value value to set the  TransDocTyp
     */
    public void setTransDocSrc(Integer value) {
        setAttributeInternal(TRANSDOCSRC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransPeriodId.
     * @return the TransPeriodId
     */
    public Integer getTransPeriodId() {
        return (Integer) getAttributeInternal(TRANSPERIODID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransPeriodId.
     * @param value value to set the  TransPeriodId
     */
    public void setTransPeriodId(Integer value) {
        setAttributeInternal(TRANSPERIODID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFromDt.
     * @return the TransFromDt
     */
    public Date getTransFromDt() {
        if (getTransPeriodId() != null) {
            FixedAssetSearchAMImpl am = (FixedAssetSearchAMImpl) this.getApplicationModule();
            ViewObjectImpl prdVo = am.getLovPeriodVO();
            prdVo.setNamedWhereClauseParam("BIndCldId", getTransCldId());
            prdVo.setNamedWhereClauseParam("BindOrgFyId", getTransFyId());
            prdVo.setNamedWhereClauseParam("BindOrgId", getTransOrgId());
            prdVo.executeQuery();
            Row[] rw = prdVo.getFilteredRows("PrdId", getTransPeriodId());
            System.out.println("totalNumber of length=" + rw.length);
            if (rw.length > 0)
                return (Date) rw[0].getAttribute("OrgFyDtlStrt");
            else
                return (Date) getAttributeInternal(TRANSFROMDT);
        } else {
            return (Date) getAttributeInternal(TRANSFROMDT);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFromDt.
     * @param value value to set the  TransFromDt
     */
    public void setTransFromDt(Date value) {
        setAttributeInternal(TRANSFROMDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEndDt.
     * @return the TransEndDt
     */
    public Date getTransEndDt() {
        if (getTransPeriodId() != null) {
            FixedAssetSearchAMImpl am = (FixedAssetSearchAMImpl) this.getApplicationModule();
            ViewObjectImpl prdVo = am.getLovPeriodVO();
            prdVo.setNamedWhereClauseParam("BIndCldId", getTransCldId());
            prdVo.setNamedWhereClauseParam("BindOrgFyId", getTransFyId());
            prdVo.setNamedWhereClauseParam("BindOrgId", getTransOrgId());
            prdVo.executeQuery();
            Row[] rw = prdVo.getFilteredRows("PrdId", getTransPeriodId());
            System.out.println("totalNumber of length=" + rw.length);
            if (rw.length > 0)
                return (Date) rw[0].getAttribute("OrgFyDtlEnd");
            else
                return (Date) getAttributeInternal(TRANSENDDT);
        } else {
            return (Date) getAttributeInternal(TRANSENDDT);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEndDt.
     * @param value value to set the  TransEndDt
     */
    public void setTransEndDt(Date value) {

        setAttributeInternal(TRANSENDDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransLawType.
     * @return the TransLawType
     */
    public String getTransLawType() {
        if (getAttributeInternal(TRANSLAWTYPE) == null) {
            return "CO";
        } else {
            return (String) getAttributeInternal(TRANSLAWTYPE);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransLawType.
     * @param value value to set the  TransLawType
     */
    public void setTransLawType(String value) {
        setAttributeInternal(TRANSLAWTYPE, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransCldId.
     * @return the TransCldId
     */
    public String getTransCldId() {
        return EbizParams.GLBL_APP_CLD_ID();
        //return (String) getAttributeInternal(TRANSCLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCldId.
     * @param value value to set the  TransCldId
     */
    public void setTransCldId(String value) {
        setAttributeInternal(TRANSCLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSlocId.
     * @return the TransSlocId
     */
    public Integer getTransSlocId() {
        return Integer.parseInt(EbizParams.GLBL_APP_SERV_LOC().toString());
        // return (Integer) getAttributeInternal(TRANSSLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSlocId.
     * @param value value to set the  TransSlocId
     */
    public void setTransSlocId(Integer value) {
        setAttributeInternal(TRANSSLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOrgId.
     * @return the TransOrgId
     */
    public String getTransOrgId() {
        return EbizParams.GLBL_APP_USR_ORG();
        //return (String) getAttributeInternal(TRANSORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrgId.
     * @param value value to set the  TransOrgId
     */
    public void setTransOrgId(String value) {
        setAttributeInternal(TRANSORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHoOrgId.
     * @return the TransHoOrgId
     */
    public String getTransHoOrgId() {
        return EbizParams.GLBL_HO_ORG_ID();
        // return (String) getAttributeInternal(TRANSHOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHoOrgId.
     * @param value value to set the  TransHoOrgId
     */
    public void setTransHoOrgId(String value) {
        setAttributeInternal(TRANSHOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TranDepVouId.
     * @return the TranDepVouId
     */
    public String getTranDepVouId() {
        return (String) getAttributeInternal(TRANDEPVOUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TranDepVouId.
     * @param value value to set the  TranDepVouId
     */
    public void setTranDepVouId(String value) {
        setAttributeInternal(TRANDEPVOUID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDepVouDisp.
     * @return the TransDepVouDisp
     */
    public String getTransDepVouDisp() {
        return (String) getAttributeInternal(TRANSDEPVOUDISP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDepVouDisp.
     * @param value value to set the  TransDepVouDisp
     */
    public void setTransDepVouDisp(String value) {
        setAttributeInternal(TRANSDEPVOUDISP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRegisterFaDispId.
     * @return the TransRegisterFaDispId
     */
    public String getTransRegisterFaDispId() {
        return (String) getAttributeInternal(TRANSREGISTERFADISPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRegisterFaDispId.
     * @param value value to set the  TransRegisterFaDispId
     */
    public void setTransRegisterFaDispId(String value) {
        setAttributeInternal(TRANSREGISTERFADISPID, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovFyDescVO.
     */
    public RowSet getLovFyDescVO() {
        return (RowSet) getAttributeInternal(LOVFYDESCVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovLawTypVO.
     */
    public RowSet getLovLawTypVO() {
        return (RowSet) getAttributeInternal(LOVLAWTYPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovPeriodVO.
     */
    public RowSet getLovPeriodVO() {
        return (RowSet) getAttributeInternal(LOVPERIODVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovItmGroupVO.
     */
    public RowSet getLovItmGroupVO() {
        return (RowSet) getAttributeInternal(LOVITMGROUPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovItmVO.
     */
    public RowSet getLovItmVO() {
        return (RowSet) getAttributeInternal(LOVITMVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovVouDispIdVO.
     */
    public RowSet getLovVouDispIdVO() {
        return (RowSet) getAttributeInternal(LOVVOUDISPIDVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovDocSourceVO.
     */
    public RowSet getLovDocSourceVO() {
        return (RowSet) getAttributeInternal(LOVDOCSOURCEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovDepVouIdVO.
     */
    public RowSet getLovDepVouIdVO() {
        return (RowSet) getAttributeInternal(LOVDEPVOUIDVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovFaDispIdVO1.
     */
    public RowSet getLovFaDispIdVO1() {
        return (RowSet) getAttributeInternal(LOVFADISPIDVO1);
    }
}

