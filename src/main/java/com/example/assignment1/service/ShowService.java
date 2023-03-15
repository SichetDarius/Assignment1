package com.example.assignment1.service;

import com.example.assignment1.model.Show;

import java.util.List;

public interface ShowService {
    List<Show> getAllShows();
    void saveShows(Show show);
    Show getShowById(long id);
    void deleteShowById(long id);
}
