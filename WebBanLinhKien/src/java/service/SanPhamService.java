/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.SanPham;
import java.util.List;

public interface SanPhamService {
    // create
    public boolean create(SanPham object);

    // update
    public boolean update(SanPham object);

    // delete
    public boolean delete(SanPham object);

    // find by id
    public SanPham findById(long productId);

    // load list product by category
    public List<SanPham> getListByCategory(long categoryId);

}
