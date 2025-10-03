package com.tns.nonaccessmodifier;



public class MainApp {
    public static void main(String[] args) {
       
        TicketCounter.display();
        
        TicketCounter.bookTicket(2); 
        TicketCounter.bookTicket(5); 
        TicketCounter.bookTicket(4); 
        
       
        TicketCounter.display();
    }
}
