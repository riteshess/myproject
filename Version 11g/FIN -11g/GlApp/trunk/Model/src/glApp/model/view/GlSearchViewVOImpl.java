package glApp.model.view;

import glApp.model.module.GlAppAMImpl;
import glApp.model.view.common.GlSearchViewVO;

import java.sql.ResultSet;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.ViewCriteria;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 04 12:52:41 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlSearchViewVOImpl extends ViewObjectImpl implements GlSearchViewVO {
    /**
     * This is the default constructor (do not remove).
     */
    public GlSearchViewVOImpl() {
    }

    /**
     * Returns the bind variable value for BindSlocId.
     * @return bind variable value for BindSlocId
     */
    public Integer getBindSlocId() {        
        return (Integer)getNamedWhereClauseParam("BindSlocId");
    }

    /**
     * Sets <code>value</code> for bind variable BindSlocId.
     * @param value value to bind as BindSlocId
     */
    public void setBindSlocId(Integer value) {
        setNamedWhereClauseParam("BindSlocId", value);
    }


    /**
     * Returns the bind variable value for BindOrgId.
     * @return bind variable value for BindOrgId
     */
    public String getBindOrgId() {
        return (String)getNamedWhereClauseParam("BindOrgId");
    }

    /**
     * Sets <code>value</code> for bind variable BindOrgId.
     * @param value value to bind as BindOrgId
     */
    public void setBindOrgId(String value) {
        setNamedWhereClauseParam("BindOrgId", value);
    }

    /**
     * Returns the bind variable value for BindFromDate.
     * @return bind variable value for BindFromDate
     */
    public Date getBindFromDate() {
        return (Date)getNamedWhereClauseParam("BindFromDate");
    }

    /**
     * Sets <code>value</code> for bind variable BindFromDate.
     * @param value value to bind as BindFromDate
     */
    public void setBindFromDate(Date value) {
        setNamedWhereClauseParam("BindFromDate", value);
    }

    /**
     * Returns the bind variable value for BindToDate.
     * @return bind variable value for BindToDate
     */
    public Date getBindToDate() {
        return (Date)getNamedWhereClauseParam("BindToDate");
    }

    /**
     * Sets <code>value</code> for bind variable BindToDate.
     * @param value value to bind as BindToDate
     */
    public void setBindToDate(Date value) {
        setNamedWhereClauseParam("BindToDate", value);
    }

    /**
     * Returns the bind variable value for BindVoutype.
     * @return bind variable value for BindVoutype
     */
    public Integer getBindVoutype() {
        return (Integer)getNamedWhereClauseParam("BindVoutype");
    }

    /**
     * Sets <code>value</code> for bind variable BindVoutype.
     * @param value value to bind as BindVoutype
     */
    public void setBindVoutype(Integer value) {
        setNamedWhereClauseParam("BindVoutype", value);
    }

    /**
     * Returns the bind variable value for BindVouSubType.
     * @return bind variable value for BindVouSubType
     */
    public Integer getBindVouSubType() {
        return (Integer)getNamedWhereClauseParam("BindVouSubType");
    }

    /**
     * Sets <code>value</code> for bind variable BindVouSubType.
     * @param value value to bind as BindVouSubType
     */
    public void setBindVouSubType(Integer value) {
        setNamedWhereClauseParam("BindVouSubType", value);
    }

    /**
     * Returns the bind variable value for BindCurrIdBs.
     * @return bind variable value for BindCurrIdBs
     */
    public Integer getBindCurrIdBs() {
        return (Integer)getNamedWhereClauseParam("BindCurrIdBs");
    }

    /**
     * Sets <code>value</code> for bind variable BindCurrIdBs.
     * @param value value to bind as BindCurrIdBs
     */
    public void setBindCurrIdBs(Integer value) {
        setNamedWhereClauseParam("BindCurrIdBs", value);
    }

    /**
     * Returns the bind variable value for BindVouStat.
     * @return bind variable value for BindVouStat
     */
    public String getBindVouStat() {
        return (String)getNamedWhereClauseParam("BindVouStat");
    }

    /**
     * Sets <code>value</code> for bind variable BindVouStat.
     * @param value value to bind as BindVouStat
     */
    public void setBindVouStat(String value) {
        setNamedWhereClauseParam("BindVouStat", value);
    }

    /**
     * Returns the bind variable value for BindAmtFrom.
     * @return bind variable value for BindAmtFrom
     */
    public Number getBindAmtFrom() {
        return (Number)getNamedWhereClauseParam("BindAmtFrom");
    }

    /**
     * Sets <code>value</code> for bind variable BindAmtFrom.
     * @param value value to bind as BindAmtFrom
     */
    public void setBindAmtFrom(Number value) {
        setNamedWhereClauseParam("BindAmtFrom", value);
    }

    /**
     * Returns the bind variable value for BindAmtTo.
     * @return bind variable value for BindAmtTo
     */
    public Number getBindAmtTo() {
        return (Number)getNamedWhereClauseParam("BindAmtTo");
    }

    /**
     * Sets <code>value</code> for bind variable BindAmtTo.
     * @param value value to bind as BindAmtTo
     */
    public void setBindAmtTo(Number value) {
        setNamedWhereClauseParam("BindAmtTo", value);
    }

    /**
     * Returns the bind variable value for BindCoaId.
     * @return bind variable value for BindCoaId
     */
    public Integer getBindCoaId() {
        return (Integer)getNamedWhereClauseParam("BindCoaId");
    }

    /**
     * Sets <code>value</code> for bind variable BindCoaId.
     * @param value value to bind as BindCoaId
     */
    public void setBindCoaId(Integer value) {
        setNamedWhereClauseParam("BindCoaId", value);
    }

    /**
     * Returns the bind variable value for BindCogId.
     * @return bind variable value for BindCogId
     */
    public String getBindCogId() {
        return (String)getNamedWhereClauseParam("BindCogId");
    }

    /**
     * Sets <code>value</code> for bind variable BindCogId.
     * @param value value to bind as BindCogId
     */
    public void setBindCogId(String value) {
        setNamedWhereClauseParam("BindCogId", value);
    }

    /**
     * Returns the bind variable value for BindNaId.
     * @return bind variable value for BindNaId
     */
    public Integer getBindNaId() {
        return (Integer)getNamedWhereClauseParam("BindNaId");
    }

    /**
     * Sets <code>value</code> for bind variable BindNaId.
     * @param value value to bind as BindNaId
     */
    public void setBindNaId(Integer value) {
        setNamedWhereClauseParam("BindNaId", value);
    }

    /**
     * Returns the bind variable value for BindEoId.
     * @return bind variable value for BindEoId
     */
    public Integer getBindEoId() {
        return (Integer)getNamedWhereClauseParam("BindEoId");
    }

    /**
     * Sets <code>value</code> for bind variable BindEoId.
     * @param value value to bind as BindEoId
     */
    public void setBindEoId(Integer value) {
        setNamedWhereClauseParam("BindEoId", value);
    }

    /**
     * Returns the bind variable value for BindEoMstid.
     * @return bind variable value for BindEoMstid
     */
    public Integer getBindEoMstid() {
        return (Integer)getNamedWhereClauseParam("BindEoMstid");
    }

    /**
     * Sets <code>value</code> for bind variable BindEoMstid.
     * @param value value to bind as BindEoMstid
     */
     public Object resolvElDC(String data) {
         FacesContext fc = FacesContext.getCurrentInstance();
         Application app = fc.getApplication();
         ExpressionFactory elFactory = app.getExpressionFactory();
         ELContext elContext = fc.getELContext();
         ValueExpression valueExp =
             elFactory.createValueExpression(elContext, "#{data." + data + ".dataProvider}", Object.class);
         return valueExp.getValue(elContext);
     }
        public String resolvEl(String data){
            FacesContext fc = FacesContext.getCurrentInstance();
            Application app = fc.getApplication();
            ExpressionFactory elFactory = app.getExpressionFactory();
            ELContext elContext = fc.getELContext();
            ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
            String Message=valueExp.getValue(elContext).toString();
            return Message;
          }
    public void setBindEoMstid(Integer value) {
        setNamedWhereClauseParam("BindEoMstid", value);
    }
    public void filterCoa(String org_id, String sloc_id){
    GlAppAMImpl am = (GlAppAMImpl)resolvElDC("GlAppAMDataControl");  
   // System.out.println("OrgId from VO RowImpl--->"+org_id);
    //am.getLovCoa1().setWhereClause("ORG_ID='"+org_id+"'");
        String orgid=resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}");
                String cldid=resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}");
                Integer slocid=Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}"));
                String hoorgid=resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}");
        ViewObjectImpl coa = am.getLovCoa1();
        ViewObjectImpl vo=am.getGlLines1();
        if(orgid!=null)
                coa.setNamedWhereClauseParam("orgidbind",orgid );
                if(cldid!=null)
                    coa.setNamedWhereClauseParam("cldidbind",cldid );       
                if(slocid!=null)
                   coa.setNamedWhereClauseParam("slocidbind",slocid ); 
                if(hoorgid!=null)
                    coa.setNamedWhereClauseParam("hoorgbind",hoorgid );
                if(vo.getCurrentRow()!=null){
                if(vo.getCurrentRow().getAttribute("GlCoaId")!=null)
                coa.setNamedWhereClauseParam("coaidbind",vo.getCurrentRow().getAttribute("GlCoaId"));
                }
        
                coa.executeQuery();    
        
        LovVouIdVOImpl lovVouId = (LovVouIdVOImpl)am.getLovVouId1();
        ViewCriteria  vc = lovVouId.getViewCriteria("LovVouIdVOCriteria");
        ViewObjectImpl vo1=am.getGlAdjTmp1();
//            String voucherId = vo1.getCurrentRow().getAttribute("RadjVouId").toString();
       //     System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<voucherId = >>>>>>>>>>>>>>>>>>"+voucherId);
        if(vo1.getCurrentRow()!=null)
        {
            if(vo1.getCurrentRow().getAttribute("RadjVouId")!=null)
            lovVouId.setNamedWhereClauseParam("vouidbind", vo1.getCurrentRow().getAttribute("RadjVouId"));
        }
        if(slocid!=null)
        {
        lovVouId.setNamedWhereClauseParam("slocidbind", slocid);
        }
        if(orgid!=null)
        {
        lovVouId.setNamedWhereClauseParam("orgidbind", orgid);
        }
        if(cldid!=null)
        {
        lovVouId.setNamedWhereClauseParam("cldidbind", cldid);
        }
        
        lovVouId.applyViewCriteria(vc);
        lovVouId.executeQuery(); 
    
    }
    /**
     * Returns the bind variable value for BindCldId.
     * @return bind variable value for BindCldId
     */
    public String getBindCldId() {
        return (String)getNamedWhereClauseParam("BindCldId");
    }

    /**
     * Sets <code>value</code> for bind variable BindCldId.
     * @param value value to bind as BindCldId
     */
    public void setBindCldId(String value) {
        setNamedWhereClauseParam("BindCldId", value);
    }

    /**
     * executeQueryForCollection - overridden for custom java data source support.
     */
    protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
        System.out.println("--------------------------------1");
        //System.out.println("Hit count : "+super.getEstimatedRowCount());
            short fetchSize = 10;
                if (this.getRangeSize() > 0) {
                   fetchSize = ((short)(this.getRangeSize() + 3));
               }
               //System.out.println("Range size is :"+this.getRangeSize());
               if (this.getRangeSize() < 10) {
                   //System.out.println("Potentially small range size : " + this.getRangeSize() + " for table VO : " +
                     //          this.getViewObject().getDefFullName());
                   fetchSize = 10;
               }
         
              // System.out.println("Original fetch size : " + this.getFetchSize() + ", Updated fetch size : " + fetchSize +
                       //    " for : " + this.getViewObject().getDefFullName());
               if (fetchSize > this.getFetchSize()) {
                //   System.out.println("Updating fetch size : " + fetchSize);
                   this.setFetchSize(fetchSize);
               } else {
                   System.out.println("Current fetch size : " + this.getFetchSize() + " for : " +
                               this.getViewObject().getDefFullName());
               } 
         
               long init = System.currentTimeMillis();
               super.executeQueryForCollection(qc, params, noUserParams);
               long end = System.currentTimeMillis() - init;
               // System.out.println("Time taken to execute the query :"+end);
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
   

    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        //System.out.println("--------------------------------2");
        long value = super.getQueryHitCount(viewRowSet);
        //System.out.println("hit count :"+value);
        return value;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        return value;
    }

    /**
     * Returns the bind variable value for BindDispID.
     * @return bind variable value for BindDispID
     */
    public String getBindDispID() {
        return (String)getNamedWhereClauseParam("BindDispID");
    }

    /**
     * Sets <code>value</code> for bind variable BindDispID.
     * @param value value to bind as BindDispID
     */
    public void setBindDispID(String value) {
        setNamedWhereClauseParam("BindDispID", value);
    }
}
