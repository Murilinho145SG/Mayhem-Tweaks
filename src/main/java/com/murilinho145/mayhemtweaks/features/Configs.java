package com.murilinho145.mayhemtweaks.features;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;

public class Configs {
    public JsonObject jsonObject;
    public File configFile;
    public File Path;
    public Configs(File Path, File configFile) throws IOException {
        this.configFile = configFile;
        this.Path = Path;
        if (!Path.exists()) {
            Path.mkdirs();
            if (Path.exists()) {
                configFile.createNewFile();
            }
        } else if(Path.exists()) {
            if (!configFile.exists()) {
                configFile.createNewFile();
            }
        }
        this.jsonObject = new Gson().fromJson(new BufferedReader(new FileReader(configFile)), JsonObject.class);
    }
}
