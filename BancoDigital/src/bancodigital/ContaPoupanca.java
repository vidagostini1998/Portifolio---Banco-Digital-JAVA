/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigital;

/**
 *
 * @author vidag
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente,banco);
    }
    
 @Override
    public void imprimirExtrato() {
        System.out.println("** Extrato Conta Poupança **");
        super.imprimirInfosComuns();
    }
    
    
   
}
