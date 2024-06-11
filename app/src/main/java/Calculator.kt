object Calculator {
    fun addition(a: Double, b: Double): Double {
        return a + b
    }

    fun subtraction(a: Double, b: Double): Double {
        return a - b
    }

    fun division(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw IllegalArgumentException("Division par zéro impossible")
        }
        return a / b
    }
}
