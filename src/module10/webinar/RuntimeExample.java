package module10.webinar;

public class RuntimeExample {
    public static void main(String[] args) {
        int[] array = new int[3];
        //0 1 2

        //ArrayIndexOutOfBoundsException: 3
        //System.out.println(array[3]);

        //System.out.println(111);

        //Arithmetic exception
        //if(array[2] != 0)
        System.out.println("result" + 10 / array[2]);

        String item = "phone";
        Sys system = null;

        if(item.equals("test")) {
            system = new Sys("test");
        }

        //any logic can be here
        if(system != null) system.getName();
        else System.out.println("system was null");
    }
}
