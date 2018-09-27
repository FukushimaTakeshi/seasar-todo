package jp.todo.action;

import java.util.List;
import javax.annotation.Resource;
import org.seasar.struts.annotation.Execute;

import jp.todo.entity.Tasks;
import jp.todo.service.TasksService;

public class IndexAction {
	
	public List<Tasks> tasks;	
	
	@Resource
	protected TasksService tasksService;
	
    @Execute(validator = false)
	public String index() {
    	tasks = tasksService.findAllOrderById();
        return "index.jsp";
	}
}
