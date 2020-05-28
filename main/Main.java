package main;

import model.Afectiune;
import model.Medic;
import model.Medicament;
import model.Pacient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Pacient pacient1 = new Pacient();
        pacient1.setId(1);
        pacient1.setParola("parola1234");
        pacient1.setEmail("horia.ionescu@pacient.ro");
        pacient1.setNume("Ionescu");
        pacient1.setPrenume("Horia");
        pacient1.setGen("M");
        pacient1.setVarsta(30);
        pacient1.setNumarTeledon("0712345678");
        pacient1.setStatut("salariat");
        pacient1.setSimptome(Arrays.asList(new String[]{"febra", "tuse seaca"}));
        pacient1.setAlte_Afectiuni(Arrays.asList(new String[]{"astm"}));

        Pacient pacient2 = new Pacient();
        pacient2.setId(2);
        pacient2.setParola("parola1234");
        pacient2.setEmail("alina.nuc@pacient.ro");
        pacient1.setNume("Nuc");
        pacient1.setPrenume("Alina");
        pacient1.setGen("F");
        pacient1.setVarsta(15);
        pacient1.setNumarTeledon("0723456789");
        pacient1.setStatut("elev");
        pacient1.setSimptome(Arrays.asList(new String[]{"dureri de cap", "greata"}));
        pacient1.setAlte_Afectiuni(Arrays.asList(new String[]{"miopie"}));

        
    }
}