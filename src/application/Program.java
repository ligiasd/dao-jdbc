package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(7,"Books");
        Seller seller = new Seller(21, "Ligiane", "ligi@email.com", new Date(), 3000.0, obj);
        System.out.println(seller );
    }
}
