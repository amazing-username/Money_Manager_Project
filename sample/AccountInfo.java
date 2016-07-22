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
		setTransaction_Type(transaction_Type);
		setTransaction(transaction);
		setComment(comment);
	}
	
	private StringProperty date = new SimpleStringProperty(this, "Date");
	private StringProperty account = new SimpleStringProperty(this, "Account");
	private StringProperty balance = new SimpleStringProperty(this, "Balance");
	private StringProperty transaction_Type = new SimpleStringProperty(this, "Transaction_Type);
	private StringProperty transaction = new SimpleStringProperty(this, "Transaction");
	private StringProperty comment = new SimpleStringProperty(this, "Comment");
	
	
	public void setDate(String date)
	{
		this.date().set(date);
	}
	public void setAccount(String account)
	{
		this.account().set(account);
	}
	public void setBalance(String balance)
	{
		this.balance().set(balance);
	}
	public void setTransaction_Type(String transaction_Type)
	{
		this.transaction_Type().set(transaction_Type);
	}
	public void setTransaction(String transaction)
	{
		this.transaction().set(transaction);
	}
	public void setComment(String comment)
	{
		this.comment().set(comment);
	}

	public StringProperty getDate()
	{
		return date().get();
	}
	public StringProperty getAccount()
	{
		return account().get();
	}
	public StringProperty getBalance()
	{
		return balance().get();
	}
	public StringProperty getTransaction_Type()
	{
		return transaction_Type().get();
	}
	public StringProperty getTransaction()
	{
		return transaction().get();
	}
	public StringProperty getComment()
	{
		return comment().get();
	}
}
