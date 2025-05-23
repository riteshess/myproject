package suggestedorder.model.views;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;

import suggestedorder.model.services.SuggestedOrderAMImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 03 17:51:37 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ViewSoSearchVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        DocDt {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getDocDt();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setDocDt((Date)value);
            }
        }
        ,
        DocId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        EntityId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getEntityId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setEntityId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        SoBasis {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoBasis();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoBasis((Integer)value);
            }
        }
        ,
        SoBasisDtFrm {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoBasisDtFrm();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoBasisDtFrm((Date)value);
            }
        }
        ,
        SoBasisDtTo {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoBasisDtTo();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoBasisDtTo((Date)value);
            }
        }
        ,
        SoDt {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoDt();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoDt((Date)value);
            }
        }
        ,
        SoId {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoId();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoId((String)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        SoClose {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getSoClose();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setSoClose((String)value);
            }
        }
        ,
        TranCountItem {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getTranCountItem();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setTranCountItem((String)value);
            }
        }
        ,
        MmSoItm {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getMmSoItm();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ViewSuggOrdLOV1 {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getViewSuggOrdLOV1();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ViewUsrLov1 {
            public Object get(ViewSoSearchVORowImpl obj) {
                return obj.getViewUsrLov1();
            }

            public void put(ViewSoSearchVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(ViewSoSearchVORowImpl object);

        public abstract void put(ViewSoSearchVORowImpl object, Object value);

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


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int ENTITYID = AttributesEnum.EntityId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int SOBASIS = AttributesEnum.SoBasis.index();
    public static final int SOBASISDTFRM = AttributesEnum.SoBasisDtFrm.index();
    public static final int SOBASISDTTO = AttributesEnum.SoBasisDtTo.index();
    public static final int SODT = AttributesEnum.SoDt.index();
    public static final int SOID = AttributesEnum.SoId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int SOCLOSE = AttributesEnum.SoClose.index();
    public static final int TRANCOUNTITEM = AttributesEnum.TranCountItem.index();
    public static final int MMSOITM = AttributesEnum.MmSoItm.index();
    public static final int VIEWSUGGORDLOV1 = AttributesEnum.ViewSuggOrdLOV1.index();
    public static final int VIEWUSRLOV1 = AttributesEnum.ViewUsrLov1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ViewSoSearchVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
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
        return (String) getAttributeInternal(ORGID);
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
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
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
     * Gets the attribute value for the calculated attribute DocDt.
     * @return the DocDt
     */
    public Date getDocDt() {
        return (Date) getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocDt.
     * @param value value to set the  DocDt
     */
    public void setDocDt(Date value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoId.
     * @return the SoId
     */
    public String getSoId() {
        return (String) getAttributeInternal(SOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoId.
     * @param value value to set the  SoId
     */
    public void setSoId(String value) {
        setAttributeInternal(SOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoDt.
     * @return the SoDt
     */
    public Date getSoDt() {
        return (Date) getAttributeInternal(SODT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoDt.
     * @param value value to set the  SoDt
     */
    public void setSoDt(Date value) {
        setAttributeInternal(SODT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoBasisDtFrm.
     * @return the SoBasisDtFrm
     */
    public Date getSoBasisDtFrm() {
        return (Date) getAttributeInternal(SOBASISDTFRM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoBasisDtFrm.
     * @param value value to set the  SoBasisDtFrm
     */
    public void setSoBasisDtFrm(Date value) {
        setAttributeInternal(SOBASISDTFRM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoBasisDtTo.
     * @return the SoBasisDtTo
     */
    public Date getSoBasisDtTo() {
        return (Date) getAttributeInternal(SOBASISDTTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoBasisDtTo.
     * @param value value to set the  SoBasisDtTo
     */
    public void setSoBasisDtTo(Date value) {
        setAttributeInternal(SOBASISDTTO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdCreate.
     * @return the UsrIdCreate
     */
    public Integer getUsrIdCreate() {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdCreate.
     * @param value value to set the  UsrIdCreate
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdCreateDt.
     * @return the UsrIdCreateDt
     */
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdCreateDt.
     * @param value value to set the  UsrIdCreateDt
     */
    public void setUsrIdCreateDt(Timestamp value) {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdMod.
     * @return the UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdMod.
     * @param value value to set the  UsrIdMod
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute UsrIdModDt.
     * @return the UsrIdModDt
     */
    public Timestamp getUsrIdModDt() {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UsrIdModDt.
     * @param value value to set the  UsrIdModDt
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoClose.
     * @return the SoClose
     */
    public String getSoClose() {
        return (String) getAttributeInternal(SOCLOSE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoClose.
     * @param value value to set the  SoClose
     */
    public void setSoClose(String value) {
        setAttributeInternal(SOCLOSE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EntityId.
     * @return the EntityId
     */
    public Integer getEntityId() {
        return (Integer) getAttributeInternal(ENTITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EntityId.
     * @param value value to set the  EntityId
     */
    public void setEntityId(Integer value) {
        setAttributeInternal(ENTITYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SoBasis.
     * @return the SoBasis
     */
    public Integer getSoBasis() {
        return (Integer) getAttributeInternal(SOBASIS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SoBasis.
     * @param value value to set the  SoBasis
     */
    public void setSoBasis(Integer value) {
        setAttributeInternal(SOBASIS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TranCountItem.
     * @return the TranCountItem
     */
    public String getTranCountItem() {
        //return (String) getAttributeInternal(TRANCOUNTITEM);
       // getMmSoItm().setRangeSize(-1);
      //  System.out.println("--COUNT--"+(getMmSoItm().getAllRowsInRange().length));
      //  Integer s=(Integer)getMmSoItm().getAllRowsInRange().length;
        /*
         SuggestedOrderAMImpl applicationModule = (SuggestedOrderAMImpl)this.getApplicationModule();
         ViewObjectImpl vo=applicationModule.getMmSoItmVO1();
         System.out.println("Doc : "+getDocId());
         Row r[]=vo.getFilteredRows("DocId",getDocId());
        */ 
        Integer ival=0;
        RowIterator rs= getMmSoItm();
        ival=rs.getRowCount();
        return ival.toString();
       
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TranCountItem.
     * @param value value to set the  TranCountItem
     */
    public void setTranCountItem(String value) {
        setAttributeInternal(TRANCOUNTITEM, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link MmSoItm.
     */
    public RowIterator getMmSoItm() {
        return (RowIterator)getAttributeInternal(MMSOITM);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ViewSuggOrdLOV1.
     */
    public RowSet getViewSuggOrdLOV1() {
        return (RowSet)getAttributeInternal(VIEWSUGGORDLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ViewUsrLov1.
     */
    public RowSet getViewUsrLov1() {
        return (RowSet)getAttributeInternal(VIEWUSRLOV1);
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
