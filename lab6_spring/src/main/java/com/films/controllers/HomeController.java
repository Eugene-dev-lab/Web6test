package com.films.controllers;

import com.films.classes.Films;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {

        ArrayList<Films> serialList = new ArrayList<>();
        ArrayList<Films> filmsList = new ArrayList<>();
        ArrayList<Films> cartoonList = new ArrayList<>();
        ArrayList<Films> animeList = new ArrayList<>();

        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");
            NodeList buildList = document.getElementsByTagName("build");


            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String title = build.getElementsByTagName("title").item(0).getTextContent();
                String director = build.getElementsByTagName("director").item(0).getTextContent();
                String year = build.getElementsByTagName("year").item(0).getTextContent();
                String descr = build.getElementsByTagName("descr").item(0).getTextContent();

                if(name.equals("Serial")) {
                    serialList.add(new Films(name, title, director, year, descr));
                }
                if(name.equals("Films")) {
                    filmsList.add(new Films(name, title, director, year, descr));
                }
                if(name.equals("Cartoon")) {
                    cartoonList.add(new Films(name, title, director, year, descr));
                }
                if(name.equals("Anime")) {
                    animeList.add(new Films(name, title, director, year, descr));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        model.addAttribute("serialList", serialList.size());
        model.addAttribute("filmsList", filmsList.size());
        model.addAttribute("cartoonList", cartoonList.size());
        model.addAttribute("animeList", animeList.size());
            return "home";
    }
}
