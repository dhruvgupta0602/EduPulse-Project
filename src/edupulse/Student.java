package edupulse;

public class Student extends User {
    private boolean hasVoted;

    public Student(String username, String password) {
        super(username, password);
        this.hasVoted = false;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    @Override
    public void showMenu() {
        System.out.println("\n--- STUDENT MENU ---");
        System.out.println("1. View Faculty List");
        System.out.println("2. Give Feedback");
        System.out.println("3. Logout");
    }
}