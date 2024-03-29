package com.dio.citiesapi.cities.entities;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.usertype.UserType;
import org.springframework.data.geo.Point;
import org.postgresql.geometric.PGpoint;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class PointType implements UserType {

    @Override
    public int[] sqlTypes() {
        return new int[] {Types.OTHER};
    }

    @Override
    public Class returnedClass() {
        return Point.class;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        return false;
    }

    @Override
    public int hashCode(Object o) throws HibernateException {
        return 0;
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] names, SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException, SQLException {
        PGpoint value = (PGpoint) resultSet.getObject(names[0]);
        return new Point(value.x, value.y);
    }

    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Object o, int i, SharedSessionContractImplementor sharedSessionContractImplementor) throws HibernateException, SQLException {

    }

    @Override
    public Object deepCopy(Object o) throws HibernateException {
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object o) throws HibernateException {
        return null;
    }

    @Override
    public Object assemble(Serializable serializable, Object o) throws HibernateException {
        return null;
    }

    @Override
    public Object replace(Object o, Object o1, Object o2) throws HibernateException {
        return null;
    }
}
