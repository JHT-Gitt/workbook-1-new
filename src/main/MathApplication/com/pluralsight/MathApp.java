package com.pluralsight;

public class MathApp {
    public static void main(String[] args){

        int grade1 = 55, grade2 = 35, total;
        total = grade1 + grade2;
        System.out.println("The total is " + total);


        int bobSalary = 155_000;
        int garySalary = 165_000;

        int highestSalary = Math.max(bobSalary, garySalary);
        if (highestSalary == bobSalary){
            System.out.println("The highest salary is Bob which is: " + highestSalary);
        }else if(highestSalary == garySalary){
            System.out.println("The highest salary is Gary which is: " + highestSalary);
        }

        double carPrice = 150_000;
        double truckPrice = 180_000;
        double smallestPrice = Math.min(carPrice, truckPrice);
        if (smallestPrice == carPrice){
            System.out.println("The smallest price is Car which is: " + smallestPrice);
        }else if (smallestPrice == truckPrice){
            System.out.println("The smallest price is Truck which is: " + smallestPrice);
        }

        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1 : " + randomNumber);








    }


}
