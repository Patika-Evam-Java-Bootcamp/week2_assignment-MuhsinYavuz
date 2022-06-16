/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder.models;


import java.util.Date;


/**
 *
 * @author Hp
 */
public class Bill {
    // fatura ile ilgili değişkenler , faturanın barındırdığı öznitelikler tanımlandı . 
    private int id;
    private double amount;
    private Date processDate;
    private int billType ;
    private String memberCode;
    
     public Bill() {

    }
     public Bill(int id, double amount, Date processDate, int billType, String memberCode) {
        this.id = id;
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
        this.memberCode = memberCode;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the processDate
     */
    public Date getProcessDate() {
        return processDate;
    }

    /**
     * @param processDate the processDate to set
     */
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    /**
     * @return the billType
     */
    public int getBillType() {
        return billType;
    }

    /**
     * @param billType the billType to set
     */
    public void setBillType(int billType) {
        this.billType = billType;
    }

    /**
     * @return the memberCode
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * @param memberCode the memberCode to set
     */
    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }
    
}
