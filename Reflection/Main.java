package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;
        /*System.out.println(clazz);
        System.out.println(clazz.getSuperclass());
        Class[] interfaces = clazz.getInterfaces();

        for (Class interfaceOfMy : interfaces) {
            System.out.println(interfaceOfMy);
        }
        Object newObject = clazz.getDeclaredConstructor().newInstance();
        System.out.println(newObject);*/

       /* Method[] methods = clazz.getDeclaredMethods();
        Method[] getters = Arrays.stream(methods).filter(m ->
                m.getName().startsWith("get") && m.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName)).toArray(Method[]::new);

        Method[] setters = Arrays.stream(methods).filter(m ->
                m.getName().startsWith("set") && m.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName)).toArray(Method[]::new);

        Arrays.stream(getters).forEach(getter -> System.out.printf("%s will return class %s\n",getter.getName(),getter.getReturnType().getName()));
        Arrays.stream(setters).forEach(setter -> System.out.printf("%s and will set field of class %s\n",setter.getName(),setter.getParameterTypes()[0].getName()));
    */

        Field[] fields = Reflection.class.getDeclaredFields();

        Arrays.stream(fields).filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.printf("%s must be private!%n", f.getName()));

        Method[] methods = Reflection.class.getDeclaredMethods();

        Arrays.stream(methods).filter(m -> m.getName().startsWith("get") &&
                !Modifier.isPublic(m.getModifiers())).sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be public!%n", m.getName()));

        Arrays.stream(methods).filter(m -> m.getName().startsWith("set") &&
                !Modifier.isPrivate(m.getModifiers())).sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.printf("%s have to be private!%n", m.getName()));
    }
}
