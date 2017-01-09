package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AccountData
{

    public AccountData(PaycheckAndDeductions pad)
    {
        this.pad = pad;
    }
    public AccountData(double paycheck)
    {
        this.paycheck = paycheck;
    }
    public AccountData()
    {

    }


    private DatabaseConnection db;
    private PaycheckAndDeductions pad;
    private Map<Integer, String> dateOfAccountTransaction;
    private Map<String, String> nameOfAccounts;
    private Map<String, String> balanceOfAccounts;
    private Map<Integer, Character> transactionType;
    private Map<String, String> transactionsOfAccounts;
    private Map<String, String> percentagesOfAccounts;
    private double iPhoneAmount;
    private double personalEmergencyAmount;
    private double familyEmergencyAmount;
    private double carAmount;
    private double investingAmount;
    private double clothingAmount;
    private double supplementsAmount;
    private double chessSetAmount;
    private double runningAmount;
    private double miscellaneousAmount;
    private double iPhoneBalance;
    private double personalEmergencyBalance;
    private double familyEmergencyBalance;
    private double carBalance;
    private double investingBalance;
    private double clothingBalance;
    private double supplementsBalance;
    private double chessSetBalance;
    private double runningBalance;
    private double miscellaneousBalance;
    private double paycheck;
    private double total;
    private String year;
    private String month;
    private String day;
    private String hour;
    private String minute;
    private String date;
    private String type;
    private String comment;

    private Map<String, String> comboColumData = new HashMap<String, String>();

    final private String[] accountListDB = {"iPhone", "Personal Emergency", "Family Emergency", "Car", "Investing",
            "Clothing", "Supplements", "Chess Set", "Running", "Miscellaneous"};
    final private String[] accountList = {"iPhoneAccount", "personalEmergencyAccount", "familyEmergencyAccount",
            "carAccount", "investingAccount", "clothingAccount", "supplementsAccount", "chessSetAccount",
            "runningAccount", "miscellaneousAccount"};

    public void setDateOfAccountTransaction(Map<Integer, String> dateOfAccountTransaction)
    {
        this.dateOfAccountTransaction = dateOfAccountTransaction;
    }
    public void setNameOfAccounts(Map<String, String> nameOfAccounts) throws SQLException
    {
        nameOfAccounts = new HashMap<String, String>();
        try
        {
            this.db = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
            this.db.getAccountList();

            Iterator itPre = this.db.getAccountListPre().iterator();
            Iterator itPost = this.db.getAccountListPost().iterator();

            while (itPre.hasNext())
            {
                String key = (String) itPre.next();
                String value = setAccountNameFirstLetterToCapital(((String) itPost.next()));


                nameOfAccounts.put(key, value);
            }

            this.nameOfAccounts = nameOfAccounts;
        }
        catch(SQLException s)
        {
            s.printStackTrace();
        }
    }
    public String setAccountNameFirstLetterToCapital(String accountName)
    {
        char firstLetter = accountName.charAt(0);
        String firstLetterString = String.valueOf(firstLetter);
        firstLetterString = firstLetterString.toUpperCase();

        int accountNameSize = accountName.length();
        String name = firstLetterString;

        for (int i = 1; i < accountNameSize; i++)
        {
            name = name + accountName.charAt(i);
            //System.out.println(name + " Original: " + accountName);
            //System.out.println("Length: " + accountNameSize);
        }

        return name;
    }
    public void setBalanceOfAccounts(Map<String, String> balanceOfAccounts) throws SQLException
    {
        balanceOfAccounts = new HashMap<String, String>();
        try
        {
            this.db = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
            this.db.getAccountList();

            Iterator itPre = this.db.getAccountListPre().iterator();

            while (itPre.hasNext())
            {
                String key = (String) itPre.next();
                double balance = Double.parseDouble(this.db.getBalanceOfAccount(key));
                balance = Math.floor(balance * 100)/100;
                double transactionAmount = Double.parseDouble(getTransactionsOfAccounts().get(key));
                //System.out.println(key+ " Balance: " + balance);
                System.out.println("Transaction amount: " + transactionAmount);
                System.out.println("Pre-balance: " + balance);
                balance = balance + (transactionAmount);
                balance = Math.floor(balance * 100) / 100;
                System.out.println("Balance of account: " + balance);
                String value = String.valueOf(balance);

                balanceOfAccounts.put(key, value);
            }

            this.balanceOfAccounts = balanceOfAccounts;
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
    public void setTransactionType(Map<Integer, Character> transactionType)
    {
        this.transactionType = transactionType;
    }
    public void setTransactionsOfAccounts(Map<String, String> transactionsOfAccounts) throws SQLException
    {
        transactionsOfAccounts = new HashMap<String, String>();
        try {
            this.db = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
            this.db.getAccountList();

            Iterator itPre = this.db.getAccountListPre().iterator();

            while (itPre.hasNext())
            {
                String key = (String) itPre.next();
                //System.out.println("Paycheck amount: " + this.paycheck);
                //System.out.println(this.paycheck);
                double transaction = this.paycheck * (Double.parseDouble(getPercentagesOfAccounts().get(key)) / 100.0);
                //System.out.println(transaction);
                transaction = Math.floor(transaction);
                //System.out.println("Transaction setting: " + transaction);
                String value = String.valueOf(transaction);

                transactionsOfAccounts.put(key, value);
            }

            this.transactionsOfAccounts = transactionsOfAccounts;
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
    public void setPercentagesOfAccounts(Map<String, String> percentagesOfAccounts) throws SQLException
    {
        percentagesOfAccounts = new HashMap<String, String>();
        try
        {
            this.db = new DatabaseConnection("jdbc:mariadb://localhost:3306/moneydatabase", "mmp", "rootofallevil");
            this.db.getAccountList();

            Iterator itPre = this.db.getAccountListPre().iterator();

            while (itPre.hasNext())
            {
                String key = (String) itPre.next();
                String value = String.valueOf(db.getAccountPercentages(key));

                percentagesOfAccounts.put(key, value);
            }

            this.percentagesOfAccounts = percentagesOfAccounts;
        }
        catch (SQLException s)
        {
            s.printStackTrace();
        }
    }
    public void setiPhoneAmount(double amount, double percentage)
    {
        iPhoneAmount = Math.floor(amount * percentage);
    }
    public void setPersonalEmergencyAmount(double amount, double percentage)
    {
        personalEmergencyAmount = Math.floor(amount * percentage);
    }
    public void setFamilyEmergencyAmount(double amount, double percentage)
    {
        familyEmergencyAmount = Math.floor(amount * percentage);
    }
    public void setCarAmount(double amount, double percentage)
    {
        carAmount = Math.floor(amount * percentage);
    }
    public void setInvestingAmount(double amount, double percentage)
    {
        investingAmount = Math.floor(amount * percentage);
    }
    public void setClothingAmount(double amount, double percentage)
    {
        clothingAmount = Math.floor(amount * percentage);
    }
    public void setSupplementsAmount(double amount, double percentage)
    {
        supplementsAmount = Math.floor(amount * percentage);
    }
    public void setChessSetAmount(double amount, double percentage)
    {
        chessSetAmount = Math.floor(amount * percentage);
    }
    public void setRunningAmount(double amount, double percentage)
    {
        runningAmount = Math.floor(amount * percentage);
    }
    public void setMiscellaneousAmount(double amount, double percentage)
    {
        miscellaneousAmount = Math.floor(amount * percentage);
    }
    public void setiPhoneBalance(double iPhoneBalance, double amount)
    {
        this.iPhoneBalance = iPhoneBalance + amount;
    }
    public void setPersonalEmergencyBalance(double personalEmergencyBalance, double amount)
    {
        this.personalEmergencyBalance = personalEmergencyBalance + amount;
    }
    public void setFamilyEmergencyBalance(double familyEmergencyBalance, double amount)
    {
        this.familyEmergencyBalance = familyEmergencyBalance + amount;
    }
    public void setCarBalance(double carBalance, double amount)
    {
        this.carBalance = carBalance + amount;
    }
    public void setInvestingBalance(double investingBalance, double amount)
    {
        this.investingBalance = investingBalance + amount;
    }
    public void setClothingBalance(double clothingBalance, double amount)
    {
        this.clothingBalance = clothingBalance + amount;
    }
    public void setSupplementsBalance(double supplementsBalance, double amount)
    {
        this.supplementsBalance = supplementsBalance + amount;
    }
    public void setChessSetBalance(double chessSetBalance, double amount)
    {
        this.chessSetBalance = chessSetBalance + amount;
    }
    public void setRunningBalance(double runningBalance, double amount)
    {
        this.runningBalance = runningBalance + amount;
    }
    public void setMiscellaneousBalance(double miscellaneousBalance, double amount)
    {
        this.miscellaneousBalance = miscellaneousBalance + amount;
    }
    public void setYear(String year)
    {
        this.year = year;
    }
    public void setMonth(String month)
    {
        if (Integer.parseInt(month) < 10)
        {
            this.month = "0" + month;
        }
        else
            this.month = month;
    }
    public void setDay(String day)
    {
        if (Integer.parseInt(day) < 10)
        {
            this.day = "0" + day;
        }
        else
            this.day = day;
    }
    public void setHour(String hour)
    {
        if (Integer.parseInt(hour) < 10)
        {
            this.hour = "0" + hour;
        }
        else
            this.hour = hour;
    }
    public void setMinute(String minute)
    {
        if (Integer.parseInt(minute) == 0)
        {
            this.minute = "00";
        }
        if (Integer.parseInt(minute) < 10)
        {
            this.minute = "0" + minute;
        }
        else
            this.minute = minute;
    }
    public void setDate()
    {
        date = year + "-" + month + "-" + day + "-" + hour + "-" + minute;
    }
    public void setType(String type)
    {
      this.type = type;
    }
    public void setComment(String comment)
    {
        this.comment = comment;
    }
    public void leftOver()
    {
        total = iPhoneAmount + personalEmergencyAmount + familyEmergencyAmount + carAmount
                + investingAmount + clothingAmount + supplementsAmount + chessSetAmount +
                runningAmount + miscellaneousAmount;


    }
    public void setComboColumData()
    {
        MoneyManagerControls mmc = new MoneyManagerControls();

        for (int i = 0; i < 10; i++)
        {
            comboColumData.put(mmc.getAccountList()[i], accountList[i]);
        }
    }

    public String[] getAccountListDB()
    {
        return accountListDB;
    }
    public Map<Integer, String> getDateOfAccountTransaction()
    {
        return dateOfAccountTransaction;
    }
    public Map<String, String> getNameOfAccounts()
    {
        return nameOfAccounts;
    }
    public Map<String, String> getBalanceOfAccounts()
    {
        return balanceOfAccounts;
    }
    public Map<Integer, Character> getTransactionType()
    {
        return transactionType;
    }
    public Map<String, String> getTransactionsOfAccounts()
    {
        return transactionsOfAccounts;
    }
    public Map<String, String> getPercentagesOfAccounts()
    {
        return percentagesOfAccounts;
    }

    public double getiPhoneAmount()
    {
        return iPhoneAmount;
    }
    public double getPersonalEmergencyAmount()
    {
        return personalEmergencyAmount;
    }
    public double getFamilyEmergencyAmount()
    {
        return familyEmergencyAmount;
    }
    public double getCarAmount()
    {
        return carAmount;
    }
    public double getInvestingAmount()
    {
        return investingAmount;
    }
    public double getClothingAmount()
    {
        return clothingAmount;
    }
    public double getSupplementsAmount()
    {
        return supplementsAmount;
    }
    public double getChessSetAmount()
    {
        return chessSetAmount;
    }
    public double getRunningAmount()
    {
        return runningAmount;
    }
    public double getMiscellaneousAmount()
    {
        return miscellaneousAmount;
    }
    public double getiPhoneBalance()
    {
        return iPhoneBalance;
    }
    public double getPersonalEmergencyBalance()
    {
        return personalEmergencyBalance;
    }
    public double getFamilyEmergencyBalance()
    {
        return familyEmergencyBalance;
    }
    public double getCarBalance()
    {
        return carBalance;
    }
    public double getInvestingBalance()
    {
        return investingBalance;
    }
    public double getClothingBalance()
    {
        return clothingBalance;
    }
    public double getSupplementsBalance()
    {
        return supplementsBalance;
    }
    public double getChessSetBalance()
    {
        return chessSetBalance;
    }
    public double getRunningBalance()
    {
        return runningBalance;
    }
    public double getMiscellaneousBalance()
    {
        return miscellaneousBalance;
    }
    public String getYear()
    {
        return year;
    }
    public String getMonth()
    {
        return month;
    }
    public String getDay()
    {
        return day;
    }
    public String getHour()
    {
        return hour;
    }
    public String getMinute()
    {
        return minute;
    }
    public String getDate()
    {
        return date;
    }
    public String getDateString(int year, int month, int day, int hour, int minute)
    {
        String monthString, dayString, hourString, minuteString, dateString;
        dateString = "" + year;
        List dateStringList = new ArrayList();
        if (month < 10)
        {
            monthString = "0" + month;
        }
        else
        {
            monthString = "" + month;
        }
        if (day < 10)
        {
            dayString = "0" + day;
        }
        else
        {
            dayString = "" + day;
        }
        if (hour < 10)
        {
            hourString = "" + hour;
        }
        else
        {
            hourString = "" + hour;
        }
        if (minute < 10)
        {
            minuteString = "0" + minute;
        }
        else
        {
            minuteString = "" + minute;
        }

        dateStringList.add(monthString);
        dateStringList.add(dayString);
        dateStringList.add(hourString);
        dateStringList.add(minuteString);

        Iterator it = dateStringList.iterator();

        while (it.hasNext())
        {
            dateString = dateString + "-" + it.next();

        }

        return dateString;
    }
    public String getType()
    {
        return type;
    }
    public String getComment()
    {
        return comment;
    }

    public Map<String, String> getComboColumData()
    {
        return comboColumData;
    }
    public String[] getAccountList()
    {
        return accountList;
    }

}
