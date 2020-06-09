package com.kh.example.LeageOfLegend.vo;

public class Person {

	private int gold = 0;
	private int level = 1;
	private int exp = 0;
	private int p_field;
	private int hp;
	private int str;
	private int arm;

	public Person() {
	}

	public Person(int p_field, int hp, int str, int arm) {
		this.p_field = p_field;
		this.hp = hp;
		this.str = str;
		this.arm = arm;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getArm() {
		return arm;
	}

	public void setArm(int arm) {
		this.arm = arm;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "지정한 챔피언의 능력치가 조정되었습니다.";
	}

	public int getP_field() {
		return p_field;
	}

	public void setP_field(int p_field) {
		this.p_field = p_field;
	}
	
	public void ability() {
		System.out.println();
	}

}
