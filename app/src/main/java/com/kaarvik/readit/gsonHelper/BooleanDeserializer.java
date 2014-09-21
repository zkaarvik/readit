package com.kaarvik.readit.gsonHelper;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Zach on 9/19/2014
 *
 * This deserializer will handle Boolean values, required for case when
 * reddit is returning the "edited" property. It may be true, false, or
 * an integer representing a date.
 *
 * Current solution is to convert integers to true. A better solution
 * is to convert the boolean "edited" property of certain classes in
 * com.kaarvik.reddit.object to an integer. However this proves to
 * be much more complicated and inelegant.
 */

public class BooleanDeserializer implements JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String element = json.getAsString();
        Boolean thing = !element.equals("false");
        return thing;
    }
}
