package examresultsbuilder.examtemplate

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post

@Controller("exam-templates")
class ExamTemplateEndpoint(private val examTemplateService: ExamTemplateService) {

    @Post
    fun createExamTemplate(examTemplate: ExamTemplateDTO) = examTemplateService.createExamTemplate(examTemplate)

    @Get("{id}")
    fun findExamTemplateById(@PathVariable id: Long) = examTemplateService.findTemplateById(id)
}