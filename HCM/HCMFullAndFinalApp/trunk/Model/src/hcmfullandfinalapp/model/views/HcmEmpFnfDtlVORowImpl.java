package hcmfullandfinalapp.model.views;

import adf.utils.ebiz.EbizParams;

import hcmfullandfinalapp.model.service.HCMFullAndFinalAppAMImpl;

import oracle.jbo.Row;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 07 11:54:05 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HcmEmpFnfDtlVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        DocId,
        EmpDocId,
        SalId,
        SalBehav,
        SalAmt,
        TransSalName;
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
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int EMPDOCID = AttributesEnum.EmpDocId.index();
    public static final int SALID = AttributesEnum.SalId.index();
    public static final int SALBEHAV = AttributesEnum.SalBehav.index();
    public static final int SALAMT = AttributesEnum.SalAmt.index();
    public static final int TRANSSALNAME = AttributesEnum.TransSalName.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HcmEmpFnfDtlVORowImpl() {
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
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute EmpDocId.
     * @return the EmpDocId
     */
    public String getEmpDocId() {
        return (String) getAttributeInternal(EMPDOCID);
    }

    /**
     * Gets the attribute value for the calculated attribute SalId.
     * @return the SalId
     */
    public String getSalId() {
        return (String) getAttributeInternal(SALID);
    }

    /**
     * Gets the attribute value for the calculated attribute SalBehav.
     * @return the SalBehav
     */
    public Integer getSalBehav() {
        return (Integer) getAttributeInternal(SALBEHAV);
    }

    /**
     * Gets the attribute value for the calculated attribute SalAmt.
     * @return the SalAmt
     */
    public Number getSalAmt() {
        return (Number) getAttributeInternal(SALAMT);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSalName.
     * @return the TransSalName
     */
    public String getTransSalName() {
        System.out.println();
        if (this.getSalId() != null) {
            HCMFullAndFinalAppAMImpl am = (HCMFullAndFinalAppAMImpl) this.getApplicationModule();
            am.getLovSalCompName1().setNamedWhereClauseParam("BindCldId", EbizParams.GLBL_APP_CLD_ID());
            am.getLovSalCompName1().setNamedWhereClauseParam("BindHoOrgId", EbizParams.GLBL_HO_ORG_ID());
            am.getLovSalCompName1().setNamedWhereClauseParam("BindOrgId", EbizParams.GLBL_APP_USR_ORG());
            am.getLovSalCompName1().setNamedWhereClauseParam("BindSlocId", EbizParams.GLBL_APP_SERV_LOC());
            Row[] fr = am.getLovSalCompName1().getFilteredRows("SalId", this.getSalId());
            if (fr.length > 0) {
                System.out.println("sal id id" + getSalId() + "salary component name=" +
                                   (String) fr[0].getAttribute("ParamDesc"));
                return (String) fr[0].getAttribute("ParamDesc");
            }

        }
        return (String) getAttributeInternal(TRANSSALNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSalName.
     * @param value value to set the  TransSalName
     */
    public void setTransSalName(String value) {
        setAttributeInternal(TRANSSALNAME, value);
    }
}

