package com.kh.example.LeageOfLegend.vo;

import com.kh.example.LeageOfLegend.imp.skill;

public class Ornn extends Person implements skill {

	private final int ATTACK_REACH = 1;
	
	public Ornn() {}
	
	public Ornn(int p_field, int hp, int str, int arm) {
		super(p_field,hp,str,arm);
	}

	@Override
	public String toString() {
		return "���ٰ� ��";
	}

	@Override
	public void skill_1() {
		// TODO Auto-generated method stub
		System.out.println("��� �տ�(Volcanic Rupture)");
	}

	@Override
	public void skill_2() {
		// TODO Auto-generated method stub
		System.out.println("�Ҳ� Ǯ����(Bellows Breath)");
	}

	@Override
	public void skill_3() {
		// TODO Auto-generated method stub
		System.out.println(" ȭ�� ����(Searing Charge)");
	}

	@Override
	public void skill_4() {
		// TODO Auto-generated method stub
		System.out.println("�������� ���� �θ�(Call Of The Forge God)");
	}
	
	
	
}
