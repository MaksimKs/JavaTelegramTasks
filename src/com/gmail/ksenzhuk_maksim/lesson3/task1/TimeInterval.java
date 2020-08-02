package com.gmail.ksenzhuk_maksim.lesson3.task1;

public class TimeInterval {
    private long hours;
    private long minutes;
    private long seconds;

    TimeInterval (long inputSeconds) {
        if (inputSeconds < 0) {
            return;
        }
        this.seconds = inputSeconds % 60;
        this.minutes = ((inputSeconds - this.seconds) / 60) % 60;
        this.hours = ((inputSeconds - this.seconds) / 60 - this.minutes) / 60;
    }

    TimeInterval (long inputHours, long inputMinutes, long inputSeconds) {
        if(inputHours < 0 || inputMinutes < 0 || inputSeconds < 0) {
            return;
        }
        this.hours = inputHours;
        this.minutes = inputMinutes;
        this.seconds = inputSeconds;
    }

    public void setHours(long hours) {
        if (hours < 0) {
            this.hours = 0;
        }
        this.hours = hours;
    }
    public long getHours() {
        return hours;
    }

    public void setMinutes(long minutes) {
        if (minutes < 0) {
            this.minutes = 0;
        }
        this.minutes = minutes;
    }
    public long getMinutes() {
        return minutes;
    }

    public void setSeconds(long seconds) {
        if (seconds < 0) {
            this.seconds = 0;
        }
        this.seconds = seconds;
    }
    public long getSeconds() {
        return seconds;
    }

    long getAmountOfSeconds() {
        return this.getSeconds() + (this.getMinutes() * 60) + (this.getHours()* 3600);
    }

    void equals (TimeInterval timeInterval) {
        if (this.getAmountOfSeconds() == timeInterval.getAmountOfSeconds()) {
            System.out.printf("Objects have same amount of seconds\n" +
                    "first object has %d seconds, second object has %d seconds\n\n",
                    this.getAmountOfSeconds(), timeInterval.getAmountOfSeconds());
        } else
            System.out.printf("Objects have different amount of seconds\n" +
                    "first object has %d seconds, second object has %d seconds\n\n",
                    this.getAmountOfSeconds(), timeInterval.getAmountOfSeconds());
    }

    @Override
    public String toString() {
        return  "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds;
    }
}
