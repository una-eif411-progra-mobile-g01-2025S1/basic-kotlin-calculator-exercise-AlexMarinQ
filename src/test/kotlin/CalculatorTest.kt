import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    // TODO: Create your addition tests
    @Test
    fun testAddition() {
        val result = calculator.add(1.0,2.0)
        assertEquals(3.0,result)

    }

    // TODO: Create your subtraction tests
    @Test
    fun testSubtraction() {
        val result = calculator.subtract(10.0,5.0)
        assertEquals(5.0,result)
    }

    // TODO: Create your multiplication tests
    @Test
    fun testMultiplication() {
        val result = calculator.multiply(10.0,10.0)
        assertEquals(100.0,result)
    }

    // TODO: Create your division tests
    @Test
    fun testDivision() {
        val result = calculator.divide(2.0,1.0)
        assertEquals(2.0,result)
    }


    @Test
    fun testErrorCases() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(5.0, 0.0)
        }
        assertEquals("Imposible divide with Zero", exception.message)
    }


    @Test
    fun multiplicationWithZero(){
        val result = calculator.multiply(0.0,0.0)
        assertEquals(0.0,result)
    }

    @Test
    fun multiplicationWithNegative(){
        val result = calculator.multiply(-4.0,3.0)
        assertEquals(-12.0,result)
    }

    @Test
    fun divisionWithSameNumber(){
        val result = calculator.divide(2.0,2.0)
        assertEquals(1.0,result)
    }
}