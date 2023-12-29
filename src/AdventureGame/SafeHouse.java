package AdventureGame;

public class SafeHouse extends NormalLocation {

	SafeHouse(Player player) {
		super(player,"Güvenli Ev");
		
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("İyileştiniz..");
		System.out.println("Şuan Güvenli Evdesiniz.");
		return true;
	}

}
