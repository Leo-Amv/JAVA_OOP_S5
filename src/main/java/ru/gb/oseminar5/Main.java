package ru.gb.oseminar5;

import ru.gb.oseminar5.controller.UserController;
import ru.gb.oseminar5.model.FileOperation;
import ru.gb.oseminar5.model.FileOperationImpl;
import ru.gb.oseminar5.model.Repository;
import ru.gb.oseminar5.model.RepositoryFile;
import ru.gb.oseminar5.view.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}