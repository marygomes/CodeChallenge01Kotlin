public fun formatTime(i: Int): String {
    var outputString = ""
    var secondsInMinute = 60
    var secondsInHour = 60*60
    var secondsInDay = 3600*24
    var secondsInYear = 365*secondsInDay
    var arrayValues = arrayOf(secondsInYear, secondsInDay, secondsInHour, secondsInMinute, 1)
    var arrayText = arrayOf("year","day","hour", "minute", "second")
    var quotient = 0
    var inputTime = i
    var outputValues = mutableListOf<Int>()
    var outputText = mutableListOf<String>()

    for (j in 0..4) {
        quotient = inputTime / arrayValues[j]
        if (quotient == 1) {
            outputValues.add(quotient)
            outputText.add(arrayText[j])}
        if (quotient >= 2) {
            outputValues.add(quotient)
            outputText.add(arrayText[j] + "s")
        }
        inputTime %= arrayValues[j]
    }

    when (outputValues.size) {
        1 -> outputString = outputValues[0].toString() + " " + outputText[0]
        2 -> outputString = outputValues[0].toString() + " " + outputText[0] + " and " + outputValues[1].toString() + " " + outputText[1]
        else -> for (k in 0.. outputValues.size-1) {
            outputString += outputValues[k].toString() + " " + outputText[k]
            if (k == outputValues.size - 2) {
                outputString += " and "
            } else if (k != outputValues.size -1 ){
                outputString += ", "
            }
        }
    }
    return outputString
}