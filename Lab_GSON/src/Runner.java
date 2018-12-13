import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.reflect.TypeToken;

import by.gsu.pms.Colors;

public class Runner {
	
	public static void main(String[] args) throws IOException {		
		Gson gson = new GsonBuilder().create();
		try(Reader reader = new FileReader("src//colors.json")) {
			Colors[] colorsList = (gson.fromJson(reader, Colors[].class));
			for (Colors colorsList2 : colorsList) {
				System.out.println(colorsList2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
