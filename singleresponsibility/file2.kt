fun TestItem.registerDateString(): String =
    try {
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        simpleDateFormat.format(this.registerDate)
    } catch (ex: Exception) {
        "Unavailable"
    }