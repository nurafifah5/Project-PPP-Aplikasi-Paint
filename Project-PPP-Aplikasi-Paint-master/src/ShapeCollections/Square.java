/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeCollections;
import aplikasipaint.ShapeCollection;

/**
 *
 * @author Gerwin Jo
 */
public class Square implements ShapeCollection {
    
    static int kotak = 0;

    @Override
    public String shape(String shape) {
        return "Kotak telah dibuat.";
    }

    @Override
    public int hitungShape() {
        return kotak++;
    }

    @Override
    public String infoShape() {
        return "Anda telah membuat kotak";
    }
    
    
    
}
