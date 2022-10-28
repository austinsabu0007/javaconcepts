/*This Program demonstrate the concept of inheritance which is one of the cornerstone of object oriented programming. 
  Here a class name one is used which is a superclass, and the datas in the one is extended to the subclass two using
  extends keyword.
*/
class one{ //a class is named as one
int i; //variable declarations
int j;
//private l; //This variable cannot be transfered to class two because of private modifier, so it throws an error.
void ijprint(){ //printing the values in  i and j.
    System.out.println("The value of i and j are " + i +", " + j);
}
}
class two extends one{ //a class named two is declared which inherits class one and can use variables and objects in class one.
    int k;
    int sum;
  void ijkprint(){ //This shows that the variable i and j in one can be used in two also. but variables in two cannot be used in one.
      System.out.println("The values of i,j,k are "+ i +", " + j + "," + k);
  }
  void sum(){
      sum=i+j+k;
      System.out.println("The sum is " + sum);
  }
  //void printl(){
     // System.out.println("The value of l is " + l); cannot have l in this class due to restriction of modifiers.
  //}
} 
public class InheritanceOne{
    public static void  main(String[] args) {
        one box1 = new one();
        box1.i=10;
        box1.j=10;
       // box1.ijprint();
        two box2 = new two();
        box2.i=20;
        box2.j=40;
        box2.k=60;
        box2.ijprint();
        box2.ijkprint();
        box2.sum();
       // box2.printl();
        
    }
}