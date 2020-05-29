package service;

import model.Afectiune;
import model.Pacient;
import model.Reteta;
import model.Medicament;

import repositories.AfectiuneRepository;

import service.Diagnostic;

import java.util.List;

public class RetetaService
{
    Afectiune[] afectiuni = new Afectiune[500];
    Medicament[] medicamente = new Medicament[1000];

    public Reteta puneReteta(Reteta reteta, Pacient pacient, int idReteta)
    {
        reteta.setId(idReteta);
        reteta.setPacient(pacient.getNume() + " " + pacient.getPrenume());
        Diagnostic d = new Diagnostic();
        String diagnostic = d.puneDiagnostic(pacient, afectiuni);
        for (Afectiune a : afectiuni)
        {
            if (a.getDenumire().equals(diagnostic))
            {
                reteta.setMedicamente(a.getMedicamente());
            }
        }
        if(pacient.getStatut().equals("copil"))
        {
            reteta.setReducere(50);
        }
        if(pacient.getStatut().equals("elev"))
        {
            reteta.setReducere(50);
        }
        if(pacient.getStatut().equals("senior"))
        {
            reteta.setReducere(40);
        }
        if(pacient.getStatut().equals("salariat"))
        {
            reteta.setReducere(15);
        }
        double suma = 0;
        for(Medicament med : medicamente)
        {
            for (String m : reteta.getMedicamente())
            {
                if(med.getDenumire().equals(m))
                {
                    suma = suma + med.getPret();
                }
            }
        }
        double reducere = suma * reteta.getReducere();
        suma = suma - reducere;
        reteta.setPret(suma);
        return reteta;
    }
}