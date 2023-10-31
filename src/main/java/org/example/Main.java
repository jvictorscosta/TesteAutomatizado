package org.example;

public class Main {
    //grupo
    //Camila Bregalda, Lucas Vanzella, Tassio N Santos , João Victor
    public static void main(String[] args) {
//
//        Enquanto o carro estiver desligado deve ser capaz de:
//     *  - Ligar
//                *  - Mostrar estado atual (toString())
//                * Enquanto o carro estiver ligado deve ser capaz de:
//     * - Desligar
//                * - Acelerar
//                * - Frear
//                * - Motrar estado atual
//* Regras:
//     *
//     * - Só podemos realizar as ações como acelerar e frear com o carro ligado
//     * - Só podemos desligar o carro quando ele parar totalmente (velocidadeAtual = 0)
//     * - Não existe velocidade negativa
//     * - O carro não pode passar de sua velocidade máxima

        //Gherk
        //TESTE exemplo
        //Given (Dado)
        //Carro carro_teste = new Carro();
        //When(Então)
        //carro_teste.ligar();
        //Then(Então)
        //System.out.println(carro_teste.getLigado()==true);


// Teste #1 - Deve iniciar desligado
// Teste #2 - Deve iniciar com velocidade Zero
// Teste #3 - Deve ligar corretamente
// Teste #4 - Deve desligar corretamente um carro ligado
// Teste #5 - Deve acelerar corretamente um carro ligado
// Teste #6 - Deve desacelerar ate o minimo de 0.
// Teste #7 - Deve acelerar no maximo  ate a velocidade maxima
//          TESTE #1
//        //Given (Dado)
        Carro carro_01 = new Carro();
//        //When(Quando)
//        //Then(Então)
        System.out.println(carro_01.getLigado()==false);

        // TESTE #2
//        //Given (Dado)
        Carro carro_02 = new Carro();
//        //When(Quando)
//        //Then(Então)
        System.out.println(carro_01.getVelocidadeAtual()==0);

        // TESTE #3
//        //Given (Dado)
        Carro carro_03 = new Carro();
//        //When(Quando)
        carro_03.ligar();
//        //Then(Então)
        System.out.println(carro_03.getLigado()==true);

        // TESTE #4
//        //Given (Dado)
        Carro carro_04 = new Carro();
//        //When(Quando)
        if (carro_04.getVelocidadeAtual()==0){
            carro_04.desligar();
        }
//        //Then(Então)
        System.out.println(carro_04.getLigado()==false);

        // TESTE #5
//        //Given (Dado)
        Carro carro_05 = new Carro(200);
//        //When(Quando)
        carro_05.ligar();
        if (carro_05.getLigado()==true){
            carro_05.acelerar(12);
        }
//        //Then(Então)
        System.out.println(carro_05.getVelocidadeAtual()>0);

        // TESTE #6
//        //Given (Dado)
        Carro carro_06 = new Carro(200);
//        //When(Quando)
        carro_06.ligar();
        carro_06.acelerar(12);
        carro_06.freiar(15);
//        //Then(Então)
        System.out.println(carro_06.getVelocidadeAtual()==0);

    // TESTE #6
//        //Given (Dado)
        Carro carro_07 = new Carro(200);
//        //When(Quando)
        carro_07.ligar();
        carro_07.acelerar(100);
        carro_07.acelerar(150);


//        //Then(Então)
        System.out.println(carro_07.getVelocidadeAtual()==200);
    }
}