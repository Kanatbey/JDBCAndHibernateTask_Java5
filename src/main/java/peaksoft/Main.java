package peaksoft;
import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();

//        userService.createUsersTable();
//        userService.saveUser("Aibek","Abdigaparov", (byte) 65);
//        userService.saveUser("Kurbanali","Abdurasilov", (byte) 71);
//        userService.saveUser("Kadyrbek","Esirkeev", (byte) 77);
//        userService.saveUser("Iskak","Myimanali uulu", (byte) 63);
//        userService.saveUser("Nurmuhammed","Myktybek uulu", (byte) 72);


//        userService.removeUserById(3);
//
        List<User> allUsers = userService.getAllUsers();
        allUsers.forEach(System.out::println);

        System.out.println(userService.existsByFirstName("Roza"));
//
//        userService.dropUsersTable();
//
//        System.out.println(userService.getAllUsers());
//
//        userService.cleanUsersTable();
    }
}
