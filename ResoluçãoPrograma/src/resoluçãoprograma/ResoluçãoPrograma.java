package resoluçãoprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoPrograma {
    public static void main(String[] args) {
        Dimension r = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução do programa é: "+r.width+" X "+r.height);       
    }
}