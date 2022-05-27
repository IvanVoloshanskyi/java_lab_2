package ua.lviv.iot.lab7;

import java.util.*;
import java.util.regex.*;


public class Regular {

    private String text = "apple-peach \r\n"
            + "slava-Ukraine \r\n "
            + "coconut\r\n"
            + "pineaple\r\n"
            + "i-am-table\r\n";

    List<String> allMatches = new ArrayList<String>();
    int i = 0;

    String pattern = "((?:\\w+\\-)+\\w+)";

    public void findRegExprInText()
    {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find())
        {
            allMatches.add(m.group());
            Collections.sort(allMatches);

        }
            for (int j = 0; j < allMatches.size(); j++)
            {
                System.out.println(allMatches.get(j));
            }

    }
}


