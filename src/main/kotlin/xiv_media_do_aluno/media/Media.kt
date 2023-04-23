package xiv_media_do_aluno.media

import xiv_media_do_aluno.media.cli.Terminal
import xiv_media_do_aluno.media.core.Media
import java.text.DecimalFormat

private const val MESSAGE_MAIN = "***** School Average Calculator! *****"
private const val MESSAGE_ENGAGE = "Enter the student's four bimonthly grades:"
private const val MESSAGE_APPROVED = "APPROVED!"
private const val MESSAGE_DISAPPROVED = "DISAPPROVED!"
private const val MESSAGE_AVERAGE = "Average grade:"

object Media {

    fun run() {

        val terminal = Terminal()
        val media = Media()

        println(MESSAGE_MAIN)
        println(MESSAGE_ENGAGE)

        val grades = terminal.getNotes()
        val average = media.calculateAverage(grades)
        val isApproved = media.validateAverage(average)

        if (isApproved) {
            println(MESSAGE_APPROVED)
        } else {
            println(MESSAGE_DISAPPROVED)
        }

        println("$MESSAGE_AVERAGE ${DecimalFormat("#.##").format(average)}")

    }

}
