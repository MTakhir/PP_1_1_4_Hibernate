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
        userService.saveUser("Paul","McCartney", (byte) 79);
        userService.saveUser("George","Harrison", (byte) 58);
        userService.saveUser("Ringo","Star", (byte) 81);
        List<User> allUsers= userService.getAllUsers();
        for (User user: allUsers) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
