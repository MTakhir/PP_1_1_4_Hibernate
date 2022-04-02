package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Jon","Lennon", (byte) 40);
        System.out.println("User с именем – Jon добавлен в базу данных ");
        userService.saveUser("Paul","McCartney", (byte) 79);
        System.out.println("User с именем – Paul добавлен в базу данных ");
        userService.saveUser("George","Harrison", (byte) 58);
        System.out.println("User с именем – George добавлен в базу данных ");
        userService.saveUser("Ringo","Star", (byte) 81);
        System.out.println("User с именем – JRingo добавлен в базу данных ");
        List<User> allUsers= userService.getAllUsers();
        for (User user: allUsers) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
