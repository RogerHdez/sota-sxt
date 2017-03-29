/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.methods;

/**
 *
 * @author josef
 */
public class TestProgramadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Programador omarcito = new Programador("omarcito", Programador.getPuestoRandom());
        Programador victor = new Programador("Victor", Programador.getPuestoRandom());
        Programador nayely = new Programador("Nayely", Programador.getPuestoRandom());
        Programador eleazar = new Programador("Ele", Programador.getPuestoRandom());
        
        Programador[] developers = {omarcito, victor, nayely, eleazar};
        
        Programadores programadores = new Programadores(developers);
        
//        Programador p = programadores.getProgramadorRandom();
        
//        System.out.println(p.getNombre() + " es especialista en: " + p.getEspecialidad());

        for(Programador p: programadores.getProgramadores()){
            System.out.println(p.getNombre() + " es especialista en " + 
                    p.getEspecialidad());
        }
        
    }
}
