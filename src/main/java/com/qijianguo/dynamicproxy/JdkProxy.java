package com.qijianguo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {

	public static void main(String[] args) {
		RentingHouse rentingHouse = new RentingHouseImpl();

		// JDK动态代理
		jdkProxyTest(rentingHouse);

		// 工厂模式之JDK动态代理
		jdkProxyFactoryTest(rentingHouse);

	}

	public static void jdkProxyTest(RentingHouse rentingHouse) {
		RentingHouse proxy = (RentingHouse) Proxy.newProxyInstance(rentingHouse.getClass().getClassLoader(), rentingHouse.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("------条件：交通便利，房子漂亮-------");
				Object invoke = method.invoke(rentingHouse, args);
				System.out.println("------电费水费由中介代缴-----------");
				return invoke;
			}
		});
		proxy.rentHouse();
	}

	public static void jdkProxyFactoryTest(RentingHouse rentingHouse) {
		RentingHouse proxy = (RentingHouse) ProxyFactory.getInstance().getProxy(rentingHouse);
		proxy.rentHouse();
	}
}
