package repository;

import data.Ticket;
import lombok.Data;

import java.util.Arrays;

@Data

public class Repository {


    //КАК ВСЕ МЕТОДЫ ВЫНЕСТИ В РЕПО, ЧТО БЫ МАНАГЕР ТОЛЬКО ОБРАЩАЛСЯ К НИМ??


//    private Ticket[] tickets = new Ticket[0];
//
//
//    public void addTicket(Ticket ticket) {
//        //создаем новый массив на 1 больше прдыдущего
//        Ticket[] tmp = new Ticket[tickets.length + 1];
//        //Через цикл заполняем значения из старого массива в новый
//        for (int i = 0; i < tickets.length; i++) {
//            tmp[i] = tickets[i];
//        }
//        //в конец массива кладем новое значение
//        tmp[tmp.length - 1] = ticket;
//        //Новый массив перекладываем
//        tickets = tmp;
//    }
//
//    public void deleteTicketId(int id) {
//        //создаем счетчик для нумерации нового массива
//        int copy = 0;
//        //создаем массив на 1 меньше предыдущего
//        Ticket[] tmp = new Ticket[tickets.length - 1];
//        //Перебираем массив и сравниваем его значем с тем, что надо удалить и если он равен, пропускам и не добавлем в новый
//        for (int i = 0; i < tickets.length; i++) {
//            if (tickets[i].getId() != id) {
//                tmp[copy] = tickets[i];
//                copy++;
//            }
//        }
//        //кладим новый массив в tickets
//        tickets = tmp;
//    }
//
//    public Ticket[] findTicket(){
//        Arrays.sort(tickets);  // Надо ли?
//        return tickets;
//    }
}
