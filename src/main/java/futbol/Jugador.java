package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	public Jugador() {
		this((short)289,(byte)7);
	}
	
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador(short golesMarcados,byte dorsal) {
		super();
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
	
        
	public int compareTo(Object f) {
		return Math.abs(this.getEdad() - ((Jugador) f).getEdad());
	}
	
	public String toString() {
		return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
				" con el dorsal "+ dorsal + ". Ha marcado "+ golesMarcados;
	}
	
	public boolean jugarConLasManos() {
		return false;
	}

}
