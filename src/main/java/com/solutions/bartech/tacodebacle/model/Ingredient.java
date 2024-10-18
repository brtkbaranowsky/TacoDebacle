package com.solutions.bartech.tacodebacle.model;


public record Ingredient(String id, String name, Type type) {

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}