package examresultsbuilder.examtemplate

import javax.persistence.*

@Entity
data class ExamTemplate(@Id @GeneratedValue var id: Long?,
                        var name: String,
                        @OneToMany(mappedBy = "exam") val categories: List<TaskCategory>)


@Entity
data class TaskCategory(@Id @GeneratedValue var id: Long?,
                        @ManyToOne @JoinColumn(name = "exam_id") var exam: ExamTemplate,
                        @OneToMany(mappedBy = "category") val tasks: List<Task>,
                        var name: String) {

}

@Entity
data class Task(@Id @GeneratedValue var id: Long?,
                @ManyToOne @JoinColumn(name = "category_id") var category: TaskCategory,
                var name: String?,
                var maxScore: Int)