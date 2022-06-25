package src1.Utils1;

import static src1.model1.Enumtipo.PRESIDENCIAL;

import java.util.ArrayList;

import src1.model1.Camareira;
import src1.model1.Cliente;
import src1.model1.Enumtipo;
import src1.model1.Gerente;
import src1.model1.Quarto;
import src1.model1.Recepcionista;

public class Appp {
    
 public static void main(String[] args) {
     
   System.out.println(" Hotel Java");
   System.out.println(); 

//Cliente cliente1 = new Cliente("Manoel da silva", "218888889", "12345678901");
//Recepcionista recepcionista1 = new Recepcionista("Valéria", "21977778877", "95135765449");

//recepcionista1.atenderOTelefone();
//recepcionista1.falarIngles();

//Camareira camareira1 = new Camareira("Joana", "2178965423", "12345678902")

//camareira1.arrumarAcama();
//camareira1.limparQuarto();
// deu uma dore de barriga na valéria 
//Gerente gerente1 = new Gerente("Fabricio", "218953416258", "93357248649")
//gerente1.atenderOTelefone();
//gerente1.falarIngles();
//gerente1.arrumarAcama();
//gerente1.limparQuarto();

//Quarto quarto1 = new Quarto ();
//quarto1.setNumero("206A");
//quarto1.setValor(100.0);
//quarto1.setTipo(Enumtipo.BASICO);

//Quarto quarto2 = new Quarto ();
//quarto2.setNumero("306A");
//quarto2.setValor(200.0);
//quarto2.setTipo(PRESIDENCIAL);

//System.out.println(quarto2.getTipo());
//System.out.println(quarto2.getTipo().getValor());

Cliente cliente1 = new Cliente("Manoel da silva", "217123130258", "15495959",42);
Cliente cliente2 = new Cliente("Fulano de tal", "21781518489", "148489189",21);
Cliente cliente3 = new Cliente("Ciclano Rodrigues", "217894826285", "19889494",36);
Cliente cliente4 = new Cliente("Beltrano Rodrigues", "2178965423", "4848652129",56);

ArrayList <Cliente> clientes = new ArrayList<Cliente>();
clientes.add(cliente1);
clientes.add(cliente2);
clientes.add(cliente3);
clientes.add(cliente4);

// retorna a quantidade de elementos presentes em uma stream 
clientes.stream ().count();
clientes.size();
var resultado1 = clientes.stream ().limit(2);


 }
    


}
