import java.io.*;
import java.io.File;
import java.util.*;

public class Start
{

	public static ArrayList <Maintenance> mainJobs = new ArrayList<Maintenance>();
	public static Scanner key = new Scanner(System.in);

	public static void main (String[]args) throws IOException {

		Load();

		//Load(installJobs);

		do {            //Main Start Up
			System.out.println ("Hello and Welcome to Snag Gang");

			String answer = "";
			do {
				chart();

				System.out.println("\ta.) Add Job\n\tb.) Edit Job\n\tc.) Delete Job\n\td.) Sort Jobs\n\te.) Search Job\n");
				System.out.print("Enter Option: ");
				answer = key.nextLine();

				switch (answer) {
					case "a":
						add();
						break;
					case "b": //Edit Job

						break;
					case "c": //Delete Job
						break;
					case "d": //Sort Job
						break;
					case "e": //Search Job
						break;
					default:
						break;
				}
			}while(!answer.equalsIgnoreCase("f"));
		} while (true);




	}

	public static void chart()
	{
		System.out.println("Company\t\tLeader\t\tNeeded\t\tSpent\t\tEnd Date\tStart Date\tJob Number");
		if(mainJobs.isEmpty())
			System.out.println("No Jobs Listed");
		else
			System.out.println(tooString()+"\n");

	}
	public static void add() throws IOException
	{
		int hoursNeeded=0;
		int hoursSpent=0;
		boolean error = false;
		System.out.print("Enter Leader: ");
		String leader = key.nextLine();
		//get hours needed
		do {
			try
			{		//catches mistype error
				System.out.print("Enter Hours Needed: ");
				hoursNeeded = Integer.parseInt(key.nextLine());
				error = false;
			}
			catch(Exception e)
			{
				System.out.println("\tInput Mismatch");
				error = true;
			}
		}while(error);

		//get hours spent
		do{
			try
			{					//catches mistype error
				System.out.print("Enter Hours Spent: ");
				hoursSpent = Integer.parseInt(key.nextLine());
				error = false;
			}
			catch(Exception e)
			{
				System.out.println("Input Mismatch");
				error = true;
			}
		}while(error);

		//	System.out.print("Enter Hours Spent: ");
		//	hoursSpent = Integer.parseInt(key.nextLine());

		System.out.print("Enter End Date: ");
		String endDate = key.nextLine();
		System.out.print("Enter Starting Date: ");
		String startDate = key.nextLine();
		System.out.print("Enter Customer Name: ");
		String company = key.nextLine();
		System.out.print("Beginning of Job Number:\n\tEnter Year: ");
		String year = key.nextLine();
		System.out.print("\tEnter County: ");
		String county = key.nextLine();
		System.out.print("\tEnter Job Number: ");
		String jobNum = key.nextLine();
		Maintenance temp = new Maintenance(leader, hoursNeeded, hoursSpent, endDate, startDate, company, year, county, jobNum);
		//mainJobs.add(temp);

		//add to the file
		Scanner infile = new Scanner (new File("Maintenance.txt"));


		infile.close();
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

    /* public static void Save() throws IOException
	 {
		 PrintWriter pw = new PrintWriter(new FileOutputStream("Maintenance.txt"), true);
		 //									 ^^ You can only output 			^^ Already has existing data = no write over the txt file
		// Maintenance [] mJ = mainJobs.keySet().toArray(new Maintenance[mainJobs.size()]);

		 StringBuilder sb = new StringBuilder("");
		 for(int x = 0; x<mainJobs.size(); x++)
		 {
			 sb.append(mJ[x].getLeader() + "\n" + mJ[x].getHoursNeeded() + "\n" + mJ[x].getHoursSpent() + "\n" + mJ[x].getEndDate() + "\n" + mJ[x].getBeginDate() + "\n" + mJ[x].getCompany() + "\n" + mJ[x].getYear() + "\n" + mJ[x].getCounty() + "\n" + mJ[x].getJobNum());
		 }
		 pw.println(sb);
		 pw.close();
	 }
*/


	//Dumb Methods Start Here
	public static String tooString()
	{
		Object [] A = mainJobs.toArray();
		if(mainJobs.isEmpty())
			return "Empty";
		StringBuilder sb = new StringBuilder("");
		for(int x = 0; x<mainJobs.size(); x++)
		{
			sb.append(A[x] + "\n");
		}

		return sb.toString();
	}





}