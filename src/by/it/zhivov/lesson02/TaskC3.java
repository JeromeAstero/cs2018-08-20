package by.it.zhivov.lesson02;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    static double getWeight (int m){
        double g = 9.81;
        double gm = 3.86;
        double p = m / g * gm;
        int p100 = (int) (p*100);
        double delta=p*100-p100;
        if (delta < 0.5)
        return p100 / 100.0;
        else
        return (p100 + 1) / 100.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mass = in.nextInt();
        System.out.println(getWeight(mass));
    }
}
