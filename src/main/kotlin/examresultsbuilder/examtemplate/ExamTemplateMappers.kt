package examresultsbuilder.examtemplate

fun ExamTemplate.toDto() = ExamTemplateDTO(this.id, this.name)

fun ExamTemplateDTO.newEntiy() = ExamTemplate(null, this.name, mutableListOf())

fun TaskCategory.toDto() = TaskCategoryDTO(this.id, this.name)

fun TaskCategoryDTO.newEntity(examTemplate: ExamTemplate) =
        TaskCategory(null, examTemplate, mutableListOf(), this.name)