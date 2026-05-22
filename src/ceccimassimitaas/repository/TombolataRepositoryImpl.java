/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.repository;


import ceccimassimitaas.db.ConnectionManager;
import ceccimassimitaas.model.Tombolata;


import java.sql.*;
import java.util.*;
/**
 *
 * @author cecci.giulia
 */
public class TombolataRepositoryImpl implements TombolataRepository{
    
    // ── Query SQL come costanti ────────────────────────────────────────
    private static final String INSERT =
        "INSERT INTO taas_tombolate (tom_data, tom_sede, tom_stato) VALUES (?, ?, ?)";
    private static final String UPDATE =
        "UPDATE taas_tombolate SET tom_stato = ? WHERE tom_id = ?";
    private static final String DELETE =
        "DELETE FROM taas_tombolate WHERE tom_id = ?";

    // ── SAVE (INSERT) ─────────────────────────────────────────────────
    @Override
    public void save(Tombolata t) throws Exception {
        // try-with-resources chiude automaticamente Connection e Statement
        try (Connection        conn = ConnectionManager.getConnection();
             PreparedStatement ps   = conn.prepareStatement(INSERT,
                                            Statement.RETURN_GENERATED_KEYS)) {

            ps.setDate(1, new java.sql.Date(t.getTom_data().getTime())); //converto perchè sono due format di date diversi
            ps.setString(2, t.getTom_sede());
            ps.setString   (3, t.getTom_stato().toString());
            ps.executeUpdate();

            // Recuperiamo l'id auto-generato dal DB
            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    t.setTom_id(keys.getInt(1));
                }
            }
        }
    }
   


    // ── UPDATE ────────────────────────────────────────────────────────
    @Override
    public void updateStato(Tombolata t) throws Exception {
        try (Connection        conn = ConnectionManager.getConnection();
             PreparedStatement ps   = conn.prepareStatement(UPDATE)) {
            

            ps.setString(1, t.getTom_stato().nextStatus().toString());
            ps.setInt   (2, t.getTom_id());
            ps.executeUpdate();
        }
    }

    // ── DELETE ────────────────────────────────────────────────────────
    @Override
    public void deleteById(int id) throws Exception {
        try (Connection        conn = ConnectionManager.getConnection();
             PreparedStatement ps   = conn.prepareStatement(DELETE)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    // ── HELPER: mappa una riga del ResultSet in un oggetto ────────────
    private Tombolata mapRow(ResultSet rs) throws SQLException {
        return new Tombolata(
            rs.getInt   ("tom_id"),
            rs.getDate("tom_data"),
            rs.getString("tom_sede"),
            rs.getString  ("tom_stato")
        );
    }
}
