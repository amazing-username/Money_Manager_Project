package sample;

import java.util.Date;

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

    public void setAccountAmounts(double paycheck, String year, String month, String day, String hour, String minute)
    {
        AccountPercentages ap = new AccountPercentages();
        AccountData ad = new AccountData();


        ad.setiPhoneAmount(paycheck, ap.getiPhoneBatteryFundPercentage());
        ad.setPersonalEmergencyAmount(paycheck, ap.getPersonalEmergencyFundPercentage());
        ad.setFamilyEmergencyAmount(paycheck, ap.getFamilyEmergencyFundPercentage());
        ad.setCarAmount(paycheck, ap.getCarFundPercentage());
        ad.setInvestingAmount(paycheck, ap.getInvestingFundPercentage());
        ad.setClothingAmount(paycheck, ap.getClothingFundPercentage());
        ad.setSupplementsAmount(paycheck, ap.getSupplementFundPercentage());
        ad.setChessSetAmount(paycheck, ap.getChessSetFundPercentage());
        ad.setRunningAmount(paycheck, ap.getRunningFundPercentage());
        ad.setMiscellaneousAmount(paycheck, ap.getMiscellaneousFundPercentage());

        ad.setYear(year);
        ad.setMonth(month);
        ad.setDay(day);
        ad.setHour(hour);
        ad.setMinute(minute);
        ad.setDate();


        ad.setType("+");

        ad.setComment("Paycheck");
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