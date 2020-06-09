package com.kh.example.LeageOfLegend.view;

import java.awt.Label;
import java.math.MathContext;
import java.util.Random;
import java.util.Scanner;

import com.kh.example.LeageOfLegend.vo.Darius;
import com.kh.example.LeageOfLegend.vo.Lucian;
import com.kh.example.LeageOfLegend.vo.Ornn;
import com.kh.example.LeageOfLegend.vo.Person;

public class View {
	Person ornn = new Ornn(1, 200, 10, 15);
	Person dari = new Darius(1, 180, 15, 8);
	Person Lu = new Lucian(5, 130, 20, 5);

	public void League_View() {

		Scanner sc = new Scanner(System.in);
		System.out.println("League Of Legend");
		System.out.println("Start");
		System.out.println("1. Ornn");
		System.out.println("2. Darius");
		System.out.print("Choose the Champion : ");
		int selected_champion = sc.nextInt();

		if (selected_champion > 0 && selected_champion < 3) {
			switch (selected_champion) {
			case 1:
				System.out.println("selected Chapion : Ornn");

				ornn.toString();
				System.out.println("아직 구현되지 않았스빈다.");
				break;
			case 2:
				System.out.println("selected Chapion : Darius");
				System.out.println(dari.toString());
				System.out.println(Lu.toString());
				if (dari instanceof Darius) {
					dari.toString();
				}
				turn();
				break;
			}
		} else {
			System.out.println("Please enter again");
		}
	}

	public void turn() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		boolean tft = true;
		int cnt = 1;
		int mabi = 0;
		int gojung = 0;

		do {
			mabi = 0;gojung = 0;
			if (Lu.getHp() < 0) {
				System.out.println("루시안 패배.");
				return;
			} else if (dari.getHp() < 0) {
				System.out.println("다리우스 패배.");
				return;
			}
			int skill = rd.nextInt(4) + 1;
			System.out.println();
			System.out.println(cnt + "번째 턴");

			if (Lu instanceof Lucian) {
				Lu.ability();
			}
			if (dari instanceof Darius) {
				dari.ability();
			}

			System.out.println("1.자리 한칸 앞으로 이동하기");
			System.out.println("2.공격하기");
			System.out.print("행동 : ");
			int selected_menu = sc.nextInt();
			System.out.println();

			switch (selected_menu) {
			case 1:
				dari.setP_field((dari.getP_field() + 1));
				System.out.println("한 칸 이동하여 " + dari.getP_field() + "번째 칸에 있습니다.");
				break;
			case 2:
				if (Lu.getP_field() == dari.getP_field() + 1 || Lu.getP_field() == dari.getP_field() - 1) {
					switch (skill) {
					case 1:
						if (dari instanceof Darius) {
							((Darius) dari).skill_1();
							Lu.setHp(Lu.getHp() - 20);
						}
						break;
					case 2:
						if (dari instanceof Darius) {
							((Darius) dari).skill_2();
							Lu.setHp(Lu.getHp() - 10);
							gojung = 1;
						}
						break;
					case 3:
						if (dari instanceof Darius) {
							((Darius) dari).skill_3();
							Lu.setHp(Lu.getHp() - 20);
							mabi = 1;
						}
						break;
					case 4:
						if (dari instanceof Darius) {
							((Darius) dari).skill_4();
							Lu.setHp(Lu.getHp() - 100);
						}
						break;
					}
				} else {
					System.out.println("거리가 멀어 공격하지 못합니다. 한칸 앞으로 이동합니다.");
					dari.setP_field((dari.getP_field() + 1));
					System.out.println("한 칸 이동하여 " + dari.getP_field() + "번째 칸에 있습니다.");
				}
				break;

			}

			cnt++;
			if(Lu.getHp() > 0) {
				int lucian = rd.nextInt(4) + 1;
				if (mabi == 1) {
					System.out.println("루시안 마비상태 턴 넘김.");
				} else if (gojung == 1) {
					lucian -= 1;
					System.out.println("루시안의 자리 이동이 제한됩니다.");
					switch (lucian) {
					case 0:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_1();
							dari.setHp(dari.getHp() - 10);
						}
						break;
					case 1:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_1();
							dari.setHp(dari.getHp() - 10);
						}
						break;
					case 2:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_2();
							dari.setHp(dari.getHp() - 20);
						}
						break;
					case 3:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_4();
							dari.setHp(dari.getHp() - 50);
							;
						}
						break;
					}
				} else {
					switch (lucian) {

					case 1:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_1();
							dari.setHp(dari.getHp() - 10);
						}
						break;
					case 2:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_2();
							dari.setHp(dari.getHp() - 20);
						}
						break;
					case 3:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_3();
							Lu.setP_field(Lu.getP_field() + 2);
						}
						break;
					case 4:
						if (Lu instanceof Lucian) {
							((Lucian) Lu).skill_4();
							dari.setHp(dari.getHp() - 50);
							;
						}
						break;
					}
				}
			}else {
				
			}
			

		} while (tft);
	}
}
