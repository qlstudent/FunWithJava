package com.gitlab.kush;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(dtf.format(datetime));
    }
}
