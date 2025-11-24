package edupulse;

import java.util.ArrayList;
import java.util.List;

public class SystemController {
    private List<Faculty> facultyList;
    private List<Student> students;
    private Admin admin;

    public SystemController() {
        facultyList = new ArrayList<>();
        students = new ArrayList<>();
        
        // Seed Data (Hardcoded for simulation)
        admin = new Admin("admin", "admin123");
        students.add(new Student("student1", "pass1"));
        students.add(new Student("student2", "pass2"));
        
        facultyList.add(new Faculty("Dr. Sharma", "Java Programming"));
        facultyList.add(new Faculty("Prof. Smith", "Data Structures"));
    }

    // Authentication Logic
    public User authenticate(String user, String pass) {
        if (admin.login(user, pass)) return admin;
        for (Student s : students) {
            if (s.login(user, pass)) return s;
        }
        return null;
    }

    public void addFaculty(String name, String subject) {
        facultyList.add(new Faculty(name, subject));
        System.out.println("SUCCESS: Faculty added.");
    }

    public void displayFaculty() {
        System.out.println("\n--- Faculty List ---");
        for (int i = 0; i < facultyList.size(); i++) {
            System.out.println((i + 1) + ". " + facultyList.get(i).getName() + " (" + facultyList.get(i).getSubject() + ")");
        }
    }

    public int getFacultyCount() {
        return facultyList.size();
    }

    public void submitFeedback(int facultyIndex, int rating, String comment) {
        if (facultyIndex >= 0 && facultyIndex < facultyList.size()) {
            // Validation: Rating must be 1-5
            if (rating < 1 || rating > 5) {
                System.out.println("ERROR: Rating must be between 1 and 5.");
                return;
            }
            Faculty f = facultyList.get(facultyIndex);
            f.addFeedback(new Feedback(rating, comment));
            System.out.println("Feedback submitted anonymously for " + f.getName());
        } else {
            System.out.println("ERROR: Invalid Faculty selection.");
        }
    }

    public void generateReports() {
        System.out.println("\n--- FEEDBACK REPORT ---");
        for (Faculty f : facultyList) {
            System.out.printf("Faculty: %-15s | Avg Rating: %.2f / 5.0  | Reviews: %d%n", 
                f.getName(), f.getAverageRating(), f.getFeedbackList().size());
        }
    }
    
    // Feature for finding top performer
    public void showTopPerformer() {
        Faculty top = null;
        double maxRating = -1.0;
        
        for(Faculty f : facultyList) {
            if(f.getAverageRating() > maxRating) {
                maxRating = f.getAverageRating();
                top = f;
            }
        }
        
        if(top != null) {
            System.out.println("\n*** TOP PERFORMER ***");
            System.out.println("Name: " + top.getName());
            System.out.println("Subject: " + top.getSubject());
            System.out.printf("Rating: %.2f\n", maxRating);
        } else {
            System.out.println("No data available.");
        }
    }
}