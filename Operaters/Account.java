   public class Account{
    int acc_id;
    String acc_name;
    int acc_amount;
    Account(int id, String name, int amount){
        this.acc_id = id ;
        this.acc_name = name;
        this.acc_amount =amount;
        System.out.println("Account class constructor");
    } 
    
    void deposit_Amount(int amount){
        this.acc_amount  = this.acc_amount + amount;
    }
    int get_Bal(){
        return this.acc_amount;
    }
    void withdrawl_Amount(int amount){
        this.acc_amount = this.acc_amount - amount;
    }
  
  
    public static void main(String[] args) {
       Account a =new Account(101,"Naveen", 55000);
       Account b =new Account(102,"Rachana", 40000);

       System.out.println(a.acc_amount);
       System.out.println(b.acc_amount);
       
       a.deposit_Amount(5000);

       System.out.println(a.get_Bal());
       System.out.println(b.get_Bal());


       a.withdrawl_Amount(1500);


       System.out.println("After withdrawl");
       System.out.println(a.get_Bal());
      
  
    }
}


