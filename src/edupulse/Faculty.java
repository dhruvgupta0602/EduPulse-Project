package edupulse;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private String subject;
    private List<Feedback> feedbackList;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.feedbackList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
    
    public void addFeedback(Feedback f) {
        feedbackList.add(f);
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    // Analytics Logic: Calculate Average Score
    public double getAverageRating() {
        if (feedbackList.isEmpty()) return 0.0;
        double sum = 0;
        for (Feedback f : feedbackList) {
            sum += f.getRating();
        }
        return sum / feedbackList.size();
    }
}