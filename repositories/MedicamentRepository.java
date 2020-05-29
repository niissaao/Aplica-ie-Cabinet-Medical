package repositories;

import model.Medicament;

import java.util.Arrays;
import java.util.Collections;

public class MedicamentRepository
{
    private Medicament[] medicamente = new Medicament[1000];
    private int nMedicamente;

    public MedicamentRepository()
    {
        medicamente[0] = new Medicament(0, "Paracetamol 500mg", 3.5, Arrays.asList("febra",
                "dureri de cap", "dureri de articulatii", "dureri de spate", "dureri dentare",
                "dureri menstruale"));
        medicamente[1] = new Medicament(1, "AntiTusiv", 18.65,
                Collections.singletonList("tuse seaca"));
    }

    public int getnMedicamente() {return nMedicamente;}
    public void setnMedicamente(int nMedicamente) {this.nMedicamente = nMedicamente;}

    public void addMedicament(Medicament medicament)
    {
        try
        {
            medicamente[nMedicamente] = medicament;
            nMedicamente++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de medicamente ce pot fi retinute.");
        }
    }

    public Medicament[] getMedicamente() {return medicamente;}

    public Medicament[] deleteMedicament(Medicament[] medicamente, int id) //sterge dupa id
    {
        if(medicamente == null || id > medicamente.length)
        {
            System.out.println("Nu avem ce sterge.");
            return medicamente;
        }
        else
        {
            Medicament[] proxyMedicamente = new Medicament[medicamente.length - 1];
            for (int i = 0, k = 0; i < medicamente.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyMedicamente[k++] = medicamente[i];
                }
            }
            return proxyMedicamente;
        }
    }
}
