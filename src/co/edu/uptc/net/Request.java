package co.edu.uptc.net;

import co.edu.uptc.model.Student;

public class Request {
    private String option;
    private String codeUser;
    private String passwordUser;
    private String courseName;
    private Student student;

    public Request(String option) {
        this.option = option;
    }
    public Request(String option, String data, int choice) {
        this.option = option;
        switch (choice) {
            case 1:
                this.codeUser = data;
                break;
            case 2:
                this.courseName = data;
                break;
        }
    }

    public Request(String option, Student student) {
        this.option = option;
        this.student = student;
    }

    public Request(String option, String codeUser, String passwordUser) {
        this.option = option;
        this.codeUser = codeUser;
        this.passwordUser = passwordUser;
    }

    public String getOption() {
        return option;
    }

    public String getCodeUser() {
        return codeUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student getStudent() {
        return student;
    }
}
