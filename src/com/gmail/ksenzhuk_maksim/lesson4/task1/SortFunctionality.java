package com.gmail.ksenzhuk_maksim.lesson4.task1;

import java.util.Arrays;

class SortFunctionality {

    //method for sorting by destination country
    static Airline[] sortArrayByDestination(Airline [] airlines, String destinationCountryParam) {
        Airline [] airlinesListByDestination = new Airline[airlines.length];
        int counter = 0;
        for (Airline airline:airlines){
            if (airline.getDestinationCountry().equalsIgnoreCase(destinationCountryParam)){
                airlinesListByDestination[counter] = airline;
                counter++;
            }
        }
        return sortArrayWithoutNullElements(airlinesListByDestination);
    }

    //method for sorting by day of week
    static Airline[] sortArrayByDayOfWeek(Airline [] airlines, String dayOfWeekParam) {
        Airline [] airlinesListByDayOfWeek = new Airline[airlines.length];
        int counter = 0;
        for (Airline airline:airlines) {
            if (airline.getDaysOfWeek().equalsIgnoreCase(dayOfWeekParam)) {
                airlinesListByDayOfWeek[counter] = airline;
                counter++;
            }
        }
        return sortArrayWithoutNullElements(airlinesListByDayOfWeek);
    }

    //method for sorting by day of week & departure time more than input param
    static Airline [] sortArrayByDayOfWeekAndTime(
            Airline [] airlines, int departureTimeInHour, int departureTimeInMin, String dayOfWeekParam) {
        Airline [] airlinesListByDayOfWeek = new Airline[airlines.length];
        int counter = 0;
        int amountOfMinutes = departureTimeInHour * 60 + departureTimeInMin;
        for (Airline airline:airlines) {
            if (airline.getDaysOfWeek().equalsIgnoreCase(dayOfWeekParam) &&
                    airline.getDepartureTime().getHour() * 60 + airline.getDepartureTime().getMinute() > amountOfMinutes) {
                airlinesListByDayOfWeek[counter] = airline;
                counter++;
            }
        }
        return sortArrayWithoutNullElements(airlinesListByDayOfWeek);
    }

    private static Airline[] sortArrayWithoutNullElements(Airline [] airlines) {
        int counterForNotNullElements = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i] != null) {
                counterForNotNullElements++;
            }
        }
        Airline [] arrayWithoutNullElements = new Airline[counterForNotNullElements];
        for (Airline airline: airlines) {
            for (int i = 0; i < arrayWithoutNullElements.length; i++) {
                if (airline != null) {
                    arrayWithoutNullElements[i] = airline;
                }
            }
        }
        return arrayWithoutNullElements;
    }

    static void printSortedArray(Airline[] airlines) {
        Arrays.stream(airlines).forEach(System.out::println);
    }
}
