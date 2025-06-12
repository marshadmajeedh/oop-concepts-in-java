package service;
import users.PrintUserDetails;
import users.User;

public class UserService implements PrintUserDetails {

    private User[] users;
    public UserService(User[] users) {
        this.users = users;
    }

    @Override
    public void printDetails() {
        for (User user : users) {
            System.out.println("Name: " + user.getName());
            System.out.println("Role : " + user.getRole());
            System.out.println();
        }
    }
}
