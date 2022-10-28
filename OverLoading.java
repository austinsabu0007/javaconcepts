/*This program is given to understannd method overloading. When the name of methods is same and the arguments 
 * inside them have different datatype or different number of arguments then those are treated differently...
 */
class box{
    int width;
    int length;
    int height;
    box(int w, int l, int h){ //here box have 3 arguments
      width= w;
      length= l;
      height= h;
    }
    box(int l, int h){//here box have 2 arguments
        length= l;
        height= h;
        width= 1;
    }
    box(){//here box have no arguments
        width= 10;
        height= 10;
        length= 10;
    }
    int area(){
        int area1;
        area1= width*height*length;
        return area1;
    }
}
class OverLoading{
    public static void main(String[] args) {
        box bx1= new box(10,20,10);//here box is named as bx1,bx2,bx3
        box bx2= new box(20,10);//with parameters in constructors which
        box bx3= new box();//determines the function accoring to the number of parameters.
        System.out.println(bx1.area());
        System.out.println(bx2.area());
        System.out.println(bx3.area());
    }
}