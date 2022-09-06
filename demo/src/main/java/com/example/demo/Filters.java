package com.example.demo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filters {
    public static List<Samokat> byMark(List<Samokat> list, String mark){
        return list.stream().filter(x -> Objects.equals(x.getMark(), mark)).collect((Collectors.toList()));
    }

    public static List<Samokat> byPower(List<Samokat> list, String power){
        return list.stream().filter(x -> power.equals(x.getPower())).collect((Collectors.toList()));
    }

    public static List<Samokat> byRegNumber(List<Samokat> list, String regNumber){
        return list.stream().filter(x->x.getRegNumber().contains(regNumber)).collect((Collectors.toList()));
    }

    public static List<Samokat> byExactRegNumber(List<Samokat> list, String regNumber){
        return list.stream().filter(x-> Objects.equals(x.getRegNumber(), regNumber)).findFirst().stream().toList();
    }

    public static List<Samokat> byArendTime(List<Samokat> list, String arendTimeLeft){
        return list.stream().filter(x -> {
            int t1 = Integer.parseInt(x.getArendTimer().replaceAll("\\D+",""));
            int t2 = Integer.parseInt(arendTimeLeft.replaceAll("\\D+",""));
            if(t1<t2){
                return true;
            } else{
                return false;
            }
        }).collect((Collectors.toList()));
    }
}
