/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancodigital;

import java.util.List;

/**
 *
 * @author vidag
 */
public class BancoDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco bc = new Banco();
        bc.setNome("Banco 1");
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius Hansen D Agostini");
        
        //Criação de contas
        Conta cc = new ContaCorrente(vinicius,bc);
        Conta poupanca = new ContaPoupanca(vinicius,bc);
        
        
        //Depositar e Transferir
        cc.depositar(100);
        cc.transferir(poupanca, 100);
        
        //Imprimir Extrato
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
    
}
