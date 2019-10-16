package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan film yang tayang.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objek disimpan dalam array
        Film[] film = new Film[4];
        
        //Proses instansiasi objek.
        for (int i = 0; i < film.length; i++) {
            film[i] = new Film();
        }
        
        //Inisialisasi.
        film[0].filmName = "Venom";
        film[0].filmGenre = "Action, Horor, Scifi";
        film[0].filmRating = 8.5;
        film[0].filmDuration = 120;
        film[1].filmName = "Small Foot";
        film[1].filmGenre = "Animation";
        film[1].filmRating = 9.0;
        film[1].filmDuration = 96;
        film[2].filmName = "Crazy Rich Asian";
        film[2].filmGenre = "Comedy";
        film[2].filmRating = 7.8;
        film[2].filmDuration = 119;
        film[3].filmName = "Asih";
        film[3].filmGenre = "Horror";
        film[3].filmRating = 6.0;
        film[3].filmDuration = 100;
        
        //Menampilkan hasil
        System.out.println("===Daftar Film Sedang Tayang===\n");
        for (Film i : film) {
            i.nowPlaying();
            System.out.println();
        }
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
