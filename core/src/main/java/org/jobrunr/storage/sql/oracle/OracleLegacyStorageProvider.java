package org.jobrunr.storage.sql.oracle;

import org.jobrunr.storage.StorageProviderUtils.DatabaseOptions;
import org.jobrunr.storage.sql.common.DefaultSqlStorageProvider;
import org.jobrunr.storage.sql.common.db.dialect.OracleDialect;
import org.jobrunr.storage.sql.common.db.dialect.OracleLegacyDialect;

import javax.sql.DataSource;

public class OracleLegacyStorageProvider extends DefaultSqlStorageProvider {

    public OracleLegacyStorageProvider(DataSource dataSource) {
        this(dataSource, DatabaseOptions.CREATE);
    }

    public OracleLegacyStorageProvider(DataSource dataSource, String tablePrefix) {
        this(dataSource, tablePrefix, DatabaseOptions.CREATE);
    }

    public OracleLegacyStorageProvider(DataSource dataSource, DatabaseOptions databaseOptions) {
        super(dataSource, new OracleLegacyDialect(), databaseOptions);
    }

    public OracleLegacyStorageProvider(DataSource dataSource, String tablePrefix, DatabaseOptions databaseOptions) {
        super(dataSource, new OracleLegacyDialect(), tablePrefix, databaseOptions);
    }

}
