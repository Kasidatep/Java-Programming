package com.siripoom.project.Midterm;

import java.util.Scanner;

public class TestMidterm {
            public static void main (String[] args) {
//Rectangle //        Rectangle rec = new Rectangle(2,3);
                //        System.out.println(rec.getArea());
                //        System.out.println(rec.getPerimeter());

//Matchstick//                int numMatches = 0;
//                int player = 0;
//                Matchstick game = new Matchstick(20);
//                Scanner input = new Scanner(System.in);
//                do {
//                    System.out.print("Player " + player + " >> ");
//                    numMatches = input.nextInt();
//                    if (game.isValidMove(numMatches)){
//                        game.takeMatches(numMatches);
//                        player = (player + 1) % 2;
//                    }
//                } while (!game.isGameOver());
//                System.out.println("Player " + ((player + 1) % 2) + " wins");


// StreamingStat //  StreamingStat carSpeed = new StreamingStat("Speed");
//                carSpeed.setValue(20.0);
//                carSpeed.setValue(28.0);
//                carSpeed.setValue(40.0);
//                carSpeed.setValue(30.0);
//                System.out.println(carSpeed.toString());
//                StreamingStat machineTemp = new StreamingStat("Temp");
//                machineTemp.setValue(80.0);
//                machineTemp.setValue(85.0);
//                machineTemp.setValue(75.0);
//                System.out.println(machineTemp.toString());

                //Logistics
                Scanner sc = new Scanner(System.in);
                System.out.print("Weight: ");
                double weight = sc.nextDouble();
                System.out.print("Width 1: ");
                double width1 = sc.nextDouble();
                System.out.print("Width 2: ");
                double width2 = sc.nextDouble();
                System.out.print("Height: ");
                double Height = sc.nextDouble();

                Logistics logis = new Logistics(weight,width1,width2,Height);
                System.out.println("cost by weight : "+ logis.getCostPerWeight());
                System.out.println("cost by size : "+ logis.getCostPerLength());
                System.out.println("cost : "+logis.getCost());

            }
        }


