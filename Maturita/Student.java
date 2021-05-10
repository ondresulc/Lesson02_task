package Maturita;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private LocalDate dateOfBirth;
    private String studentClass;
    public double[] certificate;

    public Student(String name, String surName, LocalDate dateOfBirth, String studentClass, double[] certificate) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.studentClass = studentClass;
        this.certificate = certificate;

    }

    public void studentResultsPrint() {
        System.out.println("Student's class: " + studentClass);
        System.out.println("name: " + name +" "+ surName);
        System.out.println("born: " + dateOfBirth);
        System.out.println("certificate: " + (int)certificate[0] + ", " + (int)certificate[1] + ", " + (int)certificate[2] + ", " + (int)certificate[3]);

    }

    public void passedExams() {
        double notesAverage = ((certificate[0] + certificate[1] +certificate[2] + certificate[3])/4);

        if (notesAverage <= 1.5) {
            System.out.println("Student passed exams: passed with distinction");
        } else if (notesAverage <= 4) {
            System.out.println("Student passed exams: passed");
        } else System.out.println("Student passed exams: failed");

        System.out.println("---------------------------------------------");
        System.out.println();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public double[] getCertificate() {
        return certificate;
    }

    public void setCertificate(double[] certificate) {
        this.certificate = certificate;
    }

}
