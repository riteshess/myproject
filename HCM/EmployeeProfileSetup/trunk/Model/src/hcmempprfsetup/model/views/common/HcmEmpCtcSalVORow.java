package hcmempprfsetup.model.views.common;

import oracle.jbo.Row;
import oracle.jbo.domain.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Oct 29 10:57:37 IST 2015
// ---------------------------------------------------------------------
public interface HcmEmpCtcSalVORow extends Row
{
    String getCldId();

    void setCldId(String value);

    oracle.jbo.domain.Number getCompAmt();

    void setCompAmt(oracle.jbo.domain.Number value);

    Integer getCompBehav();

    void setCompBehav(Integer value);

    String getCompId();

    void setCompId(String value);

    String getCompType();

    void setCompType(String value);

    oracle.jbo.domain.Number getCompVal();

    void setCompVal(oracle.jbo.domain.Number value);

    String getDocId();

    void setDocId(String value);

    oracle.jbo.domain.Number getEmpCode();

    void setEmpCode(oracle.jbo.domain.Number value);

    String getHoOrgId();

    void setHoOrgId(String value);

    String getOrgId();

    void setOrgId(String value);

    Integer getSlocId();

    void setSlocId(Integer value);

    Integer getUsrIdCreate();

    void setUsrIdCreate(Integer value);

    Timestamp getUsrIdCreateDt();

    void setUsrIdCreateDt(Timestamp value);

    Integer getUsrIdMod();

    void setUsrIdMod(Integer value);

    Timestamp getUsrIdModDt();

    void setUsrIdModDt(Timestamp value);

    Timestamp getValidEndDt();

    void setValidEndDt(Timestamp value);

    Timestamp getValidStrtDt();

    void setValidStrtDt(Timestamp value);

    Integer getDedId();

    void setDedId(Integer value);

}

