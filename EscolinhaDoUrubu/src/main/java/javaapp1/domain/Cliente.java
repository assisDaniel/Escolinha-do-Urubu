/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp1.domain; 
/**
 *
 * @author daniel
 */
public class Cliente {
    
    private String nome, telefone, esporte, quadra, horario, formPag, preco;
    private Integer qtdHoras;
    
    public Cliente(){}
    public Cliente(String quadra, String horario){
        this.quadra= quadra;
        this.horario= horario;
    }
    public Cliente(String nome, String telefone, String esporte, String quadra, String horario, String qtdHoras, String formPag){
        this.nome= nome;
        this.telefone= telefone;
        this.esporte= esporte;
        this.quadra= quadra;
        this.horario= horario;
        this.qtdHoras= Integer.valueOf(qtdHoras);
        this.formPag= formPag;
    }
    
    public Cliente(String nome, String telefone, String esporte, String quadra, String horario, String qtdHoras, String formPag, String preco){
        this.nome= nome;
        this.telefone= telefone;
        this.esporte= esporte;
        this.quadra= quadra;
        this.horario= horario;
        this.qtdHoras= Integer.valueOf(qtdHoras);
        this.formPag= formPag;
        this.preco= preco;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
   
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
   
    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone= telefone;
    }
    
    /**
     * @return the esporte
     */
    public String getEsporte() {
        return esporte;
    }

    /**
     * @param esporte the esporte to set
     */
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    /**
     * @return the quadra
     */
    public String getQuadra() {
        return quadra;
    }

    /**
     * @param quadra the quadra to set
     */
    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the formPag
     */
    public String getFormPag() {
        return formPag;
    }

    /**
     * @param formPag the formPag to set
     */
    public void setFormPag(String formPag) {
        this.formPag = formPag;
    }

    /**
     * @return the qtdHoras
     */
    public int getQtdHoras() {
        return qtdHoras;
    }

    /**
     * @param qtdHoras the qtdHoras to set
     */
    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }  
}
