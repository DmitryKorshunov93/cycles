// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        for (int i = 1; i <=10; i++) {
        System.out.println(i);}

        System.out.println("Задание №2");

        for (int i = 10; i >=1; i--) {
            System.out.println(i);}

        System.out.println("Задание №3");

        for (int i = 0; i <=17; i +=2) {
            System.out.println(i);}

        System.out.println("Задание №4");

        for (int i = 10; i >= -10; i --) {
            System.out.println(i);}

        System.out.println("Задание №5");

        for (int i = 1904; i <= 2096; i +=4) {
            System.out.println(i);}

        System.out.println("Задание №6");

        for (int i = 7; i <= 98; i +=7) {
            System.out.println(i);}

        System.out.println("Задание №7");

        for (int i = 2; i <= 512; i *=2) {
            System.out.println(i);}

        System.out.println("Задание №8");{

        int month = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + month;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}}

        System.out.println("Задание №9");

        int month = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + total/100;
            total = total + month;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");}
        }
    }
