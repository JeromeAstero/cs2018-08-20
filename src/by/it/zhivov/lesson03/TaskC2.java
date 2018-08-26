package by.it.zhivov.lesson03;

import java.util.Scanner;

/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    public static int sumDigitsInNumber(int number) {
        int sumDigitsInNumber = number;
        int q = 0;
        while (sumDigitsInNumber > 0){
            q = Math.round ( q + (sumDigitsInNumber % 10));
            sumDigitsInNumber = Math.round ((sumDigitsInNumber - q) / 10);
        }
        return q;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(sumDigitsInNumber(number));
    }




//    public static void main(String[] args) {
//        System.out.println(sumDigitsInNumber(5467));
//    }

}
