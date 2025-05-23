package mmsupplierperfeval.model.views;

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
// ---    Fri Apr 26 11:41:45 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DualVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        Dummy {
            public Object get(DualVORowImpl obj) {
                return obj.getDummy();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setDummy((String)value);
            }
        }
        ,
        TransParamSetId {
            public Object get(DualVORowImpl obj) {
                return obj.getTransParamSetId();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setTransParamSetId((String)value);
            }
        }
        ,
        CldIdTrans {
            public Object get(DualVORowImpl obj) {
                return obj.getCldIdTrans();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setCldIdTrans((String)value);
            }
        }
        ,
        SlocIdTrans {
            public Object get(DualVORowImpl obj) {
                return obj.getSlocIdTrans();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setSlocIdTrans((Integer)value);
            }
        }
        ,
        orgIdTrans {
            public Object get(DualVORowImpl obj) {
                return obj.getorgIdTrans();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setorgIdTrans((String)value);
            }
        }
        ,
        ParamSetLOV1 {
            public Object get(DualVORowImpl obj) {
                return obj.getParamSetLOV1();
            }

            public void put(DualVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(DualVORowImpl object);

        public abstract void put(DualVORowImpl object, Object value);

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
    public static final int TRANSPARAMSETID = AttributesEnum.TransParamSetId.index();
    public static final int CLDIDTRANS = AttributesEnum.CldIdTrans.index();
    public static final int SLOCIDTRANS = AttributesEnum.SlocIdTrans.index();
    public static final int ORGIDTRANS = AttributesEnum.orgIdTrans.index();
    public static final int PARAMSETLOV1 = AttributesEnum.ParamSetLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DualVORowImpl() {
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
     * Gets the attribute value for the calculated attribute TransParamSetId.
     * @return the TransParamSetId
     */
    public String getTransParamSetId() {
        return (String) getAttributeInternal(TRANSPARAMSETID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransParamSetId.
     * @param value value to set the  TransParamSetId
     */
    public void setTransParamSetId(String value) {
        setAttributeInternal(TRANSPARAMSETID, value);
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
     * Gets the attribute value for the calculated attribute CldIdTrans.
     * @return the CldIdTrans
     */
    public String getCldIdTrans() {
     return (String)resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
     //   return (String) getAttributeInternal(CLDIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldIdTrans.
     * @param value value to set the  CldIdTrans
     */
    public void setCldIdTrans(String value) {
        setAttributeInternal(CLDIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocIdTrans.
     * @return the SlocIdTrans
     */
    public Integer getSlocIdTrans() {
    //    return (Integer) getAttributeInternal(SLOCIDTRANS);
    return Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocIdTrans.
     * @param value value to set the  SlocIdTrans
     */
    public void setSlocIdTrans(Integer value) {
        setAttributeInternal(SLOCIDTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute orgIdTrans.
     * @return the orgIdTrans
     */
    public String getorgIdTrans() {
    //    return (String) getAttributeInternal(ORGIDTRANS);
    return (String)resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute orgIdTrans.
     * @param value value to set the  orgIdTrans
     */
    public void setorgIdTrans(String value) {
        setAttributeInternal(ORGIDTRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ParamSetLOV1.
     */
    public RowSet getParamSetLOV1() {
        return (RowSet)getAttributeInternal(PARAMSETLOV1);
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
