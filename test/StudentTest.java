/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srestrepoo
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student(123,"Santiago",5.0);
        int expResult = 123;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFname method, of class Student.
     */
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Student instance = new Student(123,"Carlos",3.0);
        String expResult = "Carlos";
        String result = instance.getFname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCgpa method, of class Student.
     */
    @Test
    public void testGetCgpa() {
        System.out.println("getCgpa");
        Student instance = new Student(123,"Miguel",1.0);
        double expResult = 1.0;
        double result = instance.getCgpa();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of compareTo method, of class Student.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Student o = new Student(123,"Santiago",5.0);
        Student instance = new Student(123,"Miguel",3.0);;
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
    /**
     * First Test Order
     */
    @Test
    public void order1() {
        System.out.println("order1");
        Student student1 = new Student(33,"Rumpa",3.68);
        Student student2 = new Student(85,"Ashis",3.85);
        Student student3 = new Student(56,"Samiha",3.75);
        Student student4 = new Student(19,"Samara",3.75);
        Student student5 = new Student(22,"Fahim",3.76);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        List<Student> expResult = new ArrayList<>();
        expResult.add(student2);
        expResult.add(student5);
        expResult.add(student4);
        expResult.add(student3);
        expResult.add(student1);
        List<Student> result = Student.order(studentList);
        assertEquals(expResult, result);
    }
    @Test
    public void order2() {
        System.out.println("order2");
        Student student1 = new Student(13,"Miguel",3.13);
        Student student3 = new Student(26,"Santiago",4.23);
        Student student5 = new Student(2,"Antanas",4.78);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student3);
        studentList.add(student5);
        List<Student> expResult = new ArrayList<>();
        expResult.add(student5);
        expResult.add(student3);
        expResult.add(student1);
        List<Student> result = Student.order(studentList);
        assertEquals(expResult, result);
    }
    @Test
    public void order3() {
        System.out.println("order3");
        Student student1 = new Student(11,"Falcao",5.0);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        List<Student> expResult = new ArrayList<>();
        expResult.add(student1);
        List<Student> result = Student.order(studentList);
        assertEquals(expResult, result);
    }
    
}
