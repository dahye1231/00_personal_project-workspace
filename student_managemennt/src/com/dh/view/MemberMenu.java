package com.dh.view;

import java.util.Scanner;

import com.dh.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n======================== Good Academy ========================");
			
			System.out.println();

			System.out.println("1. 학생");
			System.out.println("2. 강사");
			
			System.out.println("3. 회원가입");
			System.out.println("4. 회원탈퇴");
			
			System.out.println("0. 종료");
			System.out.println();
			
			System.out.print("번호를 입력해주세요 >> ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1": student(); break;
			case "2": break;
			case "3": signUp(); break;
			case "4": break;
			case "0": System.out.println("\n이용해주셔서 감사합니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
			
		}
		
	}	
	
	
	//1
	public void student() {
		
		System.out.println("\n\n\n\n************************     학생 페이지     ************************");
		System.out.println();
	
//		login(id, pwd);
		
		System.out.println();
		
		System.out.println("1. 강의신청");
		System.out.println("2. 성적확인");
		System.out.println("3. 정보수정");
		System.out.println("\n번호를 입력해주세요 >> ");
		String sMenu = sc.nextLine();
		
		switch(sMenu) {
		case "1": break;
		case "2": break;
		case "3": break;
		default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
			
	}
	
	
	
	//2
		public void teacher() {
			
			System.out.println("\n\n\n\n************************     강사 페이지     ************************");
			System.out.println();
//		
//			System.out.print("아이디 : ");
//			String id = sc.nextLine();
//			System.out.print("비밀번호 : ");
//			String pwd = sc.nextLine();
//			
//			login(id, pwd);
//			
			System.out.println();
			
			System.out.println("1. 강의등록");
			System.out.println("2. 성적입력");
			System.out.println("3. 정보수정");
			System.out.println("\n번호를 입력해주세요 >> ");
			String tMenu = sc.nextLine();
			
			switch(tMenu) {
			case "1": break;
			case "2": break;
			case "3": break;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
				
			
			
		}
	
	
	
	
	
	//3
	public void signUp() {
		System.out.println("\n\n************************     회원가입     ************************");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		System.out.print("주민번호 : ");
		String pNo = sc.nextLine();
		System.out.print("전화번호 (하이픈(-) 제외하고 입력) : ");
		String phone = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("학생/강사/관리자 : ");
		String userMode = sc.nextLine();
		
		mc.signUp(userId, userPwd, userName, pNo, phone, address, userMode);
		
		//주민등록 번호 split해서 성별 판별하기 
		
	
	}
		
		
	//4
	public void deleteMember() {
		
		login();
		
		System.out.println("비밀번호 확인 : ");
		String userPwdCheck = sc.nextLine();
		
		//기존의 비밀번호와 확인 비밀번호가 같으면 계정 삭제 가능
		//계정을 삭제하겠냐고 묻고 y/n 삭제 가능
		
		
		
		
	}
	
	//로그인 메소드
	public void login() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();		
		
		mc.login(id, pwd);
	}
		
	
	
	
	
	
	
	//로그인 성공
	public void loginSuccese() {
		
		//System.out.println("님 환영합니다.");
		
	}
	
	
	
	
	//로그인 실패
	public void loginFail() {
		
		//System.out.println("없는 아이디입니다. 다시 입력해주세요.");
	//System.out.println("비밀번호를 잘못 입력했습니다. 다시 입력해주세요.");
	
	//아이디와 비밀번호 어떤 것이 틀렸는지 확인해주는 기능 추가
		
	}
	
}
