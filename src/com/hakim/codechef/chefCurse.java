package com.hakim.codechef;

import java.util.Scanner;

public class chefCurse {
    public static void main(String[] args) {
        //? N => questions
        //? correct answer 3 marks
        //? incorrect answer -1 marks
        //? X => correct
        //? rest incorrect
        //? P => at least marks

        //? N X P

        //? case => 5 questions 3 correct (Score 3 * 2 = 6) 2 incorrect (score 6 - 2 = 4) score needed 3 (pass)

        Scanner input = new Scanner(System.in);

        int times = input.nextInt();

        while(times > 0){

            int numberOfQuestions=input.nextInt();
            int correctAnswers=input.nextInt();
            int atLeastScore=input.nextInt();

            int answeredMarks=correctAnswers*3;
            int incorrectAnswer=numberOfQuestions-correctAnswers;
            int totalScore=answeredMarks-incorrectAnswer;

            if(totalScore >= atLeastScore){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }

            times--;
        }

    }
}
