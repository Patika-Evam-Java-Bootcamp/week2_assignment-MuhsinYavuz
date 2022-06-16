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
public class Payment {
    // Odeme ile ilgili oznıtelikler olusturuldu . 
       private int id;
    private boolean status;
    private Date paymentDate;
    private int memberAccountId;
    private double amount;

    public Payment() {
    }

    public Payment(int id, boolean status, Date paymentDate, int memberAccountId, double amount) {
        this.id = id;
        this.status = status;
        this.paymentDate = paymentDate;
        this.memberAccountId = memberAccountId;
        this.amount = amount;
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
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the memberAccountId
     */
    public int getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * @param memberAccountId the memberAccountId to set
     */
    public void setMemberAccountId(int memberAccountId) {
        this.memberAccountId = memberAccountId;
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
}
