import java.util.Scanner;

public class Usuario {
	
	public static void main(String[] args) {
		
		int opcaoMenu, opcaoLigaDesliga, opcaoVolume, opcaoCanal;
		
		
		SmartTV smartTv = new SmartTV();
		Scanner scanner = new Scanner(System.in);
		
		do {
		
			System.out.println("Status da TV: " + smartTv.ligada);
			System.out.println("Canal atual: " + smartTv.canal);
			System.out.println("Volume atual: " + smartTv.volume);
			
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Ligar / Desligar TV ");
			System.out.println("2 - Aumentar / Diminuir Canal ");
			System.out.println("3 - Aumentar / Diminuir Volume ");
			System.out.println("0 - Sair ");
			opcaoMenu = scanner.nextInt();
			
			if (opcaoMenu == 1) {
				System.out.println("O que deseja fazer: ");
				System.out.println("1 - Ligar TV");
				System.out.println("2 - Desligar TV");
				System.out.println("0 - Sair");
				
				opcaoLigaDesliga = scanner.nextInt();
				switch (opcaoLigaDesliga) {
				case 1:
					smartTv.ligar();
					break;
				case 2:
					smartTv.desligar();
					break;	
				case 0 :
					break;
				}	
			}else if (opcaoMenu == 2) {
				System.out.println("O que deseja fazer: ");
				System.out.println("1 - Aumentar Canal");
				System.out.println("2 - Diminuir Canal");
				System.out.println("3 - Digitar Canal");
				System.out.println("0 - Sair");
				
				opcaoCanal = scanner.nextInt();
				switch (opcaoCanal) {
				case 1:
					smartTv.aumentarCanal();
					break;
				case 2:
					smartTv.diminuirCanal();
					break;	
				case 3:
					System.out.println("Digite o canal desejado: ");
					int canal = scanner.nextInt();
					smartTv.setCanal(canal);
					break;
				case 0 :
					break;
				}
			}else {
				System.out.println("O que deseja fazer: ");
				System.out.println("1 - Aumentar Volume");
				System.out.println("2 - Diminuir Volume");
				System.out.println("0 - Sair");
				opcaoVolume = scanner.nextInt();
				
				switch (opcaoVolume) {
				case 1:
					smartTv.aumentarVolume();
					break;
				case 2:
					smartTv.diminuirVolume();
					break;	
				case 0 :
					break;
				}
				
			}
		
		}while (opcaoMenu != 0);
	}

}
