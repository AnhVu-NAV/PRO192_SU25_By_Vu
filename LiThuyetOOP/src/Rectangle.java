/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Rectangle {
    //tc1 java: tinh dong goi: encapsulation
//    phương pháp ân đi các trường dữ liệu của dối tương
//    bảo vệ dữ liệu đối tượng và dam bảo những dữ liệu không bị truy cập lung tung.
    
    
    // truong du liẹu
    private int width;
    private int height;
    
    //access modifioer: 4 loai
//    public: moi noi trong src code
//    protected: cung package va cung subclass
//    private: trong lop chua no
//    default: cung package
    
    //phuong thuc khoi tao (constructors)
    public Rectangle(){
        
    }
    
    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    
    //overloading: cac phuoc thuc trung ten voi nhau nhung khac dau vao (ghi chong phuong thuc)
    //geter, setter
    public int getWidth(){
        return this.width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    // method (phuong thuc)
    public int perimeter(){
        return (width + height)*2;
    }
    
    public int area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }
    
    
}
