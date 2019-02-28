import java.util.*;
import java.io.*;

public class FileIoClient {

    public static void main(String[] args) {
        
        ///////////////////////////////////////////////
        // Create dummy samurai data
        ArrayList<Samurai> samurai = new ArrayList<Samurai>();
        ArrayList<Samurai> samuraiIn = new ArrayList<Samurai>();
        samurai.add( new Samurai("Jon Wallace", "Hong Kong", 23, 200) );
        samurai.add( new Samurai("Daniel Grissom", "Anaheim", 150, 90) );
        samurai.add( new Samurai("Sam", "Hong Kong", 60, 220) );
        samurai.add( new Samurai("Leroy", "Tuson", 200, 2) );
    
        final String fileName = "myFile.txt";
    
        ///////////////////////////////////////////////
        // Write out to the file
        // 1) Declare our output variables    
        FileOutputStream fos = null;
        PrintWriter pw = null;
        
        // 2) TRY/CATCH/FINALLY structure
        try {
            // 2a) TRY - init output variables
            fos = new FileOutputStream(fileName);
            pw = new PrintWriter(fos);
            
            // 2b) TRY - Write data out to file
            for (Samurai s : samurai) {
                pw.print(s.getName() + " - ");
                pw.print(s.getBirthplace() + " - ");
                pw.print(s.getArmorStrength() + " - ");
                pw.println(s.getSwordDamage());
            }
        
        // 2c) CATCH - FileNotFoundException & Exception
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (Exception e) {
            System.out.println("ERROR: An unknown error occurred");
        } finally {
            // 2d) FINALLY - Close output variables
            try {
                if (pw != null)
                    pw.close();
                if (fos != null)
                    fos.close();
            } catch (Exception e) {
                System.out.println("ERROR: An unknown error occurred");
            }
        }
        
        
        
        
        ///////////////////////////////////////////////
        // Read in from the file
        // 1) Declare input variables
        // 2) TRY/CATCH/FINALLY structure
        // 2a) TRY - init input variables

        // 2d) CATCH - FileNotFoundException & Exception
        // 2e) FINALLY - Close input variables
        
        FileInputStream fis = null;
        Scanner fScan = null;
        
        // 2) TRY/CATCH/FINALLY structure
        try {
            // 2a) TRY - init input variables
            fis = new FileInputStream(fileName);
            fScan = new Scanner(fis);
            
            // 2b) TRY - read in data WHILE still data
            while (fScan.hasNextLine()) {
                String line = fScan.nextLine();
                
                Scanner lScan = new Scanner(line);
                lScan.useDelimiter("-");
                String name = lScan.next().trim();
                String birth = lScan.next().trim();
                int aLev = Integer.parseInt(lScan.next().trim());
                int sLev = Integer.parseInt(lScan.next().trim());
                
                // 2c) TRY - create new object w/ data and add to an array list
                samuraiIn.add( new Samurai(name, birth, aLev, sLev) );
            }
                
        // 2d) CATCH - FileNotFoundException & Exception
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (Exception e) {
            System.out.println("ERROR: An unknown error occurred");
        } finally {
            // 2e) FINALLY - Close input variables
            try {
                if (fScan != null)
                    fScan.close();
                if (fis != null)
                    fis.close();
            } catch (Exception e) {
                System.out.println("ERROR: An unknown error occurred");
            }
        }
        
        
        
        ///////////////////////////////////////////////
        // Print out what we read in from file
        for (Samurai s : samuraiIn)
            System.out.println(s);

    }

}

//end of FileIoClient.java :)
