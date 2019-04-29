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

public class Circle implements ShapeCollection {
    
    static int lingkaran = 0;

    @Override
    public String shape(String shape) {
        return "Lingkaran telah dibuat.";
    }

    @Override
    public int hitungShape() {
        return lingkaran++;
    }

    @Override
    public String infoShape() {
        return "Anda telah membuat lingkaran";
    }
    
}
