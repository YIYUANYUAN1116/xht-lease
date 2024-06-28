//package com.xht.lease.custom;
//
//import com.fasterxml.jackson.databind.JavaType;
//import com.fasterxml.jackson.databind.type.TypeFactory;
//import com.fasterxml.jackson.databind.util.Converter;
//import com.xht.lease.enums.ItemType;
//import org.springframework.stereotype.Component;
//
//@Component
//public class StringToItemTypeConverter implements Converter<String, ItemType> {
//    @Override
//    public ItemType convert(String code) {
//
//        for (ItemType value : ItemType.values()) {
//            if (value.getCode().equals(Integer.valueOf(code))) {
//                return value;
//            }
//        }
//        throw new IllegalArgumentException("code非法");
//    }
//
//    @Override
//    public JavaType getInputType(TypeFactory typeFactory) {
//        return null;
//    }
//
//    @Override
//    public JavaType getOutputType(TypeFactory typeFactory) {
//        return null;
//    }
//}
