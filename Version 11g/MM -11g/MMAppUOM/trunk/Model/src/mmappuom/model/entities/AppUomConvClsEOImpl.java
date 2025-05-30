package mmappuom.model.entities;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 28 11:20:51 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppUomConvClsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        SlocId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        UomIdSrc {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUomIdSrc();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setUomIdSrc((String)value);
            }
        }
        ,
        UomIdDest {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUomIdDest();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setUomIdDest((String)value);
            }
        }
        ,
        GrpId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getGrpId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setGrpId((String)value);
            }
        }
        ,
        ItmId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getItmId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ConvFctr {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getConvFctr();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setConvFctr((Number)value);
            }
        }
        ,
        Actv {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getActv();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setActv((String)value);
            }
        }
        ,
        InactvResn {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getInactvResn();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setInactvResn((String)value);
            }
        }
        ,
        InactvDt {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getInactvDt();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setInactvDt((Date)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UsrIdMod {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UomClsEntId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getUomClsEntId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setUomClsEntId((Integer)value);
            }
        }
        ,
        HoOrgId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setHoOrgId((String)value);
            }
        }
        ,
        CldId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getCldId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        OrgId {
            public Object get(AppUomConvClsEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(AppUomConvClsEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(AppUomConvClsEOImpl object);

        public abstract void put(AppUomConvClsEOImpl object, Object value);

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


    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int UOMIDSRC = AttributesEnum.UomIdSrc.index();
    public static final int UOMIDDEST = AttributesEnum.UomIdDest.index();
    public static final int GRPID = AttributesEnum.GrpId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int CONVFCTR = AttributesEnum.ConvFctr.index();
    public static final int ACTV = AttributesEnum.Actv.index();
    public static final int INACTVRESN = AttributesEnum.InactvResn.index();
    public static final int INACTVDT = AttributesEnum.InactvDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int UOMCLSENTID = AttributesEnum.UomClsEntId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public AppUomConvClsEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mmappuom.model.entities.AppUomConvClsEO");
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
     * Gets the attribute value for UomIdSrc, using the alias name UomIdSrc.
     * @return the value of UomIdSrc
     */
    public String getUomIdSrc() {
        return (String)getAttributeInternal(UOMIDSRC);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomIdSrc.
     * @param value value to set the UomIdSrc
     */
    public void setUomIdSrc(String value) {
        setAttributeInternal(UOMIDSRC, value);
    }

    /**
     * Gets the attribute value for UomIdDest, using the alias name UomIdDest.
     * @return the value of UomIdDest
     */
    public String getUomIdDest() {
        return (String)getAttributeInternal(UOMIDDEST);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomIdDest.
     * @param value value to set the UomIdDest
     */
    public void setUomIdDest(String value) {
        setAttributeInternal(UOMIDDEST, value);
    }

    /**
     * Gets the attribute value for GrpId, using the alias name GrpId.
     * @return the value of GrpId
     */
    public String getGrpId() {
        return (String)getAttributeInternal(GRPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrpId.
     * @param value value to set the GrpId
     */
    public void setGrpId(String value) {
        setAttributeInternal(GRPID, value);
    }

    /**
     * Gets the attribute value for ItmId, using the alias name ItmId.
     * @return the value of ItmId
     */
    public String getItmId() {
        return (String)getAttributeInternal(ITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItmId.
     * @param value value to set the ItmId
     */
    public void setItmId(String value) {
        setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for ConvFctr, using the alias name ConvFctr.
     * @return the value of ConvFctr
     */
    public Number getConvFctr() {
        return (Number)getAttributeInternal(CONVFCTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConvFctr.
     * @param value value to set the ConvFctr
     */
    public void setConvFctr(Number value) {
        setAttributeInternal(CONVFCTR, value);
    }

    /**
     * Gets the attribute value for Actv, using the alias name Actv.
     * @return the value of Actv
     */
    public String getActv() {
        return (String)getAttributeInternal(ACTV);
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
        return (String)getAttributeInternal(INACTVRESN);
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
    public Date getInactvDt() {
        return (Date)getAttributeInternal(INACTVDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InactvDt.
     * @param value value to set the InactvDt
     */
    public void setInactvDt(Date value) {
        setAttributeInternal(INACTVDT, value);
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
     * Gets the attribute value for UsrIdCreateDt, using the alias name UsrIdCreateDt.
     * @return the value of UsrIdCreateDt
     */
    public Date getUsrIdCreateDt() {
        return (Date)getAttributeInternal(USRIDCREATEDT);
    }
    public void setUsrIdCreateDt(Date value) {
        setAttributeInternal(USRIDCREATEDT, value);
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
     * Gets the attribute value for UomClsEntId, using the alias name UomClsEntId.
     * @return the value of UomClsEntId
     */
    public Integer getUomClsEntId() {
        return (Integer)getAttributeInternal(UOMCLSENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UomClsEntId.
     * @param value value to set the UomClsEntId
     */
    public void setUomClsEntId(Integer value) {
        setAttributeInternal(UOMCLSENTID, value);
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
     * @param slocId key constituent
     * @param uomIdSrc key constituent
     * @param uomIdDest key constituent
     * @param itmId key constituent
     * @param hoOrgId key constituent
     * @param cldId key constituent
     * @param orgId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer slocId, String uomIdSrc, String uomIdDest, String itmId, String hoOrgId,
                                       String cldId, String orgId) {
        return new Key(new Object[]{slocId, uomIdSrc, uomIdDest, itmId, hoOrgId, cldId, orgId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        String orgid =(String)resolveEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        String cldid =(String)resolveEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
        String hoOrgid =(String)resolveEl("#{pageFlowScope.GLBL_HO_ORG_ID}");
        Date dt=(Date)Date.getCurrentDate();
        // System.out.println(" date in dt  "+dt);
         setUsrIdCreateDt(dt);
        setOrgId(orgid);
        setHoOrgId(hoOrgid);
        setCldId(cldid);
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
   //     super.lock();
    }
    public String resolveEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if(operation == DML_UPDATE){
            Integer userid = Integer.parseInt(resolveEl("#{pageFlowScope.GLBL_APP_USR}"));
            setUsrIdMod(userid);
            Date dt=(Date)Date.getCurrentDate();
             setUsrIdModDt(dt);
        }
        super.doDML(operation, e);
    }
}
