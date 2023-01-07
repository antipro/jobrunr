package org.jobrunr.storage.sql.common.db.dialect;

public class OracleLegacyDialect implements Dialect {

    @Override
    public String limitAndOffset(String order) {
        return " ORDER BY " + order + ") WHERE rownum <= :offset + :limit) WHERE ORA_RN > :offset";
    }

    @Override
    public String escape(String toEscape) {
        return toEscape;
    }
}
