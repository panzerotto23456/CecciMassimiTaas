/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ceccimassimitaas;

/**
 *
 * @author cecci.giulia
 */
public class CecciMassimiTaas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnagraficaRepository repo = new AnagraficaRepositoryImpl();

        // ── 1. INSERT ───────────────────────────────────────────────────
        Anagrafica mario = new Anagrafica("Mario", "Rossi", 1985);
        Anagrafica laura = new Anagrafica("Laura", "Bianchi", 1992);
        Anagrafica luca  = new Anagrafica("Luca",  "Verdi",   1978);

        repo.save(mario);   // mario.getId() ora ha il valore reale del DB
        repo.save(laura);
        repo.save(luca);

        System.out.println("Inseriti: " + mario + ", " + laura + ", " + luca);

        // ── 2. SELECT ALL ───────────────────────────────────────────────
        List<Anagrafica> tutti = repo.findAll();
        System.out.println("\n── Tutti i record ──");
        tutti.forEach(System.out::println);

        // ── 3. SELECT BY ID ─────────────────────────────────────────────
        repo.findById(mario.getId())
            .ifPresentOrElse(
                a -> System.out.println("\nTrovato per id: " + a),
                () -> System.out.println("Non trovato")
            );

        // ── 4. UPDATE ───────────────────────────────────────────────────
        mario.setNome("Mario Angelo");
        mario.setAnnoNascita(1986);
        repo.update(mario);
        System.out.println("\nAggiornato: " + mario);

        // ── 5. DELETE ───────────────────────────────────────────────────
        repo.deleteById(luca.getId());
        System.out.println("\nEliminato id=" + luca.getId());

        // ── 6. Verifica finale ──────────────────────────────────────────
        System.out.println("\n── Record finali ──");
        repo.findAll().forEach(System.out::println);
    }
    
}
