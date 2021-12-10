package Exp2.Problem2;

public class Student extends People {
    private Long sNo;
    private String sMajor;

    @Override
    public String toString() {
        return "{ number: " + Long.toHexString(sNo) + 
            ", " + super.toString() +
            ", major: " + sMajor + " }";
    }

    public boolean setNo(String no) {
        long toSet = Long.parseLong(no, 16);
        if (toSet < 0)
            return false;
        sNo = toSet;
        return true;
    }
    public void setNo(long no) { sNo = no; }
    public void setMajor(String major) {
        if (major != null)
            sMajor = major;
    }

    public long number() {return sNo;}
    public String major() {return sMajor;}

    public Student(People p, long no, String major) {
        super(p.name(), p.isMale(), p.birth());
        setNo(no); setMajor(major);
    }
    public Student(People p, String no, String major) {
        super(p.name(), p.isMale(), p.birth());
        setNo(no); setMajor(major);
    }
}