package org.example;

public class IsItFriday {

    public String isItFriday(String today) {
        return "Friday".equalsIgnoreCase(today) ? "TGIF" : "Nope";
    }
}
