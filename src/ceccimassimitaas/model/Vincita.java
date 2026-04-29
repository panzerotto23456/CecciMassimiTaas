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
    
}
