package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employeeFirst = new Employee.EmployeeBuilder("Misha").setPosition("Receiver").setSalary(20000).setPhoneNumber("0504340601").setMedicalExamination(true).setAddress("Holovna, 1")
                .build();

        Employee employeeSecond = new Employee.EmployeeBuilder("Misha").setPosition("Receiver").setSalary(20000).setPhoneNumber("0504340601").setMedicalExamination(true).setAddress("Holovna, 1")
                .build();

        Employee employeeThird = new Employee.EmployeeBuilder("Ivan").setPosition("Seller").setSalary(15000).setPhoneNumber("0504340602").setMedicalExamination(true).setAddress("Poshtova, 2")
                .build();

        Product productFirst = new Product.ProductBuilder(901, "Table").setPrice(1500).setCategory("Kitchen")
                .build();

        Product productSecond = new Product.ProductBuilder(901, "Table").setPrice(1500).setCategory("Kitchen")
                .build();

        Product productThird = new Product.ProductBuilder(902, "Sofa").setPrice(4000).setCategory("Living room")
                .build();



//
        List<Product> kitchenProducts = new ArrayList<>();
        kitchenProducts.add(productFirst);
        kitchenProducts.add(productSecond);




        Producer producerFirst = new Producer.ProducerBuilder("Andrew").setProducts(kitchenProducts)
                .build();

        Producer producerSecond = new Producer.ProducerBuilder("Andrew").setProducts(kitchenProducts)
                .build();

        Producer producerThird = new Producer.ProducerBuilder("Anna").setProduct(productThird)
                .build();

        /// Print information about employee class
//        System.out.println("Employee: ");
//        System.out.println(employeeSecond);
//        System.out.println(employeeFirst);
//        System.out.println("equality: ");
//        System.out.println(employeeFirst.equals(employeeSecond));
//        System.out.println(employeeFirst.equals(employeeThird));
//
//        /// Print information about product class
//        System.out.println("Product: ");
//        System.out.println(productFirst);
//        System.out.println(productSecond);
//        System.out.println("equality: ");
//        System.out.println(productFirst.equals(productSecond));
//        System.out.println(productFirst.equals(productThird));
//
//        /// Print information about producer class
//        System.out.println("Producer: ");
//        System.out.println(producerFirst);
//        System.out.println(producerSecond);
//        System.out.println("equality: ");
//        System.out.println(producerFirst.equals(producerSecond));
//        System.out.println(producerFirst.equals(producerThird));
    }
}
