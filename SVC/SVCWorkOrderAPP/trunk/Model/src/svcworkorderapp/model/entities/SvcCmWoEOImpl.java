package svcworkorderapp.model.entities;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.sql.Types;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.AttributeList;
import oracle.jbo.JboException;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 17 15:05:25 PDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SvcCmWoEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CldId,
        SlocId,
        HoOrgId,
        OrgId,
        DocId,
        DocDt,
        FyId,
        DocType,
        DocNo,
        DocIdCm,
        DocStat,
        AuthStat,
        DispToCust,
        CustDispDt,
        CustAuthDt,
        TaxAfterDiscFlg,
        DiscType,
        DiscVal,
        DiscAmtSp,
        TaxAmtSp,
        TotAmtSp,
        DiscAmtBs,
        TaxAmtBs,
        TotAmtBs,
        UsrIdCrt,
        CrtDt,
        UsrIdMod,
        ModDt,
        TaxRuleFlg,
        CurrIdSp,
        CurrConvFctr,
        WorkComplete,
        SvcCmWoItm,
        SvcCmWoOc,
        SvcCmWoSrc;
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
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int FYID = AttributesEnum.FyId.index();
    public static final int DOCTYPE = AttributesEnum.DocType.index();
    public static final int DOCNO = AttributesEnum.DocNo.index();
    public static final int DOCIDCM = AttributesEnum.DocIdCm.index();
    public static final int DOCSTAT = AttributesEnum.DocStat.index();
    public static final int AUTHSTAT = AttributesEnum.AuthStat.index();
    public static final int DISPTOCUST = AttributesEnum.DispToCust.index();
    public static final int CUSTDISPDT = AttributesEnum.CustDispDt.index();
    public static final int CUSTAUTHDT = AttributesEnum.CustAuthDt.index();
    public static final int TAXAFTERDISCFLG = AttributesEnum.TaxAfterDiscFlg.index();
    public static final int DISCTYPE = AttributesEnum.DiscType.index();
    public static final int DISCVAL = AttributesEnum.DiscVal.index();
    public static final int DISCAMTSP = AttributesEnum.DiscAmtSp.index();
    public static final int TAXAMTSP = AttributesEnum.TaxAmtSp.index();
    public static final int TOTAMTSP = AttributesEnum.TotAmtSp.index();
    public static final int DISCAMTBS = AttributesEnum.DiscAmtBs.index();
    public static final int TAXAMTBS = AttributesEnum.TaxAmtBs.index();
    public static final int TOTAMTBS = AttributesEnum.TotAmtBs.index();
    public static final int USRIDCRT = AttributesEnum.UsrIdCrt.index();
    public static final int CRTDT = AttributesEnum.CrtDt.index();
    public static final int USRIDMOD = AttributesEnum.UsrIdMod.index();
    public static final int MODDT = AttributesEnum.ModDt.index();
    public static final int TAXRULEFLG = AttributesEnum.TaxRuleFlg.index();
    public static final int CURRIDSP = AttributesEnum.CurrIdSp.index();
    public static final int CURRCONVFCTR = AttributesEnum.CurrConvFctr.index();
    public static final int WORKCOMPLETE = AttributesEnum.WorkComplete.index();
    public static final int SVCCMWOITM = AttributesEnum.SvcCmWoItm.index();
    public static final int SVCCMWOOC = AttributesEnum.SvcCmWoOc.index();
    public static final int SVCCMWOSRC = AttributesEnum.SvcCmWoSrc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SvcCmWoEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("svcworkorderapp.model.entities.SvcCmWoEO");
    }


    /**
     * Gets the attribute value for CldId, using the alias name CldId.
     * @return the value of CldId
     */
    public String getCldId() {
        return (String) getAttributeInternal(CLDID);
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
        return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SlocId.
     * @param value value to set the SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for HoOrgId, using the alias name HoOrgId.
     * @return the value of HoOrgId
     */
    public String getHoOrgId() {
        return (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HoOrgId.
     * @param value value to set the HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the value of OrgId
     */
    public String getOrgId() {
        return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for DocId, using the alias name DocId.
     * @return the value of DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocId.
     * @param value value to set the DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for DocDt, using the alias name DocDt.
     * @return the value of DocDt
     */
    public Timestamp getDocDt() {
        return (Timestamp) getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocDt.
     * @param value value to set the DocDt
     */
    public void setDocDt(Timestamp value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for FyId, using the alias name FyId.
     * @return the value of FyId
     */
    public Integer getFyId() {
        return (Integer) getAttributeInternal(FYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FyId.
     * @param value value to set the FyId
     */
    public void setFyId(Integer value) {
        setAttributeInternal(FYID, value);
    }

    /**
     * Gets the attribute value for DocType, using the alias name DocType.
     * @return the value of DocType
     */
    public Integer getDocType() {
        return (Integer) getAttributeInternal(DOCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocType.
     * @param value value to set the DocType
     */
    public void setDocType(Integer value) {
        setAttributeInternal(DOCTYPE, value);
    }

    /**
     * Gets the attribute value for DocNo, using the alias name DocNo.
     * @return the value of DocNo
     */
    public String getDocNo() {
        return (String) getAttributeInternal(DOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocNo.
     * @param value value to set the DocNo
     */
    public void setDocNo(String value) {
        setAttributeInternal(DOCNO, value);
    }

    /**
     * Gets the attribute value for DocIdCm, using the alias name DocIdCm.
     * @return the value of DocIdCm
     */
    public String getDocIdCm() {
        return (String) getAttributeInternal(DOCIDCM);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocIdCm.
     * @param value value to set the DocIdCm
     */
    public void setDocIdCm(String value) {
        setAttributeInternal(DOCIDCM, value);
    }

    /**
     * Gets the attribute value for DocStat, using the alias name DocStat.
     * @return the value of DocStat
     */
    public Integer getDocStat() {
        return (Integer) getAttributeInternal(DOCSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocStat.
     * @param value value to set the DocStat
     */
    public void setDocStat(Integer value) {
        setAttributeInternal(DOCSTAT, value);
    }

    /**
     * Gets the attribute value for AuthStat, using the alias name AuthStat.
     * @return the value of AuthStat
     */
    public String getAuthStat() {
        return (String) getAttributeInternal(AUTHSTAT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AuthStat.
     * @param value value to set the AuthStat
     */
    public void setAuthStat(String value) {
        setAttributeInternal(AUTHSTAT, value);
    }

    /**
     * Gets the attribute value for DispToCust, using the alias name DispToCust.
     * @return the value of DispToCust
     */
    public String getDispToCust() {
        return (String) getAttributeInternal(DISPTOCUST);
    }

    /**
     * Sets <code>value</code> as the attribute value for DispToCust.
     * @param value value to set the DispToCust
     */
    public void setDispToCust(String value) {
        setAttributeInternal(DISPTOCUST, value);
    }

    /**
     * Gets the attribute value for CustDispDt, using the alias name CustDispDt.
     * @return the value of CustDispDt
     */
    public Timestamp getCustDispDt() {
        return (Timestamp) getAttributeInternal(CUSTDISPDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustDispDt.
     * @param value value to set the CustDispDt
     */
    public void setCustDispDt(Timestamp value) {
        setAttributeInternal(CUSTDISPDT, value);
    }

    /**
     * Gets the attribute value for CustAuthDt, using the alias name CustAuthDt.
     * @return the value of CustAuthDt
     */
    public Timestamp getCustAuthDt() {
        return (Timestamp) getAttributeInternal(CUSTAUTHDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustAuthDt.
     * @param value value to set the CustAuthDt
     */
    public void setCustAuthDt(Timestamp value) {
        setAttributeInternal(CUSTAUTHDT, value);
    }

    /**
     * Gets the attribute value for TaxAfterDiscFlg, using the alias name TaxAfterDiscFlg.
     * @return the value of TaxAfterDiscFlg
     */
    public String getTaxAfterDiscFlg() {
        return (String) getAttributeInternal(TAXAFTERDISCFLG);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAfterDiscFlg.
     * @param value value to set the TaxAfterDiscFlg
     */
    public void setTaxAfterDiscFlg(String value) {
        setAttributeInternal(TAXAFTERDISCFLG, value);
    }

    /**
     * Gets the attribute value for DiscType, using the alias name DiscType.
     * @return the value of DiscType
     */
    public String getDiscType() {
        return (String) getAttributeInternal(DISCTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscType.
     * @param value value to set the DiscType
     */
    public void setDiscType(String value) {
        setAttributeInternal(DISCTYPE, value);
    }

    /**
     * Gets the attribute value for DiscVal, using the alias name DiscVal.
     * @return the value of DiscVal
     */
    public Number getDiscVal() {
        return (Number) getAttributeInternal(DISCVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscVal.
     * @param value value to set the DiscVal
     */
    public void setDiscVal(Number value) {
        setAttributeInternal(DISCVAL, value);
    }

    /**
     * Gets the attribute value for DiscAmtSp, using the alias name DiscAmtSp.
     * @return the value of DiscAmtSp
     */
    public Number getDiscAmtSp() {
        return (Number) getAttributeInternal(DISCAMTSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscAmtSp.
     * @param value value to set the DiscAmtSp
     */
    public void setDiscAmtSp(Number value) {
        setAttributeInternal(DISCAMTSP, value);
    }

    /**
     * Gets the attribute value for TaxAmtSp, using the alias name TaxAmtSp.
     * @return the value of TaxAmtSp
     */
    public Number getTaxAmtSp() {
        return (Number) getAttributeInternal(TAXAMTSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAmtSp.
     * @param value value to set the TaxAmtSp
     */
    public void setTaxAmtSp(Number value) {
        setAttributeInternal(TAXAMTSP, value);
    }

    /**
     * Gets the attribute value for TotAmtSp, using the alias name TotAmtSp.
     * @return the value of TotAmtSp
     */
    public Number getTotAmtSp() {
        return (Number) getAttributeInternal(TOTAMTSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotAmtSp.
     * @param value value to set the TotAmtSp
     */
    public void setTotAmtSp(Number value) {
        setAttributeInternal(TOTAMTSP, value);
    }

    /**
     * Gets the attribute value for DiscAmtBs, using the alias name DiscAmtBs.
     * @return the value of DiscAmtBs
     */
    public Number getDiscAmtBs() {
        return (Number) getAttributeInternal(DISCAMTBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscAmtBs.
     * @param value value to set the DiscAmtBs
     */
    public void setDiscAmtBs(Number value) {
        setAttributeInternal(DISCAMTBS, value);
    }

    /**
     * Gets the attribute value for TaxAmtBs, using the alias name TaxAmtBs.
     * @return the value of TaxAmtBs
     */
    public Number getTaxAmtBs() {
        return (Number) getAttributeInternal(TAXAMTBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAmtBs.
     * @param value value to set the TaxAmtBs
     */
    public void setTaxAmtBs(Number value) {
        setAttributeInternal(TAXAMTBS, value);
    }

    /**
     * Gets the attribute value for TotAmtBs, using the alias name TotAmtBs.
     * @return the value of TotAmtBs
     */
    public Number getTotAmtBs() {
        return (Number) getAttributeInternal(TOTAMTBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotAmtBs.
     * @param value value to set the TotAmtBs
     */
    public void setTotAmtBs(Number value) {
        setAttributeInternal(TOTAMTBS, value);
    }

    /**
     * Gets the attribute value for UsrIdCrt, using the alias name UsrIdCrt.
     * @return the value of UsrIdCrt
     */
    public Integer getUsrIdCrt() {
        return (Integer) getAttributeInternal(USRIDCRT);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdCrt.
     * @param value value to set the UsrIdCrt
     */
    public void setUsrIdCrt(Integer value) {
        setAttributeInternal(USRIDCRT, value);
    }

    /**
     * Gets the attribute value for CrtDt, using the alias name CrtDt.
     * @return the value of CrtDt
     */
    public Timestamp getCrtDt() {
        return (Timestamp) getAttributeInternal(CRTDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CrtDt.
     * @param value value to set the CrtDt
     */
    public void setCrtDt(Timestamp value) {
        setAttributeInternal(CRTDT, value);
    }

    /**
     * Gets the attribute value for UsrIdMod, using the alias name UsrIdMod.
     * @return the value of UsrIdMod
     */
    public Integer getUsrIdMod() {
        return (Integer) getAttributeInternal(USRIDMOD);
    }

    /**
     * Sets <code>value</code> as the attribute value for UsrIdMod.
     * @param value value to set the UsrIdMod
     */
    public void setUsrIdMod(Integer value) {
        setAttributeInternal(USRIDMOD, value);
    }

    /**
     * Gets the attribute value for ModDt, using the alias name ModDt.
     * @return the value of ModDt
     */
    public Timestamp getModDt() {
        return (Timestamp) getAttributeInternal(MODDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModDt.
     * @param value value to set the ModDt
     */
    public void setModDt(Timestamp value) {
        setAttributeInternal(MODDT, value);
    }

    /**
     * Gets the attribute value for TaxRuleFlg, using the alias name TaxRuleFlg.
     * @return the value of TaxRuleFlg
     */
    public String getTaxRuleFlg() {
        return (String) getAttributeInternal(TAXRULEFLG);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxRuleFlg.
     * @param value value to set the TaxRuleFlg
     */
    public void setTaxRuleFlg(String value) {
        setAttributeInternal(TAXRULEFLG, value);
    }

    /**
     * Gets the attribute value for CurrIdSp, using the alias name CurrIdSp.
     * @return the value of CurrIdSp
     */
    public Integer getCurrIdSp() {
        return (Integer) getAttributeInternal(CURRIDSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrIdSp.
     * @param value value to set the CurrIdSp
     */
    public void setCurrIdSp(Integer value) {
        setAttributeInternal(CURRIDSP, value);
    }

    /**
     * Gets the attribute value for CurrConvFctr, using the alias name CurrConvFctr.
     * @return the value of CurrConvFctr
     */
    public Number getCurrConvFctr() {
        return (Number) getAttributeInternal(CURRCONVFCTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for CurrConvFctr.
     * @param value value to set the CurrConvFctr
     */
    public void setCurrConvFctr(Number value) {
        setAttributeInternal(CURRCONVFCTR, value);
    }

    /**
     * Gets the attribute value for WorkComplete, using the alias name WorkComplete.
     * @return the value of WorkComplete
     */
    public String getWorkComplete() {
        return (String) getAttributeInternal(WORKCOMPLETE);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkComplete.
     * @param value value to set the WorkComplete
     */
    public void setWorkComplete(String value) {
        setAttributeInternal(WORKCOMPLETE, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSvcCmWoItm() {
        return (RowIterator) getAttributeInternal(SVCCMWOITM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSvcCmWoOc() {
        return (RowIterator) getAttributeInternal(SVCCMWOOC);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSvcCmWoSrc() {
        return (RowIterator) getAttributeInternal(SVCCMWOSRC);
    }


    /**
     * @param cldId key constituent
     * @param slocId key constituent
     * @param orgId key constituent
     * @param docId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String cldId, Integer slocId, String orgId, String docId) {
        return new Key(new Object[] { cldId, slocId, orgId, docId });
    }

    public String resolvEl(String data) {
             FacesContext fc = FacesContext.getCurrentInstance();
             Application app = fc.getApplication();
             ExpressionFactory elFactory = app.getExpressionFactory();
             ELContext elContext = fc.getELContext();
             ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
             String msg = valueExp.getValue(elContext).toString();
             return msg;
         }
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        
        /*  Integer usrId=Integer.parseInt( resolvEl("#{pageFlowScope.GLBL_APP_USR}").toString());
        String CldId= resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
        String OrgId= resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        String HoOrgId= resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        Integer SlocId=Integer.parseInt( resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        System.out.println("User Id:"+usrId+" "+CldId+" "+OrgId+" "+HoOrgId+" "+SlocId); */
       // /** for work order don num is  230004**/
        /*  String dcId =(String)(callStoredFunction(Types.VARCHAR, "App.get_txn_id (?,?,?,?,?)", new Object[] {usrId,OrgId,SlocId,new Integer(23004),CldId}));
        super.create(attributeList);
        System.out.println("DocId:"+dcId);
        setDocId(dcId);
        setDocDt(new Timestamp(System.currentTimeMillis()));
        setModDt(new Timestamp(System.currentTimeMillis()));
        setUsrIdMod(usrId);
        setOrgId(OrgId);
        setCldId(CldId);
        setSlocId(SlocId);
        setHoOrgId(HoOrgId);
        setUsrIdCrt(usrId);
        setDocStat(81);
        setCrtDt(new Timestamp(System.currentTimeMillis()));
     Integer fyid =(Integer)(callStoredFunction(Types.INTEGER, "App.get_org_fy_id(?,?,?)",new Object[] {CldId,OrgId,new Timestamp(System.currentTimeMillis())}));
    
    setFyId(fyid);
    System.out.println("Financial id:"+fyid); */
    }
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
          CallableStatement st = null;
          try {
              //PurOrderAMImpl am = (PurOrderAMImpl)resolvElDC("PurOrderAMDataControl");
               st = getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
              st.registerOutParameter(1, sqlReturnType);
              if (bindVars != null) {
                  for (int z = 0; z < bindVars.length; z++) {
                      st.setObject(z + 2, bindVars[z]);
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
        super.doDML(operation, e);
    }
}

