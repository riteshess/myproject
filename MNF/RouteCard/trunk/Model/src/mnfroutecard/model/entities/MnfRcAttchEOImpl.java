package mnfroutecard.model.entities;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.domain.BFileDomain;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 22 14:58:10 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfRcAttchEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        DocId,
        AttchFlNm,
        AttchFlExtn,
        AttchFlPath,
        AttachFl,
        DispFlNm,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        MnfRc;
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
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int ATTCHFLNM = AttributesEnum.AttchFlNm.index();
    public static final int ATTCHFLEXTN = AttributesEnum.AttchFlExtn.index();
    public static final int ATTCHFLPATH = AttributesEnum.AttchFlPath.index();
    public static final int ATTACHFL = AttributesEnum.AttachFl.index();
    public static final int DISPFLNM = AttributesEnum.DispFlNm.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int MNFRC = AttributesEnum.MnfRc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfRcAttchEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mnfroutecard.model.entities.MnfRcAttchEO");
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
     * Gets the attribute value for DocId, using the alias name DocId.
     * @return the value of DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocId.
     * @param value value to set the DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for AttchFlNm, using the alias name AttchFlNm.
     * @return the value of AttchFlNm
     */
    public String getAttchFlNm() {
        return (String) getAttributeInternal(ATTCHFLNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttchFlNm.
     * @param value value to set the AttchFlNm
     */
    public void setAttchFlNm(String value) {
        setAttributeInternal(ATTCHFLNM, value);
    }

    /**
     * Gets the attribute value for AttchFlExtn, using the alias name AttchFlExtn.
     * @return the value of AttchFlExtn
     */
    public String getAttchFlExtn() {
        return (String) getAttributeInternal(ATTCHFLEXTN);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttchFlExtn.
     * @param value value to set the AttchFlExtn
     */
    public void setAttchFlExtn(String value) {
        setAttributeInternal(ATTCHFLEXTN, value);
    }

    /**
     * Gets the attribute value for AttchFlPath, using the alias name AttchFlPath.
     * @return the value of AttchFlPath
     */
    public String getAttchFlPath() {
        return (String) getAttributeInternal(ATTCHFLPATH);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttchFlPath.
     * @param value value to set the AttchFlPath
     */
    public void setAttchFlPath(String value) {
        setAttributeInternal(ATTCHFLPATH, value);
    }

    /**
     * Gets the attribute value for AttachFl, using the alias name AttachFl.
     * @return the value of AttachFl
     */
    public BFileDomain getAttachFl() {
        return (BFileDomain) getAttributeInternal(ATTACHFL);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttachFl.
     * @param value value to set the AttachFl
     */
    public void setAttachFl(BFileDomain value) {
        setAttributeInternal(ATTACHFL, value);
    }

    /**
     * Gets the attribute value for DispFlNm, using the alias name DispFlNm.
     * @return the value of DispFlNm
     */
    public String getDispFlNm() {
        return (String) getAttributeInternal(DISPFLNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for DispFlNm.
     * @param value value to set the DispFlNm
     */
    public void setDispFlNm(String value) {
        setAttributeInternal(DISPFLNM, value);
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
     * @return the associated entity MnfRcEOImpl.
     */
    public MnfRcEOImpl getMnfRc() {
        return (MnfRcEOImpl) getAttributeInternal(MNFRC);
    }

    /**
     * Sets <code>value</code> as the associated entity MnfRcEOImpl.
     */
    public void setMnfRc(MnfRcEOImpl value) {
        setAttributeInternal(MNFRC, value);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param hoOrgId key constituent
     * @param orgId key constituent
     * @param docId key constituent
     * @param attchFlNm key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String hoOrgId, String orgId, String docId,
                                       String attchFlNm) {
        return new Key(new Object[] { cldId, slocId, hoOrgId, orgId, docId, attchFlNm });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        this.setUsrIdCreate(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
        this.setUsrIdCreateDt(new Timestamp(System.currentTimeMillis()));
        
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        try {
            super.lock();
        } catch (RowInconsistentException e) {
            refresh(REFRESH_WITH_DB_ONLY_IF_UNCHANGED | REFRESH_CONTAINEES);
            super.lock();
        }
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_UPDATE) {
            this.setUsrIdMod(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
            this.setUsrIdModDt(new Timestamp(System.currentTimeMillis()));
        }
        super.doDML(operation, e);
    }
    
    /**Method to resolve expression- returns String value*/
    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }
}

