package com.qijianguo.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {

	public static void main(String[] args) {
		RentingHouseImpl rentingHouse = new RentingHouseImpl();
		/*RentingHouseImpl proxyObj = (RentingHouseImpl) Enhancer.create(rentingHouse.getClass(), new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("------增强逻辑：条件：交通便利，房子漂亮-------");
				Object invoke = method.invoke(rentingHouse, objects);
				System.out.println("------增强逻辑：电费水费由中介代缴-----------");
				return invoke;
			}
		});
		proxyObj.rentHouse();*/
		RentingHouseImpl cglibProxy = (RentingHouseImpl) ProxyFactory.getInstance().getCglibProxy(rentingHouse);
		cglibProxy.rentHouse();
	}
}
