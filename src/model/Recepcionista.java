package src1.model1;

import src1.Interfacea1.IRecepcionista;

public class Recepcionista extends Pessoa1 implements IRecepcionista{

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderOTelefone() {
        System.out.println(" Sei atender o telefone");
        System.out.println();     
        
    }

    @Override
    public void falarIngles() {
        System.out.println(" Sei falar inglês");
        System.out.println();  
        
    }
    
}
