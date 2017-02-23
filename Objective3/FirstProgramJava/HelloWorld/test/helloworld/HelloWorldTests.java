/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel
 */
public class HelloWorldTests {
    
    HelloWorld program;
    public HelloWorldTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        program = new HelloWorld();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void given_nothing_should_say_hello_world() {
         String expected = "hello world";
         String result = program.sayHello();
         assertEquals(expected, result);
     }

     @Test
     public void given_a_single_name_should_say_hello_to_that_name() {
         String expected = "hello Pierre";
         String result = program.sayHello("Pierre");
         assertEquals(expected, result);
     }
}
