package mmsoctktakeapp.model.view;

import mmsoctktakeapp.model.entity.MmStkTakeEOImpl;


import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 07 14:26:32 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmStkTakeVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MMSTKTAKEEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        AuthStat {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getAuthStat();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAuthStat((String)value);
            }
        }
        ,
        CldId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        DocDt {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getDocDt();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setDocDt((Timestamp)value);
            }
        }
        ,
        DocId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        FyId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getFyId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setFyId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        StkTakeDt {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakeDt();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setStkTakeDt((Timestamp)value);
            }
        }
        ,
        StkTakeNo {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakeNo();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setStkTakeNo((String)value);
            }
        }
        ,
        StkTakePrfId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakePrfId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setStkTakePrfId((String)value);
            }
        }
        ,
        StkTakeStat {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakeStat();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setStkTakeStat((Integer)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ,
        TransStkTakePrfDesc {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getTransStkTakePrfDesc();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setTransStkTakePrfDesc((String)value);
            }
        }
        ,
        StkTakeCriteria {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakeCriteria();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setStkTakeCriteria((Integer)value);
            }
        }
        ,
        TransWhId {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getTransWhId();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setTransWhId((String)value);
            }
        }
        ,
        TransStkTakeStat {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getTransStkTakeStat();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setTransStkTakeStat((Integer)value);
            }
        }
        ,
        MmStkTakeItm {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getMmStkTakeItm();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrganisationVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getOrganisationVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        StkTakePrfVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakePrfVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        StkTakeStatusVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakeStatusVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        WarehouseVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getWarehouseVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        StkTakePrfCriteriaVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getStkTakePrfCriteriaVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVUsrIdVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getLOVUsrIdVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DistinctWhVO {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getDistinctWhVO();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovWarehouseForSearchVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getLovWarehouseForSearchVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        TransDistinctItemVO1 {
            public Object get(MmStkTakeVORowImpl obj) {
                return obj.getTransDistinctItemVO1();
            }

            public void put(MmStkTakeVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmStkTakeVORowImpl object);

        public abstract void put(MmStkTakeVORowImpl object, Object value);

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


    public static final int AUTHSTAT = AttributesEnum.AuthStat.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int STKTAKEDT = AttributesEnum.StkTakeDt.index();
    public static final int STKTAKENO = AttributesEnum.StkTakeNo.index();
    public static final int STKTAKEPRFID = AttributesEnum.StkTakePrfId.index();
    public static final int STKTAKESTAT = AttributesEnum.StkTakeStat.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int TRANSSTKTAKEPRFDESC = AttributesEnum.TransStkTakePrfDesc.index();
    public static final int STKTAKECRITERIA = AttributesEnum.StkTakeCriteria.index();
    public static final int TRANSWHID = AttributesEnum.TransWhId.index();
    public static final int TRANSSTKTAKESTAT = AttributesEnum.TransStkTakeStat.index();
    public static final int MMSTKTAKEITM = AttributesEnum.MmStkTakeItm.index();
    public static final int ORGANISATIONVO1 = AttributesEnum.OrganisationVO1.index();
    public static final int STKTAKEPRFVO1 = AttributesEnum.StkTakePrfVO1.index();
    public static final int STKTAKESTATUSVO1 = AttributesEnum.StkTakeStatusVO1.index();
    public static final int WAREHOUSEVO1 = AttributesEnum.WarehouseVO1.index();
    public static final int STKTAKEPRFCRITERIAVO1 = AttributesEnum.StkTakePrfCriteriaVO1.index();
    public static final int LOVUSRIDVO1 = AttributesEnum.LOVUsrIdVO1.index();
    public static final int DISTINCTWHVO = AttributesEnum.DistinctWhVO.index();
    public static final int LOVWAREHOUSEFORSEARCHVO1 = AttributesEnum.LovWarehouseForSearchVO1.index();
    public static final int TRANSDISTINCTITEMVO1 = AttributesEnum.TransDistinctItemVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmStkTakeVORowImpl() {
    }

    /**
     * Gets MmStkTakeEO entity object.
     * @return the MmStkTakeEO
     */
    public MmStkTakeEOImpl getMmStkTakeEO() {
        return (MmStkTakeEOImpl)getEntity(ENTITY_MMSTKTAKEEO);
    }

    /**
     * Gets the attribute value for AUTH_STAT using the alias name AuthStat.
     * @return the AUTH_STAT
     */
    public String getAuthStat() {
        return (String) getAttributeInternal(AUTHSTAT);
    }

    /**
     * Sets <code>value</code> as attribute value for AUTH_STAT using the alias name AuthStat.
     * @param value value to set the AUTH_STAT
     */
    public void setAuthStat(String value) {
        setAttributeInternal(AUTHSTAT, value);
    }

    /**
     * Gets the attribute value for CLD_ID using the alias name CldId.
     * @return the CLD_ID
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for CLD_ID using the alias name CldId.
     * @param value value to set the CLD_ID
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for DOC_DT using the alias name DocDt.
     * @return the DOC_DT
     */
    public Timestamp getDocDt() {
        return (Timestamp) getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_DT using the alias name DocDt.
     * @param value value to set the DOC_DT
     */
    public void setDocDt(Timestamp value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for DOC_ID using the alias name DocId.
     * @return the DOC_ID
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_ID using the alias name DocId.
     * @param value value to set the DOC_ID
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for FY_ID using the alias name FyId.
     * @return the FY_ID
     */
    public Integer getFyId() {
        return (Integer) getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as attribute value for FY_ID using the alias name FyId.
     * @param value value to set the FY_ID
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for SLOC_ID using the alias name SlocId.
     * @return the SLOC_ID
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for SLOC_ID using the alias name SlocId.
     * @param value value to set the SLOC_ID
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for STK_TAKE_DT using the alias name StkTakeDt.
     * @return the STK_TAKE_DT
     */
    public Timestamp getStkTakeDt() {
        return (Timestamp) getAttributeInternal(STKTAKEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for STK_TAKE_DT using the alias name StkTakeDt.
     * @param value value to set the STK_TAKE_DT
     */
    public void setStkTakeDt(Timestamp value) {
        setAttributeInternal(STKTAKEDT, value);
    }

    /**
     * Gets the attribute value for STK_TAKE_NO using the alias name StkTakeNo.
     * @return the STK_TAKE_NO
     */
    public String getStkTakeNo() {
        return (String) getAttributeInternal(STKTAKENO);
    }

    /**
     * Sets <code>value</code> as attribute value for STK_TAKE_NO using the alias name StkTakeNo.
     * @param value value to set the STK_TAKE_NO
     */
    public void setStkTakeNo(String value) {
        setAttributeInternal(STKTAKENO, value);
    }

    /**
     * Gets the attribute value for STK_TAKE_PRF_ID using the alias name StkTakePrfId.
     * @return the STK_TAKE_PRF_ID
     */
    public String getStkTakePrfId() {
        return (String) getAttributeInternal(STKTAKEPRFID);
    }

    /**
     * Sets <code>value</code> as attribute value for STK_TAKE_PRF_ID using the alias name StkTakePrfId.
     * @param value value to set the STK_TAKE_PRF_ID
     */
    public void setStkTakePrfId(String value) {
        setAttributeInternal(STKTAKEPRFID, value);
    }

    /**
     * Gets the attribute value for STK_TAKE_STAT using the alias name StkTakeStat.
     * @return the STK_TAKE_STAT
     */
    public Integer getStkTakeStat() {
        return (Integer) getAttributeInternal(STKTAKESTAT);
    }

    /**
     * Sets <code>value</code> as attribute value for STK_TAKE_STAT using the alias name StkTakeStat.
     * @param value value to set the STK_TAKE_STAT
     */
    public void setStkTakeStat(Integer value) {
        setAttributeInternal(STKTAKESTAT, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @return the USR_ID_CREATE
     */
    public Integer getUsrIdCreate() {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @param value value to set the USR_ID_CREATE
     */
    public void setUsrIdCreate(Integer value) {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @return the USR_ID_CREATE_DT
     */
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @param value value to set the USR_ID_CREATE_DT
     */
    public void setUsrIdCreateDt(Timestamp value) {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @return the USR_ID_MOD
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @param value value to set the USR_ID_MOD
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @return the USR_ID_MOD_DT
     */
    public Timestamp getUsrIdModDt() {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @param value value to set the USR_ID_MOD_DT
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransStkTakePrfDesc.
     * @return the TransStkTakePrfDesc
     */
    public String getTransStkTakePrfDesc() {
        String name = null;
        //System.out.println("PrfId="+getStkTakePrfId());
        Row rows[] = getStkTakePrfVO1().getFilteredRows("PrfId",getStkTakePrfId());
        if (rows.length > 0) {
            if (rows[0].getAttribute("PrfNm") != null) {
                name = rows[0].getAttribute("PrfNm").toString();
            }
        }
        if (name != null) {
            return name;
        } else {
            return (String) getAttributeInternal(TRANSSTKTAKEPRFDESC);
        }
        
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStkTakePrfDesc.
     * @param value value to set the  TransStkTakePrfDesc
     */
    public void setTransStkTakePrfDesc(String value) {
        setAttributeInternal(TRANSSTKTAKEPRFDESC, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StkTakeCriteria.
     * @return the StkTakeCriteria
     */
    public Integer getStkTakeCriteria() {
        Integer cr = null;
        Row rows[] = getStkTakePrfVO1().getFilteredRows("PrfId",getStkTakePrfId());
        if (rows.length > 0) {
            if (rows[0].getAttribute("MtlSelCrt") != null) {
                cr = Integer.parseInt(rows[0].getAttribute("MtlSelCrt").toString());
            }
        }
        if (cr != null) {
            return cr;
        } else {
            return (Integer) getAttributeInternal(STKTAKECRITERIA);
        }
        
       
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StkTakeCriteria.
     * @param value value to set the  StkTakeCriteria
     */
    public void setStkTakeCriteria(Integer value) {
        setAttributeInternal(STKTAKECRITERIA, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransWhId.
     * @return the TransWhId
     */
    public String getTransWhId() {
        return (String) getAttributeInternal(TRANSWHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransWhId.
     * @param value value to set the  TransWhId
     */
    public void setTransWhId(String value) {
        setAttributeInternal(TRANSWHID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransStkTakeStat.
     * @return the TransStkTakeStat
     */
    public Integer getTransStkTakeStat() {
        return getStkTakeStat();
       // return (String) getAttributeInternal(TRANSSTKTAKESTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransStkTakeStat.
     * @param value value to set the  TransStkTakeStat
     */
    public void setTransStkTakeStat(Integer value) {
        setAttributeInternal(TRANSSTKTAKESTAT, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link MmStkTakeItm.
     */
    public RowIterator getMmStkTakeItm() {
        return (RowIterator)getAttributeInternal(MMSTKTAKEITM);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OrganisationVO1.
     */
    public RowSet getOrganisationVO1() {
        return (RowSet)getAttributeInternal(ORGANISATIONVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StkTakePrfVO1.
     */
    public RowSet getStkTakePrfVO1() {
        return (RowSet)getAttributeInternal(STKTAKEPRFVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StkTakeStatusVO1.
     */
    public RowSet getStkTakeStatusVO1() {
        return (RowSet)getAttributeInternal(STKTAKESTATUSVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> WarehouseVO1.
     */
    public RowSet getWarehouseVO1() {
        return (RowSet)getAttributeInternal(WAREHOUSEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> StkTakePrfCriteriaVO1.
     */
    public RowSet getStkTakePrfCriteriaVO1() {
        return (RowSet)getAttributeInternal(STKTAKEPRFCRITERIAVO1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> LOVUsrIdVO1.
     */
    public RowSet getLOVUsrIdVO1() {
        return (RowSet)getAttributeInternal(LOVUSRIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DistinctWhVO.
     */
    public RowSet getDistinctWhVO() {
        return (RowSet)getAttributeInternal(DISTINCTWHVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovWarehouseForSearchVO1.
     */
    public RowSet getLovWarehouseForSearchVO1() {
        return (RowSet)getAttributeInternal(LOVWAREHOUSEFORSEARCHVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> TransDistinctItemVO1.
     */
    public RowSet getTransDistinctItemVO1() {
        return (RowSet)getAttributeInternal(TRANSDISTINCTITEMVO1);
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
