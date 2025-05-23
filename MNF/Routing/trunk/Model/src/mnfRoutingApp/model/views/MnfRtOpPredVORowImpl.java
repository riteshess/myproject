package mnfRoutingApp.model.views;

import java.sql.Timestamp;

import mnfRoutingApp.model.services.MNFRoutingAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 10 19:30:24 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfRtOpPredVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MNFRTOPPREDEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        DocId,
        HoOrgId,
        OpId,
        OpSrNo,
        PredOpId,
        PredOpSrNo,
        PredUsePer,
        SlocId,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        TransOpName,
        TransRowKey,
        MnfRtOp,
        LovMnfRtOpVO1;
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
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int OPID = AttributesEnum.OpId.index();
    public static final int OPSRNO = AttributesEnum.OpSrNo.index();
    public static final int PREDOPID = AttributesEnum.PredOpId.index();
    public static final int PREDOPSRNO = AttributesEnum.PredOpSrNo.index();
    public static final int PREDUSEPER = AttributesEnum.PredUsePer.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int TRANSOPNAME = AttributesEnum.TransOpName.index();
    public static final int TRANSROWKEY = AttributesEnum.TransRowKey.index();
    public static final int MNFRTOP = AttributesEnum.MnfRtOp.index();
    public static final int LOVMNFRTOPVO1 = AttributesEnum.LovMnfRtOpVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfRtOpPredVORowImpl() {
    }

    /**
     * Gets MnfRtOpPredEO entity object.
     * @return the MnfRtOpPredEO
     */
    public EntityImpl getMnfRtOpPredEO() {
        return (EntityImpl) getEntity(ENTITY_MNFRTOPPREDEO);
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
     * Gets the attribute value for OP_ID using the alias name OpId.
     * @return the OP_ID
     */
    public String getOpId() {
        return (String) getAttributeInternal(OPID);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_ID using the alias name OpId.
     * @param value value to set the OP_ID
     */
    public void setOpId(String value) {
        setAttributeInternal(OPID, value);
    }

    /**
     * Gets the attribute value for OP_SR_NO using the alias name OpSrNo.
     * @return the OP_SR_NO
     */
    public Integer getOpSrNo() {
        return (Integer) getAttributeInternal(OPSRNO);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_SR_NO using the alias name OpSrNo.
     * @param value value to set the OP_SR_NO
     */
    public void setOpSrNo(Integer value) {
        setAttributeInternal(OPSRNO, value);
    }

    /**
     * Gets the attribute value for PRED_OP_ID using the alias name PredOpId.
     * @return the PRED_OP_ID
     */
    public String getPredOpId() {
        return (String) getAttributeInternal(PREDOPID);
    }

    /**
     * Sets <code>value</code> as attribute value for PRED_OP_ID using the alias name PredOpId.
     * @param value value to set the PRED_OP_ID
     */
    public void setPredOpId(String value) {
        setAttributeInternal(PREDOPID, value);
    }

    /**
     * Gets the attribute value for PRED_OP_SR_NO using the alias name PredOpSrNo.
     * @return the PRED_OP_SR_NO
     */
    public String getPredOpSrNo() {
        return (String) getAttributeInternal(PREDOPSRNO);
    }

    /**
     * Sets <code>value</code> as attribute value for PRED_OP_SR_NO using the alias name PredOpSrNo.
     * @param value value to set the PRED_OP_SR_NO
     */
    public void setPredOpSrNo(String value) {
        setAttributeInternal(PREDOPSRNO, value);
    }

    /**
     * Gets the attribute value for PRED_USE_PER using the alias name PredUsePer.
     * @return the PRED_USE_PER
     */
    public oracle.jbo.domain.Number getPredUsePer() {
        return (oracle.jbo.domain.Number) getAttributeInternal(PREDUSEPER);
    }

    /**
     * Sets <code>value</code> as attribute value for PRED_USE_PER using the alias name PredUsePer.
     * @param value value to set the PRED_USE_PER
     */
    public void setPredUsePer(oracle.jbo.domain.Number value) {
        setAttributeInternal(PREDUSEPER, value);
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
     * Gets the attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @return the USR_ID_CREATE
     */
    public Long getUsrIdCreate() {
        return (Long) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @param value value to set the USR_ID_CREATE
     */
    public void setUsrIdCreate(Long value) {
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
    public Long getUsrIdMod() {
        return (Long) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @param value value to set the USR_ID_MOD
     */
    public void setUsrIdMod(Long value) {
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
     * Gets the attribute value for the calculated attribute TransOpName.
     * @return the TransOpName
     */
    public String getTransOpName() {
        
        
        MNFRoutingAMImpl mnfrt = (MNFRoutingAMImpl)this.getApplicationModule();
        ViewObjectImpl op=mnfrt.getLOVOperationDescVO1();
        op.setNamedWhereClauseParam("BindCldId",getCldId());
        op.setNamedWhereClauseParam("BindSlcId",getSlocId());
        op.setNamedWhereClauseParam("BindHoOrgId",getHoOrgId());
        op.executeQuery();
        
        if(getPredOpId()!=null) {
            Row[] r1=op.getFilteredRows("DocId",getPredOpId());
           
            if(r1.length>0) {
                
                //System.out.println("Operation Name::"+r1[0].getAttribute("OpDesc").toString());
                return r1[0].getAttribute("OpDesc").toString();
            }
        }
        return (String) getAttributeInternal(TRANSOPNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOpName.
     * @param value value to set the  TransOpName
     */
    public void setTransOpName(String value) {
        setAttributeInternal(TRANSOPNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRowKey.
     * @return the TransRowKey
     */
    public Object getTransRowKey() {
        return getKey();
        //return (Object) getAttributeInternal(TRANSROWKEY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransRowKey.
     * @param value value to set the  TransRowKey
     */
    public void setTransRowKey(Object value) {
        setAttributeInternal(TRANSROWKEY, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link MnfRtOp.
     */
    public Row getMnfRtOp() {
        return (Row) getAttributeInternal(MNFRTOP);
    }

    /**
     * Sets the master-detail link MnfRtOp between this object and <code>value</code>.
     */
    public void setMnfRtOp(Row value) {
        setAttributeInternal(MNFRTOP, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovMnfRtOpVO1.
     */
    public RowSet getLovMnfRtOpVO1() {
        return (RowSet) getAttributeInternal(LOVMNFRTOPVO1);
    }
}

