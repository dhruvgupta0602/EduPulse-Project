package edupulse;

import java.util.Scanner;

public class EduPulseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemController controller = new SystemController();
        User currentUser = null;

        System.out.println("========================================");
        System.out.println("   EduPulse: Faculty Feedback System");
        System.out.println("========================================");

        while (true) {
            // 1. LOGIN PHASE
            if (currentUser == null) {
                System.out.println("\n[LOGIN REQUIRED]");
                System.out.print("Username (Try 'admin' or 'student1'): ");
                String u = scanner.next();
                System.out.print("Password (Try 'admin123' or 'pass1'): ");
                String p = scanner.next();

                currentUser = controller.authenticate(u, p);
                if (currentUser == null) {
                    System.out.println("Invalid credentials! Try again.");
                } else {
                    System.out.println("Login Successful! Welcome " + u);
                }
            } else {
                // 2. MENU PHASE
                currentUser.showMenu();
                System.out.print("Enter Choice: ");
                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // clear buffer
                    continue;
                }

                if (currentUser instanceof Admin) {
                    // --- ADMIN ACTIONS ---
                    switch (choice) {
                        case 1:
                            System.out.print("Enter Faculty Name: ");
                            scanner.nextLine(); // consume newline
                            String name = scanner.nextLine();
                            System.out.print("Enter Subject: ");
                            String subject = scanner.nextLine();
                            controller.addFaculty(name, subject);
                            break;
                        case 2:
                            controller.generateReports();
                            break;
                        case 3:
                            controller.showTopPerformer();
                            break;
                        case 4:
                            currentUser = null;
                            System.out.println("Logged out.");
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                } else if (currentUser instanceof Student) {
                    // --- STUDENT ACTIONS ---
                    switch (choice) {
                        case 1:
                            controller.displayFaculty();
                            break;
                        case 2:
                            controller.displayFaculty();
                            System.out.print("Select Faculty ID to rate: ");
                            int fid = scanner.nextInt();
                            
                            if(fid > 0 && fid <= controller.getFacultyCount()) {
                                System.out.print("Enter Rating (1-5): ");
                                int rating = scanner.nextInt();
                                System.out.print("Enter Short Comment: ");
                                scanner.nextLine(); // consume newline
                                String comment = scanner.nextLine();
                                controller.submitFeedback(fid - 1, rating, comment);
                            } else {
                                System.out.println("Invalid ID.");
                            }
                            break;
                        case 3:
                            currentUser = null;
                            System.out.println("Logged out.");
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                }
            }
        }
    }
}