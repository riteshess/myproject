package slssalesinvoiceapp.model.module.view;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.JboException;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 23 12:21:50 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TempSearchPanelVORowImpl extends ViewRowImpl {
   
   
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Dummy {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getDummy();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setDummy((String)value);
            }
        }
        ,
        DocId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        ToDocDt {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getToDocDt();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setToDocDt((Timestamp)value);
            }
        }
        ,
        FromDocDt {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getFromDocDt();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setFromDocDt((Timestamp)value);
            }
        }
        ,
        ToSIAmount {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getToSIAmount();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setToSIAmount((Number)value);
            }
        }
        ,
        FromSIAmount {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getFromSIAmount();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setFromSIAmount((Number)value);
            }
        }
        ,
        ToNumberOfItms {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getToNumberOfItms();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setToNumberOfItms((Number)value);
            }
        }
        ,
        FromNumberOfItms {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getFromNumberOfItms();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setFromNumberOfItms((Number)value);
            }
        }
        ,
        SIStatus {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getSIStatus();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setSIStatus((Integer)value);
            }
        }
        ,
        SIDocNm {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getSIDocNm();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setSIDocNm((String)value);
            }
        }
        ,
        SlocId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        CldId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        HoOrgId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        CurrId {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getCurrId();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setCurrId((Integer)value);
            }
        }
        ,
        EoNm {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getEoNm();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setEoNm((Integer)value);
            }
        }
        ,
        SINm {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getSINm();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setSINm((String)value);
            }
        }
        ,
        CurrIdBs {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getCurrIdBs();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setCurrIdBs((Integer)value);
            }
        }
        ,
        EoNameTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getEoNameTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setEoNameTrans((String)value);
            }
        }
        ,
        InvSubTyp {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getInvSubTyp();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setInvSubTyp((Integer)value);
            }
        }
        ,
        LOVInvoiceTypeVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLOVInvoiceTypeVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVCurrencyVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLOVCurrencyVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVCustomerVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLOVCustomerVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVSInmVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLOVSInmVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovInvSubTypVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLovInvSubTypVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(TempSearchPanelVORowImpl object);

        public abstract void put(TempSearchPanelVORowImpl object, Object value);

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


    public static final int DUMMY = AttributesEnum.Dummy.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int TODOCDT = AttributesEnum.ToDocDt.index();
    public static final int FROMDOCDT = AttributesEnum.FromDocDt.index();
    public static final int TOSIAMOUNT = AttributesEnum.ToSIAmount.index();
    public static final int FROMSIAMOUNT = AttributesEnum.FromSIAmount.index();
    public static final int TONUMBEROFITMS = AttributesEnum.ToNumberOfItms.index();
    public static final int FROMNUMBEROFITMS = AttributesEnum.FromNumberOfItms.index();
    public static final int SISTATUS = AttributesEnum.SIStatus.index();
    public static final int SIDOCNM = AttributesEnum.SIDocNm.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int CURRID = AttributesEnum.CurrId.index();
    public static final int EONM = AttributesEnum.EoNm.index();
    public static final int SINM = AttributesEnum.SINm.index();
    public static final int CURRIDBS = AttributesEnum.CurrIdBs.index();
    public static final int EONAMETRANS = AttributesEnum.EoNameTrans.index();
    public static final int INVSUBTYP = AttributesEnum.InvSubTyp.index();
    public static final int LOVINVOICETYPEVO1 = AttributesEnum.LOVInvoiceTypeVO1.index();
    public static final int LOVCURRENCYVO1 = AttributesEnum.LOVCurrencyVO1.index();
    public static final int LOVCUSTOMERVO1 = AttributesEnum.LOVCustomerVO1.index();
    public static final int LOVSINMVO1 = AttributesEnum.LOVSInmVO1.index();
    public static final int LOVINVSUBTYPVO1 = AttributesEnum.LovInvSubTypVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TempSearchPanelVORowImpl() {
    }
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {

        CallableStatement st = null;
        try {
            st = getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                for (int z = 0; z < bindVars.length; z++) {
                    st.setObject(z + 2, bindVars[z]);
                }
            }
            st.executeUpdate();
            return st.getObject(1);
        } catch (SQLException e) {
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public Integer getCurrIdBs(String OrgId) {
        return (Integer)callStoredFunction(Types.INTEGER, "app.pkg_app.get_org_def_curr_bs1(?)",
                                           new Object[] { OrgId });
    }
    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String) getAttributeInternal(DUMMY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Dummy.
     * @param value value to set the  Dummy
     */
    public void setDummy(String value) {
        setAttributeInternal(DUMMY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocId.
     * @param value value to set the  DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ToDocDt.
     * @return the ToDocDt
     */
    public Timestamp getToDocDt() {
        return (Timestamp) getAttributeInternal(TODOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ToDocDt.
     * @param value value to set the  ToDocDt
     */
    public void setToDocDt(Timestamp value) {
        setAttributeInternal(TODOCDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FromDocDt.
     * @return the FromDocDt
     */
    public Timestamp getFromDocDt() {
        return (Timestamp) getAttributeInternal(FROMDOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FromDocDt.
     * @param value value to set the  FromDocDt
     */
    public void setFromDocDt(Timestamp value) {
        setAttributeInternal(FROMDOCDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ToSIAmount.
     * @return the ToSIAmount
     */
    public Number getToSIAmount() {
        return (Number) getAttributeInternal(TOSIAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ToSIAmount.
     * @param value value to set the  ToSIAmount
     */
    public void setToSIAmount(Number value) {
        setAttributeInternal(TOSIAMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FromSIAmount.
     * @return the FromSIAmount
     */
    public Number getFromSIAmount() {
        return (Number) getAttributeInternal(FROMSIAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FromSIAmount.
     * @param value value to set the  FromSIAmount
     */
    public void setFromSIAmount(Number value) {
        setAttributeInternal(FROMSIAMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ToNumberOfItms.
     * @return the ToNumberOfItms
     */
    public Number getToNumberOfItms() {
        return (Number) getAttributeInternal(TONUMBEROFITMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ToNumberOfItms.
     * @param value value to set the  ToNumberOfItms
     */
    public void setToNumberOfItms(Number value) {
        setAttributeInternal(TONUMBEROFITMS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FromNumberOfItms.
     * @return the FromNumberOfItms
     */
    public Number getFromNumberOfItms() {
        return (Number) getAttributeInternal(FROMNUMBEROFITMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FromNumberOfItms.
     * @param value value to set the  FromNumberOfItms
     */
    public void setFromNumberOfItms(Number value) {
        setAttributeInternal(FROMNUMBEROFITMS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SIStatus.
     * @return the SIStatus
     */
    public Integer getSIStatus() {
        return (Integer) getAttributeInternal(SISTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SIStatus.
     * @param value value to set the  SIStatus
     */
    public void setSIStatus(Integer value) {
        setAttributeInternal(SISTATUS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SIDocNm.
     * @return the SIDocNm
     */
    public String getSIDocNm() {
        return (String) getAttributeInternal(SIDOCNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SIDocNm.
     * @param value value to set the  SIDocNm
     */
    public void setSIDocNm(String value) {
        setAttributeInternal(SIDOCNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        
        Integer slocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        
        return slocId;
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocId.
     * @param value value to set the  SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        
        StringBuffer orgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}"));
        
        
        return orgId.toString();
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        StringBuffer cldId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}"));
        
        
        return cldId.toString();
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        StringBuffer hoOrgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}"));
        
        return hoOrgId.toString();
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HoOrgId.
     * @param value value to set the  HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrId.
     * @return the CurrId
     */
    public Integer getCurrId() {
        return (Integer) getAttributeInternal(CURRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrId.
     * @param value value to set the  CurrId
     */
    public void setCurrId(Integer value) {
        setAttributeInternal(CURRID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoNm.
     * @return the EoNm
     */
    public Integer getEoNm() {
        return (Integer) getAttributeInternal(EONM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoNm.
     * @param value value to set the  EoNm
     */
    public void setEoNm(Integer value) {
        setAttributeInternal(EONM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SINm.
     * @return the SINm
     */
    public String getSINm() {
        return (String) getAttributeInternal(SINM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SINm.
     * @param value value to set the  SINm
     */
    public void setSINm(String value) {
        setAttributeInternal(SINM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrIdBs.
     * @return the CurrIdBs
     */
    public Integer getCurrIdBs() {
        StringBuffer orgId = new StringBuffer(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}"));
        return (Integer) getCurrIdBs(orgId.toString());
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrIdBs.
     * @param value value to set the  CurrIdBs
     */
    public void setCurrIdBs(Integer value) {
        setAttributeInternal(CURRIDBS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoNameTrans.
     * @return the EoNameTrans
     */
    public String getEoNameTrans() {
        return (String) getAttributeInternal(EONAMETRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoNameTrans.
     * @param value value to set the  EoNameTrans
     */
    public void setEoNameTrans(String value) {
        setAttributeInternal(EONAMETRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InvSubTyp.
     * @return the InvSubTyp
     */
    public Integer getInvSubTyp() {
        return (Integer) getAttributeInternal(INVSUBTYP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InvSubTyp.
     * @param value value to set the  InvSubTyp
     */
    public void setInvSubTyp(Integer value) {
        setAttributeInternal(INVSUBTYP, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVInvoiceTypeVO1.
     */
    public RowSet getLOVInvoiceTypeVO1() {
        return (RowSet)getAttributeInternal(LOVINVOICETYPEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVCurrencyVO1.
     */
    public RowSet getLOVCurrencyVO1() {
        return (RowSet)getAttributeInternal(LOVCURRENCYVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVCustomerVO1.
     */
    public RowSet getLOVCustomerVO1() {
        return (RowSet)getAttributeInternal(LOVCUSTOMERVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVSInmVO1.
     */
    public RowSet getLOVSInmVO1() {
        return (RowSet)getAttributeInternal(LOVSINMVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovInvSubTypVO1.
     */
    public RowSet getLovInvSubTypVO1() {
        return (RowSet)getAttributeInternal(LOVINVSUBTYPVO1);
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
     * Method for resolving the El
     */
    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }
    
}
