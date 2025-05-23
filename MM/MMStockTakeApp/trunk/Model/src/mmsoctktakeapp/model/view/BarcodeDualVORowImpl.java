package mmsoctktakeapp.model.view;

import static adf.utils.ebiz.EbizParams.GLBL_APP_CLD_ID;

import static adf.utils.ebiz.EbizParams.GLBL_APP_SERV_LOC;
import static adf.utils.ebiz.EbizParams.GLBL_APP_USR;
import static adf.utils.ebiz.EbizParams.GLBL_APP_USR_ORG;
import static adf.utils.ebiz.EbizParams.GLBL_HO_ORG_ID;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

import mmsoctktakeapp.model.services.MMStkTakeAMImpl;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 12 13:50:50 PDT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class BarcodeDualVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Dummy {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getDummy();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        WhId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getWhId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setWhId((String) value);
            }
        },
        ItmId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getItmId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setItmId((String) value);
            }
        },
        LotId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getLotId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setLotId((String) value);
            }
        },
        BinId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getBinId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setBinId((String) value);
            }
        },
        SrNo {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getSrNo();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setSrNo((String) value);
            }
        },
        CldId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getCldId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setCldId((String) value);
            }
        },
        SlocId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getSlocId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setSlocId((Integer) value);
            }
        },
        OrgId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setOrgId((String) value);
            }
        },
        DocId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getDocId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setDocId((String) value);
            }
        },
        WhNm {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getWhNm();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setWhNm((String) value);
            }
        },
        SerFlg {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getSerFlg();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setSerFlg((String) value);
            }
        },
        HoOrgId {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getHoOrgId();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setHoOrgId((String) value);
            }
        },
        ItmNm {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getItmNm();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setItmNm((String) value);
            }
        },
        BinNm {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getBinNm();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setBinNm((String) value);
            }
        },
        ItmUom {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getItmUom();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setItmUom((String) value);
            }
        },
        PhyQty {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getPhyQty();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setPhyQty((Number) value);
            }
        },
        RwkQty {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getRwkQty();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setRwkQty((Number) value);
            }
        },
        ScrpQty {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getScrpQty();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setScrpQty((Number) value);
            }
        },
        LovWarehouseVO1 {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getLovWarehouseVO1();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LovBinVO1 {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getLovBinVO1();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        },
        LovItemVO1 {
            public Object get(BarcodeDualVORowImpl obj) {
                return obj.getLovItemVO1();
            }

            public void put(BarcodeDualVORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        };
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(BarcodeDualVORowImpl object);

        public abstract void put(BarcodeDualVORowImpl object, Object value);

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
    public static final int WHID = AttributesEnum.WhId.index();
    public static final int ITMID = AttributesEnum.ItmId.index();
    public static final int LOTID = AttributesEnum.LotId.index();
    public static final int BINID = AttributesEnum.BinId.index();
    public static final int SRNO = AttributesEnum.SrNo.index();
    public static final int CLDID = AttributesEnum.CldId.index();
    public static final int SLOCID = AttributesEnum.SlocId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DOCID = AttributesEnum.DocId.index();
    public static final int WHNM = AttributesEnum.WhNm.index();
    public static final int SERFLG = AttributesEnum.SerFlg.index();
    public static final int HOORGID = AttributesEnum.HoOrgId.index();
    public static final int ITMNM = AttributesEnum.ItmNm.index();
    public static final int BINNM = AttributesEnum.BinNm.index();
    public static final int ITMUOM = AttributesEnum.ItmUom.index();
    public static final int PHYQTY = AttributesEnum.PhyQty.index();
    public static final int RWKQTY = AttributesEnum.RwkQty.index();
    public static final int SCRPQTY = AttributesEnum.ScrpQty.index();
    public static final int LOVWAREHOUSEVO1 = AttributesEnum.LovWarehouseVO1.index();
    public static final int LOVBINVO1 = AttributesEnum.LovBinVO1.index();
    public static final int LOVITEMVO1 = AttributesEnum.LovItemVO1.index();
    private String whId = "";
    private String itmId = "";
    private String binId = "";

    /**
     * This is the default constructor (do not remove).
     */
    public BarcodeDualVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Dummy.
     * @return the Dummy
     */
    public String getDummy() {
        return (String) getAttributeInternal(DUMMY);
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
    public void setWhId(String value) {
        setAttributeInternal(WHID, value);
        this.setBinId(null);
        this.setBinNm(null);
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
        if (value != null) {
            RowSet itemVO1 = this.getLovItemVO1();
            itemVO1.setNamedWhereClauseParam("CldIdBind", this.getCldId());
            itemVO1.setNamedWhereClauseParam("HoOrgIdBind", this.getHoOrgId());
            itemVO1.setNamedWhereClauseParam("ItmIdBind", value);
            itemVO1.setNamedWhereClauseParam("SlocIdBind", this.getSlocId());
            itemVO1.executeQuery();
            Row[] allRowsInRange = this.getLovItemVO1().getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                this.setSerFlg(allRowsInRange[0].getAttribute("SerializedFlg").toString());
                this.setItmUom(allRowsInRange[0].getAttribute("UomBasic").toString());
                this.setItmNm(allRowsInRange[0].getAttribute("ItmDesc").toString());
                setAttributeInternal(ITMID, value);
            }
        } else {
            this.setSerFlg(null);
            this.setItmUom(null);
            this.setItmNm(null);
        }
        //  setAttributeInternal(ITMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute LotId.
     * @return the LotId
     */
    public String getLotId() {
        return (String) getAttributeInternal(LOTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute LotId.
     * @param value value to set the  LotId
     */
    public void setLotId(String value) {
        setAttributeInternal(LOTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BinId.
     * @return the BinId
     */
    public String getBinId() {
        return (String) getAttributeInternal(BINID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BinId.
     * @param value value to set the  BinId
     */
    public void setBinId(String value) {
        setAttributeInternal(BINID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SrNo.
     * @return the SrNo
     */
    public String getSrNo() {
        return (String) getAttributeInternal(SRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SrNo.
     * @param value value to set the  SrNo
     */
    public void setSrNo(String value) {
        setAttributeInternal(SRNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CldId.
     * @return the CldId
     */
    public String getCldId() {
        return GLBL_APP_CLD_ID();
        //return (String) getAttributeInternal(CLDID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CldId.
     * @param value value to set the  CldId
     */
    public void setCldId(String value) {
        setAttributeInternal(CLDID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SlocId.
     * @return the SlocId
     */
    public Integer getSlocId() {
        return GLBL_APP_SERV_LOC();
        //  return (Integer) getAttributeInternal(SLOCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SlocId.
     * @param value value to set the  SlocId
     */
    public void setSlocId(Integer value) {
        setAttributeInternal(SLOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public String getOrgId() {

        return GLBL_APP_USR_ORG();

        //return (String) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(String value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DocId.
     * @return the DocId
     */
    public String getDocId() {
        if (getAttributeInternal(DOCID) != null)
            return (String) getAttributeInternal(DOCID);
        else {
            MMStkTakeAMImpl am = (MMStkTakeAMImpl) resolvElDC("MMStkTakeAMDataControl");
            return (String) am.getMmStkTake1().getCurrentRow().getAttribute("DocId");
        }
        //   return (String) getAttributeInternal(DOCID);
    }

    public Object resolvElDC(String data) {
        FacesContext fc = FacesContext.getCurrentInstance();
        Application app = fc.getApplication();
        ExpressionFactory elFactory = app.getExpressionFactory();
        ELContext elContext = fc.getELContext();
        ValueExpression valueExp =
            elFactory.createValueExpression(elContext, "#{data." + data + ".dataProvider}", Object.class);
        return valueExp.getValue(elContext);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DocId.
     * @param value value to set the  DocId
     */
    public void setDocId(String value) {
        setAttributeInternal(DOCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WhNm.
     * @return the WhNm
     */
    public String getWhNm() {
        //&& !this.getWhId().equalsIgnoreCase(this.whId)
        if (this.getWhId() != null) {
            RowSet lovWarehouseVO1 = this.getLovWarehouseVO1();
            lovWarehouseVO1.setNamedWhereClauseParam("WhIdBind", this.getWhId());
            lovWarehouseVO1.executeQuery();
            Row[] allRowsInRange = lovWarehouseVO1.getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                System.out.println("find wh");
                //    this.whId = this.getWhId();
                return allRowsInRange[0].getAttribute("WhNm").toString();
            }
        }
        return (String) getAttributeInternal(WHNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WhNm.
     * @param value value to set the  WhNm
     */
    public void setWhNm(String value) {
        setAttributeInternal(WHNM, value);
    }


    /**
     * Gets the attribute value for the calculated attribute SerFlg.
     * @return the SerFlg
     */
    public String getSerFlg() {
        return (String) getAttributeInternal(SERFLG);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SerFlg.
     * @param value value to set the  SerFlg
     */
    public void setSerFlg(String value) {
        setAttributeInternal(SERFLG, value);
    }


    /**
     * Gets the attribute value for the calculated attribute HoOrgId.
     * @return the HoOrgId
     */
    public String getHoOrgId() {
        return GLBL_HO_ORG_ID();
        //eturn (String) getAttributeInternal(HOORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HoOrgId.
     * @param value value to set the  HoOrgId
     */
    public void setHoOrgId(String value) {
        setAttributeInternal(HOORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItmNm.
     * @return the ItmNm
     */
    public String getItmNm() {
        /*  if (getItmId() != null) {
            this.getLovItemVO1().executeQuery();
            Row[] allRowsInRange = this.getLovItemVO1().getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                this.setSerFlg(allRowsInRange[0].getAttribute("SerializedFlg").toString());
                this.setItmUom(allRowsInRange[0].getAttribute("UomBasic").toString());
                return allRowsInRange[0].getAttribute("ItmDesc").toString();
            }
        } else {

            this.setSerFlg(null);
            this.setItmUom(null);
        } */
        return (String) getAttributeInternal(ITMNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItmNm.
     * @param value value to set the  ItmNm
     */
    public void setItmNm(String value) {
        setAttributeInternal(ITMNM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BinNm.
     * @return the BinNm
     */
    public String getBinNm() {

        if (this.getBinId() != null) {
            RowSet binVO1 = this.getLovBinVO1();
            binVO1.setNamedWhereClauseParam("WhIdBind", this.getWhId());
            binVO1.setNamedWhereClauseParam("BinIdBind", this.getBinId());
            binVO1.executeQuery();
            Row[] allRowsInRange = binVO1.getAllRowsInRange();
            if (allRowsInRange.length > 0) {
                return allRowsInRange[0].getAttribute("BinNm").toString();
            }
        }
        return (String) getAttributeInternal(BINNM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BinNm.
     * @param value value to set the  BinNm
     */
    public void setBinNm(String value) {
        setAttributeInternal(BINNM, value);
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
     * Gets the attribute value for the calculated attribute PhyQty.
     * @return the PhyQty
     */
    public oracle.jbo.domain.Number getPhyQty() {
        return (oracle.jbo.domain.Number) getAttributeInternal(PHYQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PhyQty.
     * @param value value to set the  PhyQty
     */
    public void setPhyQty(Number value) {
        setAttributeInternal(PHYQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RwkQty.
     * @return the RwkQty
     */
    public Number getRwkQty() {
        return (Number) getAttributeInternal(RWKQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RwkQty.
     * @param value value to set the  RwkQty
     */
    public void setRwkQty(Number value) {
        setAttributeInternal(RWKQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ScrpQty.
     * @return the ScrpQty
     */
    public Number getScrpQty() {
        return (Number) getAttributeInternal(SCRPQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ScrpQty.
     * @param value value to set the  ScrpQty
     */
    public void setScrpQty(Number value) {
        setAttributeInternal(SCRPQTY, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovWarehouseVO1.
     */
    public RowSet getLovWarehouseVO1() {
        return (RowSet) getAttributeInternal(LOVWAREHOUSEVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovBinVO1.
     */
    public RowSet getLovBinVO1() {
        return (RowSet) getAttributeInternal(LOVBINVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LovItemVO1.
     */
    public RowSet getLovItemVO1() {
        return (RowSet) getAttributeInternal(LOVITEMVO1);
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

