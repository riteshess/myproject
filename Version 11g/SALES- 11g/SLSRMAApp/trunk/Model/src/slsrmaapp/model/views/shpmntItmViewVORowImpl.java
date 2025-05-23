package slsrmaapp.model.views;

import java.sql.Timestamp;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;

import slsrmaapp.model.services.SlsRmaAppAMImpl;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Dec 04 14:28:58 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class shpmntItmViewVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        EoId {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getEoId();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setEoId((Integer)value);
            }
        }
        ,
        WhId {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getWhId();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setWhId((String)value);
            }
        }
        ,
        DocId {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setDocId((String)value);
            }
        }
        ,
        DocDt {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getDocDt();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setDocDt((Timestamp)value);
            }
        }
        ,
        ShipmntQty {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getShipmntQty();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setShipmntQty((Number)value);
            }
        }
        ,
        ItmId {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItmId();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setItmId((String)value);
            }
        }
        ,
        ItmUom {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItmUom();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setItmUom((String)value);
            }
        }
        ,
        ItmPrice {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItmPrice();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setItmPrice((Number)value);
            }
        }
        ,
        ItmAmtSp {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItmAmtSp();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setItmAmtSp((Number)value);
            }
        }
        ,
        ItmAmtBs {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItmAmtBs();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setItmAmtBs((Number)value);
            }
        }
        ,
        CurrIdSp {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getCurrIdSp();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setCurrIdSp((Integer)value);
            }
        }
        ,
        CurrIdBs {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getCurrIdBs();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setCurrIdBs((Integer)value);
            }
        }
        ,
        CurrConvFctr {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getCurrConvFctr();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setCurrConvFctr((Number)value);
            }
        }
        ,
        rejectedQuantTrans {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getrejectedQuantTrans();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setrejectedQuantTrans((Number)value);
            }
        }
        ,
        itemDesc {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getitemDesc();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setitemDesc((String)value);
            }
        }
        ,
        ItemNameLovVO1 {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItemNameLovVO1();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ItemUomDescLovVO1 {
            public Object get(shpmntItmViewVORowImpl obj) {
                return obj.getItemUomDescLovVO1();
            }

            public void put(shpmntItmViewVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(shpmntItmViewVORowImpl object);

        public abstract void put(shpmntItmViewVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int EOID = AttributesEnum.EoId.index();
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int DOCDT = AttributesEnum.DocDt.index();
    public static final int SHIPMNTQTY = AttributesEnum.ShipmntQty.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int ITMPRICE = AttributesEnum.ItmPrice.index();
    public static final int ITMAMTSP = AttributesEnum.ItmAmtSp.index();
    public static final int ITMAMTBS = AttributesEnum.ItmAmtBs.index();
    public static final int CURRIDSP = AttributesEnum.CurrIdSp.index();
    public static final int CURRIDBS = AttributesEnum.CurrIdBs.index();
    public static final int CURRCONVFCTR = AttributesEnum.CurrConvFctr.index();
    public static final int REJECTEDQUANTTRANS = AttributesEnum.rejectedQuantTrans.index();
    public static final int ITEMDESC = AttributesEnum.itemDesc.index();
    public static final int ITEMNAMELOVVO1 = AttributesEnum.ItemNameLovVO1.index();
    public static final int ITEMUOMDESCLOVVO1 = AttributesEnum.ItemUomDescLovVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public shpmntItmViewVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute EoId.
     * @return the EoId
     */
    public Integer getEoId() {
        return (Integer) getAttributeInternal(EOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute EoId.
     * @param value value to set the  EoId
     */
    public void setEoId(Integer value) {
        setAttributeInternal(EOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WhId.
     * @return the WhId
     */
    public String getWhId() {
        return (String) getAttributeInternal(WHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WhId.
     * @param value value to set the  WhId
     */
     public String resolvEl(String data) {
         FacesContext fc = FacesContext.getCurrentInstance();
         Application app = fc.getApplication();
         ExpressionFactory elFactory = app.getExpressionFactory();
         ELContext elContext = fc.getELContext();
         ValueExpression valueExp = elFactory.createValueExpression(elContext, data, Object.class);
         String msg = null;
         if (valueExp.getValue(elContext) != null)
             msg = valueExp.getValue(elContext).toString();
         else
             msg = null;
         return msg;
     }
   
    public void setWhId(String value) {
        setAttributeInternal(WHID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        return (String) getAttributeInternal(DOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocId.
     * @param value value to set the  DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocDt.
     * @return the DocDt
     */
    public Timestamp getDocDt() {
        return (Timestamp) getAttributeInternal(DOCDT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocDt.
     * @param value value to set the  DocDt
     */
    public void setDocDt(Timestamp value) {
        setAttributeInternal(DOCDT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ShipmntQty.
     * @return the ShipmntQty
     */
    public Number getShipmntQty() {
        return (Number) getAttributeInternal(SHIPMNTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ShipmntQty.
     * @param value value to set the  ShipmntQty
     */
    public void setShipmntQty(Number value) {
        setAttributeInternal(SHIPMNTQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmId.
     * @return the ItmId
     */
    public String getItmId() {
        return (String) getAttributeInternal(ITMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmId.
     * @param value value to set the  ItmId
     */
    public void setItmId(String value) {
        setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmUom.
     * @return the ItmUom
     */
    public String getItmUom() {
        return (String) getAttributeInternal(ITMUOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmUom.
     * @param value value to set the  ItmUom
     */
    public void setItmUom(String value) {
        setAttributeInternal(ITMUOM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmPrice.
     * @return the ItmPrice
     */
    public Number getItmPrice() {
        return (Number) getAttributeInternal(ITMPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmPrice.
     * @param value value to set the  ItmPrice
     */
    public void setItmPrice(Number value) {
        setAttributeInternal(ITMPRICE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmAmtSp.
     * @return the ItmAmtSp
     */
    public Number getItmAmtSp() {
        return (Number) getAttributeInternal(ITMAMTSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmAmtSp.
     * @param value value to set the  ItmAmtSp
     */
    public void setItmAmtSp(Number value) {
        setAttributeInternal(ITMAMTSP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmAmtBs.
     * @return the ItmAmtBs
     */
    public Number getItmAmtBs() {
        return (Number) getAttributeInternal(ITMAMTBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmAmtBs.
     * @param value value to set the  ItmAmtBs
     */
    public void setItmAmtBs(Number value) {
        setAttributeInternal(ITMAMTBS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrIdSp.
     * @return the CurrIdSp
     */
    public Integer getCurrIdSp() {
        return (Integer) getAttributeInternal(CURRIDSP);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrIdSp.
     * @param value value to set the  CurrIdSp
     */
    public void setCurrIdSp(Integer value) {
        setAttributeInternal(CURRIDSP, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrIdBs.
     * @return the CurrIdBs
     */
    public Integer getCurrIdBs() {
        return (Integer) getAttributeInternal(CURRIDBS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrIdBs.
     * @param value value to set the  CurrIdBs
     */
    public void setCurrIdBs(Integer value) {
        setAttributeInternal(CURRIDBS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrConvFctr.
     * @return the CurrConvFctr
     */
    public Number getCurrConvFctr() {
        return (Number) getAttributeInternal(CURRCONVFCTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrConvFctr.
     * @param value value to set the  CurrConvFctr
     */
    public void setCurrConvFctr(Number value) {
        setAttributeInternal(CURRCONVFCTR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute rejectedQuantTrans.
     * @return the rejectedQuantTrans
     */
    public Number getrejectedQuantTrans() {
        Number QTY=new Number(0);
        if(getAttributeInternal(REJECTEDQUANTTRANS)==null){
        SlsRmaAppAMImpl am = (SlsRmaAppAMImpl)getApplicationModule();
        ViewObjectImpl vo=am.getSlsRmaItem2();
        Row rw[]=vo.getFilteredRows("ItmId",this. getItmId() );
        System.out.println("no of rows in slalrma vo is ="+rw.length);
        if(rw.length>0)
        for(Integer i=0;i<rw.length;i++)
        {System.out.println("now i am in row set ioterator");
        QTY=(Number)rw[i].getAttribute("RcptQty");
        }
        return QTY;
        }
        else{
        return (Number) getAttributeInternal(REJECTEDQUANTTRANS);
        }

    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute rejectedQuantTrans.
     * @param value value to set the  rejectedQuantTrans
     */
    public void setrejectedQuantTrans(Number value) {
        
        setAttributeInternal(REJECTEDQUANTTRANS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute itemDesc.
     * @return the itemDesc
     */
    public String getitemDesc() {
        String OrgId = resolvEl("#{pageFlowScope.GLBL_APP_USR_ORG}").toString();
        Integer SlocId = Integer.parseInt(resolvEl("#{pageFlowScope.GLBL_APP_SERV_LOC}").toString());
        String CldId = resolvEl("#{pageFlowScope.GLBL_APP_CLD_ID}").toString();
      String HoOrgId =resolvEl("#{pageFlowScope.GLBL_HO_ORG_ID}").toString();
        if (getAttributeInternal(ITEMDESC) == null && getItmId() != null) {
            
                    StringBuffer s = new StringBuffer("");
                    RowSet itmNmVO1 = this.getItemNameLovVO1();
                    System.out.println(" so id  " + getItmId() + " getAttributeInternal(SOIDTRANS) " +
                                       getAttributeInternal(ITEMDESC));
                    itmNmVO1.setNamedWhereClauseParam("BindCldId", CldId);
                    itmNmVO1.setNamedWhereClauseParam("BindSlocId", SlocId);
                    itmNmVO1.setNamedWhereClauseParam("BindOrgId", OrgId);
                    itmNmVO1.setNamedWhereClauseParam("BindHoOrgId", HoOrgId);
                    itmNmVO1.setNamedWhereClauseParam("BindItemId", getItmId());
                    itmNmVO1.executeQuery();
                    Row[] allRowsInRange = itmNmVO1.getAllRowsInRange();
                    System.out.println("allRowsInRange in shipment" + allRowsInRange.length);
                    if (allRowsInRange.length > 0) {
                        Object so = allRowsInRange[0].getAttribute("ItmDesc");
                        System.out.println("s0  in shipment : " + so);
                        s = (so == null ? null : new StringBuffer(so.toString()));
                        System.out.println("s in shipment :" + s);
                        setitemDesc(s.toString());
                    }
                }
        
        
        return (String) getAttributeInternal(ITEMDESC);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute itemDesc.
     * @param value value to set the  itemDesc
     */
    public void setitemDesc(String value) {
        setAttributeInternal(ITEMDESC, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ItemNameLovVO1.
     */
    public RowSet getItemNameLovVO1() {
        return (RowSet)getAttributeInternal(ITEMNAMELOVVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ItemUomDescLovVO1.
     */
    public RowSet getItemUomDescLovVO1() {
        return (RowSet)getAttributeInternal(ITEMUOMDESCLOVVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
