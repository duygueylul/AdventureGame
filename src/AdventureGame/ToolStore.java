package AdventureGame;
import java.util.Scanner;

public class ToolStore extends NormalLocation {

	
	ToolStore(Player player) {
		super(player, "Mağaza");
		
	}

	
	public boolean getLocation() {
		
		System.out.println("Para: " + player.getMoney());
		System.out.println("1. Silahlar");
		System.out.println("2. Zırhlar");
		System.out.println("3. Çıkış");
		System.out.print("Seçiminiz: ");
		int selTool = scan.nextInt();
		int selItemID;
		
		switch(selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			break;
			default:
				break;
		}
		return true;
	}
	
	public int weaponMenu() {
		System.out.println("1. Tabanca\t < Para : 25 - Hasar : 2> ");
		System.out.println("2. Kılıç\t < Para : 35 - Hasar : 3> ");
		System.out.println("3. Tüfek\t < Para : 45 - Hasar : 7> ");
		System.out.println("4. Çıkış");
		System.out.print("Silah Seçiniz: ");
		
		int selWeaponID = scan.nextInt();
		return selWeaponID;
	}
	
	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String wName = null;
		switch(itemID) {
		case 1:
			damage = 2;
			wName = "Tabanca";
			price = 5;
			break;
		case 2:
			damage = 3;
			wName = "Kılıç";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Tüfek";
			price = 45;
			break;
			default:
				System.out.println("Geçersiz İşlem!!");
				break;
				
		}
		
		
		if(player.getMoney() > price) {
			player.getInv().setDamage(damage);
			player.getInv().setwName(wName);
			player.setMoney(player.getMoney() - price);
			System.out.println(wName + "Silah Satın Aldınız, Önceki Hasar: " + player.getDamage() + ", Yeni Hasar: " + (player.getDamage() + player.getInv().getDamage()));
			System.out.println("Kalan Para: " + player.getMoney());
		}
		else {
			System.out.println("Para Yetersiz!!");
		}
		
	}
	
}
