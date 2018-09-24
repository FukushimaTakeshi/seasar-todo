package jp.todo.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Tasks}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2018/09/24 23:35:09")
public class TasksNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Long> id() {
        return new PropertyName<Long>("id");
    }

    /**
     * contentのプロパティ名を返します。
     * 
     * @return contentのプロパティ名
     */
    public static PropertyName<String> content() {
        return new PropertyName<String>("content");
    }

    /**
     * statusのプロパティ名を返します。
     * 
     * @return statusのプロパティ名
     */
    public static PropertyName<String> status() {
        return new PropertyName<String>("status");
    }

    /**
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Timestamp> createdAt() {
        return new PropertyName<Timestamp>("createdAt");
    }

    /**
     * updatedAtのプロパティ名を返します。
     * 
     * @return updatedAtのプロパティ名
     */
    public static PropertyName<Timestamp> updatedAt() {
        return new PropertyName<Timestamp>("updatedAt");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TasksNames extends PropertyName<Tasks> {

        /**
         * インスタンスを構築します。
         */
        public _TasksNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TasksNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TasksNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Long> id() {
            return new PropertyName<Long>(this, "id");
        }

        /**
         * contentのプロパティ名を返します。
         *
         * @return contentのプロパティ名
         */
        public PropertyName<String> content() {
            return new PropertyName<String>(this, "content");
        }

        /**
         * statusのプロパティ名を返します。
         *
         * @return statusのプロパティ名
         */
        public PropertyName<String> status() {
            return new PropertyName<String>(this, "status");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Timestamp> createdAt() {
            return new PropertyName<Timestamp>(this, "createdAt");
        }

        /**
         * updatedAtのプロパティ名を返します。
         *
         * @return updatedAtのプロパティ名
         */
        public PropertyName<Timestamp> updatedAt() {
            return new PropertyName<Timestamp>(this, "updatedAt");
        }
    }
}