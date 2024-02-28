package com.carwebservice.CarWebService.Utilities;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;

import java.sql.Clob;
import java.util.List;

@Slf4j
@Converter
public class ArrayListToClobConverter implements AttributeConverter<List<String>, Clob> {

    @Override
    public Clob convertToDatabaseColumn(List<String> attribute) {
        return null;
    }

    @Override
    public List<String> convertToEntityAttribute(Clob attribute) {
        return null;
    }
}
