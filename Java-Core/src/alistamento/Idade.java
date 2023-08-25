package alistamento;

public class Idade extends PaginaDeInscricao{
	
	private int idade[] = new int[3];
	private int cont = 0;

	public int[] getIdade() {
		return idade;
	}

	public void LerIdade(int idadeDigitada) {
		
		
		int anoAlistamento = 2023; 
		
		if(idadeDigitada < 18) {
			System.out.println("Sua idade não corresponde ao edital");
		}else if(idadeDigitada >= 18 && idadeDigitada <= 19) {
			System.out.println("Você não tem multas pendentes, pode prosseguir");
		}else if(idadeDigitada == 20 && idadeDigitada < 45 ) {
			int valorMulta = (idadeDigitada - anoAlistamento)*5;
			System.out.printf("ATENÇÃO MULTA: %.2f",valorMulta);
		}
		if(cont < 3) {
			this.idade[cont] = idadeDigitada;
			cont++;
		}else {
			System.out.println("Array de idade não possuo mais campos vazios");
		}
	
	}
	public Idade(int idades) {

	}

}
