package com.kh.example.LeageOfLegend.vo;

import com.kh.example.LeageOfLegend.imp.skill;

public class Lucian extends Person implements skill{

	private final int ATTACK_REACH = 2;

	public Lucian() {
	}

	public Lucian(int p_field, int hp, int str, int arm) {
		super(p_field, hp, str, arm);
	}

	@Override
	public String toString() {
		return "루시안 : 내가 좀 거들어주지";
	}

	@Override
	public void skill_1() {
		// TODO Auto-generated method stub
		System.out.println("스킬사용 : 꿰뚫는 빛(Piercing Light) \n 10의 피해를 입었습니다.");
	}

	@Override
	public void skill_2() {
		System.out.println("스킬사용 : 타는 불길(Ardent Blaze) \n 20의 피해를 입었습니다.");
	}

	@Override
	public void skill_3() {
		System.out.println("스킬사용 : 끈질긴 추격(Relentless Pursuit) \n 자리를 2칸 이동하였습니다.");
	}

	@Override
	public void skill_4() {
		System.out.println("스킬사용 : 빛의 심판(The Culling)) \n 50의 피해를 입었습니다.");
	}
	
	public void ability() {
		System.out.println("루시안의 HP : " + super.getHp() + "   위치 : " + super.getP_field());
	}

}
