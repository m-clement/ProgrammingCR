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

    @Test
    public void given_nothing_should_say_hello_world() {
        String expected = "hello world";
        String result = program.sayHello();
        assertEquals(expected, result);
    }

    @Test
    public void given_a_single_name_should_say_hello_to_that_name_in_english() {
        String expected = "hello Pierre";
        String result = program.sayHello("Pierre");
        assertEquals(expected, result);

        String expected2 = "hello Miguel";
        String result2 = program.sayHello("Miguel");
        assertEquals(expected2, result2);
    }

    @Test
    public void given_nothing_and_french_should_say_hello_world_in_french() {
        String expected = "Bonjour tout le monde";
        String result = program.sayHello(HelloWorld.LANGUAGE.FR);
        assertEquals(expected, result);
    }

    @Test
    public void given_a_single_name_and_french_should_say_hello_to_that_name_in_french() {
        String expected = "Bonjour Pierre";
        String result = program.sayHello("Pierre", HelloWorld.LANGUAGE.FR);
        assertEquals(expected, result);

        String expected2 = "Bonjour Miguel";
        String result2 = program.sayHello("Miguel", HelloWorld.LANGUAGE.FR);
        assertEquals(expected2, result2);
    }

    @Test
    public void given_a_single_name_and_a_temperature_should_say_hello_to_that_name_and_temperature_in_english() {
        String expected = "Hello Pierre. It is cold today.";
        String result = program.sayHello("Pierre", "cold");
        assertEquals(expected, result);

        String expected2 = "Hello Miguel. It is hot today.";
        String result2 = program.sayHello("Miguel", "hot");
        assertEquals(expected2, result2);
    }

    @Test
    public void given_a_single_name_and_a_temperature_and_french_should_say_hello_to_that_name_and_temperature_in_french() {
        String expected = "Bonjour Pierre. Il fait froid aujourd'hui";
        String result = program.sayHello("Pierre", "froid", HelloWorld.LANGUAGE.FR);
        assertEquals(expected, result);

        String expected2 = "Bonjour Miguel. Il fait chaud aujourd'hui";
        String result2 = program.sayHello("Miguel", "chaud", HelloWorld.LANGUAGE.FR);
        assertEquals(expected2, result2);
    }
}
