package sample;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection
{

	public DatabaseConnection()
	{
	}
	public DatabaseConnection(String databaseURL, String username, String password)
	{
		hahaha = DriveManager.getConnection(databaseURL, username, password);
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
	public void setInsertStatement()
	{
		insertStatement = hahaha.createStatement();
	}
	public void setListStatement()
	{
		listStatement = hahaha.createStatement();
	}
	public void setStatementExe(String que)
	{
		statementExe = listStatement.execuiteQuery(que);
	}
	public void setAccountDetails()
	{

	}


	/*
	 * going to use the account variable for multi-purpose use
	 * at the moment it is just used for testing the table
	 * switching but soon it will be used for adding values
	 * to tables.
	 */
	public void insertsToTable(String date, String Account, String balance, String transaction_Type, String transaction, String comment)
	{
		setInsertStatement();
		getInsertStatement().executeUpdate("insert into " + account " (Date, Account, Balance, Transaction_Type, Transaction, Comment)"
		+ " values (" + date + ", " + account + ", " + balance + ", " + transaction_Type + ", " + transaction + ", " + comment + ")");

	}

	public String getAccount()
	{
		return account;
	}
	public List<AccountInfo> getAccountInfo() throws SQLException
	{
		String que = "select * from " + account + " order by Date Desc";
		try(
			setListStatement();
			setStatementExe(que);
		)
		{
			setAccountDetails();
}
