package tinhtiendien;

public class TienDien {
	private float soDien;
	private float soTienDien;
	
	public TienDien() {
	}

	public TienDien(float soDien, float soTienDien) {
		this.soDien = soDien;
		this.soTienDien = soTienDien;
	}

	public float getSoTienDien() {
		return soTienDien;
	}

	public void setSoTienDien(float soTienDien) {
		this.soTienDien = soTienDien;
	}

	public float getSoDien() {
		return soDien;
	}

	public void setSoDien(float soDien) {
		this.soDien = soDien;
	}
	
}
