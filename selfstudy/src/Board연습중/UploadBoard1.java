package Board연습중;

public class UploadBoard1 extends Board1 
{
	private String fileName;
	
	public UploadBoard1() {}
	
	public UploadBoard1(int bno, String subject, String writer, String content)
	{
		super(bno, subject, writer, content);
		this.fileName=fileName;	
	}
	
	public UploadBoard1(int bno, String subject, String content)
	{
		super(bno, subject, content);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("UploadBoard1 [fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
