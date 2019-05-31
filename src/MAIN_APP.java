
public class MAIN_APP {

	public static void main(String[] args) {
		Gestor_Cuenta gestor = new Gestor_Cuenta();
		
		System.out.println(gestor.getCuentas().get(0).getComentarios().get(0));
			
	}

}
