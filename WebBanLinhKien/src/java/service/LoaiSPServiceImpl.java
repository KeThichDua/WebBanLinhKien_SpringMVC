/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import dao.LoaiSPDao;
import java.util.List;
import model.LoaiSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class LoaiSPServiceImpl implements LoaiSPService {

    @Autowired
    public LoaiSPDao LoaiSPDao;

    @Override
    public boolean create(LoaiSP object) {
        return LoaiSPDao.create(object);
    }

    @Override
    public boolean update(LoaiSP object) {
        return LoaiSPDao.update(object);
    }

    @Override
    public boolean delete(LoaiSP object) {
        return LoaiSPDao.delete(object);
    }

    @Override
    public LoaiSP findById(int MaLoaiSP) {
        return LoaiSPDao.findById(MaLoaiSP);
    }

    @Override
    public List<LoaiSP> getAll() {
        return LoaiSPDao.getAll();
    }

}