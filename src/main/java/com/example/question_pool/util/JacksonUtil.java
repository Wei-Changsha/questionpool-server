package com.example.question_pool.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T Json2Bean(String json, Class<T> beanClass){
        try {
            return mapper.readValue(json, beanClass);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String Bean2Json(Object bean) {
        try {
            return mapper.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
