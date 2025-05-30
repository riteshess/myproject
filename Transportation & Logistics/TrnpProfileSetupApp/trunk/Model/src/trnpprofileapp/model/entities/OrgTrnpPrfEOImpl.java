package trnpprofileapp.model.entities;

import adf.utils.ebiz.EbizParams;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 25 12:49:04 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrgTrnpPrfEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        OrgId,
        HoOrgId,
        UseLr,
        OrgTrnpAcc,
        UseVhclSchdl,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        FreezePrf,
        EmpDesgId;
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
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int USELR = AttributesEnum.UseLr.index();
    public static final int ORGTRNPACC = AttributesEnum.OrgTrnpAcc.index();
    public static final int USEVHCLSCHDL = AttributesEnum.UseVhclSchdl.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int FREEZEPRF = AttributesEnum.FreezePrf.index();
    public static final int EMPDESGID = AttributesEnum.EmpDesgId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OrgTrnpPrfEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("trnpprofileapp.model.entities.OrgTrnpPrfEO");
    }


    /**
     * Gets the attribute value for CldId, using the alias name CldId.
     * @return the value of CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CldId.
     * @param value value to set the CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for SlocId, using the alias name SlocId.
     * @return the value of SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SlocId.
     * @param value value to set the SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the value of OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for HoOrgId, using the alias name HoOrgId.
     * @return the value of HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HoOrgId.
     * @param value value to set the HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for UseLr, using the alias name UseLr.
     * @return the value of UseLr
     */
    public String getUseLr() {
        return (String) getAttributeInternal(USELR);
    }

    /**
     * Sets <code>value</code> as the attribute value for UseLr.
     * @param value value to set the UseLr
     */
    public void setUseLr(String value) {
        setAttributeInternal(USELR, value);
    }

    /**
     * Gets the attribute value for OrgTrnpAcc, using the alias name OrgTrnpAcc.
     * @return the value of OrgTrnpAcc
     */
    public Integer getOrgTrnpAcc() {
        return (Integer) getAttributeInternal(ORGTRNPACC);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgTrnpAcc.
     * @param value value to set the OrgTrnpAcc
     */
    public void setOrgTrnpAcc(Integer value) {
        setAttributeInternal(ORGTRNPACC, value);
    }

    /**
     * Gets the attribute value for UseVhclSchdl, using the alias name UseVhclSchdl.
     * @return the value of UseVhclSchdl
     */
    public String getUseVhclSchdl() {
        return (String) getAttributeInternal(USEVHCLSCHDL);
    }

    /**
     * Sets <code>value</code> as the attribute value for UseVhclSchdl.
     * @param value value to set the UseVhclSchdl
     */
    public void setUseVhclSchdl(String value) {
        setAttributeInternal(USEVHCLSCHDL, value);
    }

    /**
     * Gets the attribute value for UsrIdCreate, using the alias name UsrIdCreate.
     * @return the value of UsrIdCreate
     */
    public Integer getUsrIdCreate() {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreate.
     * @param value value to set the UsrIdCreate
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for UsrIdCreateDt, using the alias name UsrIdCreateDt.
     * @return the value of UsrIdCreateDt
     */
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreateDt.
     * @param value value to set the UsrIdCreateDt
     */
    public void setUsrIdCreateDt(Timestamp value) {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for UsrIdMod, using the alias name UsrIdMod.
     * @return the value of UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdMod.
     * @param value value to set the UsrIdMod
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for UsrIdModDt, using the alias name UsrIdModDt.
     * @return the value of UsrIdModDt
     */
    public Timestamp getUsrIdModDt() {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdModDt.
     * @param value value to set the UsrIdModDt
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for FreezePrf, using the alias name FreezePrf.
     * @return the value of FreezePrf
     */
    public String getFreezePrf() {
        return (String) getAttributeInternal(FREEZEPRF);
    }

    /**
     * Sets <code>value</code> as the attribute value for FreezePrf.
     * @param value value to set the FreezePrf
     */
    public void setFreezePrf(String value) {
        setAttributeInternal(FREEZEPRF, value);
    }


    /**
     * Gets the attribute value for EmpDesgId, using the alias name EmpDesgId.
     * @return the value of EmpDesgId
     */
    public String getEmpDesgId() {
        return (String) getAttributeInternal(EMPDESGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpDesgId.
     * @param value value to set the EmpDesgId
     */
    public void setEmpDesgId(String value) {
        setAttributeInternal(EMPDESGID, value);
    }

    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param hoOrgId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String hoOrgId) {
        return new Key(new Object[] { cldId, slocId, orgId, hoOrgId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setUsrIdCreate(EbizParams.GLBL_APP_USR());
        setCldId(EbizParams.GLBL_APP_CLD_ID());
        setHoOrgId(EbizParams.GLBL_HO_ORG_ID());
        setOrgId(EbizParams.GLBL_APP_USR_ORG());
        setSlocId(EbizParams.GLBL_APP_SERV_LOC());
        setUsrIdCreateDt((new Timestamp(System.currentTimeMillis())));
        setUseVhclSchdl("Y");
        setUseLr("Y");
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        //   super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

