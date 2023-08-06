package org.example;

import org.junit.Assert;
import org.junit.Test;

public class BaiTapTinhLuong {
    public static float tienCong(int ngayCong, float luongMotNgay){
        return ngayCong*luongMotNgay;
    }
    NhanSu user1 = new NhanSu("Pham Van Thai", "ke toan", "Ca");
    Luong luongUser1 = new Luong(200, 0);
    NgayCong ngayCongUser1 = new NgayCong(22);
    float luongThang8 = tienCong(ngayCongUser1.getSoNgayLamViecThucTe(), luongUser1.getTienLuongTheoCa());

    @Test
    public void Caculate_Luong_Thang8_Correctly(){
        System.out.println(luongThang8);
        Assert.assertEquals(4400,luongThang8,1.0);
    }
    @Test
    public void Caculate_Luong_Thang8_InCorrectly(){
        System.out.println(luongThang8);
        Assert.assertEquals(300,luongThang8,1.0);
    }
}
