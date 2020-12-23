/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.SanPhamDao;
import model.SanPham;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SanPhamServiceImpl implements SanPhamService{
    @Autowired
    private SanPhamDao productDAO;

    @Override
    public boolean create(SanPham object) {
        return productDAO.create(object);
    }

    @Override
    public boolean update(SanPham object) {
        return productDAO.update(object);
    }

    @Override
    public boolean delete(SanPham object) {
        return productDAO.delete(object);
    }

    @Override
    public SanPham findById(long categoryId) {
        return productDAO.findById(categoryId);
    }

    @Override
    public List<SanPham> getListByCategory(long categoryId) {
        return productDAO.getListByCategory(categoryId);
    }


}
