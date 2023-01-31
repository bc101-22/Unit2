package studios.ch07;

import java.util.ArrayList;

public abstract class Question {
    private String questionText;
    private ArrayList<Answer> answers;

    public Question() {}

    public Question(String questionText, ArrayList<Answer> answers){
        this.questionText = questionText;
        this.answers = new ArrayList<>(answers); //make a hard copy to prevent modification of the source object from changing the target parameter
    }

    public void displayQuestion() {
        System.out.println(this.questionText);
    }

    // TODO: override in child class with polymorphism?
    public void displayAnswers() {
        for (Answer answer : this.getAnswers()) {
            System.out.println(answer.getAnswerText());
        }
    }

    //    TODO
    public String getQuestionText() {
        return questionText;
    }

    protected void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public ArrayList<Answer> getAnswers() {
        return new ArrayList<>(answers);
    }

    protected void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }

    // Expecting answers parameter holds all the answers in the exact same order as this.getAnswers()
    public boolean checkAnswer(ArrayList<Answer> answers) {
        for (int i = 0; i < this.getAnswers().size(); i++) {
            if(!answers.get(i).equals(this.getAnswers().get(i))) {
                return false;
            }
        }
        return true;
    }
    public void displayCorrectAnswer() {
        System.out.println(this.getQuestionText());
        for (Answer answer : this.getAnswers()) {
            System.out.println(answer.getAnswerText() + ": " +  answer.isCorrect());
        }
    }
}
