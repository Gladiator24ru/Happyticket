package com.example.happyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //создание полей для вывода на экран нужных значений
    private EditText ticketNumberIn; // поле ввода номера билета
    private Button button; // кнопка
    private TextView ticketInfoOut; // поле вывода информации

    // вывод на экран полученных значений
    @Override
    protected void onCreate(Bundle savedInstanceState) { //создание жизненного цикла активности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // присваивание жизненному циклу активности представления activity_main

        //присвоение переменным активити элементов представления
        ticketNumberIn = findViewById(R.id.ticketNumberIn); //поле ввода
        button = findViewById(R.id.button); //кнопка обработки
        ticketInfoOut = findViewById(R.id.ticketInfoOut); //поле вывода

        // выполнение действий при нажатии кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }

    // объект обработки нажатия кнопки
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            //считывание введенного значения
            ticketNumber = ticketNumberIn.getFreezesText().toString();

            // использование алгоритма для определения счастливого билета
            if(algorithm.isHappyTicket(ticketNumber)) { // если номер билета счастливый, то об этом выводится информация на экран
                ticketInfoOut.setText("Данный номер билета счастливый " + algorithm.nextHappyTicketV1(ticketNumber));
            } else { // иначе, производится поиск данного билета с последующим выводом на экран
                ticketInfoOut.setText("Данный номер билета не счастливый, следующим счатливым номером является "
                        + algorithm.nextHappyTicketV1(ticketNumber));
            }
        }
    };


}