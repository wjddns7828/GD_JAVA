package com.min.edu;

public class Bitwise_Operation {
	
	public void bitwise() {
		byte b = 5 & 4; // and 연산
		b= 5 | 4; // = 5 or 연산
		b = 5^4; // = 0101 ^ 0100 = 0001xor연산 다른것만 1반환
		b = 4<<1; // 0100 << 1 = 1000 8
		b = 4>>1; // 0100 >> 1 = 0010 2
		b = 4>>>1; // 0100 >>> 1 = 0010 (2 zero-fill , 부호비트를 포함하여 이동함)
		b = ~4; // invert (거꾸로바꾸는것) 0000 0100 ~ = 1111 1011 == -5
	}
	
}
