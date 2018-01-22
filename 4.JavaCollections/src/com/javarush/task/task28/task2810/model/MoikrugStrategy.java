package com.javarush.task.task28.task2810.model;

import com.javarush.task.task28.task2810.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MoikrugStrategy implements  Strategy {
    private final static String URL_FORMAT = "https://moikrug.ru/vacancies?q=java+%s&page=%d";
//    private static final String URL_FORMAT = "https://moikrug.ru/vacancies?%sq=java&page=%s";
//  private static final String URL_FORMAT = "http://javarush.ru/testdata/big28data2.html";

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
            Elements vacancies = doc.getElementsByClass("job");
            if (vacancies.size()==0) break;
            for (Element element: vacancies)
            {
                if (element != null)
                {
                    Vacancy vac = new Vacancy();
                    vac.setTitle(element.getElementsByClass("title").text());
                    vac.setCompanyName(element.getElementsByClass("company_name").text());
                    vac.setSiteName(URL_FORMAT);
                    vac.setUrl("https://moikrug.ru" + element.select("a[class=job_icon]").attr("href"));
                    String salary = element.getElementsByClass("count").text();
                    String city = element.getElementsByClass("location").text();
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
//        Правильно
//        Document doc = null;
//        String page_ = "";
//        if (page > 1)
//        page_ = String.format("page=%d&",page);
//        String s = String.format (URL_FORMAT,page_, searchString);
//        doc = Jsoup.connect(s).
//                userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0").
//                referrer("no-referrer-when-downgrade").
//                get();

        Document doc = null;
        String s = String.format (URL_FORMAT, searchString, page);
        doc = Jsoup.connect(s).
                userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:57.0) Gecko/20100101 Firefox/57.0").
                referrer("no-referrer-when-downgrade").
                get();

        return doc;
    }
}


