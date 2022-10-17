package java011_casting.part01;

public class Java109_casting {

	public static void main(String[] args) {
			//SampleA sa = new SampleA();
		 	//SampleB sb = new SampleB();
			//sa = (SampleA)sb; // 다운캐스팅이 발생이 되려면 업캐스팅이 발생되어야 한다.
		
		Parent p = new Parent();
		Child c = new Child();
		
//		Parent p = new Child();
		p = c; //업캐스팅(up-casting)
		p.process();
//		p.call();
	
	
	//다운캐스팅(down-casting)
		Child d = (Child) p;

		Parent pt = new Child();
				pt.process();
//		pt.call();
				
				//다운캐스팅
				Child cn = (Child)pt;
				cn.call();
				
				
	}

}
