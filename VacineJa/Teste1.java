package VacineJa;

import java.util.Scanner;

public class Teste1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int menu = 0, idade, profissao, regiao, comorbidade, vacina;
		String nome;
		System.out.println("Bem vindo ao centro de informação da campanha de vacinação da Covid19 do Estado de São Paulo");
	
		while (menu != 9) {
			
			System.out.println(" ================================================================\r\n"
					+ " |								|\r\n"
					+ " |								|\r\n"
					+ " |	[1] - Quando posso me vacinar?				|\r\n"
					+ " |	[2] - Informações sobre os tipos de vacinas		|\r\n"
					+ " |	[3] - Informações legais				|\r\n"
					+ " |	[9] - Sair do programa					|\r\n"
					+ " |								|\r\n"
					+ " |								|\r\n"
					+ " ================================================================");
			System.out.println("Escolha a opção -");
			menu = ler.nextInt();
	
			if (menu == 1) {
			
				System.out.print("Como podemos te chamar?");
				nome = ler.next();
				System.out.print("Informe sua idade:  ");
				idade = ler.nextInt();
				System.out.print("Informe sua profissão/"
								 +"(1-Área da saúde;2-Área da educação;3-Área da segurança pública;4-Transporte público;5-outros): ");
				profissao = ler.nextInt();
				System.out.print("Informe sua Região/(1-Grande São Paulo;2-Outros municípios): ");
				regiao = ler.nextInt();
				System.out.print("Você possui alguma comorbidade/(1-sim;2-não): ");
				comorbidade = ler.nextInt();
				
				System.out.println("");
				System.out.println ("Olá" + nome);
		
				if (idade >= 60) {
					System.out.println("Sua idade está dentro do grupo já liberado.");
				}
				if (idade < 60 && comorbidade == 2 && profissao == 5) {
					System.out.println("Atualmente sua idade não está sendo vacinada, segue dados para proxima vacinação. ");
				}
				if (idade < 18) {
					System.out.print("No momento não temos planejamento de vacinação para menores de 18 anos. ");
				}
				if (profissao == 1) {
					System.out.print("Sua profissão está em andamento com a vacinação. ");
				}
				if (profissao == 2 && idade >= 45) {
					System.out.print("Sua profissão está em andamento com a vacinação, a partir dos 45 anos. ");
				}
				if (profissao == 3) {
						System.out.print("Sua profissão está em andamento com a vacinação. ");
				}
				if (profissao == 4 && idade >= 47) {
					System.out.print("Sua profissão está em andamento com a vacinação. Consulte a tabela com as datas disponível nas Informações Legais - opção 3. ");
				}
				if (profissao == 5) {
					System.out.print("No momento outras profissões não receberam a classificação de prioritários na lista. ");
				}
				if (regiao == 1) {
					System.out.println("Vacinas disponíveis para a grande São Paulo: Astrazeneca, Pfizer e Coronavac. ");
				}
				if (regiao == 2) {
					System.out.println("Vacinas disponíveis para outros municípios: Astrazeneca e Coronavac. ");
				}
				if (comorbidade == 1 && idade >= 18) {
					System.out.print("liberação para todas as idades com comorbidade a partir dos 18 anos. ");
				}
				if (comorbidade == 2 && idade >= 18) {
					System.out.print("Pessoas sem comorbidade ainda deverão esperar pela data de sua faixa etaria ou profissão. ");
				}
				
				System.out.println("");
				System.out.println("----------");
				System.out.println("");
			}
		
		
			if (menu == 2) {
				System.out.println("=================================================================================================\r\n"
						+ "|   Vacinas disponíveis para utilização. Digite o número correspondente à vacina desejada.\");   |\r\n"
						+ "|												|\r\n"
						+ "|	   [1]Coronavac										|\r\n"
						+ "|	   [2]Pfizer										|\r\n"
						+ "|	   [3]Astrazeneca									|\r\n"
						+ "|												|\r\n"
						+ "=================================================================================================");
				System.out.println("Escolha a opção -");
				vacina = ler.nextInt();
			
				if (vacina == 1) {
					System.out.println("CoronaVac: Vírus inativado\r\n"
							+ "Vacina que contém o vírus “morto” (inativado) da Covid-19. Ao entrar no organismo, gera uma resposta imunológica. É a forma mais comum de produzir vacinas.\r\n"
							+ "\r\n"
							+ "O esquema vacinal completo é composto por duas doses. Conforme os estudos clínicos e indicação na bula, o intervalo entre a primeira e a segunda deve ser de 14 a 28 dias para aplicação da segunda dose.\r\n"
							+ "\r\n"
							+ "Os anticorpos devem ter níveis adequados duas semanas após a segunda dose. Por ser uma vacina nova, ainda não está determinada a duração da resposta imune. O Butantan realiza estudos neste sentido.\r\n"
							+ "\r\n"
							+ "Não foram registrados eventos adversos graves e de interesse especial após aplicação. O evento adverso mais comum observado durante os estudos clínicos foi dor no local da aplicação.\r\n"
							+ "Algumas pessoas apresentam febre, dor muscular, náusea e dor de cabeça. \r\n"
							+ "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir níveis adequados de proteção após a segunda dose, mesmo que vacinado, se você estiver infectado poderá transmitir o coronavírus para outras pessoas. \r\n");
				}
				if (vacina == 2) {
					System.out.println("Pfizer: RNA Mensageiro\r\n"
							+ "Essa vacina não utiliza um vírus, mas sim uma molécula, chamada de RNA. Esta molécula leva uma “mensagem” até as células contendo todas as informações genéticas do vírus.\r\n"
							+ "É uma espécie de “manual de instruções” que “ensina” as células a criar uma defesa contra o vírus. Por ter essa função, ela é denominada de RNA mensageiro.\r\n"
							+ "\r\n"
							+ "O esquema vacinal é composto por duas doses. A segunda dose deve ser administrada 12 semanas após a primeira, conforme determinação do Ministério da Saúde \r\n"
							+ "(o período indicado na bula do fabricante é de 21 dias, mas no Brasil foi adotado o prazo de 12 semanas para ampliar a oferta da primeira dose na população, com base em discussões técnicas).\r\n"
							+ "\r\n"
							+ "Os anticorpos devem ter níveis adequados 21 dias após aplicação da vacina. Por ser uma vacina nova, ainda não está determinada a duração da resposta imune.\r\n"
							+ "\r\n"
							+ "As reações mais comuns que constam em bula são dor ou inchaço no local da injeção, dor de cabeça e/ou muscular e/ou na articulação, cansaço, diarreia, calafrios e febre.\r\n"
							+ "Reações menos comuns incluem vermelhidão no local de injeção, náusea e vômito.\r\n"
							+ "\r\n"
							+ "Como os vacinados demoram cerca de duas semanas para atingir níveis adequados de proteção após a segunda dose, mesmo que vacinado, se você estiver infectado poderá transmitir o coronavírus para outras pessoas.\r\n");
				}
				if (vacina == 3) {
					 System.out.println("Astrazeneca: Adenovírus não replicante\r\n"
					 		+ "Essa vacina possui um vírus “vivo”, mas não é o coronavírus, é o adenovírus presente em chimpanzés. Apesar de vivo, ele é inofensivo, pois não tem o poder de se multiplicar (replicar).\r\n"
					 		+ "Mesmo assim, o organismo - ao identificar o “corpo vivo” - projeta carga máxima contra o intruso, o que explica o alto índice de reações adversas (como febre, calafrios e dores no corpo).\r\n"
					 		+ "\r\n"
					 		+ "O esquema vacinal é composto por duas doses. A segunda dose deve ser administrada 12 semanas após a primeira.\r\n"
					 		+ "\r\n"
					 		+ "Os anticorpos devem ter níveis adequados duas semanas após aplicação da vacina. Por ser uma vacina nova, ainda não está determinada a duração da resposta imune.\r\n"
					 		+ "\r\n"
					 		+ "As reações adversas mais frequentes reportadas nos estudos clínicos foram sensibilidade e/ou dor no local da injeção, dor de cabeça e/ou muscular e/ou na articulação, fadiga, mal estar, febre, calafrios e náusea.\r\n"
					 		+ "A maioria foi de intensidade leve a moderada e geralmente resolvida dentro de poucos dias após a vacinação. \r\n"
					 		+"\r\n"
					 		+ "vacinas com mesmo príncipio são as da Oxford e fiocruz");
				}
				System.out.println("");
				System.out.println("----------");
				System.out.println("");
			}
			
				if (menu == 3) {
					System.out.println("Total de vacinados com a primeira dose: 12.583.239.");
					System.out.println("Total de vacinados com a segunda dose: 5.908.850.");
					System.out.println("1 a 20 de julho – 55 a 59 anos");
					System.out.println("2 a 16 de agosto – 50 a 54 anos");
					System.out.println("17 a 31 de agosto – 45 a 49 anos");
					System.out.println("1 a 10 de setembro – 40 a 44 anos");
					System.out.println("11 a 20 de setembro – 35 a 39 anos");
					System.out.println("21 a 30 de setembro – 30 a 34 anos");
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

