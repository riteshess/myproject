package trnploadingorderapp.model.views;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewRowImpl;

import trnploadingorderapp.model.entities.SlsTrnpLoDocSrcEOImpl;
import trnploadingorderapp.model.services.TrnpLoadingOrderAMImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jun 04 10:15:22 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsTrnpLoDocSrcVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SLSTRNPLOSHIPEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ArrivalPnt,
        CldId,
        DeparturePnt,
        DocId,
        EoId,
        HoOrgId,
        OrgId,
        DocIdSrc,
        SlocId,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        DispDocSrcIdTrans,
        SlsTrnpLoProdDtl;
        static AttributesEnum[] vals = null; ;
        private static final int firstIndex = 0;

        public int index() {
            return SlsTrnpLoDocSrcVORowImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return SlsTrnpLoDocSrcVORowImpl.AttributesEnum.firstIndex() +
                   SlsTrnpLoDocSrcVORowImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = SlsTrnpLoDocSrcVORowImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int ARRIVALPNT = AttributesEnum.ArrivalPnt.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DEPARTUREPNT = AttributesEnum.DeparturePnt.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int EOID = AttributesEnum.EoId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCIDSRC = AttributesEnum.DocIdSrc.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int DISPDOCSRCIDTRANS = AttributesEnum.DispDocSrcIdTrans.index();
    public static final int SLSTRNPLOPRODDTL = AttributesEnum.SlsTrnpLoProdDtl.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SlsTrnpLoDocSrcVORowImpl() {
    }

    /**
     * Gets SlsTrnpLoShipEO entity object.
     * @return the SlsTrnpLoShipEO
     */
    public SlsTrnpLoDocSrcEOImpl getSlsTrnpLoShipEO() {
        return (SlsTrnpLoDocSrcEOImpl) getEntity(ENTITY_SLSTRNPLOSHIPEO);
    }

    /**
     * Gets the attribute value for ARRIVAL_PNT using the alias name ArrivalPnt.
     * @return the ARRIVAL_PNT
     */
    public String getArrivalPnt() {
        return (String) getAttributeInternal(ARRIVALPNT);
    }

    /**
     * Sets <code>value</code> as attribute value for ARRIVAL_PNT using the alias name ArrivalPnt.
     * @param value value to set the ARRIVAL_PNT
     */
    public void setArrivalPnt(String value) {
        setAttributeInternal(ARRIVALPNT, value);
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
     * Gets the attribute value for DEPARTURE_PNT using the alias name DeparturePnt.
     * @return the DEPARTURE_PNT
     */
    public String getDeparturePnt() {
        return (String) getAttributeInternal(DEPARTUREPNT);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTURE_PNT using the alias name DeparturePnt.
     * @param value value to set the DEPARTURE_PNT
     */
    public void setDeparturePnt(String value) {
        setAttributeInternal(DEPARTUREPNT, value);
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
     * Gets the attribute value for EO_ID using the alias name EoId.
     * @return the EO_ID
     */
    public Integer getEoId() {
        return (Integer) getAttributeInternal(EOID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_ID using the alias name EoId.
     * @param value value to set the EO_ID
     */
    public void setEoId(Integer value) {
        setAttributeInternal(EOID, value);
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
     * Gets the attribute value for SHIP_ID using the alias name ShipId.
     * @return the SHIP_ID
     */
    public String getDocIdSrc() {
        return (String) getAttributeInternal(DOCIDSRC);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIP_ID using the alias name ShipId.
     * @param value value to set the SHIP_ID
     */
    public void setDocIdSrc(String value) {
        setAttributeInternal(DOCIDSRC, value);
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
     * Gets the attribute value for the calculated attribute DispShipIdTrans.
     * @return the DispShipIdTrans
     */
    public String getDispDocSrcIdTrans() {
        if (this.getDocIdSrc() != null) {
            return this.getAm().getDocumentSrcBasedOnId(this.getDocIdSrc());
        }
        return (String) getAttributeInternal(DISPDOCSRCIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DispShipIdTrans.
     * @param value value to set the  DispShipIdTrans
     */
    public void setDispDocSrcIdTrans(String value) {
        setAttributeInternal(DISPDOCSRCIDTRANS, value);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SlsTrnpLoProdDtl.
     */
    public RowIterator getSlsTrnpLoProdDtl() {
        return (RowIterator) getAttributeInternal(SLSTRNPLOPRODDTL);
    }


    /**
     * Method will return Application Module App
     */
    public TrnpLoadingOrderAMImpl getAm() {
        TrnpLoadingOrderAMImpl am = (TrnpLoadingOrderAMImpl) getApplicationModule();
        return am;
    }
}
