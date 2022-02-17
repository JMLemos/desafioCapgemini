package desafioCapgeminii;

import java.util.Scanner;

public class Questao02Capgemini {
		
		static boolean achouNumero = false;
		static boolean achouMaiuscula = false;
		static boolean achouMinuscula = false;
		static boolean achouSimbolo = false;
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
		    
		    System.out.println("A SENHA PRECISA CONTER: \n"
		    					+ "*6 caracteres.\n"
		    					+ "*1 número.\n"
		    					+ "*1 letra minúscula.\n"
		    					+ "*1 letra maiúscula.\n"
		    					+ "*1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n");
		    System.out.print("Digite a sua senha: ");
			String senha = scan.next();
			
			if (senha.length() < 6) {
				
				System.out.print("A senha digitada contém " + (senha.length()) + " caracteres, precisa conter no minimo 6! Faltam: " + (6 - senha.length() + " caractere(s) \n"));
				senhaForte(senha);
			}
			else {			
				senhaForte(senha);
				if(achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo) {
					System.out.println("A senha atende aos requisitos!");
				}
			}		
					
			scan.close();
		}
		
		public static boolean senhaForte(String senha) {
			
			for (char c : senha.toCharArray()) {
		         if (c >= '0' && c <= '9') {
		             achouNumero = true;
		         } else if (c >= 'A' && c <= 'Z') {
		             achouMaiuscula = true;
		         } else if (c >= 'a' && c <= 'z') {
		             achouMinuscula = true;
		         } else {
		             achouSimbolo = true;
		         }
		    }
			
			if(!achouNumero) {
				System.out.println("Sua senha precisa conter um número!");
			}
			if(!achouMaiuscula) {
				System.out.println("Sua senha precisa conter pelo menos uma letra Maiuscula!");
			}
			if(!achouMinuscula) {
				System.out.println("Sua senha precisa conter pelo menos uma letra Minuscula!");
			}
			if (!achouSimbolo) {
				System.out.println("Sua senha precisa conter pelo menos um caracter especial");
			}
			
			return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
		}
	}