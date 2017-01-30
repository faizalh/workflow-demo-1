package workflow

import grails.transaction.Transactional
import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.TaskService
import org.camunda.bpm.engine.runtime.Execution
import org.camunda.bpm.engine.task.Task

/**
 * This class will manage the execution of the workflow engine.
 */
@Transactional
class WorkflowService {
    RuntimeService runtimeService
    TaskService taskService

    /**
     * start a process instance identified by the process definition id.
     * @param processId
     * @return
     */
    def startProcess(String processKey) {
        startProcess(processKey, null)

    }

    def startProcess(String processKey, Map<String, Object> variables) {
        runtimeService.startProcessInstanceByKey(processKey, variables)
    }

    /**
     * Query for the tasks.
     * @return
     */
    List<Task> queryTasksForProcessInstanceId(String processInstanceId) {
        return taskService.createTaskQuery().processInstanceId(processInstanceId).list()
    }

    def newOrder(Execution execution, String param) {
        execution.setVariable("test", "test")
    }
}