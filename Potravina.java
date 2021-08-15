import java.util.Scanner;

public class Potravina extends Zbozi {
	
	private int durability;

	Scanner sc = new Scanner(System.in);
	
	Potravina ()
	{
		super();
		setDurability();
	}
	
	public void setDurability()
	{
		System.out.println("Set durability : ");
		int newDurability = sc.nextInt();
		this.durability = newDurability;
	}
	
	public void setDurability(int newDurability)
	{
		this.durability = newDurability;
	}
	
	public int getDurability()
	{
		return durability;
	}
	
	String getJednotka()
	{
		if (this.durability == 1)
			return "den";
		else
			return "dnu";
	}
}
