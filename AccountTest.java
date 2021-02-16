public class AccountTest{
public static void main(String[] args){

Account myAccount = new Account("jame", 500);
System.out.println(myAccount.getBalance());
myAccount.deposit(1500);
System.out.println(myAccount.getBalance());

//myaccount.setName("Henry");
//System.out.println(myAccount.getName());
}
}