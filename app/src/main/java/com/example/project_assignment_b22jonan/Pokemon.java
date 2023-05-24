package com.example.project_assignment_b22jonan;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



public class Pokemon {
    protected String ID;
    protected String name;
    @SerializedName(value = "location", alternate = "generation")
    protected String generation; // Location
    @SerializedName(value = "company", alternate = "Image")
    protected String Image;  // Company
    @SerializedName(value = "auxdata", alternate = "Types")
    protected JsonObject Types; // AuxData

    @Override
    public String toString() {
        return "Pokemon{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", generation='" + generation + '\'' +
                ", Types=" + Types +
                '}';
    }

    // getters
    public String getID() {
        // remove last 8 characters from ID
        ID = ID.substring(0, ID.length() - 8);
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGeneration() {
        return "gen: "+ generation;
    }

    public String getImage() {
        return Image;
    }

    public String[] getTypes()  {
        try {
            String JSONString = Types.toString();
            JSONObject jsonObject = new JSONObject(JSONString);
            JSONArray typesArray = jsonObject.getJSONArray("Types");

            String[] types = new String[typesArray.length()];
            for (int i = 0; i < typesArray.length(); i++) {
                types[i] = typesArray.getString(i);
            }

            return types;
        } catch (JSONException e) {
            e.printStackTrace();
            return new String[0];
        }



    }
}
