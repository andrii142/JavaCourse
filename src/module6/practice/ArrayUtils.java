package module6.practice;

import java.util.Arrays;

/**
 * Created by zetokz on 19.09.16.
 */
public class ArrayUtils {

    static Order[] check(Order[] ar1, Order[] ar2) {

        //if(ar1.length > ar2.length)
        //Order[] res = new Order[ar1.length];

        int count = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.equals(order2)) count++;
            }
        }

        Order[] res = new Order[count];

        int index = 0;
        for (Order order1 : ar1) {
            for (Order order2 : ar2) {
                if (order1.equals(order2)) {
                    //res[index++] = order1;
                    res[index] = order1;
                    index++;
                }
            }
        }

        //return unique(res);
        return res;
    }

    static Order[] unique(Order[] orders) {
        return null;
    }

    static Order[] deleteEmpty(Order[] orders) {
        return null;
    }

    static Order[] getActive(Order[] orders) {
        Order[] ordersActive = new Order[orders.length];

        int index = 0;
        for (Order order : ordersActive) {
            if (order.isActive() && order.isDone())
                ordersActive[index++] = order;
        }

        Order[] activeOrders = Arrays    //construction how we use arrays loop in real life
                .stream(orders)
                .filter(order ->
                        order != null // delete empty
                                && order.isActive() && order.isDone()) //choose only done and active orders
                .toArray(Order[]::new);

        return deleteEmpty(orders);
    }


}
