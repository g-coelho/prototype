import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompetidorTest {

    @Test
    void testeClone() throws CloneNotSupportedException{
        Competidor competidor = new Competidor("Jonathan Dwight Jones ",
                "Gaidojutsu", "Jiujutsu",
                113F, 193F,
                new Cartel(29, 27, 1));

        Competidor competidorClone = competidor.clone();
        competidorClone.setNome("LUTADOR CLONE");
        competidorClone.getCartel().setTotalDerrotas(0);

        assertEquals("Competidor{nome='Jonathan Dwight Jones ', arteMarcialPrincipal='Gaidojutsu', arteMarcialSecundaria='Jiujutsu', peso=113.0, altura=193.0, cartel=Cartel{totalLutas=29, totalVitorias=27, totalDerrotas=1}}", competidor.toString());
        assertEquals("Competidor{nome='LUTADOR CLONE', arteMarcialPrincipal='Gaidojutsu', arteMarcialSecundaria='Jiujutsu', peso=113.0, altura=193.0, cartel=Cartel{totalLutas=29, totalVitorias=27, totalDerrotas=0}}", competidorClone.toString());
    }

}
