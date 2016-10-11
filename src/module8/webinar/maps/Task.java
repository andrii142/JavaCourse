package module8.webinar.maps;

import java.util.List;

public class Task implements Comparable<Task> {
    private String desciption;

    private List<Solution> solutions;

    public Task(String desciption) {
        this.desciption = desciption;
    }

    @Override
    public int compareTo(Task task) {
        return this.desciption.length() - task.desciption.length();
    }

    @Override
    public String toString() {
        return "Task{" +
                "desciption='" + desciption + '\'' +
                '}';
    }

    public void setSolutions(List<Solution> solutions) {
        this.solutions = solutions;
    }
}
