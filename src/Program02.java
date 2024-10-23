

class Account{
    private String name,email;
    private long acc_no;
    private double balance;
   public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public long getAcc_no(){
        return acc_no;
    }
    public void setAcc_no(long acc_no){
        this.acc_no = acc_no;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
public class Program02 {
    public static void main(String[] args) {
        Account a  = new Account();
        a.setName("Bishilesh");
        a.setAcc_no(123456789);
        a.setEmail("Bishilesh@123gmail.com");
        a.setBalance(300000.0d);


        System.out.println("Name : "+a.getName()+"\n Email : "+a.getEmail()+"\n Balance : "+a.getBalance()+"\n Account No : "+a.getAcc_no());

    }
}
