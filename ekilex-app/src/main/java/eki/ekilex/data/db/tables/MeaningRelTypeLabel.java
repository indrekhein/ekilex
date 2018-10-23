/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.MeaningRelTypeLabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MeaningRelTypeLabel extends TableImpl<MeaningRelTypeLabelRecord> {

    private static final long serialVersionUID = -1832263631;

    /**
     * The reference instance of <code>public.meaning_rel_type_label</code>
     */
    public static final MeaningRelTypeLabel MEANING_REL_TYPE_LABEL = new MeaningRelTypeLabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeaningRelTypeLabelRecord> getRecordType() {
        return MeaningRelTypeLabelRecord.class;
    }

    /**
     * The column <code>public.meaning_rel_type_label.code</code>.
     */
    public final TableField<MeaningRelTypeLabelRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.meaning_rel_type_label.value</code>.
     */
    public final TableField<MeaningRelTypeLabelRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.meaning_rel_type_label.lang</code>.
     */
    public final TableField<MeaningRelTypeLabelRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.meaning_rel_type_label.type</code>.
     */
    public final TableField<MeaningRelTypeLabelRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>public.meaning_rel_type_label</code> table reference
     */
    public MeaningRelTypeLabel() {
        this(DSL.name("meaning_rel_type_label"), null);
    }

    /**
     * Create an aliased <code>public.meaning_rel_type_label</code> table reference
     */
    public MeaningRelTypeLabel(String alias) {
        this(DSL.name(alias), MEANING_REL_TYPE_LABEL);
    }

    /**
     * Create an aliased <code>public.meaning_rel_type_label</code> table reference
     */
    public MeaningRelTypeLabel(Name alias) {
        this(alias, MEANING_REL_TYPE_LABEL);
    }

    private MeaningRelTypeLabel(Name alias, Table<MeaningRelTypeLabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeaningRelTypeLabel(Name alias, Table<MeaningRelTypeLabelRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MEANING_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeaningRelTypeLabelRecord>> getKeys() {
        return Arrays.<UniqueKey<MeaningRelTypeLabelRecord>>asList(Keys.MEANING_REL_TYPE_LABEL_CODE_LANG_TYPE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<MeaningRelTypeLabelRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<MeaningRelTypeLabelRecord, ?>>asList(Keys.MEANING_REL_TYPE_LABEL__MEANING_REL_TYPE_LABEL_CODE_FKEY, Keys.MEANING_REL_TYPE_LABEL__MEANING_REL_TYPE_LABEL_LANG_FKEY, Keys.MEANING_REL_TYPE_LABEL__MEANING_REL_TYPE_LABEL_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelTypeLabel as(String alias) {
        return new MeaningRelTypeLabel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeaningRelTypeLabel as(Name alias) {
        return new MeaningRelTypeLabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningRelTypeLabel rename(String name) {
        return new MeaningRelTypeLabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MeaningRelTypeLabel rename(Name name) {
        return new MeaningRelTypeLabel(name, null);
    }
}
