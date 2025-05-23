package mnfLandingPageApp.model.services;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Timestamp;
import java.sql.Types;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.StringTokenizer;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import mnfLandingPageApp.model.classes.TickerRowDS;
import mnfLandingPageApp.model.services.common.MNFLandingPageAppAM;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;


import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 06 11:49:38 IST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MNFLandingPageAppAMImpl extends ApplicationModuleImpl implements MNFLandingPageAppAM {
    /**
     * This is the default constructor (do not remove).
     */
    public MNFLandingPageAppAMImpl() {
    }

    private static ADFLogger _log = ADFLogger.createADFLogger(MNFLandingPageAppAMImpl.class);

    /**
     * Container's getter for SelectedTickerListVO.
     * @return SelectedTickerListVO
     */
    public ViewObjectImpl getSelectedTickerListVO() {
        return (ViewObjectImpl) findViewObject("SelectedTickerListVO");
    }

    /**
     * Method to set the parameter as first activity in task flow
     * **/
    public void setGlobalParameters(String cld_id, Integer sloc_id, String ho_org_id, String org_id, Integer usr_id) {
        System.out.println("cld_id " + cld_id + " sloc_id " + sloc_id + " ho_org_id " + ho_org_id + " org_id " +
                           org_id + " usr_id " + usr_id);
        
        setSelectedTickerListParam(cld_id, sloc_id, ho_org_id, org_id, usr_id);
        setUnSelectedTickerListParam(cld_id, sloc_id, ho_org_id, org_id, usr_id);
        setMmTkrUsrParam(cld_id, sloc_id, org_id, usr_id);
    }

    /**
     * Method to set global parameters for SelectedTickerListVO
     * **/

    private void setSelectedTickerListParam(String cld_id, Integer sloc_id, String ho_org_id, String org_id,
                                            Integer usr_id) {

        getSelectedTickerListVO().setNamedWhereClauseParam("BindCldId", cld_id);
        getSelectedTickerListVO().setNamedWhereClauseParam("BindSlcId", sloc_id);
        getSelectedTickerListVO().setNamedWhereClauseParam("BindOrgId", org_id);
        getSelectedTickerListVO().setNamedWhereClauseParam("BindUsrId", usr_id);
        getSelectedTickerListVO().executeQuery();

    }

    /**
     * Method to set global parameters for UnSelectedTickerVO
     * **/
    private void setUnSelectedTickerListParam(String cld_id, Integer sloc_id, String ho_org_id, String org_id,
                                              Integer usr_id) {

        getUnSelectedTickerVO().setNamedWhereClauseParam("BindCldId", cld_id);
        getUnSelectedTickerVO().setNamedWhereClauseParam("BindSlcId", sloc_id);
        getUnSelectedTickerVO().setNamedWhereClauseParam("BindOrgId", org_id);
        getUnSelectedTickerVO().setNamedWhereClauseParam("BindUsrId", usr_id);
        getUnSelectedTickerVO().executeQuery();

    }

    /**
     * Method to set global parameters for UnSelectedTickerVO
     * **/
    private void setMmTkrUsrParam(String cld_id, Integer sloc_id, String org_id, Integer usr_id) {

        getMmTkrUsrVO().setNamedWhereClauseParam("BindCldId", cld_id);
        getMmTkrUsrVO().setNamedWhereClauseParam("BindSlcId", sloc_id);
        getMmTkrUsrVO().setNamedWhereClauseParam("BindOrgId", org_id);
        getMmTkrUsrVO().setNamedWhereClauseParam("BindUsrId", usr_id);
        getMmTkrUsrVO().executeQuery();

    }

    /**
     * Method to fetch all the tickers
     * @return
     */
    public ArrayList<TickerRowDS> getSelectedTickerList(String cld_id, Integer sloc_id, String ho_org_id, String org_id,
                                                        Integer usr_id) {
       // System.out.println("getSelectedTickerList ");
        ArrayList<TickerRowDS> selectedSettingsList = new ArrayList<TickerRowDS>();
        ViewObjectImpl tickerList = this.getSelectedTickerListVO();

        Row r = null;
        RowSetIterator rsetIter = tickerList.createRowSetIterator(null);

        Integer fyId = getfyId(cld_id, sloc_id, org_id);
        String currId = getCurrIdBs(cld_id, sloc_id, org_id);
        Object fn_ret_val;
       // System.out.println("rsetIter count " + rsetIter.getRowCount());

        while (rsetIter.hasNext()) {
            r = rsetIter.next();

            fn_ret_val = getTickerVal(cld_id, sloc_id, org_id, r.getAttribute("TkrId").toString(), fyId);

           // System.out.println("tiker val " + fn_ret_val);
            _log.info("tiker val " + fn_ret_val);

            if (fn_ret_val != null) {

                //Gross Profit|419530808.04686|192307731861484.01752
                StringTokenizer tk = new StringTokenizer(fn_ret_val.toString(), "|");

                if (tk.countTokens() == 3) {

                    TickerRowDS t = new TickerRowDS();
                    t.setTickerId(r.getAttribute("TkrId").toString());
                    t.setSeqNo((Integer) r.getAttribute("SeqNo"));
                    t.setTickerDesc(r.getAttribute("TkrNm") == null ? "" : r.getAttribute("TkrNm").toString());
                    t.setArrow(tk.nextToken());
                    t.setCurrentAmt(tk.nextToken());
                    t.setPreviousAmt(tk.nextToken());
                    t.setCurr(currId);
                    selectedSettingsList.add(t);
                }
            }

        }
        rsetIter.closeRowSetIterator();

        return selectedSettingsList;
    }

    /**
     * Method to fetch all the tickers
     * @return
     */
    public ArrayList<TickerRowDS> getUnSelectedTickerList(String cld_id, Integer sloc_id, String ho_org_id,
                                                          String org_id, Integer usr_id) {
        //System.out.println("UngetSelectedTickerList ");
        ArrayList<TickerRowDS> selectedSettingsList = new ArrayList<TickerRowDS>();
        ViewObjectImpl tickerList = this.getUnSelectedTickerVO();
        getUnSelectedTickerVO().executeQuery();
        
        Row r = null;
        RowSetIterator rsetIter = tickerList.createRowSetIterator(null);

        Integer fyId = getfyId(cld_id, sloc_id, org_id);
        String currId = getCurrIdBs(cld_id, sloc_id, org_id);
        Object fn_ret_val;
        //System.out.println("rsetIter count " + rsetIter.getRowCount());

        while (rsetIter.hasNext()) {
            r = rsetIter.next();

            fn_ret_val = getTickerVal(cld_id, sloc_id, org_id, r.getAttribute("TkrId").toString(), fyId);

            //System.out.println("tiker val " + fn_ret_val);
            _log.info("tiker val " + fn_ret_val);

            if (fn_ret_val != null) {

                //Gross Profit|419530808.04686|192307731861484.01752
                StringTokenizer tk = new StringTokenizer(fn_ret_val.toString(), "|");

                if (tk.countTokens() == 3) {

                    TickerRowDS t = new TickerRowDS();
                    t.setTickerId(r.getAttribute("TkrId").toString());
                    t.setSeqNo((Integer) r.getAttribute("SeqNo"));
                    t.setTickerDesc(r.getAttribute("TkrNm") == null ? "" : r.getAttribute("TkrNm").toString());
                    t.setArrow(tk.nextToken());
                    t.setCurrentAmt(tk.nextToken());
                    t.setPreviousAmt(tk.nextToken());
                    t.setCurr(currId);
                    selectedSettingsList.add(t);
                }
            }

        }
        rsetIter.closeRowSetIterator();

        return selectedSettingsList;
    }


    /**
     * Method to get the value for tickers
     * **/
    private Object getTickerVal(String cld_id, Integer sloc_id, String org_id, String tkr_id, Integer fy_id) {

        return callStoredFunction(Types.VARCHAR, "MNF.FN_GET_TKR_VAL(?,?,?,?,?)", new Object[] {
                                  cld_id, sloc_id, org_id, fy_id, tkr_id
    });

    }

    /**
     * Method used to call function to get the fy id.
     * @param CldId
     * @param OrgId
     * @return FY Id
     */
    private Integer getfyId(String cld_id, Integer sloc_id, String org_id) {
        Object fyId = 0;
        try {
            fyId = (callStoredFunction(Types.INTEGER, "APP.GET_ORG_FY_ID (?,?,?)", new Object[] {
                                       cld_id, org_id, new Timestamp(System.currentTimeMillis()) }));

            if (fyId != null)
                return Integer.parseInt(fyId.toString());

        } catch (Exception e) {
            // TODO: Add catch code

            showFacesMsg("Error in getting FY ID", "Error in getting FY ID", FacesMessage.SEVERITY_ERROR, null);
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * @param OrgId organisation id
     * @return basic currency id for this organiZation
     */
    private String getCurrIdBs(String cldId, Integer slcId, String OrgId) {
        Object currId = null;
        try {
            currId = callStoredFunction(Types.VARCHAR, "APP.GET_ORG_DEF_CURR_BS1(?,?,?)", new Object[] {
                                        cldId, slcId, OrgId });

            if (currId != null)
                return currId.toString();

        } catch (Exception e) {
            showFacesMsg("Error in getting Currency ID", "Error in getting Currency ID", FacesMessage.SEVERITY_ERROR,
                         null);
            e.printStackTrace();
        }

        return "-1";
    }

    /**
     * Method to call a Database function
     * @param sqlReturnType
     * @param stmt
     * @param bindVars
     * @return
     */
    protected Object callStoredFunction(int sqlReturnType, String stmt, Object[] bindVars) {
        CallableStatement st = null;

        try {

            st = this.getDBTransaction().createCallableStatement("begin ? := " + stmt + ";end;", 0);
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
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Generalized method used to display the facesmessages.
     * Created by Priyank Khare on 03-06-2014.
     * @param msgHdr is to set the header for message dialog
     * @param msgDtl is to set if further detail information in meassage is required.
     * @param msgSeverity is to set severity mode.
     * **/
    public void showFacesMsg(String msgHdr, String msgDtl, javax.faces.application.FacesMessage.Severity msgSeverity,
                             String clientId) {

        FacesMessage msg = new FacesMessage(msgHdr);
        msg.setDetail(msgDtl);
        msg.setSeverity(msgSeverity);
        FacesContext.getCurrentInstance().addMessage(clientId, msg);

    }

    /**
     * Container's getter for UnSelectedTickerVO1.
     * @return UnSelectedTickerVO1
     */
    public ViewObjectImpl getUnSelectedTickerVO() {
        return (ViewObjectImpl) findViewObject("UnSelectedTickerVO");
    }

    /**
     * Container's getter for MmTkrUsrVO1.
     * @return MmTkrUsrVO1
     */
    public ViewObjectImpl getMmTkrUsrVO() {
        return (ViewObjectImpl) findViewObject("MmTkrUsrVO");
    }
}

