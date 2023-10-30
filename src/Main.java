public class Main {
    public static void main(String[] args) {
        Bankaccount account=new Bankaccount(91215262,50,"Chaitanya","cnallanukala@ualr.edu","9121526297");
        account.withdraw(40);
        account.diposit(20);
        System.out.println("The account number "+account.getAccountNumber());
        Bankaccount timsAccount=new Bankaccount(12345,90,"9121526297");
        System.out.println(timsAccount.getCustomername()+" "+timsAccount.getEmail());
    }
}