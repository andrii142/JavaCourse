package module9.questions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Kiev", "item1"));
        orderList.add(new Order("Lviv", "item2"));

        separateOrdersJava8(orderList);
    }

    private List<List<Order>> separateOrdersList(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);
        //Set<Order> set = new TreeSet<>(orders);
        //int count = set.size();

        List<List<Order>> resListGeneral = new ArrayList<>();
        for (Order order : set) {
            List<Order> resList = new ArrayList<>();
            for (Order listOrder : orders) {
                if (order.getCity().equals(listOrder.getCity())) {
                    resList.add(listOrder);
                }
            }
            resListGeneral.add(resList);
        }

        return resListGeneral;
    }

    private Map<String, List<Order>> separateOrders(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);
        //Set<Order> set = new TreeSet<>(orders);
        //int count = set.size();

        Map<String, List<Order>> resMap = new HashMap<>();
        for (Order order : set) {
            List<Order> resList = new ArrayList<>();
            for (Order listOrder : orders) {
                if (order.getCity().equals(listOrder.getCity())) {
                    resList.add(listOrder);
                }
            }
            resMap.put(order.getCity(), resList);
        }


        return resMap;
    }

    private static List<List<Order>> separateOrdersJava8(List<Order> orders) {
        Set<Order> set = new HashSet<>(orders);

        Function<Order, List<Order>> f = new Function<Order, List<Order>>() {
            @Override
            public List<Order> apply(Order order) {
                return set.stream()
                        .filter(o -> o.getCity().equals(order.getCity()))
                        .collect(Collectors.toList());

            }
        };

        List<List<Order>> res =  orders.stream()
                .map(f)
                .collect(Collectors.toList());
        return res;
    }
}
