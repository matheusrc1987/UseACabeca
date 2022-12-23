public class Pagina13 {
	public static void main(String[] args) {
		String [] wordListOne = {"24/7", "várias camadas","30.000 pés", "B-to-B", "todos ganham"};
		String [] wordListtwo = {"habilitado", "desivo", "valor agregado", "dedicado", "Alavancado"};
		String [] wordListThree = {"processo", "ponto máximo", "portal", "esapaço"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListtwo.length;
		int threeLength = wordListThree.length;
		
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String pharase = wordListOne[rand1] + " " + wordListtwo[rand2] + " " + wordListThree[rand3];
		System.out.println("Precisamos de " + pharase);
	}
}
