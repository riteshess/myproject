package mmstockswapapp.model.entities;

import mmstockswapapp.model.views.MmStkSwapItmVORowImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jan 13 10:51:26 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmStkSwapLotEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        OrgId,
        WhId,
        DocId,
        ItmId,
        LotId,
        BinId,
        SrNo,
        ItmQty,
        ItmIdMv,
        LotIdMv,
        BinIdMv,
        ItmQtyMv,
        MmStkSwapItm;
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
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int LOTID = AttributesEnum.LotId.index();
    public static final int BINID = AttributesEnum.BinId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int ITMQTY = AttributesEnum.ItmQty.index();
    public static final int ITMIDMV = AttributesEnum.ItmIdMv.index();
    public static final int LOTIDMV = AttributesEnum.LotIdMv.index();
    public static final int BINIDMV = AttributesEnum.BinIdMv.index();
    public static final int ITMQTYMV = AttributesEnum.ItmQtyMv.index();
    public static final int MMSTKSWAPITM = AttributesEnum.MmStkSwapItm.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmStkSwapLotEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mmstockswapapp.model.entities.MmStkSwapLotEO");
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
     * Gets the attribute value for ItmId, using the alias name ItmId.
     * @return the value of ItmId
     */
    public String getItmId() {
        return (String) getAttributeInternal(ITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmId.
     * @param value value to set the ItmId
     */
    public void setItmId(String value) {
        setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for LotId, using the alias name LotId.
     * @return the value of LotId
     */
    public String getLotId() {
        return (String) getAttributeInternal(LOTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LotId.
     * @param value value to set the LotId
     */
    public void setLotId(String value) {
        setAttributeInternal(LOTID, value);
    }

    /**
     * Gets the attribute value for BinId, using the alias name BinId.
     * @return the value of BinId
     */
    public String getBinId() {
        return (String) getAttributeInternal(BINID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BinId.
     * @param value value to set the BinId
     */
    public void setBinId(String value) {
        setAttributeInternal(BINID, value);
    }

    /**
     * Gets the attribute value for SrNo, using the alias name SrNo.
     * @return the value of SrNo
     */
    public String getSrNo() {
        return (String) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SrNo.
     * @param value value to set the SrNo
     */
    public void setSrNo(String value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for ItmQty, using the alias name ItmQty.
     * @return the value of ItmQty
     */
    public Number getItmQty() {
        return (Number) getAttributeInternal(ITMQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmQty.
     * @param value value to set the ItmQty
     */
    public void setItmQty(Number value) {
        setAttributeInternal(ITMQTY, value);
    }

    /**
     * Gets the attribute value for ItmIdMv, using the alias name ItmIdMv.
     * @return the value of ItmIdMv
     */
    public String getItmIdMv() {
        return (String) getAttributeInternal(ITMIDMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmIdMv.
     * @param value value to set the ItmIdMv
     */
    public void setItmIdMv(String value) {
        setAttributeInternal(ITMIDMV, value);
    }

    /**
     * Gets the attribute value for LotIdMv, using the alias name LotIdMv.
     * @return the value of LotIdMv
     */
    public String getLotIdMv() {
        return (String) getAttributeInternal(LOTIDMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for LotIdMv.
     * @param value value to set the LotIdMv
     */
    public void setLotIdMv(String value) {
        setAttributeInternal(LOTIDMV, value);
    }

    /**
     * Gets the attribute value for BinIdMv, using the alias name BinIdMv.
     * @return the value of BinIdMv
     */
    public String getBinIdMv() {
        return (String) getAttributeInternal(BINIDMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for BinIdMv.
     * @param value value to set the BinIdMv
     */
    public void setBinIdMv(String value) {
        setAttributeInternal(BINIDMV, value);
    }

    /**
     * Gets the attribute value for ItmQtyMv, using the alias name ItmQtyMv.
     * @return the value of ItmQtyMv
     */
    public Number getItmQtyMv() {
        return (Number) getAttributeInternal(ITMQTYMV);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmQtyMv.
     * @param value value to set the ItmQtyMv
     */
    public void setItmQtyMv(Number value) {
        setAttributeInternal(ITMQTYMV, value);
    }

    /**
     * Uses the link SwapItmToSwapItmLotVL to return rows of MmStkSwapLotVO
     */
    public MmStkSwapItmVORowImpl getMmStkSwapItm() {
        return (MmStkSwapItmVORowImpl) getAttributeInternal(MMSTKSWAPITM);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param whId key constituent
     * @param docId key constituent
     * @param itmId key constituent
     * @param lotId key constituent
     * @param binId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String whId, String docId,
                                       String itmId, String lotId, String binId) {
        return new Key(new Object[] { cldId, slocId, orgId, whId, docId, itmId, lotId, binId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setSrNo("0");
        super.create(attributeList);
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
        super.lock();
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

