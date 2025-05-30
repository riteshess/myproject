package mmdashboardapp.model.service.common;

import java.util.ArrayList;

import mmdashboardapp.model.ds.TickerRowDS;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Mar 06 11:36:50 IST 2014
// ---------------------------------------------------------------------
public interface MmDashboardAM extends ApplicationModule {
    oracle.jbo.domain.Number getDocPendingCountForMyApproval(Integer DocTypeId, StringBuffer CountType);

    void executeTopSuppliersRating(Integer val);

    void executeQueryForAllViews();

    void setWFQuotationView(StringBuffer type);

    StringBuffer getCurrDocIdfoQuot();

    void setWFRfqView(StringBuffer type);

    void setWFPurOrdView(StringBuffer type);

    void setWFMRSView(StringBuffer type);

    void setWFTrfOrdView(StringBuffer type);

    void setWFRcptView(StringBuffer type);

    ArrayList<oracle.jbo.domain.Number> executeTkrQuery(String tkrId);

    String getTkrLableName(Integer tkrPos);

    String getTkrIdValue(Integer tkrPos);


    ArrayList<TickerRowDS> getTickerList();

    ArrayList<TickerRowDS> getSelectedTickerList();

    void updateTickerSettingForUsr(Integer seqNo, String tickeId);

    void unsetAllTkrPosForUsr();

    void setWFStockAdjView(StringBuffer type);

    void setWFStockTakeView(StringBuffer type);

    void executeTopNProductGrpVO(Integer val);

    void executeTopNProductVO(Integer val);

    void setInvcPndView(StringBuffer type);

    void setCpoPndView(StringBuffer type);

    void setScrpSlsPndView(StringBuffer type);

    String getTkrDataRange(Integer TkrPos);

    void setWFMRNView(StringBuffer type);

    void refreshPoViews(String OpType);

    void refreshQuotViews(String OpType);

    void refreshRfqViews(String OpType);

    void refreshTrfOrdViews(String OpType);

    void setPurReqView(StringBuffer type);

    void refreshIPOBoeViews(String OpType);

    void setIpoBoeView(StringBuffer type);

    void setShpAdvcView(StringBuffer type);

    void setInsView(StringBuffer type);
}
