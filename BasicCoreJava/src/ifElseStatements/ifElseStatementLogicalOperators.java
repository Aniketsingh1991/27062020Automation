package ifElseStatements;

public class ifElseStatementLogicalOperators {

	public static void main(String[] args) {
	//And operator
		int age=28;
	    boolean voterID=true;
	    
	    if(age>=18 && voterID)
	    {
	    	System.out.println("you are eligible");
	    }else {
	    	System.out.println("you are not eligible");
	    }
      //Or Operator
	    
	    boolean panCard=true;
	    boolean aadharCard=true;
	    
	    if(panCard || aadharCard)
	    {
	    	System.out.println("you are eligible");
	    }else {
	    	System.out.println("you are not eligible");
	    }
	}

}
