package com.myplugin.plsqlic3.backend.casegen.tkmutation.util;

import org.antlr.v4.runtime.CommonToken;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtil {
    /**
     * 通过字符串串调用方法
     *
     * @param classAndMethod 类名-方法名，通过此字符串调用类中的方法
     * @param paramTypes     方法类型列表(因为方法可能重载)
     * @param params         需要调用的方法的参数列表
     * @return
     */
    public static Object call(String classAndMethod, Class[] paramTypes, Object[] params) {
        String[] args = classAndMethod.split("-");
        //要调用的类名
        String className = args[0];
        //要调用的方法名
        String methodName = args[1];
        try {
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName, paramTypes);
            method.setAccessible(true);
            //第一个参数类实例(必须有对象才能调用非静态方法,如果是静态方法此参数可为null)
            //第二个是要传给方法的参数
            return method.invoke(null, params);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setCommonText(CommonToken token, String text) {
        try {
            Class<?> clazz = Class.forName("org.antlr.v4.runtime.CommonToken");
            Field field = clazz.getDeclaredField("text");
            field.setAccessible(true);
            field.set(token, text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
