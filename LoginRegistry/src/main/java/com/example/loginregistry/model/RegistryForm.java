package com.example.loginregistry.model;


import java.util.Date;
import java.util.List;
import java.util.logging.Level;


public class RegistryForm {

    private String employeeCode;

    private String employeeName;

    private String firstName;

    private String lastName;

    private String joinDate;

    private String levelSelect;

    private List<Level> level;

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getLevelSelect() {
        return levelSelect;
    }

    public void setLevelSelect(String levelSelect) {
        this.levelSelect = levelSelect;
    }

    public List<Level> getLevel() {
        return level;
    }

    public void setLevel(List<Level> level) {
        this.level = level;
    }

}

