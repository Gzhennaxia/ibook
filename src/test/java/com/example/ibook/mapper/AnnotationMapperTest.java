package com.example.ibook.mapper;

import com.example.ibook.entity.Annotation;
import com.example.ibook.mapper.annotation.AnnotationMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AnnotationMapperTest {

    @Autowired
    private AnnotationMapper annotationMapper;

    @Test
    public void selectList() {
        List<Annotation> annotations = annotationMapper.selectList();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            System.out.println();
        }
    }

}