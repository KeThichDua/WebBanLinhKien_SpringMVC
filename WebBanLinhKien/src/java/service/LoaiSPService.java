/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.LoaiSP;

/**
 *
 * @author Administrator
 */
public interface LoaiSPService {

    // create
    public boolean create(LoaiSP object);

    // update
    public boolean update(LoaiSP object);

    // delete
    public boolean delete(LoaiSP object);

    // find by id
    public LoaiSP findById(int MaLoaiSP);

    // load list LoaiSP
    public List<LoaiSP> getAll();

}
