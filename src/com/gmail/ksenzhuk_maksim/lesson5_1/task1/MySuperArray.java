package com.gmail.ksenzhuk_maksim.lesson5_1.task1;

public interface MySuperArray {

    //Получить текущую длину масива.
    int getLength();

    //Добавить элемент. Длина массива должна увеличится на 1.
    int addElement(String o);

    //Получить элемент по индексу
    String getElement (int index);

    //Удалить все текущие элементы (длина массива будет 0 после этой операции)
    void removeAllElements();

    //Вернуть массив где находятся все текущие элементы
    String [] getAllElements();
}
