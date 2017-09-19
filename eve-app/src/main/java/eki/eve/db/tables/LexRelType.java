/*
 * This file is generated by jOOQ.
*/
package eki.eve.db.tables;


import eki.eve.db.Keys;
import eki.eve.db.Public;
import eki.eve.db.tables.records.LexRelTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class LexRelType extends TableImpl<LexRelTypeRecord> {

    private static final long serialVersionUID = 1885611905;

    /**
     * The reference instance of <code>public.lex_rel_type</code>
     */
    public static final LexRelType LEX_REL_TYPE = new LexRelType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexRelTypeRecord> getRecordType() {
        return LexRelTypeRecord.class;
    }

    /**
     * The column <code>public.lex_rel_type.code</code>.
     */
    public final TableField<LexRelTypeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>public.lex_rel_type.dataset</code>.
     */
    public final TableField<LexRelTypeRecord, String[]> DATASET = createField("dataset", org.jooq.impl.SQLDataType.CHAR.getArrayDataType(), this, "");

    /**
     * Create a <code>public.lex_rel_type</code> table reference
     */
    public LexRelType() {
        this("lex_rel_type", null);
    }

    /**
     * Create an aliased <code>public.lex_rel_type</code> table reference
     */
    public LexRelType(String alias) {
        this(alias, LEX_REL_TYPE);
    }

    private LexRelType(String alias, Table<LexRelTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexRelType(String alias, Table<LexRelTypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<LexRelTypeRecord> getPrimaryKey() {
        return Keys.LEX_REL_TYPE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexRelTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<LexRelTypeRecord>>asList(Keys.LEX_REL_TYPE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexRelType as(String alias) {
        return new LexRelType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexRelType rename(String name) {
        return new LexRelType(name, null);
    }
}
