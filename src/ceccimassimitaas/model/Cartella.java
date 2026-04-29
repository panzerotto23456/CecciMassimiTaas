/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.model;

/**
 *
 * @author cecci.giulia
 */
public class Cartella {
    private Integer car_id;          // null finché non è salvata nel DB
    private Integer  car_ute_id;

    public Cartella(Integer car_ute_id) {
        this.car_ute_id = car_ute_id;
    }

    public Cartella(Integer car_id, Integer car_ute_id) {
        this.car_id = car_id;
        this.car_ute_id = car_ute_id;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public Integer getCar_ute_id() {
        return car_ute_id;
    }

    public void setCar_ute_id(Integer car_ute_id) {
        this.car_ute_id = car_ute_id;
    }

    @Override
    public String toString() {
        return "Cartella{" + "car_id=" + car_id + ", car_ute_id=" + car_ute_id + '}';
    }
    
    
    
}
