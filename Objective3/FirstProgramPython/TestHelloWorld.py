import unittest
from HelloWorld import HelloWorld

class TestHelloWorld(unittest.TestCase):

    def test_given_nothing_should_say_hello_world(self):
        expected = "Hello World"
        program = HelloWorld()
        result = program.sayHello()
        self.assertEqual(expected, result)
        
    # def test_given_a_single_name_should_say_hello_to_that_name_in_english(self):
        # expected = "hello Pierre"
        # result = program.sayHello("Pierre")
        # assertEquals(expected, result)

        # expected2 = "hello Miguel"
        # result2 = program.sayHello("Miguel")
        # assertEquals(expected2, result2)

    # def test_given_a_null_name_should_say_hello_world_in_english(self):
        # expected = "hello world";
        # result = program.sayHello()
        # assertEquals(expected, result)

    # def test_given_nothing_and_english_should_say_hello_world_in_english(self):
        # expected = "hello world"
        # result = program.sayHello(HelloWorld.LANGUAGE.EN)
        # assertEquals(expected, result)

    def test_upper(self):
        self.assertEqual('foo'.upper(), 'FOO')

    def test_upper(self):
        self.assertEqual('foo'.upper(), 'FOO')

    def test_isupper(self):
        self.assertTrue('FOO'.isupper())
        self.assertFalse('Foo'.isupper())

    def test_split(self):
        s = 'hello world'
        self.assertEqual(s.split(), ['hello', 'world'])
        # check that s.split fails when the separator is not a string
        with self.assertRaises(TypeError):
            s.split(2)

if __name__ == '__main__':
    unittest.main()
    