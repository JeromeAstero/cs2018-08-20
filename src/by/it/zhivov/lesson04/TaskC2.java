package by.it.zhivov.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int summ;
        if (month == 1) {
            summ = 0 + day;
            System.out.println(summ);
        } else if (month == 2) {
            summ = 31 + day;
            System.out.println(summ);
        } else if (month == 3) {
            summ = 59 + day;
            System.out.println(summ);
        } else if (month == 4) {
            summ = 90 + day;
            System.out.println(summ);
        } else if (month == 5) {
            summ = 120 + day;
            System.out.println(summ);
        } else if (month == 6) {
            summ = 151 + day;
            System.out.println(summ);
        } else if (month == 7) {
            summ = 181 + day;
            System.out.println(summ);
        } else if (month == 8) {
            summ = 212 + day;
            System.out.println(summ);
        } else if (month == 9) {
            summ = 243 + day;
            System.out.println(summ);
        } else if (month == 10) {
            summ = 273 + day;
            System.out.println(summ);
        } else if (month == 11) {
            summ = 304 + day;
            System.out.println(summ);
        } else if (month == 12) {
            summ = 334 + day;
            System.out.println(summ);
        }
    }
}