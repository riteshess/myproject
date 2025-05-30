package hcmempprfsetup.model.views;

import hcmempprfsetup.model.entities.HcmEmpSalSubEOImpl;

import hcmempprfsetup.model.modules.HcmEmpPrfAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 09 15:10:49 IST 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class HcmEmpSubSalVORowImpl extends ViewRowImpl
{


    public static final int ENTITY_HCMEMPSALSUBEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum
    {
        CldId,
        DocId,
        HoOrgId,
        OrgId,
        SalBehav,
        SalId,
        SalType,
        SlocId,
        SubSalId,
        UsrIdCreate,
        UsrIdCreateDt,
        UsrIdMod,
        UsrIdModDt,
        SubSalAmt,
        TransSalNm,
        TransSubSalNm,
        LovSalIdVO1,
        LovSubSalTypeVO1;
        static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        public int index()
        {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex()
        {
            return firstIndex;
        }

        public static int count()
        {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues()
        {
            if (vals == null)
            {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int SALBEHAV = AttributesEnum.SalBehav.index();
    public static final int SALID = AttributesEnum.SalId.index();
    public static final int SALTYPE = AttributesEnum.SalType.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int SUBSALID = AttributesEnum.SubSalId.index();
    public static final int USRIDCREATE = AttributesEnum.UsrIdCreate.index();
    public static final int USRIDCREATEDT = AttributesEnum.UsrIdCreateDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int USRIDMODDT = AttributesEnum.UsrIdModDt.index();
    public static final int SUBSALAMT = AttributesEnum.SubSalAmt.index();
    public static final int TRANSSALNM = AttributesEnum.TransSalNm.index();
    public static final int TRANSSUBSALNM = AttributesEnum.TransSubSalNm.index();
    public static final int LOVSALIDVO1 = AttributesEnum.LovSalIdVO1.index();
    public static final int LOVSUBSALTYPEVO1 = AttributesEnum.LovSubSalTypeVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public HcmEmpSubSalVORowImpl()
    {
    }

    /**
     * Gets HcmEmpSalSubEO entity object.
     * @return the HcmEmpSalSubEO
     */
    public HcmEmpSalSubEOImpl getHcmEmpSalSubEO()
    {
        return (HcmEmpSalSubEOImpl) getEntity(ENTITY_HCMEMPSALSUBEO);
    }

    /**
     * Gets the attribute value for CLD_ID using the alias name CldId.
     * @return the CLD_ID
     */
    public String getCldId()
    {
        return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as attribute value for CLD_ID using the alias name CldId.
     * @param value value to set the CLD_ID
     */
    public void setCldId(String value)
    {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for DOC_ID using the alias name DocId.
     * @return the DOC_ID
     */
    public String getDocId()
    {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for DOC_ID using the alias name DocId.
     * @param value value to set the DOC_ID
     */
    public void setDocId(String value)
    {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @return the HO_ORG_ID
     */
    public String getHoOrgId()
    {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for HO_ORG_ID using the alias name HoOrgId.
     * @param value value to set the HO_ORG_ID
     */
    public void setHoOrgId(String value)
    {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public String getOrgId()
    {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(String value)
    {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for SAL_BEHAV using the alias name SalBehav.
     * @return the SAL_BEHAV
     */
    public Integer getSalBehav()
    {
        return (Integer) getAttributeInternal(SALBEHAV);
    }

    /**
     * Sets <code>value</code> as attribute value for SAL_BEHAV using the alias name SalBehav.
     * @param value value to set the SAL_BEHAV
     */
    public void setSalBehav(Integer value)
    {
        setAttributeInternal(SALBEHAV, value);
    }

    /**
     * Gets the attribute value for SAL_ID using the alias name SalId.
     * @return the SAL_ID
     */
    public String getSalId()
    {
        return (String) getAttributeInternal(SALID);
    }

    /**
     * Sets <code>value</code> as attribute value for SAL_ID using the alias name SalId.
     * @param value value to set the SAL_ID
     */
    public void setSalId(String value)
    {
        setAttributeInternal(SALID, value);
    }

    /**
     * Gets the attribute value for SAL_TYPE using the alias name SalType.
     * @return the SAL_TYPE
     */
    public String getSalType()
    {
        return (String) getAttributeInternal(SALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for SAL_TYPE using the alias name SalType.
     * @param value value to set the SAL_TYPE
     */
    public void setSalType(String value)
    {
        setAttributeInternal(SALTYPE, value);
    }

    /**
     * Gets the attribute value for SLOC_ID using the alias name SlocId.
     * @return the SLOC_ID
     */
    public Integer getSlocId()
    {
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as attribute value for SLOC_ID using the alias name SlocId.
     * @param value value to set the SLOC_ID
     */
    public void setSlocId(Integer value)
    {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for SUB_SAL_ID using the alias name SubSalId.
     * @return the SUB_SAL_ID
     */
    public String getSubSalId()
    {
        return (String) getAttributeInternal(SUBSALID);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_SAL_ID using the alias name SubSalId.
     * @param value value to set the SUB_SAL_ID
     */
    public void setSubSalId(String value)
    {
        setAttributeInternal(SUBSALID, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @return the USR_ID_CREATE
     */
    public Integer getUsrIdCreate()
    {
        return (Integer) getAttributeInternal(USRIDCREATE);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE using the alias name UsrIdCreate.
     * @param value value to set the USR_ID_CREATE
     */
    public void setUsrIdCreate(Integer value)
    {
        setAttributeInternal(USRIDCREATE, value);
    }

    /**
     * Gets the attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @return the USR_ID_CREATE_DT
     */
    public Timestamp getUsrIdCreateDt()
    {
        return (Timestamp) getAttributeInternal(USRIDCREATEDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_CREATE_DT using the alias name UsrIdCreateDt.
     * @param value value to set the USR_ID_CREATE_DT
     */
    public void setUsrIdCreateDt(Timestamp value)
    {
        setAttributeInternal(USRIDCREATEDT, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @return the USR_ID_MOD
     */
    public Integer getUsrIdMod()
    {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD using the alias name UsrIdMod.
     * @param value value to set the USR_ID_MOD
     */
    public void setUsrIdMod(Integer value)
    {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @return the USR_ID_MOD_DT
     */
    public Timestamp getUsrIdModDt()
    {
        return (Timestamp) getAttributeInternal(USRIDMODDT);
    }

    /**
     * Sets <code>value</code> as attribute value for USR_ID_MOD_DT using the alias name UsrIdModDt.
     * @param value value to set the USR_ID_MOD_DT
     */
    public void setUsrIdModDt(Timestamp value)
    {
        setAttributeInternal(USRIDMODDT, value);
    }

    /**
     * Gets the attribute value for SUB_SAL_AMT using the alias name SubSalAmt.
     * @return the SUB_SAL_AMT
     */
    public Number getSubSalAmt()
    {
        return (Number) getAttributeInternal(SUBSALAMT);
    }

    /**
     * Sets <code>value</code> as attribute value for SUB_SAL_AMT using the alias name SubSalAmt.
     * @param value value to set the SUB_SAL_AMT
     */
    public void setSubSalAmt(Number value)
    {
        setAttributeInternal(SUBSALAMT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSalNm.
     * @return the TransSalNm
     */
    public String getTransSalNm()
    {

        if (this.getSalId() != null)
        {
            HcmEmpPrfAMImpl am = (HcmEmpPrfAMImpl) this.getApplicationModule();
            am.getLovSalId().setNamedWhereClauseParam("cldIdBindVar", getCldId());
            am.getLovSalId().setNamedWhereClauseParam("hoOrgIdBindVar", getHoOrgId());
            am.getLovSalId().setNamedWhereClauseParam("orgIdBindVar", getOrgId());
            am.getLovSalId().setNamedWhereClauseParam("slocIdBindVar", getSlocId());
            am.getLovSalId().executeQuery();
            Row[] fr = am.getLovSalId().getFilteredRows("SalId", this.getSalId());
            if (fr.length > 0)
                return (String) fr[0].getAttribute("SalDesc");
        }

        return (String) getAttributeInternal(TRANSSALNM);

    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSalNm.
     * @param value value to set the  TransSalNm
     */
    public void setTransSalNm(String value)
    {
        setAttributeInternal(TRANSSALNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TransSubSalNm.
     * @return the TransSubSalNm
     */
    public String getTransSubSalNm()
    {
        
        if (this.getSubSalId() != null)
        {
            HcmEmpPrfAMImpl am = (HcmEmpPrfAMImpl) this.getApplicationModule();
            am.getLovSubSalType().setNamedWhereClauseParam("BINDCLD_ID", getCldId());
            am.getLovSubSalType().setNamedWhereClauseParam("BINDHO_ORG_ID", getHoOrgId());
            am.getLovSubSalType().setNamedWhereClauseParam("BINDORG_ID", getOrgId());
            am.getLovSubSalType().setNamedWhereClauseParam("BINDSLOC_ID", getSlocId());
            am.getLovSubSalType().setNamedWhereClauseParam("BINDSAL_ID", getSalId());
            am.getLovSubSalType().executeQuery();
            Row[] fr = am.getLovSubSalType().getFilteredRows("SubSalId", this.getSubSalId());
            if (fr.length > 0)
                return (String) fr[0].getAttribute("ParamDesc");
        }
        return (String) getAttributeInternal(TRANSSUBSALNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TransSubSalNm.
     * @param value value to set the  TransSubSalNm
     */
    public void setTransSubSalNm(String value)
    {
        setAttributeInternal(TRANSSUBSALNM, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovSalIdVO1.
     */
    public RowSet getLovSalIdVO1()
    {
        return (RowSet) getAttributeInternal(LOVSALIDVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovSubSalTypeVO1.
     */
    public RowSet getLovSubSalTypeVO1()
    {
        return (RowSet) getAttributeInternal(LOVSUBSALTYPEVO1);
    }
}

