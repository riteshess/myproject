package suggestedorder.model.views;

import java.sql.Timestamp;

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
// ---    Wed Jun 24 12:16:36 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ViewDraftPoVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SlocId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        OrgId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        CldId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        PoId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getPoId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        PoDt {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getPoDt();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        PoType {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getPoType();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        PoBasis {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getPoBasis();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        SoGrpId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getSoGrpId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        EoId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getEoId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        FyId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getFyId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        TransHoId {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getTransHoId();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setTransHoId((String) value);
            }
        },
        ViewSuppLOV {
            public Object get(ViewDraftPoVORowImpl obj) {
                return obj.getViewSuppLOV();
            }

            public void put(ViewDraftPoVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ViewDraftPoVORowImpl object);

        public abstract void put(ViewDraftPoVORowImpl object, Object value);

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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int POID = AttributesEnum.PoId.index();
    public static final int PODT = AttributesEnum.PoDt.index();
    public static final int POTYPE = AttributesEnum.PoType.index();
    public static final int POBASIS = AttributesEnum.PoBasis.index();
    public static final int SOGRPID = AttributesEnum.SoGrpId.index();
    public static final int EOID = AttributesEnum.EoId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int TRANSHOID = AttributesEnum.TransHoId.index();
    public static final int VIEWSUPPLOV = AttributesEnum.ViewSuppLOV.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ViewDraftPoVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute PoId.
     * @return the PoId
     */
    public String getPoId() {
        return (String) getAttributeInternal(POID);
    }

    /**
     * Gets the attribute value for the calculated attribute PoDt.
     * @return the PoDt
     */
    public Timestamp getPoDt() {
        return (Timestamp) getAttributeInternal(PODT);
    }

    /**
     * Gets the attribute value for the calculated attribute PoType.
     * @return the PoType
     */
    public Integer getPoType() {
        return (Integer) getAttributeInternal(POTYPE);
    }

    /**
     * Gets the attribute value for the calculated attribute PoBasis.
     * @return the PoBasis
     */
    public Integer getPoBasis() {
        return (Integer) getAttributeInternal(POBASIS);
    }

    /**
     * Gets the attribute value for the calculated attribute SoGrpId.
     * @return the SoGrpId
     */
    public String getSoGrpId() {
        return (String) getAttributeInternal(SOGRPID);
    }

    /**
     * Gets the attribute value for the calculated attribute EoId.
     * @return the EoId
     */
    public Integer getEoId() {
        return (Integer) getAttributeInternal(EOID);
    }

    /**
     * Gets the attribute value for the calculated attribute FyId.
     * @return the FyId
     */
    public Integer getFyId() {
        return (Integer) getAttributeInternal(FYID);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHoId.
     * @return the TransHoId
     */
    public String getTransHoId() {
        String hoId = resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        return hoId;
        //return (String) getAttributeInternal(TRANSHORGID);
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
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHoId.
     * @param value value to set the  TransHoId
     */
    public void setTransHoId(String value) {
        setAttributeInternal(TRANSHOID, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ViewSuppLOV.
     */
    public RowSet getViewSuppLOV() {
        return (RowSet) getAttributeInternal(VIEWSUPPLOV);
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

