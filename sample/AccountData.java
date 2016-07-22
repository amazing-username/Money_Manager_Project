package sample;

import java.util.Map;

public class AccountData
{

    public AccountData()
    {

    }

    private Map<Integer, String> dateOfAccountTransaction;
    private Map<Integer, String> nameOfAccount;
    private Map<Integer, Double> balanceOfAcoount;
    private Map<Integer, Character> transactionType;
    private Map<Integer, Double> transaction;
    private Map<Integer, String> transactionComment;

    public void setDateOfAccountTransaction(Map<Integer, String> dateOfAccountTransaction)
    {
        this.dateOfAccountTransaction = dateOfAccountTransaction;
    }
    public void setNameOfAccount(Map<Integer, String> nameOfAccount)
    {
        this.nameOfAccount = nameOfAccount;
    }
    public void setBalanceOfAcoount(Map<Integer, Double> balanceOfAcoount)
    {
        this.balanceOfAcoount = balanceOfAcoount;
    }
    public void setTransactionType(Map<Integer, Character> transactionType)
    {
        this.transactionType = transactionType;
    }
    public void setTransaction(Map<Integer, Double> transaction)
    {
        this.transaction = transaction;
    }
    public void setTransactionComment(Map<Integer, String> transactionComment)
    {
        this.transactionComment = transactionComment;
    }

    public Map<Integer, String> getDateOfAccountTransaction()
    {
        return dateOfAccountTransaction;
    }
    public Map<Integer, String> getNameOfAccount()
    {
        return nameOfAccount;
    }
    public Map<Integer, Double> getBalanceOfAccount()
    {
        return balanceOfAcoount;
    }
    public Map<Integer, Character> getTransactionType()
    {
        return transactionType;
    }
    public Map<Integer, Double> getTransaction()
    {
        return transaction;
    }
    public Map<Integer, String> getTransactionComment()
    {
        return transactionComment;
    }
}
