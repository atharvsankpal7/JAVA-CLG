package Experiment12;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileHandling{
	public static void main(String[] s){
		try{
			FileOutputStream  fout = new FileOutputStream("duplicate.txt");
			FileInputStream fin = new FileInputStream("original.txt");
			int i;
			String Str="";
			while((i=fin.read())!=-1){
				Str+=(char)i;
			}
			byte[] b = Str.getBytes();
			fout.write(b);
			fout.close();
			fin.close();		
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}