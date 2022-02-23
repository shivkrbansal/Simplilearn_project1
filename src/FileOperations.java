
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	Scanner scan = new Scanner(System.in);
	public String dir = "C:\\Users\\91807\\Desktop\\Lockedme";
		
		
		
		public void createFile() {
			System.out.println("Enter the file you want to add");
			String filename = scan.next();
			String path = dir+"\\"+filename;
			File file = new File(path);
			if(file.exists()) {
    			System.out.println("Already exits !! Please Enter Again\n");
    			}else {
    				try {
    					file.createNewFile();
    					Desktop.getDesktop().edit(file);
    					System.out.println("!!Your file is created!!!\n");
    				}catch(IOException e) {
    					e.printStackTrace();
    				}
			
		}

		}
		
		public void delete() {
			System.out.println("Enter the file which you want to delete:");
			String filename = scan.next();
			String path = dir+"\\"+filename;
			File file = new File(path);
			if(!file.exists()) {
				System.out.println("File is not existed");
			}else {
				file.delete();
				System.out.println("File is successfully deleted");
					
					
				}
			}
		
		
		public void searchFile() {
			// TODO Auto-generated method stub
			try {	
				Scanner scan= new Scanner(System.in);
				File directory = new File(dir);
				System.out.println("Enter the file name which you want to search:");
				String fileName=scan.nextLine();
	            File[] files=directory.listFiles();
	            int flag=0;
	            for (File file : files) {
	                String name = file.getName();
	                if (name.equals(fileName)) {
	                       // System.out.println("The filename "+fileName+" is present in the directory");
	        				File f= new File(fileName);
	        				Scanner sc1 = new Scanner(f);
	        				while(sc1.hasNextLine()) {
	        				System.out.println(sc1.nextLine());
	        				}
	        			flag=1;	
	                }
				}
	        if(flag==0) {
	        	System.out.println("File not found");
	        }
	        	
			}catch(FileNotFoundException ex) {
				System.out.println("file not found");
			}
			
		}
		
		public  void displayAll() {
			File fileDir = new File(dir);
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files sorted");
				for(String s:listFile){
					System.out.println(s);
				}
				Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in ascending order");
				for(String s:listFile){
					System.out.println(s);
							
				}
			
				
		}
		
			
		}
}
	
	


		
		
		
		
	
     
		
		
	
		
		
	

	 
