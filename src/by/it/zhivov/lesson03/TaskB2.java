package by.it.zhivov.lesson03;

import java.util.Scanner;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант
x1 = (-b + √D)/2a
x12 = (-b - √D)/2a

*/
class TaskB2 {
    public static int dis(int a, int b, int c) {
        int dis = (b * b) - (4 * (a * c));
        return dis;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        double d, x1, x2, x3, sqr;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = (double) dis(a, b, c);
        sqr = (double) Math.sqrt(d);
        x1 = (double) (-b + sqr) / (a * a);
        x2 = (double) (-b - sqr) / (a * a);
        x3 = (double) (-b) / (a * a);
        if (d > 0) System.out.println(x1 + " " + x2);
        if (d == 0) System.out.println(x3);
        if (d < 0) System.out.println("Отрицательный дискриминант");
    }
}
