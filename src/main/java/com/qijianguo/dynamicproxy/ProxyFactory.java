package com.qijianguo.dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象工厂：生成代理对象
 */
public class ProxyFactory {

	private static ProxyFactory instance;

	private ProxyFactory() {
	}

	public static ProxyFactory getInstance() {
		if (instance == null) {
			instance = new ProxyFactory();
		}
		return instance;
	}

	/**
	 * 获取代理对象
	 * @param obj 委托对象
	 * @return 代理对象
	 */
	public Object getProxy(Object obj) {
		Object proxyObj = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				(proxy, method, args) -> {
			System.out.println("------增强逻辑：条件：交通便利，房子漂亮-------");
			Object invoke = method.invoke(obj, args);
			System.out.println("------增强逻辑： 电费水费由中介代缴-----------");
			return invoke;
		});
		return proxyObj;
	}

	/**
	 * 获取代理对象
	 * @param obj 委托对象
	 * @return 代理对象
	 */
	public Object getCglibProxy(Object obj) {
		Object proxyObj = Enhancer.create(obj.getClass(), new MethodInterceptor() {
			@Override
			public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
				System.out.println("------增强逻辑：条件：交通便利，房子漂亮-------");
				Object invoke = method.invoke(obj, objects);
				System.out.println("------增强逻辑：电费水费由中介代缴-----------");
				return invoke;
			}
		});
		return proxyObj;
	}
}
