package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		List<Shape> list = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + "data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char r = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine(); // or Color color = Color.valueOf(sc.next());
			if (r == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));
			} else if (r == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");

		for (Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()) + " " + sh.getColor());
		}

		sc.close();
	}

}
