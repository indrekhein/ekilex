/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables;


import eki.eve.db.Keys;
import eki.eve.db.Public;
import eki.eve.db.tables.records.DomainLabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainLabel extends TableImpl<DomainLabelRecord> {

    private static final long serialVersionUID = -610040225;

    /**
     * The reference instance of <code>public.domain_label</code>
     */
    public static final DomainLabel DOMAIN_LABEL = new DomainLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainLabelRecord> getRecordType() {
        return DomainLabelRecord.class;
    }

    /**
     * The column <code>public.domain_label.code</code>.
     */
    public final TableField<DomainLabelRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.origin</code>.
     */
    public final TableField<DomainLabelRecord, String> ORIGIN = createField("origin", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.value</code>.
     */
    public final TableField<DomainLabelRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.domain_label.lang</code>.
     */
    public final TableField<DomainLabelRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false), this, "");

    /**
     * The column <code>public.domain_label.type</code>.
     */
    public final TableField<DomainLabelRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CHAR.length(10).nullable(false), this, "");

    /**
     * Create a <code>public.domain_label</code> table reference
     */
    public DomainLabel() {
        this("domain_label", null);
    }

    /**
     * Create an aliased <code>public.domain_label</code> table reference
     */
    public DomainLabel(String alias) {
        this(alias, DOMAIN_LABEL);
    }

    private DomainLabel(String alias, Table<DomainLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainLabel(String alias, Table<DomainLabelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DomainLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<DomainLabelRecord>>asList(Keys.DOMAIN_LABEL_CODE_ORIGIN_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DomainLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DomainLabelRecord, ?>>asList(Keys.DOMAIN_LABEL__DOMAIN_LABEL_CODE_FKEY, Keys.DOMAIN_LABEL__DOMAIN_LABEL_LANG_FKEY, Keys.DOMAIN_LABEL__DOMAIN_LABEL_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DomainLabel as(String alias) {
        return new DomainLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainLabel rename(String name) {
        return new DomainLabel(name, null);
    }
}
