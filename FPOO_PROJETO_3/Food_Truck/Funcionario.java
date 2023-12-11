package Aula_1109;

public class Funcionario extends Pessoa {
//////////////atributos//////////////
	private String cargo;
	private float salario;
	////////////////construtores
	Funcionario(){
		
	}
	Funcionario(String cargo, float salario, String nome,  int cpf, int telefone, int idade ){
		super();
		this.cargo = cargo;
		this.salario = salario;
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
	}
	/////////////////getters e setters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	////////////metodo executar funcao
	public void executarFuncao() {
		System.out.println("Executando funcao ...................");
	}
}
