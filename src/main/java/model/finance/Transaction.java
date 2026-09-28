package model.finance;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Transaction {
    private int transactionID;
    private int userID;
    private Integer categoryID;
    private BigDecimal amount;
    private String description;
    private Timestamp transactionDate;

    public Transaction() {
    }

    public Transaction(int transactionID, int userID, Integer categoryID, BigDecimal amount, String description,
            Timestamp transactionDate) {
        this.transactionID = transactionID;
        this.userID = userID;
        this.categoryID = categoryID;
        this.amount = amount;
        this.description = description;
        this.transactionDate = transactionDate;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transactionID=" + transactionID + ", userID=" + userID + ", categoryID="
                + categoryID + ", amount=" + amount + ", description='" + description + '\''
                + ", transactionDate=" + transactionDate + '}';
    }
}