package ua.goit.repository;

import com.google.gson.Gson;
import ua.goit.models.Good;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class MapFromJson implements MapFromJsonIntf <Map<Character, Good>> {

    @Override
    public Map<Character, Good> getMapFromJson() {
        Map<Character, Good> goods = new HashMap<>();
        try (FileReader fileJson = new FileReader("goods2.json")) {
            Gson gson = new Gson();
            goods = gson.fromJson(fileJson, goods.getClass());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return goods;
    }
}
