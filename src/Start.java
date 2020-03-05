import java.io.*;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class Start {

	public static ArrayList<Maintenance> mainJobs = new ArrayList<Maintenance>();
	public static Scanner key = new Scanner(System.in);

	public static void main(String[] args)
	{

            //Load();
			JFrame frame = new MainGui("Manpower Loading");
			frame.setVisible(true);

    }
     public static void Load() throws IOException
     {
     	Scanner infile = new Scanner (new File("Maintenance.txt"));
		Maintenance p = null;
		while(infile.hasNextLine())
		{
				p = new Maintenance(infile.nextLine(), Integer.parseInt(infile.nextLine()), Integer.parseInt(infile.nextLine()), infile.nextLine(), infile.nextLine(), infile.nextLine(), infile.nextLine(),infile.nextLine(),infile.nextLine());
				mainJobs.add(p);
		}
		infile.close();

     }


}
