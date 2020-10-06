package com.company;

import javax.crypto.spec.PSource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Application {

    // Scanners;
    public static int inINT() {return new Scanner(System.in).nextInt();}
    public static String inString() {return new Scanner(System.in, "CP1251").nextLine();}

    public static ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        users.add(new User("Александр", "Овечкин", 35, "WSH@nhl.com", "NEW", "06.10.2020"));
        users.add(new User("Владимир", "Тарасенко", 28, "STL@nhl.com", "ACTIVE", "10.09.2020"));
        users.add(new User("Сергей", "Бобровский", 32, "FLA@nhl.com", "INACTIVE", "01.03.2020"));
        users.add(new User("Никита", "Кучеров", 27, "TBL@nhl.com", "ACTIVE", "20.02.2020"));

        select();
    }

    public static void select() {
        System.out.println("**************************************");
        System.out.println("* Ресторан семейного отдыха 'СИРОТА' * ");
        System.out.println("**************************************");
        System.out.println("\nВыберите действие:");
        System.out.println("1 - добавить посетителя");
        System.out.println("2 - просмотр посетителей (в базе: " + users.size() + " посетителей)");
        System.out.println("3 - редактировать профиль");
        System.out.println("0 - выход из программы");
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Текущая дата: " + formatForDateNow.format(date));

        int item = inINT();
        if (item >= 0 && item < 4) {
            if (item == 1) {
                getUsers();
            }
            if (item == 2) {
                printUser();
            }
            if (item == 3) {
                editUser();
            }
            if (item == 0) {
                exit();
            }
        } else {
            System.out.println("Нужно ввести число 1, 2, 3 или 4. Повторите выбор: ");
            select();
        }
    }

    public static ArrayList<User> getUsers() {  // 1 пункт меню

        System.out.println("Формат ввода: Имя, Фамилия, Возраст, Эл. адрес, Статус, Дата регистрации");
        Scanner sc = new Scanner(System.in);
        users.add(new User(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next()));
        select();
        return users;
    }

    public static void printUser () {

        for (int i = 0; i < users.size(); i++) {
            System.out.println("Имя: " + users.get(i).getFirstName());
            System.out.println("Фамилия: " + users.get(i).getLastName());
            System.out.println("Возраст: " + users.get(i).getAge());
            System.out.println("Эл. адрес: " + users.get(i).getEmail());
            System.out.println("Статус: " + users.get(i).getStatus());
            System.out.println("Дату регистрации: " + users.get(i).getTimeStamp());
            System.out.println(" ");
            }
        select();
    }

    public static void editUser () {
        System.out.println("К сожалению, имеющихся знаний было недостаточно, чтобы выполнить 'Bonus task'.\nНадеюсь, что курсы в Вашей компании помогут решить эту задачу в будущем.");
        select();
        }
    public static void exit() {
        System.out.println("До новых встреч!");
    }
}







