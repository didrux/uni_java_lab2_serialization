package lab1;

import Serialize.JsonSerializer;
import Serialize.TxtSerializer;
import Serialize.XmlSerializer;
import org.testng.annotations.Test;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SerializeTest {

    Employee employeeFirst = new Employee.EmployeeBuilder().setName("Misha").setPosition("Receiver").setSalary(20000).setPhoneNumber("0504340601").setMedicalExamination(true).setAddress("Holovna, 1")
            .build();

    Employee employeeSecond = new Employee.EmployeeBuilder().setName("Misha").setPosition("Receiver").setSalary(20000).setPhoneNumber("0504340601").setMedicalExamination(true).setAddress("Holovna, 1")
            .build();

    Employee employeeThird = new Employee.EmployeeBuilder().setName("Ivan").setPosition("Seller").setSalary(15000).setPhoneNumber("0504340602").setMedicalExamination(true).setAddress("Poshtova, 2")
            .build();

    Product productFirst = new Product.ProductBuilder().setId(901).setName("Table").setPrice(1500).setCategory("Kitchen")
            .build();

    Product productSecond = new Product.ProductBuilder().setId(901).setName("Table").setPrice(1500).setCategory("Kitchen")
            .build();

    Product productThird = new Product.ProductBuilder().setId(902).setName("Sofa").setPrice(4000).setCategory("Living room")
            .build();

    List<Product> kitchenProducts = Arrays.asList(productFirst, productSecond);


    Producer producerFirst = new Producer.ProducerBuilder().setName("Andrew").setProducts(kitchenProducts).setAddress("Ukraine, Chernivtsi, Soborna 2").setContactEmployee(employeeFirst)
            .build();

    Producer producerSecond = new Producer.ProducerBuilder().setName("Andrew").setProducts(kitchenProducts).setAddress("Ukraine, Chernivtsi, Soborna 2").setContactEmployee(employeeFirst)
            .build();

    Producer producerThird = new Producer.ProducerBuilder().setName("Anna").setProduct(productThird)
            .build();

    @Test
    public void testJsonSerialization() {
        JsonSerializer json = new JsonSerializer();

        json.serialize(employeeFirst, "Employee.json");
        Employee deserializedEmployee = json.deserialize(Employee.class, "Employee.json");
        assertEquals(employeeFirst, deserializedEmployee);

        json.serialize(producerFirst, "Producer.json");
        Producer deserializedProducer = json.deserialize(Producer.class, "Producer.json");
        assertEquals(producerFirst, deserializedProducer);

        json.serialize(productFirst, "Product.json");
        Product deserializedProduct = json.deserialize(Product.class, "Product.json");
        assertEquals(productFirst, deserializedProduct);

    }

//    @Test
//    public void testXmlSerialization() {
//        XmlSerializer xml = new XmlSerializer();
//
//        xml.serialize(human, "Human.xml");
//        Human deserializedHuman = xml.deserialize(Human.class, "Human.xml");
//        assertEquals(human, deserializedHuman);
//
//        xml.serialize(patient1, "Patient.xml");
//        Patient deserializedPatient = xml.deserialize(Patient.class, "Patient.xml");
//        assertEquals(patient1, deserializedPatient);
//
//        xml.serialize(doctor1, "Doctor.xml");
//        Doctor deserializedDoctor = xml.deserialize(Doctor.class, "Doctor.xml");
//        assertEquals(doctor1, deserializedDoctor);
//
//        xml.serialize(hospital, "Hospital.xml");
//        Hospital deserializedHospital = xml.deserialize(Hospital.class, "Hospital.xml");
//        assertEquals(hospital, deserializedHospital);
//    }
//
//    @Test
//    public void testTxtSerialization() {
//        TxtSerializer txt = new TxtSerializer();
//
//        txt.serialize(human, "Human.txt");
//        Human deserializedHuman = txt.deserialize(Human.class, "Human.txt");
//        assertEquals(human, deserializedHuman);
//
//        txt.serialize(patient1, "Patient.txt");
//        Patient deserializedPatient = txt.deserialize(Patient.class, "Patient.txt");
//        assertEquals(patient1, deserializedPatient);
//
//        txt.serialize(doctor1, "Doctor.txt");
//        Doctor deserializedDoctor = txt.deserialize(Doctor.class, "Doctor.txt");
//        assertEquals(doctor1, deserializedDoctor);
//
//        txt.serialize(hospital, "Hospital.txt");
//        Hospital deserializedHospital = txt.deserialize(Hospital.class, "Hospital.txt");
//        assertEquals(hospital, deserializedHospital);
//    }
}
