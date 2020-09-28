val ADD = "+"
val SUBSTRACT = "-"
val DIVIDE = "/"
val MULTIPLY = "*"
val ERROR_MESSAGE = "Wrong operator used"
val testOperand1 = 5.0
val testOperand2 = 4.0

fun main(args: Array<String>) {
    //The Program arguments we supply in the command line show up in this reference called "args"

    //args is an "Array", which is a collection of data. To get the first "element" (thing) in the
    //array, we give it index [0]. The "0", refers to the distance from the first element of the
    //array. This is the cause of much confusion and many errors.
    val operatorSymbol = args[0]

    startCalc(operatorSymbol)
}

fun startCalc(symbol: String) {
    if (checkArgument(symbol)) {
        displayResult(evaluateBinomial(testOperand1, testOperand2, symbol))
    } else{
        displayResult(ERROR_MESSAGE)
    }
}

//Single expression syntax(for single line code snippet)
fun displayResult(result: String) = println(result)

fun evaluateBinomial(testOperand1: Double, testOperand2: Double, symbol: String): String {
    return when (symbol) {
        ADD -> (testOperand1 + testOperand2).toString()
        SUBSTRACT -> (testOperand1 - testOperand2).toString()
        DIVIDE -> (testOperand1 / testOperand2).toString()
        MULTIPLY -> (testOperand1 * testOperand2).toString()
        else -> ERROR_MESSAGE
    }
}

fun checkArgument(symbol: String): Boolean {
    return when (symbol) {
        ADD -> true
        SUBSTRACT -> true
        DIVIDE -> true
        MULTIPLY -> true
        else -> false
    }
}
