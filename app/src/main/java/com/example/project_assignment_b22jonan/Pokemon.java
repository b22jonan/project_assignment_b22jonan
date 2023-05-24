package com.example.project_assignment_b22jonan;

import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;


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
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getGeneration() {
        return generation;
    }

    public String getImage() {
        return Image;
    }

    public String[] getTypes() {
        String[] types;
        // put all the types in the array
        types = new String[Types.size()];
        Log.d("Types", Types.toString());
        int i = 0;
        for (String type : Types.keySet()) {
            types[i] = type;
            i++;
        }
        return types;
    }
}
