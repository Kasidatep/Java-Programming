/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfElse_Swich_Loop.model;

/**
 *
 * @author praisan.pad
 */
public class Utility {

    public static double gradeValue(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return 4;
            case "B+":
                return 3.5;
            case "B":
                return 3;
            case "C+":
                return 2.5;
            case "C":
                return 2;
            case "D+":
                return 1.5;
            case "D":
                return 1;
            case "F":
                return 0;
        }
        return -1;
    }
}
