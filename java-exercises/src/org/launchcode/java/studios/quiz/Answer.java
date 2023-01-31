package studios.ch07;

import java.util.Objects;

public class Answer {
    private final String answerText;
    private boolean correct;

    Answer(String answerText, boolean correct) {
        this.answerText = answerText;
        this.correct = correct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Answer other = (Answer) o;
        return this.answerText == other.answerText && this.correct == other.correct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerText, correct);
    }

    public String getAnswerText() {
        return answerText;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
