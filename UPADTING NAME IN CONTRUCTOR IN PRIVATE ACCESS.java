// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Account ac=new Account("varsha",5000);
        System.out.println("Accholder name:"+ac.getAccholder());
        System.out.println("holder balance:"+ac.getbalance());
        ac.setAccholder("Jith");
        System.out.println("update Accholder name:"+ac.getAccholder());
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
       public void setAccholder(String Accholder){
           this.Accholder=Accholder;
       }
    }
    
OUTPUT:

Accholder name:varsha
holder balance:5000
update Accholder name:Jith

=== Code Execution Successful ===