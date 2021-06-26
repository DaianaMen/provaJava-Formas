package views;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;		
		do {
			System.out.println("\n--  --\n");
			System.out.println("1 - Cadastrar Retângulo");
			System.out.println("2 - Cadastrar Triângulo ");
			System.out.println("3 - Cadastrar Circulo");
			System.out.println("4 - Listar Todos");
			System.out.println("5 - Listar Retangulo");
			System.out.println("6 - Listar Triângulo");
			System.out.println("7 - Listar Circulo");
			System.out.println("0 - Sair");
			System.out.println("\nDigite uma das opções:");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				CadastrarRetangulo.renderizar();
				break;
			case 2:	
				CadastrarTriangulo.renderizar();
				break;
			case 3:	
				CadastrarCirculo.renderizar();
				break;
			case 4:	
				ListarTodos.rendenizar();
				break;
			case 5:	
				ListarRetangulo.renderizar();
				break;
			case 6:	
				ListarTriangulo.renderizar();
				break;
			case 7:	
				ListarCirculo.renderizar();
				break;
			case 0:
				break;
			default:
				System.err.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);		
		sc.close();
	}
}