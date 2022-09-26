package methodOverloading;

public class Main {

	public static void main(String[] args) {
	    DortIslem dortIslem=new DortIslem();
        System.out.println("Toplam : "+dortIslem.topla(3,7));
        System.out.println("Toplam : "+dortIslem.topla(3,7,56));//overloading
        System.out.println("Fark : "+dortIslem.fark(6,7));
        System.out.println("Çarpma : "+dortIslem.carp(5,7));
        System.out.println("Bölme : "+dortIslem.bol(19,7));
	}

}
