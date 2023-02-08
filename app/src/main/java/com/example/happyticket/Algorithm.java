package com.example.happyticket;

public class Algorithm {

    //создание пустого конструктора
    public Algorithm() {
    }

    // метод определения счастливый билет или нет
    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input); // конвертирование данных из String в int

        int s1 = 0, s2 = 0; // создание буферных переменных

        for(int i = 0; i < 3; i++) { // цикл заполнения первой половины числа
            s1 = s1 + inputInt % 10;
            inputInt = inputInt / 10;
        }
        for(int i = 0; i < 3; i++) { // цикл заполнения второй половины числа
            s2 = s2 + inputInt % 10;
            inputInt = inputInt / 10;
        }
        // проверка равенства
        if (s1 == s2) { // если суммы равны
            return true;   // то билет счастливый
        } else { // иначе
            return false; // билет не счастливый
        }
    }


}
