package model.ListaDeMovimientos;

public class SoapenvEnvelope {
    private SoapenvBody soapenvBody;
    private String xmlnsSoapenv;
    private String xmlnsV1;
    private SoapenvHeader soapenvHeader;
    private String xmlnsV4;
    public SoapenvBody getSoapenvBody() {
        return soapenvBody;
    }
    public void setSoapenvBody(SoapenvBody soapenvBody) {
        this.soapenvBody = soapenvBody;
    }
    public String getXmlnsSoapenv() {
        return xmlnsSoapenv;
    }
    public void setXmlnsSoapenv(String xmlnsSoapenv) {
        this.xmlnsSoapenv = xmlnsSoapenv;
    }
    public String getXmlnsV1() {
        return xmlnsV1;
    }
    public void setXmlnsV1(String xmlnsV1) {
        this.xmlnsV1 = xmlnsV1;
    }
    public SoapenvHeader getSoapenvHeader() {
        return soapenvHeader;
    }
    public void setSoapenvHeader(SoapenvHeader soapenvHeader) {
        this.soapenvHeader = soapenvHeader;
    }
    public String getXmlnsV4() {
        return xmlnsV4;
    }
    public void setXmlnsV4(String xmlnsV4) {
        this.xmlnsV4 = xmlnsV4;
    }
}

