package xiv_media_do_aluno.media.core

private const val GRADE_MEDIA = 5.0

class Media {

    fun calculateAverage(grades: ArrayList<Double>): Double {
        return grades.sum() / grades.size
    }

    fun validateAverage(grade: Double): Boolean {
        return grade >= GRADE_MEDIA
    }

}
