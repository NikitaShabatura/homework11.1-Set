import practice.EmailList;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            
            //TODO: write code here

            if (input.equals("LIST")) {
                for (String email : emailList.getSortedEmails()) {
                    System.out.println(email);
                }
                continue;
            }

            if (input.substring(0, input.indexOf(' ')).equals("ADD")) {
                int spase = input.indexOf(' ');
                String email = input.substring(spase + 1);
                if (!emailList.regexEmail(email)) {
                    System.out.println(WRONG_EMAIL_ANSWER);
                    continue;
                }
                emailList.add(email);
            }
        }
    }
}
