import java.util.Scanner; 
  class MyStark {
      int stark[] = new int[10];
      int tos= -1;
      void push(int item){
          if(tos!=9){
              stark[++tos]= item;
          }
          else{
              System.out.println("Stack overflow");}
          }
         int pop(){
              if(tos<0){
                  System.out.println("Stack underflow");
                  return 0;
              }
              else{
                  return  stark[tos--];
              }
          
      }
  }
 public class StackCom { 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        MyStark mystac = new MyStark();
        MyStark mystac2 = new MyStark();
        int num, num2;
        System.out.println("enter 10 numbers");
        for(int i=0; i<10; i++){
            num= Sc.nextInt();
            mystac.push(num);
        }
        System.out.println("The numbers are :");
        for(int i=9; i>=0; i--){
            System.out.println(mystac.pop());
        }

    }
}
