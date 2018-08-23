package by.it.zhivov.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer dec0 = in.nextInt();
        Integer dec1 = in.nextInt();
        String dectobin0 = Integer.toBinaryString(dec0);
        String dectobin1 = Integer.toBinaryString(dec1);
        String dectooct0 = Integer.toOctalString(dec0);
        String dectooct1 = Integer.toOctalString(dec1);
        String dectohex0 = Integer.toHexString(dec0).toUpperCase();
        String dectohex1 = Integer.toHexString(dec1).toUpperCase();
        System.out.println("DEC" + ":" + dec0 + "+" + dec1 + "=" + (dec0 + dec1));
        System.out.println("BIN" + ":" + dectobin0 + "+" + dectobin1 + "=" + (dectobin0 + dectobin1));
        System.out.println("HEX" + ":" + dectohex0 + "+" + dectohex1 + "=" + (dectohex0 + dectohex1));
        System.out.println("OCT" + ":" + dectooct0 + "+" + dectooct1 + "=" + (dectooct0 + dectooct1));
    }
}