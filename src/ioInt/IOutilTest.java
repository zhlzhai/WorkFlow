package ioInt;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOutilTest {

	
	public static void main(String[] args){
	
		try {
//			IOUtilAll.writeStringToFile("First begine", "werty.txt",false);
//			IOUtilAll.writeIntArrayToFile(new int[]{1,2,3,4,5},"werty.txt",true);
			ByteArrayOutputStream outputstrean = IOUtil.readByteStreamFromFile("werty.txt");
			String content = outputstrean.toString("gbk");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
