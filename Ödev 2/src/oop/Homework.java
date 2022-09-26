package oop;

public class Homework {

	public void ArraysDemo() {
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "memet";
		ogrenciler[1] = "mehmet";
		ogrenciler[2] = "memmmet";
		ogrenciler[3] = "melih";
		ogrenciler[4] = "melek";
		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}
	public void recapDemo1() {
		int sayi1 = 6;
		int sayi2 = 22;
		int sayi3 = 30;
		int enBuyuk = sayi1;
		
		if (enBuyuk< sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk< sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println(enBuyuk);
	}
	public void recapDemo2() {
		double[] lists = {1.2,3.2,5.3,6.3};
		double total = 0;
		double max = lists[0];
		
		for (double list : lists) {
			if (max<list) {
				max = list;
			}
			total = total + list;
			System.out.println(list);
			
		}
		System.out.println("toplam " + total);
		System.out.println("en büyük " + max);
	}
	public void isAsal(int number) {
		int isIt = number % 2;
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("sayi asal degildir");
		}else if (number < 1) {
			System.out.println("geçersiz sayi");
			return;
		}
		
		for(int i = 2; i <number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
			}
			if (isPrime) {
				System.out.println("asaldır");
			}else {
				System.out.println("sayi asal değil");
			}
		}
	public void vowels(char harf) {
	        switch (harf) {
	            case 'A':
	            case 'I':
	            case 'O':
	            case 'U':
	                System.out.println("Kalın sesli harf");
	                break;
	            default: 
	                System.out.println("İnce sesli harf");
	        }
	}
	public void perfectNumber(int number) {
	        int total = 0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                total = total + 1;
	            }
	        }
	        if (total == number) {
	            System.out.println("Mükemmel sayıdır");
	        } else {
	            System.out.println("Mükemmel sayı değildir");

	        }
	}
	public void friendNumber(int number1,int number2) {
		int total1 = 0;
		int total2 = 0;
		
		for(int i = 1; i<number1; i++) {
			if(number1 % i == 0) {
				total1 = i + total1;
			}
			
		}
		for(int j = 1; j<number2; j++) {
			if(number2 % j == 0) {
				total2 = j+ total2;
			}
		
		}
		if(total1 == number2 && total2 == number1) {
			System.out.println("arkadaş sayıdır");
		}else {
			System.out.println("arkadaş sayı değildir");
		}
	}
	public void findNumber(int[] sayilar,int aranacak) {
		boolean varMi = false;
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				System.out.println("bulunan :" + aranacak);
				return;
			} 
		}
		if(varMi) {
			System.out.println("buldummm ");
		}else {
			System.out.println("Bulamadımm");
		}
	}
	
}
