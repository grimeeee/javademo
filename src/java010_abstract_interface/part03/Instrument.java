package java010_abstract_interface.part03;
//피아노를 연주하다 =>  손으로 친다
//플롯을 연주하다. => 입으로 분다.
abstract public class Instrument {
	String name;
	
	public Instrument() {
		
	}

	public Instrument(String name) {
		this.name = name;
	}
	
	abstract public void play();
}
