package Aula_1109;

public class QmLimpa extends Funcionario {
		//////////////construtor
		QmLimpa(String cargo, float salario, String nome,  int cpf, int telefone, int idade){
		super();
		super.setCargo(cargo);
		super.setSalario(salario);
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
		}
		QmLimpa(){
			
		}
		@Override
		public void executarFuncao() {
		System.out.println("Lavando louça..........");
		}
}
