package org.example;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        int choice;
        String s;
        String key;
        String value;
        boolean mapElement;
        while (true){
            logger.info("1. Add \n2. Remove \n3. Print \n4. Exit");
            logger.info("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    logger.info("Enter the Key : ");
                    key = sc.next();
                    logger.info("Enter the value : ");
                    value = sc.next();
                    if(map.get(key) == null){
                        logger.info("Element added.");
                    }else{
                        logger.info("Element value updated.");
                    }
                    map.put(key, value);
                    break;
                case 2:
                    logger.info("Enter the Key of the element : ");
                    key = sc.next();
                    if(map.get(key) == null){
                        logger.info("Element does not exist.");
                    }else{
                        logger.info("Element deleted..");
                    }
                    map.remove(key);
                    break;
                case 3:
                    s = "The elements in map is " + map;
                    logger.info(s);
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}
