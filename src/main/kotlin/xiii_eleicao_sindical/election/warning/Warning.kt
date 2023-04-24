package xiii_eleicao_sindical.election.warning

private const val MESSAGE_WRONG_ANSWER = "Wrong answer! <press_enter>"

class Warning {

    fun printWrongAnswer() {
        print("$MESSAGE_WRONG_ANSWER ")
        System.`in`.read()
    }

}