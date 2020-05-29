package main;

import model.*;
import repositories.*;
import service.*;

import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main
{
    public static void main(String[] args)
    {
        Afectiune[] afectiuni = new Afectiune[500];
        afectiuni[0] = new Afectiune(0, "raceala", Arrays.asList("secretii nazale", "nas infundat",
                "dureri de gat", "stranut", "tuse"), Arrays.asList("ceva1", "ceva2"));
        afectiuni[1] = new Afectiune(1, "gripa", Arrays.asList("dureri musculare", "frisoane",
                "transpiratie abundenta", "oboseala", "tuse seaca"), Arrays.asList("AntiTusiv", "ceva",
                "altceva"));

        Cabinet[] cabinete = new Cabinet[50];
        cabinete[0] = new Cabinet(0, "familie", Arrays.asList("Ana Nastase 0", "cineva", "altcineva"),
                "Str. Undeva nr. 1, Bucuresti");
        cabinete[1] = new Cabinet(1, "oftalmologie", Arrays.asList("Ion Ionescu 1", "cineva1"),
                "Str. Undeva nr. 2, Bucuresti");

        Medicament[] medicamente = new Medicament[1000];
        medicamente[0] = new Medicament(0, "Paracetamol 500mg", 3.5, Arrays.asList("febra",
                "dureri de cap", "dureri de articulatii", "dureri de spate", "dureri dentare",
                "dureri menstruale"));
        medicamente[1] = new Medicament(1, "AntiTusiv", 18.65,
                Collections.singletonList("tuse seaca"));

        Medic[] medici = new Medic[150];
        medici[0] = new Medic(0, "parola1234", "ana.nastase@medic.ro", "Nastase",
                "Ana", "F", 44, "0734567891", "familie");
        medici[1] = new Medic(1, "parola1234", "ion.ionescu@medic.ro", "Ionescu",
                "Ion", "M", 37, "0734567899", "oftalmologie");

        Pacient[] pacienti = new Pacient[10000];
        pacienti[0] = new Pacient(0, "parola1234", "horia.ionescu@pacient.ro", "Ionescu",
                "Horia", "M", 30, "0712345678", "salariat",
                Arrays.asList("secretii nazale", "nas infundat", "stranut"),
                Collections.singletonList("astm"), "");
        pacienti[1] = new Pacient(1, "parola1234", "alina.nuc@pacient.ro", "Nuc",
                "Alina", "F", 15, "0723456789", "elev",
                Arrays.asList("dureri de cap", "febra"), Collections.singletonList("miopie"), "");

        Programare[] programari = new Programare[1000];

        Reteta[] retete = new Reteta[10000];

        Diagnostic diagnostic = new Diagnostic();
        //String diagn = diagnostic.puneDiagnostic(pacienti[0], afectiuni);
        //System.out.println(diagn);

        RetetaService retetaService = new RetetaService();
        //retete[0] = retetaService.puneReteta(retete[0], pacienti[0], 0);
    }
}