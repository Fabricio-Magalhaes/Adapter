package adapter;

/**
 *
 * @author Usuario
 */
public class SGBDAdapter extends SGBDUltimate{
    private SGBDGratuito sgbdGratuito;
    private SGBDBaisco sgbdBasico;
    private SGBDUltimate sgbdUltimate;
    
    public SGBDAdapter(SGBDUltimate sgbdUltimate){
        
        this.sgbdUltimate = sgbdUltimate;
    }
    public SGBDAdapter(SGBDBaisco sgbdBasico){
        
        this.sgbdBasico = sgbdBasico;
    }
    
    public SGBDAdapter(SGBDGratuito sgbdGratuito){
        this.sgbdGratuito = sgbdGratuito;
    }
    
    public void solicitarBancoBasico(){
        sgbdBasico.bancoBasico();
    }
    public void solicitarBancoGratutito(){
        sgbdGratuito.bancoGratuito();
    }
    public void solicitarBancoUltimate(){
        sgbdUltimate.bancoUltimate();
    }
}
