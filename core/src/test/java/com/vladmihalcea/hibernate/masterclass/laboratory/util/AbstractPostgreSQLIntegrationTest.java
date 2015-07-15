package com.vladmihalcea.hibernate.masterclass.laboratory.util;

/**
 * AbstractPostgreSQLIntegrationTest - Abstract PostgreSQL IntegrationTest
 *
 * @author Vlad Mihalcea
 */
public abstract class AbstractPostgreSQLIntegrationTest extends AbstractTest {

    @Override
    protected RdbmsDataSourceProvider getRdbmsDataSourceProvider() {
        return RdbmsDataSourceProvider.POSTGRESQL;
    }
}
