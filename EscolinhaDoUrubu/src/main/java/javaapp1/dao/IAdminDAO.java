/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapp1.dao;
import javaapp1.domain.Cliente;
/**
 *
 * @author daniel
 */
public interface IAdminDAO {
    
    public Boolean salvar(Cliente valores);
    public void excluir(Cliente valores);
    public void atualizar(String quadra, String horario, Double preco, Cliente valores);
    public Cliente buscar(Cliente valores);
    public int size();
}
