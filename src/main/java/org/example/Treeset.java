package org.example;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc = new Scanner(System.in);
        int choice;
        String s;
        while(true){
            logger.info("1. Add \n2. Remove \n3. Print \n4. Exit");
            logger.info("Enter your choice : ");
            choice = sc.nextInt();
            String inp;
            boolean set1;
            switch (choice){
                case 1:
                    logger.info("Enter something to insert into set");
                    inp = sc.next();
                    set1 = tSet.add(inp);
                    if (set1){
                        logger.info("Element added.");
                    }else {
                        logger.info("The element already exist.");
                    }
                    break;
                case 2:
                    logger.info("Enter element you want to delete");
                    inp = sc.next();
                    set1 = tSet.remove(inp);
                    if (set1){
                        logger.info("Element deleted");
                    }else{
                        logger.info("The element you want to delete is not present inside the set.");
                    }
                    break;
                case 3:
                    s = "The elements in the set are :" + tSet;
                    logger.info(s);
                    break;
                default:
                    System.exit(0);
            }
        }
        
    }
}
