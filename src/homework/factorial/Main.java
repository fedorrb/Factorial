package homework.factorial;
import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> cls = FactorialUtil.class;
		Method[] methods = cls.getDeclaredMethods();
		for(Method m: methods){
			if(m.isAnnotationPresent(TestFunc.class)){
				TestFunc testFunc = m.getAnnotation(TestFunc.class);
				boolean res = (Boolean)m.invoke(null, testFunc.n(), testFunc.check());
				System.out.println(m.getName() + ":" + res);
			}
		}		
		
		//Run run = new Run();
		//run.calcFactorial(0, 10);
	}
}
