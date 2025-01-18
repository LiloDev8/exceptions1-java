package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Main {

	public static void main(String[] args){
		
//		Scanner sc = new Scanner(System.in);
//		
//		method1();
//		
//		System.out.println("Fim do Programa");
//		sc.close();
//
//	}
//	
//	 public static void method1() {
//		 System.out.println("*****MeTHod1 Start");
//		 method2();
//		 
//		 System.out.println("*****MeTHod1 Start");
//	 }
//	
//    public static void method2() {
//    	System.out.println("*****MeTHod2 Start");
//    	
//    	Scanner sc = new Scanner(System.in);
//    	try {
//			String[] vect = sc.nextLine().split(" ");
//			int position = sc.nextInt();
//			System.out.println(vect[position]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Posição Inválida");
//			e.printStackTrace();
//			sc.next();
//			
//		}catch(java.util.InputMismatchException e ) {
//			System.out.println("Erro de Input");
//		}
//    	sc.close();
//    	System.out.println("*****MeTHod2 Start");
		
//		Scanner sc = new Scanner(System.in);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		
//		try {
//		System.out.println("Room number : ");
//		int number = sc.nextInt();
//		
//		System.out.println("Check-in date (dd/MM/yyyy)");
//		Date checkIn = sdf.parse(sc.next());
//		
//		System.out.println("Check-out date (dd/MM/yyyy)");
//		Date checkOut = sdf.parse(sc.next());
//	
//			Reservation reservation = new Reservation(number, checkIn, checkOut);
//			System.out.println("Reservation: " + reservation.toString());
//			
//			System.out.println();
//			System.out.println("Enter data to update the reservation:");
//			
//			System.out.println("Check-in date (dd/MM/yyyy)");
//			checkIn = sdf.parse(sc.next());
//			
//			System.out.println("Check-out date (dd/MM/yyyy)");
//			checkOut = sdf.parse(sc.next());
//			
//				
//		reservation.UpdateDates(checkIn, checkOut);
//		
//	
//	    System.out.println("Reservation: " + reservation.toString());
//	
//		}catch(ParseException e){
//			System.out.println("Invalid date format");
//			
//		}catch(DomainException e) {
//			System.out.println("Error in reservation " + e.getMessage());
//			
//		}catch(RuntimeException e) {
//			System.out.println("Unexpected error");
//		}
//		
//	
//	sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("InitiaL balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
	    
		System.out.println();
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		System.out.println(acc.toString());
		
		}catch(WithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
			
		}catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		sc.close();
	}

}
