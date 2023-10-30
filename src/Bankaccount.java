public class Bankaccount {
    private int accountNumber;
    private int balance;
    private String customername;
    private String email;
    private String phonenumber;
    public Bankaccount(){
        this(12234,60,"9121526297");
    }


    public Bankaccount(int accountNumber,int balance,String customername,String cuatomerEmail,String cuatomerPhonenumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customername=customername;
        email=cuatomerEmail;
        phonenumber=cuatomerPhonenumber;
    }
    public Bankaccount(int accountNumber,int balance,String cuatomerPhonenumber){
        this(accountNumber,balance,"Tim","tim@ualr.edu",cuatomerPhonenumber);
    }

    public void alldetailsofcustomer(){
        System.out.println("customer name - "+customername+" \n balance - "+balance+"account Number- "+accountNumber+" \n email - "+email+"phone number - "+phonenumber);
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomername(String customername){
        this.customername=customername;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomername() {
        return customername;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
    public void withdraw(int amount){
        if(balance-amount<0){
            System.out.println("you don't have enough balance");
        }
        else {balance-=amount;
            System.out.println(amount+" is withdrawn from your account \n Now your balance is "+balance);
        }
    }
    public void diposit(int amount){
        balance+=amount;
        System.out.println(amount+" is diposited to your account \n Now your balance is "+balance);
    }
}
