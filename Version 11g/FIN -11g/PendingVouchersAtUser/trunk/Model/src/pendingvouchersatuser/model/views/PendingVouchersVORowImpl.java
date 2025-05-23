package pendingvouchersatuser.model.views;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 30 14:46:47 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PendingVouchersVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SlocId {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        CldId {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        OrgId {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        TxnDocId {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getTxnDocId();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setTxnDocId((String)value);
            }
        }
        ,
        UsrIdBy {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getUsrIdBy();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setUsrIdBy((Integer)value);
            }
        }
        ,
        UsrIdTo {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getUsrIdTo();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setUsrIdTo((Integer)value);
            }
        }
        ,
        ActnDt {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getActnDt();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setActnDt((Date)value);
            }
        }
        ,
        AuthDt {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getAuthDt();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setAuthDt((Date)value);
            }
        }
        ,
        WarnDt {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getWarnDt();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setWarnDt((Date)value);
            }
        }
        ,
        LvlSkipped {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getLvlSkipped();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setLvlSkipped((String)value);
            }
        }
        ,
        WfStatusId {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getWfStatusId();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setWfStatusId((String)value);
            }
        }
        ,
        WfActnSeq {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getWfActnSeq();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setWfActnSeq((Integer)value);
            }
        }
        ,
        WfRemark {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getWfRemark();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setWfRemark((String)value);
            }
        }
        ,
        WfLineStatus {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getWfLineStatus();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setWfLineStatus((String)value);
            }
        }
        ,
        State {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getState();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setState((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        DocTxnIdDisp {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getDocTxnIdDisp();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setDocTxnIdDisp((String)value);
            }
        }
        ,
        VouNo {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getVouNo();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setVouNo((String)value);
            }
        }
        ,
        TvouDt {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getTvouDt();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setTvouDt((Timestamp)value);
            }
        }
        ,
        UsrName {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getUsrName();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setUsrName((String)value);
            }
        }
        ,
        LovUserIdVO1 {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getLovUserIdVO1();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovtxnDocIdVO1 {
            public Object get(PendingVouchersVORowImpl obj) {
                return obj.getLovtxnDocIdVO1();
            }

            public void put(PendingVouchersVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PendingVouchersVORowImpl object);

        public abstract void put(PendingVouchersVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int TXNDOCID = AttributesEnum.TxnDocId.index();
    public static final int USRIDBY = AttributesEnum.UsrIdBy.index();
    public static final int USRIDTO = AttributesEnum.UsrIdTo.index();
    public static final int ACTNDT = AttributesEnum.ActnDt.index();
    public static final int AUTHDT = AttributesEnum.AuthDt.index();
    public static final int WARNDT = AttributesEnum.WarnDt.index();
    public static final int LVLSKIPPED = AttributesEnum.LvlSkipped.index();
    public static final int WFSTATUSID = AttributesEnum.WfStatusId.index();
    public static final int WFACTNSEQ = AttributesEnum.WfActnSeq.index();
    public static final int WFREMARK = AttributesEnum.WfRemark.index();
    public static final int WFLINESTATUS = AttributesEnum.WfLineStatus.index();
    public static final int STATE = AttributesEnum.State.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int DOCTXNIDDISP = AttributesEnum.DocTxnIdDisp.index();
    public static final int VOUNO = AttributesEnum.VouNo.index();
    public static final int TVOUDT = AttributesEnum.TvouDt.index();
    public static final int USRNAME = AttributesEnum.UsrName.index();
    public static final int LOVUSERIDVO1 = AttributesEnum.LovUserIdVO1.index();
    public static final int LOVTXNDOCIDVO1 = AttributesEnum.LovtxnDocIdVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PendingVouchersVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocId.
     * @param value value to set the  SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
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
     * Gets the attribute value for the calculated attribute TxnDocId.
     * @return the TxnDocId
     */
    public String getTxnDocId() {
        return (String) getAttributeInternal(TXNDOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TxnDocId.
     * @param value value to set the  TxnDocId
     */
    public void setTxnDocId(String value) {
        setAttributeInternal(TXNDOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdBy.
     * @return the UsrIdBy
     */
    public Integer getUsrIdBy() {
        return (Integer) getAttributeInternal(USRIDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdBy.
     * @param value value to set the  UsrIdBy
     */
    public void setUsrIdBy(Integer value) {
        setAttributeInternal(USRIDBY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdTo.
     * @return the UsrIdTo
     */
    public Integer getUsrIdTo() {
        return (Integer) getAttributeInternal(USRIDTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdTo.
     * @param value value to set the  UsrIdTo
     */
    public void setUsrIdTo(Integer value) {
        setAttributeInternal(USRIDTO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ActnDt.
     * @return the ActnDt
     */
    public Date getActnDt() {
        return (Date) getAttributeInternal(ACTNDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ActnDt.
     * @param value value to set the  ActnDt
     */
    public void setActnDt(Date value) {
        setAttributeInternal(ACTNDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AuthDt.
     * @return the AuthDt
     */
    public Date getAuthDt() {
        return (Date) getAttributeInternal(AUTHDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AuthDt.
     * @param value value to set the  AuthDt
     */
    public void setAuthDt(Date value) {
        setAttributeInternal(AUTHDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WarnDt.
     * @return the WarnDt
     */
    public Date getWarnDt() {
        return (Date) getAttributeInternal(WARNDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WarnDt.
     * @param value value to set the  WarnDt
     */
    public void setWarnDt(Date value) {
        setAttributeInternal(WARNDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LvlSkipped.
     * @return the LvlSkipped
     */
    public String getLvlSkipped() {
        return (String) getAttributeInternal(LVLSKIPPED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LvlSkipped.
     * @param value value to set the  LvlSkipped
     */
    public void setLvlSkipped(String value) {
        setAttributeInternal(LVLSKIPPED, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WfStatusId.
     * @return the WfStatusId
     */
    public String getWfStatusId() {
        return (String) getAttributeInternal(WFSTATUSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WfStatusId.
     * @param value value to set the  WfStatusId
     */
    public void setWfStatusId(String value) {
        setAttributeInternal(WFSTATUSID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WfActnSeq.
     * @return the WfActnSeq
     */
    public Integer getWfActnSeq() {
        return (Integer) getAttributeInternal(WFACTNSEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WfActnSeq.
     * @param value value to set the  WfActnSeq
     */
    public void setWfActnSeq(Integer value) {
        setAttributeInternal(WFACTNSEQ, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WfRemark.
     * @return the WfRemark
     */
    public String getWfRemark() {
        return (String) getAttributeInternal(WFREMARK);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WfRemark.
     * @param value value to set the  WfRemark
     */
    public void setWfRemark(String value) {
        setAttributeInternal(WFREMARK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WfLineStatus.
     * @return the WfLineStatus
     */
    public String getWfLineStatus() {
        return (String) getAttributeInternal(WFLINESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WfLineStatus.
     * @param value value to set the  WfLineStatus
     */
    public void setWfLineStatus(String value) {
        setAttributeInternal(WFLINESTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute State.
     * @return the State
     */
    public Integer getState() {
        return (Integer) getAttributeInternal(STATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute State.
     * @param value value to set the  State
     */
    public void setState(Integer value) {
        setAttributeInternal(STATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdCreateDt.
     * @return the UsrIdCreateDt
     */
    public Timestamp getUsrIdCreateDt() {
    // System.out.println("now crt date is"+getAttributeInternal(USRIDCREATEDT));
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdCreateDt.
     * @param value value to set the  UsrIdCreateDt
     */
    public void setUsrIdCreateDt(Timestamp value) {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocTxnIdDisp.
     * @return the DocTxnIdDisp
     */
    public String getDocTxnIdDisp() {
        return (String) getAttributeInternal(DOCTXNIDDISP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocTxnIdDisp.
     * @param value value to set the  DocTxnIdDisp
     */
    public void setDocTxnIdDisp(String value) {
        setAttributeInternal(DOCTXNIDDISP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute VouNo.
     * @return the VouNo
     */
    public String getVouNo() {
        return (String) getAttributeInternal(VOUNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute VouNo.
     * @param value value to set the  VouNo
     */
    public void setVouNo(String value) {
        setAttributeInternal(VOUNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TvouDt.
     * @return the TvouDt
     */
    public Timestamp getTvouDt() {
        return (Timestamp) getAttributeInternal(TVOUDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TvouDt.
     * @param value value to set the  TvouDt
     */
    public void setTvouDt(Timestamp value) {
        setAttributeInternal(TVOUDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrName.
     * @return the UsrName
     */
    public String getUsrName() {
        return (String) getAttributeInternal(USRNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrName.
     * @param value value to set the  UsrName
     */
    public void setUsrName(String value) {
        setAttributeInternal(USRNAME, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovUserIdVO1.
     */
    public RowSet getLovUserIdVO1() {
        return (RowSet)getAttributeInternal(LOVUSERIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovtxnDocIdVO1.
     */
    public RowSet getLovtxnDocIdVO1() {
        return (RowSet)getAttributeInternal(LOVTXNDOCIDVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
