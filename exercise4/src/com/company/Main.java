package com.company;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String pattern1 = "^[1-9]+[0-9]*$";
        String content1 = "-53";
        String content2 = "36";
        boolean isMatch1 = Pattern.matches(pattern1, content1);
        boolean isMatch2 = Pattern.matches(pattern1, content2);
        if (isMatch1){
            System.out.println(content1 + " " + "is a positive integer.");
        }
        else{
            System.out.println(content1 + " " + "is not a positive integer.");
        }
        if (isMatch2){
            System.out.println(content2 + " " + "is a positive integer.\n");
        }
        else{
            System.out.println(content2 + " " + "is not a positive integer.\n");
        }

        String pattern2 = "^[A-Za-z0-9]+@([A-Za-z0-9]+\\.){1,2}[A-Za-z0-9]+$";
        String content3 = "luckkyzhou@gmail.com";
        String content4 = "javaclass@abc";
        boolean isMatch3 = Pattern.matches(pattern2, content3);
        boolean isMatch4 = Pattern.matches(pattern2, content4);
        if (isMatch3){
            System.out.println("\"" + content3 + "\"" + " " + "is an email address.");
        }
        else{
            System.out.println("\"" + content3 + "\"" + " " + "is not an email address.");
        }
        if (isMatch4){
            System.out.println("\"" + content4 + "\"" + " " + "is an email address.\n");
        }
        else{
            System.out.println("\"" + content4 + "\"" + " " + "is not an email address.\n");
        }

        String pattern3 = "(((https|http)?://)?([a-z0-9]+[.])|(www.))\\w+[.|\\/]([a-z0-9]{0,})?[[.]([a-z0-9]{0,})]+((/[\\S&&[^,;\u4E00-\u9FA5]]+)+)?([.][a-z0-9]{0,}+|/?)";
        String content5 = "https://www.google.com/search?sxsrf=ACYBGNSPcyxi06GOtUwFVr3bsLxNdcnbTQ%3A1576194470949&source=hp&ei=ptHyXaiIN8HD0PEPmOCv-A4&q=java+tutorial&oq=java+tutorial";
        String content6 = "abc.java";
        boolean isMatch5 = Pattern.matches(pattern3, content5);
        boolean isMatch6 = Pattern.matches(pattern3, content6);
        if (isMatch5){
            System.out.println("\"" + content5 + "\"" + " " + "is a website.");
        }
        else{
            System.out.println("\"" + content5 + "\"" + " " + "is not a website.");
        }
        if (isMatch6){
            System.out.println("\"" + content6 + "\"" + " " + "is a website.\n");
        }
        else{
            System.out.println("\"" + content6 + "\"" + " " + "is not a website.\n");
        }

        String pattern4 = "[-+]{0,1}\\d+\\.\\d*|[-+]{0,1}\\d*\\.\\d+";
        String content7 = "-5.2352";
        String content8 = "5350";
        boolean isMatch7 = Pattern.matches(pattern4, content7);
        boolean isMatch8 = Pattern.matches(pattern4, content8);
        if (isMatch7){
            System.out.println("\"" + content7 + "\"" + " " + "is a decimal.");
        }
        else{
            System.out.println("\"" + content7 + "\"" + " " + "is not a decimal.");
        }
        if (isMatch8){
            System.out.println("\"" + content8 + "\"" + " " + "is a decimal.\n");
        }
        else{
            System.out.println("\"" + content8 + "\"" + " " + "is not a decimal.\n");
        }

        String pattern5 = "^(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)\\."
                + "(1\\d{2}|2[0-4]\\d|25[0-5]|0?[1-9]\\d|0{0,2}\\d)$";
        String content9 = "192.168.0.1";
        String content10 = "237.256.255.0";
        boolean isMatch9 = Pattern.matches(pattern5, content9);
        boolean isMatch10 = Pattern.matches(pattern5, content10);
        if (isMatch9){
            System.out.println("\"" + content9 + "\"" + " " + "is an ip address.");
        }
        else{
            System.out.println("\"" + content9 + "\"" + " " + "is not an ip address.");
        }
        if (isMatch10){
            System.out.println("\"" + content10 + "\"" + " " + "is an ip address.\n");
        }
        else{
            System.out.println("\"" + content10 + "\"" + " " + "is not an ip address.\n");
        }
    }
}
