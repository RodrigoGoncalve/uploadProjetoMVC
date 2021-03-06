package br.com.rlsystem.tasks.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rlsystem.tasks.model.Tasks;

@Service
public class TasksServices {
	
	private static List<Tasks>tasksList = new ArrayList<Tasks>();
	
	static {
		tasksList.add(new Tasks(1, "limpar casa", new Date(), false));
		tasksList.add(new Tasks(2, "Planejar viagem", new Date(), false));
		tasksList.add(new Tasks(3, "Comprar novo computador", new Date(), false));
		tasksList.add(new Tasks(4, "Resolver problemas banco", new Date(), true));
	}
	public List<Tasks>allTasks(){
		return tasksList;
	}
	public List<Tasks> allTaskByStatus(boolean status){
		List<Tasks> tasksListByStatus = new ArrayList<Tasks>();
		for(Tasks tasks : tasksList) {
			if (tasks.isStatus() == status) {
				tasksListByStatus.add(tasks);
			}
		}
		return tasksListByStatus;
	}
	 
}
