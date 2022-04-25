package lambda.task1;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b); // Деление на 0 выбросит исключение, решить проблему можно вернув ноль,
                                        //либо через многострочный блок кода с return, либо через тернарный оператор.

        calc.println.accept(c);
    }
}
