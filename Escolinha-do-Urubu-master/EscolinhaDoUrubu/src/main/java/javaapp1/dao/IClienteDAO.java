/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapp1.dao;
import javaapp1.domain.Cliente;
/**
 *
 * @author neuma
 */
public interface IClienteDAO {
    
    public Boolean salvar(Cliente cliente);
    public void excluir(String telefone);
    public void atualizar(String telefone, Cliente cliente);
    public Cliente buscar(String telefone);
}
