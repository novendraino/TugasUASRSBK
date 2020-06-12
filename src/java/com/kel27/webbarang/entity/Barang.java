/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kel27.webbarang.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author LENOVO
 */
@Entity
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotEmpty(message = "No. Identitas tidak boleh kosong")
    private String id;
    
    @NotEmpty(message = "Nama tidak boleh kosong")
    private String nama;
    
    @Size(max = 50, message = "Jenis Kelamin tidak boleh lebih dari 50 karakter")
    private String kategori;
    
    private String harga;
    
    @NotEmpty(message = "Kondisi kesehatan tidak boleh kosong")
    private String stok;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kel27.webbarang.entity.Barang[ id=" + getId() + " ]";
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }

    /**
     * @return the stok
     */
    public String getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(String stok) {
        this.stok = stok;
    }
    
}
