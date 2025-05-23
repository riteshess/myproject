package mnfroutecard.model.entities;

import java.math.BigDecimal;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 22 12:55:44 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfRcOpEOImpl extends EntityImpl {
   
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        DocId,
        OpId,
        OpSrNo,
        OutptItmId,
        OutptItmQty,
        PdoPriority,
        WcId,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        WsId,
        ShiftId,
        EmpId,
        OpLocType,
        OpRmrk,
        EndDt,
        StrtDt,
        OpStat,
        BalOpQty,
        TmpBalOpQty,
        MnfRc,
        MnfRcOpItm;
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
    public static final int OPID = AttributesEnum.OpId.index();
    public static final int OPSRNO = AttributesEnum.OpSrNo.index();
    public static final int OUTPTITMID = AttributesEnum.OutptItmId.index();
    public static final int OUTPTITMQTY = AttributesEnum.OutptItmQty.index();
    public static final int PDOPRIORITY = AttributesEnum.PdoPriority.index();
    public static final int WCID = AttributesEnum.WcId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int WSID = AttributesEnum.WsId.index();
    public static final int SHIFTID = AttributesEnum.ShiftId.index();
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int OPLOCTYPE = AttributesEnum.OpLocType.index();
    public static final int OPRMRK = AttributesEnum.OpRmrk.index();
    public static final int ENDDT = AttributesEnum.EndDt.index();
    public static final int STRTDT = AttributesEnum.StrtDt.index();
    public static final int OPSTAT = AttributesEnum.OpStat.index();
    public static final int BALOPQTY = AttributesEnum.BalOpQty.index();
    public static final int TMPBALOPQTY = AttributesEnum.TmpBalOpQty.index();
    public static final int MNFRC = AttributesEnum.MnfRc.index();
    public static final int MNFRCOPITM = AttributesEnum.MnfRcOpItm.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfRcOpEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mnfroutecard.model.entities.MnfRcOpEO");
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
     * Gets the attribute value for OpId, using the alias name OpId.
     * @return the value of OpId
     */
    public String getOpId() {
        return (String) getAttributeInternal(OPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpId.
     * @param value value to set the OpId
     */
    public void setOpId(String value) {
        setAttributeInternal(OPID, value);
    }

    /**
     * Gets the attribute value for OpSrNo, using the alias name OpSrNo.
     * @return the value of OpSrNo
     */
    public Integer getOpSrNo() {
        return (Integer) getAttributeInternal(OPSRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpSrNo.
     * @param value value to set the OpSrNo
     */
    public void setOpSrNo(Integer value) {
        setAttributeInternal(OPSRNO, value);
    }

    /**
     * Gets the attribute value for OutptItmId, using the alias name OutptItmId.
     * @return the value of OutptItmId
     */
    public String getOutptItmId() {
        return (String) getAttributeInternal(OUTPTITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OutptItmId.
     * @param value value to set the OutptItmId
     */
    public void setOutptItmId(String value) {
        setAttributeInternal(OUTPTITMID, value);
    }

    /**
     * Gets the attribute value for OutptItmQty, using the alias name OutptItmQty.
     * @return the value of OutptItmQty
     */
    public Number getOutptItmQty() {
        return (Number) getAttributeInternal(OUTPTITMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OutptItmQty.
     * @param value value to set the OutptItmQty
     */
    public void setOutptItmQty(Number value) {
        setAttributeInternal(OUTPTITMQTY, value);
    }

    /**
     * Gets the attribute value for PdoPriority, using the alias name PdoPriority.
     * @return the value of PdoPriority
     */
    public Integer getPdoPriority() {
        return (Integer) getAttributeInternal(PDOPRIORITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for PdoPriority.
     * @param value value to set the PdoPriority
     */
    public void setPdoPriority(Integer value) {
        setAttributeInternal(PDOPRIORITY, value);
    }

    /**
     * Gets the attribute value for WcId, using the alias name WcId.
     * @return the value of WcId
     */
    public String getWcId() {
        return (String) getAttributeInternal(WCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WcId.
     * @param value value to set the WcId
     */
    public void setWcId(String value) {
        setAttributeInternal(WCID, value);
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
     * Gets the attribute value for WsId, using the alias name WsId.
     * @return the value of WsId
     */
    public String getWsId() {
        return (String) getAttributeInternal(WSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WsId.
     * @param value value to set the WsId
     */
    public void setWsId(String value) {
        setAttributeInternal(WSID, value);
    }

    /**
     * Gets the attribute value for ShiftId, using the alias name ShiftId.
     * @return the value of ShiftId
     */
    public String getShiftId() {
        return (String) getAttributeInternal(SHIFTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShiftId.
     * @param value value to set the ShiftId
     */
    public void setShiftId(String value) {
        setAttributeInternal(SHIFTID, value);
    }

    /**
     * Gets the attribute value for EmpId, using the alias name EmpId.
     * @return the value of EmpId
     */
    public Integer getEmpId() {
        return (Integer) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpId.
     * @param value value to set the EmpId
     */
    public void setEmpId(Integer value) {
        setAttributeInternal(EMPID, value);
    }

    /**
     * Gets the attribute value for OpLocType, using the alias name OpLocType.
     * @return the value of OpLocType
     */
    public Integer getOpLocType() {
        return (Integer) getAttributeInternal(OPLOCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpLocType.
     * @param value value to set the OpLocType
     */
    public void setOpLocType(Integer value) {
        setAttributeInternal(OPLOCTYPE, value);
    }

    /**
     * Gets the attribute value for OpRmrk, using the alias name OpRmrk.
     * @return the value of OpRmrk
     */
    public String getOpRmrk() {
        return (String) getAttributeInternal(OPRMRK);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpRmrk.
     * @param value value to set the OpRmrk
     */
    public void setOpRmrk(String value) {
        setAttributeInternal(OPRMRK, value);
    }

    /**
     * Gets the attribute value for EndDt, using the alias name EndDt.
     * @return the value of EndDt
     */
    public Timestamp getEndDt() {
        return (Timestamp) getAttributeInternal(ENDDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDt.
     * @param value value to set the EndDt
     */
    public void setEndDt(Timestamp value) {
        setAttributeInternal(ENDDT, value);
    }

    /**
     * Gets the attribute value for StrtDt, using the alias name StrtDt.
     * @return the value of StrtDt
     */
    public Timestamp getStrtDt() {
        return (Timestamp) getAttributeInternal(STRTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for StrtDt.
     * @param value value to set the StrtDt
     */
    public void setStrtDt(Timestamp value) {
        setAttributeInternal(STRTDT, value);
    }

    /**
     * Gets the attribute value for OpStat, using the alias name OpStat.
     * @return the value of OpStat
     */
    public Integer getOpStat() {
        return (Integer)getAttributeInternal(OPSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpStat.
     * @param value value to set the OpStat
     */
    public void setOpStat(Integer value) {
        setAttributeInternal(OPSTAT, value);
    }

    /**
     * Gets the attribute value for BalOpQty, using the alias name BalOpQty.
     * @return the value of BalOpQty
     */
    public Number getBalOpQty() {
        return (Number) getAttributeInternal(BALOPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for BalOpQty.
     * @param value value to set the BalOpQty
     */
    public void setBalOpQty(Number value) {
        setAttributeInternal(BALOPQTY, value);
    }

    /**
     * Gets the attribute value for TmpBalOpQty, using the alias name TmpBalOpQty.
     * @return the value of TmpBalOpQty
     */
    public Number getTmpBalOpQty() {
        return (Number) getAttributeInternal(TMPBALOPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TmpBalOpQty.
     * @param value value to set the TmpBalOpQty
     */
    public void setTmpBalOpQty(Number value) {
        setAttributeInternal(TMPBALOPQTY, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfRcOpItm() {
        return (RowIterator) getAttributeInternal(MNFRCOPITM);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param hoOrgId key constituent
     * @param orgId key constituent
     * @param docId key constituent
     * @param opId key constituent
     * @param opSrNo key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String hoOrgId, String orgId, String docId,
                                       String opId, Integer opSrNo) {
        return new Key(new Object[] { cldId, slocId, hoOrgId, orgId, docId, opId, opSrNo });
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



    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        this.setUsrIdCreate(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
        this.setUsrIdCreateDt(new Timestamp(System.currentTimeMillis()));
        
        super.create(attributeList);
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

