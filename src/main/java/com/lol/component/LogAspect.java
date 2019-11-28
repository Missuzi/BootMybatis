package com.lol.component;


import com.lol.common.Result;
import com.lol.po.DeptInfoList;
import jdk.nashorn.internal.parser.JSONParser;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.lol.Controller.*.*(..)))")
    public void log() {

    }

    @Around("log()&&args(arg)")
    public Result doAround(ProceedingJoinPoint proceedingJoinPoint, Object arg) throws Throwable {
        Result result;
        try {
            System.out.println("方法环绕start...around");
            result= (Result) proceedingJoinPoint.proceed();

            List<DeptInfoList> deptInfoList= (List<DeptInfoList>)result.getData();
           // List<DeptInfoList> objList=new ArrayList<>();
            //Object obj= JSONChange.jsonToObj(objList,deptInfoList.toString());
            LOGGER.info(deptInfoList.toString());
            LOGGER.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("方法环绕end...around");

        } catch (Exception e) {


            e.printStackTrace();
            result=Result.fail(e.getMessage());
        }
        return  result;

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("方法执行前执行......before");
        //获取当前请求对象
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        LOGGER.info("url={}", request.getRequestURL());
        LOGGER.info("method={}", request.getMethod());
        //ip
        LOGGER.info("ip={}", request.getRemoteHost());
        //方法
        LOGGER.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() +
                "." + joinPoint.getSignature().getName());
        //参数
        LOGGER.info("params={}", joinPoint.getArgs());
        LOGGER.info("------------------------------------------------------");
        //结果
        // LOGGER.info("result={}",joinPoint.pr);

    }

    @After("within(com.lol.Controller.*Controller)")
    public void after() {
        System.out.println("方法之后执行...after.");
        LOGGER.info("*************************************************");
    }

    @AfterReturning(pointcut = "log()", returning = "object")
    public void doAfterReturning(Object object) {
        System.out.println("方法执行完执行...afterRunning");
        LOGGER.info("responseResult={}", object);
        LOGGER.info("==========================================>");

    }

}
