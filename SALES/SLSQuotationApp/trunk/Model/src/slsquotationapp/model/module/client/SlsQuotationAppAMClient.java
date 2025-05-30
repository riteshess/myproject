package slsquotationapp.model.module.client;

import java.util.ArrayList;

import oracle.jbo.Row;
import oracle.jbo.client.remote.ApplicationModuleImpl;

import oracle.jbo.domain.Timestamp;

import slsquotationapp.model.module.common.SlsQuotationAppAM;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 28 15:37:17 IST 2013
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SlsQuotationAppAMClient extends ApplicationModuleImpl implements SlsQuotationAppAM {
    /**
     * This is the default constructor (do not remove).
     */
    public SlsQuotationAppAMClient() {
    }


    public void chkforDuplicateItemid(Integer ItemId) {
        Object _ret = this.riInvokeExportedMethod(this,"chkforDuplicateItemid",new String [] {"java.lang.Integer"},new Object[] {ItemId});
        return;
    }


    public Integer getItemLineRowCount(StringBuffer itemNm) {
        Object _ret = this.riInvokeExportedMethod(this, "getItemLineRowCount", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { itemNm });
        return (Integer) _ret;
    }


    public void CheckItmId() {
        Object _ret = this.riInvokeExportedMethod(this, "CheckItmId", null, null);
        return;
    }

    public void amendFUNCTION() {
        Object _ret = this.riInvokeExportedMethod(this, "amendFUNCTION", null, null);
        return;
    }

    public void calculateandSetSrNoInSlsItm() {
        Object _ret = this.riInvokeExportedMethod(this, "calculateandSetSrNoInSlsItm", null, null);
        return;
    }

    public void calculateandSetSrNoInSlsItmTr() {
        Object _ret = this.riInvokeExportedMethod(this, "calculateandSetSrNoInSlsItmTr", null, null);
        return;
    }

    public void calculateandSetSrNoTrForQuotationWiseTr() {
        Object _ret = this.riInvokeExportedMethod(this, "calculateandSetSrNoTrForQuotationWiseTr", null, null);
        return;
    }

    public StringBuffer callFunction_FN_INS_ITM(String itmDesc, String itmPrefix, String itmGrpId, String itmUom) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_FN_INS_ITM", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String",
                                                  "java.lang.String"
        }, new Object[] { itmDesc, itmPrefix, itmGrpId, itmUom });
        return (StringBuffer) _ret;
    }

    public void callFunction_FN_INS_QUOTE_TR_LINE(Integer taxRuleId) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_FN_INS_QUOTE_TR_LINE", new String[] {
                                                  "java.lang.Integer" }, new Object[] { taxRuleId });
        return;
    }

    public void callFunction_FN_INS_QUOT_CALC(StringBuffer DocId) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_FN_INS_QUOT_CALC", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { DocId });
        return;
    }

    public void callFunction_FN_INS_QUOT_SCH_ITM(StringBuffer schId) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_FN_INS_QUOT_SCH_ITM", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { schId });
        return;
    }

    public StringBuffer callFunction_FN_SET_EO_ID(String EoNm, Integer EoType) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_FN_SET_EO_ID", new String[] {
                                                  "java.lang.String", "java.lang.Integer" }, new Object[] {
                                                  EoNm, EoType });
        return (StringBuffer) _ret;
    }

    public void callFunction_ForQuotationWiseTax_FN_INS_QUOTE_TR_LINE(Integer taxRuleId) {
        Object _ret = this.riInvokeExportedMethod(this, "callFunction_ForQuotationWiseTax_FN_INS_QUOTE_TR_LINE", new String[] {
                                                  "java.lang.Integer" }, new Object[] { taxRuleId });
        return;
    }

    public void call_function_FN_ENQ_TO_QUOT(StringBuffer EnqNo) {
        Object _ret = this.riInvokeExportedMethod(this, "call_function_FN_ENQ_TO_QUOT", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { EnqNo });
        return;
    }

    public Integer call_function_FN_GET_EO_LATEST_PRICE(StringBuffer itmNm) {
        Object _ret = this.riInvokeExportedMethod(this, "call_function_FN_GET_EO_LATEST_PRICE", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { itmNm });
        return (Integer) _ret;
    }

    public void cancelQuotation() {
        Object _ret = this.riInvokeExportedMethod(this, "cancelQuotation", null, null);
        return;
    }

    public Integer checkIfQuotationWiseTaxRuleExistOrNot() {
        Object _ret = this.riInvokeExportedMethod(this, "checkIfQuotationWiseTaxRuleExistOrNot", null, null);
        return (Integer) _ret;
    }

    public Integer checkIfTaxRuleExistOrNot() {
        Object _ret = this.riInvokeExportedMethod(this, "checkIfTaxRuleExistOrNot", null, null);
        return (Integer) _ret;
    }

    public StringBuffer checkPolicyApplied() {
        Object _ret = this.riInvokeExportedMethod(this, "checkPolicyApplied", null, null);
        return (StringBuffer) _ret;
    }

    public boolean checkQuotationDeletable() {
        Object _ret = this.riInvokeExportedMethod(this, "checkQuotationDeletable", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public StringBuffer checkforProfileValues(StringBuffer colName) {
        Object _ret = this.riInvokeExportedMethod(this, "checkforProfileValues", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { colName });
        return (StringBuffer) _ret;
    }

    public Boolean chkCurrencyNameexist() {
        Object _ret = this.riInvokeExportedMethod(this, "chkCurrencyNameexist", null, null);
        return (Boolean) _ret;
    }

    public Boolean chkEntutyName() {
        Object _ret = this.riInvokeExportedMethod(this, "chkEntutyName", null, null);
        return (Boolean) _ret;
    }

    public Boolean chkTabValidations() {
        Object _ret = this.riInvokeExportedMethod(this, "chkTabValidations", null, null);
        return (Boolean) _ret;
    }

    public Integer chkforDuplicateItemid(String ItemId) {
        Object _ret = this.riInvokeExportedMethod(this, "chkforDuplicateItemid", new String[] { "java.lang.String" }, new Object[] {
                                                  ItemId });
        return (Integer) _ret;
    }

    public void createInsertRowAndSetVarsInSlsTnC1(Integer TnCId) {
        Object _ret = this.riInvokeExportedMethod(this, "createInsertRowAndSetVarsInSlsTnC1", new String[] {
                                                  "java.lang.Integer" }, new Object[] { TnCId });
        return;
    }

    public void exceptionHandler() {
        Object _ret = this.riInvokeExportedMethod(this, "exceptionHandler", null, null);
        return;
    }

    public void executeAllViews() {
        Object _ret = this.riInvokeExportedMethod(this, "executeAllViews", null, null);
        return;
    }

    public void executeLOVCustomerVO() {
        Object _ret = this.riInvokeExportedMethod(this, "executeLOVCustomerVO", null, null);
        return;
    }

    public void executeTrAndTrLines() {
        Object _ret = this.riInvokeExportedMethod(this, "executeTrAndTrLines", null, null);
        return;
    }

    public void executeTrAndTrLinesForQuotationWiseTax() {
        Object _ret = this.riInvokeExportedMethod(this, "executeTrAndTrLinesForQuotationWiseTax", null, null);
        return;
    }

    public void executeWithBindVariablesSlsQuoteVo() {
        Object _ret = this.riInvokeExportedMethod(this, "executeWithBindVariablesSlsQuoteVo", null, null);
        return;
    }

    public void functionCallOnApprovalFromWorkFlow() {
        Object _ret = this.riInvokeExportedMethod(this, "functionCallOnApprovalFromWorkFlow", null, null);
        return;
    }

    public void generateQuotId(StringBuffer DocId) {
        Object _ret = this.riInvokeExportedMethod(this, "generateQuotId", new String[] { "java.lang.StringBuffer" }, new Object[] {
                                                  DocId });
        return;
    }

    public void generateReport(String quotDocId, String filePath) {
        Object _ret = this.riInvokeExportedMethod(this, "generateReport", new String[] {
                                                  "java.lang.String", "java.lang.String" }, new Object[] {
                                                  quotDocId, filePath });
        return;
    }

    public void getAndSetDiscountForItmFromPolicy() {
        Object _ret = this.riInvokeExportedMethod(this, "getAndSetDiscountForItmFromPolicy", null, null);
        return;
    }

    public ArrayList<String> getCustomerSuggestions(String custNm) {
        Object _ret = this.riInvokeExportedMethod(this, "getCustomerSuggestions", new String[] { "java.lang.String" }, new Object[] {
                                                  custNm });
        return (ArrayList<String>) _ret;
    }

    public String getEoPricePlcMethod() {
        Object _ret = this.riInvokeExportedMethod(this, "getEoPricePlcMethod", null, null);
        return (String) _ret;
    }

    public String getFyIdFromDocIdAndDate() {
        Object _ret = this.riInvokeExportedMethod(this, "getFyIdFromDocIdAndDate", null, null);
        return (String) _ret;
    }

    public oracle.jbo.domain.Number getItemCurrentRowAttribute(StringBuffer attribute) {
        Object _ret = this.riInvokeExportedMethod(this, "getItemCurrentRowAttribute", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { attribute });
        return (oracle.jbo.domain.Number) _ret;
    }

    public Integer getItemLineRowCount(String itemNm) {
        Object _ret = this.riInvokeExportedMethod(this, "getItemLineRowCount", new String[] { "java.lang.String" }, new Object[] {
                                                  itemNm });
        return (Integer) _ret;
    }

    public oracle.jbo.domain.Number getQuotationAmount() {
        Object _ret = this.riInvokeExportedMethod(this, "getQuotationAmount", null, null);
        return (oracle.jbo.domain.Number) _ret;
    }

    public StringBuffer getSlsQuotCurrRowDocId() {
        Object _ret = this.riInvokeExportedMethod(this, "getSlsQuotCurrRowDocId", null, null);
        return (StringBuffer) _ret;
    }

    public ArrayList<String> getSuggestedItemDesc(String itmStr) {
        Object _ret = this.riInvokeExportedMethod(this, "getSuggestedItemDesc", new String[] { "java.lang.String" }, new Object[] {
                                                  itmStr });
        return (ArrayList<String>) _ret;
    }

    public Integer getUsrLvl(StringBuffer WfId) {
        Object _ret = this.riInvokeExportedMethod(this, "getUsrLvl", new String[] { "java.lang.StringBuffer" }, new Object[] {
                                                  WfId });
        return (Integer) _ret;
    }

    public StringBuffer getWfIdAttachedWithTheDoc() {
        Object _ret = this.riInvokeExportedMethod(this, "getWfIdAttachedWithTheDoc", null, null);
        return (StringBuffer) _ret;
    }

    public void getslsQuotSetCurrentRowAtt(String name, String value) {
        Object _ret = this.riInvokeExportedMethod(this, "getslsQuotSetCurrentRowAtt", new String[] {
                                                  "java.lang.String", "java.lang.String" }, new Object[] {
                                                  name, value });
        return;
    }

    public Integer insIntoTxn(StringBuffer WfId, Integer level) {
        Object _ret = this.riInvokeExportedMethod(this, "insIntoTxn", new String[] {
                                                  "java.lang.StringBuffer", "java.lang.Integer" }, new Object[] {
                                                  WfId, level });
        return (Integer) _ret;
    }

    public Boolean insertOtherDetails() {
        Object _ret = this.riInvokeExportedMethod(this, "insertOtherDetails", null, null);
        return (Boolean) _ret;
    }

    public Boolean insertPolicyEntry(StringBuffer policyId) {
        Object _ret = this.riInvokeExportedMethod(this, "insertPolicyEntry", new String[] { "java.lang.StringBuffer" }, new Object[] {
                                                  policyId });
        return (Boolean) _ret;
    }

    public void insertSmanOnEoNm(StringBuffer eoNm) {
        Object _ret = this.riInvokeExportedMethod(this, "insertSmanOnEoNm", new String[] { "java.lang.StringBuffer" }, new Object[] {
                                                  eoNm });
        return;
    }

    public Integer isAlertApplicable() {
        Object _ret = this.riInvokeExportedMethod(this, "isAlertApplicable", null, null);
        return (Integer) _ret;
    }

    public boolean isItemExistsForQuot() {
        Object _ret = this.riInvokeExportedMethod(this, "isItemExistsForQuot", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isItemNmBlank() {
        Object _ret = this.riInvokeExportedMethod(this, "isItemNmBlank", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isItemTotalPrecisionOk(oracle.jbo.domain.Number m) {
        Object _ret = this.riInvokeExportedMethod(this, "isItemTotalPrecisionOk", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { m });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isItmWiseAppliedCorrectly() {
        Object _ret = this.riInvokeExportedMethod(this, "isItmWiseAppliedCorrectly", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public StringBuffer isOpportunityUseAllowed() {
        Object _ret = this.riInvokeExportedMethod(this, "isOpportunityUseAllowed", null, null);
        return (StringBuffer) _ret;
    }

    public boolean isOrderWiseAppliedCorrectly() {
        Object _ret = this.riInvokeExportedMethod(this, "isOrderWiseAppliedCorrectly", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isQuotDiscValueValid(oracle.jbo.domain.Number discVal) {
        Object _ret = this.riInvokeExportedMethod(this, "isQuotDiscValueValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { discVal });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchFromNoOfItemValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchFromNoOfItemValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchFromQuantityValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchFromQuantityValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchFromTotalAmountValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchFromTotalAmountValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchToNoOfItemValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchToNoOfItemValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchToQuantityValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchToQuantityValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSearchToTotalAmountValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isSearchToTotalAmountValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return ((Boolean) _ret).booleanValue();
    }

    public boolean isSelectedTnCAlreadyAdded(Integer TnCId) {
        Object _ret = this.riInvokeExportedMethod(this, "isSelectedTnCAlreadyAdded", new String[] {
                                                  "java.lang.Integer" }, new Object[] { TnCId });
        return ((Boolean) _ret).booleanValue();
    }

    public Integer isToleranceQuantityValid(oracle.jbo.domain.Number val) {
        Object _ret = this.riInvokeExportedMethod(this, "isToleranceQuantityValid", new String[] {
                                                  "oracle.jbo.domain.Number" }, new Object[] { val });
        return (Integer) _ret;
    }

    public StringBuffer isToleranceUseAllowed() {
        Object _ret = this.riInvokeExportedMethod(this, "isToleranceUseAllowed", null, null);
        return (StringBuffer) _ret;
    }

    public boolean isUserEligibleToCancelSQuotation() {
        Object _ret = this.riInvokeExportedMethod(this, "isUserEligibleToCancelSQuotation", null, null);
        return ((Boolean) _ret).booleanValue();
    }

    public Boolean isflexFieldNull() {
        Object _ret = this.riInvokeExportedMethod(this, "isflexFieldNull", null, null);
        return (Boolean) _ret;
    }

    public void refereshAllVoOnCommit() {
        Object _ret = this.riInvokeExportedMethod(this, "refereshAllVoOnCommit", null, null);
        return;
    }

    public void removeItmTaxRuleandTaxRuleLines() {
        Object _ret = this.riInvokeExportedMethod(this, "removeItmTaxRuleandTaxRuleLines", null, null);
        return;
    }

    public void removeQuotTaxRuleandTaxRuleLines() {
        Object _ret = this.riInvokeExportedMethod(this, "removeQuotTaxRuleandTaxRuleLines", null, null);
        return;
    }

    public void removeSchemeFromItem() {
        Object _ret = this.riInvokeExportedMethod(this, "removeSchemeFromItem", null, null);
        return;
    }

    public void resetQuotationViewCriteria() {
        Object _ret = this.riInvokeExportedMethod(this, "resetQuotationViewCriteria", null, null);
        return;
    }

    public void searchQuotationViewCriteria() {
        Object _ret = this.riInvokeExportedMethod(this, "searchQuotationViewCriteria", null, null);
        return;
    }

    public Boolean sendAction(String reciptantMailId, String subject, String msg, String dispDocId) {
        Object _ret = this.riInvokeExportedMethod(this, "sendAction", new String[] {
                                                  "java.lang.String", "java.lang.String", "java.lang.String",
                                                  "java.lang.String"
        }, new Object[] { reciptantMailId, subject, msg, dispDocId });
        return (Boolean) _ret;
    }

    public void setCurrentRowInSlsQuoteVo(StringBuffer DocId) {
        Object _ret = this.riInvokeExportedMethod(this, "setCurrentRowInSlsQuoteVo", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { DocId });
        return;
    }

    public void setEntityNameToNull() {
        Object _ret = this.riInvokeExportedMethod(this, "setEntityNameToNull", null, null);
        return;
    }

    public void setInitialBindVariables() {
        Object _ret = this.riInvokeExportedMethod(this, "setInitialBindVariables", null, null);
        return;
    }

    public void setItemsOnTheBasisOfEnquiry(StringBuffer EnqNo) {
        Object _ret = this.riInvokeExportedMethod(this, "setItemsOnTheBasisOfEnquiry", new String[] {
                                                  "java.lang.StringBuffer" }, new Object[] { EnqNo });
        return;
    }

    public Integer setLatestPrice(String ItmId) {
        Object _ret = this.riInvokeExportedMethod(this, "setLatestPrice", new String[] { "java.lang.String" }, new Object[] {
                                                  ItmId });
        return (Integer) _ret;
    }

    public void setOputunityStatus() {
        Object _ret = this.riInvokeExportedMethod(this, "setOputunityStatus", null, null);
        return;
    }

    public void setQtyBs(oracle.jbo.domain.Number itmQty) {
        Object _ret = this.riInvokeExportedMethod(this, "setQtyBs", new String[] { "oracle.jbo.domain.Number" }, new Object[] {
                                                  itmQty });
        return;
    }

    public void setpolicy() {
        Object _ret = this.riInvokeExportedMethod(this, "setpolicy", null, null);
        return;
    }

    public Integer slsQuotPendingAt() {
        Object _ret = this.riInvokeExportedMethod(this, "slsQuotPendingAt", null, null);
        return (Integer) _ret;
    }

    public Boolean validationOnAddItem() {
        Object _ret = this.riInvokeExportedMethod(this, "validationOnAddItem", null, null);
        return (Boolean) _ret;
    }
}
