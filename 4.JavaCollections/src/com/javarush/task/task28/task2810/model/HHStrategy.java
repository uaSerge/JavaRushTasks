package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.examples.HtmlToPlainText;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class HHStrategy implements Strategy {
//  private static final String URL_FORMAT = "https://hh.ua/search/vacancy";
    private final static String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";
//  private static final String URL_FORMAT = "https://javarush.ru/testdata/big28data.html";

@Override
public List<Vacancy> getVacancies(String searchString)
{
    List<Vacancy> Vacancies = new ArrayList<>();
        int pageNum = 0;
        Document doc = null;
        while(true)
        {
            try {
                doc = getDocument(searchString, pageNum);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements vacancies = doc.getElementsByAttributeValue("data-qa","vacancy-serp__vacancy");
            if (vacancies.size()==0) break;
            for (Element element: vacancies)
            {
                if (element != null)
                {
                    Vacancy vac = new Vacancy();
                    vac.setTitle(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").text());
                    vac.setCompanyName(element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-employer").text());
                    vac.setSiteName(URL_FORMAT);
                    vac.setUrl(element.select("a[class=b-vacancy-list-link b-marker-link]").attr("href"));
                    //               vac.setUrl("https://moikrug.ru" + element.select("a[class=job_icon]").attr("href"));
                    String salary = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-compensation").text();
                    String city = element.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-address").text();
                    vac.setSalary(salary.length()==0 ? "" : salary);
                    vac.setCity(city.length()==0 ? "" : city);
                    Vacancies.add(vac);
                }
            }
            pageNum++;
    }
    return Vacancies;
}

    protected Document getDocument(String searchString, int page) throws IOException {
        Document doc = null;
        String s = String.format (URL_FORMAT, searchString, page);
        doc = Jsoup.connect(s).
                userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0").
                referrer("no-referrer-when-downgrade").
                get();
        return doc;
    }
}
