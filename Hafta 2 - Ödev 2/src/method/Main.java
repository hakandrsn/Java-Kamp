package method;

public class Main {

	public static void main(String[] args) {
    sayiBulmaca(); 
    }
    public static void sayiBulmaca(){
        int[] sayilar=new int[]{1,2,5,4,7,8,10,9,0};
        int aranacak=6;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj;

        if(varMi){
            mesaj="Sayı Mevcut : "+ aranacak;       
        }
        else{
            mesaj="Sayı Mevcut Değil : "+ aranacak;           
        }
        mesajVer(mesaj);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
	}

}
