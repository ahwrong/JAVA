package mod11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalBytes = 0;
		try {
			try { //while문도 사용해보기
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("test_copy.txt");
				for (int readByte; (readByte = fis.read()) != -1;)  {
					fos.write(readByte);
					totalBytes++;
//					System.out.write(readByte);
				}
			}finally {
				fos.close();
				fis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n전체 바이트 수: " + totalBytes + " bytes.");
	}
}

// 절대주소 vs 상대주소
