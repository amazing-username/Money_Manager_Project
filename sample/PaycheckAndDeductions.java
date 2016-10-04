package sample;

import java.sql.SQLException;

public class PaycheckAndDeductions
{

    public PaycheckAndDeductions()
    {

    }


    private double paycheck;
    private double deductionNumber;
    private double deductionPercentagte;
    private double netDistribute;

    public void setPaycheck(double paycheck)
    {
        this.paycheck = paycheck;
    }
    public void setDeductionNumber(double deductionNumber)
    {
        this.deductionNumber = deductionNumber;
    }
    public void setDeductionPercentage(double percentage)
    {
        this.deductionPercentagte = percentage;
    }
    public void setNetDistribute(Double netDistribute)
    {
        this.netDistribute = netDistribute;
    }

    public void setAccountAmounts(double paycheck, String year, String month, String day, String hour, String minute) throws SQLException
    {
        AccountPercentages ap = new AccountPercentages();
        AccountData ad = new AccountData();
        DatabaseConnection dbc = new DatabaseConnection();

        double accountBalances[] = new double[10];
        double accountAmounts[] = new double[10];
        String accountNames[] = new String[10];
        String accountNamesAccess[] = new String[10];

        setAccountNames(ad.getAccountListDB(), accountNames);
        setAccountNames(ad.getAccountList(), accountNamesAccess);


        setAccountAmounts(ad, accountAmounts); //Assigns account amounts to an array


        ad.setYear(year);
        ad.setMonth(month);
        ad.setDay(day);
        ad.setHour(hour);
        ad.setMinute(minute);
        ad.setDate();

        ad.setiPhoneBalance(Double.parseDouble(dbc.getBalanceOfAccount("iPhoneAccount")), ad.getiPhoneAmount());
        ad.setPersonalEmergencyBalance(Double.parseDouble(dbc.getBalanceOfAccount("personalEmergencyAccount")), ad.getPersonalEmergencyAmount());
        ad.setFamilyEmergencyBalance(Double.parseDouble(dbc.getBalanceOfAccount("familyEmergencyAccount")), ad.getFamilyEmergencyAmount());
        ad.setCarBalance(Double.parseDouble(dbc.getBalanceOfAccount("carAccount")), ad.getCarAmount());
        ad.setInvestingBalance(Double.parseDouble(dbc.getBalanceOfAccount("investingAccount")), ad.getInvestingAmount());
        ad.setClothingBalance(Double.parseDouble(dbc.getBalanceOfAccount("clothingAccount")), ad.getClothingAmount());
        ad.setSupplementsBalance(Double.parseDouble(dbc.getBalanceOfAccount("supplementsAccount")), ad.getSupplementsAmount());
        ad.setChessSetBalance(Double.parseDouble(dbc.getBalanceOfAccount("chessSetAccount")), ad.getChessSetAmount());
        ad.setRunningBalance(Double.parseDouble(dbc.getBalanceOfAccount("runningAccount")), ad.getRunningAmount());
        ad.setMiscellaneousBalance(Double.parseDouble(dbc.getBalanceOfAccount("miscellaneousAccount")), ad.getMiscellaneousAmount());


        setAccountBalances(ad, accountBalances); //Assigns account balances to an array

        ad.setType("+");
        ad.setComment("Paycheck");

        dbc.insertsToTable(ad.getDate(), accountNames, accountNamesAccess, accountBalances, ad.getType(), accountAmounts, ad.getComment());
    }
    public void setAccountNames(String[] noGames, String[] accountNames)
    {
        for (int i = 0; i < 10; i++)
        {
            accountNames[i] = noGames[i];
        }
    }
    public void setAccountBalances(AccountData ad, double[] accountBalances)
    {
        accountBalances[0] = ad.getiPhoneBalance();
        accountBalances[1] = ad.getPersonalEmergencyBalance();
        accountBalances[2] = ad.getFamilyEmergencyBalance();
        accountBalances[3] = ad.getCarBalance();
        accountBalances[4] = ad.getInvestingBalance();
        accountBalances[5] = ad.getClothingBalance();
        accountBalances[6] = ad.getSupplementsBalance();
        accountBalances[7] = ad.getChessSetBalance();
        accountBalances[8] = ad.getRunningBalance();
        accountBalances[9] = ad.getMiscellaneousBalance();
    }
    public void setAccountAmounts(AccountData ad, double[] accountAmounts)
    {
        accountAmounts[0] = ad.getiPhoneAmount();
        accountAmounts[1] = ad.getPersonalEmergencyAmount();
        accountAmounts[2] = ad.getFamilyEmergencyAmount();
        accountAmounts[3] = ad.getCarAmount();
        accountAmounts[4] = ad.getInvestingAmount();
        accountAmounts[5] = ad.getClothingAmount();
        accountAmounts[6] = ad.getSupplementsAmount();
        accountAmounts[7] = ad.getChessSetAmount();
        accountAmounts[8] = ad.getRunningAmount();
        accountAmounts[9] = ad.getMiscellaneousAmount();
    }
    public void printBalances(double[] balances)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Balances: " + balances[i]);
        }
    }
    public double getPaycheck()
    {
        return paycheck;
    }
    public double getDeductionNumber()
    {
        return deductionNumber;
    }
    public double getDeductionPercentage()
    {
        return deductionPercentagte;
    }
    public double getNetDistribute()
    {
        return netDistribute;
    }
}