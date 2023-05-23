package com.kh.step1.model;


public class TV {
	// 속성(property) == 멤버변수, 특성(attribute)

	private boolean power; // 전원상태(on off)
	private int channel = 1; // 현재 채널?

	public TV() {
	}

	public TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
	}

	protected boolean getPower() {
		return this.power;
	}

	protected boolean setPower(boolean power) {
		return this.power = power;
	}
	
	protected int getChannel() {
		return channel;
	}

	protected int setChannel(int channel) {
		return this.channel = channel;
	}

	// 기능(function) : 메소드 (method)

	protected void power() { // tv를 키거나 끄는 기능
		this.power = !this.power;
	}

	protected void channelUp() { // 채널 업!
		++this.channel;
	}

	protected void channelDown() { // 채널 다운!
		--this.channel;
	}

}