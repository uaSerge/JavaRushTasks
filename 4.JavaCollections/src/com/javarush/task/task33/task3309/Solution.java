package com.javarush.task.task33.task3309;

import com.javarush.task.task33.task3308.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

/*
Комментарий внутри xml
Комментарий внутри xml
Реализовать метод toXmlWithComment, который должен возвращать строку — xml представление объекта obj.
В строке перед каждым тегом tagName должен быть вставлен комментарий comment.
Сериализация obj в xml может содержать CDATA с искомым тегом. Перед ним вставлять комментарий не нужно.

Пример вызова:
toXmlWithComment(firstSecondObject, «second», «it’s a comment»)

Пример результата:
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<first>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second>some string</second>
<!--it's a comment-->
<second><![CDATA[need CDATA because of < and >]]></second>
<!--it's a comment-->
<second/>
</first>


Требования:
1. Количество комментариев вставленных в xml должно быть равно количеству тегов tagName.
2. Метод toXmlWithComment должен возвращать xml в виде строки преобразованной в соответствии с условием задачи.
3. Метод toXmlWithComment не должен изменять входящий xml в случае, если искомый тег отсутствует в нём.
4. Метод toXmlWithComment должен быть статическим.
5. Метод toXmlWithComment должен быть публичным.
*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws IOException, JAXBException{
        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(obj, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
 //       System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws IOException, JAXBException {
        Shop shop = new Shop();
        shop.count = 1;
        shop.profit = 123.1;
        shop.secretData = new String[2];
        shop.secretData[0]= "qwe";
        shop.secretData[1] = "lkjedl";
        shop.goods.names.add("good 1");
        shop.goods.names.add("good 2");
        System.out.println(toXmlWithComment(shop,"goods","comment"));
    }
}
