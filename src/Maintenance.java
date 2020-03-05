import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Maintenance
{
	private String leader;
	private int hoursSpent;
	private int hoursNeeded;
	private String endDate;
	private String beginDate;
	private String company;
	private String year;
	private String county;
	private String jobNum;

	public Maintenance(String leader, int hoursNeeded, String endDate, String beginDate, String company, String year, String county, String jobNum)
	{
		this(leader, hoursNeeded, 0, endDate, beginDate, company, year, county, jobNum);
	}

	public Maintenance(String leader, int hoursNeeded, int hoursSpent, String endDate, String beginDate, String company, String year, String county, String jobNum)
	{
		this.leader = leader;
		this.hoursNeeded = hoursNeeded;
		this.hoursSpent = hoursSpent;
		this.endDate = endDate;
		this.beginDate = beginDate;
		this.jobNum = jobNum;
		this.company = company;
		this.county = county;
		this.year = year;
	}

	public Maintenance()
	{
		this("", 0, 0, "", "", "", "", "", "");
	}


	//Mutators
	public void setHoursSpent(int hoursSpent)
	{
		this.hoursSpent = hoursSpent;
	}
	public void setHoursNeeded(int hoursNeeded)
	{
		this.hoursNeeded = hoursNeeded;
	}
	public void setLeader(String leader)
	{
		this.leader = leader;
	}
	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}
	public void setBeginDate(String beginDate)
	{
		this.beginDate = beginDate;
	}
	//Date String = MONTH YEAR EX: JAN 17
	public void setCompany(String cc)
	{
		this.company = cc;
	}
	public void setCounty(String c)
	{
		county=c;
	}

	//Accessors
	public int getHoursSpent()
	{
	    return this.hoursSpent;
	}
	public int getHoursNeeded()
    {
        return this.hoursNeeded;
    }
	public String getLeader()
	{
		if(leader.length()<5)
			return this.leader + " ";
		return this.leader;
	}
	public String getEndDate()
	{
	    return this.endDate;
	}
	public String getBeginDate()
	{
	    return this.beginDate;
	}
	//Date String = MONTH YEAR EX: JAN 17
	public String getCompany()
	{
	    return this.company;
	}
	public int getYear()
	{
		return Integer.parseInt(this.year);
	}
	public int getCounty()
	{
		return Integer.parseInt(this.county);
	}
	public int getJobNum()
	{
		return Integer.parseInt(this.jobNum);
	}

	public int getDaysTillEnd()
	{
		long millisBetween = getDateEpoch(endDate) - System.currentTimeMillis();
		return (int)(millisBetween / 86400000);
	}
	private long getDateEpoch(String dateStr)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		
		
		Date date = null;
		try
		{
			date = dateFormat.parse(dateStr);
		}
		catch(ParseException e)
		{
			System.out.println("That should never have happened.");
			System.exit(-1);
		}
		
		return date.getTime();
	}
	
	//Method time
	public String toString() {
		//NGL my program is jumping around and pissing me off
		//but hey what can I do about it? Nothing, this shit is just gonna sit here bc IntelliJ feels like being a little bitch at 11 PM
		return company + "\t\t" + leader + "\t\t" + hoursNeeded + "\t\t\t" + hoursSpent + "\t\t\t " + endDate +"\t\t" + beginDate + "\t\t" + year+ " "+county+" "+jobNum;}

		//printing to txt file
	public String to2String(){
		return (this.getLeader() + "\n" + this.getHoursNeeded() + "\n" + this.getHoursSpent() + "\n" + this.getEndDate() + "\n" + this.getBeginDate() + "\n" + this.getCompany() + "\n" + this.getYear() + "\n" + this.getCounty() + "\n" + this.getJobNum());
	}


}
