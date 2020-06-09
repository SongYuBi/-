package com.kh.example.LeageOfLegend.vo;

import com.kh.example.LeageOfLegend.imp.skill;

public class Darius extends Person implements skill{

	private final int ATTACK_REACH = 1;		// final�� ���̹��� ���δ� �빮�ڷ� �ۼ��ϴ°��� ��Ģ��
	
	
	public Darius() {
	}

	public Darius(int p_field, int hp, int str, int arm) {
		super(p_field, hp, str, arm);
	}

	@Override
	public String toString() {
		return "�ٸ��콺 : ���� ������ �¸��� �̲� �� �ִ�!";
	}

	@Override
	public void skill_1() {
		System.out.println("��ų��� : �л�(Decimate) \n ��þ��� 20�ǵ������� �Խ��ϴ�.");
		
	
		
	}

	@Override
	public void skill_2() {
		// TODO Auto-generated method stub
		System.out.println("��ų��� : ������ �ϰ�(Crippling strike) \n ��þ��� 10�� �������� �԰� �������� ���մϴ�.");

	}

	@Override
	public void skill_3() {
		// TODO Auto-generated method stub
		System.out.println("��ų��� :��ȹ(Apprehend) \n ��þ��� 20�� �������� �԰� �� �ϵ��� �����մϴ�. ");
		
	}

	@Override
	public void skill_4() {
		// TODO Auto-generated method stub
		System.out.println("�켭���� �ܵδ�(Noxian Guillotine) \n ��þ��� 100�� �������� �Ծ����ϴ�.");
	
	}

	public void dead() {
		System.out.println("��þ��� �¸�.");
	}
	
	public void ability() {
		System.out.println("�ٸ��콺�� HP : " + super.getHp() + "   ��ġ : " + super.getP_field());
	}
	
	
}
