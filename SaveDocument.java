package Lesson8;

import java.util.Scanner;

public abstract class SaveDocument {
    Scanner scan = new Scanner(System.in);

    public SaveDocument() {
       this.scan = new Scanner(System.in);
   }

   abstract void LineSaveDoс(String nameDoc, String line);
   abstract void EnterSaveDoс(String nameDoc);
}
