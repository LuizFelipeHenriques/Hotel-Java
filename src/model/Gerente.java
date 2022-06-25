package src1.model1;

import src1.Interfacea1.IRecepcionista;
import src1.Interfacea1.Icamareira;

public class Gerente extends Pessoa1 implements Icamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
        
    }

    @Override
    public void atenderOTelefone() {
        System.out.println(" Sei atender mais ou menos");
        System.out.println();  
        
    }

    @Override
    public void falarIngles() {
        System.out.println(" Sei falar ingles muito bem");
      System.out.println();  
        
    }

    @Override
    public void arrumarAcama() {
        System.out.println(" Sei muito bem arrumar a cama");
      System.out.println();  
        
    }

    @Override
    public void limparQuarto() {
        System.out.println(" até sei limpar o quarto");
        System.out.println();  
        
    }
   
    
}
