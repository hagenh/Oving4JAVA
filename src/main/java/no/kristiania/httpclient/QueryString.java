package no.kristiania.httpclient;

import java.util.HashMap;
import java.util.Map;

public class QueryString {
    //private final String value;
    //private final String parameterName;
    private Map<String, String> parameters = new HashMap<>();

    public QueryString(String queryString) {


        for (String parameter : queryString.split("&")) {
            //String parameter = queryString;
            int equalsPos = queryString.indexOf('=');
            String value = queryString.substring(equalsPos + 1);
            String parameterName = parameter.substring(0, equalsPos);
            parameters.put(parameterName, value);
        }
    }

    public String getParameter(String name) {
        return parameters.get(name);
        //return parameters.get(name);
    }
}

