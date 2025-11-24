package edupulse;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- ADMIN MENU ---");
        System.out.println("1. Add New Faculty");
        System.out.println("2. View Feedback Reports");
        System.out.println("3. View Top Performer");
        System.out.println("4. Logout");
    }
}