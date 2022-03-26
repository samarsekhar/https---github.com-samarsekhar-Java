package oop;

public class Current_Account extends Account {
    private double min_Bal;

    public double getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }

    public void cal_Bal() {
        double balance = getAcc_Bal();
        balance = balance - getMin_Bal();
        System.out.print(getAcc_Name() + ": Balance is:" + balance);
    }
}