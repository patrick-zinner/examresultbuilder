package examresultsbuilder.examtemplate

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface ExamTemplateRepository : CrudRepository<ExamTemplate, Long>