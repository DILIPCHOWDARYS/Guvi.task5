package com.task5_4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your DOB(yyyy-mm-dd): ");
		String input = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");


		sc.close();
	}

}
