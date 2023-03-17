package applications;

public class Questao5 {

	public static void main(String[] args) {
		
		String str = "Oi mundo";
		String invertida = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			invertida += str.charAt(i);
		}
		System.out.println("A string invertida é: " + invertida);		
	}
}
