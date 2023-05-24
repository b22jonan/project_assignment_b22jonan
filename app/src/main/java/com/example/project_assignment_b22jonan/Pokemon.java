package com.example.project_assignment_b22jonan;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;


public class Pokemon {
    protected String ID;
    @SerializedName(value = "Name", alternate = "name")
    protected String name; // Name
    @SerializedName(value = "Location", alternate = "generation")
    protected String generation; // Location
    @SerializedName(value = "Size", alternate = "Image")
    protected String Image;  // Size
    @SerializedName(value = "AuxData", alternate = "Types")
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
        int i = 0;
        for (String type : Types.keySet()) {
            types[i] = type;
            i++;
        }
        return types;
    }
}
