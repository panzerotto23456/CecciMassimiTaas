/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.repository;

import ceccimassimitaas.model.Tombolata;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author cecci.giulia
 */
public interface  TombolataRepository {
    // Inserisce una nuova tombolata 
    void               save(Tombolata t) throws Exception;

    /** Legge tutti i record */
    List<Tombolata>   findAll()        throws Exception;

    /** Cerca per id; ritorna Optional.empty() se non trovato */
    Optional<Tombolata> findById(int id) throws Exception;

    /** Aggiorna nome, cognome e anno di un record esistente */
    void               updateStato(Tombolata a) throws Exception;

    /** Cancella il record con l'id specificato */
    void               deleteById(int id) throws Exception;

}
