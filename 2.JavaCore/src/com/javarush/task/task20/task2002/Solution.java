package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null,new File("C:\\Idea\\JavaRushTasks\\temp"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("q1");
            user.setLastName("q2");
            user.setBirthDate(new Date(123135151));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();
            if (javaRush.equals(loadedObject)) System.out.println("OK");
            else System.out.println("NOT");

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (!users.isEmpty()) {
                for (User u: users
                     ) {
//                    if (!u.getFirstName().isEmpty())
                        writer.write(u.getFirstName()+"\n");
//                    else writer.write("null"+ "\n");
//                    if (!u.getLastName().isEmpty())
                        writer.write(u.getLastName()+"\n");
//                    else writer.write("null"+ "\n");
//                    if (u.getBirthDate()==null)
                        writer.write(u.getBirthDate().getTime()+"\n");
//                    else writer.write("null"+ "\n");
                    writer.write(u.isMale()? "male" + "\n": "null"+"\n");
//                    if (!(u.getCountry()==null))
                        writer.write(u.getCountry().getDisplayedName()+"\n");
//                    else writer.write("null"+ "\n");
                    outputStream.flush();
                }
            } else writer.write("null");
            outputStream.flush();
  //          outputStream.close();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()){

                User u = new User();
                String q1 = reader.readLine();
                if (q1.equals("null")) {
                    break;
                }
                u.setFirstName(q1);

                String q2 = reader.readLine();
 //               if (!q2.equals("null"))
                u.setLastName(q2);

                String q3 = reader.readLine();
  //              if (!q3.equals("null")) {
                    Date date = new Date(Long.parseLong(q3));
  //              }
                u.setBirthDate(date);
                u.setMale(reader.readLine().equals("male"));

                String q5 = reader.readLine();
//                if (!q5.equals("null"))
                switch (q5){
                    case ("Ukraine"): u.setCountry(User.Country.UKRAINE); break;
                    case ("Russia"): u.setCountry(User.Country.RUSSIA);break;
                    case ("Other"): u.setCountry(User.Country.OTHER);break;
                }
                this.users.add(u);
            }

//            inputStream.close();
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
