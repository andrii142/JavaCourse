package module10.questions.java8;

import module10.questions.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Denis", 1001));
        userList.add(new User("Taras", 1002));
        userList.add(new User("Nina", 1003));

        Function<User, Long> function = new Function<User, Long>() {
            @Override
            public Long apply(User user) {
                return user.getId();
            }
        };

        Map<Long, String> map = userList.stream()
                .collect(Collectors.toMap(User::getId, User::getName));

        Map<UUID, String> map1 = userList.stream()
                .collect(Collectors.toMap(User::getUuid, User::getName));

    }
}
