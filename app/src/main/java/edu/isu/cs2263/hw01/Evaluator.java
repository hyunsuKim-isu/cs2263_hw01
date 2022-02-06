package edu.isu.cs2263.hw01;

import java.util.Scanner;

/**
 * @author Hyunsu Kim
 * @version 1.0
 */
public class Evaluator implements Interfaces {

    private static String[] operationType = {"+", "-", "*", "/"};

    public static int Evaluator(String formula){
        int result = calculate(formula);
        outputNum(formula ,Integer.toString(result));
        return result;
    }

    public static void outputNum(String formula ,String output){

        System.out.println("formula is = " + formula + "\n" + "Answer is = " + output);
    }

    /**
     * Split formula based on the space, and calculate each part
     * @param formula The formula from input interface and which is string
     * @return Result representing the value of calculated formula
     */
    public static int calculate(String formula){
        String[] input = formula.split(" ");
        int result = Integer.parseInt(input[0]);
        String operator = null;

        for(int i = 1; i < input.length; i++){
            if(isPermittedOperator(input[i])){
                operator = input[i];
            }else{
                result = partCalculate(operator, result, input[i]);
            }
        }
        return result;
    }

    /**
     * @param input Expression from input
     * @return true if entered valid operator, false if it's not the defined operation type
     */
    private static boolean isPermittedOperator(String input){

        for(String operator : operationType){
            if(input.equals(operator)) return true;
        }

        return false;
    }


    /**
     * @param operator operator from input
     * @param result   The first two calculated values.
     * @param input    The second value for calculating with result
     * @return  The result value calculated according to the operator
     * @throws IllegalArgumentException if operator entered it is not the defined operation type
     */
    public static int partCalculate(String operator, int result, String input){

        if(input == null || input.equals("")) throw new IllegalArgumentException();

        //check which operator is entered
        switch (operator){
            case "+":
                return plus(result, input);
            case "-":
                return minus(result, input);
            case "*":
                return multiply(result, input);
            case "/":
                return division(result, input);
            default:
                throw new IllegalArgumentException();
        }

    }

    /**
     * @param result first value from input which is formula
     * @param input second value from input which is formula
     * @return result to given formula
     */
    public static int plus(int result, String input){
        return result + Integer.parseInt(input);
    }

    /**
     * @param result first value from input which is formula
     * @param input second value from input which is formula
     * @return result to given formula
     */
    public static int minus(int result, String input){
        return result - Integer.parseInt(input);
    }

    /**
     * @param result first value from input which is formula
     * @param input second value from input which is formula
     * @return result to given formula
     */
    public static int multiply(int result, String input){
        return result * Integer.parseInt(input);
    }

    /**
     * @param result first value from input which is formula
     * @param input second value from input which is formula
     * @return result to given formula
     */
    public static int division(int result, String input){
        return result / Integer.parseInt(input);
    }

    public static void main(String[] args){


    }
}
