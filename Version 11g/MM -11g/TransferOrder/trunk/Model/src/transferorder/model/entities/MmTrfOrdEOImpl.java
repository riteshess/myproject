package transferorder.model.entities;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Sep 10 14:56:25 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmTrfOrdEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getCldId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        DocId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getDocId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        DocDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getDocDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setDocDt((Timestamp)value);
            }
        }
        ,
        FyId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getFyId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setFyId((Integer)value);
            }
        }
        ,
        TrfNo {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfNo();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfNo((String)value);
            }
        }
        ,
        TrfDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfDt((Timestamp)value);
            }
        }
        ,
        TrfSrcType {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfSrcType();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfSrcType((Integer)value);
            }
        }
        ,
        TrfType {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfType();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfType((Integer)value);
            }
        }
        ,
        DocTypeSrc {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getDocTypeSrc();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setDocTypeSrc((Integer)value);
            }
        }
        ,
        DocIdSrc {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getDocIdSrc();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setDocIdSrc((String)value);
            }
        }
        ,
        WhId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getWhId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setWhId((String)value);
            }
        }
        ,
        RqmtAreaId {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getRqmtAreaId();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setRqmtAreaId((Integer)value);
            }
        }
        ,
        OrgIdSrc {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getOrgIdSrc();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setOrgIdSrc((String)value);
            }
        }
        ,
        WhIdSrc {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getWhIdSrc();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setWhIdSrc((String)value);
            }
        }
        ,
        ReqdDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getReqdDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setReqdDt((Timestamp)value);
            }
        }
        ,
        OrgIdDest {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getOrgIdDest();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setOrgIdDest((String)value);
            }
        }
        ,
        WhIdDest {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getWhIdDest();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setWhIdDest((String)value);
            }
        }
        ,
        TrfStat {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfStat();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfStat((Integer)value);
            }
        }
        ,
        TrfStatDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getTrfStatDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setTrfStatDt((Timestamp)value);
            }
        }
        ,
        InvReqd {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getInvReqd();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setInvReqd((String)value);
            }
        }
        ,
        AuthStat {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getAuthStat();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setAuthStat((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setUsrIdCreate((Long)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setUsrIdMod((Long)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        Remarks {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        MmTrfOrdItm {
            public Object get(MmTrfOrdEOImpl obj) {
                return obj.getMmTrfOrdItm();
            }

            public void put(MmTrfOrdEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmTrfOrdEOImpl object);

        public abstract void put(MmTrfOrdEOImpl object, Object value);

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


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int TRFNO = AttributesEnum.TrfNo.index();
    public static final int TRFDT = AttributesEnum.TrfDt.index();
    public static final int TRFSRCTYPE = AttributesEnum.TrfSrcType.index();
    public static final int TRFTYPE = AttributesEnum.TrfType.index();
    public static final int DOCTYPESRC = AttributesEnum.DocTypeSrc.index();
    public static final int DOCIDSRC = AttributesEnum.DocIdSrc.index();
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int RQMTAREAID = AttributesEnum.RqmtAreaId.index();
    public static final int ORGIDSRC = AttributesEnum.OrgIdSrc.index();
    public static final int WHIDSRC = AttributesEnum.WhIdSrc.index();
    public static final int REQDDT = AttributesEnum.ReqdDt.index();
    public static final int ORGIDDEST = AttributesEnum.OrgIdDest.index();
    public static final int WHIDDEST = AttributesEnum.WhIdDest.index();
    public static final int TRFSTAT = AttributesEnum.TrfStat.index();
    public static final int TRFSTATDT = AttributesEnum.TrfStatDt.index();
    public static final int INVREQD = AttributesEnum.InvReqd.index();
    public static final int AUTHSTAT = AttributesEnum.AuthStat.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int MMTRFORDITM = AttributesEnum.MmTrfOrdItm.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmTrfOrdEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("transferorder.model.entities.MmTrfOrdEO");
    }

    /**
     * Gets the attribute value for CldId, using the alias name CldId.
     * @return the value of CldId
     */
    public String getCldId() {
        return (String)getAttributeInternal(CLDID);
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
        return (Integer)getAttributeInternal(SLOCID);
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
        return (String)getAttributeInternal(ORGID);
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
        return (String)getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocId.
     * @param value value to set the DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for DocDt, using the alias name DocDt.
     * @return the value of DocDt
     */
    public Timestamp getDocDt() {
        return (Timestamp)getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocDt.
     * @param value value to set the DocDt
     */
    public void setDocDt(Timestamp value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for FyId, using the alias name FyId.
     * @return the value of FyId
     */
    public Integer getFyId() {
        return (Integer)getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FyId.
     * @param value value to set the FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for TrfNo, using the alias name TrfNo.
     * @return the value of TrfNo
     */
    public String getTrfNo() {
        return (String)getAttributeInternal(TRFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfNo.
     * @param value value to set the TrfNo
     */
    public void setTrfNo(String value) {
        setAttributeInternal(TRFNO, value);
    }

    /**
     * Gets the attribute value for TrfDt, using the alias name TrfDt.
     * @return the value of TrfDt
     */
    public Timestamp getTrfDt() {
        return (Timestamp)getAttributeInternal(TRFDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfDt.
     * @param value value to set the TrfDt
     */
    public void setTrfDt(Timestamp value) {
        setAttributeInternal(TRFDT, value);
    }

    /**
     * Gets the attribute value for TrfSrcType, using the alias name TrfSrcType.
     * @return the value of TrfSrcType
     */
    public Integer getTrfSrcType() {
        return (Integer)getAttributeInternal(TRFSRCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfSrcType.
     * @param value value to set the TrfSrcType
     */
    public void setTrfSrcType(Integer value) {
        setAttributeInternal(TRFSRCTYPE, value);
    }

    /**
     * Gets the attribute value for TrfType, using the alias name TrfType.
     * @return the value of TrfType
     */
    public Integer getTrfType() {
        return (Integer)getAttributeInternal(TRFTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfType.
     * @param value value to set the TrfType
     */
    public void setTrfType(Integer value) {
        setAttributeInternal(TRFTYPE, value);
    }

    /**
     * Gets the attribute value for DocTypeSrc, using the alias name DocTypeSrc.
     * @return the value of DocTypeSrc
     */
    public Integer getDocTypeSrc() {
        return (Integer)getAttributeInternal(DOCTYPESRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocTypeSrc.
     * @param value value to set the DocTypeSrc
     */
    public void setDocTypeSrc(Integer value) {
        setAttributeInternal(DOCTYPESRC, value);
    }

    /**
     * Gets the attribute value for DocIdSrc, using the alias name DocIdSrc.
     * @return the value of DocIdSrc
     */
    public String getDocIdSrc() {
        return (String)getAttributeInternal(DOCIDSRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocIdSrc.
     * @param value value to set the DocIdSrc
     */
    public void setDocIdSrc(String value) {
        setAttributeInternal(DOCIDSRC, value);
    }

    /**
     * Gets the attribute value for WhId, using the alias name WhId.
     * @return the value of WhId
     */
    public String getWhId() {
        return (String)getAttributeInternal(WHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhId.
     * @param value value to set the WhId
     */
    public void setWhId(String value) {
        setAttributeInternal(WHID, value);
    }

    /**
     * Gets the attribute value for RqmtAreaId, using the alias name RqmtAreaId.
     * @return the value of RqmtAreaId
     */
    public Integer getRqmtAreaId() {
        return (Integer)getAttributeInternal(RQMTAREAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RqmtAreaId.
     * @param value value to set the RqmtAreaId
     */
    public void setRqmtAreaId(Integer value) {
        setAttributeInternal(RQMTAREAID, value);
    }

    /**
     * Gets the attribute value for OrgIdSrc, using the alias name OrgIdSrc.
     * @return the value of OrgIdSrc
     */
    public String getOrgIdSrc() {
        return (String)getAttributeInternal(ORGIDSRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgIdSrc.
     * @param value value to set the OrgIdSrc
     */
    public void setOrgIdSrc(String value) {
        setAttributeInternal(ORGIDSRC, value);
    }

    /**
     * Gets the attribute value for WhIdSrc, using the alias name WhIdSrc.
     * @return the value of WhIdSrc
     */
    public String getWhIdSrc() {
        return (String)getAttributeInternal(WHIDSRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhIdSrc.
     * @param value value to set the WhIdSrc
     */
    public void setWhIdSrc(String value) {
        setAttributeInternal(WHIDSRC, value);
    }

    /**
     * Gets the attribute value for ReqdDt, using the alias name ReqdDt.
     * @return the value of ReqdDt
     */
    public Timestamp getReqdDt() {
        return (Timestamp)getAttributeInternal(REQDDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReqdDt.
     * @param value value to set the ReqdDt
     */
    public void setReqdDt(Timestamp value) {
        setAttributeInternal(REQDDT, value);
    }

    /**
     * Gets the attribute value for OrgIdDest, using the alias name OrgIdDest.
     * @return the value of OrgIdDest
     */
    public String getOrgIdDest() {
        return (String)getAttributeInternal(ORGIDDEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgIdDest.
     * @param value value to set the OrgIdDest
     */
    public void setOrgIdDest(String value) {
        setAttributeInternal(ORGIDDEST, value);
    }

    /**
     * Gets the attribute value for WhIdDest, using the alias name WhIdDest.
     * @return the value of WhIdDest
     */
    public String getWhIdDest() {
        return (String)getAttributeInternal(WHIDDEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for WhIdDest.
     * @param value value to set the WhIdDest
     */
    public void setWhIdDest(String value) {
        setAttributeInternal(WHIDDEST, value);
    }

    /**
     * Gets the attribute value for TrfStat, using the alias name TrfStat.
     * @return the value of TrfStat
     */
    public Integer getTrfStat() {
        return (Integer)getAttributeInternal(TRFSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfStat.
     * @param value value to set the TrfStat
     */
    public void setTrfStat(Integer value) {
        setAttributeInternal(TRFSTAT, value);
    }

    /**
     * Gets the attribute value for TrfStatDt, using the alias name TrfStatDt.
     * @return the value of TrfStatDt
     */
    public Timestamp getTrfStatDt() {
        return (Timestamp)getAttributeInternal(TRFSTATDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrfStatDt.
     * @param value value to set the TrfStatDt
     */
    public void setTrfStatDt(Timestamp value) {
        setAttributeInternal(TRFSTATDT, value);
    }

    /**
     * Gets the attribute value for InvReqd, using the alias name InvReqd.
     * @return the value of InvReqd
     */
    public String getInvReqd() {
        return (String)getAttributeInternal(INVREQD);
    }

    /**
     * Sets <code>value</code> as the attribute value for InvReqd.
     * @param value value to set the InvReqd
     */
    public void setInvReqd(String value) {
        setAttributeInternal(INVREQD, value);
    }

    /**
     * Gets the attribute value for AuthStat, using the alias name AuthStat.
     * @return the value of AuthStat
     */
    public String getAuthStat() {
        return (String)getAttributeInternal(AUTHSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuthStat.
     * @param value value to set the AuthStat
     */
    public void setAuthStat(String value) {
        setAttributeInternal(AUTHSTAT, value);
    }

    /**
     * Gets the attribute value for UsrIdCreate, using the alias name UsrIdCreate.
     * @return the value of UsrIdCreate
     */
    public Long getUsrIdCreate() {
        return (Long)getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreate.
     * @param value value to set the UsrIdCreate
     */
    public void setUsrIdCreate(Long value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for UsrIdCreateDt, using the alias name UsrIdCreateDt.
     * @return the value of UsrIdCreateDt
     */
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp)getAttributeInternal(USRIDCREATEDT);
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
    public Long getUsrIdMod() {
        return (Long)getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdMod.
     * @param value value to set the UsrIdMod
     */
    public void setUsrIdMod(Long value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for UsrIdModDt, using the alias name UsrIdModDt.
     * @return the value of UsrIdModDt
     */
    public Timestamp getUsrIdModDt() {
        return (Timestamp)getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdModDt.
     * @param value value to set the UsrIdModDt
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMmTrfOrdItm() {
        return (RowIterator)getAttributeInternal(MMTRFORDITM);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param docId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String docId) {
        return new Key(new Object[]{cldId, slocId, orgId, docId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        System.out.println("Create EOimpl");
        Long UserId = Long.parseLong(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
        setUsrIdCreate(UserId);
        setUsrIdCreateDt((new Timestamp(System.currentTimeMillis())));
        setTrfStatDt((new Timestamp(System.currentTimeMillis())));
        setReqdDt((new Timestamp(System.currentTimeMillis())));
        setDocDt((new Timestamp(System.currentTimeMillis())));
        setTrfDt((new Timestamp(System.currentTimeMillis())));
        String glbl_cld_id = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
        String glbl_org_id = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        Integer glbl_sloc_id = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        setCldId(glbl_cld_id);
        setOrgId(glbl_org_id);
        setSlocId(glbl_sloc_id);
        
        String wh=resolvEl("#{pageFlowScope.PARAM_USR_WH_ID}");
        setWhId(wh);
        setTrfStat(427);
        setTrfSrcType(372);
        String tableName="MM$TRF$ORD";
        String docId=(String)(callStoredFunction(Types.VARCHAR, "app.pkg_app.get_txn_id(?,?,?,?,?)",new Object[] {UserId,glbl_org_id,glbl_sloc_id,18519,glbl_cld_id}));
        setDocId(docId);
        setAuthStat("N");
        super.create(attributeList);
    }
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;
        try {
            st = getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    st.setObject(z + 2, bindVars[z]);
                    //System.out.println(bindVars[z] + "z");
                }
            }
            st.executeUpdate();
            return st.getObject(1);
        } 
        catch (SQLException e) {
            throw new JboException(e);
        } 
        finally {
            if (st != null) {
                try {
                    st.close();
                } 
                catch (SQLException e) {
                }
            }   
        }
    }
    
    public String resolvEl(String data) {
            FacesContext fc = FacesContext.getCurrentInstance();
            Application app = fc.getApplication();
            ExpressionFactory elFactory = app.getExpressionFactory();
            ELContext elContext = fc.getELContext();
            ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
            String Message = valueExp.getValue(elContext).toString();
            return Message;
        }

    /**
     * Add locking logic here.
     */
    public void lock() {
       // super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if(operation == DML_UPDATE){
            Long UserId = Long.parseLong(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
            setUsrIdMod(UserId);
            setUsrIdModDt((new Timestamp(System.currentTimeMillis())));
        }
        super.doDML(operation, e);
    }
}
