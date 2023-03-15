package com.example.assignment1.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_order;
    @Column(name = "nume", nullable = false, length = 20)
    private String nume;
    @Column(name = "prenume", nullable = false, length = 20)
    private String prenume;
    @Column(name = "cantitate", nullable = false, length = 20)
    private int quantity;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_show")
    private Show show;

    public Order(Long id_order, String nume, String prenume, int quantity, Show show) {
        this.id_order = id_order;
        this.nume = nume;
        this.prenume = prenume;
        this.quantity = quantity;
        this.show = show;
    }

    public Order(String nume, String prenume, int quantity, Show show) {
        this.nume = nume;
        this.prenume = prenume;
        this.quantity = quantity;
        this.show = show;
    }

    public Order() {

    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
