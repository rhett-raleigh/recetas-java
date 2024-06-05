package com.rhettraleigh.recetas;

import org.springframework.data.jpa.repository.JpaRepository;

interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
