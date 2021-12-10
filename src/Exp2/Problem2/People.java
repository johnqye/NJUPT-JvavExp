package Exp2.Problem2;
import java.time.Duration;
import java.util.Calendar;

public class People {
    private String pName;
    private boolean pSex; // isMale
    private Calendar pBirth;

    @Override
    public String toString() {
        long y = Math.abs(Duration.between(Calendar.getInstance().toInstant(),
            pBirth.toInstant()).toDays() / 365);

        return "{ name: " + pName + ", sex: "
            + (pSex ? "male" : "female")
            + ", age: " + y + " }";
    }

    public String name() {return pName;}
    public boolean isMale() {return pSex;}
    public Calendar birth() {return (Calendar)pBirth.clone();}

    public People(String name, boolean isMale, Calendar birth) {
        pName = name; pSex = isMale;
        if (birth == null)
            pBirth = Calendar.getInstance();
        pBirth = (Calendar)birth.clone();
    }
}