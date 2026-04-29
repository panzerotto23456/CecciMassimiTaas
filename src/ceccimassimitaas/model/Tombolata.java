package ceccimassimitaas.model;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cecci.giulia
 */
public class Tombolata {
    private Integer tom_id;          // null finché non è salvata nel DB
    private Date  tom_data;
    private String  tom_sede;
    private StatoTombolata  tom_stato;

    // Costruttore per INSERT (senza id)

    public Tombolata(Date tom_data, String tom_sede, StatoTombolata tom_stato) {
        this.tom_data = tom_data;
        this.tom_sede = tom_sede;
        this.tom_stato = tom_stato;
    }

    public Tombolata(Integer tom_id, Date tom_data, String tom_sede, StatoTombolata tom_stato) {
        this.tom_id = tom_id;
        this.tom_data = tom_data;
        this.tom_sede = tom_sede;
        this.tom_stato = tom_stato;
    }

    public Integer getTom_id() {
        return tom_id;
    }

    public void setTom_id(Integer tom_id) {
        this.tom_id = tom_id;
    }

    public Date getTom_data() {
        return tom_data;
    }

    public void setTom_data(Date tom_data) {
        this.tom_data = tom_data;
    }

    public String getTom_sede() {
        return tom_sede;
    }

    public void setTom_sede(String tom_sede) {
        this.tom_sede = tom_sede;
    }

    public StatoTombolata getTom_stato() {
        return tom_stato;
    }

    public void setTom_stato(StatoTombolata tom_stato) {
        this.tom_stato = tom_stato;
    }

    @Override
    public String toString() {
        return "Tombolata{" + "tom_id=" + tom_id + ", tom_data=" + tom_data + ", tom_sede=" + tom_sede + ", tom_stato=" + tom_stato + '}';
    }
    
    
}
