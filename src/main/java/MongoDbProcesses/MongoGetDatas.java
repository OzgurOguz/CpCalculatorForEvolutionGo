package main.java.MongoDbProcesses;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import main.java.PojoClass.MongoPojo;

public class MongoGetDatas {

    MongodbConnect mongodbConnect = new MongodbConnect();
    MongoPojo mongoPojo = new MongoPojo();

    public void MongoGetDatas(String pokemonName){
        MongoClient mongoClient = new MongoClient();
        DB db = mongoClient.getDB("pokemonDb");
        String pokemon_name = pokemonName;
        DBCollection getData = db.getCollection(pokemon_name);

        DBObject dbObject = getData.findOne();
        mongoPojo.setPokemon_coefficiency_table(dbObject.get("Pokemon_coefficiency_table").toString());
        mongoPojo.setPokemon_efficiency_table(dbObject.get("Pokemon_efficiency_table").toString());
        mongoPojo.setPokemon_effectiveness(dbObject.get("Pokemon_effectiveness").toString());
        mongoPojo.setPokemon_image(dbObject.get("Pokemon_image").toString());
        mongoPojo.setPokemon_evolation(dbObject.get("Pokemon_evolation").toString());
    }
}
