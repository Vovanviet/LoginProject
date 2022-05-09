package modal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Login;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteDataWithJson {
    static void WriteData(List<Login> login){
        try {
            Gson gson=new GsonBuilder().setPrettyPrinting().create();
            Writer writer= Files.newBufferedWriter(Paths.get("account.json"));
            gson.toJson(login,writer);
            writer.close();
            System.out.println("Wrote file success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
