package appglbllang.model.entitiy;


import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 19 15:54:41 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppGlblLangEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        GlblLangId {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangId();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangId((Integer)value);
            }
        }
        ,
        GlblLangDesc {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangDesc();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangDesc((String)value);
            }
        }
        ,
        GlblLangComments {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangComments();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangComments((String)value);
            }
        }
        ,
        GlblLangUsedInApp {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangUsedInApp();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangUsedInApp((String)value);
            }
        }
        ,
        GlblLangActv {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangActv();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangActv((String)value);
            }
        }
        ,
        GlblLangNotation {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangNotation();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangNotation((String)value);
            }
        }
        ,
        GlblLangResFile {
            public Object get(AppGlblLangEOImpl obj) {
                return obj.getGlblLangResFile();
            }

            public void put(AppGlblLangEOImpl obj, Object value) {
                obj.setGlblLangResFile((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppGlblLangEOImpl object);

        public abstract void put(AppGlblLangEOImpl object, Object value);

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


    public static final int GLBLLANGID = AttributesEnum.GlblLangId.index();
    public static final int GLBLLANGDESC = AttributesEnum.GlblLangDesc.index();
    public static final int GLBLLANGCOMMENTS = AttributesEnum.GlblLangComments.index();
    public static final int GLBLLANGUSEDINAPP = AttributesEnum.GlblLangUsedInApp.index();
    public static final int GLBLLANGACTV = AttributesEnum.GlblLangActv.index();
    public static final int GLBLLANGNOTATION = AttributesEnum.GlblLangNotation.index();
    public static final int GLBLLANGRESFILE = AttributesEnum.GlblLangResFile.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppGlblLangEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("appglbllang.model.entitiy.AppGlblLangEO");
    }

    /**
     * Gets the attribute value for GlblLangId, using the alias name GlblLangId.
     * @return the value of GlblLangId
     */
    public Integer getGlblLangId() {
        return (Integer)getAttributeInternal(GLBLLANGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangId.
     * @param value value to set the GlblLangId
     */
    public void setGlblLangId(Integer value) {
        setAttributeInternal(GLBLLANGID, value);
    }

    /**
     * Gets the attribute value for GlblLangDesc, using the alias name GlblLangDesc.
     * @return the value of GlblLangDesc
     */
    public String getGlblLangDesc() {
        return (String)getAttributeInternal(GLBLLANGDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangDesc.
     * @param value value to set the GlblLangDesc
     */
    public void setGlblLangDesc(String value) {
        setAttributeInternal(GLBLLANGDESC, value);
    }

    /**
     * Gets the attribute value for GlblLangComments, using the alias name GlblLangComments.
     * @return the value of GlblLangComments
     */
    public String getGlblLangComments() {
        return (String)getAttributeInternal(GLBLLANGCOMMENTS);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangComments.
     * @param value value to set the GlblLangComments
     */
    public void setGlblLangComments(String value) {
        setAttributeInternal(GLBLLANGCOMMENTS, value);
    }

    /**
     * Gets the attribute value for GlblLangUsedInApp, using the alias name GlblLangUsedInApp.
     * @return the value of GlblLangUsedInApp
     */
    public String getGlblLangUsedInApp() {
        return (String)getAttributeInternal(GLBLLANGUSEDINAPP);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangUsedInApp.
     * @param value value to set the GlblLangUsedInApp
     */
    public void setGlblLangUsedInApp(String value) {
        setAttributeInternal(GLBLLANGUSEDINAPP, value);
    }

    /**
     * Gets the attribute value for GlblLangActv, using the alias name GlblLangActv.
     * @return the value of GlblLangActv
     */
    public String getGlblLangActv() {
        return (String)getAttributeInternal(GLBLLANGACTV);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangActv.
     * @param value value to set the GlblLangActv
     */
    public void setGlblLangActv(String value) {
        setAttributeInternal(GLBLLANGACTV, value);
    }

    /**
     * Gets the attribute value for GlblLangNotation, using the alias name GlblLangNotation.
     * @return the value of GlblLangNotation
     */
    public String getGlblLangNotation() {
        return (String)getAttributeInternal(GLBLLANGNOTATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangNotation.
     * @param value value to set the GlblLangNotation
     */
    public void setGlblLangNotation(String value) {
        setAttributeInternal(GLBLLANGNOTATION, value);
    }

    /**
     * Gets the attribute value for GlblLangResFile, using the alias name GlblLangResFile.
     * @return the value of GlblLangResFile
     */
    public String getGlblLangResFile() {
        return (String)getAttributeInternal(GLBLLANGRESFILE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlblLangResFile.
     * @param value value to set the GlblLangResFile
     */
    public void setGlblLangResFile(String value) {
        setAttributeInternal(GLBLLANGRESFILE, value);
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
     * @param glblLangId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer glblLangId) {
        return new Key(new Object[]{glblLangId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
      
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
    public String resolvEl(String data){
    FacesContext fc = FacesContext.getCurrentInstance();
    Application app = fc.getApplication();
    ExpressionFactory elFactory = app.getExpressionFactory();
    ELContext elContext = fc.getELContext();
    ValueExpression valueExp = elFactory.createValueExpression(elContext, data,
    Object.class);
    String Message=valueExp.getValue(elContext).toString();
    return Message;
    }
}
