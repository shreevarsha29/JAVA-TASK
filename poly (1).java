polymorphism:


Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

program:(overloading)

  public class Main{
  public static void main(String[]args){
     
 Shoppingitems ref=new Shoppingitems();
ref.additems("Laptop",80000);
ref.additems("Keyboard",1000,2);
ref.additems("Mouse",2000,3,30);
}
}

class Shoppingitems{
 void additems(String item_name,int price){
   System.out.println("item Name:"+item_name+" , "+"Original price:"+price);
}
void additems(String item_name,int price,int item_quantity){
int totalprice=price*item_quantity;
System.out.println("item Name:"+item_name+" , "+"Item quantity:"+item_quantity+"Total price:"+totalprice);
}
void additems(String item_name,int price,int item_quantity,int discount){
    double amount=(price*item_quantity)-discount;
    System.out.println("item Name"+item_name+"Item quantity"+item_quantity+"Total amount"+amount);
}
}


output:
item Name:Laptop , Original price:80000
item Name:Keyboard , Item quantity:2Total price:2000
item NameMouseItem quantity3Total amount5970.0
