/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.model;

/**
 *
 * @author cecci.giulia
 */
public class NumeroCartella {
    private Integer num_id;          // null finché non è salvata nel DB
    private Integer  num_valore;
    private Boolean num_estratto;
    private Integer  num_car_id;

    public NumeroCartella(Integer num_valore, Boolean num_estratto, Integer num_car_id) {
        this.num_valore = num_valore;
        this.num_estratto = num_estratto;
        this.num_car_id = num_car_id;
    }

    public NumeroCartella(Integer num_id, Integer num_valore, Boolean num_estratto, Integer num_car_id) {
        this.num_id = num_id;
        this.num_valore = num_valore;
        this.num_estratto = num_estratto;
        this.num_car_id = num_car_id;
    }

    public Integer getNum_id() {
        return num_id;
    }

    public void setNum_id(Integer num_id) {
        this.num_id = num_id;
    }

    public Integer getNum_valore() {
        return num_valore;
    }

    public void setNum_valore(Integer num_valore) {
        this.num_valore = num_valore;
    }

    public Boolean getNum_estratto() {
        return num_estratto;
    }

    public void setNum_estratto(Boolean num_estratto) {
        this.num_estratto = num_estratto;
    }

    public Integer getNum_car_id() {
        return num_car_id;
    }

    public void setNum_car_id(Integer num_car_id) {
        this.num_car_id = num_car_id;
    }

    @Override
    public String toString() {
        return "NumeroCartella{" + "num_id=" + num_id + ", num_valore=" + num_valore + ", num_estratto=" + num_estratto + ", num_car_id=" + num_car_id + '}';
    }
    
    
}
