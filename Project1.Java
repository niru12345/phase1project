package chaithu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class project {
	public static void main(String arg[]) throws IOException{
		int operation=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) {
			System.out.println("enter 1 for create file and add,2 for delete file,3 for display file,4 for search file");
			
			operation=sc.nextInt();
			
			switch(operation)
			{
			case 1:
			String filepath="//home/bonduranimphasi/Documents//";
			Scanner sc1=new Scanner(System.in);
			
			ArrayList<String> a1=new ArrayList<>();
		while(true) {
			System.out.print("enter the file name to create");
			String filename=sc.next();
		String finalname=filepath+filename;
		System.out.println(finalname);
		
		// create a file
		
		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("the filenot created");
		}
		else {
			a1.add(filename);
			System.out.println("file created");
			break;
		}
		System.out.println("the collection of files is "+ a1);
		}
		break;
		
			case 2:
				String path1="//home/bonduranimphasi/Documents//";
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter the file name to be deleted");
				String filename=sc.next();
				String finalfile=path1+filename;
				File file=new File(finalfile);
				file.delete();
				System.out.println("file deleted");
				break;
				
				
			case 3:
				String path2="//home/bonduranimphasi/Documents//";
						System.out.println("enter the file name to be display");
				File f=new File(path2);
			
				File filename1[]=f.listFiles();
				System.out.println("your list file");
				for(File ff:filename1) {
					System.out.println(ff.getName());
				}
		break;
				
			case 4:
				String path3="//home/bonduranimphasi/Documents//";
						File f1=new File(path3);
				Scanner sc3=new Scanner(System.in);
				System.out.println("enter the file name to be search");
				String filesearchname=sc3.next();
				File searchFile1[]=f1.listFiles();
				int flag=0;
				for(File ff:searchFile1) {
					if(ff.getName().equals(filesearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
				}
				if (flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
				
				break;
					
					
			case 5:
				System.exit(0);
				break;	
					
					
					
					
					
					
		
			}
		}
	}

}
