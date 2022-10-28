//Interfaces contains many abstract methods which should be used if implemented.
interface camera{
    void snap();
    void recordvid();
    default void switchon(){
        System.out.println("Turnon");//Default methods is not necassary to overridden
    }

}
interface network extends camera{//Interface can be inherited between interfaces
    void wifi();
    void bluetooth();
}
interface player{
    void playmusic();
    void playvideo();
}
class Phone{
    void outgoingcall(){
        System.out.println("Calling...");
    }
    void incomingcall(){
        System.out.println("Ringing");
    }
}
class SmartPhone extends Phone implements network,player{
    public void snap(){
        System.out.println("Capturing Pic...");//Public Modifier Must be used
    }
    public void recordvid(){
        System.out.println("Recording video...");
    }
    public void wifi(){
        System.out.println("Obtaining IP Address... Connected");
    }
    public void bluetooth(){
        System.out.println("Pairing Device....");
    }
    public void playmusic(){
        System.out.println("Playing Music...");
    }
    public void playvideo(){
        System.out.println("Playing Video...");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.bluetooth();
    }
    
}
