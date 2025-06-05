package resolucaoTela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
    public static void main(String[] args) {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int) screensize.getWidth();
        int altura = (int) screensize.getHeight();
        
        System.out.printf("Resolucao da tela: %d x %d \n", largura, altura);
    }
}
