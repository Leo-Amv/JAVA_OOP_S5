package ru.gb.oseminar5;

import ru.gb.oseminar5.controller.UserController;
import ru.gb.oseminar5.model.*;
import ru.gb.oseminar5.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new NewFileOperation("users2.txt");
        Repository repository = new NewRepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}