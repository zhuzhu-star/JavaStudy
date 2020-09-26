package com.zb.ssm.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author ：zhubin
 * @date ：Created in 2020/9/18 1:56 上午
 * @description：这是一个切面aspect
 * @modified By：
 * @version: 1.0
 */

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectDemo01 {

    /**
     * 声明切入点的具体的方法
     */
    @Pointcut("execution(public * com.zb.ssm.spring.AspectTest.main())")
    public void aspect(){
        System.out.println("这是切面的方法");
    }

    /**
     * 前置通知
     */
    @Before("aspect()")
    public void doBefore(){
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     */
    @After("aspect()")
    public void doAfter(){
        System.out.println("后置通知");
    }

    /**
     * 这是环绕通知，可以自定义前后通知的内容，更灵活
     */
    @Around("execution(public * com.zb.ssm.spring.AspectTest.main())")
    public void doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("准备打球");
        proceedingJoinPoint.proceed();
        System.out.println("打球完了");
    }


}
