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
        Integer decsum = dec0 + dec1;
        String bin0 = Integer.toBinaryString(dec0);
        String bin1 = Integer.toBinaryString(dec1);
        String oct0 = Integer.toOctalString(dec0);
        String oct1 = Integer.toOctalString(dec1);
        String hex0 = Integer.toHexString(dec0).toUpperCase();
        String hex1 = Integer.toHexString(dec1).toUpperCase();
        String binsum = Integer.toBinaryString(decsum);
        String octsum = Integer.toOctalString(decsum);
        String hexsum = Integer.toHexString(decsum);
        System.out.println("DEC:" + dec0 + "+" + dec1 + "=" + decsum);
        System.out.println("BIN:" + bin0 + "+" + bin1 + "=" + binsum);
        System.out.println("HEX:" + hex0.toLowerCase() + "+" + hex1.toLowerCase() + "=" + hexsum.toLowerCase());
        System.out.println("OCT:" + oct0 + "+" + oct1 + "=" + octsum);
    }
}