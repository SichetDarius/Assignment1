package com.example.assignment1.controller;


import com.example.assignment1.model.Show;
import com.example.assignment1.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/shows")
@RestController
public class ShowController {
    @Autowired
    private ShowService showService;
    //show show list
    @GetMapping
    public List<Show> getShows(){
        return showService.getAllShows();
    }
    //add show
    @PostMapping
    public void addNewShow(@RequestBody Show show) {
        showService.saveShows(show);
    }

    //update show
    @GetMapping("/{id}")
    public Show showFormForUpdate(@PathVariable(value = "id") long id){
        Show show = showService.getShowById(id);

        return show;
    }
    //delete show
    @DeleteMapping("/{id}")
    public void deleteShow(@PathVariable (value = "id") long id){

        //call delete show method
        this.showService.deleteShowById(id);
    }
}
