package studios.ch07;

import java.util.ArrayList;

public class Quiz {
    
    private ArrayList<Question> quizQuestions;
    private ArrayList<Answer> userAnswers; // answers are expected to be entered in the exact same order as quizQuestions

    public Quiz() {}

    public Quiz(ArrayList<Question> aQuizQuestions) {
        this.quizQuestions = aQuizQuestions;
    }

    public ArrayList<Question> getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(ArrayList<Question> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public ArrayList<Answer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(ArrayList<Answer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public void addQuizQuestion(Question q) {
        this.quizQuestions.add(q);
    }

    public void runQuiz() {
        for (Question q : this.getQuizQuestions()) {
            
        }

    }

    public void gradeQuiz() {

    }
}
