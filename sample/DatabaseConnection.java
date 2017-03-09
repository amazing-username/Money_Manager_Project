package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class DatabaseConnection
{

	public DatabaseConnection()
	{
	}
	public DatabaseConnection(String databaseURL, String username, String password) throws SQLException
	{
		this.username = username;
		this.password = password;
		this.databaseURL = databaseURL;
		hahaha = DriverManager.getConnection(this.databaseURL, this.username, this.password);

	}

	private static Connection hahaha;
	private String account;
	private static String username;
	private static String password;
	private static String databaseURL;
	private static Statement insertStatement;
	private Statement listStatement;
	private ResultSet statementExe;
	private List<AccountInfo> accountDetails;
	private Map<String, String> dbTableList = new HashMap<String, String>();
	private static List accountListPre = new ArrayList();
	private static List accountListPost = new ArrayList();
	final private String[] dbTableListValue = {"iPhone", "Personal Emergency", "Family Emergency", "Car", "Investing", "Clothing", "Supplement", "Chess Set", "Running", "Miscellaneous"};

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
	public void setDbTableList()
	{
		Iterator itPre = getAccountListPre().iterator();
		Iterator itPost = getAccountListPost().iterator();

		while (itPre.hasNext()) //&& itPost.hasNext())
		{
			String key = (String) itPost.next();
			//System.out.println(key);

			String value = (String) itPre.next();
			//System.out.println("Values:  " + value);
			dbTableList.put(key, value);
			//System.out.println("Size of data structure: " + dbTableList.size());
			//System.out.println("Value of running account: " + dbTableList.get(key));
		}
	}
	public void insertsToTable(String date, String account, String balance, String transaction_Type, String transaction, String comment) throws SQLException
	{
		setInsertStatement();
		getInsertStatement().executeUpdate("insert into " + account + " (Date, Account, Balance, Transaction_Type, Transaction, Comment)"
		+ " values (" + date + ", " + dbTableList.get(account) + ", " + balance + ", " + transaction_Type + ", " + transaction + ", " + comment + ")");

	}
	public void insertsToTable(String date, String[] accountNames, String[] accountNamesAccess, double[] accountBalances, String type, double[] accountAmounts, String comments) throws SQLException
	{
		setInsertStatement();

		for (int i = 0; i < 10; i++)
		{
			getInsertStatement().executeUpdate("insert into " + accountNamesAccess[i] + "(Date, Account, Balance, Transaction_Type, Transaction, Comment)"
					+ " values('" + date + "', '" + accountNames[i] + "', " + accountBalances[i] + ", '" + type + "', " + accountAmounts[i] + ", '" + comments + "')");
		}
	}
	public void insertsToTable(String accountNameDatabaseAccess, String date, String accountName, double accountBalance, String type, double accountAmount, String comment, double percentage) throws SQLException
	{
		setInsertStatement();

		getInsertStatement().executeUpdate( "insert into " + accountNameDatabaseAccess + "(Date, Account, Balance, Transaction_Type, Transaction, Comment, Percent)"
			+ " values('" + date + "', '" + accountName + "', " + accountBalance + ", '" + type + "', " + accountAmount + ", '" + comment + "', " + percentage + ")" );
	}

	public String getAccount()
	{
		return account;
	}
	public List getAccountListPre()
	{
		return accountListPre;
	}
	public List getAccountListPost()
	{
		return accountListPost;
	}
	public List getAccountDetails()
	{
		return accountDetails;
	}
	public Map getDbTableList()
	{
		return dbTableList;
	}
	public Connection getConnection()
	{
		return hahaha;
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
	public String getBalanceOfAccount(String account) throws SQLException
	{
		//String que = "select balance from " + "iPhoneAccount" + " order by Date Desc limit 1";
		String balance = "";

		String que = "select * from " + account + " order by Date Desc limit 1";
		try(
				//Connection hahaha = DriverManager.getConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
				Statement listStatement = hahaha.createStatement();
				ResultSet statementExe = listStatement.executeQuery(que);
		)
		{
			while (statementExe.next()) {
				balance = statementExe.getString("Balance");
			}
			return balance;
		}
		catch (SQLException ss)
		{
			ss.printStackTrace();
		}
		return balance;
	}
	public double getBalanceOfAccount(String accountName, double balance) throws SQLException
	{
		String que = "select Balance from " + accountName + " order by Date Desc limit 1";
		try(
						Statement stm = hahaha.createStatement();
						ResultSet stmExe = stm.executeQuery(que);
		)
		{
			while(stmExe.next())
			{
				balance = Double.parseDouble(stmExe.getString("Balance"));
			}


			return balance;
		}
	}
	public void getAccountList() throws SQLException
	{
		String accountList = "show tables from moneydatabase";

		try(
				Statement is = hahaha.createStatement();
				ResultSet example = is.executeQuery(accountList);
				)
		{
			while (example.next())
			{
				String tables = example.getString("Tables_in_moneydatabase");
				this.accountListPre.add(tables);
				//System.out.println(tables);

				//System.out.println(tables.length());
				printAccountNamesWithoutAccount(tables, tables.length());
			}

			//System.out.println("\n\nData pulled and put into a data structure and iterated: ");


		}
		catch (SQLException s)
		{
			s.printStackTrace();
		}
	}
	public void printAccountNamesWithoutAccount(String preName, int lettersInName) {


		final int ThereAreSevenLettersInTheWordAccount = 7;
		int loops = lettersInName - ThereAreSevenLettersInTheWordAccount;
		String postName = "";

		for (int i = 0; i < loops; i++)
		{
			postName = postName + preName.charAt(i);
			//System.out.println("Account: " + postName);

			if (i == (loops -1)) {
				this.accountListPost.add(postName);
			}
		}

		setDbTableList();

		//System.out.println("\n\n\nAccounts without the 'Account' in the name: ");
	}
	public double getAccountPercentages(String accountName) throws SQLException
	{
		//System.out.println("Account Name: " + accountName);
		String que = "select Percent from " + accountName + " order by date desc limit 1";
		try(
				Statement listStatement = hahaha.createStatement();
				ResultSet statementExe = listStatement.executeQuery(que);
		)
		{
			setAccountDetails(new ArrayList<>());
			while (statementExe.next())
			{
				String percent = statementExe.getString("Percent");
				accountName = percent;

			}
			return Double.parseDouble(accountName);
		}
	}
	public double getAccountPercent(String accountName) throws SQLException
	{
		String que = "select Percent from " + accountName + " order by Date Desc limit 1";
		try(
				Statement list = hahaha.createStatement();
				ResultSet listExe = list.executeQuery(que);
		)
		{
			double balance = 0;
			while (listExe.next())
			{
				 balance = Double.parseDouble(listExe.getString("Percent"));
			}
			//return listExe.getDouble("Percent");
			return balance;
		}
	}
}
