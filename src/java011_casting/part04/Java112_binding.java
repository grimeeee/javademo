package java011_casting.part04;

public class Java112_binding {
	
	//결합도가(의존도가) 낮아졌다.
	public static void proccess(HomeTv tv) {
		tv.turnOn();
		tv.soundUp();
		
		if(tv instanceof SamsungTv) {
			SamsungTv stv = (SamsungTv)tv;
			stv.move();
		}else if(tv instanceof LgTv) {
			LgTv ltv = (LgTv) tv;
			ltv.call();
		}
		
	}
	public static void main(String[] args) {
		LgTv lg = new LgTv("LG");
		proccess(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		proccess(ss);
		
			
	}

}
