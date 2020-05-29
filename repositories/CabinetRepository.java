package repositories;

import model.Cabinet;

import java.util.Arrays;

public class CabinetRepository
{
    private Cabinet[] cabinete = new Cabinet[50];
    private int nCabinete;

    public CabinetRepository()
    {
        cabinete[0] = new Cabinet(0, "familie", Arrays.asList("Ana Nastase 0", "cineva", "altcineva"),
                "Str. Undeva nr. 1, Bucuresti");
        cabinete[1] = new Cabinet(1, "oftalmologie", Arrays.asList("Ion Ionescu 1", "cineva1"),
                "Str. Undeva nr. 2, Bucuresti");
    }

    public int getnCabinete() {return nCabinete;}
    public void setnCabinete(int nCabinete) {this.nCabinete = nCabinete;}

    public void addCabinet(Cabinet cabinet)
    {
        try
        {
            cabinete[nCabinete] = cabinet;
            nCabinete++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de cabinete ce pot fi retinute.");
        }
    }

    public Cabinet[] getCabinete() {return cabinete;}

    public Cabinet[] deleteCabinet(Cabinet[] cabinete, int id) //sterge dupa id
    {
        if(cabinete == null || id > cabinete.length)
        {
            System.out.println("Nu avem ce sterge.");
            return cabinete;
        }
        else
        {
            Cabinet[] proxyCabinete = new Cabinet[cabinete.length - 1];
            for (int i = 0, k = 0; i < cabinete.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyCabinete[k++] = cabinete[i];
                }
            }
            return proxyCabinete;
        }
    }

    public Cabinet findCabinet(int idCabinet) //cauta dupa id
    {
        for(Cabinet c : cabinete)
        {
            if(c != null)
            {
                if(idCabinet == c.getId())
                {
                    return c;
                }
            }
        }
        return null;
    }
}
