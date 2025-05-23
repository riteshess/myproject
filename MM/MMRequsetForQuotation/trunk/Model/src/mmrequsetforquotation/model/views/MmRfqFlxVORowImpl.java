package mmrequsetforquotation.model.views;

import java.sql.Timestamp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import mmrequsetforquotation.model.services.mmRfqAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Jul 30 14:28:51 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmRfqFlxVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MMRFQFLXEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setCldId((String) value);
            }
        }
        ,
        SlocId {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setSlocId((Integer) value);
            }
        }
        ,
        OrgId {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setOrgId((String) value);
            }
        }
        ,
        DocId {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setDocId((String) value);
            }
        }
        ,
        FldId {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getFldId();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setFldId((String) value);
            }
        }
        ,
        FldVal {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getFldVal();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setFldVal((String) value);
            }
        }
        ,
        TransFldValDate {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldValDate();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldValDate((Timestamp) value);
            }
        }
        ,
        TransFldValString {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldValString();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldValString((String) value);
            }
        }
        ,
        TransFldValBool {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldValBool();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldValBool((String) value);
            }
        }
        ,
        TransFldValNum {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldValNum();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldValNum((Number) value);
            }
        }
        ,
        TransFldType {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldType();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldType((Integer) value);
            }
        }
        ,
        TransFldReq {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldReq();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldReq((String) value);
            }
        }
        ,
        TransFldLen {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldLen();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldLen((Long) value);
            }
        }
        ,
        TransFldValLOV {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFldValLOV();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFldValLOV((String) value);
            }
        }
        ,
        TransHasLOV {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransHasLOV();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransHasLOV((String) value);
            }
        }
        ,
        TransLovVal {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransLovVal();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransLovVal((String) value);
            }
        }
        ,
        TransFlxLov {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getTransFlxLov();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setTransFlxLov((String) value);
            }
        }
        ,
        LovFlexiFieldVO1 {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getLovFlexiFieldVO1();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LOVFlxFiledColumnVO1 {
            public Object get(MmRfqFlxVORowImpl obj) {
                return obj.getLOVFlxFiledColumnVO1();
            }

            public void put(MmRfqFlxVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public abstract Object get(MmRfqFlxVORowImpl object);

        public abstract void put(MmRfqFlxVORowImpl object, Object value);

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
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int FLDID = AttributesEnum.FldId.index();
    public static final int FLDVAL = AttributesEnum.FldVal.index();
    public static final int TRANSFLDVALDATE = AttributesEnum.TransFldValDate.index();
    public static final int TRANSFLDVALSTRING = AttributesEnum.TransFldValString.index();
    public static final int TRANSFLDVALBOOL = AttributesEnum.TransFldValBool.index();
    public static final int TRANSFLDVALNUM = AttributesEnum.TransFldValNum.index();
    public static final int TRANSFLDTYPE = AttributesEnum.TransFldType.index();
    public static final int TRANSFLDREQ = AttributesEnum.TransFldReq.index();
    public static final int TRANSFLDLEN = AttributesEnum.TransFldLen.index();
    public static final int TRANSFLDVALLOV = AttributesEnum.TransFldValLOV.index();
    public static final int TRANSHASLOV = AttributesEnum.TransHasLOV.index();
    public static final int TRANSLOVVAL = AttributesEnum.TransLovVal.index();
    public static final int TRANSFLXLOV = AttributesEnum.TransFlxLov.index();
    public static final int LOVFLEXIFIELDVO1 = AttributesEnum.LovFlexiFieldVO1.index();
    public static final int LOVFLXFILEDCOLUMNVO1 = AttributesEnum.LOVFlxFiledColumnVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmRfqFlxVORowImpl() {
    }

    /**
     * Gets MmRfqFlxEO entity object.
     * @return the MmRfqFlxEO
     */
    public EntityImpl getMmRfqFlxEO() {
        return (EntityImpl) getEntity(ENTITY_MMRFQFLXEO);
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
     * Gets the attribute value for FLD_ID using the alias name FldId.
     * @return the FLD_ID
     */
    public String getFldId() {
        return (String) getAttributeInternal(FLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for FLD_ID using the alias name FldId.
     * @param value value to set the FLD_ID
     */
    public void setFldId(String value) {
        setAttributeInternal(FLDID, value);
    }

    /**
     * Gets the attribute value for FLD_VAL using the alias name FldVal.
     * @return the FLD_VAL
     */
    public String getFldVal() {
        return (String) getAttributeInternal(FLDVAL);
    }

    /**
     * Sets <code>value</code> as attribute value for FLD_VAL using the alias name FldVal.
     * @param value value to set the FLD_VAL
     */
    public void setFldVal(String value) {
        System.out.println("Setter is called !!");
        setAttributeInternal(FLDVAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldValDate.
     * @return the TransFldValDate
     */
    public Timestamp getTransFldValDate() {
        if (getFldVal() != null && getTransFldType().compareTo(756) == 0) {
            try {
                final String OLD_FORMAT = "dd-MM-yyyy HH:mm:ss";
                final String NEW_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
                String oldDateString = getFldVal();
                String newDateString;
                System.out.println("inside getter date is-->" + oldDateString);
                DateFormat formatter = new SimpleDateFormat(OLD_FORMAT);
                Date d = formatter.parse(oldDateString);
                System.out.println("inside getter old date is --->" + d);
                ((SimpleDateFormat) formatter).applyPattern(NEW_FORMAT);
                newDateString = formatter.format(d);
                System.out.println("inside geter new date is--->" + newDateString);

                Timestamp ts = Timestamp.valueOf(newDateString);
                //  System.out.println(ts);
                return (ts);
            } catch (Exception e) {
                // System.out.println("Exception  occured:::" + e);
            }
        }
        return (Timestamp) getAttributeInternal(TRANSFLDVALDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldValDate.
     * @param value value to set the  TransFldValDate
     */
    public void setTransFldValDate(Timestamp value) {
        if (value != null) {
            System.out.println("date value inside setter--->" + value);
            final String ui_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
            final String db_FORMAT = "dd-MM-yyyy HH:mm:ss";
            DateFormat formatter = new SimpleDateFormat(ui_FORMAT);
            Date d = null;
            try {
                d = formatter.parse(value.toString());
                System.out.println("formated date --" + d);
            } catch (ParseException e) {
                System.out.println("exception in date setter---" + e);
            }

            ((SimpleDateFormat) formatter).applyPattern(db_FORMAT);
            String dt = formatter.format(d);
            System.out.println("date in db format is --" + dt);
            // Timestamp ts = Timestamp.valueOf(dt);
            // String date = ts.toString();
            // System.out.println("date will be set--" + date);
            setFldVal(dt);
        } else {
            this.setFldVal(null);
        }
        setAttributeInternal(TRANSFLDVALDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldValString.
     * @return the TransFldValString
     */
    public String getTransFldValString() {
        if (getFldVal() != null && getTransFldType().compareTo(757) == 0) {
            return (getFldVal());
        }
        return (String) getAttributeInternal(TRANSFLDVALSTRING);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldValString.
     * @param value value to set the  TransFldValString
     */
    public void setTransFldValString(String value) {
        if (value != null) {
            setFldVal(value);
        } else {
            this.setFldVal(null);
        }
        setAttributeInternal(TRANSFLDVALSTRING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldValBool.
     * @return the TransFldValBool
     */
    public String getTransFldValBool() {
        if (getFldVal() != null && getTransFldType().compareTo(759) == 0) {
            return (getFldVal());
        }
        return (String) getAttributeInternal(TRANSFLDVALBOOL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldValBool.
     * @param value value to set the  TransFldValBool
     */
    public void setTransFldValBool(String value) {
        if (value != null) {
            System.out.println("Value of Boll::" + value);
            setFldVal(value);
        } else {
            this.setFldVal(null);
        }
        setAttributeInternal(TRANSFLDVALBOOL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldValNum.
     * @return the TransFldValNum
     */
    public Number getTransFldValNum() {
        Number val = new Number(0);
        if (getFldVal() != null && getTransFldType().compareTo(758) == 0) {
            try {
                val = new Number(getFldVal());
            } catch (Exception e) {
                System.out.println("Exception  occured::" + e);
            }
            return (val);
        }
        return (Number) getAttributeInternal(TRANSFLDVALNUM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldValNum.
     * @param value value to set the  TransFldValNum
     */
    public void setTransFldValNum(Number value) {
        if (value != null) {
            String num = value.toString();
            setFldVal(num);
        } else {
            this.setFldVal(null);
        }
        setAttributeInternal(TRANSFLDVALNUM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldType.
     * @return the TransFldType
     */
    public Integer getTransFldType() {
        mmRfqAMImpl am = (mmRfqAMImpl) this.getApplicationModule();
        if (getFldId() != null) {
            //System.out.println("Value of fldid id:::" + getFldId());
            ViewObjectImpl fld = am.getLovFlexiFlds1();
            fld.setNamedWhereClauseParam("bindCldId", getCldId());
            fld.setNamedWhereClauseParam("bindDocId", new Number(18502));
            fld.executeQuery();
            Row rr[] = fld.getFilteredRows("FldId", getFldId());
            if (rr.length > 0) {
                Integer type = (Integer) rr[0].getAttribute("DataType");
                // System.out.println("value of type::" + type);
                return type;
            }
        }
        return (Integer) getAttributeInternal(TRANSFLDTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldType.
     * @param value value to set the  TransFldType
     */
    public void setTransFldType(Integer value) {
        setAttributeInternal(TRANSFLDTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldReq.
     * @return the TransFldReq
     */
    public String getTransFldReq() {
        mmRfqAMImpl am = (mmRfqAMImpl) this.getApplicationModule();
        if (getFldId() != null) {
            //System.out.println("Value of fldid id:::" + getFldId());
            ViewObjectImpl fld = am.getLovFlexiFlds1();
            fld.setNamedWhereClauseParam("bindCldId", getCldId());
            fld.setNamedWhereClauseParam("bindDocId", new Number(18502));
            fld.executeQuery();
            Row rr[] = fld.getFilteredRows("FldId", getFldId());
            if (rr.length > 0) {
                String req = (String) rr[0].getAttribute("Reqd");
                // System.out.println("value of type::" + type);
                return req;
            }
        }
        return (String) getAttributeInternal(TRANSFLDREQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldReq.
     * @param value value to set the  TransFldReq
     */
    public void setTransFldReq(String value) {
        setAttributeInternal(TRANSFLDREQ, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldLen.
     * @return the TransFldLen
     */
    public Long getTransFldLen() {
        mmRfqAMImpl am = (mmRfqAMImpl) this.getApplicationModule();
        if (getFldId() != null) {
            //System.out.println("Value of fldid id:::" + getFldId());
            ViewObjectImpl fld = am.getLovFlexiFlds1();
            fld.setNamedWhereClauseParam("bindCldId", getCldId());
            fld.setNamedWhereClauseParam("bindDocId", new Integer(18502));
            fld.executeQuery();
            Row rr[] = fld.getFilteredRows("FldId", getFldId());
            if (rr.length > 0) {
                Long len = (Long) rr[0].getAttribute("DataLen");
                // System.out.println("value of type::" + type);
                return len;
            }
        }
        return (Long) getAttributeInternal(TRANSFLDLEN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldLen.
     * @param value value to set the  TransFldLen
     */
    public void setTransFldLen(Long value) {
        setAttributeInternal(TRANSFLDLEN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFldValLOV.
     * @return the TransFldValLOV
     */
    public String getTransFldValLOV() {
        System.out.println(getFldId()+" getTransHasLOV() "+getTransHasLOV());
        if(getTransHasLOV().equalsIgnoreCase("Y")){
            System.out.println(getFldId()+" getFldVal() "+getFldVal());
            return  getFldVal();
        }
        /*  String s = "";
        if (getFldVal() != null) {
            try {
                s = getFldVal().toString();
            } catch (Exception e) {
                System.out.println("Exception  occured::" + e);
            }
            return (s);
        } */
        return (String) getAttributeInternal(TRANSFLDVALLOV);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFldValLOV.
     * @param value value to set the  TransFldValLOV
     */
    public void setTransFldValLOV(String value) {
        /*  if (value != null) {
            String num = value.toString();
            setFldVal(num);
        } else {
            this.setFldVal(null);
        } */
        System.out.println("new value is "+value);
        if(value!=null){
            setFldVal(value);
        }
        setAttributeInternal(TRANSFLDVALLOV, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHasLOV.
     * @return the TransHasLOV
     */
    public String getTransHasLOV() {
        mmRfqAMImpl am = (mmRfqAMImpl) this.getApplicationModule();
        if (getFldId() != null) {
            //System.out.println("Value of fldid id:::" + getFldId());
            ViewObjectImpl fld = am.getLovFlexiFlds1();
            fld.setNamedWhereClauseParam("bindCldId", getCldId());
            fld.setNamedWhereClauseParam("bindDocId", new Integer(18502));
            fld.executeQuery();
            Row rr[] = fld.getFilteredRows("FldId", getFldId());
            if (rr.length > 0) {
                Object ob = rr[0].getAttribute("HsLov");
                if (ob != null) {
                    return ob.toString();
                }
                return "N";
                // System.out.println("value of type::" + type);
            }
        }
        return (String) getAttributeInternal(TRANSHASLOV);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHasLOV.
     * @param value value to set the  TransHasLOV
     */
    public void setTransHasLOV(String value) {
        setAttributeInternal(TRANSHASLOV, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransLovVal.
     * @return the TransLovVal
     */
    public String getTransLovVal() {
        return (String) getAttributeInternal(TRANSLOVVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransLovVal.
     * @param value value to set the  TransLovVal
     */
    public void setTransLovVal(String value) {
        setAttributeInternal(TRANSLOVVAL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransFlxLov.
     * @return the TransFlxLov
     */
    public String getTransFlxLov() {
        if(getTransHasLOV().equalsIgnoreCase("Y")){
            return  getFldVal();
        }
        return (String) getAttributeInternal(TRANSFLXLOV);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransFlxLov.
     * @param value value to set the  TransFlxLov
     */
    public void setTransFlxLov(String value) {
        System.out.println("new value is "+value);
        if(value!=null){
            setFldVal(value);
        }
        setAttributeInternal(TRANSFLXLOV, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovFlexiFieldVO1.
     */
    public RowSet getLovFlexiFieldVO1() {
        return (RowSet) getAttributeInternal(LOVFLEXIFIELDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVFlxFiledColumnVO1.
     */
    public RowSet getLOVFlxFiledColumnVO1() {
        return (RowSet) getAttributeInternal(LOVFLXFILEDCOLUMNVO1);
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

