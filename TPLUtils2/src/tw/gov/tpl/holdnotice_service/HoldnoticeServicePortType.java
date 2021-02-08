
package tw.gov.tpl.holdnotice_service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebService(name = "HoldnoticeServicePortType", targetNamespace = "http://holdnotice-service.tpl.gov.tw")
public interface HoldnoticeServicePortType {


    /**
     * 
     * @return
     *     returns java.util.List<tw.gov.tpl.holdnotice_service.BrnName>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllBrn", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetAllBrn")
    @ResponseWrapper(localName = "getAllBrnResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetAllBrnResponse")
    public List<BrnName> getAllBrn();

    /**
     * 
     * @param arg0
     * @return
     *     returns tw.gov.tpl.holdnotice_service.UserHoldPriv
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNoPrivDays", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetNoPrivDays")
    @ResponseWrapper(localName = "getNoPrivDaysResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetNoPrivDaysResponse")
    public UserHoldPriv getNoPrivDays(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUserAllCancelHolds", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetUserAllCancelHolds")
    @ResponseWrapper(localName = "getUserAllCancelHoldsResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetUserAllCancelHoldsResponse")
    public List<String> getUserAllCancelHolds(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<tw.gov.tpl.holdnotice_service.NoticeResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getResultsWithHoldId", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetResultsWithHoldId")
    @ResponseWrapper(localName = "getResultsWithHoldIdResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetResultsWithHoldIdResponse")
    public List<NoticeResult> getResultsWithHoldId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cancelHold", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.CancelHold")
    @ResponseWrapper(localName = "cancelHoldResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.CancelHoldResponse")
    public boolean cancelHold(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<tw.gov.tpl.holdnotice_service.CancelExpiredHold>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNotChkOEHoldIds", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetNotChkOEHoldIds")
    @ResponseWrapper(localName = "getNotChkOEHoldIdsResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetNotChkOEHoldIdsResponse")
    public List<CancelExpiredHold> getNotChkOEHoldIds(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "chgOEHoldsStatus", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChgOEHoldsStatus")
    @ResponseWrapper(localName = "chgOEHoldsStatusResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChgOEHoldsStatusResponse")
    public void chgOEHoldsStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        List<String> arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chkAccessNetClient", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChkAccessNetClient")
    @ResponseWrapper(localName = "chkAccessNetClientResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChkAccessNetClientResponse")
    public String chkAccessNetClient(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sendReceiveItemID", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.SendReceiveItemID")
    @ResponseWrapper(localName = "sendReceiveItemIDResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.SendReceiveItemIDResponse")
    public boolean sendReceiveItemID(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExpandAvailHoldDate", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetExpandAvailHoldDate")
    @ResponseWrapper(localName = "getExpandAvailHoldDateResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.GetExpandAvailHoldDateResponse")
    public String getExpandAvailHoldDate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @param arg4
     */
    @WebMethod
    @RequestWrapper(localName = "chknewHoldNotice", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChknewHoldNotice")
    @ResponseWrapper(localName = "chknewHoldNoticeResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.ChknewHoldNoticeResponse")
    public void chknewHoldNotice(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     * @param arg1
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkNewVersion", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.CheckNewVersion")
    @ResponseWrapper(localName = "checkNewVersionResponse", targetNamespace = "http://holdnotice-service.tpl.gov.tw", className = "tw.gov.tpl.holdnotice_service.CheckNewVersionResponse")
    public List<String> checkNewVersion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}