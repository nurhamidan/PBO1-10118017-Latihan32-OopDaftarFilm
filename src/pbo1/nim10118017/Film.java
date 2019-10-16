package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class yang berisi spesifikasi film.
 * 
 */
public class Film {
    
    //Atribut class.
    public String filmName, filmGenre;
    public Double filmRating;
    public int filmDuration;
    
    //Method class.
    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
    }
    
}
