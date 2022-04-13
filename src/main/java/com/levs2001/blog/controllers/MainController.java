package com.levs2001.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Класс помеченный контроллером отвечает за обработку всех переходов на сайте
public class MainController {

    /**
     * @param model - обязательный параметр, с помощью которого можно указать, какие данные
     *              мы передаем внутрь шаблона.
     */
    @GetMapping("/")
    // GetMapping говорит о том, какой адрес мы обрабатываем
    public String home(Model model) {
        // Отправка параметра в шаблон
        model.addAttribute("title", "Главная страница");
        // Вызов шаблона с названием home
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Нуклеотид о себе");
        return "about";
    }
}
