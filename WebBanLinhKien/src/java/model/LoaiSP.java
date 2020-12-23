/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Administrator
 */
@Entity(name="LoaiSP")
public class LoaiSP implements Serializable{
//    MaLoaiSP, TenLoai, MoTa, URLAnh
    @Id
    @GeneratedValue
    public long MaLoaiSP;
    public String TenLoai;
    public String MoTa;
    public String URLAnh;
    @OneToMany(fetch= FetchType.LAZY)
    @JoinColumn(name = "MaLoaiSP")
    public List<SanPham> ListSanPham;
    
//    public String GetTenLoai(){
//        return TenLoai;
//    }
}
