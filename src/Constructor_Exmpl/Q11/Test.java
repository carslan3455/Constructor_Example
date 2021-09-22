package Constructor_Exmpl.Q11;
class Demo{
    int a,b;
    Demo(){
        a= 10;
        b= 20;
    }
    public void print(){
        System.out.println("a= "+a+" b= "+b );
    }
}
public class Test {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = obj1;
        Demo obj3 = obj2;
        obj1.a+=1;
        obj2.b+=1;
        obj1.print();
        obj2.print();
        obj3.print();

    }
}
