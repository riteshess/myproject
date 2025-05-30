package trnpvhclprofileapp.model.entities;

import adf.utils.ebiz.EbizParams;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 03 16:22:22 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsTrnpVhclRegDtlEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        OrgId,
        HoOrgId,
        DocId,
        VhclRegNo,
        MileageLoad,
        MileageEmpty,
        FullTank,
        GrossWt,
        CapCc,
        TrnspLicDt,
        InspctnDueDt,
        InsureDueDt,
        ItmSrNo,
        Actv,
        InactvResn,
        InactvDt,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        DistUom,
        FuelUom,
        EngineNo,
        ChasisNo,
        TrnspId,
        VhclWtUom,
        RouteTyp,
        CapWt;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return SlsTrnpVhclRegDtlEOImpl.AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return SlsTrnpVhclRegDtlEOImpl.AttributesEnum.firstIndex() +
                   SlsTrnpVhclRegDtlEOImpl.AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = SlsTrnpVhclRegDtlEOImpl.AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int VHCLREGNO = AttributesEnum.VhclRegNo.index();
    public static final int MILEAGELOAD = AttributesEnum.MileageLoad.index();
    public static final int MILEAGEEMPTY = AttributesEnum.MileageEmpty.index();
    public static final int FULLTANK = AttributesEnum.FullTank.index();
    public static final int GROSSWT = AttributesEnum.GrossWt.index();
    public static final int CAPCC = AttributesEnum.CapCc.index();
    public static final int TRNSPLICDT = AttributesEnum.TrnspLicDt.index();
    public static final int INSPCTNDUEDT = AttributesEnum.InspctnDueDt.index();
    public static final int INSUREDUEDT = AttributesEnum.InsureDueDt.index();
    public static final int ITMSRNO = AttributesEnum.ItmSrNo.index();
    public static final int ACTV = AttributesEnum.Actv.index();
    public static final int INACTVRESN = AttributesEnum.InactvResn.index();
    public static final int INACTVDT = AttributesEnum.InactvDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int DISTUOM = AttributesEnum.DistUom.index();
    public static final int FUELUOM = AttributesEnum.FuelUom.index();
    public static final int ENGINENO = AttributesEnum.EngineNo.index();
    public static final int CHASISNO = AttributesEnum.ChasisNo.index();
    public static final int TRNSPID = AttributesEnum.TrnspId.index();
    public static final int VHCLWTUOM = AttributesEnum.VhclWtUom.index();
    public static final int ROUTETYP = AttributesEnum.RouteTyp.index();
    public static final int CAPWT = AttributesEnum.CapWt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SlsTrnpVhclRegDtlEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("trnpvhclprofileapp.model.entities.SlsTrnpVhclRegDtlEO");
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
     * Gets the attribute value for VhclRegNo, using the alias name VhclRegNo.
     * @return the value of VhclRegNo
     */
    public String getVhclRegNo() {
        return (String) getAttributeInternal(VHCLREGNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VhclRegNo.
     * @param value value to set the VhclRegNo
     */
    public void setVhclRegNo(String value) {
        setAttributeInternal(VHCLREGNO, value);
    }

    /**
     * Gets the attribute value for MileageLoad, using the alias name MileageLoad.
     * @return the value of MileageLoad
     */
    public oracle.jbo.domain.Number getMileageLoad() {
        return (oracle.jbo.domain.Number) getAttributeInternal(MILEAGELOAD);
    }

    /**
     * Sets <code>value</code> as the attribute value for MileageLoad.
     * @param value value to set the MileageLoad
     */
    public void setMileageLoad(oracle.jbo.domain.Number value) {
        setAttributeInternal(MILEAGELOAD, value);
    }

    /**
     * Gets the attribute value for MileageEmpty, using the alias name MileageEmpty.
     * @return the value of MileageEmpty
     */
    public Number getMileageEmpty() {
        return (Number) getAttributeInternal(MILEAGEEMPTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for MileageEmpty.
     * @param value value to set the MileageEmpty
     */
    public void setMileageEmpty(Number value) {
        setAttributeInternal(MILEAGEEMPTY, value);
    }

    /**
     * Gets the attribute value for FullTank, using the alias name FullTank.
     * @return the value of FullTank
     */
    public Number getFullTank() {
        return (Number) getAttributeInternal(FULLTANK);
    }

    /**
     * Sets <code>value</code> as the attribute value for FullTank.
     * @param value value to set the FullTank
     */
    public void setFullTank(Number value) {
        setAttributeInternal(FULLTANK, value);
    }

    /**
     * Gets the attribute value for GrossWt, using the alias name GrossWt.
     * @return the value of GrossWt
     */
    public Number getGrossWt() {
        return (Number) getAttributeInternal(GROSSWT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrossWt.
     * @param value value to set the GrossWt
     */
    public void setGrossWt(Number value) {
        setAttributeInternal(GROSSWT, value);
    }

    /**
     * Gets the attribute value for CapCc, using the alias name CapCc.
     * @return the value of CapCc
     */
    public Number getCapCc() {
        return (Number) getAttributeInternal(CAPCC);
    }

    /**
     * Sets <code>value</code> as the attribute value for CapCc.
     * @param value value to set the CapCc
     */
    public void setCapCc(Number value) {
        setAttributeInternal(CAPCC, value);
    }

    /**
     * Gets the attribute value for TrnspLicDt, using the alias name TrnspLicDt.
     * @return the value of TrnspLicDt
     */
    public Timestamp getTrnspLicDt() {
        return (Timestamp) getAttributeInternal(TRNSPLICDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrnspLicDt.
     * @param value value to set the TrnspLicDt
     */
    public void setTrnspLicDt(Timestamp value) {
        setAttributeInternal(TRNSPLICDT, value);
    }

    /**
     * Gets the attribute value for InspctnDueDt, using the alias name InspctnDueDt.
     * @return the value of InspctnDueDt
     */
    public Timestamp getInspctnDueDt() {
        return (Timestamp) getAttributeInternal(INSPCTNDUEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InspctnDueDt.
     * @param value value to set the InspctnDueDt
     */
    public void setInspctnDueDt(Timestamp value) {
        setAttributeInternal(INSPCTNDUEDT, value);
    }

    /**
     * Gets the attribute value for InsureDueDt, using the alias name InsureDueDt.
     * @return the value of InsureDueDt
     */
    public Timestamp getInsureDueDt() {
        return (Timestamp) getAttributeInternal(INSUREDUEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InsureDueDt.
     * @param value value to set the InsureDueDt
     */
    public void setInsureDueDt(Timestamp value) {
        setAttributeInternal(INSUREDUEDT, value);
    }

    /**
     * Gets the attribute value for ItmSrNo, using the alias name ItmSrNo.
     * @return the value of ItmSrNo
     */
    public String getItmSrNo() {
        return (String) getAttributeInternal(ITMSRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmSrNo.
     * @param value value to set the ItmSrNo
     */
    public void setItmSrNo(String value) {
        setAttributeInternal(ITMSRNO, value);
    }

    /**
     * Gets the attribute value for Actv, using the alias name Actv.
     * @return the value of Actv
     */
    public String getActv() {
        return (String) getAttributeInternal(ACTV);
    }

    /**
     * Sets <code>value</code> as the attribute value for Actv.
     * @param value value to set the Actv
     */
    public void setActv(String value) {
        setAttributeInternal(ACTV, value);
    }

    /**
     * Gets the attribute value for InactvResn, using the alias name InactvResn.
     * @return the value of InactvResn
     */
    public String getInactvResn() {
        return (String) getAttributeInternal(INACTVRESN);
    }

    /**
     * Sets <code>value</code> as the attribute value for InactvResn.
     * @param value value to set the InactvResn
     */
    public void setInactvResn(String value) {
        setAttributeInternal(INACTVRESN, value);
    }

    /**
     * Gets the attribute value for InactvDt, using the alias name InactvDt.
     * @return the value of InactvDt
     */
    public Timestamp getInactvDt() {
        return (Timestamp) getAttributeInternal(INACTVDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InactvDt.
     * @param value value to set the InactvDt
     */
    public void setInactvDt(Timestamp value) {
        setAttributeInternal(INACTVDT, value);
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
     * Gets the attribute value for DistUom, using the alias name DistUom.
     * @return the value of DistUom
     */
    public String getDistUom() {
        return (String) getAttributeInternal(DISTUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for DistUom.
     * @param value value to set the DistUom
     */
    public void setDistUom(String value) {
        setAttributeInternal(DISTUOM, value);
    }

    /**
     * Gets the attribute value for FuelUom, using the alias name FuelUom.
     * @return the value of FuelUom
     */
    public String getFuelUom() {
        return (String) getAttributeInternal(FUELUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for FuelUom.
     * @param value value to set the FuelUom
     */
    public void setFuelUom(String value) {
        setAttributeInternal(FUELUOM, value);
    }


    /**
     * Gets the attribute value for EngineNo, using the alias name EngineNo.
     * @return the value of EngineNo
     */
    public String getEngineNo() {
        return (String) getAttributeInternal(ENGINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EngineNo.
     * @param value value to set the EngineNo
     */
    public void setEngineNo(String value) {
        setAttributeInternal(ENGINENO, value);
    }

    /**
     * Gets the attribute value for ChasisNo, using the alias name ChasisNo.
     * @return the value of ChasisNo
     */
    public String getChasisNo() {
        return (String) getAttributeInternal(CHASISNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChasisNo.
     * @param value value to set the ChasisNo
     */
    public void setChasisNo(String value) {
        setAttributeInternal(CHASISNO, value);
    }

    /**
     * Gets the attribute value for TrnspId, using the alias name TrnspId.
     * @return the value of TrnspId
     */
    public Number getTrnspId() {
        return (Number) getAttributeInternal(TRNSPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrnspId.
     * @param value value to set the TrnspId
     */
    public void setTrnspId(Number value) {
        setAttributeInternal(TRNSPID, value);
    }

    /**
     * Gets the attribute value for VhclWtUom, using the alias name VhclWtUom.
     * @return the value of VhclWtUom
     */
    public String getVhclWtUom() {
        return (String) getAttributeInternal(VHCLWTUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for VhclWtUom.
     * @param value value to set the VhclWtUom
     */
    public void setVhclWtUom(String value) {
        setAttributeInternal(VHCLWTUOM, value);
    }

    /**
     * Gets the attribute value for RouteTyp, using the alias name RouteTyp.
     * @return the value of RouteTyp
     */
    public Number getRouteTyp() {
        return (Number) getAttributeInternal(ROUTETYP);
    }

    /**
     * Sets <code>value</code> as the attribute value for RouteTyp.
     * @param value value to set the RouteTyp
     */
    public void setRouteTyp(Number value) {
        setAttributeInternal(ROUTETYP, value);
    }

    /**
     * Gets the attribute value for CapWt, using the alias name CapWt.
     * @return the value of CapWt
     */
    public Number getCapWt() {
        return (Number) getAttributeInternal(CAPWT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CapWt.
     * @param value value to set the CapWt
     */
    public void setCapWt(Number value) {
        setAttributeInternal(CAPWT, value);
    }

    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param hoOrgId key constituent
     * @param docId key constituent
     * @param vhclRegNo key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String hoOrgId, String docId,
                                       String vhclRegNo) {
        return new Key(new Object[] { cldId, slocId, orgId, hoOrgId, docId, vhclRegNo });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {

        this.setActv("Y");

        Integer userid = new Integer(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString());
        Timestamp time = new Timestamp(System.currentTimeMillis());

        this.setOrgId(EbizParams.GLBL_APP_USR_ORG());

        System.out.println("UsrIdCreate :" + userid);
        System.out.println("UsrIdCreateDt :" + time);
        this.setUsrIdCreate(userid);
        this.setUsrIdCreateDt(time);

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

        if (operation == DML_INSERT) {
            System.out.println("Inside DML_INSERT .");

            if (this.getInactvResn() != null) {
                this.setInactvDt(new Timestamp(System.currentTimeMillis()));
            }
        }

        if (operation == DML_UPDATE) {
            System.out.println(" Inside DML_UPDATE ");

            Integer userid = new Integer(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString());

            this.setUsrIdMod(userid);
            this.setUsrIdModDt(new Timestamp(System.currentTimeMillis()));

            if (this.getInactvResn() != null) {

                this.setInactvDt(new Timestamp(System.currentTimeMillis()));
            }

        }

        super.doDML(operation, e);
    }


    public Object resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        return valueExp.getValue(elContext);
    }

}

