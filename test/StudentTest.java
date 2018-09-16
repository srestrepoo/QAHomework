/*
 * You'll find the test cases further down this document.
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
     * QA Homework by Santiago Restrepo & Miguel Pinzon 
     * In the following test cases we'll check the behaviourof the order() method.
     */


    /**
    First Test Case: 
    Scenario: Order a list of students according to the known parameters.
    Given that: I have a list of 5 students whose information is: 
        - 33, Rumpa, 3.68
        - 85, Ashis, 3.84
        - 59, Samiha, 3.75
        - 19, Samara, 3.75
        - 22, Fahim, 3.76
    When: I ask the order() method do sort the students.
    Then : The expected output of the method is:
        - Ashis
        - Fahim
        - Samara
        - Samiha
        - Rumpa
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

    /**
    Second Test Case: 
    Scenario: Order a list of students according to the known parameters.
    Given that: I have a list of 3 students whose information is: 
        - 13, Miguel, 3.13
        - 26, Santiago, 4.23
        - 2, Antanas, 4.78
    When: I ask the order() method do sort the students.
    Then : The expected output of the method is:
        - Antanas
        - Santiago
        - Miguel
    */ 

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

    /**
    Third Test Case: 
    Scenario: Order a list of students according to the known parameters.
    Given that: I have a list of 5 students whose information is: 
        - 9, Falcao, 5.0
        - 7, Bacca, 1.0
    When: I ask the order() method do sort the students.
    Then : The expected output of the method is:
        - Falcao
        - Bacca
    */ 
    @Test
    public void order3() {
        System.out.println("order3");
        Student student1 = new Student(9,"Falcao",5.0);
        Student student2 = new Student(7,"Bacca",1.0);
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        List<Student> expResult = new ArrayList<>();
        expResult.add(student1);
        expResult.add(student2);
        List<Student> result = Student.order(studentList);
        assertEquals(expResult, result);
    }
    
}
