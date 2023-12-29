package AdventureGame;
import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	
	public void login() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Macera Oyununa Hoşgeldiniz!!");
		System.out.print("Oyuna Başlamadan Önce İsminizi Giriniz: ");
		//String playerName = scan.nextLine();
		player = new Player("*");
		player.selectCha();
		start();

		
	}
	
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("******************************************************************************");
			System.out.println();
			System.out.print("Lütfen Bir Mekan Seçiniz: ");
			System.out.println("1. Güvenli Ev --> Düşman Yok!!");
			System.out.println("2. Mağara --> Karşınıza Zombi Çıkabilir!!");
			System.out.println("3. Orman --> Karşınıza Zombi Çıkabilir!!");
			System.out.println("4. Nehir --> Karşınıza Ayı Çıkabilir!!");
			System.out.println("5. Mağaza --> Silah veya Zırh Alabilirsiniz.");
			int selLoc = scan.nextInt();
			
			
			while(selLoc < 0 || selLoc > 5) {
				
				System.out.print("Lütfen Geçerli Bir Yer Seçiniz: ");
				selLoc = scan.nextInt();
			}
			
			switch(selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 5: 
				location = new ToolStore(player);
				break;
				default:
					location = new SafeHouse(player);
			}
			
			if(!location.getLocation()) {
				System.out.println("Oyun Bitti!!");
				break;
				
				
			}
		}
		
	}

}
