package futbol;

public class Main {

	public static void main(String[] args) {
		Futbolista f = new Futbolista("Alejo", 20, "Delantero") {
			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean jugarConLasManos() {
				// TODO Auto-generated method stub
				return false;
			}
		};

	}

}
