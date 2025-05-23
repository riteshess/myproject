package mnfparametersetupapp.model.views;

import mnfparametersetupapp.model.entities.MnfParamEOImpl;

import mnfparametersetupapp.model.services.ParameterSetupAppAMImpl;
import mnfparametersetupapp.model.views.common.MnfParamVORow;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 08 12:51:22 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnfParamVORowImpl extends ViewRowImpl implements MnfParamVORow {


    public static final int ENTITY_MNFPARAMEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        ParamId,
        ParamDesc,
        ParamType,
        ParamBasis,
        ParamVal,
        ParamCoaId,
        ParamActv,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        ParamSetId,
        InactvReason,
        InactvDt,
        TransCOANameParam,
        ParamUom,
        ParamValType,
        UomName,
        ParamRmrk,
        OrgMnfParam,
        LOVParamBasisVO,
        LOVParamTypeVO,
        LOVGLAccLinkVO1,
        LOVUomVO1,
        LOVDsAttO1,
        LOVUomVO2;
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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int PARAMID = AttributesEnum.ParamId.index();
    public static final int PARAMDESC = AttributesEnum.ParamDesc.index();
    public static final int PARAMTYPE = AttributesEnum.ParamType.index();
    public static final int PARAMBASIS = AttributesEnum.ParamBasis.index();
    public static final int PARAMVAL = AttributesEnum.ParamVal.index();
    public static final int PARAMCOAID = AttributesEnum.ParamCoaId.index();
    public static final int PARAMACTV = AttributesEnum.ParamActv.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int PARAMSETID = AttributesEnum.ParamSetId.index();
    public static final int INACTVREASON = AttributesEnum.InactvReason.index();
    public static final int INACTVDT = AttributesEnum.InactvDt.index();
    public static final int TRANSCOANAMEPARAM = AttributesEnum.TransCOANameParam.index();
    public static final int PARAMUOM = AttributesEnum.ParamUom.index();
    public static final int PARAMVALTYPE = AttributesEnum.ParamValType.index();
    public static final int UOMNAME = AttributesEnum.UomName.index();
    public static final int PARAMRMRK = AttributesEnum.ParamRmrk.index();
    public static final int ORGMNFPARAM = AttributesEnum.OrgMnfParam.index();
    public static final int LOVPARAMBASISVO = AttributesEnum.LOVParamBasisVO.index();
    public static final int LOVPARAMTYPEVO = AttributesEnum.LOVParamTypeVO.index();
    public static final int LOVGLACCLINKVO1 = AttributesEnum.LOVGLAccLinkVO1.index();
    public static final int LOVUOMVO1 = AttributesEnum.LOVUomVO1.index();
    public static final int LOVDSATTO1 = AttributesEnum.LOVDsAttO1.index();
    public static final int LOVUOMVO2 = AttributesEnum.LOVUomVO2.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnfParamVORowImpl() {
    }

    /**
     * Gets MnfParamEO entity object.
     * @return the MnfParamEO
     */
    public MnfParamEOImpl getMnfParamEO() {
        return (MnfParamEOImpl) getEntity(ENTITY_MNFPARAMEO);
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
     * Gets the attribute value for PARAM_ID using the alias name ParamId.
     * @return the PARAM_ID
     */
    public String getParamId() {
        return (String) getAttributeInternal(PARAMID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_ID using the alias name ParamId.
     * @param value value to set the PARAM_ID
     */
    public void setParamId(String value) {
        setAttributeInternal(PARAMID, value);
    }

    /**
     * Gets the attribute value for PARAM_DESC using the alias name ParamDesc.
     * @return the PARAM_DESC
     */
    public String getParamDesc() {
        return (String) getAttributeInternal(PARAMDESC);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_DESC using the alias name ParamDesc.
     * @param value value to set the PARAM_DESC
     */
    public void setParamDesc(String value) {
        setAttributeInternal(PARAMDESC, value);
    }

    /**
     * Gets the attribute value for PARAM_TYPE using the alias name ParamType.
     * @return the PARAM_TYPE
     */
    public Integer getParamType() {
        return (Integer) getAttributeInternal(PARAMTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_TYPE using the alias name ParamType.
     * @param value value to set the PARAM_TYPE
     */
    public void setParamType(Integer value) {
        setAttributeInternal(PARAMTYPE, value);
    }

    /**
     * Gets the attribute value for PARAM_BASIS using the alias name ParamBasis.
     * @return the PARAM_BASIS
     */
    public Integer getParamBasis() {
        return (Integer) getAttributeInternal(PARAMBASIS);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_BASIS using the alias name ParamBasis.
     * @param value value to set the PARAM_BASIS
     */
    public void setParamBasis(Integer value) {
        setAttributeInternal(PARAMBASIS, value);
    }

    /**
     * Gets the attribute value for PARAM_VAL using the alias name ParamVal.
     * @return the PARAM_VAL
     */
    public Number getParamVal() {
        return (Number) getAttributeInternal(PARAMVAL);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_VAL using the alias name ParamVal.
     * @param value value to set the PARAM_VAL
     */
    public void setParamVal(Number value) {
        setAttributeInternal(PARAMVAL, value);
    }

    /**
     * Gets the attribute value for PARAM_COA_ID using the alias name ParamCoaId.
     * @return the PARAM_COA_ID
     */
    public Number getParamCoaId() {
        return (Number) getAttributeInternal(PARAMCOAID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_COA_ID using the alias name ParamCoaId.
     * @param value value to set the PARAM_COA_ID
     */
    public void setParamCoaId(Number value) {
        setAttributeInternal(PARAMCOAID, value);
    }

    /**
     * Gets the attribute value for PARAM_ACTV using the alias name ParamActv.
     * @return the PARAM_ACTV
     */
    public String getParamActv() {
        return (String) getAttributeInternal(PARAMACTV);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_ACTV using the alias name ParamActv.
     * @param value value to set the PARAM_ACTV
     */
    public void setParamActv(String value) {
        setAttributeInternal(PARAMACTV, value);
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
     * Gets the attribute value for PARAM_SET_ID using the alias name ParamSetId.
     * @return the PARAM_SET_ID
     */
    public String getParamSetId() {
        return (String) getAttributeInternal(PARAMSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_SET_ID using the alias name ParamSetId.
     * @param value value to set the PARAM_SET_ID
     */
    public void setParamSetId(String value) {
        setAttributeInternal(PARAMSETID, value);
    }

    /**
     * Gets the attribute value for INACTV_REASON using the alias name InactvReason.
     * @return the INACTV_REASON
     */
    public String getInactvReason() {
        return (String) getAttributeInternal(INACTVREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for INACTV_REASON using the alias name InactvReason.
     * @param value value to set the INACTV_REASON
     */
    public void setInactvReason(String value) {
        setAttributeInternal(INACTVREASON, value);
    }

    /**
     * Gets the attribute value for INACTV_DT using the alias name InactvDt.
     * @return the INACTV_DT
     */
    public Timestamp getInactvDt() {
        return (Timestamp) getAttributeInternal(INACTVDT);
    }

    /**
     * Sets <code>value</code> as attribute value for INACTV_DT using the alias name InactvDt.
     * @param value value to set the INACTV_DT
     */
    public void setInactvDt(Timestamp value) {
        setAttributeInternal(INACTVDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCOANameParam.
     * @return the TransCOANameParam
     */
    public String getTransCOANameParam() {
        
        Row[] coaRow = getAm().getLOVGLAccLink1().getFilteredRows("CoaId", getParamCoaId());
        if (coaRow.length > 0) {
            if (coaRow[0].getAttribute("CoaNm") != null)
                return coaRow[0].getAttribute("CoaNm").toString();
        }
        return (String) getAttributeInternal(TRANSCOANAMEPARAM);
    }
    
    private ParameterSetupAppAMImpl getAm() {
        return (ParameterSetupAppAMImpl) getApplicationModule();
    }


    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCOANameParam.
     * @param value value to set the  TransCOANameParam
     */
    public void setTransCOANameParam(String value) {
        setAttributeInternal(TRANSCOANAMEPARAM, value);
    }

    /**
     * Gets the attribute value for PARAM_UOM using the alias name ParamUom.
     * @return the PARAM_UOM
     */
    public String getParamUom() {
        return (String) getAttributeInternal(PARAMUOM);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_UOM using the alias name ParamUom.
     * @param value value to set the PARAM_UOM
     */
    public void setParamUom(String value) {
        setAttributeInternal(PARAMUOM, value);
    }

    /**
     * Gets the attribute value for PARAM_VAL_TYPE using the alias name ParamValType.
     * @return the PARAM_VAL_TYPE
     */
    public Integer getParamValType() {
        return (Integer) getAttributeInternal(PARAMVALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_VAL_TYPE using the alias name ParamValType.
     * @param value value to set the PARAM_VAL_TYPE
     */
    public void setParamValType(Integer value) {
        setAttributeInternal(PARAMVALTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UomName.
     * @return the UomName
     */
    public String getUomName() {
        Row[] coaRow = getAm().getLOVUom1().getFilteredRows("UomId", getParamUom());
    
        if (coaRow.length > 0) {
            if (coaRow[0].getAttribute("UomDesc") != null)
                return coaRow[0].getAttribute("UomDesc").toString();
        }
        //return (String) getAttributeInternal(UOMNAME);
        return null;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UomName.
     * @param value value to set the  UomName
     */
    public void setUomName(String value) {
        setAttributeInternal(UOMNAME, value);
    }

    /**
     * Gets the attribute value for PARAM_RMRK using the alias name ParamRmrk.
     * @return the PARAM_RMRK
     */
    public String getParamRmrk() {
        return (String) getAttributeInternal(PARAMRMRK);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_RMRK using the alias name ParamRmrk.
     * @param value value to set the PARAM_RMRK
     */
    public void setParamRmrk(String value) {
        setAttributeInternal(PARAMRMRK, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link OrgMnfParam.
     */
    public RowIterator getOrgMnfParam() {
        return (RowIterator) getAttributeInternal(ORGMNFPARAM);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVParamBasisVO.
     */
    public RowSet getLOVParamBasisVO() {
        return (RowSet) getAttributeInternal(LOVPARAMBASISVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVParamTypeVO.
     */
    public RowSet getLOVParamTypeVO() {
        return (RowSet) getAttributeInternal(LOVPARAMTYPEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVGLAccLinkVO1.
     */
    public RowSet getLOVGLAccLinkVO1() {
        return (RowSet) getAttributeInternal(LOVGLACCLINKVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVUomVO1.
     */
    public RowSet getLOVUomVO1() {
        return (RowSet) getAttributeInternal(LOVUOMVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVDsAttO1.
     */
    public RowSet getLOVDsAttO1() {
        return (RowSet) getAttributeInternal(LOVDSATTO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVUomVO2.
     */
    public RowSet getLOVUomVO2() {
        return (RowSet) getAttributeInternal(LOVUOMVO2);
    }
}

