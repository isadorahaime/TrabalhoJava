package Library;

import java.util.ArrayList;


public class Cadastro {

	private ArrayList<Pessoa> pessoa = new ArrayList<>();
	
	//classe interna para o tratamento de exceção.
	  public class MultaEmprestimoException extends Exception {
	        public MultaEmprestimoException(String message) {
	            super(message);
	        }
	    }
    
	  public void pagarMulta(Pessoa empresta) {
		    try {
		        double multa = empresta.getMulta();
		        if (multa > 0) {
		            empresta.setMulta(0);
		            System.out.println("Multa paga por: " + empresta.getNome() + ". Valor pago: R$ " + multa);
		        } else {
		            System.out.println("Não há multa a ser paga para: " + empresta.getNome());
		        }
		    } catch (MultaEmprestimoException e) {
		        System.out.println(e.getMessage());
		    }
		}
    
    public void AdicionarPessoa(Pessoa newpessoa) {
    	pessoa.add(newpessoa);
    	System.out.println(newpessoa.getNome() + " adicionado com sucesso");
    }
    

    
    public void alterarPessoa(String nome, String nomeAtualizado,String telefone, String email) {
    	for(int i = 0; i < pessoa.size(); i++ ) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.get(i).setNome(nomeAtualizado);
    			pessoa.get(i).setTelefone(telefone);
    			pessoa.get(i).setEmail(email);
    		}else {
    			System.out.println("emprestante nÃ£o encontrado");
    		}
    	}
    	
    }
    
    public void deletaPessoa(String nome) {
    	for(int i = 0; i< pessoa.size(); i++) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.remove(i);
    		}else {
    			System.out.println("emprestante nÃ£o encontrado");

    		}
    	}
    }

   
}
