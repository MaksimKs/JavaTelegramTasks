package com.gmail.ksenzhuk_maksim.lesson4.task1;

class DaysOfWeekValidation {
    static String validation(String daysOfWeek) {
        String result = "not defined";
        switch (daysOfWeek) {
            case "monday":
                result = "monday";
                break;
            case "tuesday":
                result = "tuesday";
                break;
            case "wednesday":
                result = "wednesday";
                break;
            case "thursday":
                result = "thursday";
                break;
            case "friday":
                result = "friday";
                break;
            case "saturday":
                result = "saturday";
                break;
            case "sunday":
                result = "sunday";
                break;
        }
        return result;
    }
}
