package havayaGoreEtkinlik;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		int sicaklik;
		Scanner scanner=new Scanner(System.in);
		sicaklik=scanner.nextInt();
		if(sicaklik<5) {
			System.out.println("kaya�a gidebilirsin");
		}else if (sicaklik>=5&&sicaklik<=15) {
			System.out.println("sinemaya gidebilirsi");
		}else if (sicaklik>15&&sicaklik<=25) {
			System.out.println("pikni�e gidebilirsi");
		}else {
			System.out.println("y�zmeye gidebilirsi");
		}

	}

}
