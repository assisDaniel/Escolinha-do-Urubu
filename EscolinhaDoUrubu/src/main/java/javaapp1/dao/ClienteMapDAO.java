/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp1.dao;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import javaapp1.domain.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class ClienteMapDAO implements IClienteDAO{
    private Map<String, Cliente> map;
    
    public ClienteMapDAO(){
        map= new HashMap<>();
    }
    
    public Boolean salvar(Cliente cliente){
         if(map.containsKey(cliente.getTelefone())) {
             System.out.println("Cliente já existe com o mesmo telefone.");
             return false;
         }

         map.put(cliente.getTelefone(), cliente);
         System.out.println("Cliente adicionado com sucesso.");
         return true;
     }

    
    public void excluir(String telefone){
        if(map.containsKey(telefone)) map.remove(telefone);
    }
    
    public void atualizar(String telefone, Cliente cliente){
        Cliente clienteCadastrado= new Cliente();
        map.remove(telefone);

        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTelefone(cliente.getTelefone());
        clienteCadastrado.setEsporte(cliente.getEsporte());
        clienteCadastrado.setQuadra(cliente.getQuadra());
        clienteCadastrado.setHorario(cliente.getHorario());
        clienteCadastrado.setQtdHoras(cliente.getQtdHoras());
        clienteCadastrado.setFormPag(cliente.getFormPag());
    }
    
    public Cliente buscar(String telefone){
        return this.map.get(telefone);
    }
}
