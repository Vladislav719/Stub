package com.github.vladislav719.controller;

import com.github.vladislav719.model.News;
import com.github.vladislav719.service.NewsService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Владислав on 03.04.2015.
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public  News getOneNews(@PathVariable Long id) {
       return newsService.getNewsById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Object deleteOneNews(@PathVariable Long id) {
        return newsService.deleteNews(id);
    }

    @RequestMapping(value = {"/all", "/"}, method = RequestMethod.GET)
    public List<News> getAll() {
        return Lists.newArrayList(newsService.getAll());
    }


}
