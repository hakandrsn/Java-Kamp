package method2;

public class Main {

	public static void main(String[] args) {
	     String mesaj="Bugün hava çok güzel!";
	        String yeniMesaj=mesaj.substring(0,2);

	        System.out.println(yeniMesaj);
	        System.out.println(topla());
	        System.out.println(topla(5,6));
	        int sayi=topla(5,16);
	        System.out.println(sehirVer());
	        System.out.println(sayi);
	        System.out.println(topla2(5,36,8,4,9,6,5));

	    }
	    public static void ekle(){
	        System.out.println("Eklendi");

	    }
	    public static void sil(){
	        System.out.println("Silindi");
	        
	    }
	    public static void guncelle(){
	        System.out.println("Güncellendi");
	        return;
	        
	    }
	    public static int topla(){
	        return 5; 
	    }
	    public static int topla(int sayi1,int sayi2){
	        return sayi1+sayi2; 
	    }
	    public static int topla2(int... sayilar){
	    	int toplam=0;
	        for(int sayi:sayilar){
	            toplam+=sayi;
	        }
	        return toplam;
	    }
	    public static String sehirVer(){
	        return "Ankara";
	    }
	}

