//Multilevel hirachy means more than two classes are formed in hirachecal form of superclass and subclass
//here A is the superclass of B and B is the SuperClass of A.
class A{
        int a,b,c;
        A(int z, int y, int x){
            a=z;
            b=y;
            c=x;
        }
        void showabc(){
            System.out.println(a + " " + b + " " + c +" ");
        }
        void showfirst(){
            System.out.println(a); //note this showfirst()
        }
}
class B extends A{
        int d,e,f;
        B(int z, int y, int x, int w, int v, int u){
            super(z, y, x);
            d=w;
            e=v;
            f=u;
        }
        void showabcdef(){
            super.showabc();
            System.out.println(d + " " + e + " " + f +" ");
        }
        void showfirst(){
            System.out.println(d); //here showfirst() is overwritten
        }
}
class C extends B{
        int g,h,i;
        C(int z, int y, int x, int w, int v, int u, int t, int s, int r){
            super(z, y, x, w, v, u);
            g=t;
            h=s;
            i=r;
}
        void showabcdefghi(){
            super.showabcdef();
            System.out.println(g + " " + h + " " + i +" ");
}
            void showfirst(){
            System.out.println(g);//here show first is again over written
}
}
public class  InheritanceMultiHirachy {
    public static void main(String[] args) {
        C cx1 = new C(1,2,3,4,5,6,7,8,9);
        cx1.showabcdefghi();
        cx1.showfirst();
    }
}
//In this program the concept of overwritten is also explaind a function or method with same
//name and characteristics in subclasses can overwrite the same method in superclass
//if the name is same and data type inside constructor is different it won't overwrite....