package svcdefectsapp.model.views;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 03 17:15:17 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TransSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Dummy,
        CldId,
        SlocId,
        HoOrgId,
        TransDfctTypeId,
        TransDfctNm,
        TransDfctTypeNm,
        LovDfctIdVO;
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


    public static final int DUMMY = AttributesEnum.Dummy.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int TRANSDFCTTYPEID = AttributesEnum.TransDfctTypeId.index();
    public static final int TRANSDFCTNM = AttributesEnum.TransDfctNm.index();
    public static final int TRANSDFCTTYPENM = AttributesEnum.TransDfctTypeNm.index();
    public static final int LOVDFCTIDVO = AttributesEnum.LovDfctIdVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TransSearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String) getAttributeInternal(DUMMY);
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
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        if(getAttributeInternal(CLDID)==null){
            String paramCldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
             return paramCldId;
        }else{
            return (String) getAttributeInternal(CLDID);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        if(getAttributeInternal(SLOCID)==null){
            return Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        }else{
            return (Integer) getAttributeInternal(SLOCID);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocId.
     * @param value value to set the  SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        if(getAttributeInternal(HOORGID)==null){
            String paramCldId = resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}");
             return paramCldId;
        }else{
            return (String) getAttributeInternal(HOORGID);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HoOrgId.
     * @param value value to set the  HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransDfctTypeId.
     * @return the TransDfctTypeId
     */
    public Integer getTransDfctTypeId() {
        if(getAttributeInternal(TRANSDFCTTYPEID)==null){
            return 0;
        }else{
        return (Integer) getAttributeInternal(TRANSDFCTTYPEID);
        }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDfctTypeId.
     * @param value value to set the  TransDfctTypeId
     */
    public void setTransDfctTypeId(Integer value) {
        setAttributeInternal(TRANSDFCTTYPEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDfctNm.
     * @return the TransDfctNm
     */
    public String getTransDfctNm() {
        return (String) getAttributeInternal(TRANSDFCTNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDfctNm.
     * @param value value to set the  TransDfctNm
     */
    public void setTransDfctNm(String value) {
        setAttributeInternal(TRANSDFCTNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDfctTypeNm.
     * @return the TransDfctTypeNm
     */
    public String getTransDfctTypeNm() {
        return (String) getAttributeInternal(TRANSDFCTTYPENM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDfctTypeNm.
     * @param value value to set the  TransDfctTypeNm
     */
    public void setTransDfctTypeNm(String value) {
        setAttributeInternal(TRANSDFCTTYPENM, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovDfctIdVO.
     */
    public RowSet getLovDfctIdVO() {
        return (RowSet) getAttributeInternal(LOVDFCTIDVO);
    }
}

