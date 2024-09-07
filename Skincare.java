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
public class Skincare extends Perawatan implements Moisturizer, Serum {

    private String tekstur;
    private String warna;

    public Skincare() {
        super.fungsiPerawatan();
        System.out.println("Aku hadir untuk membantu permasalahan kulit wajahmu");
        this.setTekstur("Creamy");
        this.setWarna("Putih");
        super.setMerk("The Orginote");
        super.setNamaProduk("Moisturizer");
    }

    /**
     * @return the tekstur
     */
    public String getTekstur() {
        return tekstur;
    }

    /**
     * @param tekstur the tekstur to set
     */
    public void setTekstur(String tekstur) {
        this.tekstur = tekstur;
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
    public void melembabkan() {
        System.out.println("Berguna untuk melembabkan kulit wajah.");
    }

    @Override
    public void regenerasi() {
        System.out.println("Berguna untuk memperbaiki sel kulit mati.");
    }

    @Override
    public void darkspot() {
        System.out.println("Berguna untuk menghilangkan noda hitam.");
    }

    @Override
    public void mencerahkan() {
        System.out.println("Berguna untuk mencerahkan kulit.");
    }

}
