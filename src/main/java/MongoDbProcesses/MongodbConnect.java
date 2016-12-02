package main.java.MongoDbProcesses;

import com.mongodb.*;
import main.java.GetDataWithJsoup;
import org.jsoup.nodes.Element;
import org.w3c.dom.Document;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.*;

import static com.sun.javaws.CacheUtil.remove;
import static java.util.Arrays.asList;


public class MongodbConnect {


    public void MongodbConnect() throws IOException {

        GetDataWithJsoup getDataWithJsoup = new GetDataWithJsoup();

        MongoClient mongoClient = new MongoClient(Arrays.asList(new ServerAddress("localhost", 27017)));
        //        new ServerAddress("localhost", 27018),
        //        new ServerAddress("localhost", 27019)));

        DB db = mongoClient.getDB("pokemonDb");
        DBCollection table = null;
        BasicDBObject datas = new BasicDBObject();

        for (int i = 0; i < 10; i++) {
            table = db.getCollection(getDataWithJsoup.Pokemon_name(i));
            datas.put("Pokemon_coefficiency_table", getDataWithJsoup.Pokemon_coefficiency_table(i));
            datas.put("Pokemon_efficiency_table", getDataWithJsoup.Pokemon_efficiency_table(i));
            datas.put("Pokemon_effectiveness", getDataWithJsoup.Pokemon_efficiency(i));
            datas.put("Pokemon_image", getDataWithJsoup.Pokemon_images(i));
            datas.put("Pokemon_evolation", getDataWithJsoup.Pokemon_evolation(i));
            table.insert(datas);
        }
    }
}




