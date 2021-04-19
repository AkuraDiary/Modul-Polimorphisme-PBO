/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //https://www.geogebra.org/m/VqHK8xnd
        //create Line Object
        Line dora = new Line(1, -3, 5, 5);
        Line masha = new Line(6, 6, -1, 3);
        
        System.out.println("Panjang garis dora : " + dora.getLength());
        System.out.println("Panjang garis masha : " + masha.getLength());
        
        if(masha.isGreater(masha, dora)){
            System.out.println("garis masha lebih panjang dari dora");
        }else if(masha.isLess(masha, dora)){
            System.out.println("garis masha lebih pendek dari dora");
        }else if(masha.isEquals(masha, dora)){
            System.out.println("garis masha sama panjang dengan dora");
        }
    }
    
}
