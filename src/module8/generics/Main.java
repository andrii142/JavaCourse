package module8.generics;

public class Main {
    public static void main(String[] args) {
        //generic class example
        MyClass<Foo, Boo> myClass = new MyClass<>();

        //foo example
        Foo foo = new Foo();

        Foo foo2 = myClass.doSomething(foo);

        if(foo2 != null) System.out.println("success");

        //boo example
        Boo boo = new Boo();

        myClass.test(boo);



        //---------------------------------------------

        /*MyClassWithObject myClassWithObject = new MyClassWithObject();
        Foo fooObj = new Foo();

        Foo fooObj2 = (Foo) myClassWithObject.doSomething(fooObj);*/
    }
}
