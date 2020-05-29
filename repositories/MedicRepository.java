package repositories;

import model.Medic;

public class MedicRepository
{
    private Medic[] medici = new Medic[150];
    private int nMedici;

    public MedicRepository()
    {
        medici[0] = new Medic(0, "parola1234", "ana.nastase@medic.ro", "Nastase",
                "Ana", "F", 44, "0734567891", "familie");
        medici[1] = new Medic(1, "parola1234", "ion.ionescu@medic.ro", "Ionescu",
                "Ion", "M", 37, "0734567899", "oftalmologie");
    }

    public int getnMedici() {return nMedici;}
    public void setnMedici(int nMedici) {this.nMedici = nMedici;}

    public void addMedic(Medic medic)
    {
        try
        {
            medici[nMedici] = medic;
            nMedici++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de medici ce pot fi retinuti.");
        }
    }

    public Medic[] getMedici() {return medici;}

    public Medic[] deleteMedic(Medic[] medici, int id) //sterge dupa id
    {
        if(medici == null || id > medici.length)
        {
            System.out.println("Nu avem ce sterge.");
            return medici;
        }
        else
        {
            Medic[] proxyMedici = new Medic[medici.length - 1];
            for (int i = 0, k = 0; i < medici.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyMedici[k++] = medici[i];
                }
            }
            return proxyMedici;
        }
    }
}
