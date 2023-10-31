package org.example;

public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private Boolean ligado;
    private Integer velocidadeAtual;
    private Integer velocidadeMaxima;

    public Carro() {
        this.ligado = false;
        this.velocidadeAtual=0;
    } public Carro(Integer velocidadeMaxima) {
        this.ligado = false;
        this.velocidadeAtual=0;
        this.velocidadeMaxima=velocidadeMaxima;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    //metodos
    public void acelerar(Integer valorAcelerado) {
        if((velocidadeAtual+=valorAcelerado)>=velocidadeMaxima)
        {
            velocidadeAtual=velocidadeMaxima;
        }else {
            velocidadeAtual=+valorAcelerado;
        }
    }public void freiar(Integer valorAcelerado) {
        if((velocidadeAtual=-valorAcelerado)<0)
        {
            velocidadeAtual=0;
        }else {
            velocidadeAtual=-valorAcelerado;
        }
    }

    public void ligar(){
        this.ligado=true;
    }
    public void desligar(){
        this.ligado=false;
    }


}
