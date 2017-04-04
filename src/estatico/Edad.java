/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

import java.util.Random;

/**
 *
 * @author josef
 */
public class Edad {

    public final static int ADOLESCENTE = 16;
    public final static int ADULTO_MAYOR = 60;
    public final static int NINIO = 9;
    public final static int BEBE = 1;
    public final static int POST_ADOLESCENTE = 20;
    public final static int ADULTO = 30;
    public final static int PRE_ADOLESCENTE = 13;
    public final static int SENIOR = 40;
    public final static int TREINTONA = 35;

    /**Metodo que retorna una edad Random
     * @return edad random */
    public static int edadRandom() {
        switch (new Random().nextInt(9)) {//es 9 por que el random asi solo alcanza hasta el 8 y entra en default
            case 0:
                return ADOLESCENTE;
            case 1:
                return ADULTO_MAYOR;
            case 2:
                return NINIO;
            case 3:
                return BEBE;
            case 4:
                return POST_ADOLESCENTE;
            case 5:
                return ADULTO;
            case 6:
                return PRE_ADOLESCENTE;
            case 7:
                return SENIOR;
            default:
                return TREINTONA;
        }
    }
}
