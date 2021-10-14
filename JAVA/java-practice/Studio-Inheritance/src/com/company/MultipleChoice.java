package com.company;
import java.util.*;

public class MultipleChoice extends Question{

    private ArrayList<Integer> answer;
    private int userAnswer;
    private int correctAnswer;

    public MultipleChoice(String aQuestion, int numberOfPoints) {
        super(aQuestion, numberOfPoints);
    }

    public void captureAnswer() {
        Scanner input = new Scanner(System.in);
        userAnswer = input.nextInt();

    }

    public void displayPossibleAnswer() {
        for (String possibleAnswer: answer) {
            System.out.println((answer.indexOf(possibleAnswer) +1)+": " + possibleAnswer);
        }
    }
    private boolean compareAnswerToUserAnswer() {


    }
}

