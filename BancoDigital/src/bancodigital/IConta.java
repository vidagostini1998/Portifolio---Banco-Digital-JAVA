/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bancodigital;

/**
 *
 * @author vidag
 */
public interface IConta {
    void sacar(double valor);
    
    void depositar(double valor);
        
    void transferir(IConta contaDestino, double valor);
    
    void imprimirExtrato();

}
