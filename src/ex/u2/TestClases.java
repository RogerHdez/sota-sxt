/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.u2;

/**
 *
 * @author josef
 */
public class TestClases {

    public static void main(String... a) {

        Canasta[] canasta = new Canasta[3];

        Fruta[] manzanas = new Fruta[2];
        Fruta[] peras = new Fruta[2];
        Fruta[] uvas = new Fruta[3];

        Fruta manzana1 = new Fruta("Manzana X", Color.AMARILLA, Tamanio.CHICA);
        Fruta manzana2 = new Fruta("Manzana Y", Color.ROJA, Tamanio.CHICA);

        Fruta pera1 = new Fruta("Pera T", Color.getRandomTamanio(), Tamanio.getRandomTamanio());
        Fruta pera2 = new Fruta("Pera W", Color.VERDE, Tamanio.CHICA);

        Fruta uvas1 = new Fruta("Uva G", Color.getRandomTamanio(), Tamanio.getRandomTamanio());
        Fruta uvas2 = new Fruta("Uva J", Color.getRandomTamanio(), Tamanio.getRandomTamanio());
        Fruta uvas3 = new Fruta("Uva M", Color.getRandomTamanio(), Tamanio.getRandomTamanio());
        
        manzanas[0] = manzana1;
        manzanas[1] = manzana2;
        
        peras[0] = pera1;
        peras[1] = pera2;
        
        uvas[0] = uvas1;
        uvas[1] = uvas2;
        uvas[2] = uvas3;
        
        Canasta cm = new Canasta("Canasta de manzanas", manzanas);
        Canasta cp = new Canasta("Canasta de peras", peras);
        Canasta cu = new Canasta("Canasta de uvas", uvas);
        
        canasta[0] =  cm;
        canasta[1] =  cp;
        canasta[2] =  cu;
                
        for(Canasta c : canasta){
            
            System.out.println(c.getNombre()+ " tiene " + c.getNumeroFruta() + " frutas");
            
            for(Fruta f : c.getFrutas()){
                System.out.println(f.getNombre() +", color: " + f.getColor() + ", de tamaño " + 
                        f.getTamanio());
            }
            
            System.out.println("");
        }
        
    }

}
