package settings;

import java.lang.invoke.MethodHandles;

public class RelativePathUtils {
	
	public static String getBaseDir(String dirName){
		String path = MethodHandles.lookup().lookupClass().getClassLoader().getResource("./").getPath();
		path = path.replaceAll("bin", "src") + dirName + System.getProperty("file.separator");
		System.out.println(MethodHandles.lookup().lookupClass().toString() + " - Path : " + path);
		return path;
	}

}
