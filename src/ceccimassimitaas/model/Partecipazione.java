/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.model;

/**
 *
 * @author cecci.giulia
 */
public class Partecipazione {
    private Integer par_car_id;  
    private Integer par_tom_id;          // null finché non è salvata nel DB

    public Partecipazione(Integer par_car_id, Integer par_tom_id) {
        this.par_car_id = par_car_id;
        this.par_tom_id = par_tom_id;
    }

    public Integer getPar_car_id() {
        return par_car_id;
    }

    public void setPar_car_id(Integer par_car_id) {
        this.par_car_id = par_car_id;
    }

    public Integer getPar_tom_id() {
        return par_tom_id;
    }

    public void setPar_tom_id(Integer par_tom_id) {
        this.par_tom_id = par_tom_id;
    }
    

    @Override
    public String toString() {
        return "Partecipazione{" + "par_car_id=" + par_car_id + ", par_tom_id=" + par_tom_id + '}';
    }
    
    
}
