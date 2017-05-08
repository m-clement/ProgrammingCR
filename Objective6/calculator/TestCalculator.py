import unittest
from Calculator import Calculator

class TestHelloWorld(unittest.TestCase):

    def test_subtracting_10_from_8_should_equal_minus2(self):
        expected = -2
        program = Calculator()
        result = program.subtract(8, 10)
        self.assertEqual(expected, result)
        
    def test_subtracting_10_from_8_should_not_equal_minus4(self):
        expected = -4
        program = Calculator()
        result = program.subtract(8, 10)
        self.assertNotEqual(expected, result)

    def test_addition_5_plus_2_should_equal_7(self):
        expected = 7
        program = Calculator()
        result = program.add(5, 2)
        self.assertEqual(expected, result)
        
if __name__ == '__main__':
    unittest.main()
