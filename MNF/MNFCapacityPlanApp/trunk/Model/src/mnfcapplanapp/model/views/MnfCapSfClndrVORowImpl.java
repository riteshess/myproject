package mnfcapplanapp.model.views;

import mnfcapplanapp.model.entities.MnfCapSfClndrEOImpl;
import mnfcapplanapp.model.service.CapacityPlanAppModuleImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 19 14:58:54 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfCapSfClndrVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MNFCAPSFCLNDREO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        EndDt,
        HoOrgId,
        OrgId,
        SfCalId,
        SfRemarks,
        ShiftId,
        SlocId,
        StrtDt,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        WcId,
        WsId,
        ALLDAY,
        ClndrType,
        TransTagCalType,
        TransShift,
        TransWorkCenter,
        TransWorkStation,
        LOVCalEntryType1,
        LOVShift1,
        LOVWorkCenter1,
        LOVWorkStation1;
        static AttributesEnum[] vals = null; ;
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
    public static final int ENDDT = AttributesEnum.EndDt.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SFCALID = AttributesEnum.SfCalId.index();
    public static final int SFREMARKS = AttributesEnum.SfRemarks.index();
    public static final int SHIFTID = AttributesEnum.ShiftId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int STRTDT = AttributesEnum.StrtDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int WCID = AttributesEnum.WcId.index();
    public static final int WSID = AttributesEnum.WsId.index();
    public static final int ALLDAY = AttributesEnum.ALLDAY.index();
    public static final int CLNDRTYPE = AttributesEnum.ClndrType.index();
    public static final int TRANSTAGCALTYPE = AttributesEnum.TransTagCalType.index();
    public static final int TRANSSHIFT = AttributesEnum.TransShift.index();
    public static final int TRANSWORKCENTER = AttributesEnum.TransWorkCenter.index();
    public static final int TRANSWORKSTATION = AttributesEnum.TransWorkStation.index();
    public static final int LOVCALENTRYTYPE1 = AttributesEnum.LOVCalEntryType1.index();
    public static final int LOVSHIFT1 = AttributesEnum.LOVShift1.index();
    public static final int LOVWORKCENTER1 = AttributesEnum.LOVWorkCenter1.index();
    public static final int LOVWORKSTATION1 = AttributesEnum.LOVWorkStation1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfCapSfClndrVORowImpl() {
    }

    /**
     * Gets MnfCapSfClndrEO entity object.
     * @return the MnfCapSfClndrEO
     */
    public MnfCapSfClndrEOImpl getMnfCapSfClndrEO() {
        return (MnfCapSfClndrEOImpl) getEntity(ENTITY_MNFCAPSFCLNDREO);
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
     * Gets the attribute value for END_DT using the alias name EndDt.
     * @return the END_DT
     */
    public Date getEndDt() {
        return (Date) getAttributeInternal(ENDDT);
    }

    /**
     * Sets <code>value</code> as attribute value for END_DT using the alias name EndDt.
     * @param value value to set the END_DT
     */
    public void setEndDt(Date value) {
        setAttributeInternal(ENDDT, value);
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
     * Gets the attribute value for SF_CAL_ID using the alias name SfCalId.
     * @return the SF_CAL_ID
     */
    public String getSfCalId() {
        return (String) getAttributeInternal(SFCALID);
    }

    /**
     * Sets <code>value</code> as attribute value for SF_CAL_ID using the alias name SfCalId.
     * @param value value to set the SF_CAL_ID
     */
    public void setSfCalId(String value) {
        setAttributeInternal(SFCALID, value);
    }

    /**
     * Gets the attribute value for SF_REMARKS using the alias name SfRemarks.
     * @return the SF_REMARKS
     */
    public String getSfRemarks() {
        return (String) getAttributeInternal(SFREMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for SF_REMARKS using the alias name SfRemarks.
     * @param value value to set the SF_REMARKS
     */
    public void setSfRemarks(String value) {
        setAttributeInternal(SFREMARKS, value);
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
     * Gets the attribute value for STRT_DT using the alias name StrtDt.
     * @return the STRT_DT
     */
    public Date getStrtDt() {
        return (Date) getAttributeInternal(STRTDT);
    }

    /**
     * Sets <code>value</code> as attribute value for STRT_DT using the alias name StrtDt.
     * @param value value to set the STRT_DT
     */
    public void setStrtDt(Date value) {
        setAttributeInternal(STRTDT, value);
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
     * Gets the attribute value for WC_ID using the alias name WcId.
     * @return the WC_ID
     */
    public String getWcId() {
        return (String) getAttributeInternal(WCID);
    }

    /**
     * Sets <code>value</code> as attribute value for WC_ID using the alias name WcId.
     * @param value value to set the WC_ID
     */
    public void setWcId(String value) {
        setAttributeInternal(WCID, value);
    }

    /**
     * Gets the attribute value for WS_ID using the alias name WsId.
     * @return the WS_ID
     */
    public String getWsId() {
        return (String) getAttributeInternal(WSID);
    }

    /**
     * Sets <code>value</code> as attribute value for WS_ID using the alias name WsId.
     * @param value value to set the WS_ID
     */
    public void setWsId(String value) {
        setAttributeInternal(WSID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ALLDAY.
     * @return the ALLDAY
     */
    public String getALLDAY() {
        return "ALLDAY";
        //return (String) getAttributeInternal(ALLDAY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ALLDAY.
     * @param value value to set the  ALLDAY
     */
    public void setALLDAY(String value) {
        setAttributeInternal(ALLDAY, value);
    }

    /**
     * Gets the attribute value for CLNDR_TYPE using the alias name ClndrType.
     * @return the CLNDR_TYPE
     */
    public Integer getClndrType() {
        return (Integer) getAttributeInternal(CLNDRTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for CLNDR_TYPE using the alias name ClndrType.
     * @param value value to set the CLNDR_TYPE
     */
    public void setClndrType(Integer value) {
        setAttributeInternal(CLNDRTYPE, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransTagCalType.
     * @return the TransTagCalType
     */
    public String getTransTagCalType() {
        return (String) this.getClndrType().toString();
        // return (String) getAttributeInternal(TRANSTAGCALTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransTagCalType.
     * @param value value to set the  TransTagCalType
     */
    public void setTransTagCalType(String value) {
        setAttributeInternal(TRANSTAGCALTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransShift.
     * @return the TransShift
     */
    public String getTransShift() {
        if (this.getShiftId() != null) {
            ViewObjectImpl impl = getAm().getLOVSchdlShiftDisp1();
            impl.setNamedWhereClauseParam("BindCldId", this.getCldId());
            impl.setNamedWhereClauseParam("BindHoOrgId", this.getHoOrgId());
            impl.setNamedWhereClauseParam("BindOrgId", this.getOrgId());
            impl.setNamedWhereClauseParam("BindSlocId", this.getSlocId());
            impl.setNamedWhereClauseParam("BindShiftId", this.getShiftId());
            impl.executeQuery();
            Row[] allRowsInRange = impl.getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                Object a = allRowsInRange[0].getAttribute("ShiftNm");
                String ShiftNm = (a == null ? null : a.toString());
                return ShiftNm;
            }
        }
        return (String) getAttributeInternal(TRANSSHIFT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransShift.
     * @param value value to set the  TransShift
     */
    public void setTransShift(String value) {
        setAttributeInternal(TRANSSHIFT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransWorkCenter.
     * @return the TransWorkCenter
     */
    public String getTransWorkCenter() {
        if (this.getWcId() != null) {
            ViewObjectImpl impl = getAm().getLOVSchdlWcDisp1();
            impl.setNamedWhereClauseParam("BindCldId", this.getCldId());
            impl.setNamedWhereClauseParam("BindHoOrgId", this.getHoOrgId());
            impl.setNamedWhereClauseParam("BindOrgId", this.getOrgId());
            impl.setNamedWhereClauseParam("BindSlocId", this.getSlocId());
            impl.setNamedWhereClauseParam("BindWcId", this.getWcId());
            impl.executeQuery();
            Row[] allRowsInRange = impl.getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                Object a = allRowsInRange[0].getAttribute("WcDesc");
                String WcDesc = (a == null ? null : a.toString());
                return WcDesc;
            }
        }
        return (String) getAttributeInternal(TRANSWORKCENTER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransWorkCenter.
     * @param value value to set the  TransWorkCenter
     */
    public void setTransWorkCenter(String value) {
        setAttributeInternal(TRANSWORKCENTER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransWorkStation.
     * @return the TransWorkStation
     */
    public String getTransWorkStation() {
        if (this.getWsId() != null) {
            ViewObjectImpl impl = getAm().getLOVSchdlWsDisp1();
            impl.setNamedWhereClauseParam("BindCldId", this.getCldId());
            impl.setNamedWhereClauseParam("BindHoOrgId", this.getHoOrgId());
            impl.setNamedWhereClauseParam("BindOrgId", this.getOrgId());
            impl.setNamedWhereClauseParam("BindSlocId", this.getSlocId());
            impl.setNamedWhereClauseParam("BindWsId", this.getWsId());
            impl.executeQuery();
            Row[] allRowsInRange = impl.getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                Object a = allRowsInRange[0].getAttribute("WsDesc");
                String WsDesc = (a == null ? null : a.toString());
                return WsDesc;
            }
        }
        return (String) getAttributeInternal(TRANSWORKSTATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransWorkStation.
     * @param value value to set the  TransWorkStation
     */
    public void setTransWorkStation(String value) {
        setAttributeInternal(TRANSWORKSTATION, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVCalEntryTypeVO1.
     */
    public RowSet getLOVCalEntryType1() {
        return (RowSet) getAttributeInternal(LOVCALENTRYTYPE1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVShift1.
     */
    public RowSet getLOVShift1() {
        return (RowSet) getAttributeInternal(LOVSHIFT1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVWorkCenter1.
     */
    public RowSet getLOVWorkCenter1() {
        return (RowSet) getAttributeInternal(LOVWORKCENTER1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVWorkStation1.
     */
    public RowSet getLOVWorkStation1() {
        return (RowSet) getAttributeInternal(LOVWORKSTATION1);
    }

    /**
     * @return
     * Generalized function to call object of application module.
     */
    public CapacityPlanAppModuleImpl getAm() {
        return (CapacityPlanAppModuleImpl) getApplicationModule();
    }

}

