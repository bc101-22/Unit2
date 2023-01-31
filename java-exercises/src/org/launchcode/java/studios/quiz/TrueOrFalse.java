package studios.ch07;

import java.util.ArrayList;

public class TrueOrFalse extends Question {

    public TrueOrFalse() {
        super();
    }

    public TrueOrFalse(String questionText, ArrayList<Answer> answers) { //  throws QuestionException {
        super(questionText, answers);
//        if (answers.size() != 2) {
//            throw new QuestionException("There can be only 2 answers for a True Or False question.");
//        }
    }

    // true or false question has only 1 correct answer
}
