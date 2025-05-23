package mnfProductionOrderApp.model.views;

import java.math.BigDecimal;

import java.sql.SQLException;

import mnfProductionOrderApp.model.entities.MnfPdoOpEOImpl;

import mnfProductionOrderApp.model.services.MNFProductionorderAppAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Sep 19 11:29:43 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfPdoOpVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MNFPDOOPEO = 0;

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
        WcId,
        OpLocType,
        OpTrgtDt,
        OpRmrk,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        TransOpDesc,
        TransOpID,
        OutptItmId,
        OutptItmQty,
        OpStat,
        TransWcNme,
        TransRevisionNo,
        MnfPdoOpItmVO,
        LOVOpDescVO1,
        LOVOpnLocTypVO,
        LOVOpWorkCenterVO1;
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


    String OpDesc = null;


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int OPID = AttributesEnum.OpId.index();
    public static final int OPSRNO = AttributesEnum.OpSrNo.index();
    public static final int WCID = AttributesEnum.WcId.index();
    public static final int OPLOCTYPE = AttributesEnum.OpLocType.index();
    public static final int OPTRGTDT = AttributesEnum.OpTrgtDt.index();
    public static final int OPRMRK = AttributesEnum.OpRmrk.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int TRANSOPDESC = AttributesEnum.TransOpDesc.index();
    public static final int TRANSOPID = AttributesEnum.TransOpID.index();
    public static final int OUTPTITMID = AttributesEnum.OutptItmId.index();
    public static final int OUTPTITMQTY = AttributesEnum.OutptItmQty.index();
    public static final int OPSTAT = AttributesEnum.OpStat.index();
    public static final int TRANSWCNME = AttributesEnum.TransWcNme.index();
    public static final int TRANSREVISIONNO = AttributesEnum.TransRevisionNo.index();
    public static final int MNFPDOOPITMVO = AttributesEnum.MnfPdoOpItmVO.index();
    public static final int LOVOPDESCVO1 = AttributesEnum.LOVOpDescVO1.index();
    public static final int LOVOPNLOCTYPVO = AttributesEnum.LOVOpnLocTypVO.index();
    public static final int LOVOPWORKCENTERVO1 = AttributesEnum.LOVOpWorkCenterVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfPdoOpVORowImpl() {
    }

    /**
     * Gets MnfPdoOpEO entity object.
     * @return the MnfPdoOpEO
     */
    public MnfPdoOpEOImpl getMnfPdoOpEO() {
        return (MnfPdoOpEOImpl) getEntity(ENTITY_MNFPDOOPEO);
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
    public oracle.jbo.domain.Number getOpSrNo() {
        return (oracle.jbo.domain.Number) getAttributeInternal(OPSRNO);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_SR_NO using the alias name OpSrNo.
     * @param value value to set the OP_SR_NO
     */
    public void setOpSrNo(oracle.jbo.domain.Number value) {
        setAttributeInternal(OPSRNO, value);
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
     * Gets the attribute value for OP_LOC_TYPE using the alias name OpLocType.
     * @return the OP_LOC_TYPE
     */
    public Integer getOpLocType() {
        return (Integer) getAttributeInternal(OPLOCTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_LOC_TYPE using the alias name OpLocType.
     * @param value value to set the OP_LOC_TYPE
     */
    public void setOpLocType(Integer value) {
        setAttributeInternal(OPLOCTYPE, value);
    }

    /**
     * Gets the attribute value for OP_TRGT_DT using the alias name OpTrgtDt.
     * @return the OP_TRGT_DT
     */
    public Timestamp getOpTrgtDt() {
        return (Timestamp) getAttributeInternal(OPTRGTDT);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_TRGT_DT using the alias name OpTrgtDt.
     * @param value value to set the OP_TRGT_DT
     */
    public void setOpTrgtDt(Timestamp value) {
        setAttributeInternal(OPTRGTDT, value);
    }

    /**
     * Gets the attribute value for OP_RMRK using the alias name OpRmrk.
     * @return the OP_RMRK
     */
    public String getOpRmrk() {
        return (String) getAttributeInternal(OPRMRK);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_RMRK using the alias name OpRmrk.
     * @param value value to set the OP_RMRK
     */
    public void setOpRmrk(String value) {
        setAttributeInternal(OPRMRK, value);
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
     * Gets the attribute value for the calculated attribute TransOpDesc.
     * @return the TransOpDesc
     */
    
    Integer revNo =0;
    public String getTransOpDesc() {
        if (getOpId() != null) {
            Row[] wcRow = getAM().getLOVOpDescVO1().getFilteredRows("DocId", getOpId());
            if (wcRow.length > 0) {
                if (wcRow[0].getAttribute("OpDesc") != null) {
                    //setTransOpDesc(wcRow[0].getAttribute("OpDesc").toString());
                    revNo = (Integer)wcRow[0].getAttribute("OpRevNo");
                    return wcRow[0].getAttribute("OpDesc").toString();

                }
            }
        }
        return (String) getAttributeInternal(TRANSOPDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOpDesc.
     * @param value value to set the  TransOpDesc
     */
    public void setTransOpDesc(String value) {
        setAttributeInternal(TRANSOPDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOpID.
     * @return the TransOpID
     */
    public String getTransOpID() {
        if (getOpId() != null) {
            Row[] wcRow = getAM().getLOVOpDescVO1().getFilteredRows("DocId", getOpId());
            if (wcRow.length > 0) {
                if (wcRow[0].getAttribute("OpId") != null) {
                    return wcRow[0].getAttribute("OpId").toString();

                }
            }
        }
        return (String) getAttributeInternal(TRANSOPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOpID.
     * @param value value to set the  TransOpID
     */
    public void setTransOpID(String value) {
        setAttributeInternal(TRANSOPID, value);
    }

    /**
     * Gets the attribute value for OUTPT_ITM_ID using the alias name OutptItmId.
     * @return the OUTPT_ITM_ID
     */
    public String getOutptItmId() {
        return (String) getAttributeInternal(OUTPTITMID);
    }

    /**
     * Sets <code>value</code> as attribute value for OUTPT_ITM_ID using the alias name OutptItmId.
     * @param value value to set the OUTPT_ITM_ID
     */
    public void setOutptItmId(String value) {
        setAttributeInternal(OUTPTITMID, value);
    }

    /**
     * Gets the attribute value for OUTPT_ITM_QTY using the alias name OutptItmQty.
     * @return the OUTPT_ITM_QTY
     */
    public Number getOutptItmQty() {
        return (Number) getAttributeInternal(OUTPTITMQTY);
    }

    /**
     * Sets <code>value</code> as attribute value for OUTPT_ITM_QTY using the alias name OutptItmQty.
     * @param value value to set the OUTPT_ITM_QTY
     */
    public void setOutptItmQty(Number value) {
        setAttributeInternal(OUTPTITMQTY, value);
    }

    /**
     * Gets the attribute value for OP_STAT using the alias name OpStat.
     * @return the OP_STAT
     */
    public Integer getOpStat() {
        return (Integer) getAttributeInternal(OPSTAT);
    }

    /**
     * Sets <code>value</code> as attribute value for OP_STAT using the alias name OpStat.
     * @param value value to set the OP_STAT
     */
    public void setOpStat(Integer value) {
        setAttributeInternal(OPSTAT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransWcNme.
     * @return the TransWcNme
     */
    public String getTransWcNme() {
        
        if (getWcId() != null) {
            Row[] wcRow = getAM().getLOVOpWorkCenterVO().getFilteredRows("WcId", getWcId());
            if (wcRow.length > 0) {
                if (wcRow[0].getAttribute("WcDesc") != null) {
                    //setTransOpDesc(wcRow[0].getAttribute("OpDesc").toString());
                    return wcRow[0].getAttribute("WcDesc").toString();

                }
            }
        }
        
        
        return (String) getAttributeInternal(TRANSWCNME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransWcNme.
     * @param value value to set the  TransWcNme
     */
    public void setTransWcNme(String value) {
        setAttributeInternal(TRANSWCNME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransRevisionNo.
     * @return the TransRevisionNo
     */
    public Integer getTransRevisionNo() {
        return revNo;
        //return (Integer) getAttributeInternal(TRANSREVISIONNO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link MnfPdoOpItmVO.
     */
    public RowIterator getMnfPdoOpItmVO() {
        return (RowIterator) getAttributeInternal(MNFPDOOPITMVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVOpDescVO1.
     */
    public RowSet getLOVOpDescVO1() {
        return (RowSet) getAttributeInternal(LOVOPDESCVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVOpnLocTypVO.
     */
    public RowSet getLOVOpnLocTypVO() {
        return (RowSet) getAttributeInternal(LOVOPNLOCTYPVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> LOVOpWorkCenterVO1.
     */
    public RowSet getLOVOpWorkCenterVO1() {
        return (RowSet) getAttributeInternal(LOVOPWORKCENTERVO1);
    }

    public MNFProductionorderAppAMImpl getAM() {
        return (MNFProductionorderAppAMImpl) getApplicationModule();

    }
}

