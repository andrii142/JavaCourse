package module4.practice.dao;

public class TaskDAOImpl extends AbstractDAO implements DAO {

    //@Override
    //public Object save(Object task) {
    //   return super.save(task);
    //}

   // public Object saveTask(Object task) {
   //     return super.save(task);
   // }

    @Override
    public Object update(Object task) {
        return super.update(task);
    }

    @Override
    public boolean delete(Object task) {
        return super.delete(task);
    }

    @Override
    public Object find(long id) {
        Task task = new Task("Calculate min/max...");
        task.setId(id);
        return task;
    }

    void test() {
        Task task = new Task("Camlculate min/max..");
        super.save(task);

    }

    public static void main(String[] args) {
       // Task task = new Task("Camlculate min/max..");
      //  super.save(task);



    }

    /*@Override
    public Object save(Object task) {
        Task task1 = (Task) (task);
        System.out.println(task1.toString() + "saved");
        return task1;
    }

    @Override
    public Object update(Object task) {
        System.out.println(task.toString() + "updated");
        return task;
    }

    @Override
    public boolean delete(Object task) {
        System.out.println(task.toString() + "deleted");
        return true;
    }

    @Override
    public Object find(long id) {
        Task task = new Task("Calculate min/max...");
        task.setId(id);
        return task;
    }*/
}
