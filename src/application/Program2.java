package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: seller findById =====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n=== TEST 2: seller insert =====");
        Department newDepartment = new Department(null, "Home");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 3: seller update =====");
        Department dep = departmentDao.findById(6);
        dep.setName("Sports");
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 4: seller delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.delete(id);
        System.out.println("Delete completed");

        System.out.println("\n=== TEST 5: seller findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        sc.close();


    }
}
