/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kel27.webbarang.service;

import com.kel27.webbarang.entity.Barang;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author LENOVO
 */
@Stateless
public class BarangFacade extends AbstractFacade<Barang> {

    @PersistenceContext(unitName = "WebBarangPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BarangFacade() {
        super(Barang.class);
    }
    
}
