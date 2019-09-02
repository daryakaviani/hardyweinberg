import java.util.*;
public class Organism
{
    private boolean t1;
    private boolean t2;
    private boolean sex;
    public Organism(boolean t1, boolean t2, boolean sex)
    {
        this.t1 = t1;
        this.t2 = t2;
        this.sex = sex;
    }
    public boolean getGene1()
    {
        return t1;
    }
    public boolean getGene2(){
        return t2;
    }
    public boolean getGender(){
        return sex;
    }
}
