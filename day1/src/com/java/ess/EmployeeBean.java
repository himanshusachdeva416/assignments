package com.java.ess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmployeeBean implements InitializingBean, DisposableBean, ApplicationContextAware, BeanFactoryAware, BeanNameAware, BeanPostProcessor, BeanFactoryPostProcessor {



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName calling..");

	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory  calling..");

	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext calling..");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy calling..");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet..");

	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("postProcessBeanFactory..");

	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

}
