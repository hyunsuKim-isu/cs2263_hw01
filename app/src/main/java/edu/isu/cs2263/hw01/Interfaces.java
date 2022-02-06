package edu.isu.cs2263.hw01;

import java.util.Scanner;

/**
 * @author Hyunsu Kim
 * @version 1.0
 */
public interface Interfaces {

    /**
     * inputNum is interface for input value from console
     */
    static void inputNum(){
        int count = 1;
        System.out.println("input num");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String num = sc.nextLine();
            String answer = String.valueOf((Evaluator.Evaluator(num)));
            count++;
            outputNum(num, answer);
        }

    };

    static void inputNumCli(String value){
        int count = 1;
        String[] newVal = value.split(System.lineSeparator());
        for(int i = 0; i < newVal.length; i++){
            String valueString = newVal[i].replace("\n", "");
            String answer = String.valueOf((Evaluator.Evaluator(valueString)));
            outputNum(valueString ,answer);

        }

    };

    /**
     * @param output Value obtained by calculating the input value.
     */
    static void outputNum(String formula , String output){

    };
}
