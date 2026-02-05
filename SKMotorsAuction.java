/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.skmotorsauction;

/**
 *
 * @author Agneau
 */
import java.util.Scanner;
public class SKMotorsAuction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle registration number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter vehicle cost: ");
        double vehicleCost = sc.nextDouble();

        System.out.print("Enter total expenses incurred on vehicle: ");
        double expenses = sc.nextDouble();
        double highestBid = 0;
        int highestBidder = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter bid amount for bidder " + i + ": ");
            double bid = sc.nextDouble();

            if (bid > highestBid) {
                highestBid = bid;
                highestBidder = i;
            }
        }

        System.out.print("Enter total deposits paid by winning bidder: ");
        double deposits = sc.nextDouble();

        double balance = highestBid - deposits;

        System.out.println("\n--- Vehicle Details ---");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Vehicle Cost: " + vehicleCost);
        System.out.println("Expenses: " + expenses);

        System.out.println("\n--- Auction Result ---");
        System.out.println("Winning Bidder: Bidder " + highestBidder);
        System.out.println("Highest Bid: " + highestBid);
        System.out.println("Deposits Paid: " + deposits);
        System.out.println("Balance Left: " + balance);

        double profitOrLoss = highestBid - (vehicleCost + expenses);

        System.out.println("\n--- Financial Outcome ---");
        if (profitOrLoss > 0) {
            System.out.println("Profit Made: " + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss Made: " + Math.abs(profitOrLoss));
        } else {
            System.out.println("No Profit, No Loss");
        }

        sc.close();
    }
}

    