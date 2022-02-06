/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs2263.hw01;

import org.apache.commons.cli.*;
import org.apache.commons.cli.Option;
import java.io.*;
import java.io.PrintWriter;
import java.util.Stack;


public class App extends Evaluator {
    private static final Option BATCH = new Option("b", "batch", true, "batch file containing expressions to evaluate");
    private static final Option HELP = new Option("h", "help", false, "print usage message");
    private static final Option OUTPUT = new Option("o", "output", true, "output file");

    private static void printHelp(Options options){
        HelpFormatter formatter = new HelpFormatter();
        PrintWriter pw = new PrintWriter(System.out);
        formatter.printHelp("eval",options);
        formatter.printUsage(pw, 100,"");
        //formatter.printOptions(pw, 100, options, 2,5);
        pw.close();
    }
    public static void main(String[] args) {
//
        String filePath = "../cs2263_hw01/app";
        File fileInSamePackage = new File( filePath + "/test.txt");
//
//        try {
//
//            FileReader fr = new FileReader(filePath + "/test.txt");
//
//            int i;
//            while((i=fr.read())!=-1){
//                System.out.print((char)i);
//            }
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//        }



//
//        try {
//            CommandLine cl =  parser.parse(options, args);
//
//            if(cl.hasOption("b")){
//                String clientId = cl.getOptionValue("b");
//                String inputValue = "";
//
//                try {
//                    FileReader fr = new FileReader(clientId);
//                    int i;
//                    while((i=fr.read())!= -1){
//                        inputValue = inputValue + (char)i;
//                    }
//                } catch (IOException e) {
//
//                    e.printStackTrace();
//
//                }
//                System.out.println(inputValue);
//                Interfaces.inputNumCli(inputValue);



                Interfaces.inputNum();

        CommandLineParser parser = new DefaultParser();
        // create Options object
        Options options = new Options();

        // add b option
        options.addOption(BATCH);

        // add h option
        options.addOption(HELP);

        // add o option
        options.addOption(OUTPUT);

        try {
            CommandLine cl =  parser.parse(options, args);

            if(cl.hasOption("b")){
                String clientId = cl.getOptionValue("b");
                String inputValue = "";

                try {
                    FileReader fr = new FileReader(clientId);
                    int i;
                    while((i=fr.read())!= -1){
                        inputValue = inputValue + (char)i;
                    }
                } catch (IOException e) {

                    e.printStackTrace();

                }
                System.out.println(inputValue);
                Interfaces.inputNumCli(inputValue);


            }else if(cl.hasOption("o")){
                String clientId = cl.getOptionValue("o");
                System.out.println(clientId);

            }else{
                printHelp(options);
            }
        }
        catch (ParseException exp) {
            System.out.println("Unexpected exception:" + exp.getMessage());
        }
    }
}
