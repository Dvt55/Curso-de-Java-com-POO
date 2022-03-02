package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidade.funcionario;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		List<funcionario> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id já existente, tente novamente: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			String nome = sc.nextLine();
			
			double salario = sc.nextDouble();
			
			funcionario func = new funcionario(id, nome, salario);
			
			/*Adiciono um novo funcionário na minha lista*/
			list.add(func);
			
		}
		System.out.println("----------------------------------------");
		System.out.println("Qual funcionário vai aumentar o salario?: ");
		int id_func = sc.nextInt();
		
		/*Crio uma variável para chamar minha função "posicao"*/
		Integer pos = posicao(list, id_func);
		if(pos == null) {
			System.out.println("Inválido");
		}
		else {
			int x = sc.nextInt();
			
			/*list.get(pos) vai fazer eu acessar o funcionário na posição "pos"
			 * da minha lista e com isso, chamo junto com a função aumento para
			 * aumentar o salário daquele funcionário
			 */
			list.get(pos).aumento(x);
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		for(funcionario func : list) {
			System.out.println(func);
		}
		
	}
	
	/*Percorre a lista inteira para saber onde está o funcionário com o Id digitado*/
	public static Integer posicao(List<funcionario>list, int id) {
		for(int i=0; i<list.size(); i++) {
			
			/*list.get(i).getId() pega o Id do funcionario da posição i */
			
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	/*Filtra minha lista para saber se o Id já existe, se retornar null significa
	 * que não existe e se retornar diferente de null, existe
	 */
	public static boolean hasId(List<funcionario> list, int id) {
		funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}
}
