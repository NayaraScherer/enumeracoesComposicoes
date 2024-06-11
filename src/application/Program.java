package application;

import entities.enums.OrderStatus;
import entitiess.Order;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
    /*
    Enumerações
        Referências: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
     */
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
        System.out.println(order);
        System.out.println("teste");
    }
}