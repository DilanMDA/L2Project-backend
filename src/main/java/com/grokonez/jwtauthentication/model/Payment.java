package com.grokonez.jwtauthentication.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    private String merchant_id;
    private String order_id;
    private String payment_id;
    private Double payhere_amount;
    private String payhere_currency;
    private int status_code;
    private String md5sig;
    private String custom_1; //event id
    private String custom_2; //user id

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public Payment() {
    }

    @Override
    public String toString() {
        return "Payment{" +
                "merchant_id='" + merchant_id + '\'' +
                ", order_id='" + order_id + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", payhere_amount=" + payhere_amount +
                ", payhere_currency='" + payhere_currency + '\'' +
                ", status_code=" + status_code +
                ", md5sig='" + md5sig + '\'' +
                ", custom_1='" + custom_1 + '\'' +
                ", custom_2='" + custom_2 + '\'' +
                '}';
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public Double getPayhere_amount() {
        return payhere_amount;
    }

    public void setPayhere_amount(Double payhere_amount) {
        this.payhere_amount = payhere_amount;
    }

    public String getPayhere_currency() {
        return payhere_currency;
    }

    public void setPayhere_currency(String payhere_currency) {
        this.payhere_currency = payhere_currency;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMd5sig() {
        return md5sig;
    }

    public void setMd5sig(String md5sig) {
        this.md5sig = md5sig;
    }

    public String getCustom_1() {
        return custom_1;
    }

    public void setCustom_1(String custom_1) {
        this.custom_1 = custom_1;
    }

    public Payment(String merchant_id, String order_id, String payment_id, Double payhere_amount, String payhere_currency, int status_code, String md5sig, String custom_1) {
        this.merchant_id = merchant_id;
        this.order_id = order_id;
        this.payment_id = payment_id;
        this.payhere_amount = payhere_amount;
        this.payhere_currency = payhere_currency;
        this.status_code = status_code;
        this.md5sig = md5sig;
        this.custom_1 = custom_1;
    }
}
