package com.gmail.ksenzhuk_maksim.lesson4.task1;

enum AirplaneTypes {
    passengerAirplane('A'),
    cargoAirplane('B');
    char planeType;

    AirplaneTypes(char type){
        this.planeType = type;
    }

    public char getPlaneType() {
        return planeType;
    }
}
