class Account {
    int acc_Id;
    String acc_Name;

    Account(int a, String b) {
        this.acc_Id = a;
        this.acc_Name = b;
    }

    public void cal_Bal() {

    }

    public static void main(String[] args) {
        Account a1 = new Account(182, "Rohan");
        Account a2 = new Account(183, "Kajal");

        System.out.println("Id : " + a1.acc_Id);
        System.out.println("Name : " + a1.acc_Name);

        System.out.println("Id : " + a2.acc_Id);
        System.out.println("Name : " + a2.acc_Name);
    }
}