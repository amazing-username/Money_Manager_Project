package sample;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class AccountInfo
{
	
	public AccountInfo()
	{
	}
	public AccountInfo(String date, String account, String balance, String transaction_Type, String transaction, String comment)
	{
		setDate(date);
		setAccount(account);
		setBalance(balance);
		setTransactionType(transaction_Type);
		setTransaction(transaction);
		setComment(comment);
	}
	
	final private StringProperty date = new SimpleStringProperty(this, "Date");
	final private StringProperty account = new SimpleStringProperty(this, "Account");
	final private StringProperty balance = new SimpleStringProperty(this, "Balance");
	final private StringProperty transactionType = new SimpleStringProperty(this, "Transaction_Type)");
	final private StringProperty transaction = new SimpleStringProperty(this, "Transaction");
	final private StringProperty comment = new SimpleStringProperty(this, "Comment");
	
	
	public StringProperty dateProperty()
	{
		return date;
	}
	public StringProperty accountProperty()
	{
		return account;
	}
	public StringProperty balanceProperty()
	{
		return balance;
	}
	public StringProperty transactionTypeProperty()
	{
		return transactionType;
	}
	public StringProperty transactionProperty()
	{
		return transaction;
	}
	public StringProperty commentProperty()
	{
		return comment;
	}


	final public void setDate(String date)
	{
		dateProperty().set(date);
	}
	final public void setAccount(String account)
	{
		accountProperty().set(account);
	}
	final public void setBalance(String balance)
	{
		balanceProperty().set(balance);
	}
	final public void setTransactionType(String transactionType)
	{
		transactionTypeProperty().set(transactionType);
	}
	final public void setTransaction(String transaction)
	{
		transactionProperty().set(transaction);
	}
	final public void setComment(String comment)
	{
		commentProperty().set(comment);
	}

	final public String getDate()
	{
		return dateProperty().get();
	}
	final public String getAccount()
	{
		return accountProperty().get();
	}
	final public String getBalance()
	{
		return balanceProperty().get();
	}
	final public String getTransactionType()
	{
		return transactionTypeProperty().get();
	}
	final public String getTransaction()
	{
		return transactionProperty().get();
	}
	final public String getComment()
	{
		return commentProperty().get();
	}
}
