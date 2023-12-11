import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJSON {
	public static void main (String[] args) {
		try {
			ObjectMapper objeto = new ObjectMapper();
			//obj para utilizar na serialização
			Pessoa pes = new Pessoa("Abel", 45);
			//serializar o obj pes
			String json = objeto.writeValueAsString(pes);
			System.out.println("Objeto serializado");
			System.out.println(json);
			//desserializar o JSON para o obj pes
			Pessoa desPes = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa");
			System.out.println("Nome: " + desPes.getNome());
			System.out.println("Idade: " + desPes.getIdade());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
