package repositories;

import model.Pacient;

import java.util.Arrays;
import java.util.Collections;

public class PacientRepository
{
    private Pacient[] pacienti = new Pacient[10000];
    private int nPacienti;

    public PacientRepository()
    {
        pacienti[0] = new Pacient(0, "parola1234", "horia.ionescu@pacient.ro", "Ionescu",
                "Horia", "M", 30, "0712345678", "salariat",
                Arrays.asList("febra", "tuse seaca"), Collections.singletonList("astm"), "");
        pacienti[1] = new Pacient(1, "parola1234", "alina.nuc@pacient.ro", "Nuc",
                "Alina", "F", 15, "0723456789", "elev",
                Arrays.asList("dureri de cap", "febra"), Collections.singletonList("miopie"), "");
    }

    public int getnPacienti() {return nPacienti;}
    public void setnPacienti(int nPacienti) {this.nPacienti = nPacienti;}

    public void addPacient(Pacient pacient)
    {
        try
        {
            pacienti[nPacienti] = pacient;
            nPacienti++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de pacienti ce pot fi retinuti.");
        }
    }

    public Pacient[] getPacienti() {return pacienti;}

    public Pacient[] deletePacient(Pacient[] pacienti, int id) //sterge dupa id
    {
        if(pacienti == null || id > pacienti.length)
        {
            System.out.println("Nu avem ce sterge.");
            return pacienti;
        }
        else
        {
            Pacient[] proxyPacienti = new Pacient[pacienti.length - 1];
            for (int i = 0, k = 0; i < pacienti.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyPacienti[k++] = pacienti[i];
                }
            }
            return proxyPacienti;
        }
    }

    public Pacient findPacient(String numePacient, String prenumePacient) //cauta dupa nume
    {
        for(Pacient p : pacienti)
        {
            if(p != null)
            {
                if(numePacient.equals(p.getNume()) && prenumePacient.equals(p.getPrenume()))
                {
                    return p;
                }
            }
        }
        return null;
    }
}
