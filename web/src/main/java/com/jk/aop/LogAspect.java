package com.jk.aop;

import com.alibaba.fastjson.JSON;
import com.jk.entity.LogBean;
import com.jk.service.LogSendService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Aspect
@Component
public class LogAspect {
    @Resource
    private LogSendService logSendService;

    //切面
    @Pointcut(value = "execution(* com.jk.controller.*.*(..))")
    public void logCut(){}

    //后置通知 完成后通知
    @AfterReturning(pointcut = "logCut()",returning = "obj")
    public void saveLog(JoinPoint joinPoint,Object obj){

        String methodName = joinPoint.getSignature().getName();

        String className = joinPoint.getTarget().getClass().getSimpleName();

        Object[] args = joinPoint.getArgs();

        StringBuffer sb = new StringBuffer();

        for (int i=0;i<args.length;i++){
            sb.append("第"+i+"个参数=").append(args[i]);
        }
       String responseParam = obj == null?"":obj.toString();

        LogBean logBean = new LogBean();
        logBean.setClassName(className);
        logBean.setMethodName(methodName);
        logBean.setRequestParam(sb.toString());
        logBean.setResponseParam(responseParam);

        String msg = JSON.toJSONString(logBean);
        logSendService.send(msg);
    }
}
