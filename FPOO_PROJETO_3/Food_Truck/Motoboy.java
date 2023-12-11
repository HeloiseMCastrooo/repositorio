package Aula_1109;

public class Motoboy extends Funcionario {
//////////////construtor
	String apelido;
	/*	
	Motoboy(String cargo, float salario, String nome,  int cpf, int telefone, int idade){
		super();
		super.setCargo(cargo);
		super.setSalario(salario);
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
		}
		*/
		Motoboy(String nome,  int cpf, int telefone, int idade, String cargo, float salario){
			super();
			super.setNome(nome);
			super.setCpf(cpf);
			super.setTelefone(telefone);
			super.setIdade(idade);
			super.setCargo(cargo);
			super.setSalario(salario);
			
			
			
			
			}
		
		
		
		
		Motoboy(){
			
		}
		@Override
		public void executarFuncao() {
		System.out.println("Entregando o doce..........");
		}
}
