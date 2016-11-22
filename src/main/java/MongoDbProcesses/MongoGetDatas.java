package main.java.MongoDbProcesses;

import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

public class MongoGetDatas {

    MongodbConnect mongodbConnect = new MongodbConnect();
    MongoPojo mongoPojo = new MongoPojo();

    public MongoGetDatas(String pokemonName){
        DB db = mongoClient.getDB("pokemonDb");
        String pokemon_name = pokemonName;
        DBCollection getData = db.getCollection(pokemon_name);

        DBObject dbObject = getData.findOne();
        mongoPojo.setPokemon_coefficiency_table(dbObject.get("Pokemon_coefficiency_table"));
        mongoPojo.setPokemon_efficiency_table(dbObject.get("Pokemon_efficiency_table"));
        mongoPojo.setPokemon_effectiveness(dbObject.get("Pokemon_effectiveness"));
        mongoPojo.setPokemon_image(dbObject.get("Pokemon_image"));
        mongoPojo.setPokemon_evolation(dbObject.get("Pokemon_evolation"));
    }
}
