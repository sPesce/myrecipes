package spesce.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spesce.springframework.domain.Category;
import spesce.springframework.domain.UnitOfMeasure;
import spesce.springframework.repositories.CategoryRepository;
import spesce.springframework.repositories.UnitOfMeasureRepository;
import spesce.springframework.services.RecipeService;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
