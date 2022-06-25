package src1.model1;

public class Cliente extends Pessoa1 {


    private Integer idade;
    public Cliente(String nome, String telefone, String cpf, Integer idade) {
        super(nome, telefone, cpf);
       this.idade = idade;

    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    
  
    


}
