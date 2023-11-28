
package com.films.classes;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlParser {

    private int a;

    public XmlParser() {
    }

    public void anime()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            AnimeDecorator uniquePC = AnimeDecorator.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);
                if (build.getElementsByTagName("name").item(0).getTextContent().equals("Anime")) {
                    uniquePC.setName(build.getElementsByTagName("name").item(0).getTextContent());
                    uniquePC.setTitle(build.getElementsByTagName("title").item(0).getTextContent());
                    uniquePC.setDirector(build.getElementsByTagName("director").item(0).getTextContent());
                    uniquePC.setYear(build.getElementsByTagName("year").item(0).getTextContent());
                    uniquePC.setDescr(build.getElementsByTagName("descr").item(0).getTextContent());
                    i = buildList.getLength();
                }
            }
            uniquePC.getinfo();

    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public void allFilms()
    {
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

                System.out.println("----------------------------------------");
                System.out.println("Build Name: " + name);
                System.out.println("TITLE: " + title);
                System.out.println("DIRECTOR: " + director);
                System.out.println("YEAR: " + year);
                System.out.println("DESCRIPTION: " + descr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serial()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            AnimeDecorator uniquePC = AnimeDecorator.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String title = build.getElementsByTagName("title").item(0).getTextContent();
                String director = build.getElementsByTagName("director").item(0).getTextContent();
                String year = build.getElementsByTagName("year").item(0).getTextContent();
                String descr = build.getElementsByTagName("descr").item(0).getTextContent();

                FilmsAction computer = new Films(name,title,director,year,descr);

                if(name.equals("Serial")){
                    FilmsAction decoratedComputer = new CartoonDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void films()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            AnimeDecorator uniquePC = AnimeDecorator.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String title = build.getElementsByTagName("title").item(0).getTextContent();
                String director = build.getElementsByTagName("director").item(0).getTextContent();
                String year = build.getElementsByTagName("year").item(0).getTextContent();
                String descr = build.getElementsByTagName("descr").item(0).getTextContent();

                FilmsAction computer = new Films(name,title,director,year,descr);

                if(name.equals("Films")){
                    FilmsAction decoratedComputer = new SerialDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cartoon()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            AnimeDecorator uniquePC = AnimeDecorator.getInstance();

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);

                String name = build.getElementsByTagName("name").item(0).getTextContent();
                String title = build.getElementsByTagName("title").item(0).getTextContent();
                String director = build.getElementsByTagName("director").item(0).getTextContent();
                String year = build.getElementsByTagName("year").item(0).getTextContent();
                String descr = build.getElementsByTagName("descr").item(0).getTextContent();

                FilmsAction computer = new Films(name,title,director,year,descr);

                if(name.equals("Cartoon")){
                    FilmsAction decoratedComputer = new OtherDecorator(computer);
                    decoratedComputer.action();
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void statistic()
    {
        try {
            // Создание построителя документа
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse("filmsBuilds.xml");

            NodeList buildList = document.getElementsByTagName("build");
            AnimeDecorator uniquePC = AnimeDecorator.getInstance();

            int serialCount = 0;
            int workCount = 0;
            int cartoonCount = 0;

            for (int i = 0; i < buildList.getLength(); i++) {
                Element build = (Element) buildList.item(i);
                String name = build.getElementsByTagName("name").item(0).getTextContent();

                if(name.equals("Serial")) serialCount++;
                if(name.equals("Films")) workCount++;
                if(name.equals("Cartoon")) cartoonCount++;

            }
            System.out.println("Фильмы: " + serialCount);
            System.out.println("Сериалы: " + workCount);
            System.out.println("Мультики: " + cartoonCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//                while(true)
//                {
//                    System.out.println("--------------------------------");
//                    System.out.println("1) Вывести все сборки");
//                    System.out.println("2) Вывести уникальные сборки");
//                    System.out.println("3) Вывести игровые сборки");
//                    System.out.println("4) Вывести бюджетные сборки");
//                    System.out.println("5) Вывести рабочие сборки");
//                    System.out.println("6) Статистика");
//                    System.out.println("7) Выход");
//                    Scanner sc = new Scanner(System.in);
//                    switch (sc.nextInt())
//                    {
//                        case 1:
//                        {
//                            XmlParser.allPc();
//                            break;
//                        }
//                        case 2:
//                        {
//                            XmlParser.uniquePc();
//                            break;
//                        }
//                        case 3:
//                        {
//                            XmlParser.gamePc();
//                            break;
//                        }
//                        case 4:
//                        {
//                            XmlParser.budgetPc();
//                            break;
//                        }
//                        case 5:
//                        {
//                            XmlParser.workPc();
//                            break;
//                        }
//                        case 6:
//                        {
//                            XmlParser.statistic();
//                            break;
//                        }
//                        case 7:
//                        {
//                            return;
//                        }
//                        default:
//                        {
//                            System.out.println("Неверное значение!");
//                            break;
//                        }
//                    }
//
//                }
//
//            }

    }

