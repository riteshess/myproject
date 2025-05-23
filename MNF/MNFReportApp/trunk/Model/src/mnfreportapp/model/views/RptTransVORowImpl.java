package mnfreportapp.model.views;

import mnfreportapp.model.views.common.RptTransVORow;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 25 10:58:24 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RptTransVORowImpl extends ViewRowImpl implements RptTransVORow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Dummy,
        RptNmTrans,
        RptFileNmTrans,
        RptDescTrans,
        BGColorTrans,
        HeadColorTrans,
        MarginDetailTrans,
        OrgViewTrans,
        RptDownCBTrans,
        QCTestCertCBTrans,
        LovRptAppVO1;
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


    public static final int DUMMY = AttributesEnum.Dummy.index();
    public static final int RPTNMTRANS = AttributesEnum.RptNmTrans.index();
    public static final int RPTFILENMTRANS = AttributesEnum.RptFileNmTrans.index();
    public static final int RPTDESCTRANS = AttributesEnum.RptDescTrans.index();
    public static final int BGCOLORTRANS = AttributesEnum.BGColorTrans.index();
    public static final int HEADCOLORTRANS = AttributesEnum.HeadColorTrans.index();
    public static final int MARGINDETAILTRANS = AttributesEnum.MarginDetailTrans.index();
    public static final int ORGVIEWTRANS = AttributesEnum.OrgViewTrans.index();
    public static final int RPTDOWNCBTRANS = AttributesEnum.RptDownCBTrans.index();
    public static final int QCTESTCERTCBTRANS = AttributesEnum.QCTestCertCBTrans.index();
    public static final int LOVRPTAPPVO1 = AttributesEnum.LovRptAppVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RptTransVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String) getAttributeInternal(DUMMY);
    }

    /**
     * Gets the attribute value for the calculated attribute RptNmTrans.
     * @return the RptNmTrans
     */
    public String getRptNmTrans() {
        return (String) getAttributeInternal(RPTNMTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RptNmTrans.
     * @param value value to set the  RptNmTrans
     */
    public void setRptNmTrans(String value) {
        setAttributeInternal(RPTNMTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RptFileNmTrans.
     * @return the RptFileNmTrans
     */
    public String getRptFileNmTrans() {
        return (String) getAttributeInternal(RPTFILENMTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RptFileNmTrans.
     * @param value value to set the  RptFileNmTrans
     */
    public void setRptFileNmTrans(String value) {
        setAttributeInternal(RPTFILENMTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RptDescTrans.
     * @return the RptDescTrans
     */
    public String getRptDescTrans() {
        return (String) getAttributeInternal(RPTDESCTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RptDescTrans.
     * @param value value to set the  RptDescTrans
     */
    public void setRptDescTrans(String value) {
        setAttributeInternal(RPTDESCTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BGColorTrans.
     * @return the BGColorTrans
     */
    public String getBGColorTrans() {
        if (getAttributeInternal(BGCOLORTRANS) == null) {
            return "D";
        } else
            return (String) getAttributeInternal(BGCOLORTRANS);

        // return (String) getAttributeInternal(BGCOLORTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BGColorTrans.
     * @param value value to set the  BGColorTrans
     */
    public void setBGColorTrans(String value) {
        setAttributeInternal(BGCOLORTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeadColorTrans.
     * @return the HeadColorTrans
     */
    public String getHeadColorTrans() {
        if (getAttributeInternal(HEADCOLORTRANS) == null) {
            return "D";
        } else
            return (String) getAttributeInternal(HEADCOLORTRANS);

        //return (String) getAttributeInternal(HEADCOLORTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeadColorTrans.
     * @param value value to set the  HeadColorTrans
     */
    public void setHeadColorTrans(String value) {
        setAttributeInternal(HEADCOLORTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MarginDetailTrans.
     * @return the MarginDetailTrans
     */
    public String getMarginDetailTrans() {
        return (String) getAttributeInternal(MARGINDETAILTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MarginDetailTrans.
     * @param value value to set the  MarginDetailTrans
     */
    public void setMarginDetailTrans(String value) {
        setAttributeInternal(MARGINDETAILTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgViewTrans.
     * @return the OrgViewTrans
     */
    public String getOrgViewTrans() {
        return (String) getAttributeInternal(ORGVIEWTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgViewTrans.
     * @param value value to set the  OrgViewTrans
     */
    public void setOrgViewTrans(String value) {
        setAttributeInternal(ORGVIEWTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RptDownCBTrans.
     * @return the RptDownCBTrans
     */
    public String getRptDownCBTrans() {
        return (String) getAttributeInternal(RPTDOWNCBTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RptDownCBTrans.
     * @param value value to set the  RptDownCBTrans
     */
    public void setRptDownCBTrans(String value) {
        setAttributeInternal(RPTDOWNCBTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute QCTestCertCBTrans.
     * @return the QCTestCertCBTrans
     */
    public String getQCTestCertCBTrans() {
        return (String) getAttributeInternal(QCTESTCERTCBTRANS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute QCTestCertCBTrans.
     * @param value value to set the  QCTestCertCBTrans
     */
    public void setQCTestCertCBTrans(String value) {
        setAttributeInternal(QCTESTCERTCBTRANS, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovRptAppVO1.
     */
    public RowSet getLovRptAppVO1() {
        return getRefreshedAppRptLOV();
        // return (RowSet) getAttributeInternal(LOVRPTAPPVO1);
    }

    RowSet getRefreshedAppRptLOV() {
        LovRptAppVOImpl LovVo = (LovRptAppVOImpl) ((RowSet) getAttributeInternal(LOVRPTAPPVO1)).getViewObject();
        LovVo.executeQuery();
        return LovVo.getRowSet();
    }
}

