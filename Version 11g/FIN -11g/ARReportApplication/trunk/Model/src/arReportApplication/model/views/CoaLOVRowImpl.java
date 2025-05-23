package arReportApplication.model.views;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Raw;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jun 01 10:15:55 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CoaLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and
accessors. Do not modify.
     */
    public enum AttributesEnum {
        CoaId {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCoaId();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCoaId((String)value);
            }
        }
        ,
        CoaNm {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCoaNm();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCoaNm((String)value);
            }
        }
        ,
        Sysdate {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getSysdate();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setSysdate((Date)value);
            }
        }
        ,
        OrganisationName {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getOrganisationName();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setOrganisationName((String)value);
            }
        }
        ,
        CoaName {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCoaName();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCoaName((Integer)value);
            }
        }
        ,
        FileType {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getFileType();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setFileType((String)value);
            }
        }
        ,
        StartDate {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getStartDate();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setStartDate((Date)value);
            }
        }
        ,
        EndDate {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEndDate();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setEndDate((Date)value);
            }
        }
        ,
        Amount {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getAmount();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAmount((Float)value);
            }
        }
        ,
        AmountX1 {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getAmountX1();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAmountX1((Float)value);
            }
        }
        ,
        AmountX2 {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getAmountX2();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAmountX2((Float)value);
            }
        }
        ,
        CurrencyId {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCurrencyId();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCurrencyId((Integer)value);
            }
        }
        ,
        ValueOfN {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getValueOfN();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setValueOfN((Integer)value);
            }
        }
        ,
        Tran_CoaName {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getTran_CoaName();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setTran_CoaName((String)value);
            }
        }
        ,
        CogName {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCogName();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCogName((String)value);
            }
        }
        ,
        cogId {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getcogId();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setcogId((String)value);
            }
        }
        ,
        CurrentCld {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCurrentCld();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCurrentCld((String)value);
            }
        }
        ,
        EmployeeName {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEmployeeName();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setEmployeeName((String)value);
            }
        }
        ,
        EmployeeId {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEmployeeId();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setEmployeeId((Integer)value);
            }
        }
        ,
        EntityGroupNameTrans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEntityGroupNameTrans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setEntityGroupNameTrans((String)value);
            }
        }
        ,
        Cld_Id_Trans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCld_Id_Trans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setCld_Id_Trans((String)value);
            }
        }
        ,
        Sloc_Id_trans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getSloc_Id_trans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setSloc_Id_trans((String)value);
            }
        }
        ,
        Ho_Org_Id_trans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getHo_Org_Id_trans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setHo_Org_Id_trans((String)value);
            }
        }
        ,
        Org_Id_trans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getOrg_Id_trans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setOrg_Id_trans((String)value);
            }
        }
        ,
        EntityGroupIdTrans {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEntityGroupIdTrans();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setEntityGroupIdTrans((String)value);
            }
        }
        ,
        FileSelectionLOV {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getFileSelectionLOV();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        OrganisationLOV {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getOrganisationLOV();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CurrencyLOV {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCurrencyLOV();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CoaDetailLOV {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCoaDetailLOV();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        CogLOV1 {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getCogLOV1();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LovEmployees1 {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getLovEmployees1();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        EntityVO1 {
            public Object get(CoaLOVRowImpl obj) {
                return obj.getEntityVO1();
            }

            public void put(CoaLOVRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CoaLOVRowImpl object);

        public abstract void put(CoaLOVRowImpl object, Object value);

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


    public static final int COAID = AttributesEnum.CoaId.index();
    public static final int COANM = AttributesEnum.CoaNm.index();
    public static final int SYSDATE = AttributesEnum.Sysdate.index();
    public static final int ORGANISATIONNAME = AttributesEnum.OrganisationName.index();
    public static final int COANAME = AttributesEnum.CoaName.index();
    public static final int FILETYPE = AttributesEnum.FileType.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int AMOUNTX1 = AttributesEnum.AmountX1.index();
    public static final int AMOUNTX2 = AttributesEnum.AmountX2.index();
    public static final int CURRENCYID = AttributesEnum.CurrencyId.index();
    public static final int VALUEOFN = AttributesEnum.ValueOfN.index();
    public static final int TRAN_COANAME = AttributesEnum.Tran_CoaName.index();
    public static final int COGNAME = AttributesEnum.CogName.index();
    public static final int COGID = AttributesEnum.cogId.index();
    public static final int CURRENTCLD = AttributesEnum.CurrentCld.index();
    public static final int EMPLOYEENAME = AttributesEnum.EmployeeName.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int ENTITYGROUPNAMETRANS = AttributesEnum.EntityGroupNameTrans.index();
    public static final int CLD_ID_TRANS = AttributesEnum.Cld_Id_Trans.index();
    public static final int SLOC_ID_TRANS = AttributesEnum.Sloc_Id_trans.index();
    public static final int HO_ORG_ID_TRANS = AttributesEnum.Ho_Org_Id_trans.index();
    public static final int ORG_ID_TRANS = AttributesEnum.Org_Id_trans.index();
    public static final int ENTITYGROUPIDTRANS = AttributesEnum.EntityGroupIdTrans.index();
    public static final int FILESELECTIONLOV = AttributesEnum.FileSelectionLOV.index();
    public static final int ORGANISATIONLOV = AttributesEnum.OrganisationLOV.index();
    public static final int CURRENCYLOV = AttributesEnum.CurrencyLOV.index();
    public static final int COADETAILLOV = AttributesEnum.CoaDetailLOV.index();
    public static final int COGLOV1 = AttributesEnum.CogLOV1.index();
    public static final int LOVEMPLOYEES1 = AttributesEnum.LovEmployees1.index();
    public static final int ENTITYVO1 = AttributesEnum.EntityVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CoaLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CoaId.
     * @return the CoaId
     */
    public String getCoaId() {
        return (String)getAttributeInternal(COAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CoaId.
     * @param value value to set the  CoaId
     */
    public void setCoaId(String value) {
        setAttributeInternal(COAID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CoaNm.
     * @return the CoaNm
     */
    public String getCoaNm() {
        return (String)getAttributeInternal(COANM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CoaNm.
     * @param value value to set the  CoaNm
     */
    public void setCoaNm(String value) {
        setAttributeInternal(COANM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Sysdate.
     * @return the Sysdate
     */
    public Date getSysdate() {
        return (Date)getAttributeInternal(SYSDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute Sysdate.
     * @param value value to set the  Sysdate
     */
    public void setSysdate(Date value) {
        setAttributeInternal(SYSDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute
OrganisationName.
     * @return the OrganisationName
     */
    public String getOrganisationName() {
        if ((resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}") != null))
            if (getAttributeInternal(ORGANISATIONNAME) == null)
                return resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        return (String)getAttributeInternal(ORGANISATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute OrganisationName.
     * @param value value to set the  OrganisationName
     */
    public void setOrganisationName(String value) {
        setAttributeInternal(ORGANISATIONNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CoaName.
     * @return the CoaName
     */
    public Integer getCoaName() {
        return (Integer)getAttributeInternal(COANAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CoaName.
     * @param value value to set the  CoaName
     */
    public void setCoaName(Integer value) {
        setAttributeInternal(COANAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FileType.
     * @return the FileType
     */
    public String getFileType() {
        if (getAttributeInternal(FILETYPE) == null) {
            return "PDF";
        } else
            return (String)getAttributeInternal(FILETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute FileType.
     * @param value value to set the  FileType
     */
    public void setFileType(String value) {
        setAttributeInternal(FILETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StartDate.
     * @return the StartDate
     */
    public Date getStartDate() {
        return (Date)getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute StartDate.
     * @param value value to set the  StartDate
     */
    public void setStartDate(Date value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EndDate.
     * @return the EndDate
     */
    public Date getEndDate() {
        return (Date)getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute EndDate.
     * @param value value to set the  EndDate
     */
    public void setEndDate(Date value) {
        setAttributeInternal(ENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Amount.
     * @return the Amount
     */
    public Float getAmount() {
        return (Float)getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute Amount.
     * @param value value to set the  Amount
     */
    public void setAmount(Float value) {

        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmountX1.
     * @return the AmountX1
     */
    public Float getAmountX1() {
        return (Float)getAttributeInternal(AMOUNTX1);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute AmountX1.
     * @param value value to set the  AmountX1
     */
    public void setAmountX1(Float value) {

        setAttributeInternal(AMOUNTX1, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AmountX2.
     * @return the AmountX2
     */
    public Float getAmountX2() {
        return (Float)getAttributeInternal(AMOUNTX2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute AmountX2.
     * @param value value to set the  AmountX2
     */
    public void setAmountX2(Float value) {

        setAttributeInternal(AMOUNTX2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrencyId.
     * @return the CurrencyId
     */
    public Integer getCurrencyId() {
        return (Integer)getAttributeInternal(CURRENCYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CurrencyId.
     * @param value value to set the  CurrencyId
     */
    public void setCurrencyId(Integer value) {
        setAttributeInternal(CURRENCYID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ValueOfN.
     * @return the ValueOfN
     */
    public Integer getValueOfN() {
        return (Integer)getAttributeInternal(VALUEOFN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute ValueOfN.
     * @param value value to set the  ValueOfN
     */
    public void setValueOfN(Integer value) {
        setAttributeInternal(VALUEOFN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Tran_CoaName.
     * @return the Tran_CoaName
     */
    public String getTran_CoaName() {
        return (String)getAttributeInternal(TRAN_COANAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute Tran_CoaName.
     * @param value value to set the  Tran_CoaName
     */
    public void setTran_CoaName(String value) {
        setAttributeInternal(TRAN_COANAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CogName.
     * @return the CogName
     */
    public String getCogName() {
        return (String)getAttributeInternal(COGNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CogName.
     * @param value value to set the  CogName
     */
    public void setCogName(String value) {
        setAttributeInternal(COGNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute cogId.
     * @return the cogId
     */
    public String getcogId() {
        return (String)getAttributeInternal(COGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute cogId.
     * @param value value to set the  cogId
     */
    public void setcogId(String value) {
        setAttributeInternal(COGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentCld.
     * @return the CurrentCld
     */
    public String getCurrentCld() {
        return this.resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute CurrentCld.
     * @param value value to set the  CurrentCld
     */
    public void setCurrentCld(String value) {
        setAttributeInternal(CURRENTCLD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeName.
     * @return the EmployeeName
     */
    public String getEmployeeName() {
        return (String)getAttributeInternal(EMPLOYEENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute EmployeeName.
     * @param value value to set the  EmployeeName
     */
    public void setEmployeeName(String value) {
        setAttributeInternal(EMPLOYEENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeId.
     * @return the EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer)getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated
attribute EmployeeId.
     * @param value value to set the  EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EntityGroupNameTrans.
     * @return the EntityGroupNameTrans
     */
    public String getEntityGroupNameTrans() {
        return (String)getAttributeInternal(CoaLOVRowImpl.ENTITYGROUPNAMETRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EntityGroupNameTrans.
     * @param value value to set the  EntityGroupNameTrans
     */
    public void setEntityGroupNameTrans(String value) {
        setAttributeInternal(CoaLOVRowImpl.ENTITYGROUPNAMETRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Cld_Id_Trans.
     * @return the Cld_Id_Trans
     */
    public String getCld_Id_Trans() {
        if (resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}") != null) {
            return resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
        } else
            return (String)getAttributeInternal(CLD_ID_TRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Cld_Id_Trans.
     * @param value value to set the  Cld_Id_Trans
     */
    public void setCld_Id_Trans(String value) {
        setAttributeInternal(CLD_ID_TRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Sloc_Id_trans.
     * @return the Sloc_Id_trans
     */
    public String getSloc_Id_trans() {
        if (resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}") != null) {
            return resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}");
        } else
            return (String)getAttributeInternal(SLOC_ID_TRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Sloc_Id_trans.
     * @param value value to set the  Sloc_Id_trans
     */
    public void setSloc_Id_trans(String value) {
        setAttributeInternal(SLOC_ID_TRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Ho_Org_Id_trans.
     * @return the Ho_Org_Id_trans
     */
    public String getHo_Org_Id_trans() {
        if (resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}") != null) {
            return resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}");
        } else
            return (String)getAttributeInternal(HO_ORG_ID_TRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Ho_Org_Id_trans.
     * @param value value to set the  Ho_Org_Id_trans
     */
    public void setHo_Org_Id_trans(String value) {
        setAttributeInternal(HO_ORG_ID_TRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Org_Id_trans.
     * @return the Org_Id_trans
     */
    public String getOrg_Id_trans() {
        if (resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}") != null) {
            return resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
        } else
            return (String)getAttributeInternal(ORG_ID_TRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Org_Id_trans.
     * @param value value to set the  Org_Id_trans
     */
    public void setOrg_Id_trans(String value) {
        setAttributeInternal(ORG_ID_TRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EntityGroupIdTrans.
     * @return the EntityGroupIdTrans
     */
    public String getEntityGroupIdTrans() {
        return (String) getAttributeInternal(ENTITYGROUPIDTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EntityGroupIdTrans.
     * @param value value to set the  EntityGroupIdTrans
     */
    public void setEntityGroupIdTrans(String value) {
        setAttributeInternal(ENTITYGROUPIDTRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> FileSelectionLOV.
     */
    public RowSet getFileSelectionLOV() {
        return (RowSet)getAttributeInternal(FILESELECTIONLOV);
    }

    /**
     * Gets the view accessor <code>RowSet</code> OrganisationLOV.
     */
    public RowSet getOrganisationLOV() {
        return (RowSet)getAttributeInternal(ORGANISATIONLOV);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CurrencyLOV.
     */
    public RowSet getCurrencyLOV() {
        return (RowSet)getAttributeInternal(CURRENCYLOV);
    }


    /**
     * Gets the view accessor <code>RowSet</code> CoaDetailLOV.
     */
    public RowSet getCoaDetailLOV() {
        return (RowSet)getAttributeInternal(COADETAILLOV);
    }

    /**
     * Gets the view accessor <code>RowSet</code> CogLOV1.
     */
    public RowSet getCogLOV1() {
        return (RowSet)getAttributeInternal(COGLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovEmployees1.
     */
    public RowSet getLovEmployees1() {
        return (RowSet)getAttributeInternal(LOVEMPLOYEES1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> EntityVO1.
     */
    public RowSet getEntityVO1() {
        return (RowSet)getAttributeInternal(ENTITYVO1);
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

    public String resolvEl(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
        String Message = valueExp.getValue(elContext).toString();
        return Message;
    }
}
