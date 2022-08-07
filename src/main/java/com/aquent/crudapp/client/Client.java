package com.aquent.crudapp.client;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {

    private Integer clientId;

    @NotNull
    @Size(min = 1, max = 50, message = "Company Name is Required with Max 50 Characters" )
    private String companyName;

    @NotNull
    @Size(min = 1, max = 50, message = "Website URI is required with a max of 50 characters")
    private String websiteURI;

    @NotNull
    @Size(min = 10, max = 11, message = "Phone Number is required with a max of 11 chatacters")
    private String phoneNum;

    @NotNull
    @Size(min = 1, max = 50, message = "Street Address is required with a max of 50 characters")
    private String mailingAddress;

    public Integer getClientId() {
        return clientId;
    }
    public void setClientId(Integer clientId){
        this.clientId = clientId;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getWebsiteURI() {
        return websiteURI;
    }
    public void setWebsiteURI(String websiteURI) {
        this.websiteURI = websiteURI;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public String getMailingAddress(){
        return mailingAddress;
    }
    public void setMailingAddress(String mailingAddress){
        this.mailingAddress = mailingAddress;
    }

}