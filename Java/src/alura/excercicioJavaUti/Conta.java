package alura.excercicioJavaUti;

public class Conta {
    // outros atributos
    protected Integer numero;
    protected String nome;
    protected Double saldo = 0d;

       public Conta(double d) {
    	   this.saldo = d;
    	
	}

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

	public void deposita(double d) {
		synchronized (this) {
			this.saldo += d;	
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	

    
}