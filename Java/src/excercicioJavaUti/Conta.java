package excercicioJavaUti;

public class Conta {
    // outros atributos
    protected Integer numero;
    protected String nome;

    public String getNome() {
		return nome;
	}

	//construtor e outros m�todos
    public Integer getNumero() {
        return this.numero;
    }
    
    @Override
    public String toString() {
    	return numero == null ? "<vazio>" : String.valueOf(numero);
    }
    
}