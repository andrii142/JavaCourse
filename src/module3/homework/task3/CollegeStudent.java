package module3.homework.task3;


public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName) {
        super(firstName);
    }

    public CollegeStudent(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public CollegeStudent(String lastName, String firstName, String collegeName, long id, int rating) {
        super(lastName, firstName);
        this.collegeName = collegeName;
        this.id = id;
        this.rating = rating;

        //super.setFirstName();
        //super.getFirstName();

    }

    //
    //
    //
    //
    //
    //
    //
}
