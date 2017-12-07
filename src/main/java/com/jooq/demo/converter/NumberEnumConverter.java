package com.jooq.demo.converter;

import org.jooq.impl.AbstractConverter;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.jooq.tools.Convert.convert;

/**
 * @author ellien
 * @package com.jooq.demo.converter
 * @date 2017/12/07 11:32
 */
public class NumberEnumConverter<T extends Number, U extends Enum<U>> extends AbstractConverter<T, U> {

    private final Map<T, U> lookup;

    public NumberEnumConverter(Class<T> fromType, Class<U> toType) {
        super(fromType, toType);
        this.lookup = new LinkedHashMap<T, U>();
        for (U u : toType.getEnumConstants()) {
            this.lookup.put(to(u), u);
        }
    }

    @Override
    public U from(T dbObj) {
        return lookup.get(dbObj);
    }

    @Override
    public T to(U uObj) {
        if (uObj == null){
            return null;
        }else {
            try {
                Object value = BeanUtils.getPropertyDescriptor(toType(), "value").getReadMethod().invoke(uObj);
                return convert(value, fromType());
            } catch (IllegalAccessException | InvocationTargetException e) {
                return null;
            }
        }
    }
}
