package mnfproductioncosting.model.views;

import adf.utils.ebiz.EbizParams;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 15 14:48:01 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DualAddCOADetailVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Selectobjects0,
        TransCOAId,
        TransAmount,
        TransCOAName,
        TransCldId,
        TransHoOrgId,
        TransOrgId,
        TransSlocId,
        TransSelectAllJE,
        LOVCostingCOADetailVO1;
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


    public static final int SELECTOBJECTS0 = AttributesEnum.Selectobjects0.index();
    public static final int TRANSCOAID = AttributesEnum.TransCOAId.index();
    public static final int TRANSAMOUNT = AttributesEnum.TransAmount.index();
    public static final int TRANSCOANAME = AttributesEnum.TransCOAName.index();
    public static final int TRANSCLDID = AttributesEnum.TransCldId.index();
    public static final int TRANSHOORGID = AttributesEnum.TransHoOrgId.index();
    public static final int TRANSORGID = AttributesEnum.TransOrgId.index();
    public static final int TRANSSLOCID = AttributesEnum.TransSlocId.index();
    public static final int TRANSSELECTALLJE = AttributesEnum.TransSelectAllJE.index();
    public static final int LOVCOSTINGCOADETAILVO1 = AttributesEnum.LOVCostingCOADetailVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DualAddCOADetailVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Selectobjects0.
     * @return the Selectobjects0
     */
    public String getSelectobjects0() {
        return (String) getAttributeInternal(SELECTOBJECTS0);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCOAId.
     * @return the TransCOAId
     */
    public Integer getTransCOAId() {
        return (Integer) getAttributeInternal(TRANSCOAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCOAId.
     * @param value value to set the  TransCOAId
     */
    public void setTransCOAId(Integer value) {
        setAttributeInternal(TRANSCOAID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransAmount.
     * @return the TransAmount
     */
    public Number getTransAmount() {
        return (Number) getAttributeInternal(TRANSAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransAmount.
     * @param value value to set the  TransAmount
     */
    public void setTransAmount(Number value) {
        setAttributeInternal(TRANSAMOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCOAName.
     * @return the TransCOAName
     */
    public String getTransCOAName() {
        return (String) getAttributeInternal(TRANSCOANAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCOAName.
     * @param value value to set the  TransCOAName
     */
    public void setTransCOAName(String value) {
        setAttributeInternal(TRANSCOANAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransCldId.
     * @return the TransCldId
     */
    public String getTransCldId() {
        System.out.println("Value is "+EbizParams.GLBL_APP_CLD_ID());
        return EbizParams.GLBL_APP_CLD_ID();
    //    return (String) getAttributeInternal(TRANSCLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransCldId.
     * @param value value to set the  TransCldId
     */
    public void setTransCldId(String value) {
        setAttributeInternal(TRANSCLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransHoOrgId.
     * @return the TransHoOrgId
     */
    public String getTransHoOrgId() {
        System.out.println("Value is "+EbizParams.GLBL_HO_ORG_ID());
        return EbizParams.GLBL_HO_ORG_ID();
       // return (String) getAttributeInternal(TRANSHOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransHoOrgId.
     * @param value value to set the  TransHoOrgId
     */
    public void setTransHoOrgId(String value) {
        setAttributeInternal(TRANSHOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransOrgId.
     * @return the TransOrgId
     */
    public String getTransOrgId() {
        
        System.out.println("Value is "+EbizParams.GLBL_APP_USR_ORG());
        return EbizParams.GLBL_APP_USR_ORG();
        
      //  return (String) getAttributeInternal(TRANSORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransOrgId.
     * @param value value to set the  TransOrgId
     */
    public void setTransOrgId(String value) {
        setAttributeInternal(TRANSORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSlocId.
     * @return the TransSlocId
     */
    public Integer getTransSlocId() {
        System.out.println("Value is "+EbizParams.GLBL_APP_SERV_LOC());
        return (Integer)EbizParams.GLBL_APP_SERV_LOC();
      //  return (Integer) getAttributeInternal(TRANSSLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSlocId.
     * @param value value to set the  TransSlocId
     */
    public void setTransSlocId(Integer value) {
        setAttributeInternal(TRANSSLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSelectAllJE.
     * @return the TransSelectAllJE
     */
    public String getTransSelectAllJE() {
        return (String) getAttributeInternal(TRANSSELECTALLJE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSelectAllJE.
     * @param value value to set the  TransSelectAllJE
     */
    public void setTransSelectAllJE(String value) {
        setAttributeInternal(TRANSSELECTALLJE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LOVCostingCOADetailVO1.
     */
    public RowSet getLOVCostingCOADetailVO1() {
        return (RowSet) getAttributeInternal(LOVCOSTINGCOADETAILVO1);
    }
}

