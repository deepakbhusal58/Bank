package Bank;

public class BankDetails{
    String name;
    String nickname;
    static int numOfAccounts;
    private int accountNumber;
    String ifsc;
    final static String BANK_NAME="SBI";
    double balance;

    public BankDetails(String name,String ifsc ){
        this.name=name;
        this.ifsc=ifsc;
        numOfAccounts++;
        accountNumber=numOfAccounts;

    }

    public BankDetails(String name,String ifsc,String nickname ){
        this.name=name;
        this.ifsc=ifsc;
        this.nickname=nickname;
        numOfAccounts++;
        accountNumber=numOfAccounts;
        
    }

}