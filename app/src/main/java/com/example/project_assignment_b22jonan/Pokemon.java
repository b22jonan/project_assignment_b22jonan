package com.example.project_assignment_b22jonan;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;


public class Pokemon {
    protected String ID;
    @SerializedName(value = "Name", alternate = "name")
    protected String name; // Name
    @SerializedName(value = "Location", alternate = "generation")
    protected String generation; // Location
    @SerializedName(value = "Size", alternate = "EvolutionStage")
    protected String evolutionStage;  // Size
    @SerializedName(value = "AuxData", alternate = "Types")
    protected JsonObject Types; // AuxData

    @Override
    public String toString() {
        return "Pokemon{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", generation='" + generation + '\'' +
                ", evolutionStage='" + evolutionStage + '\'' +
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

    public String getEvolutionStage() {
        return evolutionStage;
    }

    public JsonObject getTypes() {
        return Types;
    }

    public String getType1() {
        // TODO: return the pokemon types as imagepaths
        return "";
    }

}
