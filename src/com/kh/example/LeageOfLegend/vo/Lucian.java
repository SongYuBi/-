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
		return "��þ� : ���� �� �ŵ������";
	}

	@Override
	public void skill_1() {
		// TODO Auto-generated method stub
		System.out.println("��ų��� : ��մ� ��(Piercing Light) \n 10�� ���ظ� �Ծ����ϴ�.");
	}

	@Override
	public void skill_2() {
		System.out.println("��ų��� : Ÿ�� �ұ�(Ardent Blaze) \n 20�� ���ظ� �Ծ����ϴ�.");
	}

	@Override
	public void skill_3() {
		System.out.println("��ų��� : ������ �߰�(Relentless Pursuit) \n �ڸ��� 2ĭ �̵��Ͽ����ϴ�.");
	}

	@Override
	public void skill_4() {
		System.out.println("��ų��� : ���� ����(The Culling)) \n 50�� ���ظ� �Ծ����ϴ�.");
	}
	
	public void ability() {
		System.out.println("��þ��� HP : " + super.getHp() + "   ��ġ : " + super.getP_field());
	}

}
