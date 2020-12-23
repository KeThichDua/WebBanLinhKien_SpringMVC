/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.SanPham;

/**
 *
 * @author Administrator
 */
public interface SanPhamDao {
    // create
    public boolean create(SanPham object);

    // update
    public boolean update(SanPham object);

    // delete
    public boolean delete(SanPham object);

    // find by id
    public SanPham findById(long productId);

    // load list product by LoaiSP
    public List<SanPham> getListByCategory(long LoaiSPId);

    // load list product by LoaiSP and limit
    public List<SanPham> getListByCategoryAndLimit(long LoaiSPId, int limit);


}
