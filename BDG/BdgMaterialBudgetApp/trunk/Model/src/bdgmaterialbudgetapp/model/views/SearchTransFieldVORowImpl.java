package bdgmaterialbudgetapp.model.views;

import java.sql.Timestamp;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.context.FacesContext;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 29 15:41:05 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SearchTransFieldVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        TransHoOrgId,
        TransCldId,
        TransOrgId,
        TransSlocId,
        TransUsrId,
        TransDocId,
        TransBudgetId,
        TransBudgetSet,
        TransBdgFyId,
        TransCreateDt,
        TransBdgStDt,
        TransBdgEndDt,
        TransEmpNm,
        TransEmpId,
        TransBdgStatus,
        AmtNotationIdTrans,
        AmtNotationDispTrans,
        AmtNotationDescTrans,
        LovFyIdForSearchVO1,
        LovOrgIdVO1,
        LovSubOrdinateEmpVO1,
        LovBudgetStatVO1,
        LOVAmtNotationVO1;
        static AttributesEnum[] vals = null; ;
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
    public static final int TRANSHOORGID = AttributesEnum.TransHoOrgId.index();
    public static final int TRANSCLDID = AttributesEnum.TransCldId.index();
    public static final int TRANSORGID = AttributesEnum.TransOrgId.index();
    public static final int TRANSSLOCID = AttributesEnum.TransSlocId.index();
    public static final int TRANSUSRID = AttributesEnum.TransUsrId.index();
    public static final int TRANSDOCID = AttributesEnum.TransDocId.index();
    public static final int TRANSBUDGETID = AttributesEnum.TransBudgetId.index();
    public static final int TRANSBUDGETSET = AttributesEnum.TransBudgetSet.index();
    public static final int TRANSBDGFYID = AttributesEnum.TransBdgFyId.index();
    public static final int TRANSCREATEDT = AttributesEnum.TransCreateDt.index();
    public static final int TRANSBDGSTDT = AttributesEnum.TransBdgStDt.index();
    public static final int TRANSBDGENDDT = AttributesEnum.TransBdgEndDt.index();
    public static final int TRANSEMPNM = AttributesEnum.TransEmpNm.index();
    public static final int TRANSEMPID = AttributesEnum.TransEmpId.index();
    public static final int TRANSBDGSTATUS = AttributesEnum.TransBdgStatus.index();
    public static final int AMTNOTATIONIDTRANS = AttributesEnum.AmtNotationIdTrans.index();
    public static final int AMTNOTATIONDISPTRANS = AttributesEnum.AmtNotationDispTrans.index();
    public static final int AMTNOTATIONDESCTRANS = AttributesEnum.AmtNotationDescTrans.index();
    public static final int LOVFYIDFORSEARCHVO1 = AttributesEnum.LovFyIdForSearchVO1.index();
    public static final int LOVORGIDVO1 = AttributesEnum.LovOrgIdVO1.index();
    public static final int LOVSUBORDINATEEMPVO1 = AttributesEnum.LovSubOrdinateEmpVO1.index();
    public static final int LOVBUDGETSTATVO1 = AttributesEnum.LovBudgetStatVO1.index();
    public static final int LOVAMTNOTATIONVO1 = AttributesEnum.LOVAmtNotationVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SearchTransFieldVORowImpl() {
    }


    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public String getSlocId() {
        return (String) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHoOrgId.
     * @return the TransHoOrgId
     */
    public String getTransHoOrgId() {
        return (resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString());
        // return (String) getAttributeInternal(TRANSHOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHoOrgId.
     * @param value value to set the  TransHoOrgId
     */
    public void setTransHoOrgId(String value) {
        setAttributeInternal(TRANSHOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCldId.
     * @return the TransCldId
     */
    public String getTransCldId() {
        return (resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString());
        // return (String) getAttributeInternal(TRANSCLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCldId.
     * @param value value to set the  TransCldId
     */
    public void setTransCldId(String value) {
        setAttributeInternal(TRANSCLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOrgId.
     * @return the TransOrgId
     */
    public String getTransOrgId() {
        if (getAttributeInternal(TRANSORGID) != null)
            return (String) getAttributeInternal(TRANSORGID);
        else
            return (resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString());
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrgId.
     * @param value value to set the  TransOrgId
     */
    public void setTransOrgId(String value) {
        setAttributeInternal(TRANSORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSlocId.
     * @return the TransSlocId
     */
    public Integer getTransSlocId() {
        return (Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString()));
        // return (Integer) getAttributeInternal(TRANSSLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSlocId.
     * @param value value to set the  TransSlocId
     */
    public void setTransSlocId(Integer value) {
        setAttributeInternal(TRANSSLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransUsrId.
     * @return the TransUsrId
     */
    public Integer getTransUsrId() {
        return (Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString()));
        // return (Integer) getAttributeInternal(TRANSUSRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransUsrId.
     * @param value value to set the  TransUsrId
     */
    public void setTransUsrId(Integer value) {
        setAttributeInternal(TRANSUSRID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransDocId.
     * @return the TransDocId
     */
    public String getTransDocId() {
        return (String) getAttributeInternal(TRANSDOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDocId.
     * @param value value to set the  TransDocId
     */
    public void setTransDocId(String value) {
        setAttributeInternal(TRANSDOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBudgetId.
     * @return the TransBudgetId
     */
    public String getTransBudgetId() {
        return (String) getAttributeInternal(TRANSBUDGETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBudgetId.
     * @param value value to set the  TransBudgetId
     */
    public void setTransBudgetId(String value) {
        setAttributeInternal(TRANSBUDGETID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBudgetSet.
     * @return the TransBudgetSet
     */
    public Integer getTransBudgetSet() {
        return (Integer) getAttributeInternal(TRANSBUDGETSET);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBudgetSet.
     * @param value value to set the  TransBudgetSet
     */
    public void setTransBudgetSet(Integer value) {
        setAttributeInternal(TRANSBUDGETSET, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBdgFyId.
     * @return the TransBdgFyId
     */
    public Integer getTransBdgFyId() {
        return (Integer) getAttributeInternal(TRANSBDGFYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBdgFyId.
     * @param value value to set the  TransBdgFyId
     */
    public void setTransBdgFyId(Integer value) {
        setAttributeInternal(TRANSBDGFYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCreateDt.
     * @return the TransCreateDt
     */
    public Timestamp getTransCreateDt() {
        return (Timestamp) getAttributeInternal(TRANSCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCreateDt.
     * @param value value to set the  TransCreateDt
     */
    public void setTransCreateDt(Timestamp value) {
        setAttributeInternal(TRANSCREATEDT, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransBdgStDt.
     * @return the TransBdgStDt
     */
    public Timestamp getTransBdgStDt() {
        return (Timestamp) getAttributeInternal(TRANSBDGSTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBdgStDt.
     * @param value value to set the  TransBdgStDt
     */
    public void setTransBdgStDt(Timestamp value) {
        setAttributeInternal(TRANSBDGSTDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBdgEndDt.
     * @return the TransBdgEndDt
     */
    public Timestamp getTransBdgEndDt() {
        return (Timestamp) getAttributeInternal(TRANSBDGENDDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBdgEndDt.
     * @param value value to set the  TransBdgEndDt
     */
    public void setTransBdgEndDt(Timestamp value) {
        setAttributeInternal(TRANSBDGENDDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmpNm.
     * @return the TransEmpNm
     */
    public String getTransEmpNm() {
        return (String) getAttributeInternal(TRANSEMPNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmpNm.
     * @param value value to set the  TransEmpNm
     */
    public void setTransEmpNm(String value) {
        setAttributeInternal(TRANSEMPNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmpId.
     * @return the TransEmpId
     */
    public Integer getTransEmpId() {
        return (Integer) getAttributeInternal(TRANSEMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransEmpId.
     * @param value value to set the  TransEmpId
     */
    public void setTransEmpId(Integer value) {
        setAttributeInternal(TRANSEMPID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransBdgStatus.
     * @return the TransBdgStatus
     */
    public Integer getTransBdgStatus() {
        return (Integer) getAttributeInternal(TRANSBDGSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransBdgStatus.
     * @param value value to set the  TransBdgStatus
     */
    public void setTransBdgStatus(Integer value) {
        setAttributeInternal(TRANSBDGSTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmtNotationIdTrans.
     * @return the AmtNotationIdTrans
     */
    public Number getAmtNotationIdTrans() {
        if (getAttributeInternal(AMTNOTATIONIDTRANS) == null) {
            return new Number(1);
        }
        return (Number) getAttributeInternal(AMTNOTATIONIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AmtNotationIdTrans.
     * @param value value to set the  AmtNotationIdTrans
     */
    public void setAmtNotationIdTrans(Number value) {
        setAttributeInternal(AMTNOTATIONIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmtNotationDispTrans.
     * @return the AmtNotationDispTrans
     */
    public String getAmtNotationDispTrans() {
        return (String) getAttributeInternal(AMTNOTATIONDISPTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AmtNotationDispTrans.
     * @param value value to set the  AmtNotationDispTrans
     */
    public void setAmtNotationDispTrans(String value) {
        setAttributeInternal(AMTNOTATIONDISPTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmtNotationDescTrans.
     * @return the AmtNotationDescTrans
     */
    public String getAmtNotationDescTrans() {
        if (getAttributeInternal(AMTNOTATIONDESCTRANS) == null) {
            return "Basic";
        }
        return (String) getAttributeInternal(AMTNOTATIONDESCTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AmtNotationDescTrans.
     * @param value value to set the  AmtNotationDescTrans
     */
    public void setAmtNotationDescTrans(String value) {
        setAttributeInternal(AMTNOTATIONDESCTRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovFyIdForSearchVO1.
     */
    public RowSet getLovFyIdForSearchVO1() {
        return (RowSet) getAttributeInternal(LOVFYIDFORSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovOrgIdVO1.
     */
    public RowSet getLovOrgIdVO1() {
        return (RowSet) getAttributeInternal(LOVORGIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovSubOrdinateEmpVO1.
     */
    public RowSet getLovSubOrdinateEmpVO1() {
        return (RowSet) getAttributeInternal(LOVSUBORDINATEEMPVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovBudgetStatVO1.
     */
    public RowSet getLovBudgetStatVO1() {
        return (RowSet) getAttributeInternal(LOVBUDGETSTATVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVAmtNotationVO1.
     */
    public RowSet getLOVAmtNotationVO1() {
        return (RowSet) getAttributeInternal(LOVAMTNOTATIONVO1);
    }

    public Object resolvEl(String data) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ELContext elContext = facesContext.getELContext();
        ExpressionFactory expressionFactory = facesContext.getApplication().getExpressionFactory();
        ValueExpression exp = expressionFactory.createValueExpression(elContext, data, Object.class);
        return exp.getValue(elContext);
    }
}

