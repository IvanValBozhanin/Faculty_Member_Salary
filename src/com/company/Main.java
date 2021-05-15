package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Salary.txt"));
        double [] totalSalary = new double[3];
        double [] averageSalary = new double[3];

        while(in.hasNextLine()){
            String [] line = in.nextLine().split(" ");
            switch (line[2]) {
                case "full" -> {
                    totalSalary[0] += Double.parseDouble(line[3]);
                    averageSalary[0] += 1;
                }
                case "assistant" -> {
                    totalSalary[1] += Double.parseDouble(line[3]);
                    averageSalary[1] += 1;
                }
                case "associate" -> {
                    totalSalary[2] += Double.parseDouble(line[3]);
                    averageSalary[2] += 1;
                }
            }
        }
        for(int i=0;i<3;++i){
            averageSalary[i] = totalSalary[i]/averageSalary[i];
        }
        System.out.printf("Full:\t\tTotal: %.1f \tAverage: %.1f\n", totalSalary[0], averageSalary[0]);
        System.out.printf("Assistant:\tTotal: %.1f \tAverage: %.1f\n", totalSalary[1], averageSalary[1]);
        System.out.printf("Associate:\tTotal: %.1f \tAverage: %.1f\n", totalSalary[2], averageSalary[2]);
    }
}
