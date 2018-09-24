package jp.todo.service;

import java.util.List;
import javax.annotation.Generated;
import jp.todo.entity.Tasks;

import static jp.todo.entity.TasksNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Tasks}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2018/09/24 23:30:19")
public class TasksService extends AbstractService<Tasks> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Tasks findById(Long id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Tasks> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}