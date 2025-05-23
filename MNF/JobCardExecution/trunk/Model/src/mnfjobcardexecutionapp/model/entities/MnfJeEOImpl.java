package mnfjobcardexecutionapp.model.entities;

import java.math.BigDecimal;
import oracle.jbo.domain.Number;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ValueExpression;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.RowInconsistentException;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;

import oracle.sql.NUMBER;

import org.apache.myfaces.trinidad.context.RequestContext;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 27 16:19:21 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfJeEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        DocId,
        DocDt,
        FyId,
        JeId,
        JeStat,
        StrtDt,
        EndDt,
        JeRmrk,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        JeMode,
        JeBasis,
        QtyBrct,
        WhId,
        RqmtAreaId,
        MrsId,
        OutptItmId,
        OutptItmQty,
        ActOutptItmQty,
        RelJcRc,
        GlVouId,
        MnfJeSrc,
        MnfJeParam,
        MnfJeBarcode,
        MnfJeOp,
        MnfJeOpItm,
        MnfJeOpQcParam;
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
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int JEID = AttributesEnum.JeId.index();
    public static final int JESTAT = AttributesEnum.JeStat.index();
    public static final int STRTDT = AttributesEnum.StrtDt.index();
    public static final int ENDDT = AttributesEnum.EndDt.index();
    public static final int JERMRK = AttributesEnum.JeRmrk.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int JEMODE = AttributesEnum.JeMode.index();
    public static final int JEBASIS = AttributesEnum.JeBasis.index();
    public static final int QTYBRCT = AttributesEnum.QtyBrct.index();
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int RQMTAREAID = AttributesEnum.RqmtAreaId.index();
    public static final int MRSID = AttributesEnum.MrsId.index();
    public static final int OUTPTITMID = AttributesEnum.OutptItmId.index();
    public static final int OUTPTITMQTY = AttributesEnum.OutptItmQty.index();
    public static final int ACTOUTPTITMQTY = AttributesEnum.ActOutptItmQty.index();
    public static final int RELJCRC = AttributesEnum.RelJcRc.index();
    public static final int GLVOUID = AttributesEnum.GlVouId.index();
    public static final int MNFJESRC = AttributesEnum.MnfJeSrc.index();
    public static final int MNFJEPARAM = AttributesEnum.MnfJeParam.index();
    public static final int MNFJEBARCODE = AttributesEnum.MnfJeBarcode.index();
    public static final int MNFJEOP = AttributesEnum.MnfJeOp.index();
    public static final int MNFJEOPITM = AttributesEnum.MnfJeOpItm.index();
    public static final int MNFJEOPQCPARAM = AttributesEnum.MnfJeOpQcParam.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfJeEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mnfjobcardexecutionapp.model.entities.MnfJeEO");
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
     * Gets the attribute value for DocDt, using the alias name DocDt.
     * @return the value of DocDt
     */
    public Timestamp getDocDt() {
        return (Timestamp) getAttributeInternal(DOCDT);
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
        return (Integer) getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FyId.
     * @param value value to set the FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for JeId, using the alias name JeId.
     * @return the value of JeId
     */
    public String getJeId() {
        return (String) getAttributeInternal(JEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for JeId.
     * @param value value to set the JeId
     */
    public void setJeId(String value) {
        setAttributeInternal(JEID, value);
    }

    /**
     * Gets the attribute value for JeStat, using the alias name JeStat.
     * @return the value of JeStat
     */
    public Integer getJeStat() {
        return (Integer) getAttributeInternal(JESTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for JeStat.
     * @param value value to set the JeStat
     */
    public void setJeStat(Integer value) {
        setAttributeInternal(JESTAT, value);
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
     * Gets the attribute value for JeRmrk, using the alias name JeRmrk.
     * @return the value of JeRmrk
     */
    public String getJeRmrk() {
        return (String) getAttributeInternal(JERMRK);
    }

    /**
     * Sets <code>value</code> as the attribute value for JeRmrk.
     * @param value value to set the JeRmrk
     */
    public void setJeRmrk(String value) {
        setAttributeInternal(JERMRK, value);
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
     * Gets the attribute value for JeMode, using the alias name JeMode.
     * @return the value of JeMode
     */
    public Integer getJeMode() {
        return (Integer) getAttributeInternal(JEMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JeMode.
     * @param value value to set the JeMode
     */
    public void setJeMode(Integer value) {
        setAttributeInternal(JEMODE, value);
    }

    /**
     * Gets the attribute value for JeBasis, using the alias name JeBasis.
     * @return the value of JeBasis
     */
    public Integer getJeBasis() {
        return (Integer) getAttributeInternal(JEBASIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for JeBasis.
     * @param value value to set the JeBasis
     */
    public void setJeBasis(Integer value) {
        setAttributeInternal(JEBASIS, value);
    }

    /**
     * Gets the attribute value for QtyBrct, using the alias name QtyBrct.
     * @return the value of QtyBrct
     */
    public Number getQtyBrct() {
        return (Number) getAttributeInternal(QTYBRCT);
    }

    /**
     * Sets <code>value</code> as the attribute value for QtyBrct.
     * @param value value to set the QtyBrct
     */
    public void setQtyBrct(Number value) {
        setAttributeInternal(QTYBRCT, value);
    }

    /**
     * Gets the attribute value for WhId, using the alias name WhId.
     * @return the value of WhId
     */
    public String getWhId() {
        return (String) getAttributeInternal(WHID);
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
        return (Integer) getAttributeInternal(RQMTAREAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RqmtAreaId.
     * @param value value to set the RqmtAreaId
     */
    public void setRqmtAreaId(Integer value) {
        setAttributeInternal(RQMTAREAID, value);
    }

    /**
     * Gets the attribute value for MrsId, using the alias name MrsId.
     * @return the value of MrsId
     */
    public String getMrsId() {
        return (String) getAttributeInternal(MRSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MrsId.
     * @param value value to set the MrsId
     */
    public void setMrsId(String value) {
        setAttributeInternal(MRSID, value);
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
     * Gets the attribute value for ActOutptItmQty, using the alias name ActOutptItmQty.
     * @return the value of ActOutptItmQty
     */
    public Number getActOutptItmQty() {
        return (Number) getAttributeInternal(ACTOUTPTITMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActOutptItmQty.
     * @param value value to set the ActOutptItmQty
     */
    public void setActOutptItmQty(Number value) {
        setAttributeInternal(ACTOUTPTITMQTY, value);
    }

    /**
     * Gets the attribute value for RelJcRc, using the alias name RelJcRc.
     * @return the value of RelJcRc
     */
    public String getRelJcRc() {
        return (String) getAttributeInternal(RELJCRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for RelJcRc.
     * @param value value to set the RelJcRc
     */
    public void setRelJcRc(String value) {
        setAttributeInternal(RELJCRC, value);
    }

    /**
     * Gets the attribute value for GlVouId, using the alias name GlVouId.
     * @return the value of GlVouId
     */
    public String getGlVouId() {
        return (String) getAttributeInternal(GLVOUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlVouId.
     * @param value value to set the GlVouId
     */
    public void setGlVouId(String value) {
        setAttributeInternal(GLVOUID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeSrc() {
        return (RowIterator) getAttributeInternal(MNFJESRC);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeParam() {
        return (RowIterator) getAttributeInternal(MNFJEPARAM);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeBarcode() {
        return (RowIterator) getAttributeInternal(MNFJEBARCODE);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeOp() {
        return (RowIterator) getAttributeInternal(MNFJEOP);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeOpItm() {
        return (RowIterator) getAttributeInternal(MNFJEOPITM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnfJeOpQcParam() {
        return (RowIterator) getAttributeInternal(MNFJEOPQCPARAM);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param hoOrgId key constituent
     * @param orgId key constituent
     * @param docId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String hoOrgId, String orgId, String docId) {
        return new Key(new Object[] { cldId, slocId, hoOrgId, orgId, docId });
    }

    public Number getFinancialYearId(String cldId, String OrgId, Timestamp txn_date) {
        BigDecimal pdoFyId = new BigDecimal(0.0);
        try {
            //app.fn_get_fy_id(?,?,?,?) return String
        pdoFyId = (BigDecimal) callStoredFunction(Types.NUMERIC, "APP.GET_ORG_FY_ID(?,?,?)", new Object[] {
                                                   cldId, OrgId, txn_date});
        } catch (NumberFormatException nfe) {
                       // TODO: Add catch code
                       nfe.printStackTrace();
                   }
        Number val = null;
                try {
                    val = new Number(pdoFyId);
                } catch (SQLException e) {
                }
        return val;
    }

    public String getDispDocId(Integer slocid, String cldId, String OrgId, String docId, String fy_id) {
        String disp_doc_ID = (String) callStoredFunction(Types.VARCHAR, "mnf.FN_MNF_GEN_DISP_DOC_ID(?,?,?,?,?,?,?,?,?)", new Object[] {
                                                         slocid, cldId, OrgId, 26006, docId, null, "MNF$JE", fy_id, 0
        });
        return disp_doc_ID;
    }

    public String getTxnId(String cldId, Integer slocid, String OrgId, Integer userid, Integer docId) {
        String txnID = (String) callStoredFunction(Types.VARCHAR, "app.get_txn_id(?,?,?,?,?,?)", new Object[] {
                                                   cldId, slocid, OrgId, userid, docId, 0
        });
        ADFContext.getCurrent().getPageFlowScope().put("globalDocId", txnID);
        return txnID;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        Integer check_cc=new Integer(0);
        setCldId(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString());
        setSlocId(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString()));
        setHoOrgId(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString());
        setOrgId(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString());
        setUsrIdCreateDt(new Timestamp(System.currentTimeMillis()));
        setDocDt(new oracle.jbo.domain.Timestamp(System.currentTimeMillis()));
        setUsrIdCreate(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
        setDocId(getTxnId(getCldId(), getSlocId(), getOrgId(), getUsrIdCreate(), 26006).toString());
        Number fy_id = getFinancialYearId(getCldId(), getOrgId(), getDocDt());
        setFyId(fy_id.intValue());
        setJeStat(72);
        setJeMode(47);
        setJeBasis(109);
        
        try
        {
            
            
            
        BigDecimal result=(BigDecimal) callStoredFunction(Types.NUMERIC, "APP.fn_is_cost_center_present(?,?,?,?,?)", new Object[] {
                                           getCldId().toString(),getSlocId(),getHoOrgId(),getOrgId().toString(),new Number(26006)});
        check_cc= result.intValue();
        
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Value of check_cc::"+check_cc);
        if(check_cc.compareTo(new Integer(0)) >=0){
        RequestContext.getCurrentInstance().getPageFlowScope().put("CHECK_CC",check_cc);
        }
        
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
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
        if (getJeId() != null) {
        } else {
            setJeId(getDispDocId(getSlocId(), getCldId(), getOrgId(), getDocId(),
                                 getFinancialYearId(getCldId(), getOrgId(), getDocDt()).toString()).toString());
        }
        if (operation == DML_UPDATE) {
            setUsrIdModDt(new Timestamp(System.currentTimeMillis()));
            if (resolvEl("#{pageFlowScope.GLBL_APP_USR}") != null) {
                setUsrIdMod(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
            }
        }
        super.doDML(operation, e);
    }

    public Object resolvEl(String data) {
        ADFContext adfCtx = ADFContext.getCurrent();
        ELContext elContext = adfCtx.getELContext();
        ValueExpression valueExp = adfCtx.getExpressionFactory().createValueExpression(elContext, data, Object.class);
        Object Message = valueExp.getValue(elContext).toString();
        return Message;
    }

    /********************    STORED Function    *************************************/

    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;
        try {
            st = this.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    st.setObject(z + 2, bindVars[z]);
                    //System.out.println(bindVars[z]);
                }
            }
            st.executeUpdate();
            return st.getObject(1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

