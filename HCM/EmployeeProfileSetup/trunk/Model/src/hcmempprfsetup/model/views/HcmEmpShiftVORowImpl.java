package hcmempprfsetup.model.views;

import hcmempprfsetup.model.entities.HcmEmpShiftEOImpl;

import hcmempprfsetup.model.modules.HcmEmpPrfAMImpl;

import java.awt.Color;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 20 11:49:40 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HcmEmpShiftVORowImpl extends ViewRowImpl {


    public static final int ENTITY_HCMEMPSHIFTEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        DocId,
        EmpCode,
        HoOrgId,
        OrgId,
        ShiftId,
        SlocId,
        ShiftDays,
        ShiftSeq,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        ValidEndDt,
        ValidStrtDt,
        ShiftClrCd,
        TransGrpId,
        TransShiftTm,
        TranscolorCode,
        ShiftViewVO,
        LovColorCodeVO1;
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


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int EMPCODE = AttributesEnum.EmpCode.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SHIFTID = AttributesEnum.ShiftId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int SHIFTDAYS = AttributesEnum.ShiftDays.index();
    public static final int SHIFTSEQ = AttributesEnum.ShiftSeq.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int VALIDENDDT = AttributesEnum.ValidEndDt.index();
    public static final int VALIDSTRTDT = AttributesEnum.ValidStrtDt.index();
    public static final int SHIFTCLRCD = AttributesEnum.ShiftClrCd.index();
    public static final int TRANSGRPID = AttributesEnum.TransGrpId.index();
    public static final int TRANSSHIFTTM = AttributesEnum.TransShiftTm.index();
    public static final int TRANSCOLORCODE = AttributesEnum.TranscolorCode.index();
    public static final int SHIFTVIEWVO = AttributesEnum.ShiftViewVO.index();
    public static final int LOVCOLORCODEVO1 = AttributesEnum.LovColorCodeVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HcmEmpShiftVORowImpl() {
    }

    /**
     * Gets HcmEmpShiftEO entity object.
     * @return the HcmEmpShiftEO
     */
    public HcmEmpShiftEOImpl getHcmEmpShiftEO() {
        return (HcmEmpShiftEOImpl) getEntity(ENTITY_HCMEMPSHIFTEO);
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
     * Gets the attribute value for EMP_CODE using the alias name EmpCode.
     * @return the EMP_CODE
     */
    public Integer getEmpCode() {
        return (Integer) getAttributeInternal(EMPCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CODE using the alias name EmpCode.
     * @param value value to set the EMP_CODE
     */
    public void setEmpCode(Integer value) {
        setAttributeInternal(EMPCODE, value);
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
     * Gets the attribute value for SHIFT_ID using the alias name ShiftId.
     * @return the SHIFT_ID
     */
    public String getShiftId() {
        return (String) getAttributeInternal(SHIFTID);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT_ID using the alias name ShiftId.
     * @param value value to set the SHIFT_ID
     */
    public void setShiftId(String value) {
        setAttributeInternal(SHIFTID, value);
    }

    /**
     * Gets the attribute value for SHIFT_DAYS using the alias name ShiftDays.
     * @return the SHIFT_DAYS
     */
    public Integer getShiftDays() {
        return (Integer) getAttributeInternal(SHIFTDAYS);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT_DAYS using the alias name ShiftDays.
     * @param value value to set the SHIFT_DAYS
     */
    public void setShiftDays(Integer value) {
        setAttributeInternal(SHIFTDAYS, value);
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
     * Gets the attribute value for SHIFT_SEQ using the alias name ShiftSeq.
     * @return the SHIFT_SEQ
     */
    public Integer getShiftSeq() {
        return (Integer) getAttributeInternal(SHIFTSEQ);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT_SEQ using the alias name ShiftSeq.
     * @param value value to set the SHIFT_SEQ
     */
    public void setShiftSeq(Integer value) {
        setAttributeInternal(SHIFTSEQ, value);
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
     * Gets the attribute value for VALID_END_DT using the alias name ValidEndDt.
     * @return the VALID_END_DT
     */
    public Timestamp getValidEndDt() {
        return (Timestamp) getAttributeInternal(VALIDENDDT);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_END_DT using the alias name ValidEndDt.
     * @param value value to set the VALID_END_DT
     */
    public void setValidEndDt(Timestamp value) {
        setAttributeInternal(VALIDENDDT, value);
    }

    /**
     * Gets the attribute value for VALID_STRT_DT using the alias name ValidStrtDt.
     * @return the VALID_STRT_DT
     */
    public Timestamp getValidStrtDt() {
        return (Timestamp) getAttributeInternal(VALIDSTRTDT);
    }

    /**
     * Sets <code>value</code> as attribute value for VALID_STRT_DT using the alias name ValidStrtDt.
     * @param value value to set the VALID_STRT_DT
     */
    public void setValidStrtDt(Timestamp value) {
        setAttributeInternal(VALIDSTRTDT, value);
    }

    /**
     * Gets the attribute value for SHIFT_CLR_CD using the alias name ShiftClrCd.
     * @return the SHIFT_CLR_CD
     */
    public String getShiftClrCd() {
        return (String) getAttributeInternal(SHIFTCLRCD);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIFT_CLR_CD using the alias name ShiftClrCd.
     * @param value value to set the SHIFT_CLR_CD
     */
    public void setShiftClrCd(String value) {
        setAttributeInternal(SHIFTCLRCD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransGrpId.
     * @return the TransGrpId
     */
    public String getTransGrpId() {
        if(getAttributeInternal(TRANSGRPID)!= null)
        return (String) getAttributeInternal(TRANSGRPID);
        else if(getDocId() != null)
        {
            HcmEmpPrfAMImpl am = (HcmEmpPrfAMImpl) this.getApplicationModule();
           Row r[]= am.getOrgHcmEmpPrf().getFilteredRows("DocId", getDocId());
            if(r.length>0)
            return (String) r[0].getAttribute("EmpGrpId");
            }
         return (String) getAttributeInternal(TRANSGRPID);
     }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransGrpId.
     * @param value value to set the  TransGrpId
     */
    public void setTransGrpId(String value) {
        setAttributeInternal(TRANSGRPID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransShiftTm.
     * @return the TransShiftTm
     */
    public String getTransShiftTm() {
        if( getAttributeInternal(TRANSSHIFTTM) !=null)
        return (String) getAttributeInternal(TRANSSHIFTTM);
        else if(getShiftId()!=null)
        {
                /*HcmEmpPrfAMImpl am = (HcmEmpPrfAMImpl) this.getApplicationModule();
                 am.getShiftView().setNamedWhereClauseParam("cldIdBindVar", getCldId());
                am.getShiftView().setNamedWhereClauseParam("slocIdBindVar", getSlocId());
                am.getShiftView().setNamedWhereClauseParam("hoOrgIdBindVar", getHoOrgId());
                am.getShiftView().setNamedWhereClauseParam("orgIdBindVar", getOrgId());
                am.getShiftView().setNamedWhereClauseParam("grpIdBindVar", getTransGrpId());
                am.getShiftView().executeQuery();
                Row[] r= am.getShiftView().getFilteredRows("ShiftId", getShiftId()); */
                
                Row[] r= this.getShiftViewVO().getFilteredRows("ShiftId", getShiftId());
                if(r.length>0)
                return (String) r[0].getAttribute("ShiftTm");
            }
        return (String) getAttributeInternal(TRANSSHIFTTM);

    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransShiftTm.
     * @param value value to set the  TransShiftTm
     */
    public void setTransShiftTm(String value) {
        setAttributeInternal(TRANSSHIFTTM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TranscolorCode.
     * @return the TranscolorCode
     */
    public Color getTranscolorCode() {
        if(getAttributeInternal(TRANSCOLORCODE)!=null)
        return (Color) getAttributeInternal(TRANSCOLORCODE);
        else
        {
            if(getShiftClrCd()!=null)
            {
                 String[]   str = getShiftClrCd().split(",");
               return new Color(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
                }
            }
        return (Color) getAttributeInternal(TRANSCOLORCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TranscolorCode.
     * @param value value to set the  TranscolorCode
     */
    public void setTranscolorCode(Color value) {
        setAttributeInternal(TRANSCOLORCODE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ShiftViewVO.
     */
    public RowSet getShiftViewVO() {
        return (RowSet) getAttributeInternal(SHIFTVIEWVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovColorCodeVO1.
     */
    public RowSet getLovColorCodeVO1() {
        return (RowSet) getAttributeInternal(LOVCOLORCODEVO1);
    }
}

