import java.util.Scanner;
import java.util.regex.Pattern;
public class lab3
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String pas = scanner.nextLine();

if (Pattern.matches(".*[a-z]+.*",pas) && Pattern.matches(".*[A-Z]+.*",pas) &&
Pattern.matches(".*[0-9]+.*",pas) && pas.length() >= 8) {
System.out.println("Пароль надёжный!");
}else{
System.out.println("Пароль ненадёжный!");
}

System.out.println(pas);
}
}