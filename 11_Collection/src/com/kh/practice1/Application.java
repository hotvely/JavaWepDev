package com.kh.practice1;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public static void main(String[] args) {

		Application app = new Application();
		app.mainMenu();

	}

	public void mainMenu() {
		while (true) {

			System.out.println("===== 메인 메뉴 =====\r\n" + "1. 마지막 위치에 곡 추가 \n" + "2. 첫 위치에 곡 추가 \n" + "3. 전체 곡 목록 출력 \n"
					+ "4. 특정 곡 검색 \n" + "5. 특정 곡 삭제\n" + "6. 특정 곡 정보 수정 \n" + "7. 곡명 오름차순 정렬 \n" + "8. 가수명 내림차순 정렬\n"
					+ "9. 종료");
			System.out.print("메뉴 번호 입력 > ");
			try {
				int menuIdx = Integer.parseInt(sc.nextLine());
				switch (menuIdx) {
				case 1:
					addList();
					break;
				case 2:
					addAtZero();
					break;
				case 3:
					printAll();
					break;
				case 4:
					searchMusic();
					break;
				case 5:
					removeMusic();
					break;
				case 6:
					setMusic();
					break;
				case 7:
					ascTitle();
					break;
				case 8:
					descArtist();
					break;
				case 9:
					System.out.println("프로그램 종료");
					return;

				}
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다 : " + e.getMessage());
			}

		}

	}

	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 > ");
		String title = sc.nextLine();
		System.out.print("가수 명 > ");
		String artist = sc.nextLine();

		if (mc.addList(new Music(title, artist)))
			System.out.println("추가 성공");
		else
			System.out.println("추가 실패");
	}

	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 > ");
		String title = sc.nextLine();
		System.out.print("가수 명 > ");
		String artist = sc.nextLine();

		if (mc.addAtZero(new Music(title, artist))) {
			System.out.println("추가 성공");
		} else
			System.out.println("추가 실패");
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addAtZero()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔 창에 출력
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");

		ArrayList<Music> list = new ArrayList<>();
		list = mc.printAll();
		for (Music music : list) {
			System.out.println(music);
		}
		// MusicController에 printAll() 반환 값을 출력한다.
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 이름 > ");
		Music music = mc.searchMusic(sc.nextLine());
		System.out.println(music != null ? music + "를 검색했습니다." : "검색할 곡이 없습니다.");

		// 사용자에게 곡 이름을 받고 MusicController에 있는 searchMusic으로 값을 넘긴다.
		// searchMusic()의 반환 값에 따라 반환 값이 없으면 “검색한 곡이 없습니다.”
		// 반환 값이 있으면 “가수 명 – 곡 명 을 검색 했습니다.” 콘솔 창에 출력
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("곡 이름 > ");
		Music temp = mc.removeMusic(sc.nextLine());
		if (temp == null)
			System.out.println("삭제할 곡이 없습니다.");
		else {
			System.out.println(temp + "을 삭제했습니다.");
		}
		// 사용자에게 삭제할 곡의 이름을 직접 받고 MusicController에 removeMusic으로
		// 값을 넘긴다. removeMusic()의 반환 값에 따라 반환 값이 없으면 “삭제할 곡이 없습니다.”
		// 반환 값이 있으면 “가수 명 – 곡 명을 삭제 했습니다.” 콘솔 창에 출력
	}

	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("검색할 곡 명 > ");
		String title = sc.nextLine();

		Music temp = null;
		mc.setMusic(title, temp);
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");

		for (Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}

	public void descArtist() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");

		for (Music music : mc.descArtist()) {
			System.out.println(music);
		}
	}

}
