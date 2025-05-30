package appCostCenter.model.entity;


import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 13 15:44:07 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppCcPrfEOImpl extends EntityImpl {
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
       // super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Date date = (Date)Date.getCurrentDate();
        if (operation == DML_UPDATE) {
            Integer user =Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));

            setUsrIdMod(user);
            setUsrIdModDt(date);

        }
        super.doDML(operation, e);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CcPrfId {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcPrfId();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcPrfId((Integer)value);
            }
        }
        ,
        CcPrfDesc {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcPrfDesc();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcPrfDesc((String)value);
            }
        }
        ,
        CcNoOfComp {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcNoOfComp();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcNoOfComp((Integer)value);
            }
        }
        ,
        CcPrfActv {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcPrfActv();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcPrfActv((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setUsrIdModDt((Date)value);
            }
        }
        ,
        CldId {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCldId();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        OrgId {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        HoOrgId {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        CcPrfEffEndt {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcPrfEffEndt();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcPrfEffEndt((Date)value);
            }
        }
        ,
        CcPrfEffStdt {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcPrfEffStdt();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcPrfEffStdt((Date)value);
            }
        }
        ,
        CcFinalize {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getCcFinalize();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setCcFinalize((String)value);
            }
        }
        ,
        AppCcStruct {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getAppCcStruct();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        AppCcDoc {
            public Object get(AppCcPrfEOImpl obj) {
                return obj.getAppCcDoc();
            }

            public void put(AppCcPrfEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppCcPrfEOImpl object);

        public abstract void put(AppCcPrfEOImpl object, Object value);

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


    public static final int CCPRFID = AttributesEnum.CcPrfId.index();
    public static final int CCPRFDESC = AttributesEnum.CcPrfDesc.index();
    public static final int CCNOOFCOMP = AttributesEnum.CcNoOfComp.index();
    public static final int CCPRFACTV = AttributesEnum.CcPrfActv.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int CCPRFEFFENDT = AttributesEnum.CcPrfEffEndt.index();
    public static final int CCPRFEFFSTDT = AttributesEnum.CcPrfEffStdt.index();
    public static final int CCFINALIZE = AttributesEnum.CcFinalize.index();
    public static final int APPCCSTRUCT = AttributesEnum.AppCcStruct.index();
    public static final int APPCCDOC = AttributesEnum.AppCcDoc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppCcPrfEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("appCostCenter.model.entity.AppCcPrfEO");
    }

    /**
     * Gets the attribute value for CcPrfId, using the alias name CcPrfId.
     * @return the value of CcPrfId
     */
    public Integer getCcPrfId() {
        return (Integer)getAttributeInternal(CCPRFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcPrfId.
     * @param value value to set the CcPrfId
     */
    public void setCcPrfId(Integer value) {
        setAttributeInternal(CCPRFID, value);
    }

    /**
     * Gets the attribute value for CcPrfDesc, using the alias name CcPrfDesc.
     * @return the value of CcPrfDesc
     */
    public String getCcPrfDesc() {
        return (String)getAttributeInternal(CCPRFDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcPrfDesc.
     * @param value value to set the CcPrfDesc
     */
    public void setCcPrfDesc(String value) {
        setAttributeInternal(CCPRFDESC, value);
    }

    /**
     * Gets the attribute value for CcNoOfComp, using the alias name CcNoOfComp.
     * @return the value of CcNoOfComp
     */
    public Integer getCcNoOfComp() {
        return (Integer)getAttributeInternal(CCNOOFCOMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcNoOfComp.
     * @param value value to set the CcNoOfComp
     */
    public void setCcNoOfComp(Integer value) {
        setAttributeInternal(CCNOOFCOMP, value);
    }

    /**
     * Gets the attribute value for CcPrfActv, using the alias name CcPrfActv.
     * @return the value of CcPrfActv
     */
    public String getCcPrfActv() {
        return (String)getAttributeInternal(CCPRFACTV);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcPrfActv.
     * @param value value to set the CcPrfActv
     */
    public void setCcPrfActv(String value) {
        setAttributeInternal(CCPRFACTV, value);
    }


    /**
     * Gets the attribute value for UsrIdCreate, using the alias name UsrIdCreate.
     * @return the value of UsrIdCreate
     */
    public Integer getUsrIdCreate() {
        return (Integer)getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreate.
     * @param value value to set the UsrIdCreate
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }


    /**
     * Gets the attribute value for UsrIdMod, using the alias name UsrIdMod.
     * @return the value of UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer)getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdMod.
     * @param value value to set the UsrIdMod
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }


    /**
     * Gets the attribute value for UsrIdCreateDt, using the alias name UsrIdCreateDt.
     * @return the value of UsrIdCreateDt
     */
    public Date getUsrIdCreateDt() {
        return (Date)getAttributeInternal(USRIDCREATEDT);
    }


    /**
     * Gets the attribute value for UsrIdModDt, using the alias name UsrIdModDt.
     * @return the value of UsrIdModDt
     */
    public Date getUsrIdModDt() {
        return (Date)getAttributeInternal(USRIDMODDT);
    }
    
    public void setUsrIdModDt(Date value) {
        setAttributeInternal(USRIDMODDT, value);
    }



    /**
     * Gets the attribute value for CldId, using the alias name CldId.
     * @return the value of CldId
     */
    public String getCldId() {
        return (String)getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CldId.
     * @param value value to set the CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the value of OrgId
     */
    public String getOrgId() {
        return (String)getAttributeInternal(ORGID);
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
        return (String)getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HoOrgId.
     * @param value value to set the HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for SlocId, using the alias name SlocId.
     * @return the value of SlocId
     */
    public Integer getSlocId() {
        return (Integer)getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SlocId.
     * @param value value to set the SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for CcPrfEffEndt, using the alias name CcPrfEffEndt.
     * @return the value of CcPrfEffEndt
     */
    public Date getCcPrfEffEndt() {
        return (Date)getAttributeInternal(CCPRFEFFENDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcPrfEffEndt.
     * @param value value to set the CcPrfEffEndt
     */
    public void setCcPrfEffEndt(Date value) {
        setAttributeInternal(CCPRFEFFENDT, value);
    }

    /**
     * Gets the attribute value for CcPrfEffStdt, using the alias name CcPrfEffStdt.
     * @return the value of CcPrfEffStdt
     */
    public Date getCcPrfEffStdt() {
        return (Date)getAttributeInternal(CCPRFEFFSTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcPrfEffStdt.
     * @param value value to set the CcPrfEffStdt
     */
    public void setCcPrfEffStdt(Date value) {
        setAttributeInternal(CCPRFEFFSTDT, value);
    }

    /**
     * Gets the attribute value for CcFinalize, using the alias name CcFinalize.
     * @return the value of CcFinalize
     */
    public String getCcFinalize() {
        return (String)getAttributeInternal(CCFINALIZE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CcFinalize.
     * @param value value to set the CcFinalize
     */
    public void setCcFinalize(String value) {
        setAttributeInternal(CCFINALIZE, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getAppCcStruct() {
        return (RowIterator)getAttributeInternal(APPCCSTRUCT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getAppCcDoc() {
        return (RowIterator)getAttributeInternal(APPCCDOC);
    }


    /**
     * @param ccPrfId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer ccPrfId) {
        return new Key(new Object[]{ccPrfId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
       
        super.create(attributeList);
    }
    public String resolvEl(String data){
          FacesContext fc = FacesContext.getCurrentInstance();
          Application app = fc.getApplication();
          ExpressionFactory elFactory = app.getExpressionFactory();
          ELContext elContext = fc.getELContext();
          ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
          String Message=valueExp.getValue(elContext).toString();
          return Message;
        }
    

}
