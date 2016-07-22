package sample;



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