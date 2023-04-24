import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> q1Answers = new LinkedList<>();
        q1Answers.add("Sofiq");
        q1Answers.add("Plovdiv");
        q1Answers.add("Burgas");
        q1Answers.add("Pleven");

        Question q1 = new Question("Capital of BG?", q1Answers, 0);

        q1.printQuestion();



    }
}