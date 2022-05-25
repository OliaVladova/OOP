package Reflection.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		Class clazz = RichSoilLand.class;
		Field[] fields = clazz.getDeclaredFields();

		while (!input.equals("HARVEST")){
			switch (input){
				case "private":
					Arrays.stream(fields).filter(field -> Modifier.isPrivate(field.getModifiers())).forEach(field -> System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()),field.getType().getSimpleName(),field.getName()));
					break;
				case "protected":
					Arrays.stream(fields).filter(field -> Modifier.isProtected(field.getModifiers())).forEach(field -> System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()),field.getType().getSimpleName(),field.getName()));
					break;
				case "public":
					Arrays.stream(fields).filter(field -> Modifier.isPublic(field.getModifiers())).forEach(field -> System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()),field.getType().getSimpleName(),field.getName()));
					break;
				case "all":
					Arrays.stream(fields).forEach(field -> System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()),field.getType().getSimpleName(),field.getName()));
					break;
			}
			input = scanner.nextLine();
		}

	}
}
