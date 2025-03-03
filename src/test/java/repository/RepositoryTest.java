package repository;

import data.Ticket;
import jdk.jfr.Description;
import manager.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Manager manager = new Manager();
    Ticket ticket1 = new Ticket(47_234, 5_700, "OKI", "NLT", 300);
    Ticket ticket2 = new Ticket(48_204, 9_700, "LAS", "MGZ", 300);
    Ticket ticket3 = new Ticket(42_005, 2_550, "MSP", "DME", 300);
    Ticket ticket4 = new Ticket(37_994, 6_780, "NAH", "MZW", 300);
    Ticket ticket5 = new Ticket(40_330, 11_700, "OKI", "NLT", 300);
    Ticket ticket6 = new Ticket(50_274, 6_770, "OKI", "NLT", 300);


    @Test
    @Description("Добавление билетов")
    void Case1() {

        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] actual = manager.findTicket();
        Ticket[] expected = {ticket3, ticket1, ticket4, ticket2};

        assertArrayEquals(actual, expected);


    }

    @Test
    @Description("Удалить билет")
    void Case2() {

        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        manager.deleteTicketId(37_994);

        Ticket[] actual = manager.findTicket();
        Ticket[] expected = {ticket3, ticket1, ticket2};

        assertArrayEquals(actual, expected);

    }

    @Test
    @Description("Поиск билетов по аэропорту from and to")
    void Case3() {

        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);


        Ticket[] actual = manager.findAllTicketsBetween("OKI", "NLT");

        Ticket[] expected = {ticket5};

        assertArrayEquals(actual, expected);

    }

    @Test
    @Description("Поиск билетов по аэропорту from and to и сортировка по цене ")
    void Case4() {

        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);


        Ticket[] actual = manager.findAllTicketsBetween("OKI", "NLT");

        Ticket[] expected = {ticket1, ticket6, ticket5};

        assertArrayEquals(actual, expected);

    }
}