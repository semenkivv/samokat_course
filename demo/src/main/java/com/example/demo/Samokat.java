package com.example.demo;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.Objects;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "samokatu")
public class Samokat {

    @Id @GeneratedValue
    private Long Id;
    private String regNumber;
    private String mark;
    private String dateOfBuild;
    private String power;
    private String phoneNumber;
    private String arendDateTime;
    private String arendTimer;

    public Samokat() {
    }

    public Samokat(String regNumber, String mark, String dateOfBuild, String power, String phoneNumber, String arendDateTime, String arendTimer) {
        this.regNumber = regNumber;
        this.mark = mark;
        this.dateOfBuild = dateOfBuild;
        this.power = power;
        this.phoneNumber = phoneNumber;
        this.arendDateTime = arendDateTime;
        this.arendTimer = arendTimer;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDateOfBuild() {
        return dateOfBuild;
    }

    public void setDateOfBuild(String dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getArendDateTime() {
        return arendDateTime;
    }

    public void setArendDateTime(String arendDateTime) {
        this.arendDateTime = arendDateTime;
    }

    public String getArendTimer() {
        return arendTimer;
    }

    public void setArendTimer(String arendTimer) {
        this.arendTimer = arendTimer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samokat samokat = (Samokat) o;
        return Objects.equals(getId(), samokat.getId()) && Objects.equals(getRegNumber(), samokat.getRegNumber()) && Objects.equals(getMark(), samokat.getMark()) && Objects.equals(getDateOfBuild(), samokat.getDateOfBuild()) && Objects.equals(getPower(), samokat.getPower()) && Objects.equals(getPhoneNumber(), samokat.getPhoneNumber()) && Objects.equals(getArendDateTime(), samokat.getArendDateTime()) && Objects.equals(getArendTimer(), samokat.getArendTimer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRegNumber(), getMark(), getDateOfBuild(), getPower(), getPhoneNumber(), getArendDateTime(), getArendTimer());
    }

    @Override
    public String toString() {
        return "Samokat{" +
                "id=" + Id +
                ", regNumber='" + regNumber + '\'' +
                ", mark='" + mark + '\'' +
                ", dateOfBuild='" + dateOfBuild + '\'' +
                ", power='" + power + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", arendDateTime='" + arendDateTime + '\'' +
                ", arendTimer='" + arendTimer + '\'' +
                '}';
    }
}
