package examresultsbuilder.examtemplate

import javax.inject.Singleton
import javax.persistence.NoResultException
import javax.transaction.Transactional

@Singleton
open class ExamTemplateService(private val examTemplateRepository: ExamTemplateRepository) {

    @Transactional
    open fun createExamTemplate(examTemplate: ExamTemplateDTO): ExamTemplateDTO {
        val entity = examTemplate.newEntiy();
        return examTemplateRepository.save(entity).toDto()
    }

    fun findTemplateById(id: Long) =
            examTemplateRepository.findById(id).orElseThrow { NoResultException() }.toDto()

}