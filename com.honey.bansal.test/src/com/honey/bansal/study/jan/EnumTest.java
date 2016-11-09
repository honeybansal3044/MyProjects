package com.honey.bansal.study.jan;

public class EnumTest {
	
	enum CoffieSize {
		BIG(8), LARGE(10), XLARGE(16) {
			public String getLidName() {
				return "A";
			}
		};
		CoffieSize(int size) {
			this.size = size;
		}
		
		private int size;
		
		public int getSize() {
			return this.size;
		}
		
		public String getLidName() {
			return "B";
		}
	}

	public static void main(String[] args) {
		System.out.println(CoffieSize.BIG.getSize());
		System.out.println(CoffieSize.XLARGE.getLidName());

	}

}
