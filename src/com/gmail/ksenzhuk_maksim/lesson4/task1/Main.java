package com.gmail.ksenzhuk_maksim.lesson4.task1;
/*
1)Создать класс Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
недели.
Создать массив объектов. Вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
*/
public class Main {
    public static void main(String[] args) {
        Airline [] airlinesArray = new Airline[7];
        airlinesArray[0] = new Airline("Minsk", 123,'a',10,10,"Friday");
        airlinesArray[1] = new Airline("Kiev", 101, 'A', 12,0,"Monday");
        airlinesArray[2] = new Airline("Warsaw", 12, 'A', 15, 45, "Sunday");
        airlinesArray[3] = new Airline("Berlin", 1338, 'A', 11, 59, "Thursday");
        airlinesArray[4] = new Airline("Warsaw", 988, 'B', 22,5, "Wednesday");
        airlinesArray[5] = new Airline("New York", 1551, 'A', 9,25, "Saturday");
        airlinesArray[6] = new Airline("Warsaw",1212,'B', 8,33, "Wednesday");
        //airlinesArray[7] = new Airline("Kiev", -1, 'C', -2,-3,"today");

        //print all elements in array
        SortFunctionality.printSortedArray(airlinesArray);
        System.out.println();

        System.out.println("Print list sorted by destination:");
        SortFunctionality.printSortedArray(SortFunctionality.sortArrayByDestination(airlinesArray,"Kiev"));

        System.out.println("\nPrint list sorted by day of week");
        SortFunctionality.printSortedArray(SortFunctionality.sortArrayByDayOfWeek(airlinesArray, "Wednesday"));

        System.out.println("\nPrint list sorted by day of week & departure time more than set time:");
        SortFunctionality.printSortedArray(SortFunctionality.sortArrayByDayOfWeekAndTime(airlinesArray, 16,0, "wednesday"));
    }
}
