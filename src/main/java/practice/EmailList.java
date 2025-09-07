package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {

    TreeSet<String> emailList = new TreeSet<>();

    public boolean regexEmail(String email) {
        email = email.toLowerCase();
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(regex);
    }

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        email = email.toLowerCase();
        if (regexEmail(email) && !emailList.contains(email)) {
            emailList.add(email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> emList = new ArrayList<>(emailList);
        return emList;
    }
}
