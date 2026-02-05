/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgradingprogram;

/**
 *
 * @author Agneau
 */
import java.util.Scanner;  
public class QuizGradingProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student's Score(0-100):");
        int Score = input.nextInt();
        
        int Grade;
        String Remark;
        
        if (Score >= 80 && Score <= 100){
            Grade = 1;
            Remark = "D1";
            
        } else if (Score >= 75){
            Grade = 2;
            Remark ="D2";
        } else if (Score >= 66){
            Grade =3;
            Remark ="C3";
        
        } else if (Score >= 60){
            Grade = 4;
            Remark ="C4";
        } else if (Score >= 50){
            Grade = 5;
            Remark ="C5";
           
        } else if (Score >= 45){
            Grade = 6;
            Remark ="C6";
        } else if (Score >= 35){
            Grade = 7;
            Remark = "P7";
        } else if (Score >= 30){
            Grade = 8;
            Remark ="P8";
        } else {
            Grade = 9;
            Remark ="F";
        }
        System.out.println("Score:" + Score);
        System.out.println("Grade:" + Grade);
        System.out.println("Remark:" + Remark);
        
        input.close();
    }
}
