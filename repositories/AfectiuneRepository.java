package repositories;

import model.Afectiune;

import java.util.Arrays;

public class AfectiuneRepository
{
    private Afectiune[] afectiuni = new Afectiune[500];
    private int nAfectiuni;

    public AfectiuneRepository()
    {
        afectiuni[0] = new Afectiune(0, "raceala", Arrays.asList("secretii nazale", "nas infundat",
                "dureri de gat", "stranut", "tuse"), Arrays.asList("ceva1", "ceva2"));
        afectiuni[1] = new Afectiune(1, "gripa", Arrays.asList("dureri musculare", "frisoane",
                "transpiratie abundenta", "oboseala", "tuse seaca"), Arrays.asList("AntiTusiv", "ceva",
                "altceva"));
    }

    public int getnAfectiuni() {return nAfectiuni;}
    public void setnAfectiuni(int nAfectiuni) {this.nAfectiuni = nAfectiuni;}

    public void addAfectiune(Afectiune afectiune)
    {
        try
        {
            afectiuni[nAfectiuni] = afectiune;
            nAfectiuni++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de afectiuni ce pot fi retinute.");
        }
    }

    public Afectiune[] getAfectiuni() {return afectiuni;}

    public Afectiune[] deleteAfectiune(Afectiune[] afectiuni, int id) //sterge dupa id
    {
        if(afectiuni == null || id > afectiuni.length)
        {
            System.out.println("Nu avem ce sterge.");
            return afectiuni;
        }
        else
        {
            Afectiune[] proxyAfectiuni = new Afectiune[afectiuni.length - 1];
            for (int i = 0, k = 0; i <afectiuni.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyAfectiuni[k++] = afectiuni[i];
                }
            }
            return proxyAfectiuni;
        }
    }

    public Afectiune findAfectiune(String denumireAfectiune) //cauta dupa denumire
    {
        for(Afectiune a : afectiuni)
        {
            if(a != null)
            {
                if(denumireAfectiune.equals(a.getDenumire()))
                {
                    return a;
                }
            }
        }
        return null;
    }
}