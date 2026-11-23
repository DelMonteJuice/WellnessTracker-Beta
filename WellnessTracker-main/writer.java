import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//  READ AT THE BOTTOM!!
//  CURRENT PROBLEMS
public class writer


{

    //AMO NI ANG WAY TA TO SAVE OUR USER DATA
    static void Write()
    {
        try
        {
            File sav = new File("Data/" + WellnessTracker.studentID.toUpperCase().trim() + ".txt" );
            FileWriter save = new FileWriter("Data/" + WellnessTracker.studentID.toUpperCase().trim() + ".txt");   

            if (sav.createNewFile())
            {
                
                save.write("Name: " + WellnessTracker.name.toLowerCase().trim());
                save.write("\nID: " + WellnessTracker.studentID.toUpperCase().trim());
                save.write("\nSleep: " + WellnessTracker.sleep);
                save.write("\nSleepGoal: " + WellnessTracker.sleepGoal);
                save.write("\nExercise: " + WellnessTracker.exercise);
                save.write("\nExerciseGoal: "  + WellnessTracker.exerciseGoal);
                save.write("\nWater: " + WellnessTracker.water);
                save.write("\nWaterGoal: " + WellnessTracker.waterGoal);
            }

            
            else
            {
                
            }

        
        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }



    //AMO NI ATON NGA WAY PARA MA LOAD ANG SAVE TA
    public static void Read()
    {
        Scanner reader = new Scanner("Data/" + WellnessTracker.studentID + ".txt");

        try (BufferedReader br = new BufferedReader(new FileReader("Data/" + WellnessTracker.studentID + ".txt")))
        {
            if (reader.equals("ID: "))
            {
                WellnessTracker.studentID = reader.nextLine();
            }

            if (reader.equals("Name: "))
            {
                WellnessTracker.name = reader.nextLine();
            }

            if (reader.equals("Sleep: "))
            {
                WellnessTracker.sleep = reader.nextDouble();
            }

            if (reader.equals("SleepGoal: "))
            {
                WellnessTracker.sleepGoal = reader.nextDouble();
            }
                
            if (reader.equals("Exercise: "))
            {
                WellnessTracker.exercise = reader.nextInt();
            }

            if (reader.equals("ExerciseGoal: "))
            {
                WellnessTracker.exerciseGoal = reader.nextInt();
            }

            if (reader.equals("water: "))
            {
                WellnessTracker.water = reader.nextDouble();
            }

            if (reader.equals("waterGoal: "))
            {
                WellnessTracker.waterGoal = reader.nextDouble();
            }

        }
        catch (IOException e)
        {
            System.out.println("Error");
        }


    } 
    

}

//  SO FAR GOODS NA IBAN 
//  NEED NALANG MA FIX ANG SAVING
//  PROBLEM:
//  EVERYTIME MAG SULOD ANG SAVED NA USER GA LIWAT SA PUNO ANA DATA
//  NEED MAKA UBRA SANG WAY TO WRITE THE DATA IN ITS SPECIFIC LINE OF TEXT
//  FOR EXAMPLE IF MABUTANG KAW SANG SLEEP GOAL MO
//  SLEEP GOAL LANG MA CHANGE INDI ANG TANAN NGA DATA

//  I SUGGEST SEARCH KAMO ABOUT FILEWRITE AND OTHERS, REFER LANG SA GIN IMPORT KO.
//  LANTAW MAN KAMO VIDEOS IF WANT NIYU, BUT WALA VIBE CODE.

//  I RECOMMEND NGA MAG UBRA SANG COPY KA SCRIPT KO NGANI AS BACK UP JUST INCASE NEED MO MAG LIWAT.
//  YELLOW LINES ARE FINE, WARNING LANG NA SILA BUT NOT AN ERROR.