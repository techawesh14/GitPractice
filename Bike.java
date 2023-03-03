class Bike{
String name;
int price;
String model;

Bike(String n, int p, String m){
this.name=n;
this.price=p;
this.model=m;

public static void main(String args[]){

Bike b1= new Bike("Pulsar",120000,"220");
Bike b2= new Bike("Apache",140000,"180");

System.out.println(b1.name+" "+b1.price+" "+b1.model);
System.out.println(b2.name+" "+b2.price+" "+b2.model);

}
}

}