package pmssiterecordapp.model.views;

import adf.utils.ebiz.EbizParams;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 01 11:37:23 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SearchDualVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Selectobjects0,
        TransCldId,
        TransSlocId,
        TransHoOrgId,
        TransOrgId,
        TransRcdId,
        TransCoaNm,
        TransCoaId,
        TransEoId,
        TransEoNm,
        TransStrtDt,
        TransEndDt,
        TransStatus,
        TransUsrId,
        LovEoNmVO1,
        LovCoaIdVO1,
        LovRcdStatVO1;
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


    public static final int SELECTOBJECTS0 = AttributesEnum.Selectobjects0.index();
    public static final int TRANSCLDID = AttributesEnum.TransCldId.index();
    public static final int TRANSSLOCID = AttributesEnum.TransSlocId.index();
    public static final int TRANSHOORGID = AttributesEnum.TransHoOrgId.index();
    public static final int TRANSORGID = AttributesEnum.TransOrgId.index();
    public static final int TRANSRCDID = AttributesEnum.TransRcdId.index();
    public static final int TRANSCOANM = AttributesEnum.TransCoaNm.index();
    public static final int TRANSCOAID = AttributesEnum.TransCoaId.index();
    public static final int TRANSEOID = AttributesEnum.TransEoId.index();
    public static final int TRANSEONM = AttributesEnum.TransEoNm.index();
    public static final int TRANSSTRTDT = AttributesEnum.TransStrtDt.index();
    public static final int TRANSENDDT = AttributesEnum.TransEndDt.index();
    public static final int TRANSSTATUS = AttributesEnum.TransStatus.index();
    public static final int TRANSUSRID = AttributesEnum.TransUsrId.index();
    public static final int LOVEONMVO1 = AttributesEnum.LovEoNmVO1.index();
    public static final int LOVCOAIDVO1 = AttributesEnum.LovCoaIdVO1.index();
    public static final int LOVRCDSTATVO1 = AttributesEnum.LovRcdStatVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SearchDualVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Selectobjects0.
     * @return the Selectobjects0
     */
    public String getSelectobjects0() {
        return (String) getAttributeInternal(SELECTOBJECTS0);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCldId.
     * @return the TransCldId
     */
    public String getTransCldId() {
        return EbizParams.GLBL_APP_CLD_ID();
        //  return (String) getAttributeInternal(TRANSCLDID);
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
        return EbizParams.GLBL_APP_SERV_LOC();
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
     * Gets the attribute value for the calculated attribute TransOrgId.
     * @return the TransOrgId
     */
    public String getTransOrgId() {
        return EbizParams.GLBL_APP_USR_ORG();
        // return (String) getAttributeInternal(TRANSORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrgId.
     * @param value value to set the  TransOrgId
     */
    public void setTransOrgId(String value) {
        setAttributeInternal(TRANSORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRcdId.
     * @return the TransRcdId
     */
    public String getTransRcdId() {
        return (String) getAttributeInternal(TRANSRCDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRcdId.
     * @param value value to set the  TransRcdId
     */
    public void setTransRcdId(String value) {
        setAttributeInternal(TRANSRCDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCoaNm.
     * @return the TransCoaNm
     */
    public String getTransCoaNm() {
        return (String) getAttributeInternal(TRANSCOANM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCoaNm.
     * @param value value to set the  TransCoaNm
     */
    public void setTransCoaNm(String value) {
        setAttributeInternal(TRANSCOANM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCoaId.
     * @return the TransCoaId
     */
    public Integer getTransCoaId() {
        return (Integer) getAttributeInternal(TRANSCOAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCoaId.
     * @param value value to set the  TransCoaId
     */
    public void setTransCoaId(Integer value) {
        setAttributeInternal(TRANSCOAID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEoId.
     * @return the TransEoId
     */
    public Integer getTransEoId() {
        return (Integer) getAttributeInternal(TRANSEOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEoId.
     * @param value value to set the  TransEoId
     */
    public void setTransEoId(Integer value) {
        setAttributeInternal(TRANSEOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEoNm.
     * @return the TransEoNm
     */
    public String getTransEoNm() {
        return (String) getAttributeInternal(TRANSEONM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEoNm.
     * @param value value to set the  TransEoNm
     */
    public void setTransEoNm(String value) {
        setAttributeInternal(TRANSEONM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransStrtDt.
     * @return the TransStrtDt
     */
    public Timestamp getTransStrtDt() {
        return (Timestamp) getAttributeInternal(TRANSSTRTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStrtDt.
     * @param value value to set the  TransStrtDt
     */
    public void setTransStrtDt(Timestamp value) {
        setAttributeInternal(TRANSSTRTDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEndDt.
     * @return the TransEndDt
     */
    public Timestamp getTransEndDt() {
        return (Timestamp) getAttributeInternal(TRANSENDDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEndDt.
     * @param value value to set the  TransEndDt
     */
    public void setTransEndDt(Timestamp value) {
        setAttributeInternal(TRANSENDDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Status.
     * @return the Status
     */
    public Integer getTransStatus() {
        return (Integer) getAttributeInternal(TRANSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStatus.
     * @param value value to set the  TransStatus
     */
    public void setTransStatus(Integer value) {
        setAttributeInternal(TRANSSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransUsrId.
     * @return the TransUsrId
     */
    public Integer getTransUsrId() {
        return EbizParams.GLBL_APP_USR();
        //   return (Integer) getAttributeInternal(TRANSUSRID);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovEoNmVO1.
     */
    public RowSet getLovEoNmVO1() {
        return (RowSet) getAttributeInternal(LOVEONMVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovCoaIdVO1.
     */
    public RowSet getLovCoaIdVO1() {
        return (RowSet) getAttributeInternal(LOVCOAIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovRcdStatVO1.
     */
    public RowSet getLovRcdStatVO1() {
        return (RowSet) getAttributeInternal(LOVRCDSTATVO1);
    }
}

