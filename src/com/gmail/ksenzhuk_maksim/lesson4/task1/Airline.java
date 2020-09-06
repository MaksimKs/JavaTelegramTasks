package com.gmail.ksenzhuk_maksim.lesson4.task1;

import java.time.LocalTime;

/*
1)Создать класс Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
недели.
Создать массив объектов. Вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
*/
public class Airline {

    private String destinationCountry;
    private int flightNumber;
    private char airplaneType;
    private LocalTime departureTime;
    private int departureTimeInHour ;
    private int departureTimeInMin;
    private String daysOfWeek;

    public Airline(String destinationCountry, int flightNumber, char airplaneType,
                   int departureTimeInHour, int departureTimeInMin, String daysOfWeek) {
        setDestinationCountry(destinationCountry);
        setFlightNumber(flightNumber);
        setAirplaneType(airplaneType);
        setDepartureTime(departureTimeInHour, departureTimeInMin);
        setDaysOfWeek(daysOfWeek);
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }
    public void setDestinationCountry(String destinationCountry) {
        if  (destinationCountry.isEmpty()) {
            System.out.println("Destination country not valid.");
        } else this.destinationCountry = destinationCountry;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        if (flightNumber <= 0) {
            System.out.println("Flight number should be more than zero.");
        } else this.flightNumber = flightNumber;
    }

    public char getAirplaneType() {
        return airplaneType;
    }
    public void setAirplaneType(char airplaneType) {
        if (Character.toUpperCase(airplaneType) == AirplaneTypes.passengerAirplane.getPlaneType() ||
        Character.toUpperCase(airplaneType) == AirplaneTypes.cargoAirplane.getPlaneType()) {
            this.airplaneType = airplaneType;
        } else System.out.println(
                "Only two types available for airplanes, A-for passengers planes, B-for cargo planes");
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(int departureTimeInHour, int departureTimeInMin) {
        if (departureTimeInHour < 0 || departureTimeInHour > 23){
            System.out.println("Departure time in hours should be between 0 and 23");
        } if (departureTimeInMin < 0 || departureTimeInMin >59) {
            System.out.println("Departure time in minutes should be between 0 and 59");
        } else {
            this.departureTime = LocalTime.of(departureTimeInHour,departureTimeInMin);
        }
    }

    public String getDaysOfWeek() {
        return this.daysOfWeek;
    }
    public void setDaysOfWeek(String daysOfWeek) {
        if (!DaysOfWeekValidation.validation(daysOfWeek.toLowerCase()).equals("not defined")) {
            this.daysOfWeek = daysOfWeek;
        } else System.out.println("There is no appropriate week day");
    }

    @Override
    public String toString() {
        return "Airline: " +
                "destinationCountry: " + destinationCountry +
                ", flightNumber: " + flightNumber +
                ", airplaneType: " + airplaneType +
                ", departureTime: " + departureTime +
                ", daysOfWeek: " + daysOfWeek;
    }
}
