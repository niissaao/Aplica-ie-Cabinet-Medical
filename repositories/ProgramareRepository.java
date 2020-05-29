package repositories;

import model.Programare;

public class ProgramareRepository
{
    private Programare[] programari = new Programare[1000];
    private int nProgramari;

    public ProgramareRepository(){}

    public int getnProgramari() {return nProgramari;}
    public void setnProgramari(int nProgramari) {this.nProgramari = nProgramari;}

    public void addProgramare(Programare programare)
    {
        try
        {
            programari[nProgramari] = programare;
            nProgramari++;
        }
        catch(Exception e)
        {
            System.out.println("S-a atins numarul maxim de programari ce pot fi retinute.");
        }
    }

    public Programare[] getProgramari() {return programari;}

    public Programare[] deleteProgramare(Programare[] programari, int id) //sterge dupa id
    {
        if(programari == null || id > programari.length)
        {
            System.out.println("Nu avem ce sterge.");
            return programari;
        }
        else
        {
            Programare[] proxyProgramari = new Programare[programari.length - 1];
            for (int i = 0, k = 0; i < programari.length; i++)
            {
                if (i == id)
                {
                    continue;
                }
                else
                {
                    proxyProgramari[k++] = programari[i];
                }
            }
            return proxyProgramari;
        }
    }
}
