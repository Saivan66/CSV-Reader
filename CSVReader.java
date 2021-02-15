import java.io.File;
import java.util.Scanner;

/**
 * This class provides an implementation of the DataReader interface for CSV
 * files
 * 
 * @author Mehrdad Sabetzadeh, University of Ottawa
 * @author Guy-Vincent Jourdan, University of Ottawa
 *
 */
public class CSVReader implements DataReader {

	private int numRows;

	private int numColumns;

	private String[] attributeNames;

	private String[][] Data;

	private String SID;
	
	/**
	 * Constructs a dataset by loading a CSV file
	 * 
	 * @param strFilename is the name of the file
	 */
	public CSVReader(String filePath) throws Exception {
		Data = new String[numRows][numColumns];
		
	}


	public String[] getAttributeNames() {
		return attributeNames;
		
	}

	public String[][] getData() {
		return Data;
	}

	public String getSourceId() {
		return SID;
	}

	public int getNumberOfColumns() {
		return numColumns;
	}

	public int getNumberOfDataRows() {
		return numRows;
	}
}