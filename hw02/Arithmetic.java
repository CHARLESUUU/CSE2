import java.text.DecimalFormat;

public class Arithmetic {
	public static void main(String[] args){
	//Number of pairs of socks
	int nSocks=3;
	//Cost per pair of socks
	//(‘$’ is part of the variable name)
	double sockCost$=2.58;
	//Number of drinking glasses
	int nGlasses=6;
	//Cost per glass
	double glassCost$=2.29;
	//Number of boxes of envelopes
	int nEnvelopes=1;
	//cost per box of envelopes
	double envelopeCost$=3.25;
	double taxPercent=0.06;
	
	double totalSockCost$ = nSocks*sockCost$;//total cost of socks
	double totalGlassCost$ =nGlasses*glassCost$;//total cost of  drinking glasses
	double totalEnvelopeCost$ =nEnvelopes*envelopeCost$;//total cost of  envelopes
	
	double taxSock = totalSockCost$*taxPercent;//sales tax of total cost of socks
	double taxGlass = totalGlassCost$*taxPercent;//sales tax of total cost of socks
	double taxEnvelope = totalEnvelopeCost$*taxPercent;//sales tax of total cost of socks
	
	double totalTax = taxSock + taxGlass + taxEnvelope; //total sale tax 
	
    double totalCost=totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; //total cost before tax
	double totalCostTax=totalCost + totalTax; //actual payment after tax
	
	
	DecimalFormat a = new DecimalFormat("##.00"); //a format that makes the results have two decimal places
	
	//Print out the results
	System.out.println("The cost of socks: $" + totalSockCost$ );
	System.out.println("The tax of socks: $"+ a.format(taxSock));
	System.out.println("The cost of drinking glasses: $" + totalGlassCost$ );
	System.out.println("The tax of drinking glasses: $"+ a.format(taxGlass));
	System.out.println("The cost of envelopes: $" + totalEnvelopeCost$);
	System.out.println("The tax of envelopes: $"+ a.format(taxEnvelope));
	System.out.println("The cost before tax: $" + totalCost);
	System.out.println("The total tax: $"+ a.format(totalTax));
	System.out.println("The cost after tax: $"+ a.format(totalCostTax));
 }
}
