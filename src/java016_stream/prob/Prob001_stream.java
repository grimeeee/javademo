package java016_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.StringTokenizer;



/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java016_stream/prob/score.txt");
		FileReader fr = null;
		try {
			fr = new FileReader("src/java016_stream/score.txt");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		nr = new LineNumberReader(fr);
		String line = null;
		try {
			
		//readLine() : 파일의 끝이면 null을 리턴한다.
		while((line =nr.readLine()) != null) {
			System.out.printf("%d : %s\n", nr.getLineNumber(), line);
		}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
}catch(IOException e) {
	e.printStackTrace();
}finally {
	try {
		nr.close();
		fr.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}

}