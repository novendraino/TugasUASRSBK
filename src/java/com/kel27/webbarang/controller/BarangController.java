/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kel27.webbarang.controller;

import com.kel27.webbarang.entity.Barang;
import com.kel27.webbarang.service.BarangFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author LENOVO
 */
@Named(value = "barangController")
@SessionScoped
public class BarangController implements Serializable {
    
    @EJB
    private BarangFacade facade;
    
    private Barang barang;
    
    public List<Barang> getDaftarBarang() {
        return facade.findAll();
    }
    
    public Barang getBarang() {
        return barang;
    }
    
    public String prepareCreate() {
        barang = new Barang();
        return "/create";
    }
    
    public String create() {
        facade.create(barang);
        return "/index";
    }
    
    public String prepareEdit(String id) {
        barang = facade.find(id);
        return "/edit";
    }
    
    public String edit() {
        facade.edit(barang);
        return "/index";
    }
    
    public String delete(String kode) {
        barang = facade.find(kode);
        facade.remove(barang);
        return "/index";
    }

    /**
     * Creates a new instance of BarangController
     */
    public BarangController() {
    }
    
}
