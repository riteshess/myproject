package mmsupplierperfeval.model.views;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import mmsupplierperfeval.model.entities.MmEoPerfEvalEOImpl;

import mmsupplierperfeval.model.service.MmSupplierPerfEvalAMImpl;

import oracle.jbo.JboException;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Dec 10 19:20:07 IST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmEoPerfEvalVORowImpl extends ViewRowImpl {


    public static final int ENTITY_MMEOPERFEVALEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EntityId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getEntityId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setEntityId((Integer)value);
            }
        }
        ,
        EoId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getEoId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setEoId((Integer)value);
            }
        }
        ,
        CldId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        EvalId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getEvalId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setEvalId((String)value);
            }
        }
        ,
        OrgId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        ParamId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getParamId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setParamId((String)value);
            }
        }
        ,
        PerfRate {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getPerfRate();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setPerfRate((Number)value);
            }
        }
        ,
        PerfScore {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getPerfScore();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setPerfScore((Number)value);
            }
        }
        ,
        SlocId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setUsrIdCreateDt((Date)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setUsrIdModDt((Date)value);
            }
        }
        ,
        ParamSetId {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getParamSetId();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setParamSetId((String)value);
            }
        }
        ,
        Position {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getPosition();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setPosition((String)value);
            }
        }
        ,
        Score {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getScore();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setScore((String)value);
            }
        }
        ,
        TransSetUpid {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getTransSetUpid();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setTransSetUpid((String)value);
            }
        }
        ,
        TransIsValidRate {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getTransIsValidRate();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setTransIsValidRate((String)value);
            }
        }
        ,
        SupplierLOV {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getSupplierLOV();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrganisationVO1 {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getOrganisationVO1();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MmEvalParamVO1 {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getMmEvalParamVO1();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        UserLOV1 {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getUserLOV1();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ParamSetLOV1 {
            public Object get(MmEoPerfEvalVORowImpl obj) {
                return obj.getParamSetLOV1();
            }

            public void put(MmEoPerfEvalVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmEoPerfEvalVORowImpl object);

        public abstract void put(MmEoPerfEvalVORowImpl object, Object value);

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


    public static final int ENTITYID = AttributesEnum.EntityId.index();
    public static final int EOID = AttributesEnum.EoId.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int EVALID = AttributesEnum.EvalId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PARAMID = AttributesEnum.ParamId.index();
    public static final int PERFRATE = AttributesEnum.PerfRate.index();
    public static final int PERFSCORE = AttributesEnum.PerfScore.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int PARAMSETID = AttributesEnum.ParamSetId.index();
    public static final int POSITION = AttributesEnum.Position.index();
    public static final int SCORE = AttributesEnum.Score.index();
    public static final int TRANSSETUPID = AttributesEnum.TransSetUpid.index();
    public static final int TRANSISVALIDRATE = AttributesEnum.TransIsValidRate.index();
    public static final int SUPPLIERLOV = AttributesEnum.SupplierLOV.index();
    public static final int ORGANISATIONVO1 = AttributesEnum.OrganisationVO1.index();
    public static final int MMEVALPARAMVO1 = AttributesEnum.MmEvalParamVO1.index();
    public static final int USERLOV1 = AttributesEnum.UserLOV1.index();
    public static final int PARAMSETLOV1 = AttributesEnum.ParamSetLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmEoPerfEvalVORowImpl() {
    }

    /**
     * Gets MmEoPerfEvalEO entity object.
     * @return the MmEoPerfEvalEO
     */
    public MmEoPerfEvalEOImpl getMmEoPerfEvalEO() {
        return (MmEoPerfEvalEOImpl)getEntity(ENTITY_MMEOPERFEVALEO);
    }

    /**
     * Gets the attribute value for ENTITY_ID using the alias name EntityId.
     * @return the ENTITY_ID
     */
    public Integer getEntityId() {
        return (Integer) getAttributeInternal(ENTITYID);
    }

    /**
     * Sets <code>value</code> as attribute value for ENTITY_ID using the alias name EntityId.
     * @param value value to set the ENTITY_ID
     */
    public void setEntityId(Integer value) {
        setAttributeInternal(ENTITYID, value);
    }

    /**
     * Gets the attribute value for EO_ID using the alias name EoId.
     * @return the EO_ID
     */
    public Integer getEoId() {
        return (Integer) getAttributeInternal(EOID);
    }

    /**
     * Sets <code>value</code> as attribute value for EO_ID using the alias name EoId.
     * @param value value to set the EO_ID
     */
    public void setEoId(Integer value) {
        setAttributeInternal(EOID, value);
    }

    /**
     * Gets the attribute value for EVAL_ID using the alias name EvalId.
     * @return the EVAL_ID
     */
    public String getEvalId() {
        return (String) getAttributeInternal(EVALID);
    }

    /**
     * Sets <code>value</code> as attribute value for EVAL_ID using the alias name EvalId.
     * @param value value to set the EVAL_ID
     */
    public void setEvalId(String value) {
        setAttributeInternal(EVALID, value);
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
     * Gets the attribute value for PARAM_ID using the alias name ParamId.
     * @return the PARAM_ID
     */
    public String getParamId() {
        return (String) getAttributeInternal(PARAMID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_ID using the alias name ParamId.
     * @param value value to set the PARAM_ID
     */
    public void setParamId(String value) {
        setAttributeInternal(PARAMID, value);
    }

    /**
     * Gets the attribute value for PERF_RATE using the alias name PerfRate.
     * @return the PERF_RATE
     */
    public Number getPerfRate() {
        return (Number) getAttributeInternal(PERFRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for PERF_RATE using the alias name PerfRate.
     * @param value value to set the PERF_RATE
     */
    public void setPerfRate(Number value) {
        setAttributeInternal(PERFRATE, value);
    }

    /**
     * Gets the attribute value for PERF_SCORE using the alias name PerfScore.
     * @return the PERF_SCORE
     */
    public Number getPerfScore() {
        return (Number) getAttributeInternal(PERFSCORE);
    }

    /**
     * Sets <code>value</code> as attribute value for PERF_SCORE using the alias name PerfScore.
     * @param value value to set the PERF_SCORE
     */
    public void setPerfScore(Number value) {
        setAttributeInternal(PERFSCORE, value);
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
    public Date getUsrIdCreateDt() {
        return (Date) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @param value value to set the USR_ID_CREATE_DT
     */
    public void setUsrIdCreateDt(Date value) {
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
    public Date getUsrIdModDt() {
        return (Date) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @param value value to set the USR_ID_MOD_DT
     */
    public void setUsrIdModDt(Date value) {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for PARAM_SET_ID using the alias name ParamSetId.
     * @return the PARAM_SET_ID
     */
    public String getParamSetId() {
        return (String) getAttributeInternal(PARAMSETID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_SET_ID using the alias name ParamSetId.
     * @param value value to set the PARAM_SET_ID
     */
    public void setParamSetId(String value) {
        setAttributeInternal(PARAMSETID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Position.
     * @return the Position
     */
    public String getPosition() {
        return (String) getAttributeInternal(POSITION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Position.
     * @param value value to set the  Position
     */
    public void setPosition(String value) {
        setAttributeInternal(POSITION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Score.
     * @return the Score
     */
    public String getScore() {
        return (String) getAttributeInternal(SCORE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Score.
     * @param value value to set the  Score
     */
    public void setScore(String value) {
        setAttributeInternal(SCORE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSetUpid.
     * @return the TransSetUpid
     */
    public String getTransSetUpid() {
        return (String) getAttributeInternal(TRANSSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSetUpid.
     * @param value value to set the  TransSetUpid
     */
    public void setTransSetUpid(String value) {
        setAttributeInternal(TRANSSETUPID, value);
    }
   
   
    private static int INTEGER = Types.NUMERIC;
   
   
    /**
     * Gets the attribute value for the calculated attribute TransIsValidRate.
     * @return the TransIsValidRate
     */
    public String getTransIsValidRate() {
       String valid="Y";
        if(getParamSetId()!=null){
        BigDecimal min =
            (BigDecimal)callStoredFunction(INTEGER, "MM.PKG_MM_EVAL.GET_MIN_RATE(?,?,?,?)", new Object[] { getSlocId(),getCldId(), getOrgId(),
                                                                                                        getParamSetId() });
            BigDecimal max =
               (BigDecimal)callStoredFunction(INTEGER, "MM.PKG_MM_EVAL.GET_MAX_RATE(?,?,?,?)", new Object[] { getSlocId(),getCldId(), getOrgId(),
                                                                                                        getParamSetId() });
            
            Number rate=new Number(0);
        if(getPerfRate()!=null)
        {
             rate=getPerfRate();
            if(rate.compareTo(min)>=0 && rate.compareTo(max)<=0)
                valid="Y";
            else
                valid="N";
            }
        else
            valid="N";
        }
        return valid;
       // return (String) getAttributeInternal(TRANSISVALIDRATE);
    }
   
   
   
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;
        try {
            MmSupplierPerfEvalAMImpl am = (MmSupplierPerfEvalAMImpl)resolvElDC("MmSupplierPerfEvalAMDataControl");
            // 1. Create a JDBC CallabledStatement
            st = am.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
            // 2. Register the first bind variable for the return value
            st.registerOutParameter(1, sqlReturnType);
            if (bindVars != null) {
                // 3. Loop over values for the bind variables passed in, if any
                for (int z = 0; z < bindVars.length; z++) {
                    // 4. Set the value of user-supplied bind vars in the stmt
                    st.setObject(z + 2, bindVars[z]);
                }
            }
            // 5. Set the value of user-supplied bind vars in the stmt
            st.executeUpdate();
            // 6. Return the value of the first bind variable
            return st.getObject(1);
        } catch (SQLException e) {
            throw new JboException(e);
        } finally {
            if (st != null) {
                try {
                    // 7. Close the statement
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    public Object resolvElDC(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, "#{data." + data + ".dataProvider}", Object.class);
        return valueExp.getValue(elContext);
    }
    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransIsValidRate.
     * @param value value to set the  TransIsValidRate
     */
    public void setTransIsValidRate(String value) {
        setAttributeInternal(TRANSISVALIDRATE, value);
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
     * Gets the view accessor <code>RowSet</code> SupplierLOV.
     */
    public RowSet getSupplierLOV() {
        return (RowSet)getAttributeInternal(SUPPLIERLOV);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OrganisationVO1.
     */
    public RowSet getOrganisationVO1() {
        return (RowSet)getAttributeInternal(ORGANISATIONVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> MmEvalParamVO1.
     */
    public RowSet getMmEvalParamVO1() {
        return (RowSet)getAttributeInternal(MMEVALPARAMVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> UserLOV1.
     */
    public RowSet getUserLOV1() {
        return (RowSet)getAttributeInternal(USERLOV1);
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
