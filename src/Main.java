import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Annual return Investment Mode
		System.out.println("What is your expected annual return on investment when retired? ");
		double annualReturn1 = input.nextDouble();
		
		//Year Retired
		System.out.println("How long do you plan to retire for? ");
		double retireYears = input.nextDouble();
		
		//Required Income
		System.out.println("What is your require income? ");
		double requiredIncome = input.nextDouble();
		
		//Monthly SSI
		System.out.println("What is your monthly SSI? ");
		double monthlySSI = input.nextDouble();
		
		
		double r;
		double n;
		double y;
		double f;
		double p;
		boolean t;
		
		
		double PV;
		r = (annualReturn1/12); //Annual Return from PV
		n = retireYears *12; // Years Retired
		y = requiredIncome - monthlySSI; //Required income - monthly SSI
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r, n, y, f, t);
		
		System.out.println(PV);
		
		//Annual Return2
		System.out.println("What is your expected annual return on investment before retirement? ");
		double annualReturn2 = input.nextDouble();
		
		//Number of years you work
		System.out.println("How many years do you plan to work? ");
		double yearsWorked = input.nextDouble();
		
		double PMT;
		r = (annualReturn2 /12);
		n = yearsWorked *12;
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r,n,p,f,t);
		
		System.out.println(PMT);
		
		//TO DO: COMMENTS, FORMAT PMT, GITHUB
	}

}
