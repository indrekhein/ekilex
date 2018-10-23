/*
 * This file is generated by jOOQ.
*/
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.ViewWwCollocationRecord;
import eki.ekilex.data.db.udt.records.TypeCollocMemberRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewWwCollocation extends TableImpl<ViewWwCollocationRecord> {

    private static final long serialVersionUID = 12405366;

    /**
     * The reference instance of <code>public.view_ww_collocation</code>
     */
    public static final ViewWwCollocation VIEW_WW_COLLOCATION = new ViewWwCollocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewWwCollocationRecord> getRecordType() {
        return ViewWwCollocationRecord.class;
    }

    /**
     * The column <code>public.view_ww_collocation.lexeme_id</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> LEXEME_ID = createField("lexeme_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.word_id</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> WORD_ID = createField("word_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.dataset_code</code>.
     */
    public final TableField<ViewWwCollocationRecord, String> DATASET_CODE = createField("dataset_code", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.view_ww_collocation.level1</code>.
     */
    public final TableField<ViewWwCollocationRecord, Integer> LEVEL1 = createField("level1", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_collocation.level2</code>.
     */
    public final TableField<ViewWwCollocationRecord, Integer> LEVEL2 = createField("level2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_collocation.level3</code>.
     */
    public final TableField<ViewWwCollocationRecord, Integer> LEVEL3 = createField("level3", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_collocation.pos_group_id</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> POS_GROUP_ID = createField("pos_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.pos_group_code</code>.
     */
    public final TableField<ViewWwCollocationRecord, String> POS_GROUP_CODE = createField("pos_group_code", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>public.view_ww_collocation.pos_group_order_by</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> POS_GROUP_ORDER_BY = createField("pos_group_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.rel_group_id</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> REL_GROUP_ID = createField("rel_group_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.rel_group_name</code>.
     */
    public final TableField<ViewWwCollocationRecord, String> REL_GROUP_NAME = createField("rel_group_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_collocation.rel_group_order_by</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> REL_GROUP_ORDER_BY = createField("rel_group_order_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_group_order</code>.
     */
    public final TableField<ViewWwCollocationRecord, Integer> COLLOC_GROUP_ORDER = createField("colloc_group_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_id</code>.
     */
    public final TableField<ViewWwCollocationRecord, Long> COLLOC_ID = createField("colloc_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_value</code>.
     */
    public final TableField<ViewWwCollocationRecord, String> COLLOC_VALUE = createField("colloc_value", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_definition</code>.
     */
    public final TableField<ViewWwCollocationRecord, String> COLLOC_DEFINITION = createField("colloc_definition", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_usages</code>.
     */
    public final TableField<ViewWwCollocationRecord, String[]> COLLOC_USAGES = createField("colloc_usages", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>public.view_ww_collocation.colloc_members</code>.
     */
    public final TableField<ViewWwCollocationRecord, TypeCollocMemberRecord[]> COLLOC_MEMBERS = createField("colloc_members", eki.ekilex.data.db.udt.TypeCollocMember.TYPE_COLLOC_MEMBER.getDataType().getArrayDataType(), this, "");

    /**
     * Create a <code>public.view_ww_collocation</code> table reference
     */
    public ViewWwCollocation() {
        this(DSL.name("view_ww_collocation"), null);
    }

    /**
     * Create an aliased <code>public.view_ww_collocation</code> table reference
     */
    public ViewWwCollocation(String alias) {
        this(DSL.name(alias), VIEW_WW_COLLOCATION);
    }

    /**
     * Create an aliased <code>public.view_ww_collocation</code> table reference
     */
    public ViewWwCollocation(Name alias) {
        this(alias, VIEW_WW_COLLOCATION);
    }

    private ViewWwCollocation(Name alias, Table<ViewWwCollocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewWwCollocation(Name alias, Table<ViewWwCollocationRecord> aliased, Field<?>[] parameters) {
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
    public ViewWwCollocation as(String alias) {
        return new ViewWwCollocation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewWwCollocation as(Name alias) {
        return new ViewWwCollocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwCollocation rename(String name) {
        return new ViewWwCollocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewWwCollocation rename(Name name) {
        return new ViewWwCollocation(name, null);
    }
}
