import java.util.Scanner;

public abstract class Zbozi {
 private String productName;
 private double cost;
 private static double dph = 0.21;
 
 Scanner sc = new Scanner(System.in);
 
 Zbozi ()
 {
	 setName();
	 setCost();
 }
 
 public void setName()
 {
	 System.out.println(" Set product name:");
	 String name = sc.next(); 
	 this.productName = name;
 }
 
 public String getName()
 {
	 return productName;
 }
 
 public void setCost()
 {
	 System.out.println(" Set product cost:");
	 double newCost = sc.nextDouble(); 
	 this.cost = newCost;
 }
 
 public double getCost()
 {
	 return cost*(1+dph);
 }
 
 abstract String getJednotka();
 
}
