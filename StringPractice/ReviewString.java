/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPractice;

/**
 *
 * @author Lenovo
 */
public class ReviewString {
    public static void main(String[] args) {
        playWithCharacters();
    }
    
    public static void playWithCharacters() {
        // 2 byte cho kiểu char, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        // tên thì sao? C: mảng các kí tự, ko primitive, phức tạp
        //              Char name[] = "Ahihi";
        
        String name = "Hoàng Ngọc Trinh"; //loại data type mới hoàn toàn
                                          //phức tạp, do gom n thứ khác
                                          //object data type, học sớm
        System.out.println("My name is: " + name);
        System.out.println("1st letter of my name: " + name.charAt(0));
        System.out.println("my name as in a lowercase: " + name.toLowerCase()); 
    }
}
