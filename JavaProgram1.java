/* This is a code for a simple calculator which can perform addition,sustraction,division and multiplication
of two numbers */

/*This is a program using classes and objects */



import java.util.Scanner;//import scanner class for taking inputs from user.
class Storage { //a class named storage to  store the values and returing values after calculating them.
    double num1;
    double num2;//declaring variables

    double addition() {
    return num1+num2;
    }
    double substraction() {             
    return num1-num2;                   //functions which process and return calculations
    }
    double product() {
    return num1*num2;
    }
    double quotient() {
    return num1/num2;
    }
}
public class JavaProgram1 { //main class which runs first in program.
  public static void main(String[] args) {
      Storage St= new Storage();
      Scanner sc= new Scanner(System.in);
      System.out.println("Which operator do you need to use");
      System.out.println("1. +");
      System.out.println("2. -");
      System.out.println("3. *");
      System.out.println("4. /");
      int d= sc.nextInt();
      System.out.println("enter the numbers ");
      St.num1= sc.nextInt();
      St.num2= sc.nextInt();
      double ans;
    if(d==1){
        ans= St.addition();
        System.out.println(ans);
    }
    else if(d==2) {
        ans= St.substraction();
        System.out.println(ans);
    }
    else if(d==3) {
        ans= St.product();
        System.out.println(ans);
    }
    else if(d==4) {
        ans= St.quotient();
        System.out.println(ans);
    
    }

  }
}
