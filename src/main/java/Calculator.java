public class Calculator {

    Result calculate(int number1, int number2) {
        int multipilcationResult = number1 * number2;
        int divisionResult = number1 / number2;
        int moduloResult = number1 % number2;
        return new Result(multipilcationResult, divisionResult, moduloResult);
    }

    class Result {
        int multiplication;
        int division;
        int modulo;

        public Result(int multiplication, int division, int modulo) {
            this.multiplication = multiplication;
            this.division = division;
            this.modulo = modulo;
        }
    }
}
