package hcmattrsetupapp.model.views;

import hcmattrsetupapp.model.entities.OrgHcmAttLnkEOImpl;

import hcmattrsetupapp.model.services.HcmAttrSetupAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 08 17:33:13 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrgHcmAttLnkVORowImpl extends ViewRowImpl {

    public static final int ENTITY_ORGHCMATTLNKEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        AttId,
        CntryId,
        TransCntryNm,
        LovDedForLinkVO1;
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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ATTID = AttributesEnum.AttId.index();
    public static final int CNTRYID = AttributesEnum.CntryId.index();
    public static final int TRANSCNTRYNM = AttributesEnum.TransCntryNm.index();
    public static final int LOVDEDFORLINKVO1 = AttributesEnum.LovDedForLinkVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OrgHcmAttLnkVORowImpl() {
    }

    /**
     * Gets OrgHcmAttLnkEO entity object.
     * @return the OrgHcmAttLnkEO
     */
    public OrgHcmAttLnkEOImpl getOrgHcmAttLnkEO() {
        return (OrgHcmAttLnkEOImpl) getEntity(ENTITY_ORGHCMATTLNKEO);
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
     * Gets the attribute value for ATT_ID using the alias name AttId.
     * @return the ATT_ID
     */
    public Integer getAttId() {
        return (Integer) getAttributeInternal(ATTID);
    }

    /**
     * Sets <code>value</code> as attribute value for ATT_ID using the alias name AttId.
     * @param value value to set the ATT_ID
     */
    public void setAttId(Integer value) {
        setAttributeInternal(ATTID, value);
    }

    /**
     * Gets the attribute value for CNTRY_ID using the alias name CntryId.
     * @return the CNTRY_ID
     */
    public Integer getCntryId() {
        return (Integer) getAttributeInternal(CNTRYID);
    }

    /**
     * Sets <code>value</code> as attribute value for CNTRY_ID using the alias name CntryId.
     * @param value value to set the CNTRY_ID
     */
    public void setCntryId(Integer value) {
        setAttributeInternal(CNTRYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCntryNm.
     * @return the TransCntryNm
     */
    public String getTransCntryNm() {
        if (getCntryId() != null) {
            HcmAttrSetupAMImpl am = (HcmAttrSetupAMImpl) this.getApplicationModule();
            Row[] filteredRows = am.getCountryVO1().getFilteredRows("GlblCntryId", getCntryId());
            if (filteredRows.length > 0) {
                return filteredRows[0].getAttribute("GlblCntryDesc").toString();
            }
        }
        return (String) getAttributeInternal(TRANSCNTRYNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCntryNm.
     * @param value value to set the  TransCntryNm
     */
    public void setTransCntryNm(String value) {
        setAttributeInternal(TRANSCNTRYNM, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovDedForLinkVO1.
     */
    public RowSet getLovDedForLinkVO1() {
        return (RowSet) getAttributeInternal(LOVDEDFORLINKVO1);
    }
}

