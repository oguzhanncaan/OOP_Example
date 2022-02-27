package com.oguzhan.repository.entity;

import com.oguzhan.constants.Properties;
import com.oguzhan.utility.StaticValues;

import java.util.UUID;

/**
 *Burası Çok Önemli!!
 * static verileri çekerken bunları kısaltmak adına
 * Properties.PREFIX --> yerine static değer içeren sınıfı
 * static olarak import ederiz ve içindeki değerlere ulaşırız.
 */

import static com.oguzhan.utility.StaticValues.getPrs_siraNo;
import com.oguzhan.constants.Properties.*;

public class Personel {
    /**
     * Kimlik -->
     */
    private String id;
    private String siraNo;
    String ad;
    String soyad;
    String adres;
    String telefon;
    int yas;
    /**
     * Durum --> 0-pasif, 1-aktif, 2-izinde
     */
    // Enum --> Numaralandırma
    int state;

    public Personel(){
        // Otamatik ID verecek...
        this.id = UUID.randomUUID().toString();
        this.siraNo = Properties.PREFIX + StaticValues.getPrs_siraNo();
    }

    // Getter-Setter Methods...

    public String getSiraNo(){
        return this.siraNo;
    }

    public String getId(){
        return this.id;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
