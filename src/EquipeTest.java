import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipeTest {

    PartidaDeVolei partida;
    Equipe equipe1;
    Equipe equipe2;

    @BeforeEach
    public void setUp(){
        //Arrange
        equipe1 = new Equipe("Equipe1");
        equipe2 = new Equipe("Equipe2");
        partida = new PartidaDeVolei(equipe1, equipe2);
    }
    
    @Test 
    void registraPartidaCorretamente(){
        //Act
        int quantidade = equipe1.registrarPartida(partida);
        //Assert
        assertEquals(1, quantidade);
    }

    @Test
    void calculaAproveitamentoTotalCorretamente() {
        //Arrange
        partida.registrarPlacarSet(25, 20);
        partida.registrarPlacarSet(25, 20);
        partida.registrarPlacarSet(25, 20);
        equipe1.registrarPartida(partida);
        
        //Act
        double aproveitamento = equipe1.aproveitamentoTotal();
        //Assert
        assertEquals(Double.MAX_VALUE, aproveitamento, 0.01);
    }

    @Test
    void calculaAproveitamentoSetsCorretamente() {
        //TODO
    }   
}