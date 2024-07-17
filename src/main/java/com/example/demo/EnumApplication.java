package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class EnumApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnumApplication.class, args);
		int id = 0;

		System.out.println("\n\n");
		System.out.print("Digite uma UF: ");
		Scanner sc = new Scanner(System.in);

		String ufDigitada = sc.nextLine();

		for(UnidadeFederal estado : UnidadeFederal.values()){
			if(estado.getUf().equals(ufDigitada)){
				System.out.println("O nome do estado é: " + estado.getNome()); 
			}
		}
	
		System.out.println("\n====================================");
		System.out.print("\nDigite uma região para ver os estados: ");

		String regiãoDigitada = sc.nextLine();
		System.out.println("\n====================================");
		System.out.println("\nOs estados dessa região são:");
		System.out.println();
		for(UnidadeFederal estadosRegião : UnidadeFederal.values()){
			if(estadosRegião.getRegiao().equals(regiãoDigitada)){
				id++;
				System.out.println(id + "- " + estadosRegião.getNome());
			}
		}
		System.out.println("\n\n");
		sc.close();
	}
}
