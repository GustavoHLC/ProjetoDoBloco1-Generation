package VacineJa;

import java.util.Scanner;

public class Teste1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int menu = 0, idade, profissao, regiao, comorbidade, vacina;
		String nome;
		System.out.println("Bem vindo ao centro de informa��o da campanha de vacina��o da Covid19 do Estado de S�o Paulo");
	
		while (menu != 9) {
			
			System.out.println(" ================================================================\r\n"
					+ " |								|\r\n"
					+ " |								|\r\n"
					+ " |	[1] - Quando posso me vacinar?				|\r\n"
					+ " |	[2] - Informa��es sobre os tipos de vacinas		|\r\n"
					+ " |	[3] - Informa��es legais				|\r\n"
					+ " |	[9] - Sair do programa					|\r\n"
					+ " |								|\r\n"
					+ " |								|\r\n"
					+ " ================================================================");
			System.out.println("Escolha a op��o -");
			menu = ler.nextInt();
	
			if (menu == 1) {
			
				System.out.print("Como podemos te chamar?");
				nome = ler.next();
				System.out.print("Informe sua idade:  ");
				idade = ler.nextInt();
				System.out.print("Informe sua profiss�o/"
								 +"(1-�rea da sa�de;2-�rea da educa��o;3-�rea da seguran�a p�blica;4-Transporte p�blico;5-outros): ");
				profissao = ler.nextInt();
				System.out.print("Informe sua Regi�o/(1-Grande S�o Paulo;2-Outros munic�pios): ");
				regiao = ler.nextInt();
				System.out.print("Voc� possui alguma comorbidade/(1-sim;2-n�o): ");
				comorbidade = ler.nextInt();
				
				System.out.println("");
				System.out.println ("Ol�" + nome);
		
				if (idade >= 60) {
					System.out.println("Sua idade est� dentro do grupo j� liberado.");
				}
				if (idade < 60 && comorbidade == 2 && profissao == 5) {
					System.out.println("Atualmente sua idade n�o est� sendo vacinada, segue dados para proxima vacina��o. ");
				}
				if (idade < 18) {
					System.out.print("No momento n�o temos planejamento de vacina��o para menores de 18 anos. ");
				}
				if (profissao == 1) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o. ");
				}
				if (profissao == 2 && idade >= 45) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o, a partir dos 45 anos. ");
				}
				if (profissao == 3) {
						System.out.print("Sua profiss�o est� em andamento com a vacina��o. ");
				}
				if (profissao == 4 && idade >= 47) {
					System.out.print("Sua profiss�o est� em andamento com a vacina��o. Consulte a tabela com as datas dispon�vel nas Informa��es Legais - op��o 3. ");
				}
				if (profissao == 5) {
					System.out.print("No momento outras profiss�es n�o receberam a classifica��o de priorit�rios na lista. ");
				}
				if (regiao == 1) {
					System.out.println("Vacinas dispon�veis para a grande S�o Paulo: Astrazeneca, Pfizer e Coronavac. ");
				}
				if (regiao == 2) {
					System.out.println("Vacinas dispon�veis para outros munic�pios: Astrazeneca e Coronavac. ");
				}
				if (comorbidade == 1 && idade >= 18) {
					System.out.print("libera��o para todas as idades com comorbidade a partir dos 18 anos. ");
				}
				if (comorbidade == 2 && idade >= 18) {
					System.out.print("Pessoas sem comorbidade ainda dever�o esperar pela data de sua faixa etaria ou profiss�o. ");
				}
				
				System.out.println("");
				System.out.println("----------");
				System.out.println("");
			}
		
		
			if (menu == 2) {
				System.out.println("=================================================================================================\r\n"
						+ "|   Vacinas dispon�veis para utiliza��o. Digite o n�mero correspondente � vacina desejada.\");   |\r\n"
						+ "|												|\r\n"
						+ "|	   [1]Coronavac										|\r\n"
						+ "|	   [2]Pfizer										|\r\n"
						+ "|	   [3]Astrazeneca									|\r\n"
						+ "|												|\r\n"
						+ "=================================================================================================");
				System.out.println("Escolha a op��o -");
				vacina = ler.nextInt();
			
				if (vacina == 1) {
					System.out.println("CoronaVac: V�rus inativado\r\n"
							+ "Vacina que cont�m o v�rus �morto� (inativado) da Covid-19. Ao entrar no organismo, gera uma resposta imunol�gica. � a forma mais comum de produzir vacinas.\r\n"
							+ "\r\n"
							+ "O esquema vacinal completo � composto por duas doses. Conforme os estudos cl�nicos e indica��o na bula, o intervalo entre a primeira e a segunda deve ser de 14 a 28 dias para aplica��o da segunda dose.\r\n"
							+ "\r\n"
							+ "Os anticorpos devem ter n�veis adequados duas semanas ap�s a segunda dose. Por ser uma vacina nova, ainda n�o est� determinada a dura��o da resposta imune. O Butantan realiza estudos neste sentido.\r\n"
							+ "\r\n"
							+ "N�o foram registrados eventos adversos graves e de interesse especial ap�s aplica��o. O evento adverso mais comum observado durante os estudos cl�nicos foi dor no local da aplica��o.\r\n"
							+ "Algumas pessoas apresentam febre, dor muscular, n�usea e dor de cabe�a. \r\n"
							+ "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir n�veis adequados de prote��o ap�s a segunda dose, mesmo que vacinado, se voc� estiver infectado poder� transmitir o coronav�rus para outras pessoas. \r\n");
				}
				if (vacina == 2) {
					System.out.println("Pfizer: RNA Mensageiro\r\n"
							+ "Essa vacina n�o utiliza um v�rus, mas sim uma mol�cula, chamada de RNA. Esta mol�cula leva uma �mensagem� at� as c�lulas contendo todas as informa��es gen�ticas do v�rus.\r\n"
							+ "� uma esp�cie de �manual de instru��es� que �ensina� as c�lulas a criar uma defesa contra o v�rus. Por ter essa fun��o, ela � denominada de RNA mensageiro.\r\n"
							+ "\r\n"
							+ "O esquema vacinal � composto por duas doses. A segunda dose deve ser administrada 12 semanas ap�s a primeira, conforme determina��o do Minist�rio da Sa�de \r\n"
							+ "(o per�odo indicado na bula do fabricante � de 21 dias, mas no Brasil foi adotado o prazo de 12 semanas para ampliar a oferta da primeira dose na popula��o, com base em discuss�es t�cnicas).\r\n"
							+ "\r\n"
							+ "Os anticorpos devem ter n�veis adequados 21 dias ap�s aplica��o da vacina. Por ser uma vacina nova, ainda n�o est� determinada a dura��o da resposta imune.\r\n"
							+ "\r\n"
							+ "As rea��es mais comuns que constam em bula s�o dor ou incha�o no local da inje��o, dor de cabe�a e/ou muscular e/ou na articula��o, cansa�o, diarreia, calafrios e febre.\r\n"
							+ "Rea��es menos comuns incluem vermelhid�o no local de inje��o, n�usea e v�mito.\r\n"
							+ "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir n�veis adequados de prote��o ap�s a segunda dose, mesmo que vacinado, se voc� estiver infectado poder� transmitir o coronav�rus para outras pessoas.\r\n");
				}
				if (vacina == 3) {
					 System.out.println("Astrazeneca: Adenov�rus n�o replicante\r\n"
					 		+ "Essa vacina possui um v�rus �vivo�, mas n�o � o coronav�rus, � o adenov�rus presente em chimpanz�s. Apesar de vivo, ele � inofensivo, pois n�o tem o poder de se multiplicar (replicar).\r\n"
					 		+ "Mesmo assim, o organismo - ao identificar o �corpo vivo� - projeta carga m�xima contra o intruso, o que explica o alto �ndice de rea��es adversas (como febre, calafrios e dores no corpo).\r\n"
					 		+ "\r\n"
					 		+ "O esquema vacinal � composto por duas doses. A segunda dose deve ser administrada 12 semanas ap�s a primeira.\r\n"
					 		+ "\r\n"
					 		+ "Os anticorpos devem ter n�veis adequados duas semanas ap�s aplica��o da vacina. Por ser uma vacina nova, ainda n�o est� determinada a dura��o da resposta imune.\r\n"
					 		+ "\r\n"
					 		+ "As rea��es adversas mais frequentes reportadas nos estudos cl�nicos foram sensibilidade e/ou dor no local da inje��o, dor de cabe�a e/ou muscular e/ou na articula��o, fadiga, mal estar, febre, calafrios e n�usea.\r\n"
					 		+ "A maioria foi de intensidade leve a moderada e geralmente resolvida dentro de poucos dias ap�s a vacina��o. \r\n"
					 		+"\r\n"
					 		+ "vacinas com mesmo pr�ncipio s�o as da Oxford e fiocruz");
				}
				System.out.println("");
				System.out.println("----------");
				System.out.println("");
			}
			
				if (menu == 3) {
					System.out.println("Total de vacinados com a primeira dose: 12.583.239.");
					System.out.println("Total de vacinados com a segunda dose: 5.908.850.");
					System.out.println("1 a 20 de julho � 55 a 59 anos");
					System.out.println("2 a 16 de agosto � 50 a 54 anos");
					System.out.println("17 a 31 de agosto � 45 a 49 anos");
					System.out.println("1 a 10 de setembro � 40 a 44 anos");
					System.out.println("11 a 20 de setembro � 35 a 39 anos");
					System.out.println("21 a 30 de setembro � 30 a 34 anos");
					System.out.println("1 a 10 de outubro - 25 a 29 anos");
					System.out.println("11 a 31 de outubro - 18 a 24 anos");
					System.out.println("");
					System.out.println("----------");
					System.out.println("");
				}
				else if (menu == 9) {
					System.out.println("");
					System.out.println("Obrigado por utilizar nosso programa, tenha um otimo dia.");
				}
				
		}
		ler.close();
	}
	
}

