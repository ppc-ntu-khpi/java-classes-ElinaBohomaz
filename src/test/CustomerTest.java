package test;

import domain.Сustomer;

public class CustomerTest {
    public static void main(String[] args) {
        Сustomer customer = new Сustomer();

        System.out.println("Початкова інформація про клієнта:");
        customer.displayCustomerInfo();
        customer.setID(10);
        customer.setStatus(false);
        customer.setTotal(9999.99);

        System.out.println("\nНова інформація про клієнта:");
        customer.displayCustomerInfo();
    }
}
