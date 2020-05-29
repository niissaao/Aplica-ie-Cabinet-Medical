package repositories;

import model.Reteta;

public class RetetaRepository
{
    private Reteta[] retete = new Reteta[10000];
    private int nRetete;

    public RetetaRepository() {}

    public int getnRetete() {return nRetete;}
    public void setnRetete(int nRetete) {this.nRetete = nRetete;}

    public void addReteta(Reteta reteta)
    {
        try
        {
            retete[nRetete] = reteta;
            nRetete++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de retete ce pot fi retinute.");
        }
    }

    public Reteta[] getRetete() {return retete;}

    public Reteta[] deleteReteta(Reteta[] retete, int id) //sterge dupa id
    {
        if(retete == null || id > retete.length)
        {
            System.out.println("Nu avem ce sterge.");
            return retete;
        }
        else
        {
            Reteta[] proxyRetete = new Reteta[retete.length - 1];
            for (int i = 0, k = 0; i < retete.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyRetete[k++] = retete[i];
                }
            }
            return proxyRetete;
        }
    }
}
