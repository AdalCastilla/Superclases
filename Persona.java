package superclases;

public abstract class Persona {

	private String nombre;
	boolean esAlto=false;
	boolean esActractiva=true;
	boolean usaGorra=false;
	boolean tienePareja=true;
	
	public Persona(){
	}
	
	
	public void setNombre(String s) {
		nombre=s;
	}
	
	public String getNombre() {
		return nombre;
	}
	public boolean Altura(int num) {
		if (num == 0) {
			return esAlto;
		}else {
			return true;
		}
	}
		
	public boolean Atractiva(int num) {
			if (num == 0) {
				return esActractiva;
			}else {
				return false;
			}
		}
	public boolean Gorra(int num) {
		if (num == 0) {
			return usaGorra;
		}else {
			return false;
		}
	}
	
	public boolean Pareja(int num) {
		if (num == 0) {
			return tienePareja;
		}else {
			return false;
		}
	}
	
}

