package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.mariadb.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection
{

	public DatabaseConnection()
	{
	}
	public DatabaseConnection(String databaseURL, String username, String password) throws SQLException
	{
		hahaha = DriverManager.getConnection(databaseURL, username, password);

	}

	private Connection hahaha;
	private String account;
	private Statement insertStatement;
	private Statement listStatement;
	private ResultSet statementExe;
	private List<AccountInfo> accountDetails;

	public void setAccount(String account)
	{
		this.account = account;
	}
	public void setInsertStatement() throws  SQLException
	{
		insertStatement = hahaha.createStatement();
	}
	public void setAccountDetails(ArrayList accountDetails)
	{
        this.accountDetails = accountDetails;
	}

	/*
	 * going to use the account variable for multi-purpose use
	 * at the moment it is just used for testing the table
	 * switching but soon it will be used for adding values
	 * to tables.
	 */
	public void insertsToTable(String date, String Account, String balance, String transaction_Type, String transaction, String comment) throws SQLException
	{
		setInsertStatement();
		getInsertStatement().executeUpdate("insert into " + account + " (Date, Account, Balance, Transaction_Type, Transaction, Comment)"
		+ " values (" + date + ", " + account + ", " + balance + ", " + transaction_Type + ", " + transaction + ", " + comment + ")");

	}

	public String getAccount()
	{
		return account;
	}
	public List getAccountDetails()
	{
		return accountDetails;
	}
	public Statement getInsertStatement()
	{
		return insertStatement;
	}
	public List<AccountInfo> getAccountInfo() throws SQLException
	{
		String que = "select * from " + getAccount() + " order by Date Desc";
		try(
			Statement listStatement = hahaha.createStatement();
			ResultSet statementExe = listStatement.executeQuery(que);
		)
		{
			setAccountDetails(new ArrayList<>());
            while (statementExe.next())
            {
                String date = statementExe.getString("Date");
                String accountName = statementExe.getString("Account");
                String balance = statementExe.getString("Balance");
                String transaction_Type = statementExe.getString("Transaction_Type");
                String transaction = statementExe.getString("Transaction");
                String comment = statementExe.getString("Comment");

                AccountInfo ai = new AccountInfo(date, accountName, balance, transaction_Type, transaction, comment);
                getAccountDetails().add(ai);
            }
            return getAccountDetails();
        }

    }
}
