import java.util.Scanner;

public class WeightOnSolarSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Weight on Earth in Lbs:  ");
        double weight = input.nextDouble();

        System.out.print("Choose a Location in our Solar System: \n 1. Venus \n 2. Mercury \n " +
                "3. Mars \n 4. Jupiter \n 5. Saturn \n 6. Uranus \n 7. Neptune \n " +
                " Please Select 1 from the following (1-7):"); // outputs the items to choose from.
        int planetNumber=input.nextInt( );

        double weightOnPlanet =1; // outnumber will be the output number that the program will calculate
        String planet="";

        switch (planetNumber) {
            case 1:
                weightOnPlanet  = weight * 0.166; // this case will calculate Earth's moon weight
                planet="Earth's moon";
                break;
            case 2:
                weightOnPlanet  = weight * 0.91; // this case will calculate venus weight
                planet="Venus";
                break;
            case 3:
                weightOnPlanet  = weight * 0.38; // this case will calculate Mercury weight
                planet="Mercury";
                break;
            case 4:
                weightOnPlanet  = weight * 0.38;  // this case will calculate mars weight
                planet="Mars";
                break;
            case 5:
                weightOnPlanet  = weight * 2.34;  // this case will calculate Jupiter weight
                planet="Jupiter";
                break;
            case 6 :
                weightOnPlanet  = weight * 1.06;  // this case will calculate saturn weight;
                planet="Saturn";
                break;
            case 7 :
                weightOnPlanet  = weight * 0.92;  // this case will calculate Uranus weight
                planet="Uranus";
                break;

            case 8:
                weightOnPlanet  = weight * 1.19 ;  // this case will calculate Neptune weight
                planet="Neptune";
                break;

            default:
                System.out.println("You have selected a wrong Number!"); // this will default to an error if a wrong number selected
                break;
        }
        System.out.println("Your Weight on " + planet + " will be: " + weightOnPlanet );
    }
}
