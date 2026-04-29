/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.model;

import java.security.Timestamp;

/**
 *
 * @author cecci.giulia
 */
public class Vincita {
    private Integer vin_id;          // null finché non è salvata nel DB
    private TipoVincita vin_tipo;
    private Timestamp vin_ora;
    private Integer  vin_car_id;
    private Integer  vin_tom_id;

    public Vincita(TipoVincita vin_tipo, Timestamp vin_ora, Integer vin_car_id, Integer vin_tom_id) {
        this.vin_tipo = vin_tipo;
        this.vin_ora = vin_ora;
        this.vin_car_id = vin_car_id;
        this.vin_tom_id = vin_tom_id;
    }

    public Vincita(Integer vin_id, TipoVincita vin_tipo, Timestamp vin_ora, Integer vin_car_id, Integer vin_tom_id) {
        this.vin_id = vin_id;
        this.vin_tipo = vin_tipo;
        this.vin_ora = vin_ora;
        this.vin_car_id = vin_car_id;
        this.vin_tom_id = vin_tom_id;
    }

    public Integer getVin_id() {
        return vin_id;
    }

    public void setVin_id(Integer vin_id) {
        this.vin_id = vin_id;
    }

    public TipoVincita getVin_tipo() {
        return vin_tipo;
    }

    public void setVin_tipo(TipoVincita vin_tipo) {
        this.vin_tipo = vin_tipo;
    }

    public Timestamp getVin_ora() {
        return vin_ora;
    }

    public void setVin_ora(Timestamp vin_ora) {
        this.vin_ora = vin_ora;
    }

    public Integer getVin_car_id() {
        return vin_car_id;
    }

    public void setVin_car_id(Integer vin_car_id) {
        this.vin_car_id = vin_car_id;
    }

    public Integer getVin_tom_id() {
        return vin_tom_id;
    }

    public void setVin_tom_id(Integer vin_tom_id) {
        this.vin_tom_id = vin_tom_id;
    }

    @Override
    public String toString() {
        return "Vincita{" + "vin_id=" + vin_id + ", vin_tipo=" + vin_tipo + ", vin_ora=" + vin_ora + ", vin_car_id=" + vin_car_id + ", vin_tom_id=" + vin_tom_id + '}';
    }
    
    
    
}
