package svcserviceexecutive.model.views;

import java.sql.Timestamp;

import javax.el.ELContext;
import javax.el.ExpressionFactory;

import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;

import svcserviceexecutive.model.entities.SvcExecEOImpl;
import svcserviceexecutive.model.services.ServiceExecutiveAMImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 15 11:59:44 PDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SvcExecVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SVCEXECEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        EmpCode,
        EmpId,
        EmpNm,
        EmpCodeMgr,
        RqmtAreaId,
        UsrIdCrt,
        CrtDt,
        UsrIdMod,
        ModDt,
        TransDeptName,
        TransMngrNm,
        TransSpclNm,
        TransDefectTypeId,
        SvcExecSpl,
        SvcExecSpl1,
        LovReqtAreaVO1,
        LovManagerNmVO1,
        LovDeftNameVO1,
        LovEmployeeNameVO;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

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
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int EMPCODE = AttributesEnum.EmpCode.index();
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int EMPNM = AttributesEnum.EmpNm.index();
    public static final int EMPCODEMGR = AttributesEnum.EmpCodeMgr.index();
    public static final int RQMTAREAID = AttributesEnum.RqmtAreaId.index();
    public static final int USRIDCRT = AttributesEnum.UsrIdCrt.index();
    public static final int CRTDT = AttributesEnum.CrtDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int MODDT = AttributesEnum.ModDt.index();
    public static final int TRANSDEPTNAME = AttributesEnum.TransDeptName.index();
    public static final int TRANSMNGRNM = AttributesEnum.TransMngrNm.index();
    public static final int TRANSSPCLNM = AttributesEnum.TransSpclNm.index();
    public static final int TRANSDEFECTTYPEID = AttributesEnum.TransDefectTypeId.index();
    public static final int SVCEXECSPL = AttributesEnum.SvcExecSpl.index();
    public static final int SVCEXECSPL1 = AttributesEnum.SvcExecSpl1.index();
    public static final int LOVREQTAREAVO1 = AttributesEnum.LovReqtAreaVO1.index();
    public static final int LOVMANAGERNMVO1 = AttributesEnum.LovManagerNmVO1.index();
    public static final int LOVDEFTNAMEVO1 = AttributesEnum.LovDeftNameVO1.index();
    public static final int LOVEMPLOYEENAMEVO = AttributesEnum.LovEmployeeNameVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SvcExecVORowImpl() {
    }

    /**
     * Gets SvcExecEO entity object.
     * @return the SvcExecEO
     */
    public SvcExecEOImpl getSvcExecEO() {
        return (SvcExecEOImpl) getEntity(ENTITY_SVCEXECEO);
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
     * Gets the attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @return the HO_ORG_ID
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @param value value to set the HO_ORG_ID
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
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
     * Gets the attribute value for EMP_CODE using the alias name EmpCode.
     * @return the EMP_CODE
     */
    public Integer getEmpCode() {
        return (Integer) getAttributeInternal(EMPCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CODE using the alias name EmpCode.
     * @param value value to set the EMP_CODE
     */
    public void setEmpCode(Integer value) {
        setAttributeInternal(EMPCODE, value);
    }

    /**
     * Gets the attribute value for EMP_ID using the alias name EmpId.
     * @return the EMP_ID
     */
    public String getEmpId() {
        return (String) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_ID using the alias name EmpId.
     * @param value value to set the EMP_ID
     */
    public void setEmpId(String value) {
        setAttributeInternal(EMPID, value);
    }

    /**
     * Gets the attribute value for EMP_NM using the alias name EmpNm.
     * @return the EMP_NM
     */
    public String getEmpNm() {
        return (String) getAttributeInternal(EMPNM);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_NM using the alias name EmpNm.
     * @param value value to set the EMP_NM
     */
    public void setEmpNm(String value) {
        setAttributeInternal(EMPNM, value);
    }

    /**
     * Gets the attribute value for EMP_CODE_MGR using the alias name EmpCodeMgr.
     * @return the EMP_CODE_MGR
     */
    public Integer getEmpCodeMgr() {
        return (Integer) getAttributeInternal(EMPCODEMGR);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_CODE_MGR using the alias name EmpCodeMgr.
     * @param value value to set the EMP_CODE_MGR
     */
    public void setEmpCodeMgr(Integer value) {
        setAttributeInternal(EMPCODEMGR, value);
    }

    /**
     * Gets the attribute value for RQMT_AREA_ID using the alias name RqmtAreaId.
     * @return the RQMT_AREA_ID
     */
    public Integer getRqmtAreaId() {
        return (Integer) getAttributeInternal(RQMTAREAID);
    }

    /**
     * Sets <code>value</code> as attribute value for RQMT_AREA_ID using the alias name RqmtAreaId.
     * @param value value to set the RQMT_AREA_ID
     */
    public void setRqmtAreaId(Integer value) {
        setAttributeInternal(RQMTAREAID, value);
    }

    /**
     * Gets the attribute value for USR_ID_CRT using the alias name UsrIdCrt.
     * @return the USR_ID_CRT
     */
    public Integer getUsrIdCrt() {
        return (Integer) getAttributeInternal(USRIDCRT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CRT using the alias name UsrIdCrt.
     * @param value value to set the USR_ID_CRT
     */
    public void setUsrIdCrt(Integer value) {
        setAttributeInternal(USRIDCRT, value);
    }

    /**
     * Gets the attribute value for CRT_DT using the alias name CrtDt.
     * @return the CRT_DT
     */
    public Timestamp getCrtDt() {
        return (Timestamp) getAttributeInternal(CRTDT);
    }

    /**
     * Sets <code>value</code> as attribute value for CRT_DT using the alias name CrtDt.
     * @param value value to set the CRT_DT
     */
    public void setCrtDt(Timestamp value) {
        setAttributeInternal(CRTDT, value);
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
     * Gets the attribute value for MOD_DT using the alias name ModDt.
     * @return the MOD_DT
     */
    public Timestamp getModDt() {
        return (Timestamp) getAttributeInternal(MODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for MOD_DT using the alias name ModDt.
     * @param value value to set the MOD_DT
     */
    public void setModDt(Timestamp value) {
        setAttributeInternal(MODDT, value);
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
     * Gets the attribute value for the calculated attribute TransDeptName.
     * @return the TransDeptName
     */


    public String getTransDeptName() {
        if(getRqmtAreaId()!=null){
            System.out.println("Reuirement id:"+getRqmtAreaId());
//        ServiceExecutiveAMImpl am =
//        (ServiceExecutiveAMImpl)resolvElDC("ServiceExecutiveAMDataControl");
            ServiceExecutiveAMImpl am =
                    (ServiceExecutiveAMImpl)this.getApplicationModule();
        //Object  reqid=am.getSvcExec1().getCurrentRow().getAttribute("RqmtAreaId");
        //if(reqid!=null){
        //Integer rid=Integer.parseInt(reqid.toString());
        
            Row r[]=this.getLovReqtAreaVO1().getFilteredRows("RqmtAreaId",getRqmtAreaId());
          //  Row r[]=am.getLovReqtArea2().getFilteredRows("RqmtAreaId",getRqmtAreaId());
            //System.out.println("Require id "+rid);
            System.out.println("Trans Dept Name :"+r.length);
            if(r.length>0) {
                 String name=r[0].getAttribute("RqmtAreaNm").toString();
                 System.out.println(name);
                return name;
            }
        }
    

        return (String) getAttributeInternal(TRANSDEPTNAME);
        
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDeptName.
     * @param value value to set the  TransDeptName
     */
    public void setTransDeptName(String value) {
        setAttributeInternal(TRANSDEPTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransMngrNm.
     * @return the TransMngrNm
     */
    public String getTransMngrNm() {
        ServiceExecutiveAMImpl am =
        (ServiceExecutiveAMImpl)resolvElDC("ServiceExecutiveAMDataControl");
        Object  empmgn=am.getSvcExec1().getCurrentRow().getAttribute("EmpCodeMgr");
        if(empmgn!=null){
            
        Integer rid=Integer.parseInt(empmgn.toString());
            Row r[]=am.getLovManagerNm1().getFilteredRows("EmpCode", rid);
            System.out.println("Require id "+rid);
            System.out.println("Trans Dept Name :"+r.length);
            if(r.length>0) {
                 String name=r[0].getAttribute("EmpNm").toString();
                 System.out.println(name);
                return name;
            }
        }
        
        return (String) getAttributeInternal(TRANSMNGRNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransMngrNm.
     * @param value value to set the  TransMngrNm
     */
    public void setTransMngrNm(String value) {
        setAttributeInternal(TRANSMNGRNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSpclNm.
     * @return the TransSpclNm
     */
    public String getTransSpclNm() {
        return (String) getAttributeInternal(TRANSSPCLNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSpclNm.
     * @param value value to set the  TransSpclNm
     */
    public void setTransSpclNm(String value) {
        setAttributeInternal(TRANSSPCLNM, value);
    }


    /**
     * Gets the attribute value for the calculated attribute TransDefectTypeId.
     * @return the TransDefectTypeId
     */
    public Integer getTransDefectTypeId() {
        return (Integer) getAttributeInternal(TRANSDEFECTTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransDefectTypeId.
     * @param value value to set the  TransDefectTypeId
     */
    public void setTransDefectTypeId(Integer value) {
        setAttributeInternal(TRANSDEFECTTYPEID, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SvcExecSpl.
     */
    public RowIterator getSvcExecSpl() {
        return (RowIterator) getAttributeInternal(SVCEXECSPL);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link SvcExecSpl1.
     */
    public RowIterator getSvcExecSpl1() {
        return (RowIterator) getAttributeInternal(SVCEXECSPL1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovReqtAreaVO1.
     */
    public RowSet getLovReqtAreaVO1() {
        return (RowSet) getAttributeInternal(LOVREQTAREAVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovManagerNmVO1.
     */
    public RowSet getLovManagerNmVO1() {
        return (RowSet) getAttributeInternal(LOVMANAGERNMVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovDeftNameVO1.
     */
    public RowSet getLovDeftNameVO1() {
        return (RowSet) getAttributeInternal(LOVDEFTNAMEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovEmployeeNameVO.
     */
    public RowSet getLovEmployeeNameVO() {
        return (RowSet) getAttributeInternal(LOVEMPLOYEENAMEVO);
    }
}

