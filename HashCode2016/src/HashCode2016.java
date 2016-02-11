import java.io.File;

public class HashCode2016 {

	static String fileName = "test.in";
	static String fileFullPath = System.getProperty("user.dir") + File.separator + "hashCode2016" + File.separator;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileAction aFileAction = new FileAction(fileName,fileFullPath);
		aFileAction.fileRead();
	}

}
