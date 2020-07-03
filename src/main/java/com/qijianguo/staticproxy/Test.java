package com.qijianguo.staticproxy;

public class Test {

	public static final void main(String[] args) {
		RentingHouse rentingHouse = new RentingHouseImpl();
		// 不适用代理类
		//rentingHouse.rentHouse();
		// 使用静态代理，需要为每个接口提供一个代理类
		RentingHouseProxy rentingHouseProxy = new RentingHouseProxy(rentingHouse);
		rentingHouseProxy.rentHouse();
	}
}
