

/*This program is to demostrate the exception handling in java.
 * Before moving to the program we can learn some theory.
 * Execptions are the unusal or not normal working condition of a program.
 * As a error or exception occurs the program stops working.
 * In order to run the program you need to handle the exceptions.
 * #There are 3 types of errors
 * @syntax error :- Due to mistakes occur in syntax.eg forgetting semicolon;
 * @logical error:- Here program doesnt encounter an error but the output is unpredictable.
 * @Runtime error:- This occurs on run time. eg getting lost connection to internet.
 * 
 * #There are 2 types of execptions
 * @checked exeception:- These are handles by compilers
 * @unchecked exeception:- These are runtime Execeptions
 * 
 * #5 main keywords used in exception handling
 * @try:- The code which might throw error is kept inside try block.
 * @catch:- This catches the error in the code inside try block.
 * @throw:- Used to explictly throw error(Which means here we are throwing errors)
 * @throws:- It act as a warining and Tells the program that code may throw specific error.
 * @finally:- code inside finally will executed even if error occurs or not.
 */
class one{
    public static int divide(int a) throws ArithmeticException{ 
//Here the throws keyword says the method divide might throw ArithmeticException.
        int z=a/0;
        return z;
    }
}
public class ExceptionHandling {    
    public static void main(String[] args) {

        try{
            one.divide(1);//This code cause exception so put in try block
        }
        
        catch(ArithmeticException a){//Catch catches arithmetic exception in code and excute the block.
            System.out.println("Arithemetic Exception");
        }
        try{
            throw new ArrayIndexOutOfBoundsException("it is an array error");//here an error is thrown by programmer explictly.
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        finally{
            System.out.println("This code will executed even if there is exception or not.");
        }
    }
}
