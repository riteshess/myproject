package slsdailycallapp.model.views;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.RowSet;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 30 12:02:21 IST 2014
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
        EoNmTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getEoNmTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setEoNmTrans((String)value);
            }
        }
        ,
        EoIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getEoIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setEoIdTrans((Integer)value);
            }
        }
        ,
        CldIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getCldIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setCldIdTrans((String)value);
            }
        }
        ,
        OrgIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getOrgIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setOrgIdTrans((String)value);
            }
        }
        ,
        HoOrgIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getHoOrgIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setHoOrgIdTrans((String)value);
            }
        }
        ,
        SlocIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getSlocIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setSlocIdTrans((Integer)value);
            }
        }
        ,
        AssignedToNmTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getAssignedToNmTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAssignedToNmTrans((String)value);
            }
        }
        ,
        AssignedToIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getAssignedToIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAssignedToIdTrans((Integer)value);
            }
        }
        ,
        StageIdTrans {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getStageIdTrans();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setStageIdTrans((Integer)value);
            }
        }
        ,
        LovEoIdVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLovEoIdVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovSalesManVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLovSalesManVO1();
            }

            public void put(TempSearchPanelVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovStageVO1 {
            public Object get(TempSearchPanelVORowImpl obj) {
                return obj.getLovStageVO1();
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
    public static final int EONMTRANS = AttributesEnum.EoNmTrans.index();
    public static final int EOIDTRANS = AttributesEnum.EoIdTrans.index();
    public static final int CLDIDTRANS = AttributesEnum.CldIdTrans.index();
    public static final int ORGIDTRANS = AttributesEnum.OrgIdTrans.index();
    public static final int HOORGIDTRANS = AttributesEnum.HoOrgIdTrans.index();
    public static final int SLOCIDTRANS = AttributesEnum.SlocIdTrans.index();
    public static final int ASSIGNEDTONMTRANS = AttributesEnum.AssignedToNmTrans.index();
    public static final int ASSIGNEDTOIDTRANS = AttributesEnum.AssignedToIdTrans.index();
    public static final int STAGEIDTRANS = AttributesEnum.StageIdTrans.index();
    public static final int LOVEOIDVO1 = AttributesEnum.LovEoIdVO1.index();
    public static final int LOVSALESMANVO1 = AttributesEnum.LovSalesManVO1.index();
    public static final int LOVSTAGEVO1 = AttributesEnum.LovStageVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TempSearchPanelVORowImpl() {
    }
    /**
     * Method for resolving the El
     */
    public Object resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        Object Message = valueExp.getValue(elContext).toString();
        return Message;
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
     * Gets the attribute value for the calculated attribute EoNmTrans.
     * @return the EoNmTrans
     */
    public String getEoNmTrans() {
        return (String) getAttributeInternal(EONMTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoNmTrans.
     * @param value value to set the  EoNmTrans
     */
    public void setEoNmTrans(String value) {
        setAttributeInternal(EONMTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EoIdTrans.
     * @return the EoIdTrans
     */
    public Integer getEoIdTrans() {
        return (Integer) getAttributeInternal(EOIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoIdTrans.
     * @param value value to set the  EoIdTrans
     */
    public void setEoIdTrans(Integer value) {
        setAttributeInternal(EOIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CldIdTrans.
     * @return the CldIdTrans
     */
    public String getCldIdTrans() {
        if(getAttributeInternal(CLDIDTRANS) == null){
            if(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}")!= null){
                setCldIdTrans(resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString());
            }    
        }
        //System.out.println("CldIdTrans : "+ getAttributeInternal(CLDIDTRANS));
        return (String) getAttributeInternal(CLDIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldIdTrans.
     * @param value value to set the  CldIdTrans
     */
    public void setCldIdTrans(String value) {
        setAttributeInternal(CLDIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgIdTrans.
     * @return the OrgIdTrans
     */
    public String getOrgIdTrans() {
        if(getAttributeInternal(ORGIDTRANS) == null){
            if(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}")!= null){
                setOrgIdTrans(resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString());
            }    
        }
        //System.out.println("OrgIdTrans : "+getAttributeInternal(ORGIDTRANS));
        return (String) getAttributeInternal(ORGIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgIdTrans.
     * @param value value to set the  OrgIdTrans
     */
    public void setOrgIdTrans(String value) {
        setAttributeInternal(ORGIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgIdTrans.
     * @return the HoOrgIdTrans
     */
    public String getHoOrgIdTrans() {
        if(getAttributeInternal(HOORGIDTRANS) == null){
            if(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}")!= null){
                setHoOrgIdTrans(resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString());
            }    
        }
        //System.out.println("HoIdTrans : "+getAttributeInternal(HOORGIDTRANS));
        return (String) getAttributeInternal(HOORGIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HoOrgIdTrans.
     * @param value value to set the  HoOrgIdTrans
     */
    public void setHoOrgIdTrans(String value) {
        setAttributeInternal(HOORGIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocIdTrans.
     * @return the SlocIdTrans
     */
    public Integer getSlocIdTrans() {
        if(getAttributeInternal(SLOCIDTRANS) == null){
            if(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}")!= null){
                setSlocIdTrans(Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString()));
            }    
        }
        //System.out.println("SlocIdTrans : "+getAttributeInternal(SLOCIDTRANS));
        return (Integer) getAttributeInternal(SLOCIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocIdTrans.
     * @param value value to set the  SlocIdTrans
     */
    public void setSlocIdTrans(Integer value) {
        setAttributeInternal(SLOCIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AssignedToNmTrans.
     * @return the AssignedToNmTrans
     */
    public String getAssignedToNmTrans() {
        return (String) getAttributeInternal(ASSIGNEDTONMTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AssignedToNmTrans.
     * @param value value to set the  AssignedToNmTrans
     */
    public void setAssignedToNmTrans(String value) {
        setAttributeInternal(ASSIGNEDTONMTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AssignedToIdTrans.
     * @return the AssignedToIdTrans
     */
    public Integer getAssignedToIdTrans() {
        return (Integer) getAttributeInternal(ASSIGNEDTOIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AssignedToIdTrans.
     * @param value value to set the  AssignedToIdTrans
     */
    public void setAssignedToIdTrans(Integer value) {
        setAttributeInternal(ASSIGNEDTOIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StageIdTrans.
     * @return the StageIdTrans
     */
    public Integer getStageIdTrans() {
        return (Integer) getAttributeInternal(STAGEIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StageIdTrans.
     * @param value value to set the  StageIdTrans
     */
    public void setStageIdTrans(Integer value) {
        setAttributeInternal(STAGEIDTRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovEoIdVO1.
     */
    public RowSet getLovEoIdVO1() {
        return (RowSet)getAttributeInternal(LOVEOIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovSalesManVO1.
     */
    public RowSet getLovSalesManVO1() {
        return (RowSet)getAttributeInternal(LOVSALESMANVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovStageVO1.
     */
    public RowSet getLovStageVO1() {
        return (RowSet)getAttributeInternal(LOVSTAGEVO1);
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
}
