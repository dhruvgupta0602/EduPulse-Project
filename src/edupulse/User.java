package edupulse;

/**
 * Abstract class representing a generic user.
 * Demonstrates Abstraction and Inheritance.
 */
public abstract class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUser, String inputPass) {
        return this.username.equals(inputUser) && this.password.equals(inputPass);
    }

    public String getUsername() {
        return username;
    }

    // Abstract method forcing subclasses to implement their own menu
    public abstract void showMenu();
}