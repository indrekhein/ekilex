/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.LexRelationRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LexRelation extends TableImpl<LexRelationRecord> {

    private static final long serialVersionUID = 1097995695;

    /**
     * The reference instance of <code>public.lex_relation</code>
     */
    public static final LexRelation LEX_RELATION = new LexRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LexRelationRecord> getRecordType() {
        return LexRelationRecord.class;
    }

    /**
     * The column <code>public.lex_relation.id</code>.
     */
    public final TableField<LexRelationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('lex_relation_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.lex_relation.lexeme1_id</code>.
     */
    public final TableField<LexRelationRecord, Long> LEXEME1_ID = createField("lexeme1_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lex_relation.lexeme2_id</code>.
     */
    public final TableField<LexRelationRecord, Long> LEXEME2_ID = createField("lexeme2_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.lex_relation.lex_rel_type_code</code>.
     */
    public final TableField<LexRelationRecord, String> LEX_REL_TYPE_CODE = createField("lex_rel_type_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * Create a <code>public.lex_relation</code> table reference
     */
    public LexRelation() {
        this(DSL.name("lex_relation"), null);
    }

    /**
     * Create an aliased <code>public.lex_relation</code> table reference
     */
    public LexRelation(String alias) {
        this(DSL.name(alias), LEX_RELATION);
    }

    /**
     * Create an aliased <code>public.lex_relation</code> table reference
     */
    public LexRelation(Name alias) {
        this(alias, LEX_RELATION);
    }

    private LexRelation(Name alias, Table<LexRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private LexRelation(Name alias, Table<LexRelationRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LEX_RELATION_LEXEME1_ID_IDX, Indexes.LEX_RELATION_LEXEME1_ID_LEXEME2_ID_LEX_REL_TYPE_CODE_KEY, Indexes.LEX_RELATION_LEXEME2_ID_IDX, Indexes.LEX_RELATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LexRelationRecord, Long> getIdentity() {
        return Keys.IDENTITY_LEX_RELATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LexRelationRecord> getPrimaryKey() {
        return Keys.LEX_RELATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LexRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<LexRelationRecord>>asList(Keys.LEX_RELATION_PKEY, Keys.LEX_RELATION_LEXEME1_ID_LEXEME2_ID_LEX_REL_TYPE_CODE_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<LexRelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LexRelationRecord, ?>>asList(Keys.LEX_RELATION__LEX_RELATION_LEXEME1_ID_FKEY, Keys.LEX_RELATION__LEX_RELATION_LEXEME2_ID_FKEY, Keys.LEX_RELATION__LEX_RELATION_LEX_REL_TYPE_CODE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexRelation as(String alias) {
        return new LexRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LexRelation as(Name alias) {
        return new LexRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LexRelation rename(String name) {
        return new LexRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LexRelation rename(Name name) {
        return new LexRelation(name, null);
    }
}
