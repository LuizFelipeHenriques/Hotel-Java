package src1.model1;

import src1.Interfacea1.Icamareira;

public class Camareira extends Pessoa1 implements Icamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void arrumarAcama() {
      System.out.println(" Sei muito bem arrumar a cama");
      System.out.println();  
    }

    @Override
    public void limparQuarto() {
        System.out.println(" Sei muito bem limpar o quarto");
        System.out.println();  
        
    }
    
}
