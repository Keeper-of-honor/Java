/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Main
{
	public static void main(String[] args) throws Exception{
	    PrintStream console = new PrintStream(System.out);  //Запоминаем поток вывода в консоль
	    
	    //Меняем поток на вывод в файл "file.txt"
	    FileOutputStream f = new FileOutputStream("file.txt");
	    System.setOut(new PrintStream(f));
		System.out.println("File");
		
		//Возвращаем старый поток (вывод в консоль)
		System.setOut(new PrintStream(console));
		System.out.println("Console");
	}
}
