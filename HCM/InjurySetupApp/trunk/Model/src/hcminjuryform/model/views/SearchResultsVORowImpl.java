package hcminjuryform.model.views;

import adf.utils.ebiz.EbizParams;

import hcminjuryform.model.services.HCMInjuryFormAMImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 07 14:12:56 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SearchResultsVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        DispDocId,
        DocDt,
        DocId,
        EmpCode,
        EmpDocId,
        HoOrgId,
        InjDtl,
        InjTime,
        InjType,
        OrgId,
        SiteCordName,
        SlocId,
        Status,
        TransEmpName,
        LOVEmployeeDetails1,
        LOVActionStatus1,
        LOVInjuryTypeVO1;
        private static AttributesEnum[] vals = null;
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
    public static final int DISPDOCID = AttributesEnum.DispDocId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int EMPCODE = AttributesEnum.EmpCode.index();
    public static final int EMPDOCID = AttributesEnum.EmpDocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int INJDTL = AttributesEnum.InjDtl.index();
    public static final int INJTIME = AttributesEnum.InjTime.index();
    public static final int INJTYPE = AttributesEnum.InjType.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SITECORDNAME = AttributesEnum.SiteCordName.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int TRANSEMPNAME = AttributesEnum.TransEmpName.index();
    public static final int LOVEMPLOYEEDETAILS1 = AttributesEnum.LOVEmployeeDetails1.index();
    public static final int LOVACTIONSTATUS1 = AttributesEnum.LOVActionStatus1.index();
    public static final int LOVINJURYTYPEVO1 = AttributesEnum.LOVInjuryTypeVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SearchResultsVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute DispDocId.
     * @return the DispDocId
     */
    public String getDispDocId() {
        return (String) getAttributeInternal(DISPDOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute DocDt.
     * @return the DocDt
     */
    public Timestamp getDocDt() {
        return (Timestamp) getAttributeInternal(DOCDT);
    }

    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpCode.
     * @return the EmpCode
     */
    public Integer getEmpCode() {
        return (Integer) getAttributeInternal(EMPCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpCode.
     * @param value value to set the  EmpCode
     */
    public void setEmpCode(Integer value) {
        setAttributeInternal(EMPCODE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpDocId.
     * @return the EmpDocId
     */
    public String getEmpDocId() {
        return (String) getAttributeInternal(EMPDOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EmpDocId.
     * @param value value to set the  EmpDocId
     */
    public void setEmpDocId(String value) {
        setAttributeInternal(EMPDOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute InjDtl.
     * @return the InjDtl
     */
    public String getInjDtl() {
        return (String) getAttributeInternal(INJDTL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InjDtl.
     * @param value value to set the  InjDtl
     */
    public void setInjDtl(String value) {
        setAttributeInternal(INJDTL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InjTime.
     * @return the InjTime
     */
    public String getInjTime() {
        return (String) getAttributeInternal(INJTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InjTime.
     * @param value value to set the  InjTime
     */
    public void setInjTime(String value) {
        setAttributeInternal(INJTIME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InjType.
     * @return the InjType
     */
    public Integer getInjType() {
        return (Integer) getAttributeInternal(INJTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InjType.
     * @param value value to set the  InjType
     */
    public void setInjType(Integer value) {
        setAttributeInternal(INJTYPE, value);
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
     * Gets the attribute value for the calculated attribute SiteCordName.
     * @return the SiteCordName
     */
    public String getSiteCordName() {
        return (String) getAttributeInternal(SITECORDNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute Status.
     * @return the Status
     */
    public Integer getStatus() {
        return (Integer) getAttributeInternal(STATUS);
    }

    /**
     * Gets the attribute value for the calculated attribute TransEmpName.
     * @return the TransEmpName
     */
    public String getTransEmpName() {
        String empNm=null;
        if(getAttributeInternal(TRANSEMPNAME)==null && getEmpCode()!=null){
            System.out.println("IN EmpTrans :::::::: After If");
            HCMInjuryFormAMImpl am = (HCMInjuryFormAMImpl)getApplicationModule();
            ViewObjectImpl empIdVo = am.getLOVEmployeeDetails1();
            empIdVo.setNamedWhereClauseParam("P_CLD_ID", EbizParams.GLBL_APP_CLD_ID());
            empIdVo.setNamedWhereClauseParam("P_SLOC_ID", EbizParams.GLBL_APP_SERV_LOC());
            empIdVo.setNamedWhereClauseParam("P_HO_ORG_ID", EbizParams.GLBL_HO_ORG_ID());
            empIdVo.setNamedWhereClauseParam("P_ORG_ID", EbizParams.GLBL_APP_USR_ORG());
            empIdVo.executeQuery();
            System.out.println("IN EmpTrans :::::::: After Execute");
            System.out.println("EmpCode is ::::::::::::::: "+getEmpCode());
            Row[] filteredRows = empIdVo.getFilteredRows("EmpCode", getEmpCode());
            System.out.println("In EmpTrans :::::::: After Execute"+filteredRows.length);
            if(filteredRows.length>0){
              empNm=  filteredRows[0].getAttribute("EmpNm").toString();
              System.out.println("empNm :::: "+empNm);
            }
            return empNm;
        }
        return (String) getAttributeInternal(TRANSEMPNAME);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVEmployeeDetails1.
     */
    public RowSet getLOVEmployeeDetails1() {
        return (RowSet) getAttributeInternal(LOVEMPLOYEEDETAILS1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVActionStatus1.
     */
    public RowSet getLOVActionStatus1() {
        return (RowSet) getAttributeInternal(LOVACTIONSTATUS1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVInjuryTypeVO1.
     */
    public RowSet getLOVInjuryTypeVO1() {
        return (RowSet) getAttributeInternal(LOVINJURYTYPEVO1);
    }
}

