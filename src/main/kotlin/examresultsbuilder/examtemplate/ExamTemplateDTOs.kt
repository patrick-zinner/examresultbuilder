package examresultsbuilder.examtemplate

data class ExamTemplateDTO(var id: Long?,
                           var name: String)


data class TaskCategoryDTO(var id: Long?,
                           var name: String) {

}

data class TaskDTO(var id: Long?,
                   var name: String?,
                   var maxScore: Int)