package com.lanou3g.code0417.tickets;

/**
 * Created by dllo on 18/4/17.
 */
public class Main {
    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice();
//        while (ticketOffice.sellTicket()){}
        new TicketSeller(ticketOffice).start();
        new TicketSeller(ticketOffice).start();


    }
}
