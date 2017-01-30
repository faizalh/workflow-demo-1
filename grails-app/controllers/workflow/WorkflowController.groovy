package workflow

import org.camunda.bpm.engine.RepositoryService

/**
 * For demo purpose only to show execution of a process flow.
 * Not intended to be used for production.
 */
class WorkflowController {
    RepositoryService repositoryService
    WorkflowService workflowService

    def index() {
        def processDefinitions = repositoryService.createProcessDefinitionQuery().active().latestVersion().list()
        [processDefinitions : processDefinitions]
    }

    def run() {
        def processKey = params['processKey']
        def pi = workflowService.startProcess(processKey)
        [processInstance: pi]
    }

    def tasks() {
        def processInstanceId = params['processId']
        def taskList = workflowService.queryTasksForProcessInstanceId(processInstanceId)
        [taskList: taskList]
    }
}