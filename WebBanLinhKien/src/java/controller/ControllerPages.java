/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.LoaiSPService;
import service.SanPhamService;
import java.text.Normalizer;
import java.util.regex.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping(value = "/index.htm")
public class ControllerPages {

    @Autowired
    public LoaiSPService LoaiSPService;
    @Autowired
    public SanPhamService SanPhamService;

    @RequestMapping(method = RequestMethod.GET)
    public String viewHome(ModelMap mm) {
        System.out.println("fuck you");
        mm.put("ListLoaiSP", LoaiSPService.getAll());
        mm.put("ListSP", SanPhamService.getListByCategory(1));
        return "jsp/index";
    }

}
