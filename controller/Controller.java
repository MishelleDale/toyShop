package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import botService.Customer;
import service.Service;

public class Controller {
    Service service = new Service();

    public String connectedStory()  {
        try {
            return service.initDataForModelMachine();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String eventHeandler(final Customer customer, String action) {
        String result = "";
        //boolean flag = true;
            try {
                System.out.println(action + " - это товар");
                for (String name : service.getListName()) {
                    System.out.println(name + " - это имя для проверки");
                    //flag = !(action.equals(name)) | (action.equals("отказ"));
                }
                result = service.startService(customer, action);
                //if (flag) {
                //    result = service.startService(customer, action);
                //} else {
                //    result = "Введены не коректные данные";
                //}
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        return result;
    }

    public ArrayList<String> getPrice() {
        return service.getListName();
    }
}
