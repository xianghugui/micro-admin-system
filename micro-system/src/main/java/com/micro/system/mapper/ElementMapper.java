package com.micro.system.mapper;


import com.micro.system.bean.Element;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ElementMapper {
    /**
     * 插入菜单元素
     * @param element
     * @return
     */
    boolean insert(Element element);

}