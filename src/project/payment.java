package project;

import java.util.ArrayList;
import java.util.Scanner;

public class payment {
	private static ArrayList<member> memberList = new ArrayList<>();
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
		System.out.println("잘못 입력하셨습니다.\n다시 입력해주세요.");
		break;
		}
		}
		}
	
	private static void createMember() {
		System.out.println("『 회원번호를 등록해주세요 』");
		
		member m = new member();
	
	
		
		
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		
		boolean noneResult = false;
		for (int i = 0; i < memberList.size(); i++) {
		member mb = memberList.get(i);
		if (String.valueOf(mb.getMnum()).equals(String.valueOf(mnum))) {
		noneResult = true;
		System.out.println("중복된 회원번호입니다.\n초기화면으로 돌아갑니다.");
		return; 
		}
		}
		
		System.out.print("회원이름 : ");
		String name = scanner.next();
		System.out.print("연락처 : ");
		String phone = scanner.next();
		scanner.nextLine();

	
		m.setMnum(mnum);
		m.setName(name);
		m.setPhone(phone);
		memberList.add(m);
		System.out.println( name + "님 등록되었습니다.");
		}
	
	
	private static void modifyMember() {
		System.out.println("『 수정할 회원의 회원번호를 입력해주세요. 』");
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		
		boolean noneResult = false;
		for (int i = 0; i < memberList.size(); i++) {
		member m = memberList.get(i);
		if (String.valueOf(m.getMnum()).equals(String.valueOf(mnum))) {
		noneResult = true;
		System.out.print("회원이름 : ");
		String name = scanner.next();
		System.out.print("연락처 : ");
		String phone = scanner.next();
		System.out.print("회원권: ");
		String membership = scanner.next();
		System.out.print("PT횟수: ");
		String pt = scanner.next();
		System.out.print("운동복(이용/미이용) : ");
		String sweatsuit = scanner.next();
		System.out.print("락커(이용/미이용) : ");
		String locker = scanner.next();
		scanner.nextLine();
		
	
		m.setName(name);
		m.setPhone(phone);
		m.setMembership(membership);
		m.setPt(pt);
		m.setSweatsuit(sweatsuit);
		m.setLocker(locker);
		memberList.add(m);
		System.out.println(name + "님의 정보가 수정되었습니다.");
		break;
		
		}
		}
		if (!noneResult) {
		System.out.println("검색결과가 없습니다.");
		}
		}
		

	private static void searchMember() {
		System.out.println("『 검색할 회원의 회원번호를 입력해주세요. 』");
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		boolean noneResult = false;
		for (int i = 0; i < memberList.size(); i++) {
		member m = memberList.get(i);
		if (String.valueOf(m.getMnum()).equals(String.valueOf(mnum))) {
		noneResult = true;
		System.out.println("회원번호: " + m.getMnum() + " | 이름: " + m.getName() + " | 연락처: " + m.getPhone() + " | 회원권: " + m.getMembership() + " | PT: "
		+ m.getPt() + " | 운동복: " + m.getSweatsuit() + " | 락커: " + m.getLocker());
		System.out.println();
		System.out.println("검색결과입니다");
		break;
		}
		}
		if (!noneResult) {
		System.out.println("검색결과가 없습니다.");
		}
		}
	
	private static void deleteMember() {
		System.out.println("『 삭제할 회원의 회원번호를 입력해주세요. 』");
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		boolean noneResult = false;
		for (int i = 0; i < memberList.size(); i++) {
		member m = memberList.get(i);
		if (String.valueOf(m.getMnum()).equals(String.valueOf(mnum))) {
		noneResult=true;
		memberList.remove(i);
		System.out.println(m.getName() + "님의 정보가 삭제되었습니다.");
		break;
		}
		}
		if (!noneResult) {
		System.out.println("검색결과가 없습니다.");
		}
		}

	private static void pay() {
		System.out.print("회원번호 : ");
		int mnum = scanner.nextInt();
		boolean noneResult = false;
		for (int i = 0; i < memberList.size(); i++) {
		member m = memberList.get(i);
		if (String.valueOf(m.getMnum()).equals(String.valueOf(mnum))) {
		noneResult = true;
		System.out.println("(1개월 / 3개월 / 6개월 / 12개월)");
		System.out.print("회원권: ");
		String membership = scanner.next();
		System.out.print("PT횟수: ");
		String pt = scanner.next();
		System.out.print("운동복(이용/미이용) : ");
		String sweatsuit = scanner.next();
		System.out.print("락커(이용/미이용) : ");
		String locker = scanner.next();
		System.out.println("결제정보 등록 완료!");
		m.setMembership(membership);
		m.setPt(pt);
		m.setSweatsuit(sweatsuit);
		m.setLocker(locker);
		
		break;
		}
		}
		if (!noneResult) {
		System.out.println("검색결과가 없습니다.");
		}
		}
		}

