import java.util.LinkedList;

public class Question {
    private String questionText;
    private LinkedList<String> answers;
    private int correctAnswerIndex;

    public Question(String questionText, LinkedList<String> answers, int correctAnswerIndex){
        this.questionText = questionText;
        this.answers = answers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void printQuestion() {
        System.out.println(questionText);
        System.out.println("\ta) " + answers.get(0));
        System.out.println("\tb) " + answers.get(1));
        System.out.println("\tc) " + answers.get(2));
        System.out.println("\td) " + answers.get(3));
    }
}
