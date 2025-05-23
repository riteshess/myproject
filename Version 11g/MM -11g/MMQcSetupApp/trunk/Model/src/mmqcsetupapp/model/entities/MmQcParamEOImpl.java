package mmqcsetupapp.model.entities;


import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import mmqcsetupapp.model.service.QcSetupAMImpl;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 06 15:23:28 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MmQcParamEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CldId {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getCldId();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setCldId((String)value);
            }
        }
        ,
        SlocId {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getSlocId();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setSlocId((Integer)value);
            }
        }
        ,
        OrgId {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setOrgId((String)value);
            }
        }
        ,
        ParamId {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getParamId();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setParamId((String)value);
            }
        }
        ,
        ParamNm {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getParamNm();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setParamNm((String)value);
            }
        }
        ,
        ParamDesc {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getParamDesc();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setParamDesc((String)value);
            }
        }
        ,
        ParamType {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getParamType();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setParamType((Integer)value);
            }
        }
        ,
        Actv {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getActv();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setActv((String)value);
            }
        }
        ,
        InactvResn {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getInactvResn();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setInactvResn((String)value);
            }
        }
        ,
        InactvDt {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getInactvDt();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setInactvDt((Timestamp)value);
            }
        }
        ,
        UsrIdCreate {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getUsrIdCreate();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setUsrIdCreate((Integer)value);
            }
        }
        ,
        UsrIdCreateDt {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getUsrIdCreateDt();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setUsrIdCreateDt((Timestamp)value);
            }
        }
        ,
        UsrIdMod {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getUsrIdMod();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setUsrIdMod((Integer)value);
            }
        }
        ,
        UsrIdModDt {
            public Object get(MmQcParamEOImpl obj) {
                return obj.getUsrIdModDt();
            }

            public void put(MmQcParamEOImpl obj, Object value) {
                obj.setUsrIdModDt((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MmQcParamEOImpl object);

        public abstract void put(MmQcParamEOImpl object, Object value);

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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int PARAMID = AttributesEnum.ParamId.index();
    public static final int PARAMNM = AttributesEnum.ParamNm.index();
    public static final int PARAMDESC = AttributesEnum.ParamDesc.index();
    public static final int PARAMTYPE = AttributesEnum.ParamType.index();
    public static final int ACTV = AttributesEnum.Actv.index();
    public static final int INACTVRESN = AttributesEnum.InactvResn.index();
    public static final int INACTVDT = AttributesEnum.InactvDt.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MmQcParamEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("mmqcsetupapp.model.entities.MmQcParamEO");
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
     * Gets the attribute value for ParamId, using the alias name ParamId.
     * @return the value of ParamId
     */
    public String getParamId() {
        return (String)getAttributeInternal(PARAMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamId.
     * @param value value to set the ParamId
     */
    public void setParamId(String value) {
        setAttributeInternal(PARAMID, value);
    }

    /**
     * Gets the attribute value for ParamNm, using the alias name ParamNm.
     * @return the value of ParamNm
     */
    public String getParamNm() {
        return (String)getAttributeInternal(PARAMNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamNm.
     * @param value value to set the ParamNm
     */
    public void setParamNm(String value) {
        setAttributeInternal(PARAMNM, value);
    }

    /**
     * Gets the attribute value for ParamDesc, using the alias name ParamDesc.
     * @return the value of ParamDesc
     */
    public String getParamDesc() {
        return (String)getAttributeInternal(PARAMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamDesc.
     * @param value value to set the ParamDesc
     */
    public void setParamDesc(String value) {
        setAttributeInternal(PARAMDESC, value);
    }

    /**
     * Gets the attribute value for ParamType, using the alias name ParamType.
     * @return the value of ParamType
     */
    public Integer getParamType() {
        return (Integer)getAttributeInternal(PARAMTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParamType.
     * @param value value to set the ParamType
     */
    public void setParamType(Integer value) {
        setAttributeInternal(PARAMTYPE, value);
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
    public Timestamp getInactvDt() {
        return (Timestamp)getAttributeInternal(INACTVDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for InactvDt.
     * @param value value to set the InactvDt
     */
    public void setInactvDt(Timestamp value) {
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
    public Timestamp getUsrIdCreateDt() {
        return (Timestamp)getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCreateDt.
     * @param value value to set the UsrIdCreateDt
     */
    public void setUsrIdCreateDt(Timestamp value) {
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
    public Timestamp getUsrIdModDt() {
        return (Timestamp)getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdModDt.
     * @param value value to set the UsrIdModDt
     */
    public void setUsrIdModDt(Timestamp value) {
        setAttributeInternal(USRIDMODDT, value);
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
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param paramId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String paramId) {
        return new Key(new Object[]{cldId, slocId, orgId, paramId});
    }
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
                      CallableStatement st = null;
                      try {
                          QcSetupAMImpl am = (QcSetupAMImpl)resolvElDC("QcSetupAMDataControl");
                           st = am.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
                          st.registerOutParameter(1, sqlReturnType);
                          if (bindVars != null) {
                              for (int z = 0; z < bindVars.length; z++) {
                                  st.setObject(z + 2, bindVars[z]);
                                  System.out.println(bindVars[z] + "z");
                              }
                          }
                          st.executeUpdate();

                          return st.getObject(1);
                      } catch (SQLException e) {
                          throw new JboException(e);
                      } finally {
                          if (st != null) {
                              try {
                                  st.close();
                              } catch (SQLException e) {
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
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        Integer p_sloc_id = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
        Integer p_user_id = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
        String p_org_id = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        String p_cldId=resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        setUsrIdCreate(p_user_id);
        setCldId(p_cldId);
        setSlocId(p_sloc_id);
        setOrgId(p_org_id);
        setUsrIdCreateDt(new Timestamp(System.currentTimeMillis()));
        String tableName = "MM$QC$PARAM";
        String paramId = (String)callStoredFunction(Types.VARCHAR, "FN_MM_GEN_ID(?,?,?,?)", new Object[]{p_sloc_id,p_cldId,p_org_id,tableName});
        System.out.println("new param id "+paramId);
        setParamId(paramId);
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
       // super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if(operation == DML_UPDATE){
            Integer p_user_id = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_USR}"));
            setUsrIdMod(p_user_id);
            setUsrIdModDt(new Timestamp(System.currentTimeMillis()));
        }
        super.doDML(operation, e);
    }
}
