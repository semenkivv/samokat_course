package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SamokatController {
    private final SamokatRepository repository;

    SamokatController(SamokatRepository repository){
        this.repository = repository;
    }


    @GetMapping("/samokat/all")
    public List<Samokat> getAll(){
        return this.repository.findAll();
    }

    @GetMapping("/samokat/byId/{id}")
    public List<Samokat> getById(@PathVariable Long id){
        return this.repository.findById(id).stream().toList();
    }

    @GetMapping("/samokat/byPower/{power}")
    public List<Samokat> getByPower(@PathVariable String power){
        return Filters.byPower(this.repository.findAll(),power);
    }

    @GetMapping("/samokat/byMarkAndPower/{mark}/{power}")
    public List<Samokat> getByMarkAndPower(@PathVariable String mark, @PathVariable String power ){
        var listAll = this.repository.findAll();
        listAll = Filters.byMark(listAll,mark);
        listAll = Filters.byPower(listAll,power);
        return listAll;
    }

    @GetMapping("/samokat/byRegNumber/{regNumber}")
    public List<Samokat> getByRegNumber(@PathVariable String regNumber){
        return Filters.byRegNumber(this.repository.findAll(),regNumber);
    }

    @GetMapping("/samokat/byPowerAndArendTimer/{power}/{arendTimer}")
    public List<Samokat> getByPowerAndArendTimer(@PathVariable String power, @PathVariable String arendTimer){
        var listAll = this.repository.findAll();
        listAll = Filters.byPower(listAll,power);
        listAll = Filters.byArendTime(listAll,arendTimer);
        return listAll;
    }

    @GetMapping("/samokat/{regNumber}/deleteByRegNumber")
    public boolean deleteByRegNumber(@PathVariable String regNumber){
        var t = Filters.byExactRegNumber(this.repository.findAll(),regNumber);
        if(t != null && t.size()!=0){
            this.repository.delete(t.get(0));
            return true;
        } else{
            return false;
        }
    }

    @GetMapping("/samokat/{id}/delete")
    public boolean deleteById(@PathVariable Long id){
        boolean flag = this.repository.existsById(id);
        if(flag){
            this.repository.deleteById(id);
            return true;
        } else{
            return false;
        }
    }

    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }

}
