package bdgeoprofileapp.model.views;

import bdgeoprofileapp.model.services.BdgEoProfileAMImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 12 16:58:26 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpBudgetStructVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        OrgId,
        EmpCode,
        EmpNm,
        DocStruct,
        DocStructVal,
        DocDepd,
        DocStructDepd,
        EmpBudgetDetail,
        StructDetail;
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
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int EMPCODE = AttributesEnum.EmpCode.index();
    public static final int EMPNM = AttributesEnum.EmpNm.index();
    public static final int DOCSTRUCT = AttributesEnum.DocStruct.index();
    public static final int DOCSTRUCTVAL = AttributesEnum.DocStructVal.index();
    public static final int DOCDEPD = AttributesEnum.DocDepd.index();
    public static final int DOCSTRUCTDEPD = AttributesEnum.DocStructDepd.index();
    public static final int EMPBUDGETDETAIL = AttributesEnum.EmpBudgetDetail.index();
    public static final int STRUCTDETAIL = AttributesEnum.StructDetail.index();

    /**
     * This is the default constructor (do not remove).
     */
    public EmpBudgetStructVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpCode.
     * @return the EmpCode
     */
    public String getEmpCode() {
        return (String) getAttributeInternal(EMPCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpNm.
     * @return the EmpNm
     */
    public String getEmpNm() {
        return (String) getAttributeInternal(EMPNM);
    }

    /**
     * Gets the attribute value for the calculated attribute DocStruct.
     * @return the DocStruct
     */
    public String getDocStruct() {
        return (String) getAttributeInternal(DOCSTRUCT);
    }

    /**
     * Gets the attribute value for the calculated attribute DocStructVal.
     * @return the DocStructVal
     */
    public String getDocStructVal() {
        return (String) getAttributeInternal(DOCSTRUCTVAL);
    }

    /**
     * Gets the attribute value for the calculated attribute DocDepd.
     * @return the DocDepd
     */
    public String getDocDepd() {
        return (String) getAttributeInternal(DOCDEPD);
    }

    /**
     * Gets the attribute value for the calculated attribute DocStructDepd.
     * @return the DocStructDepd
     */
    public String getDocStructDepd() {
        return (String) getAttributeInternal(DOCSTRUCTDEPD);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link EmpBudgetDetail.
     */
    public RowIterator getEmpBudgetDetail() {
        return (RowIterator) getAttributeInternal(EMPBUDGETDETAIL);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link StructDetail.
     */
    public RowIterator getStructDetail() {
        System.out.println("Accessor row count of dtl " +
                           ((RowIterator) getAttributeInternal(STRUCTDETAIL)).getAllRowsInRange().length);
        RowSet rs = (RowSet) getAttributeInternal(STRUCTDETAIL);
        if (this.getEmpCode() != null)
            return null;
        else {
            BdgEoProfileAMImpl am = (BdgEoProfileAMImpl) this.getApplicationModule();
            String empCode = am.getHeadEmpDetailVO1().getCurrentRow().getAttribute("EmpCode").toString();
            rs.setNamedWhereClauseParam("BindEmpCode", empCode);
            rs.executeQuery();
        }

        System.out.println("Rows =" + rs.getFilteredRows("CldId", this.getCldId()).length);
        RowIterator ri = rs.createRowSetIterator(null);
        return ri;
        //return (RowIterator) getAttributeInternal(STRUCTDETAIL);
    }
}

