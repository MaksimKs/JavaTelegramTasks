package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpCheckerService {

    private String ipAddress = "";

    public String getIpAddress() {
        return ipAddress;
    }

    public IpCheckerService(){
    }

    public IpCheckerService(String string) {
        if (ValidatorForInputString.validation(string)) {
            this.ipAddress = string;
            ipCheck(string);
        }
    }

    public String toString() {
        return String.format("Is valid ip address: %s - %b", ipAddress, ipCheck(this.ipAddress));
    }

    boolean ipCheck(String string) {
        Pattern pattern = Pattern.compile("^(([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])$");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
