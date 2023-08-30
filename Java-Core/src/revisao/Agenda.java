package revisao;


//Classe modelo
//Paradigma == modelo -> OOP

public class Agenda extends Test{
	
	//Atributos ou variáveis de classe
	private String name;
	private String cellPhone;
	private String email;
	private String endereco;

	

//	//Construtor
	public Agenda(String name, String cellPhone) {
		this.name = name;
		this.cellPhone = cellPhone;
	}
	
	//Metodos getters e setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	//public void setEmail(String email) {
	//	this.email = email;
	//}

	public String getEndereco() {
		return endereco;
	}

	//public void setEndereco(String endereco) {
	//	this.endereco = endereco;
	//}
	public void addEmail(String email) {
		this.email = email;
	}
	public void addEndereco(String endereco) {
		this.endereco = endereco;
	}


	
	
	
	
	
}
