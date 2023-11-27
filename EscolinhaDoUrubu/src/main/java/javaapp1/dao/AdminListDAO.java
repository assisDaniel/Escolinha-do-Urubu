/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp1.dao;
import java.util.ArrayList;
import javaapp1.domain.Cliente;
/**
 *
 * @author daniel
 */
public class AdminListDAO implements IAdminDAO {
    private ArrayList<Cliente> list;
    
    public AdminListDAO(){
        list= new ArrayList<>();
    }
    
    public Boolean salvar(Cliente valores){
        if(list.contains(valores)){
            System.out.println("Valores já existem!");
            return false;
        }
        
        list.add(valores);
        System.out.println("Valores adicionados com sucesso");
        return true;
    }
    
    public void excluir(Cliente valores){
        if(list.contains(valores)) list.remove(valores);
    }
    
    public void atualizar(String quadra, String horario, Cliente valores){
        Cliente clienteCadastrado= new Cliente();
        Cliente temp= new Cliente(quadra, horario);
        list.remove(temp);
        
        clienteCadastrado.setQuadra(valores.getQuadra());
        clienteCadastrado.setQuadra(valores.getHorario());
    }
    
    public Cliente buscar(Cliente valores){
        return this.list.get(list.indexOf(valores));
    }
    
    public int size(){
        return list.size();
    }
}
