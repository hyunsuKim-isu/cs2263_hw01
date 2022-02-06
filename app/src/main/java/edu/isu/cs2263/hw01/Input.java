package edu.isu.cs2263.hw01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Input {
    public static void main(String args) {

        /**
         * Uses the inputLoop() to continuously solve expressions.
         */
        Interfaces.inputNum();
        Interfaces.inputNumCli(args);
    }
}
