package oop;

public class Account extends Bank {
	private int acc_Id;
	private String acc_Name;
	private double acc_Bal;

	public int getAcc_Id() {
		return acc_Id;
	}

	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}

	public String getAcc_Name() {
		return acc_Name;
	}

	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}

	public double getAcc_Bal() {
		return acc_Bal;
	}

	public void setAcc_Bal(double acc_Bal) {
		this.acc_Bal = acc_Bal;
	}

	public void cal_Bal() {
	}

}