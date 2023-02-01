package ua.goit.myname;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String name = "Dmytro";
        String lastName = "Lysak";
        Gson gson = new Gson();
        String json = gson.toJson(new MyName(name, lastName));
        System.out.println(json);
    }

    private static class MyName {
        private String name;
        private String lastName;

        MyName(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}
