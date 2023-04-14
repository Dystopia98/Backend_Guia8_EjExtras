package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        NIF X = new NIF();
        System.out.print("D.N.I(sin puntos) : ");
        X.setLetra(leer.next());
        X.setDni(Integer.parseInt(X.getLetra()));
        return new NIF(X.getDni(), X.getLetra());
    }
    public void Mostrar(NIF n){
        String Letra = n.getLetra();
        String[] Array = new String[23];
        for (int i = 0; i < 23; i++) {
            switch(i){
                case 0:
                Array[i] = "T";
                break;
            case 1:
                Array[i] = "R";
                break;
            case 2:
                Array[i] = "W";
                break;
            case 3:
                Array[i] = "A";
                break;
            case 4:
                Array[i] = "G";
                break;
            case 5:
                Array[i] = "M";
                break;
            case 6:
                Array[i] = "Y";
                break;
            case 7:
                Array[i] = "F";
                break;
            case 8:
                Array[i] = "P";
                break;
            case 9:
                Array[i] = "D";
                break;
            case 10:
                Array[i] = "X";
                break;
            case 11:
                Array[i] = "B";
                break;
            case 12:
                Array[i] = "N";
                break;
            case 13:
                Array[i] = "J";
                break;
            case 14:
                Array[i] = "Z";
                break;
            case 15:
                Array[i] = "S";
                break;
            case 16:
                Array[i] = "Q";
                break;
            case 17:
                Array[i] = "V";
                break;
            case 18:
                Array[i] = "H";
                break;
            case 19:
                Array[i] = "L";
                break;
            case 20:
                Array[i] = "C";
                break;
            case 21:
                Array[i] = "K";
                break;
            case 22 :
                Array[i] = "E";
                break;
            }
        }
        for (int i = 0; i < 22; i++) {
            n.setLetra(Array[(n.getDni()%23)]);
        }
        System.out.println(Letra+"-"+n.getLetra());
    }
}
