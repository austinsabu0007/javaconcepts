/*This program is to clear the concept of super keyword and shows the Two functions of 
super keywork
=> super keyword is used to import hidden variables from superclass to subclass.
=> super keyword is also used to import the values in constructors of superclass to the 
   constructors in the subclass */
class A{
    int j;
     int i;
    A(int z, int y){
        i=z;
        j=y;
    }
    void showij(){
        System.out.println("The value of ij =" + i + j);
    }
}
class B extends A{
    int k;
    B(int z, int y, int x){
        super(z, y);
        k=x;
    }
    void showk(){
        super.showij();
        System.out.println("The value of k is "+k);
    }

}
 public class InheritanceSuperKeyword {
    public static void main(String[] args){
        B bx1 = new B(4, 5, 6);
        bx1.showk();
        System.out.println(bx1.i);
    }
}
