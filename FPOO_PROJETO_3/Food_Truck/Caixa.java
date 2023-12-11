package Aula_1109;

public class Caixa extends Funcionario {
		//////////////construtor
		Caixa(String cargo, float salario, String nome,  int cpf, int telefone, int idade){
		super();
		super.setCargo(cargo);
		super.setSalario(salario);
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
		}
		Caixa(){
			
		}
		@Override
		public void executarFuncao() {
		System.out.println("Atendendo o cliente..........");
		}
		//////////////////////
		//mostrar cardapio produtos syso
	//	public void mostrarCardapio() {
		//	System.out.println("Macaron----------R$6,00");
		//}
}	
