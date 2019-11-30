package debutant;

import java.util.HashMap;

public class NumericalOfAString {
	
	public static void main(String[]args) {
		System.out.println(NumericalOfAString.numericals("Hello world"));
//		int [] numbers= {0,1,2,3,4,5,6,7,8,9};
//		 System.out.println(createPhoneNumber(numbers));
	}
	
	
	
	public static String numericals(String s) {
		//Déclaration de la variable qui contiendra la combinaison de nombre
		StringBuilder combinaison=new StringBuilder();
		
		
		//Création d'une hashmap
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for (int i=0 ;i<s.length();++i) {
			String key=s.substring(i, i+1);
			if(hm.containsKey(key)){
				hm.put(key, hm.get(key)+1);
			}else {
				hm.put(key, 1);				
			}
			combinaison.append(hm.get(key));
		}
		
		
		//Restitution de la combinaison formée
		
		
		return combinaison.toString();
		

	}
	
	public static String createPhoneNumber(int[] numbers) {
	    // Your code here!
	    StringBuilder num=new StringBuilder();
	    num.append("(");	   
	    for (int i:numbers) {
	    	if (i==3) {num.append(") ");}
	    	else if(i==6) {num.append("-");}
	    	num.append(i);
	    }
	    
	    
	    return num.toString();
			
		
	    
	  }
}
