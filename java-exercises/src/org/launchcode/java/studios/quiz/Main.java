package studios.ch07;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test trueOrFalse Question
        Answer choiceT = new Answer("True", true);
        Answer choiceF = new Answer("False", false);
        ArrayList<Answer> answersTOF = new ArrayList<>();
        answersTOF.add(choiceT);
        answersTOF.add(choiceF);
        TrueOrFalse tof = new TrueOrFalse("LC101 teaches Javascript", answersTOF);

        System.out.println("---------- Testing True OR False----------");
        tof.displayCorrectAnswer();

        Answer userAnswerTOF1_1 = new Answer("True", false);
        Answer userAnswerTOF1_2 = new Answer("False", true);
        ArrayList<Answer> userAnswerTOF1 = new ArrayList<>();
        userAnswerTOF1.add(userAnswerTOF1_1);
        userAnswerTOF1.add(userAnswerTOF1_2);

        System.out.println(tof.checkAnswer(userAnswerTOF1));


        // test MultipleChoice Question
        Answer choiceA = new Answer("JavaScript", true);
        Answer choiceB = new Answer("C#", false);
        Answer choiceC = new Answer("PHP", false);
        ArrayList<Answer> answersMC = new ArrayList<>();
        answersMC.add(choiceA);
        answersMC.add(choiceB);
        answersMC.add(choiceC);
        MultipleChoice mc = new MultipleChoice("Which one of the following languages is taught in LC101?", answersMC);

        System.out.println("---------- Testing Multiple Choice ----------");
        mc.displayCorrectAnswer();

        // TODO: further test error handling(eg. entering 2 answers as true in MC/TOF)
        // test checkAnswer() returns correct result when the answers ArrayList provided is correct
        Answer userAnswerMC1_1A = new Answer("JavaScript", true);
        Answer userAnswerMC1_2A = new Answer("C#", false);
        Answer userAnswerMC1_3A = new Answer("PHP", false);
        ArrayList<Answer> userAnswerMC1 = new ArrayList<>();
        userAnswerMC1.add(userAnswerMC1_1A);
        userAnswerMC1.add(userAnswerMC1_2A);
        userAnswerMC1.add(userAnswerMC1_3A);

        System.out.println("Multiple Choice - expected: true || " + mc.checkAnswer(userAnswerMC1)); // true expected

        // test checkAnswer() returns correct result when the answers ArrayList provided is incorrect
        Answer userAnswerMC1_1B = new Answer("JavaScript", false);
        Answer userAnswerMC1_2B = new Answer("C#", true);
        Answer userAnswerMC1_3B = new Answer("PHP", false);
        ArrayList<Answer> userAnswerMC2 = new ArrayList<>();

        userAnswerMC2.add(userAnswerMC1_1B);
        userAnswerMC2.add(userAnswerMC1_2B);
        userAnswerMC2.add(userAnswerMC1_3B);

        System.out.println("Multiple Choice - expected: false || " + mc.checkAnswer(userAnswerMC2)); // false expected


        // test CheckBox Question
        Answer choiceW = new Answer("JavaScript", true);
        Answer choiceX = new Answer("Java", true);
        Answer choiceY = new Answer("PHP", false);
        Answer choiceZ = new Answer("Pearl", false);
        ArrayList<Answer> answersCB = new ArrayList<>();
        answersCB.add(choiceW);
        answersCB.add(choiceX);
        answersCB.add(choiceY);
        answersCB.add(choiceZ);
        CheckBox cb = new CheckBox("Which ones of the following languages are taught in LC101?", answersCB);

        System.out.println("---------- Testing Check Box ----------");
        cb.displayCorrectAnswer();

        // test checkAnswer() returns correct result when the answers ArrayList provided is correct
        Answer userAnswerCB1_1W = new Answer("JavaScript", true);
        Answer userAnswerCB1_1X = new Answer("Java", true);
        Answer userAnswerCB1_1Y = new Answer("PHP", false);
        Answer userAnswerCB1_1Z = new Answer("Pearl", false);
        ArrayList<Answer> userAnswerCB1 = new ArrayList<>();
        userAnswerCB1.add(userAnswerCB1_1W);
        userAnswerCB1.add(userAnswerCB1_1X);
        userAnswerCB1.add(userAnswerCB1_1Y);
        userAnswerCB1.add(userAnswerCB1_1Z);

        System.out.println("Check Box - expected: true || " + cb.checkAnswer(userAnswerCB1)); // true expected

        // test checkAnswer() returns correct result when the answers ArrayList provided is incorrect
        Answer userAnswerCB1_2W = new Answer("JavaScript", true);
        Answer userAnswerCB1_2X = new Answer("Java", false);
        Answer userAnswerCB1_2Y = new Answer("PHP", false);
        Answer userAnswerCB1_2Z = new Answer("Pearl", false);
        ArrayList<Answer> userAnswerCB2 = new ArrayList<>();
        userAnswerCB2.add(userAnswerCB1_2W);
        userAnswerCB2.add(userAnswerCB1_2X);
        userAnswerCB2.add(userAnswerCB1_2Y);
        userAnswerCB2.add(userAnswerCB1_2Z);

        System.out.println("Check Box - expected: false || " + cb.checkAnswer(userAnswerCB2)); // false expected


        // Test Quiz
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(tof);
        questions.add(mc);
//        questions.add(cb);

        Quiz q = new Quiz(questions);

    }
}
