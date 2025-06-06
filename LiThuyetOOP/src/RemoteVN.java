/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class RemoteVN implements Remote{

    @Override
    public void next() {
        System.out.println("Chuyển Kênh");
    }

    @Override
    public void volumeUp() {
        System.out.println("Tăng Âm Lượng");
    }

    @Override
    public void volumeDown() {
        System.out.println("Giảm Âm Lượng");
    }
    
}
