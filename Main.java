

class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}

class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    public Member(int MemberID, String LastName, String FirstName, int Handicap, char Gender, String Team,
                  String MemberType, int Coach, long Phone, Date JoinDate) {
        this.MemberID = MemberID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Handicap = Handicap;
        this.Gender = Gender;
        this.Team = Team;
        this.MemberType = MemberType;
        this.Coach = Coach;
        this.Phone = Phone;
        this.JoinDate = JoinDate;
    }

    public void display() {
        System.out.println("Member ID: " + MemberID);
        System.out.println("Last Name: " + LastName);
        System.out.println("First Name: " + FirstName);
        System.out.println("Handicap: " + Handicap);
        System.out.println("Gender: " + Gender);
        System.out.println("Team: " + Team);
        System.out.println("Member Type: " + MemberType);
        System.out.println("Coach: " + Coach);
        System.out.println("Phone: " + Phone);
        System.out.println("Join Date: " + JoinDate);
        System.out.println();
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public int getHandicap() {
        return Handicap;
    }

    public char getGender() {
        return Gender;
    }

    public String getTeam() {
        return Team;
    }

    public String getMemberType() {
        return MemberType;
    }
}

public class Main {
    public static void main(String[] args) {
      
        Member[] members = {
            new Member(118, "McKenzie", "Melissa", 30, 'F', "", "Junior", 153, 963270, new Date(28, "May", 2005)),
            new Member(138, "Stone", "Micheal", 30, 'M', "", "Senior", 0, 983223, new Date(31, "May", 2005)),
            new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649, new Date(12, "August", 2006)),
            new Member(176, "Branch", "Helen", 0, 'F', "", "Social", 0, 589419, new Date(6, "December", 2011)),
            new Member(178, "Beck", "Sarah", 0, 'F', "", "Social", 0, 226596, new Date(24, "January", 2010)),
            new Member(228, "Burton", "Sandra", 26, 'F', "", "Junior", 153, 244493, new Date(9, "July", 2013)),
            new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "March", 2008)),
            new Member(239, "Spence", "Thomas", 10, 'M', "", "Senior", 0, 697720, new Date(22, "June", 2006)),
            new Member(258, "Olson", "Barbara", 16, 'F', "", "Senior", 0, 370186, new Date(19, "July", 2013)),
            new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13, "August", 2013)),
            new Member(290, "Sexton", "Thomas", 26, 'M', "", "Senior", 235, 268936, new Date(28, "July", 2008)),
            new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393, new Date(18, "May", 2009)),
            new Member(331, "Schmidt", "Thomas", 25, 'M', "", "Senior", 153, 867492, new Date(7, "April", 2009)),
            new Member(332, "Bridges", "Deborah", 12, 'F', "", "Senior", 235, 279087, new Date(23, "March", 2007)),
            new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813, new Date(17, "April", 2009)),
            new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 2007)),
            new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "November", 2007)),
            new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "August", 2005)),
            new Member(469, "Willis", "Carolyn", 29, 'F', "", "Junior", 0, 688378, new Date(14, "January", 2011)),
            new Member(487, "Kent", "Susan", 0, 'F', "", "Social", 0, 707217, new Date(7, "October", 2010))

        };

        // Display records where the member’s JoinDate is earlier than 07-Apr-09
        System.out.println("Members joined before 07-Apr-09:");
        for (Member member : members) {
            if (isBefore(member.getJoinDate(), new Date(7, "Apr", 2009))) {
                member.display();
            }
        }

        System.out.println("Senior members with handicap less than 12:");
        for (Member member : members) {
            if (member.getMemberType().equals("Senior") && member.getHandicap() < 12) {
                member.display();
            }
        }

        System.out.println("Female senior members of TeamB:");
        for (Member member : members) {
            if (member.getGender() == 'F' && member.getMemberType().equals("Senior") && member.getTeam().equals("TeamB")) {
                member.display();
            }
        }
    }

    private static boolean isBefore(Date date1, Date date2) {
        if (date1.getYear() < date2.getYear()) {
            return true;
        } else if (date1.getYear() == date2.getYear()) {
            if (date1.getMonth().equals(date2.getMonth())) {
                return date1.getDay() < date2.getDay();
            } else {
                return date1.getMonth().compareTo(date2.getMonth()) < 0;
            }
        }
        return false;
    }
}








/* _______________________
|        <<Class>>         |
|__________________________|
|         Date             |
|--------------------------|
| - day: int               |
| - month: String          |
| - year: int              |
|--------------------------|
| + Date(int, String, int) |
| + getDay(): int          |
| + getMonth(): String     |
| + getYear(): int         |
| + toString(): String     |
|__________________________|


 ___________________________________________________________________________
|        <<Class>>                                                          |
|___________________________________________________________________________|
|        Member                                                             |
|---------------------------------------------------------------------------|
| - MemberID: int                                                           |
| - LastName: String                                                        |
| - FirstName: String                                                       |
| - Handicap: int                                                           |
| - Gender: char                                                            |
| - Team: String                                                            |
| - MemberType: String                                                      |
| - Coach: int                                                              |
| - Phone: long                                                             |
| - JoinDate: Date                                                          |
|---------------------------------------------------------------------------|
| + Member(int, String, String, int, char, String, String, int, long, Date) |
| + display(): void                                                         |
| + getJoinDate(): Date                                                     |
| + getHandicap(): int                                                      |
| + getGender(): char                                                       |
| + getTeam(): String                                                       |
| + getMemberType(): String                                                 |
|___________________________________________________________________________|


 __________________________________
|        <<Class>>                |
|_________________________________|
|          Main                   |
|---------------------------------|
| + main(String[]): void          |
| - isBefore(Date, Date): boolean |
|_________________________________|
 */





 /*In this diagram:

Each class is represented by a box, which contains the class name at the top and its attributes and methods below.
Public methods are indicated with a + sign, while private attributes and methods are indicated with a - sign.
The Date class has attributes day, month, and year, along with a constructor and methods to get these values and a toString() method for representation.
The Member class has attributes representing member details, a constructor, a display() method to print member details, and getter methods for specific attributes.
The Main class is not visualized with attributes but includes the isBefore() method, which compares two Date objects.
This diagram provides a clear overview of your code structure and the relationships between classes. You can further enhance it by adding associations or dependencies if your code involves more complex relationships. */