package com.example.assignment1.service;

import com.example.assignment1.model.Show;
import com.example.assignment1.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowServiceImpl implements ShowService{

    @Autowired
    private ShowRepository showRepository;


    @Override
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    @Override
    public void saveShows(Show show) {
        this.showRepository.save(show);
    }

    @Override
    public Show getShowById(long id) {
        Optional<Show> optional = showRepository.findById(id);
    Show show=null;
    if(optional.isPresent()){
        show=optional.get();
    }else{
        throw new RuntimeException("Show is not found for id::"+id);
    }
    return show;
    }

    @Override
    public void deleteShowById(long id) {
this.showRepository.deleteById(id);
    }
}
