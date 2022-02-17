package desafioCapgeminii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao03Capgemini {

	public static void main(String[] args) {

		String palavra;
		
		Scanner leia = new Scanner(System.in);			
		System.out.print("DIGITE A PALAVRA: ");
        palavra = leia.nextLine();
		
        anagrama(palavra);
	}
	
	
	 static void anagrama( String palavra ){
	        
	        HashMap<String, Integer> mapa = new HashMap<>();
	        
	        for(int a  = 0; a <= palavra.length(); a++){
	            
	       
	            for( int b = a; b < palavra.length(); b++ ){
	                
	                char[] caracter = palavra.substring(a, b+1).toCharArray();
	                Arrays.sort(caracter);
	                String subCaract = new String(caracter);
	                
	                if(mapa.containsKey(subCaract)){
	                    mapa.put(subCaract, mapa.get(subCaract) + 1);
	                }                    
	                else{
	                    mapa.put(subCaract,1);
	                }                    
	            }
	        }
	        
	        int contAna = 0;
	        
	        for(String cont: mapa.keySet()) {
	            
	            int n = mapa.get(cont);
	            contAna += (n*(n-1))/2;
	        }
	        System.out.print("QUANTIDADE DE ANAGRAMAS:  " + contAna);
	    }
	    

	}

