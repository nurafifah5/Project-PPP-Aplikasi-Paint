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
public class Rectangle implements ShapeCollection {
    
    static int persegiPanjang = 0;

    @Override
    public String shape(String shape) {
        return "Persegi panjang telah dibuat.";
    }

    @Override
    public int hitungShape() {
        return persegiPanjang++;
    }

    @Override
    public String infoShape() {
        return "Anda telah membuat persegi panjang";
    }
    
}
