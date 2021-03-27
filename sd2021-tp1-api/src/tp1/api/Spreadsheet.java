package tp1.api;

import java.util.Set;
import java.util.List;

/**
 * Represents a spreadsheet.
 */
public class Spreadsheet {
	// id of the sheet - generated by the system
	private String sheetId;
	// id of the owner
	private String owner;
	// URL of the sheet (REST endpoint) - generated by the system
	private String sheetURL;
	// number of the lines and columns
	private int lines, columns;
	private Set<String> sharedWith;
	private List<List<String>> rawValues;
	
	public Spreadsheet() {	
	}

	public Spreadsheet(String sheetId, String owner, String sheetURL, int lines, int columns, Set<String> sharedWith,
			List<List<String>> rawValues) {
		super();
		this.sheetId = sheetId;
		this.owner = owner;
		this.sheetURL = sheetURL;
		this.lines = lines;
		this.columns = columns;
		this.sharedWith = sharedWith;
		this.rawValues = rawValues;
	}

	public String getSheetId() {
		return sheetId;
	}


	public void setSheetId(String sheetId) {
		this.sheetId = sheetId;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getSheetURL() {
		return sheetURL;
	}


	public void setSheetURL(String sheetURL) {
		this.sheetURL = sheetURL;
	}


	public int getLines() {
		return lines;
	}


	public void setLines(int lines) {
		this.lines = lines;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}


	public Set<String> getSharedWith() {
		return sharedWith;
	}


	public void setSharedWith(Set<String> sharedWith) {
		this.sharedWith = sharedWith;
	}


	public List<List<String>> getRawValues() {
		return rawValues;
	}


	public void setRawValues(List<List<String>> rawValues) {
		this.rawValues = rawValues;
	}

}
