/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Usuario
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SGBDBaisco bs = new SGBDBaisco();
        SGBDAdapter Nova_Conta = new SGBDAdapter(bs);
        Nova_Conta.solicitarBancoBasico();
        
        SGBDGratuito gt = new SGBDGratuito();
        SGBDAdapter Nova_ContaBa = new SGBDAdapter(gt);
        Nova_ContaBa.solicitarBancoGratutito();
        
        
        SGBDUltimate ut = new SGBDUltimate();
        SGBDAdapter Nova_ContaUT = new SGBDAdapter(ut);
        Nova_ContaUT.solicitarBancoUltimate();
    }
    
}
