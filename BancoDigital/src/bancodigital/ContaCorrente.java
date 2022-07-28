/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigital;

/**
 *
 * @author vidag
 */
public class ContaCorrente extends Conta{

    ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente,banco);
        
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("** Extrato Conta Corrente **");
        super.imprimirInfosComuns();
    }


    
}
