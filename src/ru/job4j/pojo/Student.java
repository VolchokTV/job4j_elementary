package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String FamiliyaImyaOtchestvo;
    private String group;
    private Date receiptDate;

    public String getFamiliyaImyaOtchestvo() {
        return FamiliyaImyaOtchestvo;
    }

    public void setFamiliyaImyaOtchestvo(String familiyaImyaOtchestvo) {
        this.FamiliyaImyaOtchestvo = familiyaImyaOtchestvo;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

}
