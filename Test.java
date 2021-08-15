import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print number of products you want to add:");
		int arg = sc.nextInt();
		
		Zbozi [] zbozi = new Zbozi[arg];

		for (int i =0; i<arg; i++)
		{
			System.out.println("Press '1' if you want to add Potravina or '2' if you want to buy Naradi.");
			int choise = sc.nextInt();
			if (choise != 1 && choise != 2)
			{
				System.out.println("You don't choose one of two right variants, choose again product number " + (i+1) +".");
				i--;
			}
			else if (choise == 1)
				zbozi[i] = new Potravina();
			else if (choise == 2)
				zbozi[i] = new Naradi();
		}
		
		for (Zbozi product:zbozi)
		{
			System.out.print(product.getName() + ", " + product.getCost()+"kc.");
		
			if (product instanceof Potravina)
				System.out.print(" Trvanlivost je " + ((Potravina)product).getDurability() + " " + product.getJednotka());
			System.out.println();
			
			sc.close();
		}
	}
}