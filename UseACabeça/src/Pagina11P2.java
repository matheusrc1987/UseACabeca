
public class Pagina11P2 {

	public static void main(String[] args) {
		int beerNum = 10;
		String word = "bootles";
		while (beerNum > 0) {
			
			if (beerNum ==1) {
				word = "booble";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;
			
			if (beerNum>0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more botles of beer on the wall");
			}
		}

	}

	
		
	}


