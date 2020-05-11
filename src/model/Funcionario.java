package model;

public class Funcionario {
	private String nome ;
	private String email ;
	private float salario ;

	public void aumentoSalario(float percentual) {
		this.salario += salario * percentual/100;
		
	}
		public void imprimirInfo() {
			System.out.println("Funcionario"+nome+" ("+email+")");
			System.out.println("Salario R$"+salario);
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public float getSalario() {
			return salario;
		}
		public void setSalario(float salario) {
			this.salario = salario;
		}
		
	
}
