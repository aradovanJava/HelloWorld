package hr.java.web.helloworld.controller.rest;

import hr.java.web.helloworld.dto.ArticleDTO;
import hr.java.web.helloworld.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/article")
@AllArgsConstructor
public class ArticleRestController {

    private ArticleService articleService;

    @GetMapping("/all")
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles();
    }

    @PostMapping("/new")
    public void addNewArticle(@RequestBody ArticleDTO ArticleDto) {
        articleService.saveNewArticle(ArticleDto);
    }
}

