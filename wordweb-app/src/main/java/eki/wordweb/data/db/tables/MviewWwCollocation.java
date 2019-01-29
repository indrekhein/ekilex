/*
 * This file is generated by jOOQ.
 */
package eki.wordweb.data.db.tables;


import eki.wordweb.data.db.Indexes;
import eki.wordweb.data.db.Public;
import eki.wordweb.data.db.tables.records.MviewWwCollocationRecord;
import eki.wordweb.data.db.udt.records.TypeCollocMemberRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MviewWwCollocation extends TableImpl<MviewWwCollocationRecord> {

    private static final long serialVersionUID = -1129188986;

    /**
     * The reference instance of <code>public.mview_ww_collocation</code>
     */
    public static final MviewWwCollocation MVIEW_WW_COLLOCATION = new MviewWwCollocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MviewWwCollocationRecord> getRecordType() {
        return MviewWwCollocationRecord.class;
    }

    /**
     * The column <code>public.mview_ww_collocation.lexeme_id</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.word_id</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.dataset_code</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.mview_ww_collocation.level1</code>.
     */
    public final TableField<MviewWwCollocationRecord, Integer> LEVEL1 = createField("level1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_collocation.level2</code>.
     */
    public final TableField<MviewWwCollocationRecord, Integer> LEVEL2 = createField("level2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_collocation.level3</code>.
     */
    public final TableField<MviewWwCollocationRecord, Integer> LEVEL3 = createField("level3", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_collocation.pos_group_id</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> POS_GROUP_ID = createField("pos_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.pos_group_code</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> POS_GROUP_CODE = createField("pos_group_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.mview_ww_collocation.pos_group_order_by</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> POS_GROUP_ORDER_BY = createField("pos_group_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.rel_group_id</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> REL_GROUP_ID = createField("rel_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.rel_group_name</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> REL_GROUP_NAME = createField("rel_group_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_collocation.rel_group_order_by</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> REL_GROUP_ORDER_BY = createField("rel_group_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_group_order</code>.
     */
    public final TableField<MviewWwCollocationRecord, Integer> COLLOC_GROUP_ORDER = createField("colloc_group_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_id</code>.
     */
    public final TableField<MviewWwCollocationRecord, Long> COLLOC_ID = createField("colloc_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_value</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> COLLOC_VALUE = createField("colloc_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_definition</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> COLLOC_DEFINITION = createField("colloc_definition", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_usages</code>.
     */
    public final TableField<MviewWwCollocationRecord, String[]> COLLOC_USAGES = createField("colloc_usages", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_collocation.colloc_members</code>.
     */
    public final TableField<MviewWwCollocationRecord, TypeCollocMemberRecord[]> COLLOC_MEMBERS = createField("colloc_members", eki.wordweb.data.db.udt.TypeCollocMember.TYPE_COLLOC_MEMBER.getDataType().getArrayDataType(), this, "");

    /**
     * The column <code>public.mview_ww_collocation.target_context</code>.
     */
    public final TableField<MviewWwCollocationRecord, String> TARGET_CONTEXT = createField("target_context", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>public.mview_ww_collocation</code> table reference
     */
    public MviewWwCollocation() {
        this(DSL.name("mview_ww_collocation"), null);
    }

    /**
     * Create an aliased <code>public.mview_ww_collocation</code> table reference
     */
    public MviewWwCollocation(String alias) {
        this(DSL.name(alias), MVIEW_WW_COLLOCATION);
    }

    /**
     * Create an aliased <code>public.mview_ww_collocation</code> table reference
     */
    public MviewWwCollocation(Name alias) {
        this(alias, MVIEW_WW_COLLOCATION);
    }

    private MviewWwCollocation(Name alias, Table<MviewWwCollocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private MviewWwCollocation(Name alias, Table<MviewWwCollocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MviewWwCollocation(Table<O> child, ForeignKey<O, MviewWwCollocationRecord> key) {
        super(child, key, MVIEW_WW_COLLOCATION);
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
        return Arrays.<Index>asList(Indexes.MVIEW_WW_COLLOCATION_DATASET_CODE_IDX, Indexes.MVIEW_WW_COLLOCATION_LEXEME_ID_IDX, Indexes.MVIEW_WW_COLLOCATION_TARGET_CONTEXT_IDX, Indexes.MVIEW_WW_COLLOCATION_WORD_ID_IDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwCollocation as(String alias) {
        return new MviewWwCollocation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MviewWwCollocation as(Name alias) {
        return new MviewWwCollocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwCollocation rename(String name) {
        return new MviewWwCollocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MviewWwCollocation rename(Name name) {
        return new MviewWwCollocation(name, null);
    }
}
