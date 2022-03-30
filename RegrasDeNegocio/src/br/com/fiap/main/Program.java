package br.com.fiap.main;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fiap.entity.Contrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy) : ");
		String date1 = sc.next();
		Date date = sdf1.parse(date1);
		
		System.out.print("Contract Value: ");
		double contratoValor = sc.nextDouble();
		
		System.out.print("Enter number of installments: ");
		int parcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(number, date, contratoValor, parcelas);
		contrato.CalculoParcelas(contrato);
		
		
	
	}

}
