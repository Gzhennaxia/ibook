package com.example.ibook.mapper.annotation;

import com.example.ibook.entity.Annotation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnotationMapper {

    List<Annotation> selectList();
}
