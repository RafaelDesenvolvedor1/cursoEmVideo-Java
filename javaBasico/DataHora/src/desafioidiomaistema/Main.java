package desafioidiomaistema;

import java.util.Locale;

public class Main {
    public static void main(String [] args){
        //Locale idiomaSistema = new Locale();
        Locale localidade = Locale.getDefault();
        String idioma = localidade.getDisplayLanguage();
        
        //System.out.println(idioma);
        System.out.printf("Seu sistema esta em %s \n", idioma);
    }
} 
