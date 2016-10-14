package module9.webinar.functions;

public class Person {
    private int personId;
    private String jobDescription;

    public Person() {
    }

    public Person(int personId, String jobDescription) {
        this.personId = personId;
        this.jobDescription = jobDescription;
    }

    public int getPersonId() {
        return personId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("personId=").append(personId);
        sb.append(", jobDescription='").append(jobDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
