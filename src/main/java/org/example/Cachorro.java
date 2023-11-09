package org.example;


import java.util.Objects;

public class Cachorro {

    private String nome;
    private String genero;
    private int idade;
    private double peso;
    private Boolean sentado;
    private String humor;
    private String porte;
    private Boolean coleira;

    public Cachorro (String nome, String genero, int idade, double peso){
        this.nome=nome;
        this.genero=genero;
        this.idade=idade;
        this.peso=peso;
        classificarPorte(peso);
        this.sentado=false;
        this.coleira=false;

    }
    public String latir() {
        return "Auau";
    }
    public void alimentar(){
      this.humor = "Feliz";
      this.peso +=1.0;
    }
    public void sentarLevantar(){
        if(getSentado()){
            setSentado(false);

        }    else {
            setSentado(true);
        }

    }
    public void colocarColeira(){
       setColeira(true);

    }
    public void passear() throws Exception {
        if (!getColeira()){
            throw new Exception("O Cachorro fugiu");
        }

    }

    public Boolean getColeira() {
        return coleira;
    }

    public void setColeira(Boolean coleira) {
        this.coleira = coleira;
    }

    public void classificarPorte(double peso){
        if(peso<15){
            setPorte("pequeno");
        } else if (peso<25) {
            setPorte("medio");
        } else {
            setPorte("grande");
        }
    }
    public String chamar(String nomeChamado){

        if(nomeChamado!=getNome()){
           setHumor("raiva");
        }
        if(getHumor()== "raiva"){
           return null;
        }
        return "O cachorro esta aqui";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Boolean getSentado() {
        return sentado;
    }

    public void setSentado(Boolean sentado) {
        this.sentado = sentado;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}

