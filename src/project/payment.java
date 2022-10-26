package project;

import java.util.ArrayList;
import java.util.Scanner;

public class payment {
	private static ArrayList<Student> studentList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
		System.out.println("―――――――――――――――――――――――――――――――――――――");
		System.out.println(" 1.회원등록 | 2.회원수정 | 3.회원조회 | 4.회원삭제 | 5.결제등록| 6.종료  ");
		System.out.println("―――――――――――――――――――――――――――――――――――――");
		System.out.print("선택 ▶ ");
		int selectNum = Integer.parseInt(scanner.next());
		switch (selectNum) {
		case 1:
		createMember();
		break;
		case 2:
		modifyMember();
		break;
		case 3:
		searchMember();
		break;
		case 4:
		deleteMember();
		break;
		case 5:
		pay();
		break;
		case 6:
		run = false;
		System.out.println("프로그램을 종료합니다.");	
		break;
		default:
		System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요.");
		break;
		}
		}
		}
	
	private static void createMember() {
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		System.out.print("회원이름 : ");
		String name = scanner.next();
		System.out.print("연락처 : ");
		String phone = scanner.next();
	}
	
	private static void modifyMember() {
		// TODO Auto-generated method stub
		
	}
	
	private static void searchMember() {
		// TODO Auto-generated method stub
		
	}
	
	private static void deleteMember() {
		// TODO Auto-generated method stub
		
	}

	private static void pay() {
		// TODO Auto-generated method stub
		
	}

	

	

	

	

	}


