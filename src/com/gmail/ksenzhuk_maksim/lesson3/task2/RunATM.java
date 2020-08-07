package com.gmail.ksenzhuk_maksim.lesson3.task2;

/*2.Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

public class RunATM {
    public static void main(String[] args) throws Exception {

        ATM atm = new ATM(1,2,3);
        atm.addBankNotes20(-2);
        atm.addBankNotes50(-2);
        atm.addBankNotes100(-3);
        System.out.println(atm);
        System.out.println("Amount of money in ATM = " + atm.amountOfMoneyInATM());
        atm.withdrawMoney(-100);
        System.out.println(atm);
    }

    /*тесты:
    - попытки добавить отрицательное кол-во банкнот к каждому напиналу
    - попытка снять отрицательную сумму
    - попытка снять сумму больше чем есть в банкомате
    - попытка снять ноль*/
}
