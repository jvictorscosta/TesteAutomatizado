package org.atividade1.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @BeforeEach
    void paragrafo() {
        System.out.println("Iniciando novo Teste");
    }

    @Test
    public void deveCriarUmCarroComTodosOsCampos() {
        // public Carro(String cor, String marca, String modelo, Integer velocidadeMaxima)
        Carro carro = new Carro("Prata", "Tesla", "S", 350);

        assertAll("Testando atributos do carro",
                () -> assertEquals("Prata", carro.getCor()),
                () -> assertEquals("Tesla", carro.getMarca()),
                () -> assertEquals("S", carro.getModelo()),
                () -> assertEquals(350, carro.getVelocidadeMaxima()),
                ()-> assertEquals(true,carro.getTrancado())
        );
    }
    @Test
    void deveIniciarComVelocidadeZero(){
        //Given
        Carro carro = new Carro("Azul", "VW","Fusca",100);
        //When
        //Then
        assertEquals(carro.getVelocidadeAtual(),0);
    }
    @Test
    void deveLigarCorretamente() {
        //Given
        Carro carro = new Carro("Azul", "VW","Fusca",100);
        //When
        carro.ligar();
        //Then
        assertTrue(carro.getLigado());
    }
    @Test
    void deveDestrancarCorretamente(){
        //Given
        Carro carro = new Carro();
        //When
        carro.destrancar();
        //Then
        assertEquals(Boolean.FALSE,carro.getTrancado());
    }


    @Test
    void devetrancarCorretamente() {
        //Given
        Carro carro = new Carro();
        carro.destrancar();
        //When
        carro.trancar();
        //Then
        assertEquals(Boolean.TRUE,carro.getTrancado());
    }
    @Test
    void deveDesligarCorretamente() {
        //Given
        Carro carro = new Carro();
        carro.ligar();
        //When
        carro.desligar();
        //Then
        assertEquals(Boolean.FALSE,carro.getLigado());
    }

    @Test
    public void deveAcelerarCorretamente() throws Exception {
        // Given
        Carro carro = new Carro();

        // When
        carro.ligar();
        carro.acelerar(10);
        carro.acelerar(30);

        // Then
        assertEquals(40, carro.getVelocidadeAtual());
    }
    @Test
    public void naoDeveUltrapassarAVelocidadeMaxima() throws Exception {
        // Given
        Carro carro = new Carro(250);

        // When
        carro.ligar();
        carro.acelerar(100);
        carro.acelerar(100);
        carro.acelerar(100);

        // Then
        assertEquals(250, carro.getVelocidadeAtual());
    }
    @Test
    public void deveLancarExceptionEmCasoDeAceleracaoNegativa() {
        Carro carro = new Carro();
        carro.ligar();

        Throwable throwable =                               // runnable
                Assertions.assertThrows(Exception.class, () -> carro.acelerar(-10));

        Assertions.assertEquals("A aceleracao não pode ser menor que zero!", throwable.getMessage());
    }
    @Test
    void DeveFrearCorretamente() throws Exception {
        // Given
        Carro carro = new Carro();
        carro.getLigado();
        carro.acelerar(100);

        // When
        carro.frear(50);
        carro.frear(20);

        // Then
        assertEquals(30, carro.getVelocidadeAtual());

    }
    @Test
    public void naoDeveTerVelocidadeInferiorAZero() throws Exception {

        // Given
        Carro carro = new Carro();
        carro.getLigado();
        carro.acelerar(100);

        // When
        carro.frear(50);
        carro.frear(51);

        // Then
        assertEquals(0, carro.getVelocidadeAtual());
    }
    @Test
    void deveDiferenciarCarros() {
        //Given
        Carro carroT = new Carro("Prata", "Tesla", "S", 350);
        Carro carroB = new Carro("Preto", "BMW", "X1", 350);
        //When

        //Then
        assertFalse(carroT.equals(carroB));
    }
}