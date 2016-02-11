import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileAction {
	// The name of the file to open.
	protected String fileName;
	protected String filePath;
	
	public ArrayList<String> fileRead() {
		// This will reference one line at a time
		String line = null;
		ArrayList<String> lineArrayList = new ArrayList<String>();
		
		System.out.println(this.filePath + this.fileName);
		
		try {
			// FileReader reads text files in the default encoding.
			
			FileReader fileReader = new FileReader(this.filePath + this.fileName);
			
			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				//System.out.println(line);
				//StringTokenizer tokens = new StringTokenizer(line, " ");
				//tokens = new StringTokenizer(line, " ");
				lineArrayList.add(line);
			}
			
			// Always close files.
			bufferedReader.close();
		
			
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
		
		return lineArrayList;
	}

	
	public void fileWrite(String outputText){
		try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(this.filePath + this.fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write(outputText);
            /*bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");*/

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public FileAction(String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
	}
	
	
}
