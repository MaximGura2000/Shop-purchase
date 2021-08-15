import java.util.Scanner;

public class Naradi  extends Zbozi {
	
	private int guaranty;

	Scanner sc = new Scanner(System.in);
	
	Naradi ()
	{
		super();
		setGuaranty();
	}
	
	public void setGuaranty()
	{
		System.out.println("Set guaranty : ");
		int newGuaranty = sc.nextInt();
		this.guaranty = newGuaranty;
	}
	
	public void setGuaranty(int newGuaranty)
	{
		this.guaranty = newGuaranty;
	}
	
	public int getGuaranty()
	{
		return guaranty;
	}
	
	String getJednotka()
	{
		if (this.guaranty == 1)
			return "mesic";
		else
			return "mesicu";
	}

}
