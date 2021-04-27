package com.wei.feign.impl;

import com.wei.entity.Student;
import com.wei.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

//@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
