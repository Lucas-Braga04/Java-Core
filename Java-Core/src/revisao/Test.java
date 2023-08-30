package revisao;

public class Test {

	public static void main(String[] args) {
		
		Agenda minhaAgenda = new Agenda(null, null);
		
		minhaAgenda.setName("Lucas");
		minhaAgenda.setCellPhone("98219-4945");
		minhaAgenda.addEmail("test@tes.com");
		minhaAgenda.addEndereco("Rua Boa vista"); 
		
		System.out.println(minhaAgenda.getName() + "\n" + minhaAgenda.getCellPhone() + "\n" + minhaAgenda.getEmail() + "\n" + minhaAgenda.getEndereco());
		
	}

}
