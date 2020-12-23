/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Administrator
 */
@Entity(name = "sanpham")
public class SanPham implements Serializable{
    @Id
    @GeneratedValue
    public long MaSP;
    @ManyToOne
    @JoinColumn(name = "MaLoaiSP")
    public String TenSP;    
    public long SoLuong;
    public long DonGia;
    public String MoTa;
    public long GiaKm;
    public String URLAnh;
    public long MaLoaiSP;
            
            
//            MaSP, TenSP, SoLuong, DonGia, MoTa, GiaKm, URLAnh, MaLoaiSP
}
