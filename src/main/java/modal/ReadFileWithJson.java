package modal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import entity.Login;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileWithJson {
    public static List<Login >logins;
    public static List<Login> getDataJson(){
        try {
            Reader reader= Files.newBufferedReader(Paths.get("account.json"));
            Gson gson=new GsonBuilder().create();
            logins=gson.fromJson(reader,new TypeToken<List<Login>>(){}.getType());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logins;
    }
}
