package com.qijianguo.staticproxy;

/**
 * 静态代理
 */
public class RentingHouseProxy implements RentingHouse{

	private RentingHouse rentingHouse;

	public RentingHouseProxy(RentingHouse rentingHouse) {
		this.rentingHouse = rentingHouse;
	}

	@Override
	public void rentHouse() {
		System.out.println("------条件：交通便利，房子漂亮-------");
		System.out.println("中介帮我找房子");
		System.out.println("------电费水费由中介代缴-----------");
	}

}
