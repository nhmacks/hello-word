package model.ListaDeMovimientos;

public class Status {
    private Integer responseType;
    private String srvResponseCode;
    private String messageIdRes;
    private String busResponseMessage;
    private String srvResponseMessage;
    private Integer busResponseCode;
    public Integer getResponseType() {
        return responseType;
    }
    public void setResponseType(Integer responseType) {
        this.responseType = responseType;
    }
    public String getSrvResponseCode() {
        return srvResponseCode;
    }
    public void setSrvResponseCode(String srvResponseCode) {
        this.srvResponseCode = srvResponseCode;
    }
    public String getMessageIdRes() {
        return messageIdRes;
    }
    public void setMessageIdRes(String messageIdRes) {
        this.messageIdRes = messageIdRes;
    }
    public String getBusResponseMessage() {
        return busResponseMessage;
    }
    public void setBusResponseMessage(String busResponseMessage) {
        this.busResponseMessage = busResponseMessage;
    }
    public String getSrvResponseMessage() {
        return srvResponseMessage;
    }
    public void setSrvResponseMessage(String srvResponseMessage) {
        this.srvResponseMessage = srvResponseMessage;
    }
    public Integer getBusResponseCode() {
        return busResponseCode;
    }
    public void setBusResponseCode(Integer busResponseCode) {
        this.busResponseCode = busResponseCode;
    }
}


