class Main {
    public static void main(String[] args) {
        Sample ref=new Sample("Tesla","V5");
        Sample ref1=new Sample("Lamborgini","M5");
        System.out.println(ref.carname);
        System.out.println(ref.carmodel);
        System.out.println(ref1.carname);
        System.out.println(ref1.carmodel);
       
    }
}
class Sample{
        String carname;
        String carmodel;
        Sample(String carname,String carmodel) {
            this.carname=carname;
            this.carmodel=carmodel;
        System.out.println("Default constructor");
    }
    }
