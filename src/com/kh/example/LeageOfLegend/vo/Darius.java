package com.kh.example.LeageOfLegend.vo;

import com.kh.example.LeageOfLegend.imp.skill;

public class Darius extends Person implements skill{

	private final int ATTACK_REACH = 1;		// final은 네이밍을 전부다 대문자로 작성하는것이 원칙임
	
	
	public Darius() {
	}

	public Darius(int p_field, int hp, int str, int arm) {
		super(p_field, hp, str, arm);
	}

	@Override
	public String toString() {
		return "다리우스 : 오직 나만이 승리로 이끌 수 있다!";
	}

	@Override
	public void skill_1() {
		System.out.println("스킬사용 : 학살(Decimate) \n 루시안이 20의데미지를 입습니다.");
		
	
		
	}

	@Override
	public void skill_2() {
		// TODO Auto-generated method stub
		System.out.println("스킬사용 : 마비의 일격(Crippling strike) \n 루시안이 10의 데미지를 입고 움직이지 못합니다.");

	}

	@Override
	public void skill_3() {
		// TODO Auto-generated method stub
		System.out.println("스킬사용 :포획(Apprehend) \n 루시안은 20의 데미지를 입고 한 턴동안 기절합니다. ");
		
	}

	@Override
	public void skill_4() {
		// TODO Auto-generated method stub
		System.out.println("녹서스의 단두대(Noxian Guillotine) \n 루시안이 100의 데미지를 입었습니다.");
	
	}

	public void dead() {
		System.out.println("루시안의 승리.");
	}
	
	public void ability() {
		System.out.println("다리우스의 HP : " + super.getHp() + "   위치 : " + super.getP_field());
	}
	
	
}
