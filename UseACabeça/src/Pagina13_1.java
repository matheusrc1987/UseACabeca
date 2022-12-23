
public class Pagina13_1 {

	public static void main(String[] args) {
		String[] Matriz1 = {"Matheus", "Bernardo", "Thiago", "Andreia", "jose", "Luiz", "Camila"
				, "Alzira", "Antonio"};
		String[] Matriz2 = {"está","é"};
		String[] Matriz3 = {"feliz", "alegre", "triste", "cansado", "faminto"};
		
		int quant1 = Matriz1.length;
		int quant2 = Matriz2.length;
	    int quant3 = Matriz3.length;
	    
	    int randomizado1 = (int) (Math.random() *  quant1  );
	    int randomizado2 = (int) (Math.random() *  quant2  );
	    int randomizado3 = (int) (Math.random() *  quant3  );
		
		System.out.println("quantidade de elementos da Matriz 1: " + quant1);
		System.out.println("quantidade de elementos da Matriz 2: " + quant2);
		System.out.println("quantidade de elementos da Matriz 3: " + quant3);
		System.out.println("===============");
		System.out.println("Frase aleatória: ");
		System.out.println( Matriz1[randomizado1] + " " + Matriz2[randomizado2] + " " + Matriz3[randomizado3] );
		
		
	}

}
