package mmpochklistapp.model.entities;

import oracle.jbo.domain.Timestamp;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 18 10:25:20 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmIpoDocChkLstEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        OrgId,
        DocId,
        GlblDocId,
        GlblDocTypeId,
        SysDoc,
        ProcessDays,
        ProcessSeq,
        Reqd,
        DueDate,
        ClrDate,
        Remarks,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt;
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
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int GLBLDOCID = AttributesEnum.GlblDocId.index();
    public static final int GLBLDOCTYPEID = AttributesEnum.GlblDocTypeId.index();
    public static final int SYSDOC = AttributesEnum.SysDoc.index();
    public static final int PROCESSDAYS = AttributesEnum.ProcessDays.index();
    public static final int PROCESSSEQ = AttributesEnum.ProcessSeq.index();
    public static final int REQD = AttributesEnum.Reqd.index();
    public static final int DUEDATE = AttributesEnum.DueDate.index();
    public static final int CLRDATE = AttributesEnum.ClrDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmIpoDocChkLstEOImpl() {
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
     * Gets the attribute value for GlblDocId, using the alias name GlblDocId.
     * @return the value of GlblDocId
     */
    public Integer getGlblDocId() {
        return (Integer) getAttributeInternal(GLBLDOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblDocId.
     * @param value value to set the GlblDocId
     */
    public void setGlblDocId(Integer value) {
        setAttributeInternal(GLBLDOCID, value);
    }

    /**
     * Gets the attribute value for GlblDocTypeId, using the alias name GlblDocTypeId.
     * @return the value of GlblDocTypeId
     */
    public Integer getGlblDocTypeId() {
        return (Integer) getAttributeInternal(GLBLDOCTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblDocTypeId.
     * @param value value to set the GlblDocTypeId
     */
    public void setGlblDocTypeId(Integer value) {
        setAttributeInternal(GLBLDOCTYPEID, value);
    }

    /**
     * Gets the attribute value for SysDoc, using the alias name SysDoc.
     * @return the value of SysDoc
     */
    public String getSysDoc() {
        return (String) getAttributeInternal(SYSDOC);
    }

    /**
     * Sets <code>value</code> as the attribute value for SysDoc.
     * @param value value to set the SysDoc
     */
    public void setSysDoc(String value) {
        setAttributeInternal(SYSDOC, value);
    }

    /**
     * Gets the attribute value for ProcessDays, using the alias name ProcessDays.
     * @return the value of ProcessDays
     */
    public Integer getProcessDays() {
        return (Integer) getAttributeInternal(PROCESSDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessDays.
     * @param value value to set the ProcessDays
     */
    public void setProcessDays(Integer value) {
        setAttributeInternal(PROCESSDAYS, value);
    }

    /**
     * Gets the attribute value for ProcessSeq, using the alias name ProcessSeq.
     * @return the value of ProcessSeq
     */
    public Integer getProcessSeq() {
        return (Integer) getAttributeInternal(PROCESSSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProcessSeq.
     * @param value value to set the ProcessSeq
     */
    public void setProcessSeq(Integer value) {
        setAttributeInternal(PROCESSSEQ, value);
    }

    /**
     * Gets the attribute value for Reqd, using the alias name Reqd.
     * @return the value of Reqd
     */
    public String getReqd() {
        return (String) getAttributeInternal(REQD);
    }

    /**
     * Sets <code>value</code> as the attribute value for Reqd.
     * @param value value to set the Reqd
     */
    public void setReqd(String value) {
        setAttributeInternal(REQD, value);
    }

    /**
     * Gets the attribute value for DueDate, using the alias name DueDate.
     * @return the value of DueDate
     */
    public Timestamp getDueDate() {
        return (Timestamp) getAttributeInternal(DUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DueDate.
     * @param value value to set the DueDate
     */
    public void setDueDate(Timestamp value) {
        setAttributeInternal(DUEDATE, value);
    }

    /**
     * Gets the attribute value for ClrDate, using the alias name ClrDate.
     * @return the value of ClrDate
     */
    public Timestamp getClrDate() {
        return (Timestamp) getAttributeInternal(CLRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClrDate.
     * @param value value to set the ClrDate
     */
    public void setClrDate(Timestamp value) {
        setAttributeInternal(CLRDATE, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param docId key constituent
     * @param glblDocId key constituent
     * @param glblDocTypeId key constituent
     * @param sysDoc key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String docId, Integer glblDocId,
                                       Integer glblDocTypeId, String sysDoc) {
        return new Key(new Object[] { cldId, slocId, orgId, docId, glblDocId, glblDocTypeId, sysDoc });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mmpochklistapp.model.entities.MmIpoDocChkLstEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        //super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_UPDATE) {
            setUsrIdMod(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
            setUsrIdModDt(new oracle.jbo.domain.Timestamp(System.currentTimeMillis()));
        }
        super.doDML(operation, e);
    }

    public Object resolvEl(String data) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, data, Object.class);
        return exp.getValue(elContext);
    }
}

