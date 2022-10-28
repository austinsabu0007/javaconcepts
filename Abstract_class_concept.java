//This Program helps to understand the concept of java abstract.
//making a parent class abstract means, there must have and abstract method in it.
//Here the abstracted method should be override by its child class.
//The abstracted class cannot have an object
//The child will be valid of 2 conditions..
//1. The child class must override all abstract method of parent class. or
//2. The child class should be assigned as a abstract class
abstract class one{ //As abstract method is used class must also be assigned abstract.
abstract void name();
}
class two extends one{
    @Override
    void name(){
        System.out.println("HEllo WOrld");
    }
}
abstract class three extends one{//as abstract is given this class works even not override.
      void age(){                   //but it also can't have object.
        System.out.println("HEY");
      }
}
public class Abstract_class_concept {
    public static void main(String[] args) {
        //one on = new one(); -- It doesn't work because and abstract class can't have object.
        two to = new two();//This works
        //three th = new three();//Here this doesnot work.
        
    }
}
