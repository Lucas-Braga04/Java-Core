package alistamento;

public class Nomes extends PaginaDeInscricao{
	
	private String nameCandidatos[] = new String[3];
	private String nameParents[] = new String[6];

	public String[] getName() {
		return nameCandidatos;
	}

	public void setName(String name[]) {
		this.nameCandidatos = name;
	}

	public String[] getNameParents() {
		return nameParents;
	}

	public void setNameParents(String nameParents[]) {
		this.nameParents = nameParents;
	}

	public Nomes(String namesCandidatos, String nameParents) {
		
	}
}
