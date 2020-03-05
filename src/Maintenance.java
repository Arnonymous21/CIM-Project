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

    public Maintenance(String l, int hn, String ed, String bd, String company, String year, String county, String jobNum)
    {
        leader = l;
        hoursNeeded = hn;
        hoursSpent = 0;
        endDate = ed;
        beginDate = bd;
        this.jobNum = jobNum;
        this.company = company;
        this.county = county;
        this.year = year;
    }

    public Maintenance(String l, int hn,int h, String ed, String bd, String company, String year, String county, String jobNum)
    {
        leader = l;
        hoursNeeded = hn;
        hoursSpent = h;
        endDate = ed;
        beginDate = bd;
        this.jobNum = jobNum;
        this.company = company;
        this.county = county;
        this.year = year;
    }

    public Maintenance()
    {
        leader = "";
        hoursNeeded = 0;
        hoursSpent = 0;
        endDate = "";
        beginDate = "";
        this.company = "";
        this.county = "";
    }


    //Mutators
    public void setHoursSpent(int hs)
    {   hoursSpent = hs;    }
    public void setHoursNeeded(int hn)
    {   hoursNeeded = hn;    }
    public void setLeader(String l)
    {   leader = l;    }
    public void setEndDate(String ed)
    {   endDate = ed;    }
    public void setBeginDate(String bd)
    {   beginDate = bd;    }
    //Date String = MONTH YEAR EX: JAN 17
    public void setCompany(String cc)
    {  company = cc;    }
    public void setCounty(String c)
    {   county=c; }

    //Accessors
    public int getHoursSpent()
    { return hoursSpent;    }
    public int getHoursNeeded()
    {   return hoursNeeded;    }
    public String getLeader()
    {
        if(leader.length()<5)
            return leader + " ";
        return leader;    }
    public String getEndDate()
    {   return endDate;    }
    public String getBeginDate()
    {   return beginDate;    }
    //Date String = MONTH YEAR EX: JAN 17
    public String getCompany()
    {   return company;    }
    public int getYear()
    {
        return Integer.parseInt(year);
    }
    public int getCounty()
    {
        return Integer.parseInt(county);
    }
    public int getJobNum()
    {
        return Integer.parseInt(jobNum);
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
