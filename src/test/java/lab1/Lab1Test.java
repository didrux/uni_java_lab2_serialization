package lab1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class Lab1Test {
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

    List<Product> kitchenProducts = Arrays.asList(productFirst, productSecond);


    Producer producerFirst = new Producer.ProducerBuilder("Andrew").setProducts(kitchenProducts).setAddress("Ukraine, Chernivtsi, Soborna 2").setContactEmployee(employeeFirst)
            .build();

    Producer producerSecond = new Producer.ProducerBuilder("Andrew").setProducts(kitchenProducts).setAddress("Ukraine, Chernivtsi, Soborna 2").setContactEmployee(employeeFirst)
            .build();

    Producer producerThird = new Producer.ProducerBuilder("Anna").setProduct(productThird)
            .build();

    @Test(dataProvider = "employeeEqualsProvider")
    public void employeeEqualsTest(Employee e1, Employee e2) {
        assertEquals(e1, e2);
    }

    @DataProvider
    public Object[][] employeeEqualsProvider() {
        return new Object[][]{{employeeFirst, employeeSecond}};
    }

    @Test(dataProvider = "employeeNotEqualsProvider")
    public void employeeNotEqualsTest(Employee e1, Employee e2) {
        assertNotEquals(e1, e2);
    }

    @DataProvider
    public Object[][] employeeNotEqualsProvider() {
        return new Object[][]{{employeeFirst, employeeThird}};
    }

    @Test(dataProvider = "employeeToStringProvider")
    public void employeeToStringTest(Employee e1, String s) {
        assertEquals(e1.toString(), s);
    }

    @DataProvider
    public Object[][] employeeToStringProvider() {
        return new Object[][]{{employeeFirst, "Name: " + "Misha" + "\n"
                + "Position: " + "Receiver" + "\n"
                + "Salary: " + "20000.0" + "\n"
                + "Address: " + "Holovna, 1" + "\n"
                + "Phone number: " + "0504340601" + "\n"
                + "Medical examination: " + "true" + "\n"}};
    }

    @Test(dataProvider = "productEqualsProvider")
    public void productEqualsTest(Product p1, Product p2) {
        assertEquals(p1, p2);
    }

    @DataProvider
    public Object[][] productEqualsProvider() {
        return new Object[][]{{productFirst, productSecond}};
    }

    @Test(dataProvider = "productNotEqualsProvider")
    public void productNotEqualsTest(Product p1, Product p2) {
        assertNotEquals(p1, p2);
    }

    @DataProvider
    public Object[][] productNotEqualsProvider() {
        return new Object[][]{{productFirst, productThird}};
    }

    @Test(dataProvider = "productToStringProvider")
    public void productToStringTest(Product p1, String s) {
        assertEquals(p1.toString(), s);
    }

    @DataProvider
    public Object[][] productToStringProvider() {
        return new Object[][]{{productFirst, "Id: " + "901" + "\n"
                + "Name: " + "Table" + "\n"
                + "Category: " + "Kitchen" + "\n"
                + "Price: " + "1500.0" + "\n"}};
    }

    @Test(dataProvider = "producerEqualsProvider")
    public void producerEqualsTest(Producer s1, Producer s2) {
        assertEquals(s1, s2);
    }

    @DataProvider
    public Object[][] producerEqualsProvider() {
        return new Object[][]{{producerFirst, producerSecond}};
    }

    @Test(dataProvider = "producerNotEqualsProvider")
    public void producerNotEqualsTest(Producer s1, Producer s2) {
        assertNotEquals(s1, s2);
    }

    @DataProvider
    public Object[][] producerNotEqualsProvider() {
        return new Object[][]{{producerFirst, producerThird}};
    }

    @Test(dataProvider = "producerToStringProvider")
    public void producerToStringTest(Producer s1, String s) {
        assertEquals(s1.toString(), s);
    }

    @DataProvider
    public Object[][] producerToStringProvider() {
        return new Object[][]{{producerFirst, "Name: Andrew\n" +
                "Address: Ukraine, Chernivtsi, Soborna 2\n" +
                "Contact employee: Name: Misha\n" +
                "Position: Receiver\n" +
                "Salary: 20000.0\n" +
                "Address: Holovna, 1\n" +
                "Phone number: 0504340601\n" +
                "Medical examination: true\n" +
                "\n" +
                "Products: [Id: 901\n" +
                "Name: Table\n" +
                "Category: Kitchen\n" +
                "Price: 1500.0\n" +
                ", Id: 901\n" +
                "Name: Table\n" +
                "Category: Kitchen\n" +
                "Price: 1500.0\n" +
                "]\n"}};
    }
}
