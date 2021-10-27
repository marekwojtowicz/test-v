import spock.lang.Specification

class CalculatorUT extends Specification {

    def calculator = new Calculator()

    def 'calculate with passed numbers #NUMBER_1 and #NUMBER_2 should return \
        #EXPECTED_MULTIPLICATION as the result of multipication them and\
        #EXPECTED_DIVISION as the result of dividing them and\
        #EXPECTED_MODULO as the rest of diving them '() {
        when:
        Calculator.Result result = calculator.calculate(NUMBER_1, NUMBER_2)
        then:
        result.multiplication == EXPECTED_MULTIPLICATION
        result.division == EXPECTED_DIVISION
        result.modulo == EXPECTED_MODULO

        where:
        NUMBER_1 | NUMBER_2 || EXPECTED_MULTIPLICATION | EXPECTED_DIVISION | EXPECTED_MODULO
        1        | 1        || 1                       | 1                 | 0
        2        | 1        || 2                       | 2                 | 0
        1        | 2        || 2                       | 0                 | 1
        0        | 1        || 0                       | 0                 | 0
    }

    def 'calculator when trying to divide by zero should throw ArithmeticException'() {
        when:
        calculator.calculate(1, 0)
        then:
        def excpetion = thrown(ArithmeticException)
        excpetion.message == 'divide by zero'
    }
}
