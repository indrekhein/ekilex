/*
 * This file is generated by jOOQ.
 */
package eki.ekilex.data.db.tables;


import eki.ekilex.data.db.Indexes;
import eki.ekilex.data.db.Keys;
import eki.ekilex.data.db.Public;
import eki.ekilex.data.db.tables.records.EkiUserProfileRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
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
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EkiUserProfile extends TableImpl<EkiUserProfileRecord> {

    private static final long serialVersionUID = 2141275789;

    /**
     * The reference instance of <code>public.eki_user_profile</code>
     */
    public static final EkiUserProfile EKI_USER_PROFILE = new EkiUserProfile();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EkiUserProfileRecord> getRecordType() {
        return EkiUserProfileRecord.class;
    }

    /**
     * The column <code>public.eki_user_profile.id</code>.
     */
    public final TableField<EkiUserProfileRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('eki_user_profile_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.eki_user_profile.user_id</code>.
     */
    public final TableField<EkiUserProfileRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.eki_user_profile.recent_dataset_permission_id</code>.
     */
    public final TableField<EkiUserProfileRecord, Long> RECENT_DATASET_PERMISSION_ID = createField("recent_dataset_permission_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.eki_user_profile</code> table reference
     */
    public EkiUserProfile() {
        this(DSL.name("eki_user_profile"), null);
    }

    /**
     * Create an aliased <code>public.eki_user_profile</code> table reference
     */
    public EkiUserProfile(String alias) {
        this(DSL.name(alias), EKI_USER_PROFILE);
    }

    /**
     * Create an aliased <code>public.eki_user_profile</code> table reference
     */
    public EkiUserProfile(Name alias) {
        this(alias, EKI_USER_PROFILE);
    }

    private EkiUserProfile(Name alias, Table<EkiUserProfileRecord> aliased) {
        this(alias, aliased, null);
    }

    private EkiUserProfile(Name alias, Table<EkiUserProfileRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EkiUserProfile(Table<O> child, ForeignKey<O, EkiUserProfileRecord> key) {
        super(child, key, EKI_USER_PROFILE);
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
        return Arrays.<Index>asList(Indexes.EKI_USER_PROFILE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EkiUserProfileRecord, Long> getIdentity() {
        return Keys.IDENTITY_EKI_USER_PROFILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EkiUserProfileRecord> getPrimaryKey() {
        return Keys.EKI_USER_PROFILE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EkiUserProfileRecord>> getKeys() {
        return Arrays.<UniqueKey<EkiUserProfileRecord>>asList(Keys.EKI_USER_PROFILE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EkiUserProfileRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EkiUserProfileRecord, ?>>asList(Keys.EKI_USER_PROFILE__EKI_USER_PROFILE_USER_ID_FKEY, Keys.EKI_USER_PROFILE__EKI_USER_PROFILE_RECENT_DATASET_PERMISSION_ID_FKEY);
    }

    public EkiUser ekiUser() {
        return new EkiUser(this, Keys.EKI_USER_PROFILE__EKI_USER_PROFILE_USER_ID_FKEY);
    }

    public DatasetPermission datasetPermission() {
        return new DatasetPermission(this, Keys.EKI_USER_PROFILE__EKI_USER_PROFILE_RECENT_DATASET_PERMISSION_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EkiUserProfile as(String alias) {
        return new EkiUserProfile(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EkiUserProfile as(Name alias) {
        return new EkiUserProfile(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EkiUserProfile rename(String name) {
        return new EkiUserProfile(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EkiUserProfile rename(Name name) {
        return new EkiUserProfile(name, null);
    }
}