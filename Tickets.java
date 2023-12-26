package com.mphasis.work.project;

import java.util.Scanner;

class Tickets {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        if (availableTickets >= 0) {
            Tickets.availableTickets = availableTickets;
        }
    }

    public int calculateTicketCost(int nooftickets) {
        if (nooftickets > 0 && nooftickets <= availableTickets) {
            availableTickets -= nooftickets;
            int totalAmount = nooftickets * price;
            System.out.println("Available tickets: " + availableTickets);
            System.out.println("Total amount: " + totalAmount);
            System.out.println("Available ticket after booking: " + availableTickets);
            return totalAmount;
        } else {
            System.out.println("Tickets not available!");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of bookings:");
        int noOfBookings = scanner.nextInt();

        System.out.println("Enter the available tickets:");
        int availableTickets = scanner.nextInt();
        Tickets.setAvailableTickets(availableTickets);

        for (int i = 0; i < noOfBookings; i++) {
            Tickets ticket = new Tickets();

            System.out.println("Enter the ticketid:");
            ticket.setTicketid(scanner.nextInt());

            System.out.println("Enter the price:");
            ticket.setPrice(scanner.nextInt());

            System.out.println("Enter the no of tickets:");
            int noOfTickets = scanner.nextInt();

            ticket.calculateTicketCost(noOfTickets);
        }

        scanner.close();
    }
}

