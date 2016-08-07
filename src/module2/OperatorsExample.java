package module2;

public class OperatorsExample {

    //TODO live coding using basic operators

    public static void main(String args[]) {

        //Conditional Operator ( ? : )
        /*int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);*/

        //instance of Operator

        String name = "James";
        boolean result = name instanceof String;
        System.out.println(result);

        //bitwise operators

        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        //logical operators

        /*boolean a = true;
        boolean b = false;

        System.out.println("a && b = " + (a&&b));

        System.out.println("a || b = " + (a||b) );

        System.out.println("!(a && b) = " + !(a && b));*/
    }
}
