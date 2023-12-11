package Aula_1109;

public class Cozinheiro extends Funcionario {
		//////////////construtor
	Cozinheiro(String cargo, float salario, String nome,  int cpf, int telefone, int idade){
		super();
		super.setCargo(cargo);
		super.setSalario(salario);
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
	}
	Cozinheiro(){
		
	}
	@Override
	public void executarFuncao() {
		System.out.println("Cozinhando..........");
	}
}
