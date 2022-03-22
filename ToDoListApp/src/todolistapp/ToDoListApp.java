
package todolistapp;

import java.io.File;
import java.io.FileWriter;
import java.io.EOFException;
import java.util.Scanner;
import java.util.ArrayList;

public class ToDoListApp {

    static String fileName;
    static ArrayList<String> todoLists;
    static boolean isEditing = false;
    static Scanner input;
    
    public static void main(String[] args) {
        
        todoLists = new ArrayList<>();
    }
    
}
