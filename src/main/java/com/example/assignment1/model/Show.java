package com.example.assignment1.model;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="shows")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_show;
    @Column(name = "artist", length = 60)
    private String artist;
    @Column(name = "denumire", length = 60)
    private String denumire;
    @Column(name ="gen", length = 50)
    private String gen;
    @Column(name ="cantitate", length = 20)
    private int cantitate;
    @Column(name ="pret", length = 20)
    private double pret;
    @Column(name ="data", length = 20)
    private LocalDateTime data;

    public Show(Long id_show, String artist, String denumire, String gen, int cantitate, double pret, LocalDateTime data) {
        this.id_show = id_show;
        this.artist = artist;
        this.denumire = denumire;
        this.gen = gen;
        this.cantitate = cantitate;
        this.pret = pret;
        this.data = data;
    }

    public Show(String artist, String denumire, String gen, int cantitate, double pret, LocalDateTime data) {
        this.artist = artist;
        this.denumire = denumire;
        this.gen = gen;
        this.cantitate = cantitate;
        this.pret = pret;
        this.data = data;
    }

    public Show() {
    }

    public Long getId_show() {
        return id_show;
    }

    public void setId_show(Long id_show) {
        this.id_show = id_show;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
