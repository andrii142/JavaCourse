package module6.questions;

public class DAOImpl implements DAO {
    @Override
    public Order save(Order order) {
        System.out.println(order + " saved");
        return order;
    }
}
