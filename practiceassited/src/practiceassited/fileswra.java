package handlingfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;


class FReading {
    public static String str="";
    
    public FReading() {
        
        try{
            File file=new File("ram.txt");
            if(! file.exists())
            file.createNewFile();
            FileReader fl=new FileReader(file);
            BufferedReader bf=new BufferedReader(fl);
            while((str=bf.readLine())!=null){
                System.out.println(str);
            }
            fl.close();
            }catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
        }
    }
}
public class fileswra {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		// String =sc.nextLine();
		System.out.println("select the option ");
		System.out.println("w-->write mode \nr-->read mode \na-->append mode");
		String s=sc.nextLine();
		if(s.equals("r"))
		{
			new FReading();
		}
		else if(s.equals("w")||s.equals("a"))
		{
			fwrite(s);
		}
		else
			System.out.println("sorry ,better luck next time");
		sc.close();
	}

	public static void fwrite(String s) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please Enter your name:");
		String name=sc.nextLine();
		try 
		{
			String rs="";
			File f= new File("ram.txt");
			BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
			FileWriter f0 =null;
			if(s.equals("w")) 
			{
				f0=new FileWriter(f,false);
				System.out.println("HII "+name+" plz write some content into your file after finishing the writing..plz type 'stop' ................");
				while(!(rs=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.write(rs + System.getProperty("line.separator"));
                    
                }
				System.out.println("Thank you "+name+" your writeup is completed... ");
				sc.close();
			}
			else {
				f0 = new FileWriter(f,true);
                System.out.println("Write 'stop' when you finish appending file........ ");
                while(!(rs=bf.readLine()).equalsIgnoreCase("stop")){
                    f0.append(rs+ System.getProperty("line.separator"));
                }
            }
			System.out.println("Thank you! "+name+" youe appending some content into your file plz chech enter 'r' mode...! ");
            f0.close();
				
		}
		catch(Exception e){
            System.out.println("Error : " );
            e.printStackTrace();
	}

}
}


