/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.db;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author cecci.giulia
 */
public class ConnectionManager {
     // ── Parametri di connessione — modifica questi valori ────────────
    private static final String URL =
        "localhost";
    private static final String USER     = "massimialunnimarco";
    private static final String PASSWORD = "";

    /**
     * Restituisce una nuova connessione al database.
     * Il chiamante è responsabile di chiuderla (preferibilmente con try-with-resources).
     */
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Classe di sola utilità: costruttore privato
    private ConnectionManager() {}
}
