
public class Car {
	//Atributos
	private int fuel;
	private int maxspeed;
	private int speed;
	

	//Metodos
	public Car() {
		this.fuel=100;
		this.maxspeed=150;
		this.speed=0;
		System.out.println("Se creo el objeto de forma predefinida");
		System.out.println("Fuel: "+getFuel());
		System.out.println("Speed: "+getSpeed());
		System.out.println("MaxSpeed: "+getMaxspeed());
	}
	public Car(int speed, int maxspeed, int fuel) {
		this.fuel=fuel;
		this.maxspeed=maxspeed;
		this.speed=speed;
		System.out.println("Se creo el objeto con los siguientes valores: ");
		System.out.println("Fuel: "+getFuel());
		System.out.println("Speed: "+getSpeed());
		System.out.println("MaxSpeed: "+getMaxspeed());
	}
	
	public int getMaxspeed() {
		return maxspeed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed<=this.maxspeed) {
			this.speed = speed;
			System.out.println(getSpeed());
		}else {
			System.out.println("La velocidad maxima es "+this.maxspeed);
		}
	}
	
	public void refuel() {
		setFuel(100);
		System.out.println("Se recargo la gasolina");
		System.out.println(getFuel()+"%");
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public void drive() {
		if (getFuel()>0) {
			System.out.println("Se condujo durante un tiempo");
			if (getFuel()<20) {
				System.out.println("Y nos quedamos sin gasolina");
			}else {
				setFuel(getFuel()-20);
				System.out.println("Gasolina actual: "+getFuel()+"%");
			}
		} else {
			System.out.println("El vehiculo no tiene gasolina");
		}
	}
}
