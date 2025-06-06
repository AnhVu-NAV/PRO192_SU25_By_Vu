/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class RemoteJP implements Remote{

    @Override
    public void next() {
        System.out.println("チャンネルを変更する");
    }

    @Override
    public void volumeUp() {
        System.out.println("音量を上げる");
    }

    @Override
    public void volumeDown() {
        System.out.println("音量を下げてください");
    }
    
}
