package ex0724.board;

public class UploadBoard extends Board 
{
		private String fileName;
		
		public UploadBoard() {}
		
	

		public UploadBoard(int bno, String subject, String writer, String content, String fileName) 
		{
			super(bno, subject, writer, content);
			this.fileName=fileName;
		}
		
		public UploadBoard(int bno, String subject, String content)
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
			
			builder.append(", fileName=");
			builder.append(fileName);
			builder.append("]");
			
			return builder.toString();
		}
		
}
