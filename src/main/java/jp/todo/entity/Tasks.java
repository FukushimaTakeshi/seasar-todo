package jp.todo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Tasksエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2018/09/24 23:34:58")
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long id;

    /** contentプロパティ */
    @Lob
    @Column(length = 65535, nullable = false, unique = false)
    public String content;

    /** statusプロパティ */
    @Column(length = 4, nullable = false, unique = false)
    public String status;

    /** createdAtプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp createdAt;

    /** updatedAtプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp updatedAt;
}