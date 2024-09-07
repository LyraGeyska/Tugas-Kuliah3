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
public class Bodycare extends Perawatan implements Lotion, Moisturizer {

    private String kemasan;
    private String warna;

    public Bodycare() {
        super.fungsiPerawatan();
        System.out.println("Aku hadir untuk membantu permasalahan kulit wajahmu");
        this.setKemasan("Botol Pump");
        this.setWarna("Putih dan Biru");
        super.setMerk("Marina");
        super.setNamaProduk("Body Lotion n Cream");
    }

    public void bahanAktif() {
        System.out.println("Aku mengandung bahan aktif yang sangat bagus, yaitu : ");
    }

    public void bahanAktif(String kandungan) {
        System.out.println(kandungan);
    }

    public String bahanAktif(int spf) {
        return "Aku sudah dilengkapi dengan Sun Protection Factor " + String.valueOf(spf) + " PA+++ ";
    }

    /**
     * @return the kemasan
     */
    public String getKemasan() {
        return kemasan;
    }

    /**
     * @param kemasan the kemasan to set
     */
    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void mencerahkan() {
        System.out.println("Berguna untuk mencerahkan kulit.");
    }

    @Override
    public void melembabkan() {
        System.out.println("Berguna untuk melembabkan kulit.");

    }

    @Override
    public void sunProtected() {
        System.out.println("Berguna untuk melindungi kulit dari sinar UV.");

    }

    @Override
    public void regenerasi() {
        System.out.println("Berguna untuk memperbaiki sel kulit mati.");

    }

}
