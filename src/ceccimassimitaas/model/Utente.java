/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceccimassimitaas.model;

/**
 *
 * @author cecci.giulia
 */
public class Utente {
    private Integer ute_id;          // null finché non è salvata nel DB
    private String ute_nome;
    private String  ute_cognome;
    private Boolean ute_gestore;
    private String ute_email;
    private String ute_psw;

    // Costruttore per INSERT (senza id)

    public Utente(String ute_nome, String ute_cognome, Boolean ute_gestore, String ute_email, String ute_psw) {
        this.ute_nome = ute_nome;
        this.ute_cognome = ute_cognome;
        this.ute_gestore = ute_gestore;
        this.ute_email = ute_email;
        this.ute_psw = ute_psw;
    }

    public Utente(Integer ute_id, String ute_nome, String ute_cognome, Boolean ute_gestore, String ute_email, String ute_psw) {
        this.ute_id = ute_id;
        this.ute_nome = ute_nome;
        this.ute_cognome = ute_cognome;
        this.ute_gestore = ute_gestore;
        this.ute_email = ute_email;
        this.ute_psw = ute_psw;
    }

    public Integer getUte_id() {
        return ute_id;
    }

    public void setUte_id(Integer ute_id) {
        this.ute_id = ute_id;
    }

    public String getUte_nome() {
        return ute_nome;
    }

    public void setUte_nome(String ute_nome) {
        this.ute_nome = ute_nome;
    }

    public String getUte_cognome() {
        return ute_cognome;
    }

    public void setUte_cognome(String ute_cognome) {
        this.ute_cognome = ute_cognome;
    }

    public Boolean getUte_gestore() {
        return ute_gestore;
    }

    public void setUte_gestore(Boolean ute_gestore) {
        this.ute_gestore = ute_gestore;
    }

    public String getUte_email() {
        return ute_email;
    }

    public void setUte_email(String ute_email) {
        this.ute_email = ute_email;
    }

    public String getUte_psw() {
        return ute_psw;
    }

    public void setUte_psw(String ute_psw) {
        this.ute_psw = ute_psw;
    }

    @Override
    public String toString() {
        return "Utente{" + "ute_id=" + ute_id + ", ute_nome=" + ute_nome + ", ute_cognome=" + ute_cognome + ", ute_gestore=" + ute_gestore + ", ute_email=" + ute_email + ", ute_psw=" + ute_psw + '}';
    }

    

}
