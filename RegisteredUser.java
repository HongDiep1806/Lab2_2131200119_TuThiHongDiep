
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class RegisteredUser {

    static List<User> listOfUser = Database.userList;

    public static boolean AddUser(User user) {
        for (User currentUser : listOfUser) {
            if (currentUser.getUserID().equals(user.getUserID())) {
                return false;
            }
        }
        listOfUser.add(user);
        return true;
    }

    public static boolean RemoveUser(User user) {
        for (User currentUser : listOfUser) {
            if (currentUser.getUserID().equals(user.getUserID())) {

                listOfUser.remove(user);
                return true;
            }
        }
        return false;
    }

}
