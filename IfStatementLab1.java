/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class IfStatementLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    System.out.println("Madayaw Dabaw!");    
        
//Problem 1: Age Category Checker
    
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your age.");
    int age=input.nextInt();
    if (age<=12)
    {System.out.println("Bata pa.");}
    else if (age>=13 && age<=19){
    System.out.println("Batan-on pa.");} 
    else if (age>=19 && age<=60){
    System.out.println("Naa nas saktong edad.");}
    else if (age<=130){
    System.out.println("Medyo edaran na jd.");}
    else {System.out.println("Karaang tao.");}


//================================
//Problem 2: Temperature Evaluator
//================================

    
   System.out.println("Enter today's temperature in Celsius.");
    double temperature = input.nextDouble();

    if (temperature < 0) {
    System.out.println("Tugnaw, pagdala ug jacket.");} 
    else if (temperature >= 0 && temperature <= 25) {
    System.out.println("Nindot ang panahon.");} 
    else {
    System.out.println("Init kaayo, inom ug daghang tubig.");}
 

    
//================================
//Problem 3: Simple Grade Evaluator
//================================


    System.out.println("Enter your test score that you want to evaluate.");

    int score = input.nextInt();

    if (score <= 100 && score >= 90) {
    System.out.println("wow! Sana all.");} 
    else if (score <= 89 && score >= 75) {
    System.out.println("Pasado yarn.");} 
    else if (score > 0 && score < 75) {
    System.out.println("Kana lang bagsak.");} 
    else {
    System.out.println("Drop jd ka bai.");}

    
    
//================================
//Problem 4: Circle Calculator
//================================


    System.out.println("Enter the radius of the circle.");
    double radius = input.nextDouble();

    if (radius <= 0) {
    System.out.println("Invalid radius.");
    } else {
    double area = Math.PI * radius * radius;
    double circumference = 2 * Math.PI * radius;

    System.out.println("Area= " + area);
    System.out.println("Circumference= " + circumference);
    }

    
//================================
//Problem 5: Even and Odd Number
//================================


    System.out.println("Enter an integer.");
    int number=input.nextInt();

    if (number % 2==0){
    System.out.println("The number is even.”");}
    else {
    System.out.println("The number is odd.");}

    }
    
}
