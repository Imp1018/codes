package com.lanou3g.code0417.tickets;

/**
 * Created by dllo on 18/4/17.
 */
public class TicketSeller extends Thread {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    @Override
    public void run() {
        while (ticketOffice.sellTicket());
    }
}
