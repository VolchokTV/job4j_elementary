package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();

        student.setFamiliyaImyaOtchestvo("Korolov Sergey Pavlovich");
        student.setGroup("Авиационная техника");
        student.setReceiptDate(new Date());

        System.out.println(student.getFamiliyaImyaOtchestvo() + " зачислен в группу - " + student.getGroup() + " : " + student.getReceiptDate());

    }
}
