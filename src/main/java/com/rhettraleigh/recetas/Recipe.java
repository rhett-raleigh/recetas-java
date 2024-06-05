package com.rhettraleigh.recetas;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Recipe {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private String ingredients;

    Recipe() {
    }

    Recipe(String name, String description, String ingredients) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof Recipe))
            return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(this.id, recipe.id) && Objects.equals(this.name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Recipe{" + "id=" + this.id + ", name='" + this.name + '\'' + '}';
    }
}
