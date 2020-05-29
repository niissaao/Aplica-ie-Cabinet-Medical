package service;

import model.Afectiune;
import model.Pacient;

public class Diagnostic
{
    public String puneDiagnostic (Pacient pacient, Afectiune[] afectiuni)
    {
        for(Afectiune a : afectiuni)
        {
            for(String sa : a.getSimptome())
            {
                int k = 0;
                for (String s : pacient.getSimptome()) {
                    if (s.equals(sa))
                    {
                        k++;
                    }
                }
                if(k == 3)
                {
                    pacient.setDiagnostic(a.getDenumire());
                }
            }
        }
        return pacient.getDiagnostic();
    }
}