package assign;

public class File {
	private String file;

	@Override
	public String toString() {
		return "File [file=" + file + "]";
	}

	public File(String file) {
		super();
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
