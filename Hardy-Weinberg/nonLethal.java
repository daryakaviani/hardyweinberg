import java.util.*;
public class nonLethal{
    public static double domCount = 0;
    public static double recCount = 0;
    public static void main(String [] args){
        ArrayList <Organism> list = new ArrayList();
        boolean gender;
        boolean t1, t2;
        for(int i = 0; i < 10; i++){
            int temp1 = (int)(2*Math.random());
            int temp2 = (int)(2*Math.random());
            int temp3 = (int)(2*Math.random());
            if(temp1 == 1){
                t1 = true;
                domCount++;
            }
            else{
                t1 = false;
                recCount++;
            }
            if(temp2 == 1){
                t2 = true;
                domCount++;
            }
            else{
                t2 = false;
                recCount++;
            }
            if(temp3 == 1){
                gender = true;             
            }
            else{
                gender = false;
            }
            list.add(new Organism(t1, t2, gender));       
        }
        System.out.println("ratio of dom to rec " + domCount/recCount);
        System.out.println("dom count " + domCount);
        System.out.println("rec count " + recCount);
        System.out.println("population " + list.size());
        nextGen(list, 10);
        System.out.println("next gen ratio of dom to rec " + domCount/recCount);
        System.out.println("next gen dom count " + domCount);
        System.out.println("next gen rec count " + recCount);
        

    }

    public static ArrayList <Organism> nextGen(ArrayList <Organism> list, int numGens){
        ArrayList <Organism> newList = new ArrayList();
        domCount = 0;
        recCount = 0;
        for(int j = 0; j < numGens; j++){
            for(int i = 0; i < list.size(); i++){
                int parent1 = (int)(list.size()*Math.random());
                boolean p1g1 = list.get(parent1).getGene1();
                boolean p1g2 = list.get(parent1).getGene2();
                list.remove(parent1);

                int parent2 = (int)(list.size()*Math.random());
                boolean p2g1 = list.get(parent2).getGene1();
                boolean p2g2 = list.get(parent2).getGene2();
                list.remove(parent2);

                int temp1 = (int)(2*Math.random());
                int temp2 = (int)(2*Math.random());
                int temp3 = (int)(2*Math.random());
                boolean newT1, newT2, gender;
                if(temp1 == 1){
                    newT1 = p1g1;
                    domCount++;
                }
                else{
                    newT1 = p1g2;
                    recCount++;
                }
                if(temp2 == 1){
                    newT2 = p2g1;
                    domCount++;
                }
                else{
                    newT2 = p2g2;
                    recCount++;
                }
                if(temp3 == 1){
                    gender = true;
                }
                else{
                    gender = false;
                }
                newList.add(new Organism(newT1, newT2, gender));
                temp1 = (int)(2*Math.random());
                temp2 = (int)(2*Math.random());
                temp3 = (int)(2*Math.random());
                if(temp1 == 1){
                    newT1 = p1g1;
                    domCount++;
                }
                else{
                    newT1 = p1g2;
                    recCount++;
                }
                if(temp2 == 1){
                    newT2 = p2g1;
                    domCount++;
                }
                else{
                    newT2 = p2g2;
                    recCount++;
                }
                if(temp3 == 1){
                    gender = true;
                }
                else{
                    gender = false;
                }
                newList.add(new Organism(newT1, newT2, gender));

            }
        }
        return newList;
    }

}

