package com.solutions.bartech.tacodebacle.model;

import lombok.Data;

import java.util.List;

public record Taco(String name, List<Ingredient> ingredients) {
}