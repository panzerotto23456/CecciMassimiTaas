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
public class Estrazione {
    private Integer est_id;          // null finché non è salvata nel DB
    private Integer  est_valore;
    private Timestamp est_ora;
    private Integer  est_tom_id;

    public Estrazione(Integer est_valore, Timestamp est_ora, Integer est_tom_id) {
        this.est_valore = est_valore;
        this.est_ora = est_ora;
        this.est_tom_id = est_tom_id;
    }

    public Estrazione(Integer est_id, Integer est_valore, Timestamp est_ora, Integer est_tom_id) {
        this.est_id = est_id;
        this.est_valore = est_valore;
        this.est_ora = est_ora;
        this.est_tom_id = est_tom_id;
    }

    public Integer getEst_id() {
        return est_id;
    }

    public void setEst_id(Integer est_id) {
        this.est_id = est_id;
    }

    public Integer getEst_valore() {
        return est_valore;
    }

    public void setEst_valore(Integer est_valore) {
        this.est_valore = est_valore;
    }

    public Timestamp getEst_ora() {
        return est_ora;
    }

    public void setEst_ora(Timestamp est_ora) {
        this.est_ora = est_ora;
    }

    public Integer getEst_tom_id() {
        return est_tom_id;
    }

    public void setEst_tom_id(Integer est_tom_id) {
        this.est_tom_id = est_tom_id;
    }

    @Override
    public String toString() {
        return "Estrazione{" + "est_id=" + est_id + ", est_valore=" + est_valore + ", est_ora=" + est_ora + ", est_tom_id=" + est_tom_id + '}';
    }
    
    
}
