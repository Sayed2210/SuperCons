public class SuperConstractor {
    public static void main(String[] args) {
        var h1=new A(10);
    }
    static class A{
        A(int y){
            System.out.println("n= "+y);
            System.out.println("A");
        }
    }
        class B extends A{
            B(int x){
            super(x);
            System.out.println("B");
            }
    }
        class C extends B{
           C(int z){
               super(z);
               System.out.println("C");
           }
        }
}
