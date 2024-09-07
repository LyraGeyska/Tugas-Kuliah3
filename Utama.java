/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasKetiga;

/**
 *
 * @author HP
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //OVERIDING CODE
        Skincare moist = new Skincare();
        System.out.println("Aku adalah " + moist.getNamaProduk());
        System.out.println("Au memiliki beberapa manfaat, yakni :");
        moist.melembabkan();
        System.out.println("Aku merupakan salah satu produk dari " + moist.getMerk());
        System.out.println("Aku memiliki tekstur yang " + moist.getTekstur() + " dan berwarna " + moist.getWarna());

        System.out.println("=======================================================");
        //OVERLOADING CODE
        Bodycare marina = new Bodycare();
        System.out.println("Aku adalah " + marina.getNamaProduk());
        System.out.println("Aku memiliki beberapa manfaat, yakni :");
        marina.melembabkan();
        marina.mencerahkan();
        marina.sunProtected();
        System.out.println("Aku merupakan salah satu produk dari " + marina.getMerk());
        System.out.println("Aku menggunakan kemasan botol " + marina.getKemasan() + " berwarna " + moist.getWarna());
        marina.bahanAktif();
        marina.bahanAktif("Milk Protein dan Pearl Nutrient");
        System.out.println(marina.bahanAktif(30));

    }

}
