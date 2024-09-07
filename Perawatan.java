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
public class Perawatan extends Kecantikan {

    private String namaProduk;
    private String merk;

    @Override
    public void funFact() {
        System.out.println("Wudhu juga termasuk perawatan loh :)");
    }

    @Override
    void perawatanDiri() {
        System.out.println("");
    }

    /**
     * @return the namaProduk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

}
