class Main {
    public static void main(String[] args) {
        Account ac=new Account("varsha",5000);
        System.out.println("Accholder name:"+ac.getAccholder());
        System.out.println("holder balance:"+ac.getbalance());
        
    }
}
class Account{
       private String Accholder;
       private int balance;
       Account(String Accholder,int balance){ 
           this.Accholder=Accholder;
           this.balance=balance;
           
       }
       public String getAccholder(){
           return Accholder;
           
       }
       public int getbalance(){
           return balance;
           
       }
    }
output:
Accholder name:varsha
holder balance:5000

=== Code Execution Successful ===