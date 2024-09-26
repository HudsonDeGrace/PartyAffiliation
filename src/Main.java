import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String affiliation = "";
        System.out.println("Enter your party affiliation [D,R,I,Other]: ");

        if(in.hasNextLine()){
            affiliation = in.nextLine();
            if(affiliation.equals("D")){
                System.out.println("You get a Democratic Donkey!");
            } else if(affiliation.equals("R")){
                System.out.println("You get a Republican Elephant!");
            } else if(affiliation.equals("I")){
                System.out.println("You get an Independent Man!");
            } else {
                System.out.println("Your party affiliation is: " + affiliation);
            }
        }
    }
}