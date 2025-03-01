class Calculator {
    fun add(a: Double, b: Double): Double {
       return a + b
    }

    fun subtract(a: Double, b: Double): Double {
       return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        require(b != 0.0) { "Imposible divide with Zero" }
        return a / b
    }
}