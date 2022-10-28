//Dynamic method dispatching is a concept in polymorphism.
//It is creating an object of superclass and subclass in one line.
//It acutally means making the superclass as a reference.
//Objects run in runtime so it is called Dynamic
//Here the subclass is object used.
package myfile;
      //superclass
class phone{//class phone created
    void name(){ 
        System.out.println("Nokia");//method which is going to be overrided
    }
    void ring(){
        System.out.println("Ringing");//a method in phone
    }
}
     //subclass
class smartphone extends phone{// class smartphone created and inherited phone class
    @Override
    void name(){
        System.out.println("Samsung");//override method
    }
    void music(){
        System.out.println("Playing Music");//a method in smartphone
    }
}
class Dynamic_Method_Dispatching {
    public static void main(String[] args) {
        phone object = new smartphone();
        /*we can see here the object of class phone is named as object
         have a dynamically allocted object of smartphone
         from this its clear that the syntax can only be
         superclass name = new subclass
         now there are 3 scenrios 
         1. The methods in class phone will be working.
         2. The methods which are overriden also works.
         3. The methods in smartphone doesn't works.
        */
        object.name();//This works because it is an overrided method
        object.ring();//This also works because it is an method of phone class.
       // object.music();This line doesnt work. because it is a method of smartphone class.
        
    }
}
