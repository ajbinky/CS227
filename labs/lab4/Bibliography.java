package lab4;

import java.util.Scanner;

public class Bibliography {

	public static void main(String[] args) {
		String s1 = "Dijkstra, Edsger#Go To Statement Considered Harmful#Communications of the ACM#1968#11";
	    String s2 = "Levoy, Marc#Display of Surfaces from Volume Data#IEEE Computer Graphics and Applications#1988#8";
	    String s3 = "Dean, Jeffrey; Ghemawat, Sanjay#MapReduce: Simplified Data Processing on Large Clusters#Communications of the ACM#2008#51";
	
	    BibItem item1 = help(s1);
	    BibItem item2 = help(s2);
	    BibItem item3 = help(s3);
	    
	    System.out.println(item1);
	    System.out.println(item2);
	    System.out.println(item3);
	}

	
	private static BibItem help(String s) {
		Scanner in = new Scanner(s);
		in.useDelimiter("#");
		BibItem item = new BibItem(in.next(),in.next(),in.next(),in.nextInt(),in.nextInt());
		in.close();
		
		return item;
	}
}
